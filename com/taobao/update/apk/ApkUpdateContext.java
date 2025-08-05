package com.taobao.update.apk;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.rgq;

/* loaded from: classes9.dex */
public class ApkUpdateContext extends com.taobao.update.framework.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String apkPath;
    public boolean background;
    public boolean hasNotified;
    public boolean isDownloadError;
    public MainUpdateData mainUpdate;
    public NotifyPolicy notifyPolicy = NotifyPolicy.DEFAULT;
    public Boolean exceedUpdateTimes = false;
    public NotifySource updateAlertSource = NotifySource.UPDATE;

    /* loaded from: classes9.dex */
    enum NotifyPolicy {
        DEFAULT,
        SCENCE
    }

    /* loaded from: classes9.dex */
    public enum NotifySource {
        UPDATE
    }

    static {
        kge.a(1071588112);
    }

    public boolean isForceUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ebe9f95", new Object[]{this})).booleanValue();
        }
        if (2 == this.mainUpdate.remindStrategy) {
            return true;
        }
        return 2 == rgq.getNetworkType() && 3 == this.mainUpdate.remindStrategy;
    }

    public boolean isSilentUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67c2b853", new Object[]{this})).booleanValue();
        }
        if (6 == this.mainUpdate.remindStrategy) {
            return true;
        }
        return 2 == rgq.getNetworkType() && (4 == this.mainUpdate.remindStrategy || 5 == this.mainUpdate.remindStrategy);
    }

    public boolean isDefaultUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("941cb1eb", new Object[]{this})).booleanValue();
        }
        if (2 != rgq.getNetworkType() && (3 == this.mainUpdate.remindStrategy || 5 == this.mainUpdate.remindStrategy)) {
            return true;
        }
        return 2 == rgq.getNetworkType() && 8 == this.mainUpdate.remindStrategy;
    }

    public boolean skipUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d86c5fb3", new Object[]{this})).booleanValue();
        }
        if (7 == this.mainUpdate.remindStrategy) {
            return true;
        }
        return 2 != rgq.getNetworkType() && (4 == this.mainUpdate.remindStrategy || 8 == this.mainUpdate.remindStrategy);
    }
}
