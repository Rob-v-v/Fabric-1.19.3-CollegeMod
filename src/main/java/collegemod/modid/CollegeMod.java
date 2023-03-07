package collegemod.modid;

import collegemod.modid.item.ModItemGroup;
import collegemod.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// very important comment
public class CollegeMod implements ModInitializer {
		public static final String MOD_ID = "collegemod";
		public static final Logger LOGGER = LoggerFactory.getLogger("collegemod");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}