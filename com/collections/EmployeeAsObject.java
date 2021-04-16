package com.collections;

import java.io.IOException;
import java.util.HashMap;

public class EmployeeAsObject {
	
	
	public static class Employee {
		  
        private int rollno;
        private String name;
        
		public Employee(int rollno, String name) {
			this.rollno = rollno;
			this.name = name;
		}

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + rollno;
			return result;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (rollno != other.rollno)
				return false;
			return true;
		}
		
		

        
		
        
	}
	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		HashMap<Employee, String> hp = new HashMap();
		
		Employee one = new Employee(1, "Tanzeel1");
		Employee two = new Employee(2, "Tanzeel2");
		
		hp.put(one, one.getName());
		hp.put(two, two.getName());
		
        one.setName("Not Geeks1");

        System.out.println(hp.get(one));

	}

}
