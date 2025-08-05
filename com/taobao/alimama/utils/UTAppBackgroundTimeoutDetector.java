package com.taobao.alimama.utils;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cew;
import tb.kge;
import tb.rqi;

/* loaded from: classes4.dex */
public class UTAppBackgroundTimeoutDetector implements rqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static UTAppBackgroundTimeoutDetector sInstance;
    private boolean mShouldRewriteTpkCache = true;
    private long mSwitchBackgroundTimestamp;

    @Override // tb.rqi
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.rqi
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.rqi
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    static {
        kge.a(1713325777);
        kge.a(-90889597);
        sInstance = null;
    }

    public static UTAppBackgroundTimeoutDetector getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTAppBackgroundTimeoutDetector) ipChange.ipc$dispatch("5e733492", new Object[0]);
        }
        if (sInstance == null) {
            sInstance = new UTAppBackgroundTimeoutDetector();
        }
        return sInstance;
    }

    @Override // tb.rqi
    public void onSwitchBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74060788", new Object[]{this});
        } else {
            this.mSwitchBackgroundTimestamp = SystemClock.elapsedRealtime();
        }
    }

    public boolean shouldRewriteTpkCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fd5b3957", new Object[]{this})).booleanValue() : this.mShouldRewriteTpkCache;
    }

    public void setShouldRewriteTpkCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf965e3", new Object[]{this, new Boolean(z)});
        } else {
            this.mShouldRewriteTpkCache = z;
        }
    }

    @Override // tb.rqi
    public void onSwitchForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
            return;
        }
        if (0 != this.mSwitchBackgroundTimestamp && SystemClock.elapsedRealtime() - this.mSwitchBackgroundTimestamp > cew.a.CONFIG_TRACK_1022_INTERVAL_TIME) {
            this.mShouldRewriteTpkCache = true;
        }
        this.mSwitchBackgroundTimestamp = 0L;
    }
}
