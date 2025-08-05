package com.taobao.android.preload;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.qrcode.data.QrCodeData;

/* loaded from: classes6.dex */
public class g<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f14684a;
    public String b;
    public String c;
    public String d;
    public T e;
    public long f;
    public String g;
    public String h;
    public String i;
    public String j;

    private g(a<T> aVar) {
        this.f14684a = a.a((a) aVar);
        this.b = a.b(aVar);
        this.c = a.c(aVar);
        this.d = a.d(aVar);
        this.e = (T) a.e(aVar);
        this.f = a.f(aVar) == 0 ? System.currentTimeMillis() : a.f(aVar);
        this.g = TextUtils.isEmpty(a.g(aVar)) ? "" : a.g(aVar);
        this.h = a.h(aVar);
        this.i = a.i(aVar);
        this.j = a.j(aVar);
    }

    /* loaded from: classes6.dex */
    public static class a<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f14685a;
        private String b;
        private String c;
        private String d;
        private T e;
        private long f;
        private String g;
        private String h;
        private String i;
        private String j;

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d35a7894", new Object[]{aVar}) : aVar.f14685a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ed75f733", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79175d2", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("21acf471", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ Object e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("490595a2", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ long f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8610e705", new Object[]{aVar})).longValue() : aVar.f;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6fff704e", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a1aeeed", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ String i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a4366d8c", new Object[]{aVar}) : aVar.i;
        }

        public static /* synthetic */ String j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("be51ec2b", new Object[]{aVar}) : aVar.j;
        }

        public g<T> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("172919ef", new Object[]{this}) : new g<>(this);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f9a6b6c8", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("13c23567", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2dddb406", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5c33ae76", new Object[]{this, t});
            }
            this.e = t;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("47f932a5", new Object[]{this, str});
            }
            this.i = str;
            return this;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.b)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return "preload".equals(this.b) ? currentTimeMillis - this.f > 14400000 : "refresh".equals(this.b) && currentTimeMillis - this.f > QrCodeData.QR_CODE_VALID_PERIOD;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreloadTaskCacheData{bizName='" + this.f14684a + "', cacheType='" + this.b + "', cacheHit='" + this.c + "', cacheKey='" + this.d + "', cacheValue=" + this.e + ", cacheExpire=" + this.f + ", protocolVersion='" + this.g + "', mainPicUrl='" + this.h + "', fromSource='" + this.i + "', industryFailReason='" + this.j + "'}";
    }
}
