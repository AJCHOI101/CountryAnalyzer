import java.util.Scanner; 
import java.io.File;  
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 * Write a description of class CountryAnalyzer here.
 *
 * @author (Andrew Choi)
 * @version (2020.04.10)
 */
public class CountryAnalyzer
{
    private ArrayList<Country>countries;

    /**
     * Read the data file
     * Perform the analysis
     * Produce the output
     */
    public static void analyze(String args[]) throws FileNotFoundException
    { 
        Scanner inFile = new Scanner(new File("globalDevelopment2013.csv"));   
        inFile.useDelimiter(",|\n|\r\n");
        String line;
        ArrayList<Country> countries  = new ArrayList<Country>();
        
        // reads csv file into ArrayList
 
        //Count entries of countries
        int countCountries = inFile.nextInt();
        for(int i=0; i< countCountries; i++)
        {
            System.out.print(countries.toString);
            System.out.print("/n/t" + countries.getPopulationDensity);
            System.out.print("/n/t" + country.getUrbanRatio + "%");
        }
    }
}

