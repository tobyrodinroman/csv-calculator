package com.softvision.basiccalculator.android.cognizantcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {

    lateinit var tvOutput: TextView
    lateinit var btnOne: Button
    lateinit var btnTwo: Button
    lateinit var btnThree: Button
    lateinit var btnAdd: Button
    lateinit var btnEquals: Button

    var outputString = "0"

    var firstNum = -1
    var secondNum = -1
    var finalValue = 0
    var currentOperation = "add"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        tvOutput = findViewById(R.id.tv_output)
        btnOne = findViewById(R.id.btn_1)
        btnTwo = findViewById(R.id.btn_2)
        btnThree = findViewById(R.id.btn_3)
        btnAdd = findViewById(R.id.btn_add)
        btnEquals = findViewById(R.id.btn_equals)

        btnOne.setOnClickListener {
            inputNumber(1)
        }

        btnTwo.setOnClickListener {
            inputNumber(2)
        }

        btnThree.setOnClickListener {
            inputNumber(3)
        }

        btnAdd.setOnClickListener {
            doOperation("add")
        }

        btnEquals.setOnClickListener {
            calculate()
        }

    }

    fun inputNumber(value: Int){
        if(firstNum==-1){
            firstNum = value
        }else{
            secondNum = value
        }
        tvOutput.text = value.toString()
    }

    fun doOperation(operation: String){
        currentOperation = operation
    }

    fun calculate(){
        if(currentOperation.equals("add",true)){
            finalValue = firstNum + secondNum
        }
        if(currentOperation.equals("minus",true)){
            finalValue = firstNum - secondNum
        }
        tvOutput.text = finalValue.toString()
    }



}