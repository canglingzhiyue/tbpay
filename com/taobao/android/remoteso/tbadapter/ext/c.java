package com.taobao.android.remoteso.tbadapter.ext;

import android.app.Application;
import android.support.v4.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.Map;
import tb.ikk;
import tb.ikl;
import tb.ikq;
import tb.ikw;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : b();
    }

    public static /* synthetic */ void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{application});
        } else {
            c(application);
        }
    }

    public static /* synthetic */ void b(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5aaeb60", new Object[]{application, str});
        } else {
            c(application, str);
        }
    }

    public static String a(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c057bd3f", new Object[]{application, str});
        }
        try {
            String b = ikl.b(application, "SwallowsRemoteSoIndex", "index_updated_app_ver", "");
            String b2 = b();
            if (!b2.equalsIgnoreCase(b)) {
                RSoLog.c("config -> skip load index data, appVersion not matchappVerWithConfig=" + b + ",  currentAppVer=" + b2);
                return str;
            }
            String b3 = ikl.b(application, "SwallowsRemoteSoIndex", "key_remote_so_index_string", null);
            if (!ikw.a((CharSequence) b3) && !"empty".equalsIgnoreCase(b3)) {
                RSoLog.c("config ->  readCustomContent from orange, success.,  appVerWithConfig=" + b + ",  currentAppVer=" + b2);
                return b3;
            }
            RSoLog.c("config ->  skip load index data, it is empty");
            return str;
        } catch (Throwable th) {
            ikq.a("config -> load index data from remote", th);
            return str;
        }
    }

    public static void a(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        OrangeConfig.getInstance().registerListener(new String[]{"SwallowsRemoteSoSwitch", "SwallowsRemoteSoIndex"}, new com.taobao.orange.d() { // from class: com.taobao.android.remoteso.tbadapter.ext.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                } else if (map == null || Boolean.parseBoolean(map.get("fromCache"))) {
                    RSoLog.c("config ->  ignore this update, orange update from cache, this is useless. " + str);
                } else {
                    try {
                        String a2 = c.a();
                        RSoLog.c("config ->  update enter " + str + a2);
                        if ("SwallowsRemoteSoSwitch".equals(str)) {
                            c.b(application);
                        } else if (!"SwallowsRemoteSoIndex".equals(str)) {
                        } else {
                            c.b(application, a2);
                        }
                    } catch (Throwable th) {
                        ikq.a("config ->  updateLocalConfigs", th);
                    }
                }
            }
        }, true);
        Map<String, String> a2 = ikk.a("SwallowsRemoteSoSwitch");
        String a3 = ikk.a("SwallowsRemoteSoIndex", "");
        RSoLog.c("config ->  default config =" + a2 + "  ->  " + a3);
    }

    private static void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771ec6b5", new Object[]{application});
            return;
        }
        Map<String, String> a2 = ikk.a("SwallowsRemoteSoSwitch");
        ikl.a(application, "SwallowsRemoteSoSwitch", a2);
        RSoLog.c("config -> updated done. orange allKVs=" + a2);
    }

    private static void c(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df758d3f", new Object[]{application, str});
            return;
        }
        String a2 = ikk.a("SwallowsRemoteSoIndex", null);
        try {
            if (ikw.a((CharSequence) "empty", (CharSequence) a2)) {
                boolean a3 = a(application, "", "");
                RSoLog.c("config ->  updated done. index, reset custom & ver, succ=" + a3);
                return;
            }
            String string = JSON.parseObject(a2).getString("appVersion");
            if (!ikw.a((CharSequence) str, (CharSequence) string)) {
                ikq.a("config->index,version conflict", "currentAppVer=" + str + ", appVersion=" + string + ", custom=" + a2);
                a(application, "", "");
                return;
            }
            boolean a4 = a(application, a2, str);
            RSoLog.c("config ->  updated done. index, set appVersion=" + string + ", succ=" + a4);
        } catch (Throwable unused) {
            ikq.a("config->index,error", "currentAppVer=" + str + ", appVersion=unknown, custom=" + a2);
            a(application, "", "");
        }
    }

    private static boolean a(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ef60750f", new Object[]{application, str, str2})).booleanValue() : ikl.a(application, "SwallowsRemoteSoIndex", Arrays.asList(Pair.create("key_remote_so_index_string", str), Pair.create("index_updated_app_ver", str2)));
    }

    private static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : ikw.b((CharSequence) LauncherRuntime.e) ? LauncherRuntime.e : "_";
    }
}
