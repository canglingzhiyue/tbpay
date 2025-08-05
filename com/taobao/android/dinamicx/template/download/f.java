package com.taobao.android.dinamicx.template.download;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.fqi;
import tb.kge;

/* loaded from: classes.dex */
public class f implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f11934a;
    public Map<String, String> b;

    static {
        kge.a(2090653377);
        kge.a(-723128125);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : a();
    }

    public f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("19c8de18", new Object[]{this});
        }
        f fVar = new f();
        fVar.f11934a = this.f11934a;
        fVar.b = this.b;
        return fVar;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (fqi.bi()) {
            this.b = new ConcurrentHashMap();
        } else {
            this.b = new HashMap();
        }
    }
}
