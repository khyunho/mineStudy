package org.minestudy;

import lombok.Getter;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

@Getter
public final class MineStudy extends JavaPlugin {

    private Logger log;
    private PluginDescriptionFile pdfFile;

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.log = getLogger();
        this.pdfFile = getDescription();

        this.log.info(pdfFile.getName() + " v" + pdfFile.getVersion() + " (이)가 활성화 되는 중 입니다.");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        this.log.info(pdfFile.getName() + " v" + pdfFile.getVersion() + " (이)가 활성화 되는 중 입니다.");
    }
}
