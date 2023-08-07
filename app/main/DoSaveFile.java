package prr.app.main;

import prr.NetworkManager;
import pt.tecnico.uilib.forms.Form;
import pt.tecnico.uilib.menus.Command;
import java.io.FileNotFoundException;
import java.io.IOException;

import prr.exceptions.MissingFileAssociationException;

//FIXME add more imports if needed

/**
 * Command to save a file.
 */
class DoSaveFile extends Command<NetworkManager> {

	DoSaveFile(NetworkManager receiver) {
		super(Label.SAVE_FILE, receiver);
	}

	@Override
	protected final void execute() {
		try{
			_receiver.save();
		}catch(MissingFileAssociationException e){
			try{
				_receiver.saveAs(Form.requestString(Prompt.newSaveAs()));

			}catch(MissingFileAssociationException ex){
				ex.printStackTrace();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}catch(FileNotFoundException e1){
			e1.printStackTrace();
		}catch(IOException e1){
			e1.printStackTrace();
		}        //FIXME implement command and create a local Form
	}
}
