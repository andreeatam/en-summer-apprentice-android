package com.example.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class OrdersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_orders);

        // Find the Navigation Arrow Icon by its ID
        ImageView ordersNavigationArrowIcon = findViewById(R.id.ordersNavigationArrowIcon);

        // Set a click listener for the Navigation Arrow Icon to navigate back to MainActivity
        ordersNavigationArrowIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the MainActivity when the icon is clicked
                Intent intent = new Intent(OrdersActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Populate card views with event information
        populateCardView(R.id.cardView1, "Untold", "10", "2023-08-01", "500");
        populateCardView(R.id.cardView2, "Wine Festival", "7", "2023-08-02", "750");
        populateCardView(R.id.cardView3, "Football Match", "12", "2023-08-03", "300");;
        populateCardView(R.id.cardView4, "Electric Castle", "8", "2023-08-05", "400");
    }

    // Helper method to populate a card view with event information
    private void populateCardView(int cardViewId, String eventName, String totalTickets, String orderedAt, String totalPrice) {
        View cardView = findViewById(cardViewId);
        TextView eventTitle = cardView.findViewById(R.id.eventTitle);
        TextView totalTicketsText = cardView.findViewById(R.id.totalTicketsText);
        TextView totalTicketsEditText = cardView.findViewById(R.id.totalTicketsEditText);
        TextView orderedAtEditText = cardView.findViewById(R.id.orderedAtEditText);
        TextView totalPriceText = cardView.findViewById(R.id.totalPriceText);
        TextView totalPriceEditText = cardView.findViewById(R.id.totalPriceEditText);

        eventTitle.setText(eventName);
        totalTicketsText.setText("Total Number of Tickets:");
        totalTicketsEditText.setText(totalTickets);
        orderedAtEditText.setText(orderedAt);
        totalPriceText.setText("Total Price:");
        totalPriceEditText.setText(totalPrice);
    }
}
