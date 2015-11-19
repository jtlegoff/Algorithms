package Quest5;

public class Image {

	private String name;
	private String resolution;
	
	public Image(String newName, String newResolution){
		name = newName;
		resolution = newResolution;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	
}
