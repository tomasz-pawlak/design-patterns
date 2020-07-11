package workshop;

import workshop.command.Command;

import java.util.ArrayList;
import java.util.List;

public class WorkshopApp {

    List<Command> commandList = new ArrayList<>();

    public void addToList(Command command) {
        commandList.add(command);
    }

    public void run() {
        if (commandList.isEmpty()) {
            System.out.println("Kolejka pusta");
        }

        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
