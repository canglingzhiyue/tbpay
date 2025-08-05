package com.taobao.android.testutils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.i;
import com.taobao.android.behavix.d;
import com.taobao.android.ucp.util.c;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;
import tb.nkr;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DebugUtil";

    static {
        kge.a(1493062770);
    }

    public static /* synthetic */ void c(String str, String str2, String str3, String str4, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98a93b3", new Object[]{str, str2, str3, str4, map});
        } else {
            f(str, str2, str3, str4, map);
        }
    }

    /* renamed from: com.taobao.android.testutils.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0599a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static Boolean f15516a;
        private static Map<String, String> b;
        private static String c;

        static {
            kge.a(1654383052);
        }

        public static /* synthetic */ Map b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]) : b;
        }

        public static void a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
            } else {
                a("logDebugCacheTime", "logDebugCacheParam", str, z);
            }
        }

        public static void a(String str, String str2, String str3, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0bfeb4e", new Object[]{str, str2, str3, new Boolean(z)});
                return;
            }
            b = (Map) JSONObject.parseObject(str3, new TypeReference<Map<String, String>>() { // from class: com.taobao.android.testutils.a.a.1
            }, new Feature[0]);
            a(true);
            a(str, str2, true, str3);
        }

        public static void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            } else {
                f15516a = Boolean.valueOf(z);
            }
        }

        public static boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a("logDebugCacheTime", "logDebugCacheParam", TimeUnit.HOURS, 4L);
        }

        public static boolean a(String str, String str2, TimeUnit timeUnit, long j) {
            long b2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c413f0c", new Object[]{str, str2, timeUnit, new Long(j)})).booleanValue();
            }
            if (f15516a == null) {
                try {
                    b2 = com.taobao.android.behavix.utils.a.c().b(str, 0L);
                } catch (Exception unused) {
                }
                if (b2 == 0) {
                    return false;
                }
                if (System.currentTimeMillis() - b2 < timeUnit.toMillis(j)) {
                    a(str, str2, com.taobao.android.behavix.utils.a.c().a(str2), false);
                }
                f15516a = Boolean.valueOf(Boolean.TRUE.equals(f15516a));
            }
            return f15516a.booleanValue();
        }

        private static void a(String str, String str2, boolean z, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36b578a2", new Object[]{str, str2, new Boolean(z), str3});
                return;
            }
            com.taobao.android.behavix.utils.a.c().a(str, z ? System.currentTimeMillis() : 0L);
            com.taobao.android.behavix.utils.a.c().a(str2, str3);
        }

        public static void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
                return;
            }
            c = str;
            a("logLevelCacheTime", "defalutCachedLogLevel", true, str);
        }
    }

    public static void a(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3d74f5", new Object[]{str, str2, str3, str4, map});
        } else if (!C0599a.a()) {
        } else {
            e(str, str2, str3, str4, map);
        }
    }

    private static void e(final String str, final String str2, final String str3, final String str4, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d7b271", new Object[]{str, str2, str3, str4, map});
        } else {
            nkr.a(new i.a() { // from class: com.taobao.android.testutils.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.behavix.utils.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        a.c(str, str2, str3, str4, map);
                    }
                }
            });
        }
    }

    private static void f(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fe41d0", new Object[]{str, str2, str3, str4, map});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.cttp.mi.logs.upload");
        mtopRequest.setVersion("2.0");
        mtopRequest.setNeedEcode(false);
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            jSONObject.putAll(map);
        }
        jSONObject.put("timestamp", (Object) Long.valueOf(com.taobao.android.ucp.util.b.a()));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("arg1", (Object) str);
        jSONObject2.put("arg2", (Object) str2);
        jSONObject2.put("arg3", (Object) str3);
        jSONObject2.put("args", (Object) str4);
        jSONObject.put(PopConst.POP_UPLOAD_DATA_KEY, (Object) jSONObject2.toString());
        mtopRequest.setData(jSONObject.toString());
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, d.d());
        build.mo1305reqMethod(MethodEnum.POST);
        build.startRequest();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!C0599a.a()) {
        } else {
            a("uploadDB", "", "", c.a().b(), C0599a.b());
        }
    }

    public static void b(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba640454", new Object[]{str, str2, str3, str4, map});
        } else {
            a(str, str2, str3, str4, map);
        }
    }

    public static void d(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b12312", new Object[]{str, str2, str3, str4, map});
        } else if (!C0599a.a()) {
        } else {
            if (map == null) {
                map = new HashMap<>();
            }
            map.putAll(C0599a.b());
            e(str, str2, str3, str4, map);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else if (C0599a.b() == null && !C0599a.a()) {
        } else {
            HashMap hashMap = new HashMap(C0599a.b());
            hashMap.put("uploadSource", "log");
            a(str, str2, str3, str4, hashMap);
        }
    }
}
