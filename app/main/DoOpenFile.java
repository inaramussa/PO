package prr.app.main;

import prr.NetworkManager;
import prr.app.exceptions.FileOpenFailedException;
import prr.exceptions.UnavailableFileException;
import pt.tecnico.uilib.forms.Form;
import java.lang.reflect.Field;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//Add more imports if needed

/**
 * Command to open a file.
 */
class DoOpenFile extends Command<NetworkManager> {

	DoOpenFile(NetworkManager receiver) {
		super(Label.OPEN_FILE, receiver);
                addStringField("filename", Prompt.openFile());
                //FIXME add command fields
	}

	@Override
	protected final void execute() throws CommandException {
                try {
                        _receiver.load(stringField("filename"));
                                //FIXME implement command
                } catch (UnavailableFileException e) {
                        throw new FileOpenFailedException(e);
                }

	}
}
