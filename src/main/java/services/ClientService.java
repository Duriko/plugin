package services;

import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import org.bukkit.entity.Player;

public interface ClientService {
    void displayClaimBorder(final Player player, final ProtectedRegion region, final boolean childClaim);

    void resetClaimBorder(final Player player, final ProtectedRegion region);
}
