package com.taobao.trade.common.kit.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, a> f22991a;
    public static final String sDefaultBizCode = "ultron";

    /* loaded from: classes9.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1331916236);
        }

        public float a(String str, float f) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{this, str, new Float(f)})).floatValue() : f;
        }

        public boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue() : z;
        }
    }

    static {
        kge.a(1931147013);
        f22991a = new HashMap();
        a("ultron", new b());
    }

    public static void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16635fa7", new Object[]{str, aVar});
        } else if (f22991a.containsKey(str)) {
        } else {
            f22991a.put(str, aVar);
        }
    }

    private static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("eae11b7b", new Object[]{str});
        }
        a aVar = null;
        if (!TextUtils.isEmpty(str)) {
            aVar = f22991a.get(str);
        }
        return aVar == null ? f22991a.get("ultron") : aVar;
    }

    public static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{str, str2, new Boolean(z)})).booleanValue() : a(str, str2, z, false);
    }

    public static boolean a(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69a07900", new Object[]{str, str2, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        boolean a2 = a(str).a(str2, z);
        if (z2) {
            f.a("奥创开关#" + str, str2, "=" + a2);
        }
        return a2;
    }

    public static float a(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4dba89b4", new Object[]{str, str2, new Float(f)})).floatValue() : a(str).a(str2, f);
    }

    /* loaded from: classes9.dex */
    public static final class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1620551338);
        }

        private b() {
        }

        @Override // com.taobao.trade.common.kit.utils.h.a
        public boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue() : com.taobao.trade.common.kit.utils.a.a(str, z);
        }

        @Override // com.taobao.trade.common.kit.utils.h.a
        public float a(String str, float f) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{this, str, new Float(f)})).floatValue() : com.taobao.trade.common.kit.utils.a.a(str, f);
        }
    }
}
