package com.taobao.android.tracker.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.l;
import java.util.Map;
import tb.jjk;
import tb.kge;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENTID_19999 = 19999;

    static {
        kge.a(26729444);
    }

    public static void a(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        UTHitBuilders.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b903f76", new Object[]{str, new Integer(i), str2, str3, str4, map});
            return;
        }
        String a2 = a(str);
        if (i == 2001) {
            UTHitBuilders.b bVar = new UTHitBuilders.b(a2);
            bVar.setReferPage(str2);
            aVar = bVar;
        } else {
            aVar = i != 2101 ? null : new UTHitBuilders.UTControlHitBuilder(a2, str2);
        }
        if (aVar == null) {
            return;
        }
        aVar.setProperty(UTHitBuilders.a.FIELD_ARG2, str3);
        aVar.setProperty(UTHitBuilders.a.FIELD_ARG3, str4);
        aVar.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(aVar.build());
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : StringUtils.isEmpty(str) ? l.getInstance().getCurrentPageName() : str;
    }

    public static void a(jjk jjkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef7dffcd", new Object[]{jjkVar});
        } else if (jjkVar == null) {
        } else {
            int a2 = g.a(jjkVar.k);
            if (a2 == 20012101) {
                a(jjkVar.e, 2101, jjkVar.f, "", "", a.a(jjkVar.g, jjkVar.h));
                a(a.a(jjkVar.g, jjkVar.i));
            } else if (a2 == 2101) {
                a(jjkVar.e, a2, jjkVar.f, "", "", a.a(jjkVar.g, jjkVar.h));
            } else if (a2 != 2001) {
            } else {
                a(a.a(jjkVar.g, jjkVar.i));
            }
        }
    }
}
