package org.spongepowered.mod;

import org.spongepowered.api.asset.Asset;
import org.spongepowered.api.asset.AssetManager;
import org.spongepowered.api.plugin.PluginContainer;

import java.util.Optional;

public class FabricAssetManager implements AssetManager {
    @Override
    public Optional<Asset> getAsset(PluginContainer plugin, String name) {
        return Optional.empty();
    }

    @Override
    public Optional<Asset> getAsset(String name) {
        return Optional.empty();
    }
}