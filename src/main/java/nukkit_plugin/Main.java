package nukkit_plugin;

import cn.nukkit.Server;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.Plugin;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginLogger;
import nukkit_plugin.command.MenuCommand;

public class Main extends PluginBase {

    // 静态引用，方便其他类直接调用
    public static Plugin plugin;
    public static Server nkServer;
    public static PluginLogger logger;
    public static CommandSender consoleObjects;

    @Override
    public void onLoad() {
        nkServer = this.getServer();
        plugin = this;
        logger = this.getLogger();
        consoleObjects = getServer().getConsoleSender();
        logger.info("§b" + plugin.getName() + " 插件读取中...");
    }

    @Override
    public void onEnable() {
        // 注册命令
        nkServer.getCommandMap().register(plugin.getName(), new MenuCommand());
        logger.info("§b" + plugin.getName() + " 插件已启用");
    }

    @Override
    public void onDisable() {
        logger.info("§b" + plugin.getName() + " 插件已关闭");
    }
}
