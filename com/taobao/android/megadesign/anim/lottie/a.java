package com.taobao.android.megadesign.anim.lottie;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0019\u0018\u0000 C2\u00020\u0001:\u0001CB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001e\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00101\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001c\u00104\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u001c\u00107\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010$\"\u0004\b9\u0010&R\u001e\u0010:\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b;\u0010-\"\u0004\b<\u0010/R\u001a\u0010=\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR\u001a\u0010@\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\f\"\u0004\bB\u0010\u000e¨\u0006D"}, d2 = {"Lcom/taobao/android/megadesign/anim/lottie/LottieConfig;", "", "()V", "assetPath", "", "getAssetPath", "()Ljava/lang/String;", "setAssetPath", "(Ljava/lang/String;)V", Constants.Name.AUTO_PLAY, "", "getAutoPlay", "()Z", "setAutoPlay", "(Z)V", "bizId", "getBizId", "setBizId", "filePath", "getFilePath", "setFilePath", "font", "getFont", "setFont", "loopCount", "", "getLoopCount", "()I", "setLoopCount", "(I)V", "lottieUrl", "getLottieUrl", "setLottieUrl", "onTapArea", "Lcom/alibaba/fastjson/JSONArray;", "getOnTapArea", "()Lcom/alibaba/fastjson/JSONArray;", "setOnTapArea", "(Lcom/alibaba/fastjson/JSONArray;)V", "playControl", "getPlayControl", "setPlayControl", "progress", "", "getProgress", "()Ljava/lang/Float;", "setProgress", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "renderMode", "getRenderMode", "setRenderMode", "replacementImages", "getReplacementImages", "setReplacementImages", "replacementText", "getReplacementText", "setReplacementText", "speed", "getSpeed", "setSpeed", "tapAreaDebuggable", "getTapAreaDebuggable", "setTapAreaDebuggable", "textBold", "getTextBold", "setTextBold", "Builder", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static JSONArray D;
    private static boolean E;
    private static JSONArray o;
    private static JSONArray p;
    private static String q;
    private static String r;
    private static int s;
    private static String t;
    private static boolean u;
    private static JSONArray v;
    private static Float w;
    private static Float x;
    private static String y;
    private static String z;
    private JSONArray B;
    private boolean C;

    /* renamed from: a  reason: collision with root package name */
    private String f14253a;
    private String b;
    private String c;
    private Float d;
    private Float e;
    private JSONArray f;
    private JSONArray g;
    private JSONArray h;
    private String i;
    private String j;
    private int k;
    private String l;
    private boolean m;
    private boolean n = true;
    public static final C0548a Builder = new C0548a(null);
    private static boolean A = true;

    public static final /* synthetic */ boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue() : A;
    }

    public static final /* synthetic */ JSONArray D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("b0f5be13", new Object[0]) : D;
    }

    public static final /* synthetic */ boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue() : E;
    }

    public static final /* synthetic */ void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
        } else {
            s = i;
        }
    }

    public static final /* synthetic */ void c(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{new Boolean(z2)});
        } else {
            u = z2;
        }
    }

    public static final /* synthetic */ void d(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8962013", new Object[]{jSONArray});
        } else {
            o = jSONArray;
        }
    }

    public static final /* synthetic */ void e(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3df394", new Object[]{jSONArray});
        } else {
            p = jSONArray;
        }
    }

    public static final /* synthetic */ void e(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{new Boolean(z2)});
        } else {
            E = z2;
        }
    }

    public static final /* synthetic */ void f(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5c715", new Object[]{jSONArray});
        } else {
            v = jSONArray;
        }
    }

    public static final /* synthetic */ void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{str});
        } else {
            y = str;
        }
    }

    public static final /* synthetic */ void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{str});
        } else {
            q = str;
        }
    }

    public static final /* synthetic */ void h(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37356e17", new Object[]{jSONArray});
        } else {
            D = jSONArray;
        }
    }

    public static final /* synthetic */ void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{str});
        } else {
            r = str;
        }
    }

    public static final /* synthetic */ void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{str});
        } else {
            t = str;
        }
    }

    public static final /* synthetic */ Float o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("13063dbf", new Object[0]) : x;
    }

    public static final /* synthetic */ String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[0]) : z;
    }

    public static final /* synthetic */ String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[0]) : y;
    }

    public static final /* synthetic */ Float r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("38d11e42", new Object[0]) : w;
    }

    public static final /* synthetic */ JSONArray s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("8911784", new Object[0]) : o;
    }

    public static final /* synthetic */ JSONArray t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("7cd04fe3", new Object[0]) : p;
    }

    public static final /* synthetic */ String u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326979a4", new Object[0]) : q;
    }

    public static final /* synthetic */ String v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8ef3443", new Object[0]) : r;
    }

    public static final /* synthetic */ int w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a27171", new Object[0])).intValue() : s;
    }

    public static final /* synthetic */ boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : u;
    }

    public static final /* synthetic */ String y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c806420", new Object[0]) : t;
    }

    public static final /* synthetic */ JSONArray z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("364ba21d", new Object[0]) : v;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f14253a;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f14253a = str;
        }
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public final void a(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f847471", new Object[]{this, f});
        } else {
            this.d = f;
        }
    }

    public final Float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("8873b134", new Object[]{this}) : this.d;
    }

    public final void b(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60a2f10", new Object[]{this, f});
        } else {
            this.e = f;
        }
    }

    public final Float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("950ca6b5", new Object[]{this}) : this.e;
    }

    public final void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else {
            this.f = jSONArray;
        }
    }

    public final JSONArray f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("215b3ab1", new Object[]{this}) : this.f;
    }

    public final void b(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1467911", new Object[]{this, jSONArray});
        } else {
            this.g = jSONArray;
        }
    }

    public final JSONArray g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("959a7310", new Object[]{this}) : this.g;
    }

    public final void c(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ee4c92", new Object[]{this, jSONArray});
        } else {
            this.h = jSONArray;
        }
    }

    public final JSONArray h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("9d9ab6f", new Object[]{this}) : this.h;
    }

    public final JSONArray B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("c8774d55", new Object[]{this}) : this.B;
    }

    public final void g(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238d9a96", new Object[]{this, jSONArray});
        } else {
            this.B = jSONArray;
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.i;
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.j;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public final int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.k;
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.l;
    }

    public final void a(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
        } else {
            this.m = z2;
        }
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.m;
    }

    public final void b(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z2)});
        } else {
            this.n = z2;
        }
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.n;
    }

    public final boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue() : this.C;
    }

    public final void d(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z2)});
        } else {
            this.C = z2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0006J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000bJ\u0010\u0010\"\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0004J\u0010\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u000eJ\u0015\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0010\u0010)\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010+\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u000eJ\u0015\u0010-\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010&J\u0010\u0010.\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0006J\u000e\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/taobao/android/megadesign/anim/lottie/LottieConfig$Builder;", "", "()V", "mAssetPath", "", "mAutoPlay", "", "mBizId", "mFilePath", "mFont", "mLoopCount", "", "mLottieUrl", "mOnTapArea", "Lcom/alibaba/fastjson/JSONArray;", "mPlayControl", "mRange", "", "Ljava/lang/Float;", "mRenderMode", "mReplacementImages", "mSpeed", "mTapAreaDebuggable", "mTextBold", "mTextDelegate", "assetPath", "filePath", Constants.Name.AUTO_PLAY, "bizId", "create", "Lcom/taobao/android/megadesign/anim/lottie/LottieConfig;", "font", "loopCount", "count", "lottieUrl", "url", "playControl", "range", "(Ljava/lang/Float;)Lcom/taobao/android/megadesign/anim/lottie/LottieConfig$Builder;", "renderMode", "mode", "replaceImages", "data", "replaceTexts", "replacementText", "speed", "tapArea", "tapAreaDebuggable", "debuggable", "textBold", "isBold", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.android.megadesign.anim.lottie.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0548a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private C0548a() {
        }

        public /* synthetic */ C0548a(o oVar) {
            this();
        }

        public final C0548a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0548a) ipChange.ipc$dispatch("68697783", new Object[]{this, str});
            }
            a.f(str);
            return this;
        }

        public final C0548a a(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0548a) ipChange.ipc$dispatch("a881c61", new Object[]{this, jSONArray});
            }
            a.d(jSONArray);
            return this;
        }

        public final C0548a b(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0548a) ipChange.ipc$dispatch("b203f622", new Object[]{this, jSONArray});
            }
            a.e(jSONArray);
            return this;
        }

        public final C0548a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0548a) ipChange.ipc$dispatch("59bb0704", new Object[]{this, str});
            }
            a.g(str);
            return this;
        }

        public final C0548a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0548a) ipChange.ipc$dispatch("4b0c9685", new Object[]{this, str});
            }
            a.h(str);
            return this;
        }

        public final C0548a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0548a) ipChange.ipc$dispatch("8d5a2f2c", new Object[]{this, new Integer(i)});
            }
            a.b(i);
            return this;
        }

        public final C0548a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0548a) ipChange.ipc$dispatch("857d693d", new Object[]{this, new Boolean(z)});
            }
            a.c(z);
            return this;
        }

        public final C0548a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0548a) ipChange.ipc$dispatch("3c5e2606", new Object[]{this, str});
            }
            a.i(str);
            return this;
        }

        public final C0548a c(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0548a) ipChange.ipc$dispatch("597fcfe3", new Object[]{this, jSONArray});
            }
            a.f(jSONArray);
            return this;
        }

        public final C0548a d(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0548a) ipChange.ipc$dispatch("fba9a4", new Object[]{this, jSONArray});
            }
            a.h(jSONArray);
            return this;
        }

        public final C0548a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0548a) ipChange.ipc$dispatch("b356039c", new Object[]{this, new Boolean(z)});
            }
            a.e(z);
            return this;
        }

        public final a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c8afe116", new Object[]{this});
            }
            a aVar = new a();
            aVar.a(a.s());
            aVar.b(a.t());
            aVar.c(a.u());
            aVar.d(a.v());
            aVar.a(a.w());
            aVar.e(a.y());
            aVar.a(a.x());
            aVar.c(a.z());
            aVar.a(a.r());
            aVar.a(a.q());
            aVar.b(a.p());
            aVar.b(a.o());
            aVar.b(a.A());
            aVar.g(a.D());
            aVar.d(a.E());
            return aVar;
        }
    }
}
