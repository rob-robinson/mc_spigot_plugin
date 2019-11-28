package rob.plugins.hello;

import org.bukkit.Material;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Hello extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("upsies");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if(sender instanceof Player) {

            Player player = (Player) sender;

            Location startingBlock = player.getLocation().add(0, -1, 0);
            Location currentBlock = startingBlock;
            int i, ii;

            switch (command.getName()) {

                case "makepool":

                    for (ii=0; ii<10; ii+=1) {

                        double new_x;
                        double new_y;
                        double new_z;

                        Location initial = currentBlock;

                        for (i = 0; i < 10; i += 1) {

                            new_x = initial.getX() + i;
                            new_y = initial.getY();
                            new_z = initial.getZ() + ii;

                            currentBlock.setX(new_x);
                            currentBlock.setY(new_y);
                            currentBlock.setZ(new_z);

                            System.out.println(currentBlock.getX() + ", " + currentBlock.getY() + ", " + currentBlock.getZ());

                            currentBlock.getBlock().setType(Material.BLUE_GLAZED_TERRACOTTA);

                        }
                    }


                    break;

                case "makeone":


                    double radius = .9;


                    for ( ii=0; ii<10; ii+=1) {

                        double new_x;
                        double new_z;

                        for ( i = 0; i < 360; i += 1) {

                            new_x = currentBlock.getX() + (radius * Math.cos(i * Math.PI / 180));
                            new_z = currentBlock.getZ() + (radius * Math.sin(i * Math.PI / 180));

                            currentBlock.setX(new_x);
                            currentBlock.setZ(new_z);

                            System.out.println(currentBlock.getX() + ", " + currentBlock.getY() + ", " + currentBlock.getZ());

                            currentBlock.getBlock().setType(Material.TNT);

                        }

                        radius *= .8;
                    }


                    break;

                default:
                    break;
            }
        }

        return super.onCommand(sender, command, label, args);
    }
}
