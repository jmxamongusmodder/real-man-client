package starter.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.Text;

@Mixin(ChatScreen.class)
public class ChatScreenMixin extends Screen
{
	@Shadow
	protected TextFieldWidget chatField;
	
	private ChatScreenMixin(Text text_1)
	{
		super(text_1);
	        chatField.setMaxLength(Integer.MAX_VALUE);
	}
}
