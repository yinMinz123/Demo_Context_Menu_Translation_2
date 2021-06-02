package sg.edu.rp.c346.id20039202.democontextmenutranslation2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText, tvTranslatedText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.englishSelection){
            tvTranslatedText.setText("Hello");
            tvTranslatedText.setText("Bye");
        }
        else if(item.getItemId() == R.id.italianSelection){
            tvTranslatedText.setText("Ciao");
            tvTranslatedText.setText("Addio");
        }
        return super.onOptionsItemSelected(item);
    }
}