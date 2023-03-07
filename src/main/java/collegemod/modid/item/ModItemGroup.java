package collegemod.modid.item;

import collegemod.modid.CollegeMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup RUBY;

    public static void registerItemGroups() {
        RUBY = FabricItemGroup.builder(new Identifier(CollegeMod.MOD_ID,"ruby"))
                .displayName(Text.translatable("itemgroup.ruby"))
                .icon(() -> new ItemStack(ModItems.RUBY)).build();
    }
}
