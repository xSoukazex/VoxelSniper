package com.thevoxelbox.voxelsniper.brush;

import com.thevoxelbox.voxelsniper.Message;
import com.thevoxelbox.voxelsniper.SnipeAction;
import com.thevoxelbox.voxelsniper.SnipeData;
import java.util.HashMap;
import java.util.List;
import org.bukkit.block.Block;

/**
 * Brush Interface.
 *
 */
public interface IBrush {

    /**
     * @param vm Message object
     */
    void info(Message vm);

    /**
     * Handles parameters passed to brushes.
     *
     * @param triggerHandle the handle that triggered this brush
     * @param params Array of string containing parameters
     * @param v Snipe Data
     */
    void parseParameters(String triggerHandle, String[] params, SnipeData v);

    boolean perform(SnipeAction action, SnipeData data, Block targetBlock, Block lastBlock);

    /**
     * @return The name of the Brush
     */
    String getName();

    /**
     * @param name New name for the Brush
     */
    void setName(String name);

    /**
     * @return The name of the category the brush is in.
     */
    String getBrushCategory();

    /**
     * @return Permission node required to use this brush
     */
    String getPermissionNode();
    
    /**
     * Registers the additional arguments for the tab completion
     * @param subcommandArguments the hashmap to store the subcommand arguments for this brush
     */
    void registerSubcommandArguments(HashMap<Integer, List<String>> subcommandArguments);
    
    /**
     * Registers the additional arguments for the tab completion
     * @param prefix the prefix that the nested argument belongs to
     * @param argumentValues the hashmap to store nested arguments
     */
    void registerArgumentValues(String prefix, HashMap<String, HashMap<Integer, List<String>>> argumentValues);
}
