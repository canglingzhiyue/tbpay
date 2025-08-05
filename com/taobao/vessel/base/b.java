package com.taobao.vessel.base;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final b b;
    private static AtomicInteger c;

    /* renamed from: a  reason: collision with root package name */
    private Map<Object, VesselBaseView> f23447a = new HashMap();
    private Map<String, VesselBaseView> d = new HashMap();

    static {
        kge.a(-199902886);
        b = new b();
        c = new AtomicInteger(0);
    }

    public void a(Object obj, VesselBaseView vesselBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321d4019", new Object[]{this, obj, vesselBaseView});
        } else {
            this.f23447a.put(obj, vesselBaseView);
        }
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f408d793", new Object[0]) : b;
    }

    public void a(Object obj, Map<String, Object> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af358187", new Object[]{this, obj, map, aVar});
            return;
        }
        VesselBaseView vesselBaseView = this.f23447a.get(obj);
        if (vesselBaseView == null || vesselBaseView.mVesselViewCallback == null) {
            return;
        }
        vesselBaseView.mVesselViewCallback.a(map, aVar);
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (this.f23447a.get(obj) == null) {
        } else {
            this.f23447a.remove(obj);
        }
    }
}
