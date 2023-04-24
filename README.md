# SumTwoNumbers-Android


To create an app that calculates the sum of two numbers in Android Studio, follow these steps:

1. Create a new project in Android Studio. In the "Create New Project" dialog, choose "Empty Activity" as the template.

2. Design the user interface for the sum calculator app. Open the layout file for the main activity and add two EditText fields to enter the two numbers, and a Button to trigger the calculation. You can also add a TextView to display the result. You can arrange these UI elements as per your design preference.

3. Implement the sum calculation logic. In the MainActivity.java file, define two Double variables to store the input values, and initialize them to 0. Then, add a method to read the input values from the EditText fields, convert them to Doubles, and add them to get the sum.

    public class MainActivity extends AppCompatActivity {
    private double num1 = 0;
    private double num2 = 0;

    private double calculateSum() {
        EditText editText1 = findViewById(R.id.edit_text1);
        EditText editText2 = findViewById(R.id.edit_text2);
        num1 = Double.parseDouble(editText1.getText().toString());
        num2 = Double.parseDouble(editText2.getText().toString());
        return num1 + num2;
    }

    // ...
}

4. Add an OnClickListener to the calculation button. In the onCreate() method of MainActivity.java, add an OnClickListener to the calculation button to trigger the calculation when the button is clicked. In the OnClickListener, call the calculateSum() method to get the sum, and display the result in the TextView.


       Button calculateButton = findViewById(R.id.calculate_button);
       calculateButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             TextView resultTextView = findViewById(R.id.result_text_view);
            double sum = calculateSum();
           resultTextView.setText(String.format("%.2f", sum));
         }
       });
       
 5. Test the app. Run the app on an emulator or a physical device and test the calculation by entering two numbers in the EditText fields and clicking the calculation button. The app should display the sum of the two numbers in the TextView.
