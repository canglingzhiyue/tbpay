package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class a {
    public static final a c = new a();
    private static final Object d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f7360a = new AtomicBoolean(false);
    private final List<Activity> b = new ArrayList(1);

    public AtomicBoolean a() {
        return this.f7360a;
    }

    public void a(Activity activity) {
        synchronized (d) {
            for (Activity activity2 : this.b) {
                if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                    activity2.finish();
                }
            }
            this.b.add(activity);
        }
    }

    public void a(boolean z) {
        this.f7360a.set(z);
    }

    public void b(Activity activity) {
        synchronized (d) {
            this.b.remove(activity);
        }
    }
}
