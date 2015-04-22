package DrHuExampleDesignPatterns;

public class StategyPattern {
	public static void main(String[] args) {
        Context context = new Context();
        // Three contexts following different strategies
        context.getStrategyt(CONST.STG1);;
        context.executeStrategy("'it's the strategy for now'");
 
        context.getStrategyt(CONST.STG2);;
        context.executeStrategy("'it's the strategy that has changed'");
        
        context.getStrategyt(CONST.STG3);;
        context.executeStrategy("'it's the strategy for the future'");
    }
}

/** The classes that implement a concrete strategy should implement this.
* The Context class uses this to call the concrete strategy. */
interface Strategy {
    int execute(String msg); 
}
 
//Context is an application context where different strategies are needed
//A reference to a Strategy object promotes decoupling from any concrete 
//strategies
class Context {
    private Strategy strategy;
 
    public void getStrategyt(CONST stg) {
        this.strategy = StrategyFactory.getStrategy(stg);
    }
    public int executeStrategy(String msg) {
        return this.strategy.execute(msg);
    }
}

enum CONST { STG1, STG2, STG3 }

class StrategyFactory{
	static Strategy getStrategy(CONST stg){
		Strategy stgObj = null;
		switch(stg){
			case STG1: stgObj =  new Strategy1();
			break;
			case STG2: stgObj = new Strategy2();
			break;
			case STG3: stgObj = new Strategy3();
			break;	
			default: 
		}	
		return stgObj;
	}
}

class Strategy1 implements Strategy{
	@Override
	public int execute(String msg) {
		System.out.println("This is strategy one with message " + msg + "!");
		return 100;
	}	
}

class Strategy2 implements Strategy{
	@Override
	public int execute(String msg) {
		System.out.println("This is strategy two with message " + msg + "!");
		return 200;
	}	
}

class Strategy3 implements Strategy{
	@Override
	public int execute(String msg) {
		System.out.println("This is strategy three with message " + msg + "!");
		return 300;
	}	
}

