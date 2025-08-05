package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ocj {
    public long namespace;
    public String origin;
    public String targetCover;
    public long targetId;
    public long targetOwnerId;
    public String targetTitle;
    public String targetUrl;

    static {
        kge.a(-447586658);
    }

    public ocj(a aVar) {
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
        private long f31912a;
        private long b;
        private long c;
        private String d;
        private String e;
        private String f;
        private String g;

        static {
            kge.a(586659701);
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9a37a199", new Object[]{aVar})).longValue() : aVar.f31912a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7d4f717a", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ long c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4dee761b", new Object[]{aVar})).longValue() : aVar.b;
        }

        public static /* synthetic */ long d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a7c9e05c", new Object[]{aVar})).longValue() : aVar.c;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15e03117", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9e1070f6", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2640b0d5", new Object[]{aVar}) : aVar.g;
        }

        public a setNamespace(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("17d0aaf", new Object[]{this, new Long(j)});
            }
            this.f31912a = j;
            return this;
        }

        public a setTargetId(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a1b66be4", new Object[]{this, new Long(j)});
            }
            this.b = j;
            return this;
        }

        public a setTargetOwnerId(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("69d50731", new Object[]{this, new Long(j)});
            }
            this.c = j;
            return this;
        }

        public a setTargetCover(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fc92f2fe", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a setTargetTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("57e4903d", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a setTargetUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("71f07b06", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a setOrigin(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d984033a", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }
    }
}
