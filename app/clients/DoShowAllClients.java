package prr.app.clients;

import prr.Network;
import prr.clients.Client;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Show all clients.
 */
class DoShowAllClients extends Command<Network> {

	DoShowAllClients(Network receiver) {
		super(Label.SHOW_ALL_CLIENTS, receiver);
	}

	@Override
	protected final void execute() throws CommandException {
		for(Client client:_receiver.showAllClients())
			_display.addLine(client.toString());
		_display.display();
		
                //FIXME implement command
	}
}
