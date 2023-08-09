package com.example.myapplication.activity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Navigation Arrow Icon by its ID
        ImageView navigationArrowIcon = findViewById(R.id.navigationArrowIcon);

        // Set a click listener for the Navigation Arrow Icon
        navigationArrowIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the OrdersActivity when the icon is clicked
                Intent intent = new Intent(MainActivity.this, OrdersActivity.class);
                startActivity(intent);
            }
        });

        // Find the Arrow Button by its ID
        // Set content for Event 1
        View cardLayout1 = findViewById(R.id.cardLayout1);
        ImageView photoImageView1 = cardLayout1.findViewById(R.id.photo);
        TextView titleTextView1 = cardLayout1.findViewById(R.id.title);

        photoImageView1.setImageResource(R.drawable.untold_festival); // Set the photo
        titleTextView1.setText("Untold");

        // Populate item_event views for Event 1
        TextView eventNameTextView1 = cardLayout1.findViewById(R.id.eventName);
        TextView eventDescriptionTextView1 = cardLayout1.findViewById(R.id.eventDescription);
        TextView eventStartDateTextView1 = cardLayout1.findViewById(R.id.eventStartDate);
        TextView eventEndDateTextView1 = cardLayout1.findViewById(R.id.eventEndDate);

        eventNameTextView1.setText("Untold Festival");
        eventDescriptionTextView1.setText("Discover the magic of Untold!");
        eventStartDateTextView1.setText("Starts: August 3, 2023");
        eventEndDateTextView1.setText("Ends: August 6, 2023");

        // Set content for Event 2
        View cardLayout2 = findViewById(R.id.cardLayout2);
        ImageView photoImageView2 = cardLayout2.findViewById(R.id.photo);
        TextView titleTextView2 = cardLayout2.findViewById(R.id.title);

        photoImageView2.setImageResource(R.drawable.electric_castle); // Set the photo
        titleTextView2.setText("Electric Castle");

        // Populate item_event views for Event 2
        TextView eventNameTextView2 = cardLayout2.findViewById(R.id.eventName);
        TextView eventDescriptionTextView2 = cardLayout2.findViewById(R.id.eventDescription);
        TextView eventStartDateTextView2 = cardLayout2.findViewById(R.id.eventStartDate);
        TextView eventEndDateTextView2 = cardLayout2.findViewById(R.id.eventEndDate);

        eventNameTextView2.setText("Electric Castle");
        eventDescriptionTextView2.setText("Meet me at the Castle!");
        eventStartDateTextView2.setText("Starts: July 19, 2023");
        eventEndDateTextView2.setText("Ends: July 23, 2023");

        // Set content for Event 3
        View cardLayout3 = findViewById(R.id.cardLayout3);
        ImageView photoImageView3 = cardLayout3.findViewById(R.id.photo);
        TextView titleTextView3 = cardLayout3.findViewById(R.id.title);

        photoImageView3.setImageResource(R.drawable.football_game); // Set the photo
        titleTextView3.setText("Football");

        // Populate item_event views for Event 3
        TextView eventNameTextView3 = cardLayout3.findViewById(R.id.eventName);
        TextView eventDescriptionTextView3 = cardLayout3.findViewById(R.id.eventDescription);
        TextView eventStartDateTextView3 = cardLayout3.findViewById(R.id.eventStartDate);
        TextView eventEndDateTextView3 = cardLayout3.findViewById(R.id.eventEndDate);

        eventNameTextView3.setText("Football Match");
        eventDescriptionTextView3.setText("Pride, Passion and Victory");
        eventStartDateTextView3.setText("Starts: September 5, 2023");
        eventEndDateTextView3.setText("Ends: September 6, 2023");

        // Set content for Event 4
        View cardLayout4 = findViewById(R.id.cardLayout4);
        ImageView photoImageView4 = cardLayout4.findViewById(R.id.photo);
        TextView titleTextView4 = cardLayout4.findViewById(R.id.title);

        photoImageView4.setImageResource(R.drawable.wine_festival); // Set the photo
        titleTextView4.setText("Wine Festival");

        // Populate item_event views for Event 4
        TextView eventNameTextView4 = cardLayout4.findViewById(R.id.eventName);
        TextView eventDescriptionTextView4 = cardLayout4.findViewById(R.id.eventDescription);
        TextView eventStartDateTextView4 = cardLayout4.findViewById(R.id.eventStartDate);
        TextView eventEndDateTextView4 = cardLayout4.findViewById(R.id.eventEndDate);

        eventNameTextView4.setText("Wine Festival");
        eventDescriptionTextView4.setText("Wine festivals attract wine lovers");
        eventStartDateTextView4.setText("Starts: October 1, 2023");
        eventEndDateTextView4.setText("Ends: October 8, 2023");

    }
}
