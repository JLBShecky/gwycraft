package gwydion0917.gwycraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import cpw.mods.fml.common.IWorldGenerator;

    public class GwycraftWorldGenerator implements IWorldGenerator {
//    @Override
//    public void generate(Random random, int chunkX, int chunkZ, World world,
//            IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

    	// world.setBlock(x,y,z,ID)
//        for (int i = 0; i < 16; ++i) {
//            world.setBlock(chunkX*16 + random.nextInt(16), 100 + random.nextInt(16), chunkZ*16 + random.nextInt(16), ConfigGwycraft.blockGemOreID, i, 12);

//        }	
//    }
    
@Override
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
    switch(world.provider.dimensionId){
    case -1:
        generateNether(world, random, chunkX * 16, chunkZ * 16);
        break;
    case 0:
        generateSurface(world, random, chunkX * 16, chunkZ * 16);
        break;
    case 1:
        generateEnd(world, random, chunkX * 16, chunkZ * 16);
        break;
    default:
    	generateSurface(world, random, chunkX * 16, chunkZ * 16);
        break;
    }
}

private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
		for (int i = 0; i < 16; i++) {
			for (int k = 0; k < 8; k++) {
				int firstBlockXCoord = chunkX + rand.nextInt(16);
				int firstBlockYCoord = rand.nextInt(64);
				int firstBlockZCoord = chunkZ + rand.nextInt(16);
				(new WorldGenMinable(ConfigGwycraft.blockGemOreID, i, 4, Block.stone.blockID))
					.generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
			}
		}
	}

    private void generateNether(World world, Random rand, int chunkX, int chunkZ) {
    }
}