
public class Goods {
		private double receivingDate;
		private String name;
		private double price=0;
		private int amount = 0;
	    CustumerType grade;
	    Enum<ColorType> color;
		

		public Goods(String name, double price, int amount, ColorType color, CustumerType grade){
			setName(name);
			setColor(color);
	    	setAmount(amount);
	    	setGrade(grade);
	    	setPrice(price);
	    }
	    
	
		public double getReceivingDate() {
			return receivingDate;
		}
		public void setReceivingDate(double receivingDate) {
			this.receivingDate = receivingDate;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		public String getColor() {
			return color.name();
		}
		
		public void setColor(ColorType color) {
			this.color = color;
		}
		public CustumerType getGrade() {
			return grade;
		}
		public void setGrade(CustumerType grade) {
			this.grade = grade;
		}


		@Override
		public String toString() {
			return  ", name = " + name + ", price = " + price + ", amount ="
					+ amount + ", grade = " + grade + ", color = " + color;
		}
		
		
}
