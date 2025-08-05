package com.taobao.android.trade.event;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public final class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final List<m> e;

    /* renamed from: a  reason: collision with root package name */
    public Event f15625a;
    public p b;
    public c c;
    public m d;

    static {
        kge.a(1838101156);
        e = new ArrayList();
    }

    private m(Event event, p pVar, c cVar) {
        this.f15625a = event;
        this.b = pVar;
        this.c = cVar;
    }

    public static m a(p pVar, Event event, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("fb532dea", new Object[]{pVar, event, cVar});
        }
        synchronized (e) {
            int size = e.size();
            if (size > 0) {
                m remove = e.remove(size - 1);
                remove.f15625a = event;
                remove.b = pVar;
                remove.c = cVar;
                remove.d = null;
                return remove;
            }
            return new m(event, pVar, cVar);
        }
    }

    public static void a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7bd47d", new Object[]{mVar});
            return;
        }
        mVar.f15625a = null;
        mVar.b = null;
        mVar.c = null;
        mVar.d = null;
        synchronized (e) {
            if (e.size() < 10000) {
                e.add(mVar);
            }
        }
    }
}
