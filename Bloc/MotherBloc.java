package Bloc;

import java.util.ArrayList;
import java.util.List;

public abstract class MotherBloc extends Bloc{

    List ContainedSimples = new ArrayList<SimpleBloc>();



    private void setContained(List<SimpleBloc> lBloc){this.ContainedSimples = lBloc;}

    private List getContained(){return this.ContainedSimples;}

}
