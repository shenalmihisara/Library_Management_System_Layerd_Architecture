package Controllers.Login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import scean.SceanManager;
import service.LoginService;
import service.impl.LoginServiceImpl;

public class LoginPageController {

    LoginService service = new LoginServiceImpl();

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void btnLoginOnAction(ActionEvent event) {


        if (service.checkLoginDetails(txtUserName.getText(), txtPassword.getText())) {
            SceanManager.switchPage("/view/Home/Home_Page.fxml");
        }else {
            SceanManager.switchPage("/view/Login/Login_error_page.fxml");

        }
    }

    public void btnClearOnAction(ActionEvent actionEvent) {
        SceanManager.switchPage("/view/Login/Login_page.fxml");
    }
}
