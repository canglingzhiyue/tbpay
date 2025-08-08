package com.taobao.tbugc.adapter;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.l;
import java.util.Map;
import tb.jmw;
import tb.kge;

/* loaded from: classes9.dex */
public class e implements jmw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f22284a;

    static {
        kge.a(-1724343698);
        kge.a(1282448663);
    }

    @Override // tb.jmw
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(this);
        }
    }

    @Override // tb.jmw
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
        }
    }

    @Override // tb.jmw
    public void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(obj, str);
        this.f22284a = str;
    }

    @Override // tb.jmw
    public void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{this, obj, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, map);
        }
    }

    @Override // tb.jmw
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.f22284a)) {
            this.f22284a = l.getInstance().getCurrentPageName();
        }
        return this.f22284a;
    }

    @Override // tb.jmw
    public void a(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d9201a", new Object[]{this, str, new Integer(i), obj, obj2, obj3, strArr});
        } else {
            TBS.Ext.commitEvent(str, i, obj, obj2, obj3, strArr);
        }
    }
}
