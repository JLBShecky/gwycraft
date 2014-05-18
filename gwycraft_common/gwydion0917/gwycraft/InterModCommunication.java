package gwydion0917.gwycraft;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.event.FMLInterModComms;

public class InterModCommunication {

	public static void initIMC()
	{
		// Forestry
		// Digger
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "digger@" + Gwycraft.blockDyedStoneCobble + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "digger@" + Gwycraft.glowyblockDyedStoneCobble + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "digger@" + Gwycraft.blockDyedSand + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "digger@" + Gwycraft.glowyblockDyedSand + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "digger@" + Gwycraft.itemDyedClay + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "digger@" + Gwycraft.itemDyedClayBricks + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "digger@" + Gwycraft.itemDyedMud + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "digger@" + Gwycraft.itemDyedMudBricks + ":*");
		
		// Builder
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.glowyWool + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.blockDyedStone + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.glowyblockDyedStone + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.blockDyedBrick + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.glowyblockDyedBrick + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.blockDyedClayblock + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.glowyblockDyedClayblock + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.blockDyedGlass + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.glowyblockDyedGlass + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.blockDyedMudBrick + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.glowyblockDyedMudBrick + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.blockDyedStoneBrick + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.glowyblockDyedStoneBrick + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.blockDyedFences + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.glowyblockDyedFences + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.blockDyedCobbleWalls + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.glowyblockDyedCobbleWalls + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.itemDyedSticks + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.blockDyedSandstone + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "builder@" + Gwycraft.glowyblockDyedSandstone + ":*");
		
		// Forester
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "forester@" + Gwycraft.blockDyedLeaf + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "forester@" + Gwycraft.glowyblockDyedLeaf + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "forester@" + Gwycraft.blockDyedLog1 + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "forester@" + Gwycraft.blockDyedLog2 + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "forester@" + Gwycraft.blockDyedLog3 + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "forester@" + Gwycraft.blockDyedLog4 + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "forester@" + Gwycraft.glowyblockDyedLog1 + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "forester@" + Gwycraft.glowyblockDyedLog2 + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "forester@" + Gwycraft.glowyblockDyedLog3 + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "forester@" + Gwycraft.glowyblockDyedLog4 + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "forester@" + Gwycraft.blockDyedPlank + ":*");
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "forester@" + Gwycraft.glowyblockDyedPlank + ":*");
		
		// Miner
		FMLInterModComms.sendMessage("Forestry", "add-backpack-items", "miner@" + Gwycraft.itemEnchantedGems + ":*");
		
		// End Forestry
		
		// Forge MultiPart
        // 16 Meta
        for (int i = 0; i < 16; i++) {
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyWool, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedStone, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedStone, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedBookcase, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedBookcase, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedPlank, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedPlank, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedBrick, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedBrick, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedClayblock, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedClayblock, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedGlass, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedGlass, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedLeaf, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedLeaf, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedMudBrick, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedMudBrick, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedSand, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedSand, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedSandstone, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedSandstone, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedStoneBrick, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedStoneBrick, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedStoneCobble, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedStoneCobble, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockGemCompressed, 1, i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockGemOre, 1, i));
            }
        // 8 Meta
        for (int i = 0; i < 8; i++) {

            }

        // 4 Meta
        for (int i = 0; i < 4; i++) {

            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedLog1,1,i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedLog2,1,i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedLog3,1,i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.glowyblockDyedLog4,1,i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedLog1,1,i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedLog2,1,i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedLog3,1,i));
            FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(Gwycraft.blockDyedLog4,1,i));
        }
	}
}