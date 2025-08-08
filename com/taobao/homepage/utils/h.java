package com.taobao.homepage.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.c;
import com.taobao.android.task.Coordinator;
import com.taobao.monitor.procedure.s;
import java.util.Map;
import tb.bga;
import tb.kge;

/* loaded from: classes7.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1565452692);
    }

    public static void a(Object obj, Map<String, Object> map, NewRangerOptions newRangerOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998e9e9b", new Object[]{obj, map, newRangerOptions});
            return;
        }
        if (newRangerOptions == null) {
            try {
                newRangerOptions = new NewRangerOptions();
            } catch (Throwable unused) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject(map);
        String string = jSONObject.getString("rangerBucketsAlias");
        if (!StringUtils.isEmpty(string)) {
            newRangerOptions.rangerBucketsAlias = string;
        }
        String string2 = jSONObject.getString("trackGroup");
        if (!StringUtils.isEmpty(string2)) {
            newRangerOptions.trackGroup = string2;
        }
        String string3 = jSONObject.getString("bizName");
        if (!StringUtils.isEmpty(string3) && !"ranger".equals(string3)) {
            newRangerOptions.bizName = string3;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("commonParams");
        if (jSONObject2 != null) {
            newRangerOptions.commParams = jSONObject2;
        }
        String string4 = jSONObject.getString("ranger_buckets");
        if (StringUtils.isEmpty(string4)) {
            return;
        }
        g.a().a(obj, string4, newRangerOptions);
        a(string4);
        s.f18233a.d().a("home_ranger_buckets", string4);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            bga.c.a("HomePlatform", b());
        }
    }

    private static void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.homepage.utils.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.a.b("home_um_ab", "rangerBuckets", str);
                    }
                }
            });
        }
    }

    private static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : c.a.a("home_um_ab", "rangerBuckets", "");
    }
}
