package com.alibaba.security.client.smart.core.track;

import android.content.Context;
import com.alibaba.security.client.smart.core.track.easy.EasyTracker;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class TrackManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ITrack mTrack;

    public static Executor getExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("64056156", new Object[0]);
        }
        if (mTrack != null) {
            return mTrack.getExecutor();
        }
        return EasyTracker.getInstance().getExecutor();
    }

    public static synchronized void init(Context context) {
        synchronized (TrackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{context});
            } else if (mTrack != null) {
                mTrack.init(context);
            } else {
                EasyTracker.getInstance().init(context);
            }
        }
    }

    public static synchronized void setTrack(ITrack iTrack) {
        synchronized (TrackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5a32f57", new Object[]{iTrack});
            } else {
                mTrack = iTrack;
            }
        }
    }

    public static synchronized void track(TrackLog trackLog) {
        synchronized (TrackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77eade78", new Object[]{trackLog});
            } else if (mTrack != null) {
                mTrack.trace(trackLog);
            } else {
                EasyTracker.getInstance().trace(trackLog);
            }
        }
    }

    public static synchronized void uploadOnce() {
        synchronized (TrackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54595ba9", new Object[0]);
            } else {
                EasyTracker.getInstance().doUploadOnce();
            }
        }
    }
}
