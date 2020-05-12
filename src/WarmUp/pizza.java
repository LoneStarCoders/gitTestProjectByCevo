package WarmUp;

import java.util.ArrayList;
import java.util.Arrays;

public class pizza
{
    String size;
    int cheeseTop;
    int pepTop;

    public pizza(String size, int cheeseTop, int pepTop)
    {
        this.size = size;
        this.cheeseTop = cheeseTop;
        this.pepTop = pepTop;
    }

    public double calcCost()
    {
        switch (size)
        {
            case "small":
                return 10+(1.5*pepTop)+cheeseTop;
            case "medium":
                return 12+(1.5*pepTop)+cheeseTop;
            case "large":
                return 14+(1.5*pepTop)+cheeseTop;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return "pizza{" +
                "size='" + size + '\'' +
                ", cheeseTop=" + cheeseTop +
                ", pepTop=" + pepTop +
                ", totalcost=" + calcCost();
    }

}
class order
{
    public static void main(String[] args)
    {
        pizza obj1 = new pizza("large",3,5);
        pizza obj2 = new pizza("medium",2,4);
        pizza obj3 = new pizza("small",3,3);
        pizza obj4 = new pizza("small",4,2);
        pizza obj5 = new pizza("large",5,1);
        ArrayList<pizza> order = new ArrayList<>(Arrays.asList(obj1,obj2,obj3,obj4,obj5));
        int totalcost =0 ;
        for(pizza each: order)
        {
            totalcost+=each.calcCost();
        }
        System.out.println(totalcost);
        System.out.println(obj1);

    }

}

