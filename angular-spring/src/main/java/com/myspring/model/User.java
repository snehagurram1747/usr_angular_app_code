package com.myspring.model;

public class User {

	//public class User {
		private String UsrId;
		private String name;
		private String details;
		
		

		public User(String string) {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getdetails() {
			return details;
		}

		public void setdetails(String details) {
			this.details = details;
		}

		

		public String getUsrId() {
			return UsrId;
		}

		public void setUsrId(String UsrId) {
			this.UsrId = UsrId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((details == null) ? 0 : details.hashCode());
			result = prime * result + ((UsrId == null) ? 0 : UsrId.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			if (details == null) {
				if (other.details != null)
					return false;
			} else if (!details.equals(other.details))
				return false;
			if (UsrId == null) {
				if (other.UsrId != null)
					return false;
			} else if (!UsrId.equals(other.UsrId))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

	}
	