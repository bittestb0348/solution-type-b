package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 
	
	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}
	
	public Money add(Money money) {
		this.amount += money.amount;
		return money;
	}

	public Money minus(Money money) {
		this.amount -= money.amount;
		return money;
	}

	public Money multiply(Money money) {
		this.amount *= money.amount;
		return money;
	}

	public Money devide(Money money) {
		this.amount /= money.amount;
		return money;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Money) {
			Money money = (Money) obj;
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return this.amount;
	}
	
}