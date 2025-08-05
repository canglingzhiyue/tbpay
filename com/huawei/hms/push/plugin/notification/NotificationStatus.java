package com.huawei.hms.push.plugin.notification;

import android.app.Activity;
import android.content.IntentSender;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.client.Result;

/* loaded from: classes4.dex */
public class NotificationStatus extends Result {
    @Packed

    /* renamed from: a  reason: collision with root package name */
    private int f7531a = -1;

    public int getRetCode() {
        return this.f7531a;
    }

    public boolean hasResolution() {
        return getStatus() != null && getStatus().hasResolution();
    }

    public void setRetCode(int i) {
        this.f7531a = i;
    }

    public void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        if (getStatus() == null || !getStatus().hasResolution() || activity == null) {
            return;
        }
        getStatus().startResolutionForResult(activity, i);
    }
}
