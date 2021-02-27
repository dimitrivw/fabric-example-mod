package scarebarley.minecraft.mods;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.*;

public class HelloMod implements ModInitializer {

	public static final Item EMERALD_SWORD = new Item(new Item.Settings().group(ItemGroup.COMBAT));

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("scarebarleysmod", "emerald_sword"), EMERALD_SWORD);
	}
}
