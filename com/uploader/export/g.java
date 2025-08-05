package com.uploader.export;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes9.dex */
public interface g {
    boolean cancelAsync(i iVar);

    boolean cancelAsync(i iVar, int i);

    boolean continueAsync(i iVar);

    boolean getUnfinishedTasksAsync(String str, c cVar, Handler handler);

    boolean initialize(Context context, f fVar);

    boolean isInitialized();

    boolean pauseAsync(i iVar);

    boolean uploadAsync(i iVar, d dVar, Handler handler);

    boolean uploadAsync(i iVar, d dVar, Handler handler, boolean z);
}
