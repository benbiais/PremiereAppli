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
      texte.setText("Bonjour, ceci est ma première appli Androïd. "
      		+ "\n"
      		+ "\nEn Java et grâce à l\'IDE Eclipse,"
      		+ "\nje vais bientôt en écrire facilement une deuxième,"
      		+ "\npuis une troisième,"
      		+ "\npuis une quatrième,"
      		+ "\nenfin une énième, "
      		+ "\net je ne m'arrêterai plus !");
      setContentView(texte);
  } 
}