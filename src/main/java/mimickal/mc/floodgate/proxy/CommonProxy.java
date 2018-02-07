package mimickal.mc.floodgate.proxy;

import mimickal.mc.floodgate.FloodgateMod;
import mimickal.mc.floodgate.TileEntityFloodgate;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void init() {
        // Noop on server
    }

    public void registerItemRenderer(Item item, int meta, String id) {
        // Noop on server
    }

    public void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntityFloodgate.class, FloodgateMod.MOD_ID + ":floodgate");
    }

}