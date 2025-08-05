package com.huawei.hmf.tasks.a;

import android.app.Activity;
import android.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import tb.cxn;

/* loaded from: classes4.dex */
public final class g extends Fragment {
    private static final WeakHashMap<Activity, WeakReference<g>> b = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final List<WeakReference<cxn<?>>> f7311a = new ArrayList();

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        synchronized (this.f7311a) {
            for (WeakReference<cxn<?>> weakReference : this.f7311a) {
                cxn<?> cxnVar = weakReference.get();
                if (cxnVar != null) {
                    cxnVar.a();
                }
            }
            this.f7311a.clear();
        }
    }
}
