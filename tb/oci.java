package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class oci {
    public long browseNamespace;
    public long commentNamespace;
    public long dislikeNamespace;
    public boolean isDisLikeCount;
    public boolean isDisLikeStatus;
    public boolean isLikeCount;
    public boolean isLikeStatus;
    public long likeNamespace;
    public String[] targetIds;

    static {
        kge.a(248677345);
    }

    public oci(a aVar) {
        this.commentNamespace = a.a(aVar);
        this.targetIds = a.b(aVar);
        this.browseNamespace = a.c(aVar);
        this.likeNamespace = a.d(aVar);
        this.dislikeNamespace = a.e(aVar);
        this.isLikeCount = a.f(aVar);
        this.isLikeStatus = a.g(aVar);
        this.isDisLikeCount = a.h(aVar);
        this.isDisLikeStatus = a.i(aVar);
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f31911a;
        private String[] b;
        private long c;
        private long d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;

        static {
            kge.a(2121001400);
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9882c8fa", new Object[]{aVar})).longValue() : aVar.f31911a;
        }

        public static /* synthetic */ String[] b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("a9286356", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ long c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4c399d7c", new Object[]{aVar})).longValue() : aVar.c;
        }

        public static /* synthetic */ long d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a61507bd", new Object[]{aVar})).longValue() : aVar.d;
        }

        public static /* synthetic */ long e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fff071fe", new Object[]{aVar})).longValue() : aVar.e;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59cbdc4f", new Object[]{aVar})).booleanValue() : aVar.f;
        }

        public static /* synthetic */ boolean g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3a74690", new Object[]{aVar})).booleanValue() : aVar.g;
        }

        public static /* synthetic */ boolean h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d82b0d1", new Object[]{aVar})).booleanValue() : aVar.h;
        }

        public static /* synthetic */ boolean i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("675e1b12", new Object[]{aVar})).booleanValue() : aVar.i;
        }

        public a setCommentNamespace(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("511368b5", new Object[]{this, new Long(j)});
            }
            this.f31911a = j;
            return this;
        }

        public a setTargetIds(String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("873a861", new Object[]{this, strArr});
            }
            this.b = strArr;
            return this;
        }

        public a setBrowseNamespace(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f904a5e6", new Object[]{this, new Long(j)});
            }
            this.c = j;
            return this;
        }

        public a setLikeNamespace(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e855b9", new Object[]{this, new Long(j)});
            }
            this.d = j;
            return this;
        }

        public a setDislikeNamespace(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7c32db2f", new Object[]{this, new Long(j)});
            }
            this.e = j;
            return this;
        }

        public a setLikeCount(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f11087dd", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a setLikeStatus(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f2fbd212", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public a setDisLikeCount(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("39011033", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public a setDisLikeStatus(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a91c547c", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }
    }
}
