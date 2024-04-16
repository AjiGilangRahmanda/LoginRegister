package com.example.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class RegisterFragment extends Fragment {

    public RegisterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        final EditText etRegUsername = view.findViewById(R.id.etRegUsername);
        final EditText etRegEmail = view.findViewById(R.id.etRegEmail);
        final EditText etRegPassword = view.findViewById(R.id.etRegPassword);
        Button btnRegisterSubmit = view.findViewById(R.id.btnRegisterSubmit);

        btnRegisterSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etRegUsername.getText().toString();
                String email = etRegEmail.getText().toString();
                String password = etRegPassword.getText().toString();

                // Buat Intent untuk berpindah ke RegisterSuccessActivity
                Intent intent = new Intent(getActivity(), RegisterSuccessActivity.class);

                // Sisipkan data ke Intent
                intent.putExtra("username", username);
                intent.putExtra("email", email);
                intent.putExtra("password", password);

                // Mulai RegisterSuccessActivity dengan Intent yang sudah disiapkan
                startActivity(intent);
            }
        });

        return view;
    }
}
