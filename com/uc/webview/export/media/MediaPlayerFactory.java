package com.uc.webview.export.media;

import android.content.Context;

/* loaded from: classes9.dex */
public abstract class MediaPlayerFactory {
    public abstract MediaPlayer create(int i, Context context, String str, boolean z, boolean z2, String str2);

    public abstract MediaController createMediaController(int i, Context context, Object obj);

    public abstract void init(Context context, Settings settings, String str);

    public void onUploadStatistics(String str, String str2) {
    }

    public abstract boolean valid();
}
