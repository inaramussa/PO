package prr.app.clients;

import prr.Network;
import prr.app.exceptions.UnknownClientKeyException;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

//FIXME add more imports if needed

/**
 * Show specific client: also show previous notifications.
 */
class DoShowClient extends Command<Network> {

	DoShowClient(Network receiver) {
		super(Label.SHOW_CLIENT, receiver);
		addStringField("key", Prompt.key());
		//FIXME add command fields
	}

	@Override
	protected final void execute() throws CommandException {
		try{
			String key = stringField("key");
			_display.addLine(_receiver.showClient(key));
			_display.display();
		}catch(prr.exceptions.UnknownClientKeyException e){
			throw new UnknownClientKeyException(e.getKey());
		}
                //FIXME implement command
	}
}
