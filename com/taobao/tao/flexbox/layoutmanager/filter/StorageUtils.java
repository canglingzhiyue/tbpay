package com.taobao.tao.flexbox.layoutmanager.filter;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;
import tb.oec;
import tb.ogg;
import tb.ohh;

/* loaded from: classes8.dex */
public class StorageUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1034026084);
    }

    @FilterHandler(name = "get")
    public static Object get(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bb95e40f", new Object[]{str, obj});
        }
        Object b = ohh.b(str);
        return b == null ? obj : b;
    }

    @FilterHandler(name = "memoryget")
    public static Object memoryget(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2e4cc190", new Object[]{str, obj});
        }
        Object a2 = ohh.a(str);
        return a2 == null ? obj : a2;
    }

    @FilterHandler(name = "bool")
    public static boolean bool(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d159911b", new Object[]{str, obj})).booleanValue() : oec.a(get(str, obj), false);
    }

    @FilterHandler(name = "int")
    public static int Int(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88beecef", new Object[]{str, obj})).intValue() : oec.a(get(str, obj), 0);
    }

    public static Object a(String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f1cf6c6f", new Object[]{str, list});
        }
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case 102230:
                    if (str.equals("get")) {
                        c = 0;
                        break;
                    }
                    break;
                case 104431:
                    if (str.equals("int")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3029738:
                    if (str.equals("bool")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1726621365:
                    if (str.equals("memoryget")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                return get((String) list.get(0), list.get(1));
            }
            if (c == 1) {
                return memoryget((String) list.get(0), list.get(1));
            }
            if (c == 2) {
                return Boolean.valueOf(bool((String) list.get(0), list.get(1)));
            }
            return c != 3 ? "" : Integer.valueOf(Int((String) list.get(0), list.get(1)));
        } catch (Throwable th) {
            ogg.a("storage.filter", "error:" + str + th.getMessage());
            return "";
        }
    }
}
