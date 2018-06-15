package com.example.kevin.masterusingenhancedforloopinjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtCountryNames= (TextView)findViewById(R.id.txtCountryNames);

        String[] countryNames = {"Afghanistan\n", "Albania\n", "Algeria\n",
                "American Samoa\n", "Andorra\n", "Angola", "Anguilla", "Antarctica\n",
                "Antigua and Barbuda\n", "Argentina\n", "Armenia", "Aruba\n", "Australia\n",
                "Austria\n", "Azerbaijan\n", "Bahamas\n", "Bahrain\n", "Bangladesh\n",
                "Barbados\n", "Belarus\n", "Belgium\n", "Blize\n", "Benin\n", "Bermuda\n",
                "Bhutan\n", "Bolivia\n", "Bosnia and Herzegovina\n", "Botswana\n", "Brazil\n",
                "Brunei Darussalam\n", "Bulgaria\n", "Burkina Faso\n", "Burundi\n"};

        String allCountryNames = "";

        for (String countryName : countryNames) {

            //allCountryNames = allCountryNames + countryName;
            allCountryNames += countryName;

        }

        txtCountryNames.setText(allCountryNames);






    }
}
