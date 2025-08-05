package com.etao.feimagesearch.capture.dynamic.bottom.album;

import android.util.SparseArray;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentLinkedDeque;
import tb.kge;

/* loaded from: classes3.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<ConcurrentLinkedDeque<SoftReference<View>>> f6537a = new SparseArray<>();

    static {
        kge.a(-1799432141);
    }

    private ConcurrentLinkedDeque<SoftReference<View>> b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentLinkedDeque) ipChange.ipc$dispatch("19ae6b73", new Object[]{this, new Integer(i)});
        }
        ConcurrentLinkedDeque<SoftReference<View>> concurrentLinkedDeque = this.f6537a.get(i);
        if (concurrentLinkedDeque != null) {
            return concurrentLinkedDeque;
        }
        ConcurrentLinkedDeque<SoftReference<View>> concurrentLinkedDeque2 = new ConcurrentLinkedDeque<>();
        this.f6537a.put(i, concurrentLinkedDeque2);
        return concurrentLinkedDeque2;
    }

    public View a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)});
        }
        try {
            return a(b(i));
        } catch (Exception unused) {
            return null;
        }
    }

    private View a(ConcurrentLinkedDeque<SoftReference<View>> concurrentLinkedDeque) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d6fd6a81", new Object[]{this, concurrentLinkedDeque});
        }
        if (concurrentLinkedDeque.isEmpty()) {
            return null;
        }
        View view = concurrentLinkedDeque.pop().get();
        return view == null ? a(concurrentLinkedDeque) : view;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f6537a.clear();
        }
    }
}
