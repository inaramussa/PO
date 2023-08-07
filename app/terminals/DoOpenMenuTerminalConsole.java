package prr.app.terminals;
import prr.Network;
import prr.app.exceptions.UnknownTerminalKeyException;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add mode import if needed

/**
 * Open a specific terminal's menu.
 */
class DoOpenMenuTerminalConsole extends Command<Network> {

	DoOpenMenuTerminalConsole(Network receiver) {
		super(Label.OPEN_MENU_TERMINAL, receiver);
		addStringField("terminalId", Prompt.terminalKey());
		//FIXME add command fields
	}

	@Override
	protected final void execute() throws CommandException {
		try{
			(new prr.app.terminal.Menu(_receiver,_receiver.getTerminal(stringField("terminalId")))).open();
		}catch(prr.exceptions.UnknownTerminalKeyException e){
			throw new UnknownTerminalKeyException(e.getTerminalId());
		} 
		
                //FIXME implement command
                // create an instance of prr.app.terminal.Menu with the
                // selected Terminal*/
	}
}