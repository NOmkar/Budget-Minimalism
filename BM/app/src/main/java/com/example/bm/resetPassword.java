package com.example.bm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class resetPassword extends AppCompatActivity {
    private EditText enteredEmail;
    private Button submit;
    private String user_email;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        enteredEmail = (EditText)findViewById (R.id.enteredEmail);
        submit = (Button)findViewById(R.id.submitButton);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_email = enteredEmail.getText().toString().trim();

                System.out.println(user_email);
                firebaseAuth = FirebaseAuth.getInstance();
                firebaseAuth.sendPasswordResetEmail(user_email)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(resetPassword.this, "Password reset email sent!", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(resetPassword.this, "Failed to send reset email!", Toast.LENGTH_SHORT).show();
                                }


                            }
                        });

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Intent intent = new Intent(resetPassword.this, initialScreen.class);
                        startActivity(intent);
                        resetPassword.this.finish();
                    }
                }, 3000);
            }
        });

    }
}