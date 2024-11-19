package khetkaguru.android;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExploreActivity extends AppCompatActivity {

    private Spinner spinnerIndianStates, spinnerIndianCities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);  // Replace with your actual layout file name

        // Initialize the Spinners
        spinnerIndianStates = findViewById(R.id.spinner_indian_states);
        spinnerIndianCities = findViewById(R.id.spinner_indian_cities);

        // Load the array of Indian states from strings.xml
        String[] states = getResources().getStringArray(R.array.indian_states_array);

        // Create an adapter for the states Spinner
        ArrayAdapter<String> statesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, states);
        statesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerIndianStates.setAdapter(statesAdapter);

        // Set an item selected listener for the state Spinner
        spinnerIndianStates.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected state
                String selectedState = parent.getItemAtPosition(position).toString();

                // Populate cities based on selected state
                populateCitiesSpinner(selectedState);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Optional: do nothing
            }
        });
    }

    // Method to populate the city Spinner based on the selected state
    private void populateCitiesSpinner(String selectedState) {
        String[] cities = {};

        switch (selectedState) {
            case "Andhra Pradesh":
                cities = new String[]{"Hyderabad", "Vijayawada", "Visakhapatnam", "Guntur"};
                break;
            case "Arunachal Pradesh":
                cities = new String[]{"Itanagar", "Tawang", "Ziro"};
                break;
            case "Assam":
                cities = new String[]{"Guwahati", "Silchar", "Dibrugarh", "Tezpur"};
                break;
            case "Bihar":
                cities = new String[]{"Patna", "Gaya", "Bhagalpur", "Muzaffarpur"};
                break;
            case "Chhattisgarh":
                cities = new String[]{"Raipur", "Bilaspur", "Korba", "Durg"};
                break;
            case "Goa":
                cities = new String[]{"Panaji", "Margao", "Vasco da Gama", "Mapusa"};
                break;
            case "Gujarat":
                cities = new String[]{"Ahmedabad", "Surat", "Vadodara", "Rajkot"};
                break;
            case "Haryana":
                cities = new String[]{"Chandigarh", "Gurgaon", "Faridabad", "Panipat"};
                break;
            case "Himachal Pradesh":
                cities = new String[]{"Shimla", "Manali", "Dharamshala", "Kullu"};
                break;
            case "Jharkhand":
                cities = new String[]{"Ranchi", "Jamshedpur", "Dhanbad", "Bokaro"};
                break;
            case "Karnataka":
                cities = new String[]{"Bangalore", "Mysore", "Mangalore", "Hubli"};
                break;
            case "Kerala":
                cities = new String[]{"Thiruvananthapuram", "Kochi", "Kozhikode", "Thrissur"};
                break;
            case "Madhya Pradesh":
                cities = new String[]{"Bhopal", "Indore", "Gwalior", "Jabalpur"};
                break;
            case "Maharashtra":
                cities = new String[]{"Mumbai", "Pune", "Nagpur", "Nashik"};
                break;
            case "Manipur":
                cities = new String[]{"Imphal", "Churachandpur", "Thoubal"};
                break;
            case "Meghalaya":
                cities = new String[]{"Shillong", "Tura", "Jowai"};
                break;
            case "Mizoram":
                cities = new String[]{"Aizawl", "Lunglei", "Champhai"};
                break;
            case "Nagaland":
                cities = new String[]{"Kohima", "Dimapur", "Mokokchung"};
                break;
            case "Odisha":
                cities = new String[]{"Bhubaneswar", "Cuttack", "Rourkela", "Sambalpur"};
                break;
            case "Punjab":
                cities = new String[]{"Amritsar", "Ludhiana", "Jalandhar", "Patiala"};
                break;
            case "Rajasthan":
                cities = new String[]{"Jaipur", "Jodhpur", "Udaipur", "Ajmer"};
                break;
            case "Sikkim":
                cities = new String[]{"Gangtok", "Gyalshing", "Mangan"};
                break;
            case "Tamil Nadu":
                cities = new String[]{"Chennai", "Coimbatore", "Madurai", "Tiruchirappalli"};
                break;
            case "Telangana":
                cities = new String[]{"Hyderabad", "Warangal", "Nizamabad", "Karimnagar"};
                break;
            case "Tripura":
                cities = new String[]{"Agartala", "Udaipur", "Dharmanagar"};
                break;
            case "Uttar Pradesh":
                cities = new String[]{"Lucknow", "Kanpur", "Agra", "Varanasi"};
                break;
            case "Uttarakhand":
                cities = new String[]{"Dehradun", "Haridwar", "Nainital", "Rishikesh"};
                break;
            case "West Bengal":
                cities = new String[]{"Kolkata", "Darjeeling", "Howrah", "Siliguri"};
                break;
            default:
                cities = new String[]{"Select a city"}; // Default value for unselected or unknown states
                break;
        }

        // Create an adapter for the cities Spinner
        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, cities);
        citiesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerIndianCities.setAdapter(citiesAdapter);
    }
}