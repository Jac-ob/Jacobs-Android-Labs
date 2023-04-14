package algonquin.cst2335.domp0017;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;


import algonquin.cst2335.domp0017.databinding.ActivityMainBinding;

public class MainActivity extends Activity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate( getLayoutInflater());
        setContentView(binding.getRoot());

        binding.loginButton.setOnClickListener( click -> {
            Intent nextPage = new Intent( MainActivity.this, SecondActivity.class );

            nextPage.putExtra("EmailAddress", binding.editTextEmailAddress.getText().toString());

            startActivity(nextPage);
        });

    }
}
