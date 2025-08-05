package tb;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.support.v4.view.GravityCompat;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.tbliveinteractive.dx.view.TLComponentProgress;
import com.taobao.weex.common.Constants;
import tb.mto;

/* loaded from: classes8.dex */
public class qmu extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTLCOMPONENTPROGRESS_PROGRESS = 5587939702916175485L;
    public static final long DXTLCOMPONENTPROGRESS_PROGRESSCOLOR = -8545652221886607999L;
    public static final long DXTLCOMPONENTPROGRESS_PROGRESSRADIUS = -6301719628307304725L;
    public static final long DXTLCOMPONENTPROGRESS_PROGRESSWIDTH = -8544938226242412414L;
    public static final long DXTLCOMPONENTPROGRESS_STYLE = 19483287734262L;
    public static final long DXTLCOMPONENTPROGRESS_TLCOMPONENTPROGRESS = 1265485127565201339L;
    private int b;
    private int c;
    private int d;

    /* renamed from: a  reason: collision with root package name */
    private double f32946a = mto.a.GEO_NOT_SUPPORT;
    private String e = "circle";

    static {
        kge.a(-1025682173);
    }

    public static /* synthetic */ Object ipc$super(qmu qmuVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
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

    /* loaded from: classes8.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(405567706);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new qmu();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new qmu();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof qmu)) {
        } else {
            super.onClone(dXWidgetNode, z);
            qmu qmuVar = (qmu) dXWidgetNode;
            this.f32946a = qmuVar.f32946a;
            this.b = qmuVar.b;
            this.c = qmuVar.c;
            this.d = qmuVar.d;
            this.e = qmuVar.e;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        Log.e("DXTLComponentProgress", "onCreateView ===== style = " + this.e);
        if (Constants.Value.HORIZONTAL.equals(this.e)) {
            ProgressBar progressBar = new ProgressBar(context, null, 16842872);
            progressBar.setMax(100);
            return progressBar;
        }
        return new TLComponentProgress(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        Log.e("DXTLComponentProgress", "onRenderView ===== style = " + this.e + " progress = " + this.f32946a + " progressColor = " + this.b);
        if (view instanceof TLComponentProgress) {
            TLComponentProgress tLComponentProgress = (TLComponentProgress) view;
            tLComponentProgress.setProgress(this.f32946a);
            tLComponentProgress.setProgressColor(this.b);
            tLComponentProgress.setProgressRadius(this.c);
            tLComponentProgress.setProgressWidth(this.d);
            tLComponentProgress.postInvalidate();
        } else if (!(view instanceof ProgressBar)) {
        } else {
            ProgressBar progressBar = (ProgressBar) view;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(b.a(context, 4.0f));
            gradientDrawable.setColor(this.b);
            ((LayerDrawable) progressBar.getProgressDrawable()).setDrawableByLayerId(16908301, new ScaleDrawable(gradientDrawable, GravityCompat.START, 1.0f, -1.0f));
            progressBar.setProgress((int) this.f32946a);
        }
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
            return;
        }
        Log.e("DXTLComponentProgress", "onSetStringAttribute ===== key = " + j + " attr = " + str);
        if (j == DXTLCOMPONENTPROGRESS_STYLE) {
            this.e = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
            return;
        }
        Log.e("DXTLComponentProgress", "onSetDoubleAttribute ===== key = " + j + " attr = " + d);
        if (j == DXTLCOMPONENTPROGRESS_PROGRESS) {
            this.f32946a = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        Log.e("DXTLComponentProgress", "onSetIntAttribute ===== key = " + j + " attr = " + i);
        if (j == DXTLCOMPONENTPROGRESS_PROGRESSCOLOR) {
            this.b = i;
        } else if (j == DXTLCOMPONENTPROGRESS_PROGRESSRADIUS) {
            this.c = i;
        } else if (j == DXTLCOMPONENTPROGRESS_PROGRESSWIDTH) {
            this.d = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : j == DXTLCOMPONENTPROGRESS_STYLE ? "circle" : super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue() : j == DXTLCOMPONENTPROGRESS_PROGRESS ? mto.a.GEO_NOT_SUPPORT : super.getDefaultValueForDoubleAttr(j);
    }
}
