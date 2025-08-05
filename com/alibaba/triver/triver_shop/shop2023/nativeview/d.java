package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.extension.dianmicX.Tab3AnimationIcon;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;

/* loaded from: classes3.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final String v;
    private static final JSONObject w;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f4104a;
    private int b;
    private int c;
    private String d;
    private int e;
    private String f;
    private int g;
    private JSONArray h;
    private int i;
    private int j;
    private int k;
    private int l;
    private String m;
    private int n;
    private int o;
    private String p;
    private int q;
    private int r;
    private int s;
    private final Tab3AnimationIcon t;
    private long u;

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int a2 = d.a(d.this) + d.b(d.this);
            d dVar = d.this;
            TextPaint paint = dVar.a().getIconText().getPaint();
            q.b(paint, "tab3.iconText.paint");
            o.b(d.this.a().getIconText(), Math.max(Math.min(d.a(dVar, paint) + a2, d.this.a().getWidth()), d.c(d.this)));
        }
    }

    public d(Context context, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str;
        q.d(context, "context");
        this.f4104a = jSONObject;
        this.c = o.g((Number) 10);
        this.e = 2000;
        this.l = o.g((Number) 44);
        this.n = o.g((Number) 48);
        this.o = o.g((Number) 4);
        this.p = "#ff0040,#ff4d79";
        this.q = o.g((Number) 16);
        this.r = o.g((Number) 48);
        this.t = new Tab3AnimationIcon(context);
        this.u = 10000L;
        JSONObject jSONObject3 = this.f4104a;
        if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject("behaviorSequencePayload_livebar")) != null) {
            boolean a2 = q.a((Object) jSONObject2.getString("rightType"), (Object) "right_dianTaoRedRain");
            JSONArray jSONArray = jSONObject2.getJSONArray("bottomTextList");
            if (jSONArray != null) {
                Object obj = jSONArray.get(0);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                this.d = (String) obj;
                this.h = a2 ? null : jSONArray;
            }
            this.m = jSONObject2.getString("backgroundPicUrl");
            JSONArray jSONArray2 = jSONObject2.getJSONArray("backgroundPicUrlList");
            if (jSONArray2 != null) {
                if (a2) {
                    str = jSONObject2.getString("backgroundPicUrl");
                } else {
                    Object obj2 = jSONArray2.get(0);
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    str = (String) obj2;
                }
                this.m = str;
            }
            this.f = jSONObject2.getString("bottomPicUrl");
            this.i = jSONObject2.getIntValue("displayTimes");
            this.b = Color.parseColor(jSONObject2.getString("bottomTextColor"));
            this.c = o.d(Integer.valueOf(jSONObject2.getIntValue("iconSize")));
            this.e = jSONObject2.getIntValue("iconTextChangeInterval");
            this.l = o.d(Integer.valueOf(jSONObject2.getIntValue("mainImageSize")));
            this.n = o.d(Integer.valueOf(jSONObject2.getIntValue("mainOuterImageSize")));
            this.o = o.d(Integer.valueOf(jSONObject2.getIntValue("textBackgroundCornerRadius")));
            this.r = o.d(Integer.valueOf(jSONObject2.getIntValue("textBackgroundMinWidth")));
            this.q = o.d(Integer.valueOf(jSONObject2.getIntValue("textBackgroundHeight")));
            this.p = jSONObject2.getString("textBackgroundGradientColor");
            this.g = o.d(Integer.valueOf(jSONObject2.getIntValue("iconTextLeftPadding")));
            this.j = o.d(Integer.valueOf(jSONObject2.getIntValue("iconTextRightPadding")));
        }
        b();
    }

    public static final /* synthetic */ int a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("722227a7", new Object[]{dVar})).intValue() : dVar.g;
    }

    public static final /* synthetic */ int a(d dVar, Paint paint) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8fd9d3bc", new Object[]{dVar, paint})).intValue() : dVar.a(paint);
    }

    public static final /* synthetic */ int b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("82d7f468", new Object[]{dVar})).intValue() : dVar.j;
    }

    public static final /* synthetic */ int c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("938dc129", new Object[]{dVar})).intValue() : dVar.r;
    }

    public final Tab3AnimationIcon a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Tab3AnimationIcon) ipChange.ipc$dispatch("de0a428e", new Object[]{this}) : this.t;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-1895307694);
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        private a() {
        }
    }

    static {
        kge.a(408575882);
        Companion = new a(null);
        v = "{\n  \"behaviorSequencePayload_livebar\":{\n    \"backgroundPicUrlList\":[\n      \"//gw.alicdn.com/bao/upload/bao/i4/2209744846528/O1CN01Ciouq11y5sPFKA5Fk_!!2209744846528.jpg\"\n    ],\n    \"bottomPicUrl\":\"https://img.alicdn.com/imgextra/i3/O1CN01rKS5wv1tHiZ6ZzEMu_!!6000000005877-54-tps-99-34.apng\",\n    \"bottomTextColor\":\"#ffffff\",\n    \"bottomTextList\":[\n      \"秒杀\",\n      \"¥278\"\n    ],\n    \"currentTime\":1702449880736,\n    \"displayTime\":10,\n    \"displayTimes\":5,\n    \"expireTime\":1702450158000,\n    \"highPriorityBizCode\":\"seckill\",\n    \"iconSize\":20,\n    \"iconTextChangeInterval\":2000,\n    \"iconTextLeftPadding\":16,\n    \"iconTextRightPadding\":16,\n    \"lightPicUrl\":\"https://img.alicdn.com/imgextra/i3/O1CN015BhfMR1Kebo7ykeHr_!!6000000001189-54-tps-238-238.apng\",\n    \"mainImageSize\":88,\n    \"mainOuterImageSize\":96,\n    \"rightType\":\"seckill\",\n    \"sjsdItemId\":753895034719,\n    \"textBackgroundCornerRadius\":8,\n    \"textBackgroundGradientColor\":\"#ff0040,#ff4d79\",\n    \"textBackgroundHeight\":32,\n    \"textBackgroundMinWidth\":96,\n    \"type\":\"heterotype\"\n  }\n}";
        w = JSON.parseObject("{\n  \"behaviorSequencePayload_livebar\":{\n    \"backgroundPicUrlList\":[\n      \"//gw.alicdn.com/bao/upload/bao/i4/2209744846528/O1CN01Ciouq11y5sPFKA5Fk_!!2209744846528.jpg\"\n    ],\n    \"bottomPicUrl\":\"https://img.alicdn.com/imgextra/i3/O1CN01rKS5wv1tHiZ6ZzEMu_!!6000000005877-54-tps-99-34.apng\",\n    \"bottomTextColor\":\"#ffffff\",\n    \"bottomTextList\":[\n      \"秒杀\",\n      \"¥278\"\n    ],\n    \"currentTime\":1702449880736,\n    \"displayTime\":10,\n    \"displayTimes\":5,\n    \"expireTime\":1702450158000,\n    \"highPriorityBizCode\":\"seckill\",\n    \"iconSize\":20,\n    \"iconTextChangeInterval\":2000,\n    \"iconTextLeftPadding\":16,\n    \"iconTextRightPadding\":16,\n    \"lightPicUrl\":\"https://img.alicdn.com/imgextra/i3/O1CN015BhfMR1Kebo7ykeHr_!!6000000001189-54-tps-238-238.apng\",\n    \"mainImageSize\":88,\n    \"mainOuterImageSize\":96,\n    \"rightType\":\"seckill\",\n    \"sjsdItemId\":753895034719,\n    \"textBackgroundCornerRadius\":8,\n    \"textBackgroundGradientColor\":\"#ff0040,#ff4d79\",\n    \"textBackgroundHeight\":32,\n    \"textBackgroundMinWidth\":96,\n    \"type\":\"heterotype\"\n  }\n}");
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.t.setClipChildren(false);
        o.b(this.t.getRootLayout(), o.g((Number) 70), o.g((Number) 55));
        this.t.getIconText().setText(this.d);
        this.t.getIconText().setTextSize(0, this.c);
        this.t.getIconText().setTextColor(this.b);
        o.a((View) this.t.getIconText(), this.q);
        this.t.getMainImage().setImageUrl(this.m);
        String str = this.p;
        if (str != null) {
            List a2 = n.a((CharSequence) str, new char[]{','}, false, 0, 6, (Object) null);
            o.a(a().getFlIconText(), a().getTab3IconTextBackgroundDrawable((String) p.a((List<? extends Object>) a2, 0), (String) p.a((List<? extends Object>) a2, 1), this.o));
        }
        this.t.getIconTextFloatImage().setImageUrl(this.f);
        o.a(this.t.getMainImageLayout(), this.l);
        o.b(this.t.getMainImageLayout(), this.l);
        o.a(this.t.getBorderImageLayout(), this.n);
        o.b(this.t.getBorderImageLayout(), this.n);
        o.a(this.t.getBorderImage2(), this.n);
        o.b(this.t.getBorderImage2(), this.n);
        o.c(this.t.getRootLayout(), this.k);
        o.a((View) this.t.getMainImageLayout(), true, this.l / 2);
        this.t.getIconText().setPadding(this.g, 0, this.j, 0);
        int i = this.s + this.g + this.j;
        if (this.r != 0) {
            this.t.post(new b());
        } else {
            o.b(this.t.getIconText(), i);
        }
        this.t.startBreathAni();
        this.t.startSwitchText(this.e, this.i, this.h);
    }

    private final int a(Paint paint) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b8e3c70", new Object[]{this, paint})).intValue();
        }
        JSONArray jSONArray = this.h;
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2 != null && !jSONArray2.isEmpty()) {
            z = false;
        }
        if (z) {
            return 0;
        }
        float f = 0.0f;
        for (Object obj : jSONArray) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            float measureText = paint.measureText((String) obj);
            if (measureText > f) {
                f = measureText;
            }
        }
        return (int) f;
    }
}
