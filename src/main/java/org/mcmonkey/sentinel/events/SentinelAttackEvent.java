package org.mcmonkey.sentinel.events;

import net.citizensnpcs.api.event.NPCEvent;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Event fired when a Sentinel NPC is going to attack.
 */
public class SentinelAttackEvent extends NPCEvent implements Cancellable {

    /**
     * Handler objects, for Bukkit internal usage.
     */
    private static final HandlerList handlers = new HandlerList();

    /**
     * Whether the event is cancelled.
     */
    private boolean cancelled = false;

    private Entity targetEntity;

    /**
     * Constructs the attack event.
     */
    public SentinelAttackEvent(NPC npc, Entity targetEntity) {
        super(npc);
        this.targetEntity = targetEntity;
    }

    /**
     * Returns the handler list for use with Bukkit.
     */
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * Returns the handler list for use with Bukkit.
     */
    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * Returns whether the event is cancelled.
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Sets whether the event is cancelled.
     */
    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * Returns the
     * @return Entity targetted by this NPC
     */
    public Entity getTargetEntity() {
        return targetEntity;
    }
}
