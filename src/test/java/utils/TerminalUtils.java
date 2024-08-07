package utils;

import org.apache.commons.math3.util.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

@Component
public class TerminalUtils {

    public static final Logger log = LoggerFactory.getLogger(TerminalUtils.class);
    /**
     * Instantiates a new terminal utils.
     */
    public TerminalUtils() {
    }

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(TerminalUtils.class);

    public static String getResult(String command) throws IOException, InterruptedException {
        String result = "";
        try {
            Scanner s;
            String line =  "podman run --rm public.ecr.aws/l4q9w4c5/loanpro-calculator-cli " + command;
            s = new Scanner(Runtime.getRuntime().exec(line).getInputStream()).useDelimiter("\\A");

            result = getStringScanner(s);

        }catch(Exception e) {
            log.info(e.getMessage() );
        }

        return result;
    }

    private static String getStringScanner(Scanner s) {
        String scanned = "";
        while(s.hasNext()) {
            scanned = scanned + s.nextLine();
        }
        s.close();
        return scanned;
    }
}
