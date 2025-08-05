package com.taobao.android.live.plugin.atype.flexalocal.profile;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.phg;
import tb.poy;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1316473635);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, boolean z, String str, boolean z2, boolean z3, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b92d93", new Object[]{aVar, new Boolean(z), str, new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("followDegree", z ? "NORMAL" : "UNFOLLOW");
        String str2 = "1";
        hashMap.put("is_tag", z2 ? str2 : "0");
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("is_addAnchor", z3 ? str2 : "0");
        if (!z4) {
            str2 = "0";
        }
        hashMap.put("addType", str2);
        hashMap.put("sourceType", str);
        phg.a().a(aVar, "LayerThickness_MiniProfile", hashMap);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, boolean z, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68b8b117", new Object[]{aVar, new Boolean(z), new Long(j), str});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("followDegree", z ? "NORMAL" : "UNFOLLOW");
        hashMap.put("duration", String.valueOf(j));
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str);
        phg.a().a(aVar, "LayerThickness_MiniProfile_End", hashMap);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ec0dcd", new Object[]{aVar, str, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("follow_location", "miniprofile");
        hashMap.put("is_tag", z ? "1" : "0");
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str);
        phg.a().a(aVar, "AccountFollow", (Map<String, String>) hashMap);
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3d9d4e", new Object[]{aVar, str, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("is_tag", z ? "1" : "0");
        hashMap.put("sourceType", str);
        phg.a().a(aVar, "LayerThickness_MiniProfile_UnFollow", (Map<String, String>) hashMap);
    }

    public static void c(com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f50cdaa5", new Object[]{aVar, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str);
        phg.a().a(aVar, "LayerThickness_MiniProfile_HeadPortrait", (Map<String, String>) hashMap);
    }

    public static void f(com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca56cfc2", new Object[]{aVar, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str);
        phg.a().a(aVar, "LayerThickness_MiniProfile_Footer", (Map<String, String>) hashMap);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c22b103", new Object[]{aVar, str, str2, new Boolean(z)});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", str);
        hashMap.put("followDegree", z ? "NORMAL" : "UNFOLLOW");
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str2);
        phg.a().a(aVar, "LayerThickness_MiniProfile_GuideIcon", hashMap);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79dfff1", new Object[]{aVar, str, str2});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str);
        hashMap.put("dynamic_type", str2);
        hashMap.put("spm-url", poy.K(aVar));
        phg.a().a(aVar, "LayerThickness_MiniProfile_GuideCast", hashMap);
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d3f4290", new Object[]{aVar, str, str2});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("type", str);
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str2);
        phg.a().a(aVar, "LayerThickness_MiniProfile_FeedCard", hashMap);
    }

    public static void c(com.taobao.alilive.aliliveframework.frame.a aVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8f2ccf", new Object[]{aVar, str, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", "chatGroup");
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("followDegree", z ? "NORMAL" : "UNFOLLOW");
        hashMap.put("sourceType", str);
        phg.a().a(aVar, "LayerThickness_MiniProfile_GuideIcon", (Map<String, String>) hashMap);
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, boolean z, String str, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f532dc72", new Object[]{aVar, new Boolean(z), str, new Boolean(z2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("followDegree", z ? "NORMAL" : "UNFOLLOW");
        hashMap.put("is_tag", z2 ? "1" : "0");
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("sourceType", str);
        phg.a().a(aVar, "pageAnchor_Tag", (Map<String, String>) hashMap);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, boolean z, String str, HashMap<String, String> hashMap, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba74a3c", new Object[]{aVar, new Boolean(z), str, hashMap, str2});
            return;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        hashMap2.put("followDegree", z ? "NORMAL" : "UNFOLLOW");
        hashMap2.put("spm-cnt", "a2141.8001249");
        hashMap2.put("sourceType", str);
        hashMap2.put("spm-url", poy.K(aVar));
        phg.a().a(aVar, str2, hashMap2);
    }
}
