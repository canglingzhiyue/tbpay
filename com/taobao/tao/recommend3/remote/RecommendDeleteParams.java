package com.taobao.tao.recommend3.remote;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public final class RecommendDeleteParams implements IMTOPDataObject {
    public String deleteParam;
    public String lastResultVersion;
    public String pos;
    public String pvid;
    public String reasonArgs;
    public String reasonId;
    public int tabIndex;
    public String templateName;
    public String userId;

    static {
        kge.a(1509702492);
        kge.a(-350052935);
    }

    private RecommendDeleteParams(a aVar) {
        this.userId = a.a(aVar);
        this.deleteParam = a.b(aVar);
        this.pos = a.c(aVar);
        this.tabIndex = a.d(aVar);
        this.pvid = a.e(aVar);
        this.templateName = a.f(aVar);
        this.reasonId = a.g(aVar);
        this.reasonArgs = a.h(aVar);
        this.lastResultVersion = a.i(aVar);
    }

    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f20949a;
        private String b;
        private String c;
        private int d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;

        static {
            kge.a(-1194330573);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6acaddc2", new Object[]{aVar}) : aVar.f20949a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48be43a1", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("26b1a980", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("835ff354", new Object[]{aVar})).intValue() : aVar.d;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e298753e", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c08bdb1d", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9e7f40fc", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c72a6db", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ String i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5a660cba", new Object[]{aVar}) : aVar.i;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("82831b1a", new Object[]{this, str});
            }
            this.f20949a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("607680f9", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3e69e6d8", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f9102fd1", new Object[]{this, new Integer(i)});
            }
            if (i >= 0) {
                this.d = i;
            }
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1c5d4cb7", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fa50b296", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d8441875", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b6377e54", new Object[]{this, str});
            }
            this.i = str;
            return this;
        }

        public a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("942ae433", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public RecommendDeleteParams a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecommendDeleteParams) ipChange.ipc$dispatch("9387b241", new Object[]{this}) : new RecommendDeleteParams(this);
        }
    }
}
