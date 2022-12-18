package mockaburra.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;

public enum FileUtils {
    ;

    public static FileInputStream getFileInputStream(final Class clazz, final String path) throws URISyntaxException, FileNotFoundException {
        URL resource = clazz.getClassLoader().getResource(path);
        File file = new File(resource.toURI());
        FileInputStream input = new FileInputStream(file);
        return input;
    }
}
