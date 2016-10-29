package james.monochrome.data.tiles;

import android.content.Context;
import android.view.MotionEvent;

import james.monochrome.data.PositionData;
import james.monochrome.utils.TileUtils;

public class BushTileData extends TileData {

    public BushTileData(Context context, PositionData position) {
        super(context, TileUtils.TILE_BUSH, position);
    }

    @Override
    public void onTouch(MotionEvent event) {
    }

    @Override
    public void onEnter() {
    }

    @Override
    public void onExit() {
    }

    @Override
    public boolean canEnter() {
        return false;
    }
}
