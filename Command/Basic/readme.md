  命令模式（Command Pattern）是一种数据驱动的设计模式，
  属于行为型模式。
	 命令模式是对命令的封装。命令模式把发出命令的责任和执行命令的责任分割开，委派给不同的对象。
   意图	命令模式可以对发送者和接收者完全解耦，发送者与接收者之间没有直接引用关系，发送请求的对象只需要知道如何发送请求，而不必知道如何完成请求。这就是命令模式的模式动机。
	  不少Command模式的代码都是针对图形界面的,它实际就是菜单命令,我们在一个下拉菜单选择一个命令时,然后会执行一些动作.
    适用性	主要解决：
	         在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
	          何时使用：
	           在某些场合，比如要对行为进行"记录、撤销/重做、事务"等处理，这种无法抵御变化的紧耦合是不合适的。在这种情况下，如何将"行为请求者"与"行为实现者"解耦？将一组行为抽象为对象，可以实现二者之间的松耦合。。
	            如何解决：
	             通过调用者调用接受者执行命令，顺序：调用者→接受者→命令。
               参与者	客户端(Client)：
	              创建一个具体命令(ConcreteCommand)对象并确定其接收者。
	               命令(Command)：
	                声明了一个给所有具体命令类的抽象接口。
	                 具体命令(ConcreteCommand)：
	                  定义一个接收者和行为之间的弱耦合；
	                   实现execute()方法，负责调用接收者的相应操作。execute()方法通常叫做执行方法。
	                    请求者(Invoker)：
	                     负责调用命令对象执行请求，相关的方法叫做行动方法。
	                      接收者(Receiver)：
	                       负责具体实施和执行一个请求。任何一个类都可以成为接收者，实施和执行请求的方法叫做行动方法。


                         效果	优点：
	                        1. 命令模式使新的命令很容易地被加入到系统里。
	                         2. 允许接收请求的一方决定是否要否决请求。
	                          3. 能较容易地设计一个命令队列。
	                           4. 可以容易地实现对请求的撤销和恢复。
	                            5. 在需要的情况下，可以较容易地将命令记入日志。
	                             缺点：
	                              使用命令模式可能会导致某些系统有过多的具体命令类。
	                               使用场景：
	                                认为是命令的地方都可以使用命令模式，比如：
	                                 1、GUI 中每一个按钮都是一条命令。
	                                  2、模拟 CMD。
	                                   注意事项：
	                                    系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作，也可以考虑使用命令模式，见命令模式的扩展。
                                      实现	基本
	                                     接收者角色类

	public class Receiver {
    /**
     * 真正执行命令相应的操作
     */
    public void action(){
        System.out.println("执行操作");
    }
}

	抽象命令角色类

	public interface Command {
    /**
     * 执行方法
     */
    void execute();
}

	具体命令角色类

	public class ConcreteCommand implements Command {
    //持有相应的接收者对象
    private Receiver receiver = null;
    /**
     * 构造方法
     */
    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        //通常会转调接收者对象的相应方法，让接收者来真正执行功能
        receiver.action();
    }
	}

	请求者角色类

	public class Invoker {
    /**
     * 持有命令对象
     */
    private Command command = null;
    /**
     * 构造方法
     */
    public Invoker(Command command){
        this.command = command;
    }
    /**
     * 行动方法
     */
    public void action(){

        command.execute();
    }
}

	客户端角色类

	public class Client {
	public static void main(String[] args) {
        //创建接收者
        Receiver receiver = new Receiver();
        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);
        //创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker(command);
        //执行方法
        invoker.action();
    }
	}

	来自 <http://www.cnblogs.com/java-my-life/archive/2012/06/01/2526972.html>

	增强
	小女孩茱丽(Julia)有一个盒式录音机，此录音机有播音(Play)、倒带(Rewind)和停止(Stop)功能，录音机的键盘便是请求者(Invoker)角色；茱丽(Julia)是客户端角色，而录音机便是接收者角色。Command类扮演抽象命令角色，而PlayCommand、StopCommand和RewindCommand便是具体命令类。茱丽(Julia)不需要知道播音(play)、倒带(rewind)和停止(stop)功能是怎么具体执行的，这些命令执行的细节全都由键盘(Keypad)具体实施。茱丽(Julia)只需要在键盘上按下相应的键便可以了。
	录音机是典型的命令模式。录音机按键把客户端与录音机的操作细节分割开来。

	源代码
	接收者角色，由录音机类扮演

	public class AudioPlayer {

    public void play(){
        System.out.println("播放...");
    }

    public void rewind(){
        System.out.println("倒带...");
    }

    public void stop(){
        System.out.println("停止...");
    }
}

	抽象命令角色类

	public interface Command {
    /**
     * 执行方法
     */
    public void execute();
}

	具体命令角色类

	public class PlayCommand implements Command {
	private AudioPlayer myAudio;

    public PlayCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    /**
     * 执行方法
     */
    @Override
    public void execute() {
        myAudio.play();
    }
	}



	public class RewindCommand implements Command {
	private AudioPlayer myAudio;

    public RewindCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    @Override
    public void execute() {
        myAudio.rewind();
    }
	}



	public class StopCommand implements Command {
    private AudioPlayer myAudio;

    public StopCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    @Override
    public void execute() {
        myAudio.stop();
    }
	}

	请求者角色，由键盘类扮演

	public class Keypad {
    private Command playCommand;
    private Command rewindCommand;
    private Command stopCommand;

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }
    public void setRewindCommand(Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }
    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }
    /**
     * 执行播放方法
     */
    public void play(){
        playCommand.execute();
    }
    /**
     * 执行倒带方法
     */
    public void rewind(){
        rewindCommand.execute();
    }
    /**
     * 执行播放方法
     */
    public void stop(){
        stopCommand.execute();
    }
}

	客户端角色，由茱丽小女孩扮演

	public class Julia {
    public static void main(String[]args){
        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();
        //创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);
        //创建请求者对象
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);
        //测试
        keypad.play();
        keypad.rewind();
        keypad.stop();
        keypad.play();
        keypad.stop();
    }
}

	运行结果如下：


	来自 <http://www.cnblogs.com/java-my-life/archive/2012/06/01/2526972.html>
