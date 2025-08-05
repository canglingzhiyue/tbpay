package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.akt;

/* loaded from: classes3.dex */
public final class Ib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Ib> f3248a = new HashMap();
    public Boolean b = null;

    public static synchronized Ib a(String str) {
        synchronized (Ib.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Ib) ipChange.ipc$dispatch("69eb096f", new Object[]{str});
            }
            Ib ib = f3248a.get(str);
            if (ib == null) {
                ib = new Ib();
                f3248a.put(str, ib);
            }
            return ib;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return Kb.b().q();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : akt.a() == 2;
    }

    public void a(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
        } else {
            this.b = bool;
        }
    }
}
