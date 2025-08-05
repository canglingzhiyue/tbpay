package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.annotation.AliSDetailScaleType;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.home.component.view.live.HTBLiveImageView;
import com.taobao.android.home.component.view.live.c;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import com.taobao.uikit.feature.features.RatioFeature;
import tb.mto;

/* loaded from: classes7.dex */
public class kww extends DXWidgetNode implements fym {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int C;
    public static final long DXHTBLIMAGEVIEW_HTBLIMAGEVIEW = -5996311416603680075L;
    public static final long DXHTBLIMAGEVIEW_MINPLAYEXPOSERATIO = 3649100718983479135L;
    public static final long DXHTBLIMAGEVIEW_ONPARENTSCROLLSTART = -1305328253755158825L;
    public static final long DXHTBLIMAGEVIEW_ONPARENTSCROLLSTOP = -88908847944554642L;
    public static final long DXHTBLIMAGEVIEW_TBBACKGROUND = -6737373688188729886L;
    public static final long DXHTBLIMAGEVIEW_TBCURRENTLIVESTATE = -5287008133921364644L;
    public static final long DXHTBLIMAGEVIEW_TBGONEIFNULL = 1035483994773344437L;
    public static final long DXHTBLIMAGEVIEW_TBID = 38174466807L;
    public static final long DXHTBLIMAGEVIEW_TBIMAGECORNERRADIUS = 8499485291207392157L;
    public static final long DXHTBLIMAGEVIEW_TBIMAGECORNERRADIUSRATIO = -9012118380120751455L;
    public static final long DXHTBLIMAGEVIEW_TBIMAGESHAPE = -1666749237118992970L;
    public static final long DXHTBLIMAGEVIEW_TBIMAGEURL = -7963020384368345866L;
    public static final long DXHTBLIMAGEVIEW_TBLEFTBOTTOMCORNERRADIUS = 8472049768233163199L;
    public static final long DXHTBLIMAGEVIEW_TBLEFTTOPCORNERRADIUS = 1805057142456087674L;
    public static final long DXHTBLIMAGEVIEW_TBLIVEVIDEO = 9122203915275105128L;
    public static final long DXHTBLIMAGEVIEW_TBMASK = 10220202113345640L;
    public static final long DXHTBLIMAGEVIEW_TBPLACEHOLD = 800013180966223437L;
    public static final long DXHTBLIMAGEVIEW_TBPLAYERDATA = -8136938095111281463L;
    public static final long DXHTBLIMAGEVIEW_TBPLAYURL = 3882830683672803752L;
    public static final long DXHTBLIMAGEVIEW_TBPLAYVIDEO = 850419666986385006L;
    public static final long DXHTBLIMAGEVIEW_TBRIGHTBOTTOMCORNERRADIUS = 5615326228419484723L;
    public static final long DXHTBLIMAGEVIEW_TBRIGHTTOPCORNERRADIUS = 7638094872275769326L;
    public static final long DXHTBLIMAGEVIEW_TBSCALETYPE = 526508988394598507L;
    public static final long DXHTBLIMAGEVIEW_TBSRC = 19617083574627L;
    public static final long DXHTBLIMAGEVIEW_TBVIDEOLOOP = 311349093421208690L;
    public static final long DXHTBLIMAGEVIEW_TBVISIBLESTATE = 5637158515563704755L;
    public static final long DXHTBLIMAGEVIEW_TBWHRATIO = 3898487036836366973L;
    private Handler A;
    private kwx B;
    private String b;
    private String c;
    private Object d;
    private Object e;
    private double g;
    private String h;
    private String i;
    private String m;
    private String n;
    private String o;
    private JSONObject q;
    private String u;
    private boolean v;
    private String w;
    private double x;

    /* renamed from: a  reason: collision with root package name */
    private double f30362a = 0.6d;
    private String f = "0";
    private String j = "0";
    private String k = "0";
    private boolean l = true;
    private boolean p = false;
    private String r = "0";
    private String s = "0";
    private String t = AliSDetailScaleType.centerCrop;
    private boolean y = false;
    private boolean z = false;

