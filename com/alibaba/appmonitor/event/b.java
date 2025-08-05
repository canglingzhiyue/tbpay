package com.alibaba.appmonitor.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class b extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f2880a;
    public double b;

    static {
        kge.a(-2063406347);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -418211225) {
            super.fill((Object[]) objArr[0]);
            return null;
        } else if (hashCode == 1889499016) {
            return super.a();
        } else {
            if (hashCode != 2013839273) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.c((Long) objArr[0]);
            return null;
        }
    }

    public synchronized void a(double d, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e14d15", new Object[]{this, new Double(d), l});
            return;
        }
        this.b += d;
        this.f2880a++;
        super.c(l);
    }

    @Override // com.alibaba.appmonitor.event.d
    public synchronized JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject a2 = super.a();
        a2.put("count", (Object) Integer.valueOf(this.f2880a));
        a2.put("value", (Object) Double.valueOf(this.b));
        return a2;
    }

    @Override // com.alibaba.appmonitor.event.d, com.alibaba.appmonitor.pool.b
    public synchronized void fill(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
            return;
        }
        super.fill(objArr);
        this.b = mto.a.GEO_NOT_SUPPORT;
        this.f2880a = 0;
    }
}
