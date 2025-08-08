package com.alibaba.android.ultron.vfw.weex2.highPerformance.model;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f2786a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final String j;
    public final List<String> k;

    static {
        kge.a(-185309494);
    }

    private a(String str, String str2, int i, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list) {
        this.f2786a = str;
        this.b = str2;
        this.c = i;
        this.i = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.j = str8;
        this.k = list;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (str == null || str2 == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        return StringUtils.equals(parse.getHost(), parse2.getHost()) && StringUtils.equals(parse.getPath(), parse2.getPath());
    }

    public static boolean a(a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83b49116", new Object[]{aVar, aVar2})).booleanValue();
        }
        if (aVar != null && aVar2 != null) {
            return a(aVar.b, aVar2.b);
        }
        return false;
    }

    /* renamed from: com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0105a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String g;
        private String j;
        private List<String> k;

        /* renamed from: a  reason: collision with root package name */
        private String f2787a = "";
        private String b = "";
        private int c = 1;
        private boolean i = false;
        private String d = UltronTradeHybridStage.ON_NAV;
        private String e = "none";
        private String f = "none";
        private String h = UltronTradeHybridInstanceRenderMode.TEXTURE;

        static {
            kge.a(265606049);
        }

        public C0105a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0105a) ipChange.ipc$dispatch("ed925d3c", new Object[]{this, str});
            }
            this.f2787a = str;
            return this;
        }

        public C0105a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0105a) ipChange.ipc$dispatch("33339fdb", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public C0105a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0105a) ipChange.ipc$dispatch("60bcd6c2", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public C0105a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0105a) ipChange.ipc$dispatch("5394ccb3", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = 1;
            }
            this.c = i;
            return this;
        }

        public C0105a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0105a) ipChange.ipc$dispatch("78d4e27a", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public C0105a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0105a) ipChange.ipc$dispatch("be762519", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public C0105a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0105a) ipChange.ipc$dispatch("41767b8", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public C0105a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0105a) ipChange.ipc$dispatch("49b8aa57", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public C0105a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0105a) ipChange.ipc$dispatch("8f59ecf6", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public C0105a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0105a) ipChange.ipc$dispatch("d4fb2f95", new Object[]{this, str});
            }
            this.j = str;
            return this;
        }

        public C0105a a(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0105a) ipChange.ipc$dispatch("27937735", new Object[]{this, list});
            }
            this.k = list;
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c4332563", new Object[]{this}) : new a(this.f2787a, this.b, this.c, this.i, this.d, this.e, this.f, this.g, this.h, this.j, this.k);
        }
    }
}
