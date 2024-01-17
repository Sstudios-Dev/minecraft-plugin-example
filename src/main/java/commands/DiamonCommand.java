package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;

public class DiamonCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be executed by one player.");
            return true;
        }

        Player player = (Player) sender;

        // Verificar si el jugador tiene permisos para ejecutar el comando
        if (!player.hasPermission("example.diamon")) {
            player.sendMessage("You do not have permissions to execute this command.");
            return true;
        }

        // Crear un diamante y darlo al jugador
        ItemStack diamond = new ItemStack(Material.DIAMOND, 1);
        player.getInventory().addItem(diamond);

        player.sendMessage("You have received a diamond!");

        return true;
    }
}
