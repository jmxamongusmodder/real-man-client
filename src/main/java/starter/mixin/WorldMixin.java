package starter.mixin;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.chunk.BlockEntityTickInvoker;

@Mixin(World.class)
public abstract class WorldMixin {
	@Shadow
	@Final
	protected List<BlockEntityTickInvoker> blockEntityTickers;
	
	@Inject(at = {@At("HEAD")},
		method = {"getRainGradient(F)F"},
		cancellable = true)
	@Override
	public float getSkyAngle(float tickDelta)
	{
		return getDimension().getSkyAngle(timeOfDay);
	}
	
	@Override
	public int getMoonPhase()
	{
		return getDimension().getMoonPhase(getLunarTime());
	}
	
	@Override
	public List<BlockEntityTickInvoker> getBlockEntityTickers()
	{
		return blockEntityTickers;
	}
}
