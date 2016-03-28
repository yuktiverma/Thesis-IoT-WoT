package beans;

public class GroupSensor {
	int groupId;
	String[] sensorName;
	String[] permission;
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	
	public String[] getSensorName() {
		return sensorName;
	}
	public void setSensorName(String[] sensorName) {
		this.sensorName = sensorName;
	}
	public String[] getPermission() {
		return permission;
	}
	public void setPermission(String[] permission) {
		this.permission = permission;
	}
	

}
