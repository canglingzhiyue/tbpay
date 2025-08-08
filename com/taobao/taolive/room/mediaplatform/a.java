package com.taobao.taolive.room.mediaplatform;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.common.GoodItem;
import com.taobao.taolive.room.utils.aq;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.q;
import com.taobao.taolive.room.utils.s;
import java.util.HashMap;
import tb.ddw;
import tb.kge;
import tb.pfa;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-349072911);
    }

    public static void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, str, new Boolean(z)});
            return;
        }
        aq.a("navToURL");
        s.a(context, str, z);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79908c52", new Object[]{context, str, str2, str3, str4, str5});
        } else {
            a(context, str, str2, str3, str4, str5, false);
        }
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5, boolean z) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b881b0c2", new Object[]{context, str, str2, str3, str4, str5, new Boolean(z)});
            return;
        }
        String str6 = "switchRoom";
        aq.a(str6);
        String a3 = com.taobao.taolive.room.utils.c.a(str);
        if (!StringUtils.isEmpty(str2)) {
            a3 = (a3 + "&timePointPlayUrl=" + str2) + "&forceRefresh=true";
            z2 = true;
        }
        if (z && !z2) {
            a3 = a3 + "&" + aw.PARAM_FORCE_REFRESH + "=true";
            z2 = true;
        }
        if (!StringUtils.isEmpty(str3)) {
            str6 = str3;
        }
        String str7 = a3 + "&livesource=" + str6;
        if (!StringUtils.isEmpty(str4) && (a2 = q.a(str4)) != null) {
            GoodItem goodItem = new GoodItem();
            goodItem.itemId = a2.getString("itemId");
            goodItem.itemImg = a2.getString("itemImg");
            goodItem.itemTitle = a2.getString("itemTitle");
            goodItem.itemUrl = a2.getString("itemUrl");
            goodItem.price = a2.getString("price");
            goodItem.itemH5TaokeUrl = a2.getString("itemH5TaokeUrl");
            goodItem.extendVal = a2.getString("extendVal");
            String jSONString = JSONObject.toJSONString(goodItem);
            str7 = str7 + "&bubbleGoodInfoJson=" + Uri.encode(jSONString);
            if (!StringUtils.isEmpty(goodItem.itemId)) {
                str7 = str7 + "&sjsdItemId=" + goodItem.itemId + "&productType=timemove";
                if (!z2) {
                    str7 = str7 + "&forceRefresh=true";
                }
            }
        }
        if (!StringUtils.isEmpty(str5)) {
            str7 = str7 + "&timeMovingSpfPlayVideo=" + Uri.encode(str5);
        }
        if (com.taobao.taolive.movehighlight.utils.c.p()) {
            str7 = str7 + "&spm=a2141.8001249";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str7);
        if (pfa.a(n.a()).b() != null) {
            String a4 = pfa.a(n.a()).b().a();
            if (!StringUtils.isEmpty(a4)) {
                hashMap.put(aw.HIGHLIGHT_TRANSPARENT_PARAMS, a4);
            }
        }
        ddw.a().a("com.taobao.taolive.room.mediaplatform_switch_room", hashMap, n.c());
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        aq.a("closeRoom");
        ddw.a().a("com.taobao.taolive.room.mediaplatform_close_room", null, n.c());
    }
}
