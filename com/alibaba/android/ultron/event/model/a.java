package com.alibaba.android.ultron.event.model;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.vfw.instance.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f2605a;
    public Map<String, Object> b = new HashMap();

    static {
        kge.a(1414937724);
    }

    public a(b bVar) {
        this.f2605a = bVar;
    }

    public b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a2357d4f", new Object[]{this}) : this.f2605a;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.b.put(str, obj);
        }
    }

    public <T> T a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("17307540", new Object[]{this, str}) : (T) this.b.get(str);
    }
}
