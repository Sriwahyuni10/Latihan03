package id.ac.poliban.mi.ayu.latihan03;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        //mengenalkan view component ke object
        //atau variable yang kita buat
        Button btSoekarno = findViewById(R.id.btSoekarno);
        Button btSoeharto = findViewById(R.id.btSoeharto);
        Button btHabibie = findViewById(R.id.btHabibie);
        Button btGusdur = findViewById(R.id.btGusdur);
        Button btMegawati = findViewById(R.id.btMegawati);
        Button btSBY = findViewById(R.id.btSBY);

        //event listener and event handler menggunakan lambda expression
        btSoekarno.setOnClickListener(v -> {
            Toast.makeText(this, "I.R. Soekarno : 1901", Toast.LENGTH_SHORT).show();
        });
        btSoeharto.setOnClickListener(v -> {
            Toast.makeText(this, "Soeharto : 1921", Toast.LENGTH_SHORT).show();
        });
        btHabibie.setOnClickListener(v -> {
            Toast.makeText(this, "B.J. Habibie : 1936", Toast.LENGTH_SHORT).show();
        });
        btGusdur.setOnClickListener(v -> {
                Toast.makeText(this, "Gusdur : 1940", Toast.LENGTH_SHORT).show();
    });
        btMegawati.setOnClickListener(v -> {
                Toast.makeText(this, "Megawati : 1947", Toast.LENGTH_SHORT).show();
        });
        btSBY.setOnClickListener(v -> {
            Toast.makeText(this, "SBY : 1949", Toast.LENGTH_SHORT).show();
        });


    }
}
