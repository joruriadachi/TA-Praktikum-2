package f2_1461700229.daskom.untag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView tvNBI, tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNBI = findViewById(R.id.tvNBI);
        tvNama = findViewById(R.id.tvNama);

        int pass = getIntent().getIntExtra("hasil", 0);

        if (pass == 1){
            tvNama.setText("Jalu Dwi Permana");
            tvNBI.setText("1461700229");

            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Login Gagal, Silahkan Coba Lagi", Toast.LENGTH_LONG).show();
        }
    }
}
