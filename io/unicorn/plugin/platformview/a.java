package io.unicorn.plugin.platformview;

import android.content.Context;
import io.unicorn.plugin.platform.g;
import java.util.HashMap;
import java.util.HashSet;
import tb.kge;

/* loaded from: classes9.dex */
public final class a extends g {
    public static final String INPUT = "input";

    static {
        kge.a(-626710541);
    }

    public static void b() {
    }

    @Override // io.unicorn.plugin.platform.g
    /* renamed from: b */
    public PlatformViewInput a(Context context, int i) {
        return new PlatformViewInput(context, i);
    }

    @Override // io.unicorn.plugin.platform.g
    /* renamed from: b */
    public PlatformViewInput a(Context context, int i, String str, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, HashSet<String> hashSet) {
        return new PlatformViewInput(context, i);
    }
}
