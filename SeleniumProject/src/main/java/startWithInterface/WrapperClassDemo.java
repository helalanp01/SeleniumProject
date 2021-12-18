package startWithInterface;

public interface WrapperClassDemo {
public void enterById(String locator,String data);
public void enterByName(String locator,String data);
public void enterByClassName(String locator,String data);
public void enterByTagName(String locator,String data);
public void enterByLinkText(String locator,String data);
public void enterByPartialLinkText(String locator,String data);
public void enterByCSSSelector(String locator,String data);
public void enterByXpath(String locator,String data);

public void clickById(String locator);
public void clickByName(String locator);
public void clickByClassName(String locator);
public void clickByTagName(String locator);
public void clickByLinkText(String locator);
public void clickByPartialLinkText(String locator);
public void clickXpath(String locator);

public void simpleAlertAccept(String locator);
public void simpleAlertDismiss();
public void simpleAlertText();
public void simpleAlertSend();
public void simpleAlertConfermation();
public void simpleAlertPrompt();

public void DropSelectByIndex(int value);
public void DropSelectByvalue(String data);
public void DropSelectByvisibleText(String id,String data);

public void switchToFrameIndex(int value);
public void switchToFrameName(String data);
public void Id(String data);
}
