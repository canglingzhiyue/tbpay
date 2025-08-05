package org.android.spdy;

import android.content.Context;

/* loaded from: classes.dex */
public interface QuicCacher {
    void init(Context context);

    byte[] load(String str);

    void remove(String str);

    boolean store(String str, String str2);
}
