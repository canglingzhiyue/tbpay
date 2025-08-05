package tb;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 =2\u00020\u0001:\u0002<=B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0004H\u0016J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004H\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0017H\u0002J$\u0010)\u001a\u00020&2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\u0004H\u0014J\u001a\u0010-\u001a\u00020&2\b\u0010.\u001a\u0004\u0018\u00010\u001f2\u0006\u0010/\u001a\u00020\u0014H\u0016J\u0014\u00100\u001a\u0004\u0018\u00010+2\b\u00101\u001a\u0004\u0018\u00010\u0012H\u0014J\u0012\u00102\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u000104H\u0014J\u0018\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0017H\u0014J\u001c\u00108\u001a\u00020&2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\u0018\u00109\u001a\u00020&2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u001cH\u0014J\u0018\u0010;\u001a\u00020&2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0017H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/view/DXTimingFastTextViewWidgetNode;", "Lcom/taobao/android/dinamicx/widget/DXTextViewWidgetNode;", "()V", "DXTIMINGFASTTEXTVIEW_ENABLETIMING", "", "getDXTIMINGFASTTEXTVIEW_ENABLETIMING", "()J", "DXTIMINGFASTTEXTVIEW_ENDTIMING", "getDXTIMINGFASTTEXTVIEW_ENDTIMING", "DXTIMINGFASTTEXTVIEW_MAXNUMBER", "getDXTIMINGFASTTEXTVIEW_MAXNUMBER", "DXTIMINGFASTTEXTVIEW_STARTTIMING", "getDXTIMINGFASTTEXTVIEW_STARTTIMING", "DXTIMINGFASTTEXTVIEW_TIME", "getDXTIMINGFASTTEXTVIEW_TIME", "DXTIMINGFASTTEXTVIEW_UNITTIME", "getDXTIMINGFASTTEXTVIEW_UNITTIME", "context", "Landroid/content/Context;", "enableTiming", "", "isShowAnimator", "maxNumber", "", "textViewWeak", "Ljava/lang/ref/WeakReference;", "Landroid/widget/TextView;", "time", "", "unitTime", CartRecommendRefreshScene.build, "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "object", "", "getDefaultValueForDoubleAttr", "key", "getDefaultValueForIntAttr", "numberTimer", "", "start", "end", "onBindEvent", "weakView", "Landroid/view/View;", "eventId", "onClone", "widgetNode", "deepClone", "onCreateView", "contexts", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "event", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onRenderView", "onSetDoubleAttribute", "attr", "onSetIntAttribute", "Builder", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class kjn extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private static final long m = -6015648658884232120L;
    private Context g;
    private WeakReference<TextView> l;

    /* renamed from: a  reason: collision with root package name */
    private final long f30121a = -8426698452625620517L;
    private final long b = -4540956244684704344L;
    private final long c = -2628053988755739208L;
    private final long d = -5466826991064791903L;
    private final long e = com.taobao.taolive.taolivemorelive.view.a.DXTBLIVETIMECOUNTVIEW_TIME;
    private final long f = 7055731183317973335L;
    private boolean h = true;
    private int i = 100;
    private double j = 2000.0d;
    private double k = 16.0d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "valueAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextView textView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            WeakReference a2 = kjn.a(kjn.this);
            if (a2 == null || (textView = (TextView) a2.get()) == null) {
                return;
            }
            q.b(valueAnimator, "valueAnimator");
            textView.setText(valueAnimator.getAnimatedValue().toString());
        }
    }

    public static /* synthetic */ Object ipc$super(kjn kjnVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/view/DXTimingFastTextViewWidgetNode$Companion;", "", "()V", "DXTIMINGFASTTEXTVIEW_TIMINGFASTTEXTVIEW", "", "getDXTIMINGFASTTEXTVIEW_TIMINGFASTTEXTVIEW", "()J", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : kjn.a();
        }
    }

    public static final /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : m;
    }

    public static final /* synthetic */ WeakReference a(kjn kjnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("b19b6ad7", new Object[]{kjnVar}) : kjnVar.l;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new kjn();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof kjn)) {
        } else {
            super.onClone(dXWidgetNode, z);
            kjn kjnVar = (kjn) dXWidgetNode;
            this.h = kjnVar.h;
            this.i = kjnVar.i;
            this.j = kjnVar.j;
            this.k = kjnVar.k;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        this.g = context;
        return super.onCreateView(this.g);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof TextView)) {
            return;
        }
        this.l = new WeakReference<>(view);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == this.e) {
            this.j = d;
        } else if (j == this.f) {
            this.k = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == this.f30121a) {
            if (i == 0) {
                z = false;
            }
            this.h = z;
        } else if (j == this.c) {
            this.i = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == this.e) {
            return 2000.0d;
        }
        if (j != this.f) {
            return super.getDefaultValueForDoubleAttr(j);
        }
        return 16.0d;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == this.f30121a) {
            return 1;
        }
        if (j != this.c) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 100;
    }

    private final void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ValueAnimator valueAnimator = ValueAnimator.ofInt(i, i2);
        valueAnimator.addUpdateListener(new b());
        q.b(valueAnimator, "valueAnimator");
        valueAnimator.setDuration((long) this.j);
        valueAnimator.start();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent != null && dXEvent.getEventId() == this.d && this.h) {
            a(0, this.i);
        } else {
            WeakReference<TextView> weakReference = this.l;
            if (weakReference != null && (textView = weakReference.get()) != null) {
                textView.setText(String.valueOf(this.i));
            }
        }
        return super.onEvent(dXEvent);
    }
}
