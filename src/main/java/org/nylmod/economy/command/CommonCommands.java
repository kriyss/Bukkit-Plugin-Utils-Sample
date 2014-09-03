package org.nylmod.economy.command;

import org.bukkit.command.CommandSender;
import org.kriyss.bukkit.utils.annotations.command.Command;
import org.kriyss.bukkit.utils.annotations.command.CommandGroup;
import org.kriyss.bukkit.utils.annotations.command.Param;

@CommandGroup
public class CommonCommands {

    @Command(description = "Make product from two numbers")
    public boolean product(CommandSender sender, @Param Integer number1, @Param Integer number2){
       Integer result = number1 * number2;
       sender.sendMessage("result : " + result);
       return true;
    }

    @Command(description = "Add two numbers")
    public boolean add(CommandSender sender, @Param Integer number1, @Param Integer number2){
        Integer result = number1 + number2;
        sender.sendMessage("result : " + result);
        return true;
    }

    @Command(description = "divide two number")
    public boolean divide(CommandSender sender, @Param Integer number1, @Param(min = 0) Integer number2){
        Integer result = number1 / number2;
        sender.sendMessage("result : " + result);
        return true;
    }

    @Command(name = "delete", description = "remove two number")
    public boolean remove(CommandSender sender, @Param Integer number1, @Param Integer number2){
        Integer result = number1 - number2;
        sender.sendMessage("result : " + result);
        return true;
    }
}
