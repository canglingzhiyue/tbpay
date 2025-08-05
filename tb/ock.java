package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ock {
    public String namespace;
    public String origin;
    public String targetCover;
    public String targetId;
    public String targetOwnerId;
    public String targetTitle;
    public String targetUrl;

    static {
        kge.a(-990284460);
    }

    public ock(a aVar) {
        this.namespace = a.a(aVar);
        this.targetCover = a.b(aVar);
        this.targetId = a.c(aVar);
        this.targetOwnerId = a.d(aVar);
        this.targetUrl = a.e(aVar);
        this.targetTitle = a.f(aVar);
        this.origin = a.g(aVar);
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f31913a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;

        static {
            kge.a(-1244678101);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f50cadc", new Object[]{aVar}) : aVar.f31913a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c7810abb", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4fb14a9a", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d7e18a79", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6011ca58", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e8420a37", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("70724a16", new Object[]{aVar}) : aVar.g;
        }

        public a setNamespace(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ddea1888", new Object[]{this, str});
            }
            this.f31913a = str;
            return this;
        }

        public a setTargetId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8fb2a7f3", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a setTargetOwnerId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bb1e7046", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a setTargetCover(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fc93675d", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a setTargetTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("57e5049c", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a setTargetUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("71f0ef65", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a setOrigin(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d9847799", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }
    }
}
