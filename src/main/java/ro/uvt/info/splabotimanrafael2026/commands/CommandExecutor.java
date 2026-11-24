package ro.uvt.info.splabotimanrafael2026.commands;

import org.springframework.stereotype.Component;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class CommandExecutor {
    private final ExecutorService executor = Executors.newFixedThreadPool(2);

    public void executeAsync(Runnable command) {
        executor.submit(command);
    }
}