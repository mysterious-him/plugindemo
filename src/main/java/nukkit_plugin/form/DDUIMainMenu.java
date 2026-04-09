package nukkit_plugin.form;

import cn.nukkit.Player;
import cn.nukkit.ddui.CustomForm;
import cn.nukkit.ddui.MessageBox;

public class DDUIMainMenu {

    /**
     * 打开 DDUI 主菜单
     * 按钮布局：3行（3+2+3），对应图片中的菜单效果
     *
     * @param player 目标玩家
     */
    public static void show(Player player) {
        player.sendMessage("§e[调试] 执行");
        CustomForm form = new CustomForm("§l主菜单");

        form.header("§6欢迎来到服务器")
                .divider()
                .spacer()

                // === 第一行：3个按钮 ===

                // 玩家操作：查看/管理玩家信息（踢人、封禁、查看资料等）
                .button("textures/items/iron_sword.png", p -> {
                    p.sendMessage("§a[菜单] §f你点击了「玩家操作」");
                    // TODO: 在这里添加玩家操作的逻辑
                })

                // 坐标点：查看/设置传送点、地标等
                .button("textures/items/iron_sword.png", p -> {
                    p.sendMessage("§a[菜单] §f你点击了「坐标点」");
                    // TODO: 在这里添加坐标点的逻辑
                })

                // 商店：服务器物品交易（购买/出售）
                .button("textures/items/iron_sword.png", p -> {
                    p.sendMessage("§a[菜单] §f你点击了「商店」");
                    // TODO: 在这里添加商店的逻辑
                })

                .spacer()

                // === 第二行：2个按钮 ===

                // 跨服：切换/传送到其他服务器
                .button("textures/items/iron_sword.png", p -> {
                    p.sendMessage("§a[菜单] §f你点击了「跨服」");
                    // TODO: 在这里添加跨服的逻辑
                })

                // 领地：管理个人领地（创建、权限设置等）
                .button("textures/items/iron_sword.png", p -> {
                    p.sendMessage("§a[菜单] §f你点击了「领地」");
                    // TODO: 在这里添加领地的逻辑
                })

                .spacer()

                // === 第三行：3个按钮 ===

                // 私信：玩家间私聊
                .button("textures/items/iron_sword.png", p -> {
                    p.sendMessage("§a[菜单] §f你点击了「私信」");
                    // TODO: 在这里添加私信的逻辑
                })

                // 给予我服务器菜单：管理员获取服务器管理功能
                .button("textures/items/iron_sword.png", p -> {
                    p.sendMessage("§a[菜单] §f你点击了「给予我服务器菜单」");
                    // TODO: 在这里添加服务器菜单的逻辑
                })

                // 其他功能：更多自定义功能的入口
                .button("textures/items/iron_sword.png", p -> {
                    p.sendMessage("§a[菜单] §f你点击了「其他功能」");
                    // TODO: 在这里添加其他功能的逻辑
                    // 示例：点击后打开一个二级菜单
                    // showSubMenu(p);
                })

                .spacer()
                .divider()
                .label("§7Powered by DDUI | Nukkit-MOT")
                .closeButton();
        player.sendMessage("§e[调试] 已执行完毕");
        form.show(player);
    }

    /**
     * 示例：MessageBox 确认弹窗
     * 可用于二次确认操作（如删除领地、购买物品等）
     *
     * @param player  目标玩家
     * @param title   弹窗标题
     * @param body    弹窗内容
     */
    public static void showConfirm(Player player, String title, String body) {
        MessageBox box = new MessageBox(title)
                .body(body)
                .button1("确认", p -> p.sendMessage("§a[确认] §f你选择了确认"))
                .button2("取消", p -> p.sendMessage("§e[取消] §f你选择了取消"));
        box.show(player);
    }
}