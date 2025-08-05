package com.alipay.mobile.verifyidentity.ui.helper;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class DialogActivityHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile DialogActivityHelper b;

    /* renamed from: a  reason: collision with root package name */
    private Activity f6092a;

    private DialogActivityHelper() {
    }

    public static DialogActivityHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogActivityHelper) ipChange.ipc$dispatch("d363e7b6", new Object[0]);
        }
        if (b == null) {
            synchronized (DialogActivityHelper.class) {
                if (b == null) {
                    b = new DialogActivityHelper();
                }
            }
        }
        return b;
    }

    public void updateDialogActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9490239", new Object[]{this, activity});
        } else {
            this.f6092a = activity;
        }
    }

    public WeakReference<Activity> getDialogActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("c361d642", new Object[]{this}) : new WeakReference<>(this.f6092a);
    }
}
