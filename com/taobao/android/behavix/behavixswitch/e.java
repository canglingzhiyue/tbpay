package com.taobao.android.behavix.behavixswitch;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.bhxbridge.BHXCXXInnerBridge;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import tb.dro;
import tb.kge;
import tb.kgo;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f9174a;
    private static Context b;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final e f9175a;

        static {
            kge.a(1163280995);
            f9175a = new e();
        }
    }

    public static /* synthetic */ Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[0]) : b;
    }

    static {
        kge.a(1338227088);
        f9174a = "__NULL__";
    }

    private e() {
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("c19a7f03", new Object[0]);
        }
        b = com.taobao.android.behavix.d.b();
        return b.f9175a;
    }

    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        String a2 = a.a(str, str2, str3);
        return StringUtils.equals(a2, f9174a) ? str3 : a2;
    }

    public void a(String str, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (map == null) {
            TLog.loge("BehaviX", "FakeOrangeConfig", "updateConfig lastestConfigs=null");
        } else {
            SharedPreferences a2 = a.a(str);
            HashMap hashMap = new HashMap();
            if (a2 != null) {
                SharedPreferences.Editor edit = a2.edit();
                edit.clear();
                for (String str3 : map.keySet()) {
                    if (!j.allOrangeNoNeedKeys.contains(str3) && (str2 = map.get(str3)) != null) {
                        edit.putString(str3, str2);
                        hashMap.put(str3, str2);
                    }
                }
                edit.apply();
            }
            BHXCXXInnerBridge.notifyOrangeUpdate(hashMap, false);
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
            TLog.loge("BehaviX", "FakeOrangeConfig", "updateConfig lastestConfigs=null");
        } else if (dro.e()) {
            SharedPreferences a2 = a.a(com.taobao.android.behavix.behavixswitch.a.INIT_FAST_GROUP_NAME);
            if (a2 == null) {
                return;
            }
            SharedPreferences.Editor edit = a2.edit();
            edit.clear();
            for (String str : j.f9178a) {
                if (map.containsKey(str)) {
                    edit.putString(str, map.get(str));
                }
            }
            edit.apply();
        } else {
            for (String str2 : j.f9178a) {
                a.c(com.taobao.android.behavix.behavixswitch.a.INIT_FAST_GROUP_NAME, str2, map.containsKey(str2) ? map.get(str2) : f9174a);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(473135521);
        }

        public static String a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3}) : d(str, str2, str3);
        }

        public static void c(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b40669c8", new Object[]{str, str2, str3});
            } else {
                f(str, str2, str3);
            }
        }

        public static SharedPreferences a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("551a7086", new Object[]{str});
            }
            Context b = e.b();
            if (b == null) {
                b = com.taobao.android.behavix.d.b();
            }
            if (b == null) {
                return null;
            }
            return kgo.a(b, str, 0);
        }

        private static String d(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bc28137", new Object[]{str, str2, str3});
            }
            SharedPreferences a2 = a(str);
            return a2 != null ? a2.getString(str2, str3) : str3;
        }

        private static void f(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e627d00b", new Object[]{str, str2, str3});
                return;
            }
            SharedPreferences a2 = a(str);
            if (a2 == null) {
                return;
            }
            SharedPreferences.Editor edit = a2.edit();
            edit.putString(str2, str3);
            edit.commit();
        }
    }
}
