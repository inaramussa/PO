package prr.app.terminals;

import java.util.Collections;

import prr.Network;
import prr.terminals.TerminalType;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Show all terminals.
 */
class DoShowAllTerminals extends Command<Network> {

	DoShowAllTerminals(Network receiver) {
		super(Label.SHOW_ALL_TERMINALS, receiver);
	}

	@Override
	protected final void execute() throws CommandException {
		for(TerminalType terminalTy:_receiver.showAllTerminalTypes()){
			_display.addLine(terminalTy.toString());
		}
		_display.display();

                //FIXME implement command
	}
}
