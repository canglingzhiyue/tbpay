package com.taobao.android.weex_framework.module;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.util.g;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import tb.jvb;
import tb.jvc;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile ConcurrentMap<String, b> f15997a;
    private static Map<String, MUSModule> b;

    static {
        kge.a(-1061188163);
        f15997a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
    }

    public static boolean a(String str, Class<? extends MUSModule> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7af6b54f", new Object[]{str, cls})).booleanValue() : a(str, cls, false);
    }

    public static boolean a(String str, Class<? extends MUSModule> cls, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e3e0a6ed", new Object[]{str, cls, new Boolean(z)})).booleanValue() : a(str, new c(cls), z);
    }

    public static boolean a(String str, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1811f52", new Object[]{str, bVar, new Boolean(z)})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && bVar != null) {
            if (f15997a != null && f15997a.containsKey(str)) {
                g.c("register module twice,Module name is  " + str);
            }
            try {
                f15997a.put(str, bVar);
                if (z) {
                    try {
                        b.put(str, bVar.a(str, null));
                    } catch (Exception e) {
                        g.c(str + " class must have a default constructor without any parameters.", e);
                    }
                }
                return true;
            } catch (Exception e2) {
                g.c("register module ", e2);
            }
        }
        return false;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : f15997a.containsKey(str);
    }

    public static Object a(jvb jvbVar, String str, String str2, MUSValue[] mUSValueArr, jvc jvcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1e53c46d", new Object[]{jvbVar, str, str2, mUSValueArr, jvcVar});
        }
        if (!a(str)) {
            if (l.a().k() == null) {
                return null;
            }
            return l.a().k().a(str, str2, mUSValueArr, jvbVar);
        }
        b bVar = f15997a.get(str);
        MUSModule a2 = a(jvbVar, str, bVar);
        if (a2 == null) {
            g.c("[MUSModuleManager] callModuleMethod " + str + " is not registered");
            return null;
        } else if (a2.isGenerated()) {
            try {
                return a2.dispatchMethod(str2, mUSValueArr, jvbVar.getExecuteContext());
            } catch (Exception e) {
                g.a("[Module]", "callModuleMethod " + str + "#" + str2 + "() error", e, "Module: " + str + "<" + a2.getClass().getSimpleName() + "> 调用报错, 查看adb log修复");
                return null;
            }
        } else if (bVar.a(str2) == null) {
            g.c("[MUSModuleManager] callModuleMethod " + str + "#" + str2 + "() is not defined");
            return null;
        } else {
            try {
                return jvcVar.a(a2, bVar.a(str2), mUSValueArr);
            } catch (Exception e2) {
                g.a("[Module]", "callModuleMethod " + str + "#" + str2 + "() error", e2, "Module: " + str + "<" + a2.getClass().getSimpleName() + "> 调用报错, 查看adb log修复");
                return null;
            }
        }
    }

    private static MUSModule a(jvb jvbVar, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSModule) ipChange.ipc$dispatch("7914b5d5", new Object[]{jvbVar, str, bVar});
        }
        MUSModule mUSModule = b.get(str);
        if (mUSModule != null) {
            return mUSModule;
        }
        MUSModule module = jvbVar.getModule(str);
        if (module == null) {
            try {
                module = bVar.a(str, jvbVar);
                jvbVar.addModule(str, module);
            } catch (Exception e) {
                g.a("[Module]", str + " module build instance failed.", e, "Module: " + str + " 构造报错, 查看adb log修复");
                return null;
            }
        }
        return module;
    }

    public static WeexValue c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("66560430", new Object[]{str});
        }
        b bVar = f15997a.get(str);
        if (bVar == null) {
            return WeexValueImpl.ofUndefined();
        }
        try {
            return WeexValueImpl.ofJSONArray(JSONArray.parseArray(bVar.a()));
        } catch (Exception e) {
            g.a(e);
            return WeexValueImpl.ofUndefined();
        }
    }
}
