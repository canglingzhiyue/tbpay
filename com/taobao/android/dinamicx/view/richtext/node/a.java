package com.taobao.android.dinamicx.view.richtext.node;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.richtext.d;
import com.taobao.android.dinamicx.view.richtext.node.b;
import java.util.ArrayList;
import java.util.List;
import tb.fqi;
import tb.kge;
import tb.mto;

/* loaded from: classes5.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f11966a;
    private int b;
    private double c;
    private String d;
    private String e;
    private b.a f;
    private b.InterfaceC0479b g;
    private b.d h;
    private b.c i;
    private volatile List<Object> j;
    private com.taobao.android.dinamicx.view.richtext.span.b k;
    private com.taobao.android.dinamicx.view.richtext.span.a l;
    private com.taobao.android.dinamicx.view.richtext.span.b m;
    private com.taobao.android.dinamicx.view.richtext.span.a n;
    private int o;
    private int p;
    private double q;
    private int r;

    static {
        kge.a(1915255999);
        kge.a(251646921);
    }

    @Override // com.taobao.android.dinamicx.view.richtext.node.b
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "[image]";
    }

    public static /* synthetic */ double a(a aVar, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("511b6978", new Object[]{aVar, new Double(d)})).doubleValue();
        }
        aVar.c = d;
        return d;
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("511b7c42", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.f11966a = i;
        return i;
    }

    public static /* synthetic */ b.a a(a aVar, b.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("92e4a4a2", new Object[]{aVar, aVar2});
        }
        aVar.f = aVar2;
        return aVar2;
    }

    public static /* synthetic */ b.InterfaceC0479b a(a aVar, b.InterfaceC0479b interfaceC0479b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.InterfaceC0479b) ipChange.ipc$dispatch("bc38fa02", new Object[]{aVar, interfaceC0479b});
        }
        aVar.g = interfaceC0479b;
        return interfaceC0479b;
    }

    public static /* synthetic */ b.c a(a aVar, b.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.c) ipChange.ipc$dispatch("e58d4f62", new Object[]{aVar, cVar});
        }
        aVar.i = cVar;
        return cVar;
    }

    public static /* synthetic */ b.d a(a aVar, b.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.d) ipChange.ipc$dispatch("ee1a4c2", new Object[]{aVar, dVar});
        }
        aVar.h = dVar;
        return dVar;
    }

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef90e5ec", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ String a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2da0e62", new Object[]{aVar, str});
        }
        aVar.d = str;
        return str;
    }

    public static /* synthetic */ double b(a aVar, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5251bc57", new Object[]{aVar, new Double(d)})).doubleValue();
        }
        aVar.q = d;
        return d;
    }

    public static /* synthetic */ int b(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5251cf21", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.o = i;
        return i;
    }

    public static /* synthetic */ b.a b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("2f44770f", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ String b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2acae981", new Object[]{aVar, str});
        }
        aVar.e = str;
        return str;
    }

    public static /* synthetic */ int c(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53882200", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.b = i;
        return i;
    }

    public static /* synthetic */ String c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4264faa", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ int d(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54be74df", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.p = i;
        return i;
    }

    public static /* synthetic */ b.InterfaceC0479b d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.InterfaceC0479b) ipChange.ipc$dispatch("a1df16c", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ int e(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55f4c7be", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.r = i;
        return i;
    }

    public static /* synthetic */ b.d e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.d) ipChange.ipc$dispatch("778aaec9", new Object[]{aVar}) : aVar.h;
    }

    public static /* synthetic */ b.c f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.c) ipChange.ipc$dispatch("e4f76bc9", new Object[]{aVar}) : aVar.i;
    }

    private a() {
    }

    public List<Object> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : a(false);
    }

    public List<Object> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("95ad395b", new Object[]{this, new Boolean(z)});
        }
        if (this.j == null || z) {
            this.j = e();
        }
        return this.j;
    }

    @Override // com.taobao.android.dinamicx.view.richtext.node.b
    public Spanned b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Spanned) ipChange.ipc$dispatch("e4c32859", new Object[]{this, new Boolean(z)});
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List<Object> a2 = a(z);
        spannableStringBuilder.append((CharSequence) b());
        for (Object obj : a2) {
            spannableStringBuilder.setSpan(obj, 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public void a(Bitmap bitmap) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
            return;
        }
        if (this.j == null) {
            this.j = e();
        }
        for (Object obj : this.j) {
            if (obj instanceof com.taobao.android.dinamicx.view.richtext.span.c) {
                if (fqi.aP() && this.q <= mto.a.GEO_NOT_SUPPORT) {
                    this.q = bitmap.getWidth() / bitmap.getHeight();
                    double d = this.q;
                    this.c = d;
                    if (this.o <= 0 && (i2 = this.p) > 0) {
                        this.o = (int) Math.round(d * i2);
                        this.f11966a = this.o;
                        ((com.taobao.android.dinamicx.view.richtext.span.c) obj).b(this.f11966a);
                    } else if (this.p <= 0 && (i = this.o) > 0) {
                        this.p = (int) Math.round(i / this.q);
                        this.b = this.p;
                        ((com.taobao.android.dinamicx.view.richtext.span.c) obj).c(this.b);
                    }
                }
                ((com.taobao.android.dinamicx.view.richtext.span.c) obj).a(bitmap, this.r);
                return;
            }
        }
    }

    private List<Object> e() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd625b", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        if (this.c <= mto.a.GEO_NOT_SUPPORT) {
            this.c = 1.0d;
        }
        if (this.f11966a <= 0 && (i2 = this.b) > 0) {
            this.f11966a = (int) Math.round(this.c * i2);
        } else if (this.b <= 0 && (i = this.f11966a) > 0) {
            this.b = (int) Math.round(i / this.c);
        }
        arrayList.add(new com.taobao.android.dinamicx.view.richtext.span.c(Math.max(0, this.f11966a), Math.max(0, this.b)));
        this.k = new com.taobao.android.dinamicx.view.richtext.span.b();
        this.l = new com.taobao.android.dinamicx.view.richtext.span.a();
        this.m = new com.taobao.android.dinamicx.view.richtext.span.b();
        this.n = new com.taobao.android.dinamicx.view.richtext.span.a();
        arrayList.add(this.k);
        arrayList.add(this.l);
        arrayList.add(this.m);
        arrayList.add(this.n);
        if (this.f != null) {
            this.k.a(new com.taobao.android.dinamicx.view.richtext.b() { // from class: com.taobao.android.dinamicx.view.richtext.node.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.b
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        a.b(a.this).a(a.a(a.this));
                    }
                }
            });
        }
        if (this.g != null) {
            this.l.a(new d() { // from class: com.taobao.android.dinamicx.view.richtext.node.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.d
                public boolean a(View view) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue() : a.d(a.this).a(a.c(a.this));
                }
            });
        }
        if (this.h != null) {
            this.m.a(new com.taobao.android.dinamicx.view.richtext.b() { // from class: com.taobao.android.dinamicx.view.richtext.node.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.b
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        a.e(a.this).a();
                    }
                }
            });
        }
        if (this.i != null) {
            this.n.a(new d() { // from class: com.taobao.android.dinamicx.view.richtext.node.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.d
                public boolean a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
                    }
                    a.f(a.this).a();
                    return true;
                }
            });
        }
        return arrayList;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        f();
        return this.f11966a;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        f();
        return this.b;
    }

    public void a(b.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2d14e13", new Object[]{this, dVar});
            return;
        }
        this.h = dVar;
        this.m.a(new com.taobao.android.dinamicx.view.richtext.b() { // from class: com.taobao.android.dinamicx.view.richtext.node.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.view.richtext.b
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    a.e(a.this).a();
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
        this.i = cVar;
        this.n.a(new d() { // from class: com.taobao.android.dinamicx.view.richtext.node.a.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.view.richtext.d
            public boolean a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
                }
                a.f(a.this).a();
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
        this.f = aVar;
        if (this.j == null) {
            this.j = e();
        } else {
            this.k.a(new com.taobao.android.dinamicx.view.richtext.b() { // from class: com.taobao.android.dinamicx.view.richtext.node.a.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.b
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        a.b(a.this).a(a.a(a.this));
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
        this.g = interfaceC0479b;
        if (this.j == null) {
            this.j = e();
        } else {
            this.l.a(new d() { // from class: com.taobao.android.dinamicx.view.richtext.node.a.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.d
                public boolean a(View view) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue() : a.d(a.this).a(a.c(a.this));
                }
            });
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            a(i, false);
        }
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (this.j == null) {
            this.j = e();
        }
        for (Object obj : this.j) {
            if (obj instanceof com.taobao.android.dinamicx.view.richtext.span.c) {
                com.taobao.android.dinamicx.view.richtext.span.c cVar = (com.taobao.android.dinamicx.view.richtext.span.c) obj;
                if (z) {
                    i += cVar.a();
                }
                cVar.a(i);
            }
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.f11966a < 0 && this.b > 0) {
        } else {
            if (this.f11966a == 0) {
                this.f11966a = (int) Math.round(this.c * this.b);
            }
            if (this.b != 0) {
                return;
            }
            this.b = (int) Math.round(this.f11966a / this.c);
        }
    }

    /* renamed from: com.taobao.android.dinamicx.view.richtext.node.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0478a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f11975a;
        private int b;
        private double c;
        private String d;
        private String e;
        private b.a f;
        private b.InterfaceC0479b g;
        private b.d h;
        private b.c i;
        private int j;

        static {
            kge.a(-1683872618);
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("416c82ba", new Object[]{this});
            }
            a aVar = new a();
            a.a(aVar, this.f11975a);
            a.b(aVar, this.f11975a);
            a.c(aVar, this.b);
            a.d(aVar, this.b);
            a.a(aVar, this.c);
            a.b(aVar, this.c);
            a.e(aVar, this.j);
            a.a(aVar, this.d);
            a.b(aVar, this.e);
            a.a(aVar, this.f);
            a.a(aVar, this.g);
            a.a(aVar, this.h);
            a.a(aVar, this.i);
            return aVar;
        }

        public C0478a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0478a) ipChange.ipc$dispatch("fd2cabca", new Object[]{this, new Integer(i)});
            }
            this.f11975a = i;
            return this;
        }

        public C0478a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0478a) ipChange.ipc$dispatch("22c0b4cb", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public C0478a a(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0478a) ipChange.ipc$dispatch("7aa332af", new Object[]{this, new Double(d)});
            }
            this.c = d;
            return this;
        }

        public C0478a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0478a) ipChange.ipc$dispatch("24e001d3", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public C0478a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0478a) ipChange.ipc$dispatch("4854bdcc", new Object[]{this, new Integer(i)});
            }
            this.j = i;
            return this;
        }

        public C0478a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0478a) ipChange.ipc$dispatch("3f50faf2", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }
    }
}
