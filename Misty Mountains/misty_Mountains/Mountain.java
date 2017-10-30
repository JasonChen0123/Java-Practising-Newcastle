/* Define a class Mountain with appropriate fields, methods and constructor 
 * to store and retrieve information about the name and height (in metres) of the mountain.
 */

package misty_Mountains;

public class Mountain {

	String MountainName;
	int MountainHeight;
	
	// CONSTRUCTOR  with the climber ID and the new mountain name and height to be added
	// 用ClimberID作为key来映射MoutainName作为value？但MoutainName同时需要映射MountainHeight，且MountainName可以重复
	public Mountain(String ClimberID, String MountainName_InputSet, int MountainHeight_InputSet) { //记得在Climber类里添加ClimberID变量
		
		this.MountainName = MountainName_InputSet;
		this.MountainHeight = MountainHeight_InputSet;
	}

	public int mountain_Height_Retrieve (String MountainName_InputGet) {
		
		return MountainHeight; //后续可能要改用list里的元素
	}
}
