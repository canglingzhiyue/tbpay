package com.alibaba.triver.triver_shop.extension.dianmicX;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class a extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion;
    public static final long DXSHOPAUTOSCROLLTEXTVIEW_ISTEXTBOLD = -9084989998710340852L;
    public static final long DXSHOPAUTOSCROLLTEXTVIEW_SCROLLSPEED = -3216884856980908405L;
    public static final long DXSHOPAUTOSCROLLTEXTVIEW_SHOPAUTOSCROLLTEXTVIEW = -2560103441260165640L;
    public static final long DXSHOPAUTOSCROLLTEXTVIEW_TEXT = 38178040921L;
    public static final long DXSHOPAUTOSCROLLTEXTVIEW_TEXTCOLOR = 5737767606580872653L;
    public static final long DXSHOPAUTOSCROLLTEXTVIEW_TEXTSIZE = 6751005219504497256L;

    /* renamed from: a  reason: collision with root package name */
    private int f3774a;
    private String c;
    private int e;
    private AutoScrollTextView f;
    private double b = 10.0d;
    private int d = -1;

    static {
        kge.a(-57180366);
        Companion = new b(null);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
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

    /* renamed from: com.alibaba.triver.triver_shop.extension.dianmicX.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0132a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1789723657);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof a)) {
        } else {
            super.onClone(dXWidgetNode, z);
            a aVar = (a) dXWidgetNode;
            this.f3774a = aVar.f3774a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        q.d(context, "context");
        this.f = new AutoScrollTextView(context);
        AutoScrollTextView autoScrollTextView = this.f;
        q.a(autoScrollTextView);
        return autoScrollTextView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        q.d(context, "context");
        if (!(view instanceof AutoScrollTextView)) {
            return;
        }
        a((AutoScrollTextView) view);
    }

    private final void a(AutoScrollTextView autoScrollTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b23d15", new Object[]{this, autoScrollTextView});
            return;
        }
        autoScrollTextView.getTextView().setText(this.c);
        autoScrollTextView.getTextView().setTextSize(0, this.e);
        autoScrollTextView.getTextView().setTypeface(this.f3774a == 1 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        autoScrollTextView.getTextView().setTextColor(this.d);
        autoScrollTextView.setScrollTime((long) (this.b * 1000));
        autoScrollTextView.startScroll();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        q.d(context, "context");
        super.onBindEvent(context, view, j);
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
    public void onSetStringAttribute(long j, String attr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), attr});
            return;
        }
        q.d(attr, "attr");
        if (j == 38178040921L) {
            this.c = attr;
        } else {
            super.onSetStringAttribute(j, attr);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == -3216884856980908405L) {
            this.b = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXSHOPAUTOSCROLLTEXTVIEW_ISTEXTBOLD) {
            this.f3774a = i;
        } else if (j == 6751005219504497256L) {
            this.e = i;
        } else if (j == 5737767606580872653L) {
            this.d = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        static {
            kge.a(1925157882);
        }

        public /* synthetic */ b(o oVar) {
            this();
        }

        private b() {
        }
    }
}
