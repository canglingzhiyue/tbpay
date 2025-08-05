package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ocl {
    public String content;
    public String expandAttribute;
    public long namespace;
    public String picUrls;
    public long targetId;
    public long targetOwnerId;
    public long targetParentId;
    public String videoUrls;

    static {
        kge.a(-1008503237);
    }

    public ocl(a aVar) {
        this.namespace = a.a(aVar);
        this.targetId = a.b(aVar);
        this.targetParentId = a.c(aVar);
        this.targetOwnerId = a.d(aVar);
        this.content = a.e(aVar);
        this.picUrls = a.f(aVar);
        this.videoUrls = a.g(aVar);
        this.expandAttribute = a.h(aVar);
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f31914a;
        private long b;
        private long c;
        private long d;
        private String e;
        private String f;
        private String g;
        private String h;

        static {
            kge.a(-193338862);
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9da152d7", new Object[]{aVar})).longValue() : aVar.f31914a;
        }

        public static /* synthetic */ long b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f77cbd18", new Object[]{aVar})).longValue() : aVar.b;
        }

        public static /* synthetic */ long c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("51582759", new Object[]{aVar})).longValue() : aVar.c;
        }

        public static /* synthetic */ long d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab33919a", new Object[]{aVar})).longValue() : aVar.d;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa436399", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3273a378", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("baa3e357", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42d42336", new Object[]{aVar}) : aVar.h;
        }

        public a setNamespace(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("17df36d", new Object[]{this, new Long(j)});
            }
            this.f31914a = j;
            return this;
        }

        public a setTargetId(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a1b754a2", new Object[]{this, new Long(j)});
            }
            this.b = j;
            return this;
        }

        public a setTargetParentId(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9322fb2c", new Object[]{this, new Long(j)});
            }
            this.c = j;
            return this;
        }

        public a setTargetOwnerId(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("69d5efef", new Object[]{this, new Long(j)});
            }
            this.d = j;
            return this;
        }

        public a setContent(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a37a0289", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a setPicUrls(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("42839ad4", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a setVideoUrls(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b77651c3", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a setExpandAttribute(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e9cc06c0", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }
    }
}
