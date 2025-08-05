package com.taobao.android.detail.core.performance.preload;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.qrcode.data.QrCodeData;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9800a;
    public String b;
    public String c;
    public JSONObject d;
    public long e;
    public String f;
    public String g;
    public String h;
    public String i;

    static {
        kge.a(-1809006808);
    }

    private h(a aVar) {
        this.f9800a = a.a(aVar);
        this.b = a.b(aVar);
        this.c = a.c(aVar);
        this.d = a.d(aVar);
        this.e = a.e(aVar) == 0 ? System.currentTimeMillis() : a.e(aVar);
        this.f = TextUtils.isEmpty(a.f(aVar)) ? "" : a.f(aVar);
        this.g = a.g(aVar);
        this.h = a.h(aVar);
        this.i = a.i(aVar);
        emu.a("com.taobao.android.detail.core.performance.preload.PreloadTaskCacheData");
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f9801a;
        private String b;
        private String c;
        private JSONObject d;
        private long e;
        private String f;
        private String g;
        private String h;
        private String i;

        static {
            kge.a(-296358401);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e27584", new Object[]{aVar}) : aVar.f9801a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1ee3c723", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("37e518c2", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ JSONObject d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("dc71db3f", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ long e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2a390c94", new Object[]{aVar})).longValue() : aVar.e;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("82e90d9f", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9bea5f3e", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4ebb0dd", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ String i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cded027c", new Object[]{aVar}) : aVar.i;
        }

        public h a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("351f1dff", new Object[]{this}) : new h(this);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7683f4d8", new Object[]{this, str});
            }
            this.f9801a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8f854677", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a8869816", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5aaa3cc2", new Object[]{this, jSONObject});
            }
            this.d = jSONObject;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("da893b54", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f38a8cf3", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c8bde92", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("258d3031", new Object[]{this, str});
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
        if (TextUtils.isEmpty(this.f9800a)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return "preload".equals(this.f9800a) ? currentTimeMillis - this.e > 14400000 : "refresh".equals(this.f9800a) && currentTimeMillis - this.e > QrCodeData.QR_CODE_VALID_PERIOD;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!TextUtils.isEmpty(this.f)) {
            return c.a(this.f);
        }
        return false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.h)) {
            return false;
        }
        return com.taobao.android.detail.core.performance.e.c(this.h) || !"refresh".equals(this.f9800a);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreloadTaskCacheData{cacheType='" + this.f9800a + "', cacheHit='" + this.b + "', cacheKey='" + this.c + "', cacheValue='" + this.d + "', cacheExpire=" + this.e + ", protocolVersion='" + this.f + "', mainPicUrl='" + this.g + "', fromSource='" + this.h + "'}";
    }
}
