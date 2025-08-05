package com.taobao.android.icart.widget.richtext;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.style.ClickableSpan;
import android.text.style.DynamicDrawableSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.widget.richtext.d;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends DXImageWidgetNode implements d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCARTIMAGESPAN_CARTIMAGESPAN = 2909787473734622988L;
    public static final long DXCARTIMAGESPAN_IMAGEURL = 3520785955321526846L;
    public static final long DXCARTTEXTSPAN_EVENT_TAP = 18903999933159L;

    /* renamed from: a  reason: collision with root package name */
    private String f12890a;
    private boolean b;
    private List<Object> c;
    private ClickableSpan d = new ClickableSpan() { // from class: com.taobao.android.icart.widget.richtext.a.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                a.this.postEvent(new DXEvent(18903999933159L));
            }
        }
    };

    static {
        kge.a(1866337155);
        kge.a(28671958);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
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

    public static /* synthetic */ List a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7d4d1a5d", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ List a(a aVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3f50014c", new Object[]{aVar, list});
        }
        aVar.c = list;
        return list;
    }

    public static /* synthetic */ String b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("db7f1755", new Object[]{aVar}) : aVar.f12890a;
    }

    public static /* synthetic */ boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68c382b0", new Object[]{aVar})).booleanValue() : aVar.b;
    }

    public static /* synthetic */ void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684d1cad", new Object[]{aVar});
        } else {
            aVar.a();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof a)) {
        } else {
            super.onClone(dXWidgetNode, z);
            this.f12890a = ((a) dXWidgetNode).f12890a;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else {
            super.onRenderView(context, view);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        super.onBindEvent(context, view, j);
        if (j != 18903999933159L) {
            return;
        }
        this.b = true;
        a();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 3520785955321526846L) {
            this.f12890a = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.icart.widget.richtext.d.a
    public d a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("f100c5cf", new Object[]{this, eVar}) : new d() { // from class: com.taobao.android.icart.widget.richtext.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.icart.widget.richtext.d
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "[image]";
            }

            @Override // com.taobao.android.icart.widget.richtext.d
            public List<Object> a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("95ad395b", new Object[]{this, new Boolean(z)});
                }
                if (a.a(a.this) == null || z) {
                    a.a(a.this, new LinkedList());
                    a aVar = a.this;
                    C0504a c0504a = new C0504a(aVar.getLayoutWidth(), a.this.getLayoutHeight(), a.this.getMarginLeft(), a.this.getMarginRight());
                    a.a(a.this).add(c0504a);
                    c0504a.a(a.b(a.this));
                    if (a.c(a.this)) {
                        a.d(a.this);
                    }
                }
                return a.a(a.this);
            }
        };
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<Object> list = this.c;
        if (list == null || list.contains(this.d)) {
            return;
        }
        this.c.add(this.d);
    }

    /* renamed from: com.taobao.android.icart.widget.richtext.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0504a extends DynamicDrawableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private int c;
        private Drawable d;
        private Drawable e;
        private int f;
        private int g;
        private int h;
        private int i;

        static {
            kge.a(-1961526250);
        }

        public static /* synthetic */ Object ipc$super(C0504a c0504a, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public C0504a(int i, int i2, int i3, int i4) {
            this.b = i;
            this.c = i2;
            this.h = i;
            this.i = i2;
            this.f = i3;
            this.g = i4;
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue() : this.b + this.f + this.g;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                com.taobao.phenix.intf.b.h().a(a.this.getDXRuntimeContext().m()).a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.icart.widget.richtext.a.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                    }

                    public boolean a(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        BitmapDrawable drawable = succPhenixEvent.getDrawable();
                        if (drawable != null) {
                            C0504a.this.a(drawable.getBitmap(), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            DXWidgetNode parentWidget = a.this.getParentWidget();
                            if (parentWidget != null) {
                                parentWidget.requestLayout();
                            }
                        }
                        return true;
                    }
                }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.android.icart.widget.richtext.a.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public boolean a(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                        }
                        return false;
                    }

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                    }
                }).fetch();
            }
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
                return;
            }
            try {
                Drawable drawable = getDrawable();
                canvas.save();
                canvas.translate(f + this.f, (((i5 - i3) - drawable.getBounds().bottom) / 2) + i3);
                drawable.draw(canvas);
                canvas.restore();
            } catch (Exception unused) {
            }
        }

        @Override // android.text.style.DynamicDrawableSpan
        public Drawable getDrawable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("bbe7333f", new Object[]{this});
            }
            Drawable drawable = this.e;
            if (drawable == null) {
                return a();
            }
            this.d = null;
            return drawable;
        }

        public void a(Bitmap bitmap, float f, float f2) {
            boolean z;
            IpChange ipChange = $ipChange;
            boolean z2 = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("805c5146", new Object[]{this, bitmap, new Float(f), new Float(f2)});
                return;
            }
            if (this.b == -2) {
                this.b = (int) f;
                z = true;
            } else {
                z = false;
            }
            if (this.c == -2) {
                this.c = (int) f2;
            } else {
                z2 = false;
            }
            if (z) {
                this.b = (int) ((f / f2) * this.c);
            }
            if (z2) {
                this.c = (int) ((f2 / f) * this.b);
            }
            if (z && z2) {
                this.b = (int) f;
                this.c = (int) f2;
            }
            this.e = new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, this.b, this.c, false));
            this.e.setBounds(0, 0, this.b, this.c);
        }

        private Drawable a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("1e792452", new Object[]{this});
            }
            if (this.d == null) {
                this.d = new ShapeDrawable();
            }
            return this.d;
        }
    }
}
