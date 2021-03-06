package devices;

import com.company.Human;
import com.company.Salleable;

public abstract class Device implements Salleable {
    public String Name;
    public String Make;
    public String FromCountry;
    public double Value;
    public double Money;
    public boolean isOn = false;

    public Device (double value) {
        Value = value;
    }

    protected Device(String name, String make, String fromCountry) {
        Name = name;
        Make = make;
        FromCountry = fromCountry;
    }

    protected Device(String name, String make, double value, double money) {
        Name = name;
        Make = make;
        Value = value;
        Money = money;
    }

    public String showClassToString() {
        return this.toString();
    }

    public abstract void turnOn();

    @Override
    public boolean sell(Human seller, Human buyer, Double price) {
        return true;
    }
}
