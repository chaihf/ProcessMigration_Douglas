import java.io.Serializable;

/**
 * 
 * @author hefuchai
 * The command sent between clients and server.
 * It is an abstract class which will be extended by specific commands
 */
public abstract class Command implements Serializable{
	public enum cmdType {
		//The command type
		HEART_BEAT(0), PROCESS_MIGRATION(1), NEW_PROCESS_INSTANCE(2),PRINT_PROCESS(3), PROCESS_COMING(4);
		private int _type;
		private cmdType(int a) {
			_type = a;
		}
	}
	
	private String _hostName;
	private int _port;
	private cmdType _commandType;
	
	public Command() {}
	public Command(String hn, int port, cmdType ct) {
		this._commandType = ct;
		this._port = port;
		this._hostName = hn;
	}
	
	public void SetType(cmdType ct) {
		this._commandType = ct;
	}

	public void SetPort(int port) {
		this._port = port;
	}

	public void SetHostName(String hn) {
		this._hostName = hn;
	}
	
	public cmdType GetType() {
		return this._commandType;
	}
	
	public int GetPort() {
		return this._port;
	}

	public String GetHostName() {
		return this._hostName;
	}
	
	public abstract void PrintCommand();
}
