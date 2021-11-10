package com.app.shopping;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView Aryuvedic,Homeopathic,Syrup,Tablet;
    private ImageView Cosmetics,Babyproduct,FitnessProduct;
    private ImageView Medicalequipment,Consulty;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        Aryuvedic = (ImageView) findViewById(R.id.aryu);
        Homeopathic = (ImageView) findViewById(R.id.homeo);
        Syrup = (ImageView) findViewById(R.id.syrup);
        Tablet = (ImageView) findViewById(R.id.tab);

        Cosmetics = (ImageView) findViewById(R.id.cosmetic);
        Babyproduct = (ImageView) findViewById(R.id.babypr);
        FitnessProduct = (ImageView) findViewById(R.id.fitnessp);

        Medicalequipment = (ImageView) findViewById(R.id.medieq);
        Consulty = (ImageView) findViewById(R.id.cons);


        Aryuvedic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Aryuvedic Items");
                startActivity(intent);
            }
        });
        Homeopathic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Homeopathic Medicines");
                startActivity(intent);
            }
        });


        Syrup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Syrups");
                startActivity(intent);
            }
        });


        Tablet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Tablets");
                startActivity(intent);
            }
        });


        Cosmetics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Cosmetics Items");
                startActivity(intent);
            }
        });


        Babyproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Baby Product");
                startActivity(intent);
            }
        });



        FitnessProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Fitness Items");
                startActivity(intent);
            }
        });






        Medicalequipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Medical Equipment");
                startActivity(intent);
            }
        });


        Consulty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Consultation");
                startActivity(intent);
            }
        });


    }
}
