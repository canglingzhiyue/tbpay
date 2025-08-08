package com.taobao.taolive.movehighlight.utils;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import tb.ddw;
import tb.kge;
import tb.pfa;
import tb.pfb;
import tb.poy;
import tb.poz;
import tb.pqj;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f21479a;
    public static String b;
    public static String c;
    public static boolean d;

    static {
        kge.a(1235675823);
        f21479a = false;
        b = null;
        c = null;
        d = false;
    }

    public static void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, str, new Boolean(z)});
        } else {
            s.a(context, str, z);
        }
    }

    public static void a(String str, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef33b5d3", new Object[]{str, aVar});
            return;
        }
        String str2 = a.a(str) + "&" + aw.PARAM_FORCE_REFRESH + "=true&livesource=switchRoom";
        if (c.p()) {
            str2 = str2 + "&spm=a2141.8001249";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str2);
        hashMap.put("RePlaySignByhighlight", "true");
        o.a(aVar, "toPlaybackFromTimeMove", (String) null);
        if (pfb.a(aVar).l() == null) {
            return;
        }
        pfb.a(aVar).l().i(aVar, hashMap);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        String a2 = a.a(str);
        if (StringUtils.isEmpty(str4)) {
            return;
        }
        pfa a3 = pfa.a(com.taobao.taolive.room.utils.n.a());
        pfb a4 = pfb.a(com.taobao.taolive.room.utils.n.a());
        String str5 = a2 + "&" + aw.PARAM_FORCE_REFRESH + "=true&livesource=" + str4 + "&productType=timemove";
        if (!StringUtils.isEmpty(str2)) {
            str5 = str5 + "&" + aw.PARAM_SJSD_ITEM_ID + "=" + str2;
        }
        if (!StringUtils.isEmpty(str3)) {
            str5 = str5 + "&timeMovingSpfPlayVideo=" + Uri.encode(str3);
        }
        if (c.p()) {
            str5 = str5 + "&spm=a2141.8001249";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str5);
        if (a3.b() != null) {
            String a5 = a3.b().a();
            if (!StringUtils.isEmpty(a5)) {
                hashMap.put(aw.HIGHLIGHT_TRANSPARENT_PARAMS, a5);
            }
        }
        hashMap.put("highlightSignByRePlay", "true");
        if (a4.l() != null) {
            a4.l().i(com.taobao.taolive.room.utils.n.a(), hashMap);
            return;
        }
        com.taobao.alilive.aliliveframework.frame.a a6 = com.taobao.taolive.room.utils.n.a();
        String str6 = null;
        if (a6 != null) {
            str6 = a6.G();
        }
        ddw.a().a("com.taobao.taolive.room.mediaplatform_switch_room", hashMap, str6);
    }

    public static String a(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c472827d", new Object[]{liveItem});
        }
        String str = null;
        if (liveItem == null) {
            return null;
        }
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) pqj.a(liveItem.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class);
        if (timeMovingPlayInfo != null) {
            str = timeMovingPlayInfo.timeMovingM3u8Url;
        }
        return StringUtils.isEmpty(str) ? liveItem.extendVal.playUrl : str;
    }

    public static void a(HashMap<String, String> hashMap, Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7baf1208", new Object[]{hashMap, context, aVar});
            return;
        }
        pfa a2 = pfa.a(aVar);
        pfb a3 = pfb.a(aVar);
        if (a2.b() != null) {
            if (a3.l() != null) {
                a3.l().a(aVar);
            }
            com.taobao.taolive.sdk.core.g b2 = com.taobao.taolive.room.utils.n.b(aVar);
            if (b2 instanceof com.taobao.taolive.sdk.controller.e) {
                com.taobao.taolive.sdk.controller.e eVar = (com.taobao.taolive.sdk.controller.e) b2;
                a2.b().a(eVar);
                a2.b().a(eVar, context);
                b = RecModel.MEDIA_TYPE_TIMEMOVE;
                poy.a(0, aVar);
                String str = "switchTimemove";
                if ((aVar instanceof com.taobao.taolive.sdk.core.e) && c.w() && !StringUtils.isEmpty(eVar.q)) {
                    str = "switchTimemove." + eVar.q;
                }
                poz.L(str, eVar);
                if (c.p()) {
                    poz.a(o.c(aVar), eVar);
                } else if (c.o()) {
                    if (poy.af(aVar)) {
                        poz.a("a2141.23201685", eVar);
                    } else {
                        poz.a("a2141.8001249", eVar);
                    }
                }
                a2.b().a(eVar, context, "Page_TaobaoLiveWatch");
                a2.b().a(aVar, context);
                a2.b().b(eVar, context);
            }
        }
        if (a3.l() == null) {
            return;
        }
        a3.l().m(aVar, hashMap);
    }
}
