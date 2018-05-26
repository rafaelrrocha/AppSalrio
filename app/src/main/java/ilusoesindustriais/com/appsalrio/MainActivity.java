package ilusoesindustriais.com.appsalrio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButtonEscolhido;
    private Button botaoEscolher;
    private EditText textHoraExtra;
    private EditText textFalta;
    private EditText textFilho;
    private TextView textExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroupId);
        botaoEscolher = findViewById(R.id.botaoEscolherId);
        textHoraExtra = findViewById(R.id.textHoraExtraId);
        textFalta = findViewById(R.id.textFaltaId);
        textFilho = findViewById(R.id.textFilhoId);
        textExibicao = findViewById(R.id.textExibicaoId);

        botaoEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            double salarioBase = 0;
            public void onClick(View v) {
                int idRadioButtonEscolhido = radioGroup.getCheckedRadioButtonId();
                if (idRadioButtonEscolhido > 0){
                    radioButtonEscolhido = findViewById(idRadioButtonEscolhido);
                   // textExibicao.setText(radioButtonEscolhido.getText());
                    if (radioButtonEscolhido.getText() == "Gerente"){
                        double salarioBase = 2000.00;
                    }else if (radioButtonEscolhido.getText() == "Supervisor"){
                        double salarioBase = 900.00;
                    }else if (radioButtonEscolhido.getText() == "Servente"){
                        double salarioBase = 300.00;
                    }


                String horaExtra = textHoraExtra.getText().toString();
                String falta = textFalta.getText().toString();
                String filho = textFilho.getText().toString();

                int valorHoraExtra = Integer.parseInt(horaExtra);
                int valorFalta = Integer.parseInt(falta);
                int valorFilho = Integer.parseInt(filho);

                double descontoHoraExtra = (salarioBase / 240) * 2;
                String finalHoraExtra = descontoHoraExtra.
                textExibicao.setText(descontoHoraExtra);


                }
            }
        });
    }
}
