package com.taobao.android.nav;

import android.app.Activity;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, WeakReference<Activity>> f14458a;

    static {
        kge.a(1635882639);
        f14458a = new HashMap<>();
    }

    public void a(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18eae0da", new Object[]{this, activity, bundle});
        } else if (!(activity instanceof c)) {
        } else {
            String uniqueActivityCode = ((c) activity).uniqueActivityCode();
            if (f14458a.containsKey(uniqueActivityCode)) {
                Activity activity2 = f14458a.get(uniqueActivityCode).get();
                if (activity2 != null && !activity2.isFinishing()) {
                    activity2.finish();
                    String str = "finish unique activity " + activity2.toString();
                }
                String str2 = "remove unique " + uniqueActivityCode;
                f14458a.remove(uniqueActivityCode);
            }
            f14458a.put(uniqueActivityCode, new WeakReference<>(activity));
            String str3 = "add unique activity " + activity.toString();
        }
    }
}
