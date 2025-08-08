package com.etao.feimagesearch.result;

import android.graphics.Bitmap;
import android.graphics.RectF;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.o;
import java.util.Map;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes3.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f6982a;
    private final Bitmap b;
    private final String c;
    private final RectF d;
    private final String e;
    private final Map<String, String> f;
    private final o.a g;

    static {
        kge.a(216183780);
    }

    public h(Bitmap bitmap, String str, RectF rectF, String str2, Map<String, String> params, o.a listener) {
        q.c(params, "params");
        q.c(listener, "listener");
        this.b = bitmap;
        this.c = str;
        this.d = rectF;
        this.e = str2;
        this.f = params;
        this.g = listener;
    }

    public final o.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o.a) ipChange.ipc$dispatch("fea4dccd", new Object[]{this}) : this.g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Bitmap bitmap, Map<String, String> params, o.a listener) {
        this(bitmap, null, null, null, params, listener);
        q.c(bitmap, "bitmap");
        q.c(params, "params");
        q.c(listener, "listener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(String str, RectF rectF, String str2, Map<String, String> params, o.a listener) {
        this(null, str, rectF, str2, params, listener);
        q.c(params, "params");
        q.c(listener, "listener");
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f6982a = z;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f6982a;
    }

    public final void b() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f6982a) {
        } else {
            String str3 = null;
            Bitmap bitmap = this.b;
            if (bitmap == null) {
                if (this.d != null) {
                    str = String.valueOf((int) this.d.left) + "," + String.valueOf((int) this.d.right) + "," + String.valueOf((int) this.d.top) + "," + String.valueOf((int) this.d.bottom);
                } else {
                    str = str3;
                }
                if (StringUtils.isEmpty(this.e)) {
                    str2 = "0,0,0,0";
                } else {
                    str2 = this.e;
                    if (str2 == null) {
                        q.a();
                    }
                }
            } else {
                str3 = com.etao.feimagesearch.util.d.a(bitmap, Bitmap.CompressFormat.JPEG, 70);
                str = "0," + this.b.getWidth() + ",0," + this.b.getHeight();
                str2 = str;
            }
            this.f.put("region", str);
            this.f.put("full_region_size", str2);
            o.a(this.f);
            o.b(this.f);
            if (!StringUtils.isEmpty(str3)) {
                this.f.put(o.KEY_IMG, str3);
            }
            if (!StringUtils.isEmpty(this.c)) {
                this.f.put("searchimg", this.c);
            }
            o.a((String) null, com.etao.feimagesearch.config.b.I(), com.etao.feimagesearch.config.b.J(), this.f, new a());
        }
    }

    /* loaded from: classes3.dex */
    public static final class a implements o.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.etao.feimagesearch.util.o.a
        public void a(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5796e64f", new Object[]{this, mtopResponse, str, str2, jSONObject});
            } else if (h.this.a()) {
            } else {
                h.this.c().a(mtopResponse, str, str2, jSONObject);
            }
        }

        @Override // com.etao.feimagesearch.util.o.a
        public void a(String str, String str2, Integer num, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e122485", new Object[]{this, str, str2, num, str3});
            } else if (h.this.a()) {
            } else {
                h.this.c().a(str, str2, num, str3);
            }
        }
    }
}
