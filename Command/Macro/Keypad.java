package Command.Macro;

//请求者
public class Keypad {
	private Command playCommand;
	private Command rewindCommand;
	private Command stopCommand;
	private MacroCommand macroCommand;

	public void setPlayCommand(Command playCommand) {
		this.playCommand = playCommand;
	}

	public void setRewindCommand(Command rewindCommand) {
		this.rewindCommand = rewindCommand;
	}

	public void setStopCommand(Command stopCommand) {
		this.stopCommand = stopCommand;
	}

	public void setMacroCommand(MacroCommand macroCommand) {
		this.macroCommand = macroCommand;
	}

	/**
	 * 执行播放方法
	 */
	public void play() {
		playCommand.execute();
	}

	/**
	 * 执行倒带方法
	 */
	public void rewind() {
		rewindCommand.execute();
	}

	/**
	 * 执行播放方法
	 */
	public void stop() {
		stopCommand.execute();
	}

	/**
	 * 执行宏方法
	 */
	public void macro() {
		macroCommand.execute();
	}
}
