package starter.objects;

public class EnchantingExample implements ModInitializer {
 
    private static Enchantment FROST = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("realmanclient", "frost"),
            new FrostEnchantment()
    );
 
    @Override
    public void onInitialize() {
 
    }
}