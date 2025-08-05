package io.unicorn.embedding.engine;

import android.view.Surface;
import tb.kge;

/* loaded from: classes9.dex */
public class FlutterOverlaySurface {
    private final int id;
    private final Surface surface;

    static {
        kge.a(-404806044);
    }

    public FlutterOverlaySurface(int i, Surface surface) {
        this.id = i;
        this.surface = surface;
    }

    public int getId() {
        return this.id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
