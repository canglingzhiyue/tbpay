package com.etao.feimagesearch.result;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.o;
import java.util.Map;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes3.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private h f6975a;
    private final Handler b = new Handler(Looper.getMainLooper());

    static {
        kge.a(-669817779);
    }

    public static final /* synthetic */ Handler a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("3f081471", new Object[]{gVar}) : gVar.b;
    }

    /* loaded from: classes3.dex */
    public static final class a implements o.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ o.a b;

        /* renamed from: com.etao.feimagesearch.result.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class RunnableC0247a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;
            public final /* synthetic */ Integer d;
            public final /* synthetic */ String e;

            public RunnableC0247a(String str, String str2, Integer num, String str3) {
                this.b = str;
                this.c = str2;
                this.d = num;
                this.e = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.this.b.a(this.b, this.c, this.d, this.e);
                }
            }
        }

        /* loaded from: classes3.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ MtopResponse b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ JSONObject e;

            public b(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
                this.b = mtopResponse;
                this.c = str;
                this.d = str2;
                this.e = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.this.b.a(this.b, this.c, this.d, this.e);
                }
            }
        }

        public a(o.a aVar) {
            this.b = aVar;
        }

        @Override // com.etao.feimagesearch.util.o.a
        public void a(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5796e64f", new Object[]{this, mtopResponse, str, str2, jSONObject});
            } else {
                g.a(g.this).post(new b(mtopResponse, str, str2, jSONObject));
            }
        }

        @Override // com.etao.feimagesearch.util.o.a
        public void a(String str, String str2, Integer num, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e122485", new Object[]{this, str, str2, num, str3});
            } else {
                g.a(g.this).post(new RunnableC0247a(str, str2, num, str3));
            }
        }
    }

    public final void a(Bitmap bitmap, Map<String, String> params, o.a listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c5ec54", new Object[]{this, bitmap, params, listener});
            return;
        }
        q.c(bitmap, "bitmap");
        q.c(params, "params");
        q.c(listener, "listener");
        a();
        this.f6975a = new h(bitmap, params, new a(listener));
        h hVar = this.f6975a;
        if (hVar == null) {
            q.a();
        }
        hVar.b();
    }

    public final void a(String str, RectF rectF, String str2, Map<String, String> params, o.a listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d43e63db", new Object[]{this, str, rectF, str2, params, listener});
            return;
        }
        q.c(params, "params");
        q.c(listener, "listener");
        a();
        this.f6975a = new h(str, rectF, str2, params, new b(listener));
        h hVar = this.f6975a;
        if (hVar == null) {
            q.a();
        }
        hVar.b();
    }

    /* loaded from: classes3.dex */
    public static final class b implements o.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ o.a b;

        /* loaded from: classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;
            public final /* synthetic */ Integer d;
            public final /* synthetic */ String e;

            public a(String str, String str2, Integer num, String str3) {
                this.b = str;
                this.c = str2;
                this.d = num;
                this.e = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.b.a(this.b, this.c, this.d, this.e);
                }
            }
        }

        /* renamed from: com.etao.feimagesearch.result.g$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class RunnableC0248b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ MtopResponse b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ JSONObject e;

            public RunnableC0248b(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
                this.b = mtopResponse;
                this.c = str;
                this.d = str2;
                this.e = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.b.a(this.b, this.c, this.d, this.e);
                }
            }
        }

        public b(o.a aVar) {
            this.b = aVar;
        }

        @Override // com.etao.feimagesearch.util.o.a
        public void a(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5796e64f", new Object[]{this, mtopResponse, str, str2, jSONObject});
            } else {
                g.a(g.this).post(new RunnableC0248b(mtopResponse, str, str2, jSONObject));
            }
        }

        @Override // com.etao.feimagesearch.util.o.a
        public void a(String str, String str2, Integer num, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e122485", new Object[]{this, str, str2, num, str3});
            } else {
                g.a(g.this).post(new a(str, str2, num, str3));
            }
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        h hVar = this.f6975a;
        if (hVar != null) {
            hVar.a(true);
        }
        this.f6975a = null;
        this.b.removeCallbacksAndMessages(null);
    }
}
