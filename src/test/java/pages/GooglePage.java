package pages;

public class GooglePage extends BasePage {

    private String searchTextField = "//input[@title='Buscar']";
    private String searchButton = "//input[@value='Buscar con Google']";
    private String firstResult = "";

    public GooglePage() {
        super(driver);
    }

    public void navigateToGoogle() {
        navigateTo("https://www.google.com");
    }

    public void enterSearchCriteria(String criteria) {
        write(searchTextField, criteria);
    }


    public void clickGoogleSearch() {
        clickElement(searchButton);
    }

    public String firstResult(){
        return textFromElement(firstResult);

    }



}
