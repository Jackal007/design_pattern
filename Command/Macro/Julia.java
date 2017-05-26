package Command.Macro;

//Client
public class Julia {
	public static void main(String[] args) {
		// 创建接收者对象
		AudioPlayer audioPlayer = new AudioPlayer();
		// 创建命令对象
		Command playCommand = new PlayCommand(audioPlayer);
		Command rewindCommand = new RewindCommand(audioPlayer);
		Command stopCommand = new StopCommand(audioPlayer);

		MacroCommand marco = new MacroAudioCommand();

		marco.add(playCommand);
		marco.add(rewindCommand);
		marco.add(stopCommand);

		// 创建调用者对象
		Keypad keypad = new Keypad();
		keypad.setMacroCommand(marco);
		keypad.macro();
	}
}
