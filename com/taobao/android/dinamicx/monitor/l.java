package com.taobao.android.dinamicx.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.i;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.Iterator;
import java.util.Set;
import tb.kge;

/* loaded from: classes.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static l c;

    /* renamed from: a  reason: collision with root package name */
    private Set<Object> f11912a;
    private Set<Object> b;

    static {
        kge.a(-1096811287);
    }

    private l() {
    }

    public static l a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("e8f69815", new Object[0]);
        }
        if (c == null) {
            synchronized (l.class) {
                if (c == null) {
                    c = new l();
                }
            }
        }
        return c;
    }

    public void a(int i, String str, String str2, String str3, DXTemplateItem dXTemplateItem, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6371f5c", new Object[]{this, new Integer(i), str, str2, str3, dXTemplateItem, new Double(d)});
            return;
        }
        Set<Object> set = this.f11912a;
        if (set == null) {
            return;
        }
        Iterator<Object> it = set.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void a(s sVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1643945b", new Object[]{this, sVar, new Boolean(z)});
            return;
        }
        Set<Object> set = this.f11912a;
        if (set == null) {
            return;
        }
        Iterator<Object> it = set.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void a(i.a aVar, i.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2446d627", new Object[]{this, aVar, bVar});
            return;
        }
        Set<Object> set = this.b;
        if (set == null) {
            return;
        }
        Iterator<Object> it = set.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void a(i.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233db79b", new Object[]{this, aVar});
            return;
        }
        Set<Object> set = this.b;
        if (set == null) {
            return;
        }
        Iterator<Object> it = set.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
