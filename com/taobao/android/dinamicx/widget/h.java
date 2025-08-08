package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.view.DXNativeCountDownTimerView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.fxo;
import tb.gbg;
import tb.kge;

/* loaded from: classes.dex */
public class h extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static final long DXCOUNTDOWNVIEW_FONT = 34149272427L;
    public static final int DXCOUNTDOWNVIEW_FONTSTYLE_BOLD = 1;
    public static final int DXCOUNTDOWNVIEW_FONTSTYLE_NONE = -1;
    public static final int DXCOUNTDOWNVIEW_FONTSTYLE_NORMAL = 0;
    public static final long DXCOUNTDOWNVIEW_SHOWHOURSECOND = -8830056631125429559L;
    public static final long DXCOUNTDOWNVIEW_SHOWMINUTESECOND = 4747633075395742623L;
    private String I;
    private int c;
    private int d;
    private int e;
    private int f;
    private String g;
    private int i;
    private int j;
    private int k;
    private int l;
    private double m;
    private int o;
    private int s;
    private int t;
    private int u;
    private int v;
    private long w;
    private long x;
    private double y;
    private double z;

    /* renamed from: a  reason: collision with root package name */
    private String f12105a = ":";
    private int b = -16777216;
    private int h = -16777216;
    private int n = -16777216;
    private int p = -1;
    private int q = 0;
    private int r = 0;
    private boolean A = true;
    private boolean B = true;
    private boolean C = true;
    private boolean D = false;
    private int E = 1;
    private String J = null;
    private boolean K = true;
    private boolean F = false;
    private boolean G = false;
    private int H = -1;

    static {
        kge.a(-1672605978);
    }

    private int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue() : i != 0 ? 1 : 0;
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1133248269) {
            if (hashCode != 2119721610) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
        return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 3;
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1854054333);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new h();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new h();
    }

    public h() {
        this.m = 12.0d;
        this.y = 10.0d;
        this.z = 12.0d;
        if (DinamicXEngine.i() != null) {
            this.y = gbg.a(DinamicXEngine.i(), 10.0f);
            this.z = gbg.a(DinamicXEngine.i(), 12.0f);
            this.m = gbg.a(DinamicXEngine.i(), 12.0f);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof h)) {
            return;
        }
        h hVar = (h) dXWidgetNode;
        this.w = hVar.w;
        this.x = hVar.x;
        this.b = hVar.b;
        this.f12105a = hVar.f12105a;
        this.c = hVar.c;
        this.d = hVar.d;
        this.e = hVar.e;
        this.f = hVar.f;
        this.y = hVar.y;
        this.g = hVar.g;
        this.m = hVar.m;
        this.h = hVar.h;
        this.j = hVar.j;
        this.l = hVar.l;
        this.k = hVar.k;
        this.i = hVar.i;
        this.n = hVar.n;
        this.o = hVar.o;
        this.p = hVar.p;
        this.q = hVar.q;
        this.r = hVar.r;
        this.s = hVar.s;
        this.t = hVar.t;
        this.v = hVar.v;
        this.u = hVar.u;
        this.z = hVar.z;
        this.A = hVar.A;
        this.B = hVar.B;
        this.C = hVar.C;
        this.D = hVar.D;
        this.J = hVar.J;
        this.E = hVar.E;
        this.F = hVar.F;
        this.G = hVar.G;
        this.H = hVar.H;
        this.I = hVar.I;
        this.K = hVar.K;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        boolean z2 = a2 == 1073741824;
        if (a3 != 1073741824) {
            z = false;
        }
        int b = z2 ? DXWidgetNode.DXMeasureSpec.b(i) : 0;
        if (z) {
            i3 = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(b, i3);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view == null || !(view instanceof DXNativeCountDownTimerView)) {
        } else {
            DXNativeCountDownTimerView dXNativeCountDownTimerView = (DXNativeCountDownTimerView) view;
            if (getDXRuntimeContext() != null && getDXRuntimeContext().C() != null) {
                long e = getDXRuntimeContext().C().e();
                if (this.G && e > 0) {
                    this.w = e;
                }
            }
            dXNativeCountDownTimerView.setShowMilliSecond(this.D);
            dXNativeCountDownTimerView.setMilliSecondDigitCount(this.E);
            int tryFetchDarkModeColor = tryFetchDarkModeColor("colonTextColor", 0, this.b);
            int tryFetchDarkModeColor2 = tryFetchDarkModeColor("seeMoreTextColor", 0, this.h);
            a(dXNativeCountDownTimerView, this.t, this.v, this.u, this.s, this.r, this.q, this.z, tryFetchDarkModeColor("timerTextColor", 0, this.p), tryFetchDarkModeColor("timerBackgroundColor", 1, this.n), this.o);
            a(dXNativeCountDownTimerView, this.d, this.f, this.e, this.c, this.y, tryFetchDarkModeColor, this.f12105a, this.J);
            a(dXNativeCountDownTimerView, this.g, this.j, this.l, this.k, this.i, this.m, tryFetchDarkModeColor2);
            dXNativeCountDownTimerView.setShowSeeMoreText(this.A);
            a(dXNativeCountDownTimerView, this.x, this.w);
        }
    }

    private Typeface a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Typeface) ipChange.ipc$dispatch("388c37d1", new Object[]{this, new Integer(i)}) : Typeface.defaultFromStyle(b(i));
    }

    public void a(TextView textView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c92be1d", new Object[]{this, textView, str, new Integer(i)});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                if (DinamicXEngine.i() == null) {
                    a(textView, i);
                    return;
                }
                Typeface a2 = fxo.a().a(str, b(i));
                if (a2 != null) {
                    textView.setTypeface(a2);
                } else {
                    a(textView, i);
                }
            } catch (Throwable th) {
                a(textView, i);
                com.taobao.android.dinamicx.exception.a.a(th, false);
            }
        }
    }

    public void a(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7b0fa7", new Object[]{this, textView, new Integer(i)});
        } else {
            textView.setTypeface(a(i));
        }
    }

    private void a(DXNativeCountDownTimerView dXNativeCountDownTimerView, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2caf1e", new Object[]{this, dXNativeCountDownTimerView, new Long(j), new Long(j2)});
            return;
        }
        dXNativeCountDownTimerView.setFutureTime(j);
        dXNativeCountDownTimerView.setCurrentTime(j2);
        if (dXNativeCountDownTimerView.getLastTime() > 0) {
            dXNativeCountDownTimerView.showCountDown();
            dXNativeCountDownTimerView.updateCountView();
            dXNativeCountDownTimerView.getTimer().a();
            dXNativeCountDownTimerView.setOnFinishListener(new DXNativeCountDownTimerView.a() { // from class: com.taobao.android.dinamicx.widget.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.DXNativeCountDownTimerView.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        h.this.postEvent(new DXEvent(-6786364507638278416L));
                    }
                }
            });
            return;
        }
        dXNativeCountDownTimerView.setOnFinishListener(null);
        dXNativeCountDownTimerView.hideCountDown();
        dXNativeCountDownTimerView.getTimer().b();
        postEvent(new DXEvent(-6786364507638278416L));
    }

    private void a(DXNativeCountDownTimerView dXNativeCountDownTimerView, String str, int i, int i2, int i3, int i4, double d, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e29ad", new Object[]{this, dXNativeCountDownTimerView, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Double(d), new Integer(i5)});
            return;
        }
        TextView seeMoreView = dXNativeCountDownTimerView.getSeeMoreView();
        seeMoreView.setText(str);
        a(seeMoreView, i, i2, i3, i4, 0, 0, d, i5);
        if (StringUtils.isEmpty(this.I)) {
            return;
        }
        a(seeMoreView, this.I, this.H);
    }

    private void a(DXNativeCountDownTimerView dXNativeCountDownTimerView, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7, int i8, int i9) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793e0f63", new Object[]{this, dXNativeCountDownTimerView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Double(d), new Integer(i7), new Integer(i8), new Integer(i9)});
            return;
        }
        TextView hour = dXNativeCountDownTimerView.getHour();
        TextView minute = dXNativeCountDownTimerView.getMinute();
        TextView second = dXNativeCountDownTimerView.getSecond();
        TextView milli = dXNativeCountDownTimerView.getMilli();
        if (this.B) {
            textView = milli;
            textView2 = second;
            textView3 = minute;
            textView4 = hour;
            a(hour, i, i2, i3, i4, i5, i6, d, i7);
        } else {
            textView = milli;
            textView2 = second;
            textView3 = minute;
            textView4 = hour;
            textView4.setVisibility(8);
        }
        if (this.C) {
            a(textView3, i, i2, i3, i4, i5, i6, d, i7);
            textView5 = textView3;
        } else {
            textView5 = textView3;
            textView5.setVisibility(8);
        }
        TextView textView6 = textView5;
        a(textView2, i, i2, i3, i4, i5, i6, d, i7);
        if (this.D) {
            textView.setVisibility(0);
            a(textView, i, i2, i3, i4, (this.E != 1 || !this.F || i5 <= 0) ? i5 : i5 / 2, i6, d, i7);
        } else {
            textView.setVisibility(8);
        }
        a(textView4, textView6, textView2, textView, i8, i9);
        if (!StringUtils.isEmpty(this.I)) {
            a(textView4, this.I, this.H);
            a(textView, this.I, this.H);
            a(textView6, this.I, this.H);
            a(textView2, this.I, this.H);
            return;
        }
        TextView textView7 = textView2;
        int i10 = this.H;
        if (i10 == -1) {
            return;
        }
        Typeface a2 = a(i10);
        textView4.setTypeface(a2);
        textView.setTypeface(a2);
        textView6.setTypeface(a2);
        textView7.setTypeface(a2);
    }

    private void a(DXNativeCountDownTimerView dXNativeCountDownTimerView, int i, int i2, int i3, int i4, double d, int i5, String str, String str2) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de72a77", new Object[]{this, dXNativeCountDownTimerView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Double(d), new Integer(i5), str, str2});
            return;
        }
        TextView colonFirst = dXNativeCountDownTimerView.getColonFirst();
        TextView colonSecond = dXNativeCountDownTimerView.getColonSecond();
        TextView colonThird = dXNativeCountDownTimerView.getColonThird();
        if (this.B) {
            textView = colonThird;
            textView2 = colonSecond;
            textView3 = colonFirst;
            a(colonFirst, i, i2, i3, i4, 0, 0, d, i5);
        } else {
            textView = colonThird;
            textView2 = colonSecond;
            textView3 = colonFirst;
            textView3.setVisibility(8);
        }
        if (this.C) {
            a(textView2, i, i2, i3, i4, 0, 0, d, i5);
            textView4 = textView2;
        } else {
            textView4 = textView2;
            textView4.setVisibility(8);
        }
        if (this.D) {
            textView.setVisibility(0);
            textView5 = textView4;
            a(textView, i, i2, i3, i4, 0, 0, d, i5);
        } else {
            textView5 = textView4;
            textView.setVisibility(8);
        }
        textView3.setText(str);
        textView5.setText(str);
        if (str2 != null) {
            textView.setText(str2);
        } else {
            textView.setText(str);
        }
        TextView textView6 = textView5;
        if (!this.K) {
            textView3.setIncludeFontPadding(false);
            textView6.setIncludeFontPadding(false);
            textView.setIncludeFontPadding(false);
        }
        if (!StringUtils.isEmpty(this.I)) {
            a(textView3, this.I, this.H);
            a(textView6, this.I, this.H);
            a(textView, this.I, this.H);
            return;
        }
        int i6 = this.H;
        if (i6 == -1) {
            return;
        }
        Typeface a2 = a(i6);
        textView3.setTypeface(a2);
        textView6.setTypeface(a2);
        textView.setTypeface(a2);
    }

    private void a(TextView textView, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61264e81", new Object[]{this, textView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Double(d), new Integer(i7)});
            return;
        }
        textView.setTextSize(0, (float) d);
        textView.setTextColor(i7);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        if (i5 != 0) {
            marginLayoutParams.width = i5;
        }
        if (i6 != 0) {
            marginLayoutParams.height = i6;
        }
        marginLayoutParams.setMargins(i, i2, i3, i4);
        textView.setLayoutParams(marginLayoutParams);
    }

    private void a(TextView textView, TextView textView2, TextView textView3, TextView textView4, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ac47c8", new Object[]{this, textView, textView2, textView3, textView4, new Integer(i), new Integer(i2)});
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = i2;
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        textView.setBackgroundDrawable(gradientDrawable);
        textView2.setBackgroundDrawable(gradientDrawable);
        textView3.setBackgroundDrawable(gradientDrawable);
        if (!this.D) {
            return;
        }
        if (this.E == 1 && this.F) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(f);
            gradientDrawable2.setColor(i);
            textView4.setBackgroundDrawable(gradientDrawable2);
            return;
        }
        textView4.setBackgroundDrawable(gradientDrawable);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXNativeCountDownTimerView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (7523271490450403529L == j) {
            this.f12105a = str;
        } else if (-7803598294486378310L == j) {
            this.J = str;
        } else if (4189101800495477120L == j) {
            this.g = str;
        } else if (j != 34149272427L) {
        } else {
            this.I = str;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 836506953899434884L || j == -7569082268550024243L) {
            return -16777216;
        }
        if (j == 3586614778875286483L) {
            return -1;
        }
        if (j == -502340563974947291L || j == -7371269035395216254L) {
            return 1;
        }
        if (j == -8574960089337605395L) {
            return 0;
        }
        if (j != DXCOUNTDOWNVIEW_SHOWHOURSECOND && j != DXCOUNTDOWNVIEW_SHOWMINUTESECOND && j != -1618928292660898964L) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 1;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (-7569082268550024243L == j) {
            this.b = i;
        } else if (-5446467777356887384L == j) {
            this.c = i;
        } else if (-2349968600282703684L == j) {
            this.d = i;
        } else if (-4097512581907102928L == j) {
            this.e = i;
        } else if (2974479846771431523L == j) {
            this.f = i;
        } else if (836506953899434884L == j) {
            this.h = i;
        } else if (-6389039416330352289L == j) {
            this.i = i;
        } else if (-991465590347635341L == j) {
            this.j = i;
        } else if (6878642454060075239L == j) {
            this.k = i;
        } else if (-1982127542287307750L == j) {
            this.l = i;
        } else if (-2066932502216216012L == j) {
            this.n = i;
        } else if (-7541914668888054013L == j) {
            this.o = i;
        } else if (3586614778875286483L == j) {
            this.p = i;
        } else if (-5195705055003868114L == j) {
            this.q = i;
        } else if (3588042683016644308L == j) {
            this.r = i;
        } else if (4113718844605699246L == j) {
            this.s = i;
        } else if (4975799217651406530L == j) {
            this.t = i;
        } else if (-5434794314794449098L == j) {
            this.u = i;
        } else if (-3498357187900469143L == j) {
            this.v = i;
        } else if (-5268712888762272737L == j) {
            this.m = i;
        } else if (9031654720231161192L == j) {
            this.y = i;
        } else if (5087222913038931822L == j) {
            this.z = i;
        } else if (-502340563974947291L == j) {
            if (i == 0) {
                z = false;
            }
            this.A = z;
        } else if (j == DXCOUNTDOWNVIEW_SHOWHOURSECOND) {
            if (i == 0) {
                z = false;
            }
            this.B = z;
        } else if (j == DXCOUNTDOWNVIEW_SHOWMINUTESECOND) {
            if (i == 0) {
                z = false;
            }
            this.C = z;
        } else if (-2361257553306292445L == j) {
            if (i == 0) {
                z = false;
            }
            this.D = z;
        } else if (-7371269035395216254L == j) {
            this.E = i;
        } else if (-8574960089337605395L == j) {
            if (i == 0) {
                z = false;
            }
            this.F = z;
        } else if (-1047143332071710891L == j) {
            if (i == 0) {
                z = false;
            }
            this.G = z;
        } else if (j == -435593654112940591L) {
            this.H = i;
        } else if (j != -1618928292660898964L) {
        } else {
            if (i == 0) {
                z = false;
            }
            this.K = z;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        } else if (8195572952744500637L == j) {
            this.w = j2;
        } else if (8766053855851211060L != j) {
        } else {
            this.x = j2;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue() : getClass() == h.class;
    }
}
