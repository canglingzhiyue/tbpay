package com.taobao.alivfsadapter;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_FILE = "file";
    public static final String CACHE_MMAP = "mmap";
    public static final String CACHE_SQL = "sql";
    public static final String OPERATION_READ = "read";
    public static final String OPERATION_WRITE = "write";
    public static final String RESOURCE_OBJECT = "object";
    public static final String RESOURCE_STREAM = "stream";

    /* renamed from: a  reason: collision with root package name */
    public final String f8472a;
    public final String b;
    public Exception c;
    public String d;
    public int e;
    public String f;
    public final boolean g;
    public boolean h;
    public long i;

    private g(a aVar) {
        this.f8472a = a.a(aVar);
        this.b = a.b(aVar);
        this.c = a.c(aVar);
        this.d = a.d(aVar);
        this.e = a.e(aVar);
        this.f = a.f(aVar);
        this.g = a.g(aVar);
        this.h = a.h(aVar);
        this.i = a.i(aVar);
    }

    public static a a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2d6ef61", new Object[]{str, str2, new Boolean(z)}) : new a(str, str2, z);
    }

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f8473a;
        private final String b;
        private Exception c;
        private String d;
        private int e;
        private String f;
        private final boolean g;
        private boolean h;
        private long i;

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ad540f5", new Object[]{aVar}) : aVar.f8473a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("98addb54", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ Exception c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Exception) ipChange.ipc$dispatch("a8b541c3", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f45f1012", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ int e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("495bca02", new Object[]{aVar})).intValue() : aVar.e;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("501044d0", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ boolean g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("170d4995", new Object[]{aVar})).booleanValue() : aVar.g;
        }

        public static /* synthetic */ boolean h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7de60956", new Object[]{aVar})).booleanValue() : aVar.h;
        }

        public static /* synthetic */ long i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e4bec907", new Object[]{aVar})).longValue() : aVar.i;
        }

        private a(String str, String str2, boolean z) {
            this.f8473a = str;
            this.b = str2;
            this.g = z;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("89472e47", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f517ab7e", new Object[]{this, new Integer(i)});
            }
            this.e = i;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b71fc8a6", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4be94d", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7d47eb5d", new Object[]{this, new Long(j)});
            }
            this.i = j;
            return this;
        }

        public g a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("78d2bfae", new Object[]{this}) : new g(this);
        }
    }
}
