package deloitte;

public class employee implements Comparable{
	   private int id;
	   private String name;
	   private String Dept;
	   
	   public employee(int id,String name,String dept)
	   {
		   this.id=id;
		   this.name=name;
		   this.Dept=dept;
	   }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}
	@Override
	public int compareTo(Object o) {
		employee e=(employee)o;
		String name1=e.getName();
		String name2=this.getName();
		
		return name1.compareTo(name2);
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", Dept=" + Dept + "]\n";
	}
	   

}
