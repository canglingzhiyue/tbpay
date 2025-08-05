package com.taobao.android.dinamicx.view.richtext.node;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.view.richtext.d;
import com.taobao.android.dinamicx.view.richtext.node.b;
import com.taobao.android.dinamicx.view.richtext.span.CloneableUnderlineSpan;
import com.taobao.android.dinamicx.view.richtext.span.e;
import com.taobao.android.dinamicx.view.richtext.span.g;
import java.util.LinkedList;
import java.util.List;
import tb.gbg;
import tb.kge;

/* loaded from: classes5.dex */
public class c implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NONE_STRIKE_THROUGH = 0;
    public static final int NONE_UNDERLINE = 0;
    public static final String PADDING_TEXT = " ";
    private int A;
    private float B;
    private int C;
    private int D;
    private int E;
    private int F;
    private List<Object> G;
    private com.taobao.android.dinamicx.view.richtext.span.b H;
    private com.taobao.android.dinamicx.view.richtext.span.a I;
    private com.taobao.android.dinamicx.view.richtext.span.b J;
    private com.taobao.android.dinamicx.view.richtext.span.a K;

    /* renamed from: a  reason: collision with root package name */
    private String f11976a;
    private int b;
    private Integer c;
    private boolean d;
    private boolean e;
    private String f;
    private AssetManager g;
    private int h;
    private int i;
    private int[] j;
    private int k;
    private int l;
    private int m;
    private int[] n;
    private int o;
    private int p;
    private int q;
    private int r;
    private String s;
    private String t;
    private b.a u;
    private b.InterfaceC0479b v;
    private b.d w;
    private b.c x;
    private float y;
    private float z;

    static {
        kge.a(1718702541);
        kge.a(251646921);
    }

    public static /* synthetic */ float a(c cVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51379ffe", new Object[]{cVar, new Float(f)})).floatValue();
        }
        cVar.y = f;
        return f;
    }

    public static /* synthetic */ int a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5137ab44", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.b = i;
        return i;
    }

    public static /* synthetic */ AssetManager a(c cVar, AssetManager assetManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssetManager) ipChange.ipc$dispatch("c2420004", new Object[]{cVar, assetManager});
        }
        cVar.g = assetManager;
        return assetManager;
    }

    public static /* synthetic */ b.a a(c cVar, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("133a7224", new Object[]{cVar, aVar});
        }
        cVar.u = aVar;
        return aVar;
    }

    public static /* synthetic */ b.InterfaceC0479b a(c cVar, b.InterfaceC0479b interfaceC0479b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.InterfaceC0479b) ipChange.ipc$dispatch("3c8ec784", new Object[]{cVar, interfaceC0479b});
        }
        cVar.v = interfaceC0479b;
        return interfaceC0479b;
    }

    public static /* synthetic */ b.c a(c cVar, b.c cVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.c) ipChange.ipc$dispatch("65e31ce4", new Object[]{cVar, cVar2});
        }
        cVar.x = cVar2;
        return cVar2;
    }

    public static /* synthetic */ b.d a(c cVar, b.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.d) ipChange.ipc$dispatch("8f377244", new Object[]{cVar, dVar});
        }
        cVar.w = dVar;
        return dVar;
    }

    public static /* synthetic */ Integer a(c cVar, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("53fbd32c", new Object[]{cVar, num});
        }
        cVar.c = num;
        return num;
    }

    public static /* synthetic */ String a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8c2d0ee", new Object[]{cVar}) : cVar.s;
    }

    public static /* synthetic */ String a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84dbfce4", new Object[]{cVar, str});
        }
        cVar.f11976a = str;
        return str;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5137eb26", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.d = z;
        return z;
    }

    public static /* synthetic */ int[] a(c cVar, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("e305b064", new Object[]{cVar, iArr});
        }
        cVar.j = iArr;
        return iArr;
    }

    public static /* synthetic */ float b(c cVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("526df2dd", new Object[]{cVar, new Float(f)})).floatValue();
        }
        cVar.z = f;
        return f;
    }

    public static /* synthetic */ int b(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("526dfe23", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.h = i;
        return i;
    }

    public static /* synthetic */ b.a b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("81ed2191", new Object[]{cVar}) : cVar.u;
    }

    public static /* synthetic */ String b(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bcccd803", new Object[]{cVar, str});
        }
        cVar.f = str;
        return str;
    }

    public static /* synthetic */ boolean b(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("526e3e05", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.e = z;
        return z;
    }

    public static /* synthetic */ int[] b(c cVar, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("6ff2c783", new Object[]{cVar, iArr});
        }
        cVar.n = iArr;
        return iArr;
    }

    public static /* synthetic */ float c(c cVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a445bc", new Object[]{cVar, new Float(f)})).floatValue();
        }
        cVar.B = f;
        return f;
    }

    public static /* synthetic */ int c(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a45102", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.i = i;
        return i;
    }

    public static /* synthetic */ String c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d583aac", new Object[]{cVar}) : cVar.t;
    }

    public static /* synthetic */ String c(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4bdb322", new Object[]{cVar, str});
        }
        cVar.s = str;
        return str;
    }

    public static /* synthetic */ int d(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54daa3e1", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.k = i;
        return i;
    }

    public static /* synthetic */ b.InterfaceC0479b d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.InterfaceC0479b) ipChange.ipc$dispatch("5cc69bee", new Object[]{cVar}) : cVar.v;
    }

    public static /* synthetic */ String d(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2cae8e41", new Object[]{cVar, str});
        }
        cVar.t = str;
        return str;
    }

    public static /* synthetic */ int e(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5610f6c0", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.p = i;
        return i;
    }

    public static /* synthetic */ b.d e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.d) ipChange.ipc$dispatch("ca33594b", new Object[]{cVar}) : cVar.w;
    }

    public static /* synthetic */ int f(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5747499f", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.o = i;
        return i;
    }

    public static /* synthetic */ b.c f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.c) ipChange.ipc$dispatch("37a0164b", new Object[]{cVar}) : cVar.x;
    }

    public static /* synthetic */ int g(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("587d9c7e", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.r = i;
        return i;
    }

    public static /* synthetic */ int h(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59b3ef5d", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.q = i;
        return i;
    }

    public static /* synthetic */ int i(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5aea423c", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.A = i;
        return i;
    }

    public static /* synthetic */ int j(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c20951b", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.C = i;
        return i;
    }

    public static /* synthetic */ int k(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d56e7fa", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.D = i;
        return i;
    }

    public static /* synthetic */ int l(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e8d3ad9", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.E = i;
        return i;
    }

    public static /* synthetic */ int m(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fc38db8", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.F = i;
        return i;
    }

    public static /* synthetic */ int n(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60f9e097", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.l = i;
        return i;
    }

    public static /* synthetic */ int o(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62303376", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.m = i;
        return i;
    }

    private c() {
    }

    public List<Object> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("95ad395b", new Object[]{this, new Boolean(z)});
        }
        if (!z || this.G == null) {
            this.G = d();
        }
        return this.G;
    }

    @Override // com.taobao.android.dinamicx.view.richtext.node.b
    public Spanned b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Spanned) ipChange.ipc$dispatch("e4c32859", new Object[]{this, new Boolean(z)});
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.C > 0) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new e(this.C), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        List<Object> a2 = a(z);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) b());
        for (Object obj : a2) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
        }
        if (this.D > 0) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new e(this.D), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    private List<Object> d() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        LinkedList linkedList = new LinkedList();
        int i2 = this.b;
        if (i2 > 0) {
            linkedList.add(new AbsoluteSizeSpan(i2, true));
        }
        Integer num = this.c;
        if (num != null) {
            linkedList.add(new ForegroundColorSpan(num.intValue()));
        }
        if (this.o != 0) {
            linkedList.add(new CloneableUnderlineSpan(this.p));
        }
        if (this.q != 0) {
            linkedList.add(new StrikethroughSpan());
        }
        if (this.d) {
            linkedList.add(new StyleSpan(1));
        }
        if (this.e) {
            linkedList.add(new StyleSpan(2));
        }
        int i3 = this.h;
        if (i3 != 0) {
            linkedList.add(new BackgroundColorSpan(i3));
        }
        this.H = new com.taobao.android.dinamicx.view.richtext.span.b();
        this.I = new com.taobao.android.dinamicx.view.richtext.span.a();
        this.J = new com.taobao.android.dinamicx.view.richtext.span.b();
        this.K = new com.taobao.android.dinamicx.view.richtext.span.a();
        linkedList.add(this.H);
        linkedList.add(this.I);
        linkedList.add(this.J);
        linkedList.add(this.K);
        if (this.u != null) {
            this.H.a(new com.taobao.android.dinamicx.view.richtext.b() { // from class: com.taobao.android.dinamicx.view.richtext.node.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.b
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        c.b(c.this).a(c.a(c.this));
                    }
                }
            });
        }
        if (this.v != null) {
            this.I.a(new d() { // from class: com.taobao.android.dinamicx.view.richtext.node.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.d
                public boolean a(View view) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue() : c.d(c.this).a(c.c(c.this));
                }
            });
        }
        if (this.w != null) {
            this.J.a(new com.taobao.android.dinamicx.view.richtext.b() { // from class: com.taobao.android.dinamicx.view.richtext.node.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.b
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        c.e(c.this).a();
                    }
                }
            });
        }
        if (this.x != null) {
            this.K.a(new d() { // from class: com.taobao.android.dinamicx.view.richtext.node.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.d
                public boolean a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
                    }
                    c.f(c.this).a();
                    return true;
                }
            });
        }
        float f = this.B;
        if (f != 0.0f && (i = this.A) != 0) {
            linkedList.add(new com.taobao.android.dinamicx.view.richtext.span.d(f, this.y, this.z, i));
        }
        if (this.f != null && this.g != null && Build.VERSION.SDK_INT >= 28) {
            com.taobao.android.dinamicx.view.richtext.c a2 = com.taobao.android.dinamicx.view.richtext.c.a();
            String str = this.f;
            linkedList.add(new TypefaceSpan(a2.a(str, Typeface.createFromAsset(this.g, str))));
        }
        if ((e() && this.i != 0) || (this.h != 0 && (f() || g()))) {
            linkedList.add(new g(this.c, this.j, this.i, this.k, this.l, this.m, this.h, this.n, this.C, this.D, this.E, this.F));
        }
        return linkedList;
    }

    @Override // com.taobao.android.dinamicx.view.richtext.node.b
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        String str = " ";
        sb.append(this.C > 0 ? str : "");
        sb.append(this.f11976a);
        if (this.D <= 0) {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b;
    }

    public Integer c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("9a45f411", new Object[]{this}) : this.c;
    }

    public void a(b.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2d14e13", new Object[]{this, dVar});
            return;
        }
        this.w = dVar;
        this.J.a(new com.taobao.android.dinamicx.view.richtext.b() { // from class: com.taobao.android.dinamicx.view.richtext.node.c.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.view.richtext.b
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    c.e(c.this).a();
                }
            }
        });
    }

    public void a(b.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2d0d9b4", new Object[]{this, cVar});
            return;
        }
        this.x = cVar;
        this.K.a(new d() { // from class: com.taobao.android.dinamicx.view.richtext.node.c.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.view.richtext.d
            public boolean a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
                }
                c.f(c.this).a();
                return true;
            }
        });
    }

    public void a(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2cff0f6", new Object[]{this, aVar});
            return;
        }
        this.u = aVar;
        if (this.G == null) {
            this.G = d();
        } else {
            this.H.a(new com.taobao.android.dinamicx.view.richtext.b() { // from class: com.taobao.android.dinamicx.view.richtext.node.c.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.b
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        c.b(c.this).a(c.a(c.this));
                    }
                }
            });
        }
    }

    public void a(b.InterfaceC0479b interfaceC0479b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2d06555", new Object[]{this, interfaceC0479b});
            return;
        }
        this.v = interfaceC0479b;
        if (this.G == null) {
            this.G = d();
        } else {
            this.I.a(new d() { // from class: com.taobao.android.dinamicx.view.richtext.node.c.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.d
                public boolean a(View view) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue() : c.d(c.this).a(c.c(c.this));
                }
            });
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        int[] iArr = this.j;
        if (iArr != null && iArr.length == 4) {
            for (int i : iArr) {
                if (i > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        int[] iArr = this.n;
        if (iArr != null && iArr.length == 4) {
            for (int i : iArr) {
                if (i > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.C > 0 || this.D > 0 || this.E > 0 || this.F > 0;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float A;
        private int B;
        private float C;
        private int D;
        private int E;
        private int F;
        private int G;
        private final DinamicXEngine H;

        /* renamed from: a  reason: collision with root package name */
        private String f11985a;
        private int b;
        private Integer c;
        private boolean d;
        private boolean e;
        private String f;
        private AssetManager g;
        private int h;
        private int i;
        private int[] j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int[] o;
        private int q;
        private int s;
        private String t;
        private String u;
        private b.a v;
        private b.InterfaceC0479b w;
        private b.d x;
        private b.c y;
        private float z;
        private int p = 0;
        private int r = 0;

        static {
            kge.a(-737932380);
        }

        public a(String str, DinamicXEngine dinamicXEngine) {
            this.f11985a = str;
            this.H = dinamicXEngine;
        }

        public c a() {
            int i;
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("416c82f8", new Object[]{this});
            }
            c cVar = new c();
            c.a(cVar, this.f11985a);
            c.a(cVar, this.b);
            c.a(cVar, this.c);
            c.a(cVar, this.d);
            c.b(cVar, this.e);
            c.b(cVar, this.f);
            c.a(cVar, this.g);
            c.b(cVar, this.h);
            c.c(cVar, this.i);
            c.d(cVar, this.k);
            c.e(cVar, this.q);
            c.f(cVar, this.p);
            c.g(cVar, this.s);
            c.h(cVar, this.r);
            c.c(cVar, this.t);
            c.d(cVar, this.u);
            c.a(cVar, this.v);
            c.a(cVar, this.w);
            c.a(cVar, this.x);
            c.a(cVar, this.y);
            c.i(cVar, this.B);
            c.a(cVar, this.z);
            c.b(cVar, this.A);
            c.c(cVar, this.C);
            c.j(cVar, this.D);
            c.k(cVar, this.E);
            c.l(cVar, this.F);
            c.m(cVar, this.G);
            c.a(cVar, this.j);
            int i3 = this.n;
            if (i3 > 0) {
                c.b(cVar, new int[]{i3, i3, i3, i3});
            } else {
                c.b(cVar, this.o);
            }
            if (this.k == 1) {
                if (this.l < 0 && DinamicXEngine.i() != null) {
                    i = gbg.a(this.H, DinamicXEngine.i(), 6.0f);
                } else {
                    i = Math.max(0, this.l);
                }
                if (this.m < 0 && DinamicXEngine.i() != null) {
                    i2 = gbg.a(this.H, DinamicXEngine.i(), 4.0f);
                } else {
                    i2 = Math.max(0, this.m);
                }
            } else {
                i = 0;
            }
            c.n(cVar, i);
            c.o(cVar, i2);
            return cVar;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fd2d9488", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("22c19d89", new Object[]{this, new Integer(i)});
            }
            this.c = Integer.valueOf(i);
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b900fd17", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("de950618", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public a a(AssetManager assetManager, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b522e144", new Object[]{this, assetManager, str});
            }
            this.f = str;
            this.g = assetManager;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4855a68a", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6de9af8b", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }

        public a a(int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1b0c96cd", new Object[]{this, iArr});
            }
            this.j = iArr;
            return this;
        }

        public a e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("937db88c", new Object[]{this, new Integer(i)});
            }
            this.k = i;
            return this;
        }

        public a f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b911c18d", new Object[]{this, new Integer(i)});
            }
            this.l = i;
            return this;
        }

        public a g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dea5ca8e", new Object[]{this, new Integer(i)});
            }
            this.m = i;
            return this;
        }

        public a h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("439d38f", new Object[]{this, new Integer(i)});
            }
            this.n = i;
            return this;
        }

        public a b(int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a7f9adec", new Object[]{this, iArr});
            }
            this.o = iArr;
            return this;
        }

        public a i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("29cddc90", new Object[]{this, new Integer(i)});
            }
            this.p = i;
            return this;
        }

        public a j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4f61e591", new Object[]{this, new Integer(i)});
            }
            this.q = i;
            return this;
        }

        public a k(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("74f5ee92", new Object[]{this, new Integer(i)});
            }
            this.r = i;
            return this;
        }

        public a l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9a89f793", new Object[]{this, new Integer(i)});
            }
            this.s = i;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("24e0ea91", new Object[]{this, str});
            }
            this.t = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3f51e3b0", new Object[]{this, str});
            }
            this.u = str;
            return this;
        }

        public a a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("aedb18ab", new Object[]{this, new Float(f)});
            }
            this.z = f;
            return this;
        }

        public a b(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d46f21ac", new Object[]{this, new Float(f)});
            }
            this.A = f;
            return this;
        }

        public a m(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c01e0094", new Object[]{this, new Integer(i)});
            }
            this.B = i;
            return this;
        }

        public a c(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fa032aad", new Object[]{this, new Float(f)});
            }
            this.C = f;
            return this;
        }

        public a n(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e5b20995", new Object[]{this, new Integer(i)});
            }
            this.D = i;
            return this;
        }

        public a o(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b461296", new Object[]{this, new Integer(i)});
            }
            this.E = i;
            return this;
        }

        public a p(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("30da1b97", new Object[]{this, new Integer(i)});
            }
            this.F = i;
            return this;
        }

        public a q(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("566e2498", new Object[]{this, new Integer(i)});
            }
            this.G = i;
            return this;
        }
    }
}
