package prr.app.terminals;

import prr.Network;
import prr.app.exceptions.DuplicateTerminalKeyException;
import prr.app.exceptions.InvalidTerminalKeyException;
import pt.tecnico.uilib.menus.Command;

import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Register terminal.
 */
class DoRegisterTerminal extends Command<Network> {

	DoRegisterTerminal(Network receiver) {
		super(Label.REGISTER_TERMINAL, receiver);
		addStringField("terminalId", Prompt.terminalKey());
		addOptionField("terminalType",Prompt.terminalType(), "BASIC", "FANCY");
		addStringField("clientId",Prompt.clientKey());

		//FIXME add command fields
	}

	@Override
	protected final void execute() throws CommandException {
		try {
				_receiver.registerTerminal(
				stringField("terminalId"),
				optionField("terminalType"),
				stringField("clientId")
			);
		} catch (prr.exceptions.DuplicateTerminalKeyException in ) {
			throw new DuplicateTerminalKeyException(in.getTerminalId());
		}catch(prr.exceptions.InvalidTerminalKeyException en ){
			throw new InvalidTerminalKeyException(en.getTerminalId());
		}
                //FIXME implement command
	}
}
