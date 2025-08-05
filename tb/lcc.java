package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.g;
import com.airbnb.lottie.j;
import com.airbnb.lottie.l;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.ad.impl.dx.view.MMAdLottieView;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.lks;
import tb.mto;

/* loaded from: classes7.dex */
public class lcc extends DXWidgetNode implements l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMMADLOTTIEVIEW_AUTOPLAY = 1174195036188518487L;
    public static final int DXMMADLOTTIEVIEW_AUTOPLAY_FALSE = 1;
    public static final int DXMMADLOTTIEVIEW_AUTOPLAY_TRUE = 0;
    public static final long DXMMADLOTTIEVIEW_FOLLOWFINGER = 8516538730314951418L;
    public static final int DXMMADLOTTIEVIEW_FOLLOWFINGER_FALSE = 1;
    public static final int DXMMADLOTTIEVIEW_FOLLOWFINGER_TRUE = 0;
    public static final long DXMMADLOTTIEVIEW_IMAGEURL = 3520785955321526846L;
    public static final long DXMMADLOTTIEVIEW_LOTTIEPROCESS = 2788943598200882813L;
    public static final long DXMMADLOTTIEVIEW_LOTTIEURL = 2098074961106059981L;
    public static final long DXMMADLOTTIEVIEW_MMADLOTTIEVIEW = -6876941172612668615L;
    public static final long DXMMADLOTTIEVIEW_PLAYCYCLEINFEED = 2344645787189096672L;
    public static final long DXMMADLOTTIEVIEW_REPEATCOUNT = 2299602847062992021L;
    public static final long DXMMADLOTTIEVIEW_SCALETYPE = 1015096712691932083L;
    public static final int DXMMADLOTTIEVIEW_SCALETYPE_CENTERCROP = 2;
    public static final int DXMMADLOTTIEVIEW_SCALETYPE_FITCENTER = 0;
    public static final int DXMMADLOTTIEVIEW_SCALETYPE_FITXY = 1;
    public static final long DXMMADLOTTIEVIEW_STARTPLAYRATIOINFEED = 2826634501232401666L;
    private String d;
    private String f;
    private lks.c k;
    private boolean l;
    private long p;
    private Rect q;
    private int b = 0;
    private int c = 1;
    private double e = mto.a.GEO_NOT_SUPPORT;
    private double g = 0.4d;
    private int h = 0;
    private int i = 0;
    private double j = 0.5d;
    private boolean m = false;
    private int n = 0;
    private int o = 0;

    /* renamed from: a  reason: collision with root package name */
    public Rect f30467a = new Rect();

    public static /* synthetic */ Object ipc$super(lcc lccVar, String str, Object... objArr) {
        switch (str.hashCode()) {
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
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
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

    public static /* synthetic */ String a(lcc lccVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de5f5494", new Object[]{lccVar}) : lccVar.f;
    }

    public static /* synthetic */ void a(lcc lccVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dac3af7", new Object[]{lccVar, new Integer(i)});
        } else {
            lccVar.a(i);
        }
    }

    public static /* synthetic */ int b(lcc lccVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e1047000", new Object[]{lccVar})).intValue() : lccVar.o;
    }

    public static /* synthetic */ int c(lcc lccVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf877681", new Object[]{lccVar})).intValue() : lccVar.n;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lcc();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof lcc)) {
        } else {
            super.onClone(dXWidgetNode, z);
            lcc lccVar = (lcc) dXWidgetNode;
            this.b = lccVar.b;
            this.c = lccVar.c;
            this.d = lccVar.d;
            this.e = lccVar.e;
            this.f = lccVar.f;
            this.g = lccVar.g;
            this.h = lccVar.h;
            this.i = lccVar.i;
            this.j = lccVar.j;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new MMAdLottieView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (!(view instanceof MMAdLottieView)) {
        } else {
            try {
                MMAdLottieView mMAdLottieView = (MMAdLottieView) view;
                if (mMAdLottieView.getLottieAnimationView() != null && mMAdLottieView.getBottomImageView() != null) {
                    this.n = Resources.getSystem().getDisplayMetrics().heightPixels;
                    this.o = Resources.getSystem().getDisplayMetrics().widthPixels;
                    mMAdLottieView.setImageUrl(this.d);
                    if (TextUtils.isEmpty(this.f)) {
                        return;
                    }
                    mMAdLottieView.setLottieUrl(this.f);
                    mMAdLottieView.setLottieProcess((float) this.e);
                    mMAdLottieView.setRepeatCount(this.h);
                    int i = this.i;
                    if (i == 1) {
                        mMAdLottieView.setScaleType(ImageView.ScaleType.FIT_XY);
                    } else if (i == 2) {
                        mMAdLottieView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    } else {
                        mMAdLottieView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    }
                    mMAdLottieView.removeLottieOnCompositionLoadedListener(this);
                    mMAdLottieView.addLottieOnCompositionLoadedListener(this);
                    mMAdLottieView.setFailureListener(new j<Throwable>() { // from class: tb.lcc.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.airbnb.lottie.j
                        public /* synthetic */ void onResult(Throwable th) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8251d27f", new Object[]{this, th});
                            } else {
                                a(th);
                            }
                        }

                        public void a(Throwable th) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                            } else {
                                lci.a(lcc.a(lcc.this), 0.0f, 0, 0, lcc.b(lcc.this), lcc.c(lcc.this), th == null ? "" : th.getMessage());
                            }
                        }
                    });
                    if (this.p == -1) {
                        return;
                    }
                    this.p = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                lci.a(this.f, 0.0f, 0, 0, this.o, this.n, th.getMessage());
                lch.a("DXMMADLottieViewWidget", "onRenderView", th);
            }
        }
    }

    @Override // com.airbnb.lottie.l
    public void onCompositionLoaded(g gVar) {
        float e;
        float f;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ed5f5e", new Object[]{this, gVar});
            return;
        }
        if (gVar != null) {
            try {
                e = gVar.e();
                float h = gVar.h();
                Rect d = gVar.d();
                if (d != null) {
                    int width = d.width();
                    i2 = d.height();
                    i = width;
                    f = h;
                } else {
                    f = h;
                    i = 0;
                    i2 = 0;
                }
            } catch (Throwable th) {
                lch.a("DXMMADLottieViewWidget", "onCompositionLoaded", th);
                th.printStackTrace();
                return;
            }
        } else {
            e = 0.0f;
            i = 0;
            i2 = 0;
            f = 0.0f;
        }
        if (e > 0.0f && i > 0 && i2 > 0) {
            this.l = true;
            a();
            b();
        }
        if (this.p == -1) {
            return;
        }
        float currentTimeMillis = (float) (System.currentTimeMillis() - this.p);
        this.p = -1L;
        if (this.l) {
            lci.a(this.f, currentTimeMillis, i, i2, this.o, this.n, e(), f);
        } else {
            lci.a(this.f, currentTimeMillis, i, i2, this.o, this.n, "lottie_check_fail");
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            return;
        }
        View v = dXRuntimeContext.v();
        if (!(v instanceof MMAdLottieView)) {
            return;
        }
        ((MMAdLottieView) v).hideBottomImage();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c == 0 || this.b != 0 || !this.m || !this.l) {
        } else {
            MMAdLottieView d = d();
            lch.a("DXMMADLottieViewWidget", "lottie_autoPlay");
            if (d == null) {
                return;
            }
            d.play();
        }
    }

    private void c() {
        MMAdLottieView d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c == 0 || this.b != 0 || this.m || !this.l || (d = d()) == null || !d.isPlaying()) {
        } else {
            lch.a("DXMMADLottieViewWidget", "pause");
            d.pause();
        }
    }

    private MMAdLottieView d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MMAdLottieView) ipChange.ipc$dispatch("b877e221", new Object[]{this});
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            return null;
        }
        View v = dXRuntimeContext.v();
        if (v instanceof MMAdLottieView) {
            return (MMAdLottieView) v;
        }
        return null;
    }

    private int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        try {
            MMAdLottieView d = d();
            if (d == null) {
                return 0;
            }
            if (this.q == null) {
                this.q = new Rect();
            }
            d.getGlobalVisibleRect(this.q);
            return this.q.top;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    private void f() {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            if (this.c == 1 || (dXRuntimeContext = getDXRuntimeContext()) == null) {
                return;
            }
            IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) lfq.a(dXRuntimeContext).a(IMainFeedsViewService.class);
            if (this.k == null) {
                return;
            }
            iMainFeedsViewService.mo1084getLifeCycleRegister().b(this.k);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void g() {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            if (this.c == 1 || (dXRuntimeContext = getDXRuntimeContext()) == null) {
                return;
            }
            IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) lfq.a(dXRuntimeContext).a(IMainFeedsViewService.class);
            if (this.k == null) {
                this.k = new lks.c() { // from class: tb.lcc.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.lks.c
                    public void a(ViewGroup viewGroup, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a8f4273c", new Object[]{this, viewGroup, new Integer(i)});
                        }
                    }

                    @Override // tb.lks.c
                    public void a(boolean z, boolean z2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
                        }
                    }

                    @Override // tb.lks.c
                    public void a(ViewGroup viewGroup, int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("75913347", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
                        } else {
                            lcc.a(lcc.this, i2);
                        }
                    }
                };
            }
            iMainFeedsViewService.mo1084getLifeCycleRegister().a(this.k);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            MMAdLottieView d = d();
            if (d == null) {
                return;
            }
            if (!d.getLocalVisibleRect(this.f30467a) || !d.isShown()) {
                z = false;
            }
            if (!z || Math.abs(this.f30467a.height()) < d.getHeight() * this.j || this.g < mto.a.GEO_NOT_SUPPORT) {
                return;
            }
            d.setProcess(Math.max(0.0f, Math.min(1.0f, d.getProcess() + ((float) (i / (this.n * this.g))))));
        } catch (Throwable th) {
            lch.a("DXMMADLottieViewWidget", "playByScroll", th);
            th.printStackTrace();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent == null) {
            return false;
        }
        boolean onEvent = super.onEvent(dXEvent);
        try {
            long eventId = dXEvent.getEventId();
            if (eventId == 5288671110273408574L) {
                lch.a("DXMMADLottieViewWidget", "receive on appear event");
                this.m = true;
                b();
                g();
            } else if (eventId == 5388973340095122049L) {
                lch.a("DXMMADLottieViewWidget", "receive on disappear event");
                this.m = false;
                c();
                f();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return onEvent;
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
        } else if (j == 3520785955321526846L) {
            this.d = str;
        } else if (j == 2098074961106059981L) {
            this.f = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 2788943598200882813L) {
            this.e = d;
        } else if (j == DXMMADLOTTIEVIEW_PLAYCYCLEINFEED) {
            this.g = d;
        } else if (j == DXMMADLOTTIEVIEW_STARTPLAYRATIOINFEED) {
            this.j = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 1174195036188518487L) {
            this.b = i;
        } else if (j == DXMMADLOTTIEVIEW_FOLLOWFINGER) {
            this.c = i;
        } else if (j == 2299602847062992021L) {
            this.h = i;
        } else if (j == 1015096712691932083L) {
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
        if (j == 2788943598200882813L) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        if (j == DXMMADLOTTIEVIEW_PLAYCYCLEINFEED) {
            return 0.4d;
        }
        if (j != DXMMADLOTTIEVIEW_STARTPLAYRATIOINFEED) {
            return super.getDefaultValueForDoubleAttr(j);
        }
        return 0.5d;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 1174195036188518487L) {
            return 0;
        }
        if (j == DXMMADLOTTIEVIEW_FOLLOWFINGER) {
            return 1;
        }
        if (j != 2299602847062992021L && j != 1015096712691932083L) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }
}
