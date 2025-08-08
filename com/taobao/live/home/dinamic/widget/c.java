package com.taobao.live.home.dinamic.widget;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.dinamicx.widget.ak;
import java.lang.ref.WeakReference;
import tb.mto;

/* loaded from: classes7.dex */
public class c extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLLONGTEXTVIEW_AUTOMARQUEE = -5950721573490668908L;
    public static final long DXTBLLONGTEXTVIEW_AUTOSCROLLCOUNT = 7477792296168784448L;
    public static final long DXTBLLONGTEXTVIEW_MASKOFFSET = 246221371456618525L;
    public static final long DXTBLLONGTEXTVIEW_ONRENDERSTART = 475569627329002840L;
    public static final long DXTBLLONGTEXTVIEW_POSTDELAYTIME = 3435432043787506769L;
    public static final long DXTBLLONGTEXTVIEW_SCROLLSPEED = -3216884856980908405L;
    public static final long DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE = 8636106913325898820L;
    public static final int DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE_CHAR = 4;
    public static final int DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE_END = 3;
    public static final int DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE_MARQUEE = 5;
    public static final int DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE_MIDDLE = 2;
    public static final int DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE_NONE = 0;
    public static final int DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE_START = 1;
    public static final long DXTBLLONGTEXTVIEW_TBLLONGTEXTVIEW = -2687929348506082367L;
    public static final long DXTBLLONGTEXTVIEW_TBLNEEDTEXTGRADIENT = -2473910951344296284L;
    public static final long DXTBLLONGTEXTVIEW_TEXTANIMALTIME = 3840376292083896244L;

    /* renamed from: a  reason: collision with root package name */
    private boolean f17758a;
    private int b;
    private int d;
    private boolean e;
    private int f;
    private boolean g;
    private WeakReference<DXTBLNativeTextView> i;
    private long j;
    private double c = 20.0d;
    private double h = 5.0d;

    /* loaded from: classes7.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new c();
        }
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1440851004:
                super.onSetLongAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue());
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
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new c();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof c)) {
        } else {
            super.onClone(dXWidgetNode, z);
            c cVar = (c) dXWidgetNode;
            this.i = cVar.i;
            this.f17758a = cVar.f17758a;
            this.c = cVar.c;
            this.b = cVar.b;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.j = cVar.j;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXTBLNativeTextView dXTBLNativeTextView = new DXTBLNativeTextView(context);
        this.i = new WeakReference<>(dXTBLNativeTextView);
        return dXTBLNativeTextView;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof DXTBLNativeTextView)) {
            return;
        }
        DXTBLNativeTextView dXTBLNativeTextView = (DXTBLNativeTextView) view;
        this.i = new WeakReference<>(dXTBLNativeTextView);
        dXTBLNativeTextView.setAutoMarquee(this.f17758a);
        dXTBLNativeTextView.setPostDelayTime(this.d);
        int i = this.b;
        if (i > 0) {
            dXTBLNativeTextView.setMarqueeRepeatLimit(i);
        }
        long j = this.j;
        if (j > 0) {
            dXTBLNativeTextView.setTextAnimalTime(j);
        }
        if (this.h > mto.a.GEO_NOT_SUPPORT && Build.VERSION.SDK_INT >= 19) {
            dXTBLNativeTextView.setNewSpeed((float) this.h);
            dXTBLNativeTextView.startAnimalMarquee();
        }
        if (this.e) {
            dXTBLNativeTextView.startLongTextMarquee();
        } else {
            int i2 = this.f;
            if (i2 != -1) {
                setNativeEllipsize(dXTBLNativeTextView, i2);
                if (this.f == 5) {
                    dXTBLNativeTextView.startLongTextMarquee();
                }
            }
        }
        if (!this.g) {
            return;
        }
        dXTBLNativeTextView.setHorizontalFadingEdgeEnabled(true);
        double d = this.c;
        if (d <= mto.a.GEO_NOT_SUPPORT) {
            return;
        }
        dXTBLNativeTextView.setFadingEdgeLength((int) d);
    }

    @Override // com.taobao.android.dinamicx.widget.af
    public void setNativeEllipsize(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a49cb7a", new Object[]{this, textView, new Integer(i)});
        } else if (i == 0) {
            textView.setEllipsize(null);
        } else if (i == 1) {
            textView.setEllipsize(StringUtils.TruncateAt.START);
        } else if (i == 2) {
            textView.setEllipsize(StringUtils.TruncateAt.MIDDLE);
        } else if (i == 3) {
            textView.setEllipsize(StringUtils.TruncateAt.END);
        } else if (i != 5) {
        } else {
            textView.setEllipsize(StringUtils.TruncateAt.MARQUEE);
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

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        } else if (j == DXTBLLONGTEXTVIEW_TEXTANIMALTIME) {
            this.j = j2;
        } else {
            super.onSetLongAttribute(j, j2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == DXTBLLONGTEXTVIEW_MASKOFFSET) {
            this.c = d;
        } else if (j == -3216884856980908405L) {
            this.h = d;
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
        } else if (j == DXTBLLONGTEXTVIEW_AUTOMARQUEE) {
            if (i == 0) {
                z = false;
            }
            this.f17758a = z;
        } else if (j == DXTBLLONGTEXTVIEW_AUTOSCROLLCOUNT) {
            this.b = i;
        } else if (j == DXTBLLONGTEXTVIEW_ONRENDERSTART) {
            if (i == 0) {
                z = false;
            }
            this.e = z;
        } else if (j == DXTBLLONGTEXTVIEW_POSTDELAYTIME) {
            this.d = i;
        } else if (j == DXTBLLONGTEXTVIEW_TBLLINEBREAKMODE) {
            this.f = i;
        } else if (j == DXTBLLONGTEXTVIEW_TBLNEEDTEXTGRADIENT) {
            if (i == 0) {
                z = false;
            }
            this.g = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXTBLLONGTEXTVIEW_AUTOMARQUEE) {
            return 0;
        }
        if (j != DXTBLLONGTEXTVIEW_POSTDELAYTIME) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 1000;
    }
}
