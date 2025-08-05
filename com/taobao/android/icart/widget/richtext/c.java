package com.taobao.android.icart.widget.richtext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.widget.richtext.d;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends DXWidgetNode implements d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCARTTEXTSPAN_CARTTEXTSPAN = 2262739378954091981L;
    public static final long DXCARTTEXTSPAN_EVENT_TAP = 18903999933159L;
    public static final long DXCARTTEXTSPAN_ISBOLD = 9423384817756195L;
    public static final long DXCARTTEXTSPAN_TEXT = 38178040921L;
    public static final long DXCARTTEXTSPAN_TEXTCOLOR = 5737767606580872653L;
    public static final long DXCARTTEXTSPAN_TEXTSIZE = 6751005219504497256L;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12897a;
    private boolean e;
    private List<Object> f;
    private e g;
    private String b = "";
    private int c = 16732160;
    private int d = 13;
    private ClickableSpan h = new ClickableSpan() { // from class: com.taobao.android.icart.widget.richtext.c.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                c.this.postEvent(new DXEvent(18903999933159L));
            }
        }
    };

    static {
        kge.a(1290436837);
        kge.a(28671958);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
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

    public static /* synthetic */ String a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a817a38", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ List a(c cVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0180ce", new Object[]{cVar, list});
        }
        cVar.f = list;
        return list;
    }

    public static /* synthetic */ List b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9702e1be", new Object[]{cVar}) : cVar.f;
    }

    public static /* synthetic */ int c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("68c46b5d", new Object[]{cVar})).intValue() : cVar.d;
    }

    public static /* synthetic */ int d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("684e055e", new Object[]{cVar})).intValue() : cVar.c;
    }

    public static /* synthetic */ boolean e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("67d79f70", new Object[]{cVar})).booleanValue() : cVar.f12897a;
    }

    public static /* synthetic */ boolean f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("67613971", new Object[]{cVar})).booleanValue() : cVar.e;
    }

    public static /* synthetic */ void g(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ead36e", new Object[]{cVar});
        } else {
            cVar.a();
        }
    }

    public static /* synthetic */ e h(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("1a6505", new Object[]{cVar}) : cVar.g;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new c();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof c)) {
        } else {
            super.onClone(dXWidgetNode, z);
            c cVar = (c) dXWidgetNode;
            this.f12897a = cVar.f12897a;
            this.b = cVar.b;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
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
        this.e = true;
        a();
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
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 38178040921L) {
            this.b = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 9423384817756195L) {
            if (i == 0) {
                z = false;
            }
            this.f12897a = z;
        } else if (j == 5737767606580872653L) {
            this.c = i;
        } else if (j == 6751005219504497256L) {
            this.d = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : j == 38178040921L ? "" : super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 5737767606580872653L) {
            return 16732160;
        }
        if (j != 6751005219504497256L) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 13;
    }

    @Override // com.taobao.android.icart.widget.richtext.d.a
    public d a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("f100c5cf", new Object[]{this, eVar});
        }
        this.g = eVar;
        return new d() { // from class: com.taobao.android.icart.widget.richtext.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.icart.widget.richtext.d
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : c.a(c.this);
            }

            @Override // com.taobao.android.icart.widget.richtext.d
            public List<Object> a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("95ad395b", new Object[]{this, new Boolean(z)});
                }
                if (c.b(c.this) == null || z) {
                    c.a(c.this, new LinkedList());
                    if (c.c(c.this) > 0) {
                        c.b(c.this).add(new AbsoluteSizeSpan(c.c(c.this), true));
                    }
                    if (c.d(c.this) != 0) {
                        c.b(c.this).add(new ForegroundColorSpan(c.d(c.this)));
                    }
                    if (c.this.getBorderWidth() > 0) {
                        c cVar = c.this;
                        a aVar = new a(c.d(cVar), c.this.getBorderColor(), c.c(c.this), c.this.getBorderWidth(), c.this.getCornerRadius());
                        aVar.a(c.this.getPaddingLeft());
                        aVar.b(c.this.getPaddingRight());
                        c.b(c.this).add(aVar);
                    }
                    if (c.e(c.this)) {
                        c.b(c.this).add(new StyleSpan(1));
                    }
                    if (c.f(c.this)) {
                        c.g(c.this);
                    }
                }
                return c.b(c.this);
            }
        };
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<Object> list = this.f;
        if (list == null || list.contains(this.h)) {
            return;
        }
        this.f.add(this.h);
    }

    /* loaded from: classes5.dex */
    public class a extends ReplacementSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private int c;
        private float d;
        private ShapeDrawable e;
        private int f;
        private int g;
        private int h;

        static {
            kge.a(748815672);
        }

        public a(int i, int i2, float f, int i3, int i4) {
            this.f = i3;
            this.c = i;
            this.d = f;
            float f2 = i4;
            this.e = new ShapeDrawable(new RoundRectShape(new float[]{f2, f2, f2, f2, f2, f2, f2, f2}, null, null));
            this.e.getPaint().setColor(i2);
            this.e.getPaint().setStyle(Paint.Style.STROKE);
            this.e.getPaint().setStrokeWidth(i3);
            this.e.getPaint().setAntiAlias(true);
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.g = i;
            }
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                this.h = i;
            }
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
            }
            this.b = ((int) paint.measureText(charSequence, i, i2)) + this.g + this.h;
            return this.b;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            int i6 = i5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i6), paint});
                return;
            }
            int color = paint.getColor();
            float textSize = paint.getTextSize();
            paint.setTextSize(this.d);
            paint.setColor(this.c);
            canvas.save();
            Layout c = c.h(c.this).c();
            if (c != null) {
                if (c.getLineForVertical(i3) + 1 < c.getLineCount()) {
                    i6 = (int) (i6 - c.h(c.this).b());
                }
                int i7 = (int) f;
                int i8 = this.f;
                this.e.setBounds(new Rect(i7 + i8, i3 + i8, i7 + this.b, i6 - i8));
                this.e.draw(canvas);
            }
            int i9 = this.g;
            if (i9 != 0) {
                canvas.translate(i9, 0.0f);
            }
            canvas.drawText(charSequence, i, i2, f, i4, paint);
            canvas.restore();
            paint.setColor(color);
            paint.setTextSize(textSize);
        }
    }
}
