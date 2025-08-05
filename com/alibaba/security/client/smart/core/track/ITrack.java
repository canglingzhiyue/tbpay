package com.alibaba.security.client.smart.core.track;

import android.content.Context;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public interface ITrack {
    Executor getExecutor();

    void init(Context context);

    void trace(TrackLog trackLog);
}
