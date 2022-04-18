import java.util.Scanner; 
import java.io.File;  
import java.io.FileNotFoundException;
/**
 * Write a description of class Country here.
 *
 * @author (Andrew Choi)
 */
public class Country
{
    // instance variables - replace the example below with your own
    private String name;
    private double sa;
    private long tp;
    private double br;
    private double dr;
    private double fr;
    private double rp;
    private double tele;
    private long sub;

    public Country(String countryName, double surfaceArea, long totalPopulation, 
    double birthRate, double deathRate, double fertilityRate, double ruralPopulation, double telephoneLines, long mobilePhoneSubscriptions)
    {
        name = countryName;
        sa = surfaceArea;
        tp = totalPopulation;
        br = birthRate;
        dr = deathRate;
        fr = fertilityRate;
        rp = ruralPopulation;
        tele = telephoneLines;
        sub = mobilePhoneSubscriptions;
    }

    /**
     * The standard toString method should 
     * return a string containing the country 
     * name followed by the total population 
     * in parentheses.
     */
    public String toString()
    {
        return "(" + name + tp + ")";
    }

    /**
     * A standard getter for the fertility 
     * rate of the country.
     */
    public double getFertilityRate()
    {
        return fr;
    }

    /**
     *  A standard getter for the number of 
     *  telephone lines in the country.
     */
    public double getTelephoneLines()
    {
        return tele;
    }

    /**
     * This method computes and returns 
     * the population density for the country, 
     * which is the number of people per 
     * square kilometer of area.
     */
    public double getPopulationDensity()
    {
        return (rp/sa);
    }

    /**
     * This method computes and returns the urban 
     * ratio, which is the urban population over 
     * the total population. Since the input data 
     * doesn't contain the urban population 
     * explicitly, you will first have to calculate
     * it by subtracting the rural population from
     * the total population.
     */
    public double getUrbanRatio()
    {
        Long l = new Long(tp);
        double d = l.doubleValue();
        double urbanPopulation = d - rp;
        double percentage = ((urbanPopulation*100)/tp);
        return percentage;
    }

    /**
     * This method computes and returns the population 
     * change, defined as the birth rate minus the death 
     * rate.
     */
    public double populationChange()
    {
        return br - dr;
    }

    /**
     * This method computes and returns the ratio of 
     * the number of mobile phone subscriptions to 
     * the total population
     */
    public double getMobileRatio()
    {
        return sub/tp;
    }
}
