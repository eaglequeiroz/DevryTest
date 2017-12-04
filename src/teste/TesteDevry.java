package teste;

import java.util.Random;

public class TesteDevry {
	
	int numberOfFiles;
	int folderSizelimit;
	
	static Random random = new Random();
	
	public static String howManyFolders(int numberOfFiles, int folderSizelimit, int minFileSize) {
		
		if(		numberOfFiles >= 1 && 
				folderSizelimit >= 1 && 
				numberOfFiles < Math.pow(10,5) && 
				folderSizelimit < Math.pow(10, 9)) {
			
			int folders = 1;
			int sumOfFilesSize = 0;
			int fileSize = 0;
			int totalFileSize = 0;
			
			for (int i = 0; i < numberOfFiles; i++) {
				
				fileSize = random.nextInt(folderSizelimit) + minFileSize;
				System.out.print("["+fileSize+"]");
				sumOfFilesSize += fileSize;
				totalFileSize += fileSize;
				
				if(sumOfFilesSize > folderSizelimit) {
					sumOfFilesSize = 0;
					folders++;
				}
			}
			return "\nThere are: \n" + numberOfFiles + " files.\n" + folders + " folders.\n" + totalFileSize + " bytes.";
		} else {
			return "The Arguments don't apply!";
		}
	}

	public static void main(String[] args) {
		
		System.out.println(howManyFolders(20, 50, 1));

	}

}
