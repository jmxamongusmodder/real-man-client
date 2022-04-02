package starter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.lwjgl.glfw.GLFW;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.client.util.InputUtil;

public class StarterMod implements ModInitializer {

	public static final String VERSION = "7.22";
	public static final String MC_VERSION = "1.18.2";

  @Override
  public void onInitialize() {
       System.out.println("The world of real man has loaded! enjoy your stay!");
  }
}