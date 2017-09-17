package codigo.coffeorderemgm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etNombreCliente;
    private Button btnFinalizarPedido,btnDecrement, btnIncrement;
    private TextView tvNombreCliente;
    private TextView tvCantidad;
    private TextView tvValorCompra;

    int quantity = 0;
    int totalAPagar = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDecrement = (Button) findViewById(R.id.btnDrecrement);
        btnIncrement = (Button) findViewById(R.id.btnIncrement);

        tvValorCompra = (TextView) findViewById(R.id.tvValorCompra);

        btnIncrement.setOnClickListener(this);
        btnDecrement.setOnClickListener(this);

        tvCantidad = (TextView) findViewById(R.id.tvCantidad);

        etNombreCliente = (EditText) findViewById(R.id.etNombreCliente);
        btnFinalizarPedido = (Button) findViewById(R.id.btnFinalizarPedido);

        btnFinalizarPedido.setOnClickListener(this);

        tvNombreCliente = (TextView) findViewById(R.id.tvNombreCliente);



    }

    @Override
    public void onClick(View v) {



        switch (v.getId()){

            case R.id.btnFinalizarPedido:

                String nombreCliente = String.valueOf(etNombreCliente.getText());

               tvNombreCliente.setText(nombreCliente);

                totalAPagar = Integer.parseInt(tvCantidad.getText().toString()) * 500;

                tvValorCompra.setText(String.valueOf(totalAPagar));

                etNombreCliente.setText("");

                tvCantidad.setText("0");


                break;

            case R.id.btnIncrement:

                // Incrementar

                quantity = Integer.parseInt(tvCantidad.getText().toString());

                quantity = quantity + 1;

                tvCantidad.setText(String.valueOf(quantity));

                break;

            case R.id.btnDrecrement:

                // Decrementar

                quantity = Integer.parseInt(tvCantidad.getText().toString());

                quantity = quantity - 1;

                if(quantity >=0 ) {

                    tvCantidad.setText(String.valueOf(quantity));
                }

                break;












        }















    }
}
