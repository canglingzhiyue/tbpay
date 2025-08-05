package com.alibaba.android.ultron.vfw.option;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.c;
import java.util.HashMap;
import java.util.Map;
import tb.bpd;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f2719a;
    private static final Map<String, Boolean> b;
    private static final Map<String, Boolean> c;

    /* renamed from: com.alibaba.android.ultron.vfw.option.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0101a {
        public static final String[] MODULE_KEYS;
        public static final String MODULE_KEY_EVENT_ASYNC_SOURCE = "asyncSource";

        static {
            kge.a(1816420221);
            MODULE_KEYS = new String[]{MODULE_KEY_EVENT_ASYNC_SOURCE};
        }
    }

    public static /* synthetic */ void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            b(map);
        }
    }

    static {
        kge.a(-1344753554);
        b = new HashMap();
        c = new HashMap();
        b.put(b("taobao_wallet_charge_others", C0101a.MODULE_KEY_EVENT_ASYNC_SOURCE), true);
    }

    private static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        return "ultron_" + str2 + "_" + str;
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return "ultron_" + str + "_";
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f2719a) {
        } else {
            Map<String, String> a2 = bpd.a("newUltron_container");
            bpd.a(new String[]{"newUltron_container"}, new c() { // from class: com.alibaba.android.ultron.vfw.option.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.c
                public void a(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20476513", new Object[]{this, str, map});
                    } else {
                        a.a(bpd.a("newUltron_container"));
                    }
                }
            });
            b(a2);
            f2719a = true;
        }
    }

    private static void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
            return;
        }
        c.clear();
        if (map == null || map.isEmpty()) {
            return;
        }
        for (String str : map.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                String[] strArr = C0101a.MODULE_KEYS;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (str.startsWith(a(strArr[i]))) {
                        c.put(str, Boolean.valueOf("true".equals(map.get(str))));
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String b2 = b(str, str2);
        Boolean bool = c.get(b2);
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = b.get(b2);
        if (bool2 == null) {
            return false;
        }
        return bool2.booleanValue();
    }
}
