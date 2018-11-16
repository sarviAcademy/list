package business;
import com.example.amir.list.R;




/**
 * Created by Amir on 11/10/2018.
 */

public class Drinks {

    String name;
    String description;
    int imageId;
    public  Drinks(String name,String description,int imageID)
    {
        this.name=name;
        this.description=description;
        this.imageId=imageID;

    }
    public static final Drinks[]drinks={
            new Drinks("Cappuccino","this is some kind of cafe", R.drawable.cappuccino),
            new Drinks("Spresso","this is some kind of cafe", R.drawable.filter),
           new Drinks("Water","this is some kind of cafe", R.drawable.latte)

    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageId() {
        return imageId;
    }

    @Override
    public String toString() {
        return name;
    }
}
