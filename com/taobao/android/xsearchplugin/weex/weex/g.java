package com.taobao.android.xsearchplugin.weex.weex;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.weex.WXSDKInstance;
import java.util.HashSet;
import java.util.Iterator;
import tb.itv;
import tb.kge;

/* loaded from: classes6.dex */
public class g implements itv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashSet<WXSDKInstance> f16276a = new HashSet<>();

    static {
        kge.a(-1518732344);
        kge.a(-1610909010);
    }

    @Override // tb.itv
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.f16276a.add((WXSDKInstance) obj);
        }
    }

    @Override // tb.itv
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else {
            this.f16276a.remove(obj);
        }
    }

    @Override // tb.itv
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        k.e("WeexInstanceManager", "destroyWeexInstances");
        Iterator<WXSDKInstance> it = this.f16276a.iterator();
        while (it.hasNext()) {
            WXSDKInstance next = it.next();
            if (next == null) {
                k.a("WeexInstanceManager", "instance is null");
            } else if (next.P_()) {
                k.a("WeexInstanceManager", "instance is destroyed");
            } else {
                next.e();
                k.e("WeexInstanceManager", "destroy instance: " + next);
            }
        }
        this.f16276a.clear();
    }
}
