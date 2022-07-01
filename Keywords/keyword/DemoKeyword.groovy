package keyword

import com.kms.katalon.core.annotation.Keyword

public class DemoKeyword {

	@Keyword
	def myCustomPrint(String msg) {
		println "The message is: " + msg
	}
}