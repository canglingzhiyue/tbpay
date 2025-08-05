package com.taobao.taolive.sdk.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.pmd;
import tb.pmi;

/* loaded from: classes8.dex */
public final class s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SWITCH_ENABLE_A_DAEMON = "enableADaemon";
    public static final String SWITCH_ENABLE_T_LIVE_TRACE = "enableTLiveTrace";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Boolean> f21970a;
    private static final Map<String, Boolean> b;
    private static final Map<String, Boolean> c;

    static {
        kge.a(1887910573);
        f21970a = new HashMap();
        b = new HashMap();
        c = new HashMap();
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        Boolean bool = f21970a.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(LauncherRuntime.h, str);
        f21970a.put(str, Boolean.valueOf(isFeatureOpened));
        q.b("TLiveSwitch", "TLiveSwitch 获取本地开关：" + str + ", 开关结果：" + isFeatureOpened);
        return isFeatureOpened;
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        Boolean bool = b.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean a2 = a(str);
        if (a2) {
            q.b("TLiveSwitch", "TLiveSwitch 获取 Orange 开关：" + str + ", 本地开关已打开：" + a2);
            b.put(str, Boolean.valueOf(a2));
            return a2;
        }
        pmi d = pmd.a().d();
        if (d == null) {
            b.put(str, Boolean.valueOf(z));
            return z;
        }
        String a3 = d.a("tblive", str, String.valueOf(z));
        q.b("TLiveSwitch", "TLiveSwitch 获取 Orange 开关：" + str + ", 开关结果：" + a3 + ", 开关默认值：" + z);
        boolean parseBoolean = Boolean.parseBoolean(a3);
        b.put(str, Boolean.valueOf(parseBoolean));
        return parseBoolean;
    }
}
