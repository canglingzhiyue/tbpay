package com.alibaba.android.ultron.event.base;

import com.alibaba.android.ultron.event.g;
import com.alibaba.android.ultron.event.h;
import com.alibaba.android.ultron.event.i;
import com.alibaba.android.ultron.event.j;
import com.alibaba.android.ultron.event.k;
import com.alibaba.android.ultron.event.l;
import com.alibaba.android.ultron.event.m;
import com.alibaba.android.ultron.event.n;
import com.alibaba.android.ultron.event.o;
import com.alibaba.android.ultron.event.p;
import com.alibaba.android.ultron.event.r;
import com.alibaba.android.ultron.event.s;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.WeexPopContainer;
import java.util.HashMap;
import java.util.Map;
import tb.axn;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Class<? extends d>> f2584a;

    static {
        kge.a(1511061298);
        HashMap hashMap = new HashMap();
        f2584a = hashMap;
        hashMap.put("openUrl", p.class);
        f2584a.put("openUrlResult", o.class);
        f2584a.put("userTrack", s.class);
        f2584a.put("asyncRefresh", com.alibaba.android.ultron.event.b.class);
        f2584a.put("request", i.class);
        f2584a.put("toast", n.class);
        f2584a.put("popupSelect", g.class);
        f2584a.put(WeexPopContainer.PARAMS_SHOW_LOADING, l.class);
        f2584a.put("hide_loading", com.alibaba.android.ultron.event.f.class);
        f2584a.put("dismissPop", com.alibaba.android.ultron.event.d.class);
        f2584a.put("serverEvent", k.class);
        f2584a.put("adjustState", com.alibaba.android.ultron.event.a.class);
        f2584a.put(axn.EVENT_TYPE, j.class);
        f2584a.put("postMessage", h.class);
        f2584a.put("openPop", r.class);
        f2584a.put("textInputChanged", m.class);
        f2584a.put("hideKeyBoard", com.alibaba.android.ultron.event.e.class);
        f2584a.put("checkEmpty", com.alibaba.android.ultron.event.c.class);
    }

    public static Map<String, Class<? extends d>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : f2584a;
    }
}
