package com.taobao.taolive.uikit.favor;

import android.os.SystemClock;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class c implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SparseArray<a> f22020a = new SparseArray<>();
    private boolean b = false;
    private final Object[] c = new Object[0];

    /* loaded from: classes8.dex */
    public interface a {
        void drawFavor();
    }

    static {
        kge.a(-480860385);
        kge.a(-1390502639);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        while (this.b) {
            long uptimeMillis = SystemClock.uptimeMillis();
            synchronized (this.c) {
                for (int i = 0; i < this.f22020a.size(); i++) {
                    a valueAt = this.f22020a.valueAt(i);
                    if (valueAt != null) {
                        try {
                            valueAt.drawFavor();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 < 18) {
                try {
                    Thread.sleep(18 - uptimeMillis2);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f5b1de9", new Object[]{this, aVar});
            return;
        }
        synchronized (this.c) {
            this.f22020a.put(System.identityHashCode(aVar), aVar);
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bfb48ea", new Object[]{this, aVar});
            return;
        }
        synchronized (this.c) {
            this.f22020a.remove(System.identityHashCode(aVar));
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = true;
        }
    }
}
