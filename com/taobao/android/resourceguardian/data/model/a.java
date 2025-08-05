package com.taobao.android.resourceguardian.data.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f14877a;
    public final int b;
    public final Map<String, String> c;

    static {
        kge.a(288960609);
    }

    private a(C0567a c0567a) {
        this.f14877a = C0567a.a(c0567a);
        this.b = C0567a.b(c0567a);
        this.c = C0567a.c(c0567a);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "type: " + this.b + "; data: " + this.c;
    }

    /* renamed from: com.taobao.android.resourceguardian.data.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0567a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f14878a;
        private int b;
        private final Map<String, String> c = new HashMap();

        static {
            kge.a(-677505480);
        }

        public static /* synthetic */ int a(C0567a c0567a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a026eb7a", new Object[]{c0567a})).intValue() : c0567a.f14878a;
        }

        public static /* synthetic */ int b(C0567a c0567a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5baf47b", new Object[]{c0567a})).intValue() : c0567a.b;
        }

        public static /* synthetic */ Map c(C0567a c0567a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6eee2bfe", new Object[]{c0567a}) : c0567a.c;
        }

        public C0567a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0567a) ipChange.ipc$dispatch("2738afa", new Object[]{this, new Integer(i)});
            }
            this.f14878a = i;
            return this;
        }

        public C0567a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0567a) ipChange.ipc$dispatch("280793fb", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public C0567a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0567a) ipChange.ipc$dispatch("d4c49f79", new Object[]{this, str, str2});
            }
            this.c.put(str, str2);
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a8416dea", new Object[]{this}) : new a(this);
        }
    }
}
