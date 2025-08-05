package com.taobao.android.detail.core.performance;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.eps;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<Integer, Long> f9784a;

    static {
        kge.a(-1549236255);
        f9784a = new HashMap();
    }

    public c() {
        emu.a("com.taobao.android.detail.core.performance.DetailComponentPreload");
    }

    public void a(String str, Map<String, Object> map, View view, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("897612f1", new Object[]{this, str, map, view, activity});
        } else if ((!"detailRecommend".equals(str) && !"detail3ShopRelation".equals(str)) || map == null) {
        } else {
            if (JSON.toJSONString(map).contains("${")) {
                f9784a.put(Integer.valueOf(view.hashCode()), Long.valueOf(System.currentTimeMillis()));
                com.taobao.android.detail.core.utils.i.d(m.a("DetailComponentPreload"), "detailRecommend_async rend with template data");
                return;
            }
            com.taobao.android.detail.core.utils.i.d(m.a("DetailComponentPreload"), "detailRecommend_async rend with real data");
            Long l = f9784a.get(Integer.valueOf(view.hashCode()));
            if (l != null && l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis() - l.longValue();
                Context context = view.getContext();
                eps.a(context, "Page_Detail", 19999, "shop_recommend_rendering", "" + currentTimeMillis, null, new String[0]);
                String a2 = m.a("DetailComponentPreload");
                com.taobao.android.detail.core.utils.i.d(a2, "detailRecommend_async timeRequestSpent : " + currentTimeMillis);
                f9784a.remove(Integer.valueOf(view.hashCode()));
                return;
            }
            eps.a(view.getContext(), "Page_Detail", 19999, "shop_recommend_rendered", null, null, new String[0]);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            f9784a.clear();
        }
    }
}
