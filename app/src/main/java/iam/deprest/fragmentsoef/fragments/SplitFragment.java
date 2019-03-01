package iam.deprest.fragmentsoef.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import iam.deprest.fragmentsoef.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SplitFragment extends Fragment {

    private TextView calculate;
    private Button calculator;
    private EditText total;
    private EditText tip;
    private EditText people;

    double totaal = 0.0,
            fooi = 0.0,
            volk = 0.0,
            resultaat = (totaal+fooi)/volk;


    public static SplitFragment newInstance(){
        SplitFragment splitFragment = new SplitFragment();
        Bundle bundle = new Bundle();
        splitFragment.setArguments(bundle);
        return splitFragment;
    }


    private void calculateResult() throws NumberFormatException{
        Editable editableValue1 = total.getText(),
                editableValue2 = tip.getText(),
                editableValue3 = people.getText();

        if (editableValue1 != null){totaal = Double.parseDouble(editableValue1.toString());}
        if (editableValue2 != null){fooi = Double.parseDouble(editableValue2.toString());}
        if (editableValue3 != null){volk = Double.parseDouble(editableValue3.toString());}
        resultaat = (totaal+fooi)/volk;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_split, container, false);
        total=view.findViewById(R.id.et_split_total);
        tip=view.findViewById(R.id.et_split_tip);
        people=view.findViewById(R.id.et_split_people);
        calculate = view.findViewById(R.id.tv_split_calculate);


        View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
                calculate.setText(String.valueOf(resultaat)+" € each");
                Log.i("TEST", String.valueOf(resultaat));
            }
        };

        calculator = view.findViewById(R.id.btn_calculate);
        calculator.setOnClickListener(calculatorListener);

        return view;
    }

}
