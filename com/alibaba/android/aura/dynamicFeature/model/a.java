package com.alibaba.android.aura.dynamicFeature.model;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f2138a;
    public final String b;
    public final String c;
    public final String d;

    static {
        kge.a(-1906193987);
    }

    private a(String str, String str2, String str3) {
        this.f2138a = str;
        this.b = str2;
        this.c = str3;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(str3);
        this.d = stringBuffer.toString();
    }

    public static boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5aac472f", new Object[]{aVar})).booleanValue() : aVar != null && !StringUtils.isEmpty(aVar.f2138a) && !StringUtils.isEmpty(aVar.b) && !StringUtils.isEmpty(aVar.c) && !StringUtils.isEmpty(aVar.d);
    }

    public static boolean a(a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12fd36cc", new Object[]{aVar, aVar2})).booleanValue();
        }
        if (aVar != null && aVar2 != null) {
            return StringUtils.equals(aVar.d, aVar2.d);
        }
        return false;
    }

    /* renamed from: com.alibaba.android.aura.dynamicFeature.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0067a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f2139a = "";
        private String b = "";
        private String c = AURADynamicFeatureBundleType.AAR;

        static {
            kge.a(-608857196);
        }

        public C0067a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0067a) ipChange.ipc$dispatch("37481618", new Object[]{this, str});
            }
            if (!StringUtils.isEmpty(str)) {
                if (str.contains("-")) {
                    str.replace("-", "_");
                }
                this.f2139a = str;
            }
            return this;
        }

        public C0067a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0067a) ipChange.ipc$dispatch("fe53fd19", new Object[]{this, str});
            }
            if (!StringUtils.isEmpty(str)) {
                this.b = str;
            }
            return this;
        }

        public C0067a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0067a) ipChange.ipc$dispatch("c55fe41a", new Object[]{this, str});
            }
            if (!StringUtils.isEmpty(str)) {
                this.c = str;
            }
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d76c95eb", new Object[]{this}) : new a(this.f2139a, this.b, this.c);
        }
    }
}
