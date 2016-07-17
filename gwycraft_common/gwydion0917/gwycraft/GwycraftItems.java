package gwydion0917.gwycraft;

import net.minecraftforge.fml.common.registry.GameRegistry;
import gwydion0917.gwycraft.items.ItemDyedClay;
import gwydion0917.gwycraft.items.ItemDyedClayBricks;
import gwydion0917.gwycraft.items.ItemDyedMud;
import gwydion0917.gwycraft.items.ItemDyedMudBricks;
import gwydion0917.gwycraft.items.ItemDyedSticks;
import gwydion0917.gwycraft.items.ItemEnchantedGems;
import gwydion0917.gwycraft.items.ItemGemHatchet;
import gwydion0917.gwycraft.items.ItemGemHoe;
import gwydion0917.gwycraft.items.ItemGemPickaxe;
import gwydion0917.gwycraft.items.ItemGemShears;
import gwydion0917.gwycraft.items.ItemGemShovel;
import gwydion0917.gwycraft.items.ItemGemSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

public class GwycraftItems {

	public static Item itemEnchantedGems;
	public static Item itemDyedClay;
	public static Item itemDyedClayBricks;
	public static Item itemDyedMud;
	public static Item itemDyedMudBricks;
	public static Item itemDyedSticks;
	public static Item itemGemShears;
	public static Item itemGemHatchet;
	public static Item itemGemHoe;
	public static Item itemGemPickaxe;
	public static Item itemGemShovel;
	public static Item itemGemSword;

	public static ToolMaterial GWYCRAFT_MATERIAL = EnumHelper.addToolMaterial("GWYCRAFT_MATERIAL", 2, 500, 8.0F, 2.0F, 22);

	public static void init() {
		createItems();
		registerItems();
	}

	private static void createItems() {
		/*		
		itemEnchantedGems = new ItemEnchantedGems().setUnlocalizedName("Gwycraft:itemEnchantedGems").setCreativeTab(Gwycraft.tabs);
		itemDyedClay = new ItemDyedClay().setUnlocalizedName("Gwycraft:itemDyedClay").setCreativeTab(Gwycraft.tabs);
		itemDyedClayBricks = new ItemDyedClayBricks().setUnlocalizedName("Gwycraft:itemDyedClayBricks").setCreativeTab(Gwycraft.tabs);
		itemDyedMud = new ItemDyedMud().setUnlocalizedName("Gwycraft:itemMud").setCreativeTab(Gwycraft.tabs);
		itemDyedMudBricks = new ItemDyedMudBricks().setUnlocalizedName("Gwycraft:itemMudBricks").setCreativeTab(Gwycraft.tabs);
		itemDyedSticks = new ItemDyedSticks().setUnlocalizedName("Gwycraft:itemDyedSticks").setCreativeTab(Gwycraft.tabs);
		itemGemShears = new ItemGemShears().setUnlocalizedName("Gwycraft:gemshears").setCreativeTab(Gwycraft.tabs);
		itemGemHatchet = new ItemGemHatchet(GWYCRAFT_MATERIAL).setUnlocalizedName("Gwycraft:gemhatchet").setCreativeTab(Gwycraft.tabs);
		itemGemHoe = new ItemGemHoe(GWYCRAFT_MATERIAL).setUnlocalizedName("Gwycraft:gemhoe").setCreativeTab(Gwycraft.tabs);
		itemGemPickaxe = new ItemGemPickaxe(GWYCRAFT_MATERIAL).setUnlocalizedName("Gwycraft:gempickaxe").setCreativeTab(Gwycraft.tabs);
		itemGemShovel = new ItemGemShovel(GWYCRAFT_MATERIAL).setUnlocalizedName("Gwycraft:gemshovel").setCreativeTab(Gwycraft.tabs);
		itemGemSword = new ItemGemSword(GWYCRAFT_MATERIAL).setUnlocalizedName("Gwycraft:gemsword").setCreativeTab(Gwycraft.tabs);
		*/
	}

	private static void registerItems() {
		/*
		GameRegistry.registerItem(itemEnchantedGems, "itemEnchantedGems");
		GameRegistry.registerItem(itemDyedClay, "itemDyedClay");
		GameRegistry.registerItem(itemDyedClayBricks, "itemDyedClayBricks");
		GameRegistry.registerItem(itemDyedMud, "itemDyedMud");
		GameRegistry.registerItem(itemDyedMudBricks, "itemDyedMudBricks");
		GameRegistry.registerItem(itemDyedSticks, "itemDyedSticks");
		GameRegistry.registerItem(itemGemShears, "itemGemShears");
		GameRegistry.registerItem(itemGemHatchet, "itemGemHatchet");
		GameRegistry.registerItem(itemGemHoe, "itemGemHoe");
		GameRegistry.registerItem(itemGemPickaxe, "itemGemPickaxe");
		GameRegistry.registerItem(itemGemShovel, "itemGemShovel");
		GameRegistry.registerItem(itemGemSword, "itemGemSword");

		// Ore Dictionary
		OreDictionary.registerOre("gemGwycraft", new ItemStack(itemEnchantedGems, 1, OreDictionary.WILDCARD_VALUE));
		*/
	}

}
