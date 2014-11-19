/**
 * Eine Klasse, die eine Waage implementiert. 
 * Diese Klasse dient als digitale Waare, welche dem Benutzer über seinen Fortschritt bei der
 * Gewichtskontrolle informiert.
 * 
 * @author *****
 * @version *****
 */
public class Waage
{
  
   //Das aktuelle Körpergewicht in Kg.
   private int _aktuellesGewicht;
   //Das Gewicht der letzten Messung in Kg.
   private int _letztesGewicht; 
   //Zeigt an ob du abgenommen oder zugenommen hast.
   private int _trend;
   //Zeigt dir dein bisheriges Maximalgewicht an.
   private int _gibMaximalgewicht;
   //Zeigt dir das bisherige Minimalgewicht an.
   private int _gibMinimalgewicht;
   
   /**
    * Gib dein aktuelles Gewicht ein.
    * @param Gewicht der Person.
    */
   public Waage(int startGewicht)
   {
      _aktuellesGewicht = startGewicht;
      _letztesGewicht = _aktuellesGewicht;
      _gibMinimalgewicht = startGewicht;
      _gibMaximalgewicht = startGewicht;
     
    }
    
   
   /**
    * Zeigt an ob die Person zu/abgenommen hat.
    */
public int gibTrend ()
   {
       return _trend;
    }
    
   
   /**
    * Berechnet das Maximalgewicht, sowie das Minimalgewicht.
    */ 
   public void berechneExtremwerte()
   {
      
     if (_gibMinimalgewicht > _aktuellesGewicht)
     {
         _gibMinimalgewicht = _aktuellesGewicht;
         }
     else if (_gibMaximalgewicht < _aktuellesGewicht)
     {
         _gibMaximalgewicht = _aktuellesGewicht;
        }
    
    }
    
   
   /**
    * Regestriert die Eingaben.
    */ 
   public void registriere (int neuesGewicht)
   {
    
      if (neuesGewicht > _aktuellesGewicht)
      {
          _trend = +1;
         
        }
        else if (neuesGewicht < _aktuellesGewicht)
        {
            _trend = -1;
        }
        else
        {
            _trend = 0;
        }
        _letztesGewicht = _aktuellesGewicht;
        _aktuellesGewicht = neuesGewicht;
        berechneExtremwerte ();
    }
    
 
   /**
    * Gibt das kleinste Gewicht in Kg wieder
    */
   public int gibMinimalgewicht ()
   {
       return _gibMinimalgewicht;
    }
    
   /**
    * Gibt das größte Gewicht in Kg wieder 
    */
   public int gibMaximalgewicht ()
   {
       return _gibMaximalgewicht;
    }
       
    }