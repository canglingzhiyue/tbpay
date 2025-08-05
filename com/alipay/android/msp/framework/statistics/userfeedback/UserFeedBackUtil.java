package com.alipay.android.msp.framework.statistics.userfeedback;

import android.app.Activity;
import android.os.Bundle;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class UserFeedBackUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static UserFeedBackUtil f4850a;

    public static void setFeedBackbyGuessHasShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4b0fbd", new Object[]{new Boolean(z)});
        }
    }

    public void registerScreenShotObserver(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4360e58", new Object[]{this, activity});
        }
    }

    public void setUserFeedBackTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9920b9", new Object[]{this, str});
        }
    }

    public void setUserFeedBackTagByWindowFrame(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95cc10b", new Object[]{this, mspWindowFrame});
        }
    }

    public void showGuideDialog(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f71bce6", new Object[]{this, bundle});
        }
    }

    public void unregisterContentObserver(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b74f16c", new Object[]{this, activity});
        }
    }

    private UserFeedBackUtil() {
    }

    public static UserFeedBackUtil getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserFeedBackUtil) ipChange.ipc$dispatch("add52331", new Object[0]);
        }
        if (f4850a == null) {
            f4850a = new UserFeedBackUtil();
        }
        return f4850a;
    }
}