    /* loaded from: classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1727940045);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static boolean a() {
            char c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
            }
            String a2 = j.a("DX3LiveEnableLevel", "LevelHighMid");
            if (TextUtils.isEmpty(a2)) {
                return false;
            }
            String b = g.b();
            ksp.c("HLiveOrange", "orange live enableLevel = " + a2 + ";deviceLevel = " + b);
            switch (a2.hashCode()) {
                case -2067010659:
                    if (a2.equals("LevelAll")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1936070334:
                    if (a2.equals("LevelHighMid")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 347384614:
                    if (a2.equals("LevelHigh")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 347569340:
                    if (a2.equals("LevelNone")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        return TextUtils.equals("h", b);
                    }
                    return false;
                } else if (!TextUtils.equals("h", b) && !TextUtils.equals("m", b)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static /* synthetic */ Object ipc$super(kww kwwVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
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
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void a(kww kwwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ef7e6d", new Object[]{kwwVar});
        } else {
            kwwVar.a();
        }
    }

    public static /* synthetic */ void a(kww kwwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c00c236", new Object[]{kwwVar, new Integer(i)});
        } else {
            kwwVar.a(i);
        }
    }

    public static /* synthetic */ void a(kww kwwVar, fxy fxyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a057f0e0", new Object[]{kwwVar, fxyVar, str});
        } else {
            kwwVar.c(fxyVar, str);
        }
    }

    public static /* synthetic */ boolean a(kww kwwVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c01020b", new Object[]{kwwVar, new Boolean(z)})).booleanValue() : kwwVar.a(z);
    }

    public static /* synthetic */ boolean b(kww kwwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e07284f2", new Object[]{kwwVar})).booleanValue() : kwwVar.y;
    }

    public static /* synthetic */ boolean c(kww kwwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cef58b73", new Object[]{kwwVar})).booleanValue() : kwwVar.z;
    }

    static {
        kge.a(969541227);
        kge.a(-1594984463);
        C = View.generateViewId();
    }

    @Override // tb.fym
    public void onCanPlay(fxy<?, fym> fxyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcb3bff", new Object[]{this, fxyVar, str});
        } else if (!h()) {
        } else {
            a(fxyVar, str);
            b();
        }
    }

    @Override // tb.fym
    public void onShouldStop(fxy<?, fym> fxyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c198f0e", new Object[]{this, fxyVar, str});
        } else if (!h()) {
        } else {
            d();
            a();
        }
    }

    private void a(fxy<?, fym> fxyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fd20b1b", new Object[]{this, fxyVar, str});
        } else {
            this.B = b(fxyVar, str);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.B = null;
        }
    }

    private kwx b(final fxy<?, fym> fxyVar, final String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kwx) ipChange.ipc$dispatch("3678b49e", new Object[]{this, fxyVar, str}) : new kwx() { // from class: tb.kww.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kwx
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else if (i != 1 && i != 2 && i != 3) {
                } else {
                    kww.a(kww.this);
                    kww.a(kww.this, fxyVar, str);
                }
            }
        };
    }

    private void c(fxy<?, fym> fxyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a39b9d", new Object[]{this, fxyVar, str});
            return;
        }
        fxyVar.d(this, str);
        ldf.d("DXHTBLImageViewWidgetNode", "播放器出现错误");
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1873101378);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new kww();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new kww();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof kww)) {
        } else {
            super.onClone(dXWidgetNode, z);
            kww kwwVar = (kww) dXWidgetNode;
            this.f30362a = kwwVar.f30362a;
            this.b = kwwVar.b;
            this.c = kwwVar.c;
            this.d = kwwVar.d;
            this.e = kwwVar.e;
            this.f = kwwVar.f;
            this.g = kwwVar.g;
            this.h = kwwVar.h;
            this.i = kwwVar.i;
            this.j = kwwVar.j;
            this.k = kwwVar.k;
            this.l = kwwVar.l;
            this.m = kwwVar.m;
            this.n = kwwVar.n;
            this.o = kwwVar.o;
            this.p = kwwVar.p;
            this.q = kwwVar.q;
            this.r = kwwVar.r;
            this.s = kwwVar.s;
            this.t = kwwVar.t;
            this.u = kwwVar.u;
            this.v = kwwVar.v;
            this.w = kwwVar.w;
            this.x = kwwVar.x;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        HTBLiveImageView hTBLiveImageView = new HTBLiveImageView(context);
        hTBLiveImageView.setId(C);
        frameLayout.addView(hTBLiveImageView, 0, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        HTBLiveImageView hTBLiveImageView;
        int a2;
        int a3;
        int a4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof FrameLayout) || (hTBLiveImageView = (HTBLiveImageView) view.findViewById(C)) == null) {
            return;
        }
        hTBLiveImageView.setPlayVideo(this.p);
        hTBLiveImageView.setLiveVideo(this.l);
        hTBLiveImageView.setPlayUrl(this.o);
        onq.a(hTBLiveImageView, this.i, null, null);
        hTBLiveImageView.setImageUrl(this.i);
        hTBLiveImageView.setVideoLoop(this.v);
        hTBLiveImageView.setScaleType(pbh.c(this.t));
        a(hTBLiveImageView);
        b(hTBLiveImageView);
        c(hTBLiveImageView);
        d(hTBLiveImageView);
        e(hTBLiveImageView);
        Object obj = this.e;
        if (obj != null) {
            hTBLiveImageView.setTag(obj);
        }
        if (!TextUtils.isEmpty(this.b) && -1 != (a4 = pbh.a(this.b))) {
            hTBLiveImageView.setBackgroundResource(a4);
        }
        if (!TextUtils.isEmpty(this.n) && -1 != (a3 = pbh.a(this.n))) {
            hTBLiveImageView.setPlaceHoldImageResId(a3);
        }
        if (!TextUtils.isEmpty(this.m) && -1 != (a2 = pbh.a(this.m))) {
            hTBLiveImageView.setColorFilter(a2);
        }
        JSONObject jSONObject = this.q;
        if (jSONObject == null) {
            return;
        }
        hTBLiveImageView.setPlayerData(jSONObject);
    }

    private void a(HTBLiveImageView hTBLiveImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f6ba31", new Object[]{this, hTBLiveImageView});
        } else if (TextUtils.isEmpty(this.u) || hTBLiveImageView == null) {
        } else {
            int a2 = pbh.a(this.u);
            if (a2 != -1) {
                hTBLiveImageView.setImageResource(pbh.a(this.u));
                return;
            }
            Resources resources = hTBLiveImageView.getContext().getResources();
            if (resources != null) {
                a2 = resources.getIdentifier(this.u, com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, hTBLiveImageView.getContext().getPackageName());
            }
            if (a2 == -1 || a2 == 0) {
                return;
            }
            hTBLiveImageView.setImageResource(a2);
        }
    }

    private void b(HTBLiveImageView hTBLiveImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b835f2", new Object[]{this, hTBLiveImageView});
        } else if (TextUtils.isEmpty(this.w) || TextUtils.isEmpty(this.c)) {
        } else {
            if (this.w.equals(this.c)) {
                hTBLiveImageView.setVisibility(0);
            } else {
                hTBLiveImageView.setVisibility(8);
            }
        }
    }

    private void c(HTBLiveImageView hTBLiveImageView) {
        ImageShapeFeature imageShapeFeature;
        float a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4079b1b3", new Object[]{this, hTBLiveImageView});
        } else if (TextUtils.isEmpty(this.h)) {
        } else {
            AbsFeature<? super ImageView> findFeature = hTBLiveImageView.findFeature(ImageShapeFeature.class);
            if (findFeature != null) {
                imageShapeFeature = (ImageShapeFeature) findFeature;
            } else {
                imageShapeFeature = new ImageShapeFeature();
                imageShapeFeature.setHost((ImageView) hTBLiveImageView);
                hTBLiveImageView.addFeature(imageShapeFeature);
            }
            int d = pbh.d(this.h);
            imageShapeFeature.setShape(d);
            if (d != 1 || TextUtils.isEmpty(this.f)) {
                return;
            }
            if (this.f.endsWith("ap") || this.f.endsWith("np")) {
                float a3 = fpr.a(hTBLiveImageView.getContext(), this.f, 0);
                imageShapeFeature.setCornerRadius(a3, a3, a3, a3);
                int i = (int) a3;
                hTBLiveImageView.setCornerRadius(i, i, i, i);
                return;
            }
            if (this.g != mto.a.GEO_NOT_SUPPORT) {
                a2 = a(this.f) * ((float) this.g);
            } else {
                a2 = a(this.f);
            }
            float a4 = a(hTBLiveImageView.getContext(), a2 / 2.0f);
            imageShapeFeature.setCornerRadius(a4, a4, a4, a4);
            int i2 = (int) a4;
            hTBLiveImageView.setCornerRadius(i2, i2, i2, i2);
        }
    }

    private void d(HTBLiveImageView hTBLiveImageView) {
        RatioFeature ratioFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3b2d74", new Object[]{this, hTBLiveImageView});
        } else if (this.x <= mto.a.GEO_NOT_SUPPORT) {
        } else {
            AbsFeature<? super ImageView> findFeature = hTBLiveImageView.findFeature(RatioFeature.class);
            if (findFeature != null) {
                ratioFeature = (RatioFeature) findFeature;
            } else {
                ratioFeature = new RatioFeature();
                ratioFeature.setHost(hTBLiveImageView);
                hTBLiveImageView.addFeature(ratioFeature);
            }
            ratioFeature.setRatio((float) this.x);
        }
    }

    private void e(HTBLiveImageView hTBLiveImageView) {
        ImageShapeFeature imageShapeFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fca935", new Object[]{this, hTBLiveImageView});
        } else if (TextUtils.isEmpty(this.k) && TextUtils.isEmpty(this.j) && TextUtils.isEmpty(this.s) && TextUtils.isEmpty(this.r)) {
        } else {
            float a2 = pbh.a(hTBLiveImageView.getContext(), this.k);
            float a3 = pbh.a(hTBLiveImageView.getContext(), this.j);
            float a4 = pbh.a(hTBLiveImageView.getContext(), this.s);
            float a5 = pbh.a(hTBLiveImageView.getContext(), this.r);
            AbsFeature<? super ImageView> findFeature = hTBLiveImageView.findFeature(ImageShapeFeature.class);
            if (findFeature != null) {
                imageShapeFeature = (ImageShapeFeature) findFeature;
            } else {
                imageShapeFeature = new ImageShapeFeature();
                imageShapeFeature.setHost((ImageView) hTBLiveImageView);
                hTBLiveImageView.addFeature(imageShapeFeature);
            }
            imageShapeFeature.setCornerRadius(a2, a4, a3, a5);
            hTBLiveImageView.setCornerRadius((int) a2, (int) a4, (int) a3, (int) a5);
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
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent == null) {
            return false;
        }
        boolean onEvent = super.onEvent(dXEvent);
        if (onEvent) {
            return true;
        }
        if (h()) {
            return false;
        }
        long eventId = dXEvent.getEventId();
        if (eventId == 7952648158329995189L) {
            ksp.c("DXHTBLImageViewWidgetNode", "receive on scroll start event");
            this.z = true;
            postEvent(new DXEvent(-1305328253755158825L));
        } else if (eventId == -7968002352509477560L) {
            ksp.c("DXHTBLImageViewWidgetNode", "receive on scroll stop event");
            this.z = false;
            postEvent(new DXEvent(-88908847944554642L));
        } else if (eventId != 5288671110273408574L) {
            if (eventId != 5388973340095122049L) {
                return onEvent;
            }
            ksp.c("DXHTBLImageViewWidgetNode", "receive on disappear event");
            this.y = false;
            d();
            return true;
        } else {
            ksp.c("DXHTBLImageViewWidgetNode", "receive on appear event");
            this.y = true;
        }
        if (this.A == null) {
            this.A = new Handler(Looper.getMainLooper());
        }
        this.A.removeCallbacksAndMessages(null);
        this.A.post(new Runnable() { // from class: tb.kww.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!kww.b(kww.this) || kww.c(kww.this)) {
                } else {
                    kww.a(kww.this, false);
                }
            }
        });
        return true;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HTBLiveImageView e = e();
        if (e != null) {
            com.taobao.android.home.component.view.live.b.a(a(e.getContext())).a(c());
        }
        a(true);
    }

    private c c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("72ead280", new Object[]{this}) : new c() { // from class: tb.kww.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.home.component.view.live.c
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else if (i == 1) {
                    kww.a(kww.this, 2);
                } else if (i != 2) {
                } else {
                    kww.a(kww.this, 3);
                }
            }
        };
    }

    private boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        try {
            ksp.c("DXHTBLImageViewWidgetNode", "playVideoIfNecessary invoke");
            if (!g()) {
                a(1);
                return false;
            } else if (!f()) {
                a(1);
                return false;
            } else {
                HTBLiveImageView e = e();
                if (e == null) {
                    return false;
                }
                Context a2 = a(e.getContext());
                e.setActivityContext(a2);
                if (!a(a2, z)) {
                    a(1);
                    return false;
                }
                boolean playVideoIfNecessary = e.playVideoIfNecessary(null, "", 1, false);
                ksp.c("DXHTBLImageViewWidgetNode", "start play live video result = " + playVideoIfNecessary);
                if (!playVideoIfNecessary) {
                    a(1);
                }
                return playVideoIfNecessary;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            ksp.a("DXHTBLImageViewWidgetNode", "play Live video exception", e2);
            return false;
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        kwx kwxVar = this.B;
        if (kwxVar == null) {
            return;
        }
        kwxVar.a(i);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            ksp.c("DXHTBLImageViewWidgetNode", "stopVideo invoke");
            HTBLiveImageView e = e();
            if (e == null || a(e.getContext()) == null) {
                return;
            }
            e.destroy();
        } catch (Exception e2) {
            e2.printStackTrace();
            ksp.a("DXHTBLImageViewWidgetNode", "stopVideo exception", e2);
        }
    }

    private HTBLiveImageView e() {
        View v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HTBLiveImageView) ipChange.ipc$dispatch("5d0bd6f3", new Object[]{this});
        }
        if (getDXRuntimeContext() != null && (v = getDXRuntimeContext().v()) != null) {
            return (HTBLiveImageView) v.findViewById(C);
        }
        return null;
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        HTBLiveImageView e = e();
        if (e == null) {
            ksp.c("DXHTBLImageViewWidgetNode", "can not find live image view");
            return false;
        } else if (e.getVisibility() != 0) {
            ksp.c("DXHTBLImageViewWidgetNode", "live image view is not visible");
            return false;
        } else if (a(e.getContext()) != null) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("can not find activity context。current context = ");
            sb.append(e.getContext() == null ? "null" : e.getContext().getClass().getSimpleName());
            ksp.c("DXHTBLImageViewWidgetNode", sb.toString());
            return false;
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (!this.p) {
            ksp.c("DXHTBLImageViewWidgetNode", "tbPlayVideo attr is false");
            return false;
        } else if (this.q != null || !TextUtils.isEmpty(this.o)) {
            return b.a();
        } else {
            ksp.c("DXHTBLImageViewWidgetNode", "tbPlayerData and tbPlayUrl is both empty");
            return false;
        }
    }

    private boolean a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258fda78", new Object[]{this, context, new Boolean(z)})).booleanValue();
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        com.taobao.global.setting.c a2 = com.taobao.global.setting.c.a(context, "homepage");
        if (!(a2 != null ? a2.b().a(context) : false)) {
            ksp.c("DXHTBLImageViewWidgetNode", "can not play under current network");
            return false;
        } else if (z) {
            return true;
        } else {
            if (com.taobao.android.home.component.view.live.b.a(context).e()) {
                ksp.c("DXHTBLImageViewWidgetNode", "yourself or another live video is playing");
                return false;
            } else if (getDXRuntimeContext().s() == null) {
                ksp.c("DXHTBLImageViewWidgetNode", "dx rootView is null");
                return false;
            } else {
                float a3 = com.taobao.homepage.view.widgets.b.a().b().a(e());
                if (a3 < 0.0f || a3 >= this.f30362a) {
                    return true;
                }
                ksp.c("DXHTBLImageViewWidgetNode", "dx rootView expose ratio too few. exposeRatio = " + a3 + ";minPlayExposeRatio = " + this.f30362a);
                return false;
            }
        }
    }

    public static Context a(Context context) {
        Context a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a75aa358", new Object[]{context});
        }
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof fpz) {
            a2 = ((fpz) context).a();
        } else {
            a2 = context instanceof com.taobao.prefork.a ? ((com.taobao.prefork.a) context).a() : null;
        }
        if (!(a2 instanceof Activity)) {
            return null;
        }
        return a2;
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
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == -8136938095111281463L) {
            this.q = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == 1035483994773344437L) {
            this.d = obj;
        } else if (j == 38174466807L) {
            this.e = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == -6737373688188729886L) {
            this.b = str;
        } else if (j == -5287008133921364644L) {
            this.c = str;
        } else if (j == 8499485291207392157L) {
            this.f = str;
        } else if (j == -1666749237118992970L) {
            this.h = str;
        } else if (j == -7963020384368345866L) {
            this.i = str;
        } else if (j == 8472049768233163199L) {
            this.j = str;
        } else if (j == 1805057142456087674L) {
            this.k = str;
        } else if (j == 10220202113345640L) {
            this.m = str;
        } else if (j == 800013180966223437L) {
            this.n = str;
        } else if (j == 3882830683672803752L) {
            this.o = str;
        } else if (j == 5615326228419484723L) {
            this.r = str;
        } else if (j == 7638094872275769326L) {
            this.s = str;
        } else if (j == 526508988394598507L) {
            this.t = str;
        } else if (j == 19617083574627L) {
            this.u = str;
        } else if (j == 5637158515563704755L) {
            this.w = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 3649100718983479135L) {
            this.f30362a = d;
        } else if (j == -9012118380120751455L) {
            this.g = d;
        } else if (j == 3898487036836366973L) {
            this.x = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 9122203915275105128L) {
            if (i == 0) {
                z = false;
            }
            this.l = z;
        } else if (j == 850419666986385006L) {
            if (i == 0) {
                z = false;
            }
            this.p = z;
        } else if (j == 311349093421208690L) {
            if (i == 0) {
                z = false;
            }
            this.v = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : (j == 8499485291207392157L || j == 8472049768233163199L || j == 1805057142456087674L || j == 5615326228419484723L || j == 7638094872275769326L) ? "0" : j == 526508988394598507L ? AliSDetailScaleType.centerCrop : super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j != 3649100718983479135L) {
            return super.getDefaultValueForDoubleAttr(j);
        }
        return 0.6d;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 9122203915275105128L) {
            return 1;
        }
        if (j != 850419666986385006L) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue() : (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static float a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c22", new Object[]{str})).floatValue();
        }
        if (str == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        com.taobao.android.dinamicx.videoc.b u = com.taobao.tao.recommend3.a.a().b().u();
        return u != null && u.b();
    }
}
