package org.spongepowered.spunbric.mod;

import com.google.inject.Inject;
import org.spongepowered.api.Game;
import org.spongepowered.api.GameState;
import org.spongepowered.api.SystemSubject;
import org.spongepowered.api.client.Client;
import org.spongepowered.api.scheduler.Scheduler;
import org.spongepowered.api.server.Server;
import org.spongepowered.spunbric.launch.FabricLaunch;

import java.nio.file.Path;

/*
 *  Fabric can have client instances of the game.
 *  The three abstract method should be overwritten accordingly.
 */
public abstract class AbstractFabricGame implements Game {
    @Inject
    protected AbstractFabricGame() {
    }

    @Override
    public abstract boolean isClientAvailable();

    /**
     * Fabric can run on both client and server. This is handled in the side specific game.
     */
    @Override
    public abstract Client getClient();

    @Override
    public abstract boolean isServerAvailable();

    @Override
    public GameState getState() {
        return null;
    }

    @Override
    public Scheduler getAsyncScheduler() {
        return null;
    }

    public Path getGameDirectory() {
        return FabricLaunch.getGameDir();
    }

    @Override
    public Server getServer() {
        return null;
    }

    @Override
    public SystemSubject getSystemSubject() {
        return null;
    }
}
