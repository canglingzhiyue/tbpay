package com.taobao.taolive.room.ui.swipeback;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.ui.swipeback.SwipeBackLayout;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes8.dex */
public class c implements SwipeBackLayout.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Activity> f21733a;

    static {
        kge.a(-643138700);
        kge.a(1656246079);
    }

    public c(Activity activity) {
        this.f21733a = new WeakReference<>(activity);
    }

    @Override // com.taobao.taolive.room.ui.swipeback.SwipeBackLayout.a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        Activity activity = this.f21733a.get();
        if (activity == null) {
            return;
        }
        d.a(activity);
    }

    @Override // com.taobao.taolive.room.ui.swipeback.SwipeBackLayout.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Activity activity = this.f21733a.get();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }
}
