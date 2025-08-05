package com.taobao.themis.inside;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COMPLETE_INITED = 2;
    public static final int INITIALIZING = 0;
    public static final int NECESSARY_INITED = 1;

    /* renamed from: a  reason: collision with root package name */
    private static volatile List<Object> f22481a;
    private static volatile AtomicInteger b;

    static {
        kge.a(-909147388);
        f22481a = new ArrayList();
        b = new AtomicInteger(0);
    }

    public static synchronized void a() {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
                return;
            }
            if (b.get() == 0) {
                b.set(1);
                Iterator<Object> it = f22481a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    public static synchronized void b() {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
                return;
            }
            if (b.get() == 1) {
                b.set(2);
                Iterator<Object> it = f22481a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
