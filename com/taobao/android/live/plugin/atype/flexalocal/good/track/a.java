package com.taobao.android.live.plugin.atype.flexalocal.good.track;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.goodlist.l;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import tb.hit;
import tb.kge;
import tb.qna;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-872069979);
    }

    public static void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("165196b4", new Object[]{cVar, liveItem, str});
            return;
        }
        l j = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j();
        if (j == null || liveItem == null) {
            return;
        }
        HashMap<String, String> a2 = hit.a(cVar, liveItem);
        a2.put("item_position", str);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(liveItem.goodsIndex);
        a2.put("item_index", sb.toString());
        if (!StringUtils.isEmpty(qna.d(cVar))) {
            str2 = qna.d(cVar);
        }
        a2.put("glopenfrom", str2);
        j.a("detailclick", a2);
    }

    public static void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, LiveItem liveItem, boolean z, boolean z2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870ebeb4", new Object[]{cVar, liveItem, new Boolean(z), new Boolean(z2), str});
            return;
        }
        l j = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j();
        if (j == null || liveItem == null) {
            return;
        }
        HashMap<String, String> a2 = hit.a(cVar, liveItem);
        a2.put("item_position", str);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(liveItem.goodsIndex);
        a2.put("item_index", sb.toString());
        a2.put("button_type", z2 ? "cart" : "buy");
        a2.put("clickSource", liveItem.clickSource);
        if (z) {
            if (!StringUtils.isEmpty(qna.d(cVar))) {
                str2 = qna.d(cVar);
            }
            a2.put("glopenfrom", str2);
        }
        j.a("GoodsBuyClick", a2);
    }
}
