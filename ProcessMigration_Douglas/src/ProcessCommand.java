
/**
 * 
 * @author hefuchai
 * ProcessCommand extends Command, which contains the information of
 * migrated process. The receiver could use this info to resume the 
 * migrated process.
 */

public class ProcessCommand extends Command{
	
	private MigratableProcess _mgProcess;
	public ProcessCommand(String Deshn, int Desport, MigratableProcess t) {
		super(Deshn, Desport, cmdType.PROCESS_COMING);
		this._mgProcess = t;
	}
	
	public MigratableProcess GetMigratableProcess() {
		return this._mgProcess;
	}
	@Override 
	public void PrintCommand() {
		System.out.println("DesHostName: "+ super.GetHostName() + " DesPort: "+super.GetPort() + " Type: Process is coming");
	}

}
