package group40.cs6310.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceView;

import java.io.File;
import java.util.Locale;


public class HandleInternalResourceViewExists extends InternalResourceView {

    @Override
    public boolean checkResource(Locale locale) throws Exception {
        File file = new File(getServletContext().getRealPath("/") + getUrl());
        System.out.println(file);
        return file.exists();
    }
}
