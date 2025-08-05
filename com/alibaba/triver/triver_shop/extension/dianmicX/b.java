package com.alibaba.triver.triver_shop.extension.dianmicX;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import java.util.List;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;

/* loaded from: classes3.dex */
public final class b extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0133b Companion;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONCOLOR = 2996147367631721393L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONSIZE = 3509390040415201356L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONTEXT = 3509390044709645142L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTCHANGEINTERVAL = 7049944458799027695L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTFLOATIMAGEURL = -8665795671564898961L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTLEFTPADDING = 6321539507945389731L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTLIST = -8683323834787387402L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTLOOPCOUNT = -3977750061979067390L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTRIGHTPADDING = 7075488932839357975L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_MAINIMAGECENTERYOFFSET = 1259256982731614911L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_MAINIMAGESIZE = 2108547873344541232L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_MAINIMAGEURL = 8579252501965633479L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_MAINOUTERIMAGESIZE = -1433620236813297852L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_MAINOUTERIMAGEURL = 7971744606345147355L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_SHOPBOTTOMBARDYNAMICICON = -4074703705987044470L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDCORNERRADIUS = -5849195966042282832L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDGRADIENTCOLOR = 5585097863839760653L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDHEIGHT = 6854205013373350962L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDMINWIDTH = 8383158790589313023L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDWIDTH = 6835572299126697432L;

    /* renamed from: a  reason: collision with root package name */
    private int f3775a;
    private int b;
    private String c;
    private int d;
    private String e;
    private int f;
    private JSONArray g;
    private int h;
    private int i;
    private int j;
    private int k;
    private String l;
    private int m;
    private String n;
    private int o;
    private String p;
    private int q;
    private int r;
    private int s;
    private Tab3AnimationIcon t;

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public c(View view) {
            this.b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int a2 = b.a(b.this) + b.b(b.this);
            b bVar = b.this;
            TextPaint paint = ((Tab3AnimationIcon) this.b).getIconText().getPaint();
            q.b(paint, "weakView.iconText.paint");
            o.b(((Tab3AnimationIcon) this.b).getIconText(), Math.max(Math.min(b.a(bVar, paint) + a2, ((Tab3AnimationIcon) this.b).getWidth()), b.c(b.this)));
        }
    }

    static {
        kge.a(799182996);
        Companion = new C0133b(null);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ int a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3206419e", new Object[]{bVar})).intValue() : bVar.f;
    }

    public static final /* synthetic */ int a(b bVar, Paint paint) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25dd38b3", new Object[]{bVar, paint})).intValue() : bVar.a(paint);
    }

    public static final /* synthetic */ int b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bef358bd", new Object[]{bVar})).intValue() : bVar.i;
    }

    public static final /* synthetic */ int c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4be06fdc", new Object[]{bVar})).intValue() : bVar.r;
    }

    /* loaded from: classes3.dex */
    public static final class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1337355413);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new b();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new b();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof b)) {
        } else {
            super.onClone(dXWidgetNode, z);
            b bVar = (b) dXWidgetNode;
            this.f3775a = bVar.f3775a;
            this.b = bVar.b;
            this.c = bVar.c;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        q.d(context, "context");
        Tab3AnimationIcon tab3AnimationIcon = new Tab3AnimationIcon(context);
        this.t = tab3AnimationIcon;
        return tab3AnimationIcon;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View weakView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, weakView});
            return;
        }
        q.d(context, "context");
        q.d(weakView, "weakView");
        if (!(weakView instanceof Tab3AnimationIcon)) {
            return;
        }
        Tab3AnimationIcon tab3AnimationIcon = (Tab3AnimationIcon) weakView;
        tab3AnimationIcon.getIconText().setText(this.c);
        tab3AnimationIcon.getIconText().setTextSize(0, this.b);
        tab3AnimationIcon.getIconText().setTextColor(this.f3775a);
        o.a((View) tab3AnimationIcon.getIconText(), this.q);
        tab3AnimationIcon.getMainImage().setImageUrl(this.l);
        String str = this.p;
        if (str != null) {
            List a2 = n.a((CharSequence) str, new char[]{','}, false, 0, 6, (Object) null);
            o.a(tab3AnimationIcon.getFlIconText(), tab3AnimationIcon.getTab3IconTextBackgroundDrawable((String) p.a((List<? extends Object>) a2, 0), (String) p.a((List<? extends Object>) a2, 1), this.o));
        }
        tab3AnimationIcon.getIconTextFloatImage().setImageUrl(this.e);
        o.a(tab3AnimationIcon.getMainImageLayout(), this.k);
        o.b(tab3AnimationIcon.getMainImageLayout(), this.k);
        o.a(tab3AnimationIcon.getBorderImageLayout(), this.m);
        o.b(tab3AnimationIcon.getBorderImageLayout(), this.m);
        o.a(tab3AnimationIcon.getBorderImage2(), this.m);
        o.b(tab3AnimationIcon.getBorderImage2(), this.m);
        o.c(weakView, this.j);
        o.a((View) tab3AnimationIcon.getMainImageLayout(), true, this.k / 2);
        tab3AnimationIcon.getIconText().setPadding(this.f, 0, this.i, 0);
        int i = this.s + this.f + this.i;
        if (this.r != 0) {
            weakView.post(new c(weakView));
        } else {
            o.b(tab3AnimationIcon.getIconText(), i);
        }
        tab3AnimationIcon.startBreathAni();
        tab3AnimationIcon.startSwitchText(this.d, this.h, this.g);
    }

    private final int a(Paint paint) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b8e3c70", new Object[]{this, paint})).intValue();
        }
        JSONArray jSONArray = this.g;
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View weakView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, weakView, new Long(j)});
            return;
        }
        q.d(context, "context");
        q.d(weakView, "weakView");
        super.onBindEvent(context, weakView, j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTLIST) {
            this.g = jSONArray;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String attr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), attr});
            return;
        }
        q.d(attr, "attr");
        if (j == DXSHOPBOTTOMBARDYNAMICICON_ICONTEXT) {
            this.c = attr;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTFLOATIMAGEURL) {
            this.e = attr;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_MAINIMAGEURL) {
            this.l = attr;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_MAINOUTERIMAGEURL) {
            this.n = attr;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDGRADIENTCOLOR) {
            this.p = attr;
        } else {
            super.onSetStringAttribute(j, attr);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 2996147367631721393L) {
            this.f3775a = i;
        } else if (j == 3509390040415201356L) {
            this.b = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTCHANGEINTERVAL) {
            this.d = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTLEFTPADDING) {
            this.f = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTRIGHTPADDING) {
            this.i = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTLOOPCOUNT) {
            this.h = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_MAINIMAGECENTERYOFFSET) {
            this.j = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_MAINIMAGESIZE) {
            this.k = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_MAINOUTERIMAGESIZE) {
            this.m = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDCORNERRADIUS) {
            this.o = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDHEIGHT) {
            this.q = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDMINWIDTH) {
            this.r = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDWIDTH) {
            this.s = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    /* renamed from: com.alibaba.triver.triver_shop.extension.dianmicX.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0133b {
        static {
            kge.a(-1015688484);
        }

        public /* synthetic */ C0133b(kotlin.jvm.internal.o oVar) {
            this();
        }

        private C0133b() {
        }
    }
}
