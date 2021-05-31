/*interface
{

}*/
interface remote_ac   //interface segregation
{
    public void controller();
}
interface automatic_ac
{
    public void temperature_detector();
}
/* class
 {

 }
 class orient
{

}*/
interface company
{

    public void name1();
}
/*
 class  implements company,automatic_ac
{

	@Override
	public void name() {
		// TODO Auto-generated method stub

	}

	@Override
	public void remote() {
		// TODO Auto-generated method stub

	}
	public void temperature_sensor()
	{

	}

}
 */
class lg implements company,remote_ac
{

    @Override
    public void name1() {
        // TODO Auto-generated method stub
        System.out.println("Hey I am lg old version");

    }

    @Override
    public void controller() {
        // TODO Auto-generated method stub
        System.out.println("hey you can control your ac with the help of me");

    }

}
class lg_automatic extends lg       //open for extension[O]
{
    public void temperature_sensor()
    {

        System.out.println("Hii I am the updated version of lg");
    }
}
class orient implements company,automatic_ac
{

    @Override
    public void name1() {
        // TODO Auto-generated method stub
        System.out.println("Hey I am orient");

    }

    @Override
    public void temperature_detector() {   //the only responsibility of the class.(S)
        // TODO Auto-generated method stub
        System.out.println("Perform temp detector operations");
    }


}

/*
class orient_new extends orient implements company //the class orient_new can substitute orient
{
	String name;
	orient_new(String model)
	{
		this.name=model;
	}
	@Override
	public void name1() {
		// TODO Auto-generated method stub

	}
	public void temperature_detector_with_vaccuming()
	{
		if(name=="orient_old")
		{
			System.out.println("Perform  detector operations");
		}
		else
		{
			System.out.println("Perform  detector operations with ");
		}

	}

}

 */
class orient_new extends orient implements company //the class orient_new can substitute orient
{
    String name1;

    orient_new(String model) {
        this.name1=model;
    }

    @Override
    public void name1() {
        // TODO Auto-generated method stub
        System.out.println("name");

    }

    public void temperature_detector_with_va() {
        if (this.name1.equals( "orient_old")) {
            System.out.println("Perform  detector operations");
        } else System.out.println("Perform  detector operations with va ");

    }
}

public class solid_principle {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        orient_new ori_new =new orient_new("orient_old");
        orient_new ori =new orient_new("orient_new");
        ori.temperature_detector_with_va();
        ori_new.temperature_detector_with_va();
        lg_automatic lg_obj=new lg_automatic();
        lg_obj.temperature_sensor();


    }
}