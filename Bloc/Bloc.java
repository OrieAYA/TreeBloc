package Bloc;

public abstract class Bloc {

    MotherBloc Origin;



    private void setOrigin(MotherBloc mBloc){this.Origin = mBloc;}

    private MotherBloc getOrigin(){return this.Origin;}

}
