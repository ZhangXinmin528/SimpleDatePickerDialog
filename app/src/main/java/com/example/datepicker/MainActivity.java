package com.example.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
        DatePickerDialog.OnDateSetListener {
    private Context mContext;
    private EditText mResultEt;
    private Calendar mCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        mCalendar = Calendar.getInstance();

        mResultEt = findViewById(R.id.et_result);
        findViewById(R.id.btn_date_picker).setOnClickListener(this);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Toast.makeText(mContext, "日期：" + year + "-" + (month + 1) + "-" + dayOfMonth, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_date_picker) {
            //1.THEME_HOLO_LIGHT
            /*SimpleDatePickerDialog dialog = new SimpleDatePickerDialog(mContext, DatePickerDialog.THEME_HOLO_LIGHT);
            dialog.setOnDateSetListener(this);
            dialog.show();*/
            //2.THEME_HOLO_DARK
            /*SimpleDatePickerDialog dialog = new SimpleDatePickerDialog(mContext,DatePickerDialog.THEME_HOLO_DARK);
            dialog.setOnDateSetListener(this);
            dialog.show();*/

            //3.THEME_DEVICE_DEFAULT_LIGHT
            /*SimpleDatePickerDialog dialog = new SimpleDatePickerDialog(mContext, DatePickerDialog.THEME_DEVICE_DEFAULT_LIGHT);
            dialog.setOnDateSetListener(this);
            dialog.show();*/

            //4.THEME_DEVICE_DEFAULT_DARK
            /*SimpleDatePickerDialog dialog = new SimpleDatePickerDialog(mContext, DatePickerDialog.THEME_DEVICE_DEFAULT_DARK);
            dialog.setOnDateSetListener(this);
            dialog.show();*/

            //5.THEME_TRADITIONAL
            SimpleDatePickerDialog dialog = new SimpleDatePickerDialog(mContext);
            dialog.setOnDateSetListener(this);
            dialog.show();

        }
    }
}
