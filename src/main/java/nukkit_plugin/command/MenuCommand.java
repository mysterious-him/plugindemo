package nukkit_plugin.command;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.Player;
import nukkit_plugin.form.DDUIMainMenu;

import static nukkit_plugin.Main.plugin;

public class MenuCommand extends Command {

    public MenuCommand() {
        // 命令名 /ddmenu，别名 /menu
        super("ddmenu", plugin.getName() + " 打开DDUI主菜单", "/ddmenu");
        this.setAliases(new String[]{"menu"});
    }

    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
        // 判断是否为玩家执行
        if (!(sender instanceof Player player)) {
            sender.sendMessage("§c该命令只能由玩家执行");
            return false;
        }
        // 打开 DDUI 主菜单
        DDUIMainMenu.show(player);
        return true;
    }
}
