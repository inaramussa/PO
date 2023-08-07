package prr.terminals;


public class On extends State {
    public On(TerminalType type) {
        super("ON", type);
    }

    public void OnUpdate(String state){
        if(getType().equals("ON")){
            getType().setState(new Idle(getType()));
        }
    }
}