补充	Command模式是最让我疑惑的一个模式,我在阅读了很多代码后,才感觉隐约掌握其大概原理,我认为理解设计模式最主要是掌握起原理构造,这样才对自己实际编程有指导作用.Command模式实际上不是个很具体,规定很多的模式,正是这个灵活性,让人有些confuse.
	Command定义
	n 将来自客户端的请求传入一个对象，无需了解这个请求激活的 动作或有关接受这个请求的处理细节。
	这是一种两台机器之间通讯联系性质的模式，类似传统过程语 言的 CallBack功能。
	优点：
	解耦了发送者和接受者之间联系。 发送者调用一个操作，接受者接受请求执行相应的动作，因为使用Command模式解耦，发送者无需知道接受者任何接口。
	不少Command模式的代码都是针对图形界面的,它实际就是菜单命令,我们在一个下拉菜单选择一个命令时,然后会执行一些动作.
	将这些命令封装成在一个类中,然后用户(调用者)再对这个类进行操作,这就是Command模式,换句话说,本来用户(调用者)是直接调用这些命令的,如菜单上打开文档(调用者),就直接指向打开文档的代码,使用Command模式,就是在这两者之间增加一个中间者,将这种直接关系拗断,同时两者之间都隔离,基本没有关系了.
	显然这样做的好处是符合封装的特性,降低耦合度,Command是将对行为进行封装的典型模式,Factory是将创建进行封装的模式,
	从Command模式,我也发现设计模式一个"通病":好象喜欢将简单的问题复杂化, 喜欢在不同类中增加第三者,当然这样做有利于代码的健壮性 可维护性 还有复用性.
	如何使用?
	具体的Command模式代码各式各样,因为如何封装命令,不同系统,有不同的做法.下面事例是将命令封装在一个Collection的List中,任何对象一旦加入List中,实际上装入了一个封闭的黑盒中,对象的特性消失了,只有取出时,才有可能模糊的分辨出:
	典型的Command模式需要有一个接口.接口中有一个统一的方法,这就是"将命令/请求封装为对象":

	public interface Command {
	public abstract void execute ( );
	}
	具体不同命令/请求代码是实现接口Command,下面有三个具体命令

	public class Engineer implements Command {

	public void execute( ) {
	//do Engineer's command
	}
	}
	public class Programmer implements Command {

	public void execute( ) {
	//do programmer's command
	}
	}
	public class Politician implements Command {

	public void execute( ) {
	//do Politician's command
	}
	}
	按照通常做法,我们就可以直接调用这三个Command,但是使用Command模式,我们要将他们封装起来,扔到黑盒子List里去:

	public class producer{
	public static List produceRequests() {
	List queue = new ArrayList();
	queue.add( new DomesticEngineer() );
	queue.add( new Politician() );
	queue.add( new Programmer() );
	return queue; 
	}
	}
	这三个命令进入List中后,已经失去了其外表特征,以后再取出,也可能无法分辨出谁是Engineer 谁是Programmer了,看下面客户端如何调用Command模式:

	public class TestCommand {
	public static void main(String[] args) {

	List queue = Producer.produceRequests();
	for (Iterator it = queue.iterator(); it.hasNext(); )

	//客户端直接调用execute方法，无需知道被调用者的其它更多类的方法名。
	((Command)it.next()).execute();
	}
	}
	由此可见,调用者基本只和接口打交道,不合具体实现交互,这也体现了一个原则,面向接口编程,这样,以后增加第四个具体命令时,就不必修改调用者TestCommand中的代码了.

	理解了上面的代码的核心原理,在使用中,就应该各人有自己方法了,特别是在如何分离调用者和具体命令上,有很多实现方法,上面的代码是使用"从List过一遍"的做法.这种做法只是为了演示.
	使用Command模式的一个好理由还因为它能实现Undo功能.每个具体命令都可以记住它刚刚执行的动作,并且在需要时恢复.
	Command模式在界面设计中应用广泛.Java的Swing中菜单命令都是使用Command模式,由于Java在界面设计的性能上还有欠缺,因此界面设计具体代码我们就不讨论,网络上有很多这样的示例.

	来自 <http://www.jdon.com/designpatterns/command.htm>
