/* Define a class Mountain with appropriate fields, methods and constructor 
 * to store and retrieve information about the name and height (in metres) of the mountain.
 */

package misty_Mountains;

public class Mountain {

	String MountainName;
	int MountainHeight;
	
	// CONSTRUCTOR  with the climber ID and the new mountain name and height to be added
	// ��ClimberID��Ϊkey��ӳ��MoutainName��Ϊvalue����MoutainNameͬʱ��Ҫӳ��MountainHeight����MountainName�����ظ�
	public Mountain(String ClimberID, String MountainName_InputSet, int MountainHeight_InputSet) { //�ǵ���Climber�������ClimberID����
		
		this.MountainName = MountainName_InputSet;
		this.MountainHeight = MountainHeight_InputSet;
	}

	public int mountain_Height_Retrieve (String MountainName_InputGet) {
		
		return MountainHeight; //��������Ҫ����list���Ԫ��
	}
}
