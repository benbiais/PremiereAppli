package openclassrooms.example.premiereappli;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
  private TextView texte = null;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      
      texte = new TextView(this);
      texte.setText("Bonjour, ceci est ma premi�re appli Andro�d. "
      		+ "\n"
      		+ "\nEn Java et gr�ce � l\'IDE Eclipse,"
      		+ "\nje vais bient�t en �crire facilement une deuxi�me,"
      		+ "\npuis une troisi�me,"
      		+ "\npuis une quatri�me,"
      		+ "\nenfin une �ni�me, "
      		+ "\net je ne m'arr�terai plus !");
      setContentView(texte);
  } 
}