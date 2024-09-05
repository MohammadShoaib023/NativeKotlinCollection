package com.example.nativekotlincollection
import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Locale


class MainActivity : AppCompatActivity() {
    private lateinit var textDate:TextView
    private lateinit var buttonDate: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textDate=findViewById(R.id.textDate)
        buttonDate=findViewById(R.id.buttonDate)

    val calenderBox=Calendar.getInstance()
        val dateBox=DatePickerDialog.OnDateSetListener{
                _, year, month, day ->
            calenderBox.set(Calendar.YEAR,year)
            calenderBox.set(Calendar.MONTH,month)
            calenderBox.set(Calendar.DAY_OF_MONTH,day)


            updateText(calenderBox)
        }


        buttonDate.setOnClickListener {
               DatePickerDialog(this,dateBox,calenderBox.get(Calendar.YEAR),calenderBox.get(Calendar.MONTH),calenderBox.get(Calendar.DAY_OF_MONTH)).show()
         }
    }



    private fun updateText(calender:Calendar){
    val dataFormat="dd-MM-yyyy"
    val sample=SimpleDateFormat(dataFormat, Locale.UK)
        textDate.text = sample.format(calender.time)

    }

}