package com.taobao.search.musie.component.tbscroll;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0771a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, List<WeakReference<BounceScrollView>>> f19236a;
    private static final Map<String, Integer> b;

    /* renamed from: com.taobao.search.musie.component.tbscroll.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0771a {
        static {
            kge.a(10380175);
        }

        private C0771a() {
        }

        public /* synthetic */ C0771a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-1814833913);
        Companion = new C0771a(null);
        f19236a = new HashMap();
        b = new HashMap();
    }

    public final void a(String key, BounceScrollView view) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acbbc68f", new Object[]{this, key, view});
            return;
        }
        q.c(key, "key");
        q.c(view, "view");
        ArrayList arrayList = f19236a.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList();
            f19236a.put(key, arrayList);
        }
        arrayList.add(new WeakReference<>(view));
        Integer num = b.get(key);
        if (num == null || (intValue = num.intValue()) < 0) {
            return;
        }
        view.setInitScrollX(intValue);
    }

    public final void b(String key, BounceScrollView view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4bb24ee", new Object[]{this, key, view});
            return;
        }
        q.c(key, "key");
        q.c(view, "view");
        List<WeakReference<BounceScrollView>> list = f19236a.get(key);
        if (list == null) {
            return;
        }
        int size = list.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            if (q.a(list.get(i2).get(), view)) {
                i = i2;
            }
            if (i >= 0) {
                break;
            }
        }
        if (i >= 0) {
            list.remove(i);
        }
        if (!list.isEmpty()) {
            return;
        }
        b.put(key, -1);
    }

    public final void a(String key, BounceScrollView view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eabd7e54", new Object[]{this, key, view, new Integer(i)});
            return;
        }
        q.c(key, "key");
        q.c(view, "view");
        List<WeakReference<BounceScrollView>> list = f19236a.get(key);
        if (list != null) {
            for (WeakReference<BounceScrollView> weakReference : list) {
                BounceScrollView bounceScrollView = weakReference.get();
                if (bounceScrollView != null && (!q.a(view, bounceScrollView))) {
                    bounceScrollView.scrollTo(i, 0);
                }
            }
        }
        b.put(key, Integer.valueOf(i));
    }
}
