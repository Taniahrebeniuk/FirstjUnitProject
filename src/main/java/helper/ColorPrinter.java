package helper;

import org.apache.logging.log4j.Logger;

import static helper.ConsoleColors.*;

public class ColorPrinter {

    public static void printColorMessage(String message, Logger logger, Level level) {
        switch (level) {
            case INFO:
                logger.info(GREEN + message + RESET);
                break;
            case DEBUG:
                logger.debug(YELLOW + message + RESET);
                break;
            case ERROR:
                logger.error(RED + message + RESET);
                break;
        }
    }
}
