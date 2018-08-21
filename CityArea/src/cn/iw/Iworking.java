package cn.iw;

public class Iworking {
	 	private int id;
	    private String name;
	    private int cityAreaId;
	    private String address;
	    private String telephone;
	    
	    
	    
		public Iworking() {
			super();
		}
		public Iworking(int id, String name, int cityAreaId, String address,
				String telephone) {
			super();
			this.id = id;
			this.name = name;
			this.cityAreaId = cityAreaId;
			this.address = address;
			this.telephone = telephone;
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
		public int getCityAreaId() {
			return cityAreaId;
		}
		public void setCityAreaId(int cityAreaId) {
			this.cityAreaId = cityAreaId;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getTelephone() {
			return telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
	    
	    
}
