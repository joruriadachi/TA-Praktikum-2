package f2_1461700229.daskom.untag;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements MainActivityView {
    EditText input1, input2;
    Button ok;
    MainActivityPresenter presenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenter(this);

        input1 = findViewById(R.id.nbiInput);
        input2 = findViewById(R.id.passwordInput);
        ok = findViewById(R.id.btn_ok);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.olahData(input1.getText().toString(), input2.getText().toString());
            }
        });
    }

    @Override
    public void setHasil(int cekPass) {
        Intent intent = new Intent(MainActivity. this, Main2Activity.class);
        intent.putExtra("hasil", cekPass);
        startActivity(intent);


    }
}
