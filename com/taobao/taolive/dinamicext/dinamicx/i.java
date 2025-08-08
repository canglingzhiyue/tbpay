package com.taobao.taolive.dinamicext.dinamicx;

import android.content.Context;
import android.content.res.Resources;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.annotation.AliSDetailScaleType;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.RatioFeature;
import java.util.Map;
import tb.kge;
import tb.mto;
import tb.pbh;
import tb.pro;
import tb.prr;
import tb.tee;

/* loaded from: classes8.dex */
public class i extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLIMAGEVIEW_AUTOPLAY = 1174195036188518487L;
    public static final long DXTBLIMAGEVIEW_CHATLISTDATA = 2072487133191711170L;
    public static final long DXTBLIMAGEVIEW_ENABLEREUSE = -7596363831296915338L;
    public static final long DXTBLIMAGEVIEW_IMAGEBIZID = 2897469727848826591L;
    public static final long DXTBLIMAGEVIEW_IMAGEBIZTYPE = -5713278466016543530L;
    public static final long DXTBLIMAGEVIEW_ISCACHE = 4954174782170669367L;
    public static final long DXTBLIMAGEVIEW_ISNEWVERSION = 4881218296263318520L;
    public static final long DXTBLIMAGEVIEW_ISOPENCARD = 3517744115322646514L;
    public static final long DXTBLIMAGEVIEW_LIFECYCLESYNCVIEWUSERIDS = -9130050081556616801L;
    public static final long DXTBLIMAGEVIEW_OPENCHAT = 5291123061236748602L;
    public static final long DXTBLIMAGEVIEW_PLAYDURATION = -7241847713988459768L;
    public static final long DXTBLIMAGEVIEW_PLAYNETWORK = 7153269919816174219L;
    public static final int DXTBLIMAGEVIEW_PLAYNETWORK_NONE = 2;
    public static final int DXTBLIMAGEVIEW_PLAYNETWORK_SYSTEM = 1;
    public static final int DXTBLIMAGEVIEW_PLAYNETWORK_WIFI = 0;
    public static final long DXTBLIMAGEVIEW_TBBACKGROUND = -6737373688188729886L;
    public static final long DXTBLIMAGEVIEW_TBCURRENTLIVESTATE = -5287008133921364644L;
    public static final long DXTBLIMAGEVIEW_TBGONEIFNULL = 1035483994773344437L;
    public static final long DXTBLIMAGEVIEW_TBID = 38174466807L;
    public static final long DXTBLIMAGEVIEW_TBIMAGECORNERRADIUS = 8499485291207392157L;
    public static final long DXTBLIMAGEVIEW_TBIMAGECORNERRADIUSRATIO = -9012118380120751455L;
    public static final long DXTBLIMAGEVIEW_TBIMAGESHAPE = -1666749237118992970L;
    public static final long DXTBLIMAGEVIEW_TBIMAGEURL = -7963020384368345866L;
    public static final long DXTBLIMAGEVIEW_TBINDEXOFSOURCE = 5266419815834493443L;
    public static final long DXTBLIMAGEVIEW_TBLEFTBOTTOMCORNERRADIUS = 8472049768233163199L;
    public static final long DXTBLIMAGEVIEW_TBLEFTTOPCORNERRADIUS = 1805057142456087674L;
    public static final long DXTBLIMAGEVIEW_TBLIMAGEVIEW = -7110052843691275924L;
    public static final long DXTBLIMAGEVIEW_TBLIVEVIDEO = 9122203915275105128L;
    public static final long DXTBLIMAGEVIEW_TBMASK = 10220202113345640L;
    public static final long DXTBLIMAGEVIEW_TBPARENTNODERECYCLERUSERID = -644055374885305243L;
    public static final long DXTBLIMAGEVIEW_TBPLACEHOLD = 800013180966223437L;
    public static final long DXTBLIMAGEVIEW_TBPLAYERDATA = -8136938095111281463L;
    public static final long DXTBLIMAGEVIEW_TBPLAYURL = 3882830683672803752L;
    public static final long DXTBLIMAGEVIEW_TBPLAYVIDEO = 850419666986385006L;
    public static final long DXTBLIMAGEVIEW_TBRIGHTBOTTOMCORNERRADIUS = 5615326228419484723L;
    public static final long DXTBLIMAGEVIEW_TBRIGHTTOPCORNERRADIUS = 7638094872275769326L;
    public static final long DXTBLIMAGEVIEW_TBSCALETYPE = 526508988394598507L;
    public static final long DXTBLIMAGEVIEW_TBSRC = 19617083574627L;
    public static final long DXTBLIMAGEVIEW_TBVIDEOLOOP = 311349093421208690L;
    public static final long DXTBLIMAGEVIEW_TBVISIBLESTATE = 5637158515563704755L;
    public static final long DXTBLIMAGEVIEW_TBWHRATIO = 3898487036836366973L;
    private String A;
    private double B;
    private com.taobao.android.live.plugin.proxy.debugPanel.a C;
    private String E;
    private String F;
    private boolean G;
    private Object H;
    private String I;
    private boolean J;
    private int K;
    private String L;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private String f;
    private String g;
    private Object h;
    private Object i;
    private String j;
    private double k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String q;
    private String r;
    private String s;
    private JSONObject u;
    private String v;
    private String w;
    private String y;
    private boolean z;

    /* renamed from: a  reason: collision with root package name */
    private boolean f21417a = false;
    private boolean M = true;
    private boolean p = true;
    private boolean t = false;
    private String x = AliSDetailScaleType.centerCrop;
    private TBLiveOpenCardView D = null;

    static {
        kge.a(-775997511);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        switch (str.hashCode()) {
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

    /* loaded from: classes8.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2001517168);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new i();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new i();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof i)) {
        } else {
            super.onClone(dXWidgetNode, z);
            i iVar = (i) dXWidgetNode;
            this.f21417a = iVar.f21417a;
            this.H = iVar.H;
            this.M = iVar.M;
            this.E = iVar.E;
            this.F = iVar.F;
            this.G = iVar.G;
            this.b = iVar.b;
            this.c = iVar.c;
            this.I = iVar.I;
            this.J = iVar.J;
            this.d = iVar.d;
            this.e = iVar.e;
            this.f = iVar.f;
            this.g = iVar.g;
            this.h = iVar.h;
            this.i = iVar.i;
            this.j = iVar.j;
            this.k = iVar.k;
            this.l = iVar.l;
            this.m = iVar.m;
            this.K = iVar.K;
            this.n = iVar.n;
            this.o = iVar.o;
            this.p = iVar.p;
            this.q = iVar.q;
            this.L = iVar.L;
            this.r = iVar.r;
            this.s = iVar.s;
            this.t = iVar.t;
            this.u = iVar.u;
            this.v = iVar.v;
            this.w = iVar.w;
            this.x = iVar.x;
            this.y = iVar.y;
            this.z = iVar.z;
            this.A = iVar.A;
            this.B = iVar.B;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new FrameLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof FrameLayout)) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) view;
        if (frameLayout.getChildCount() > 1 && (frameLayout.getChildAt(1) instanceof com.taobao.android.live.plugin.proxy.debugPanel.a)) {
            frameLayout.removeViewAt(1);
        }
        if (!this.M && prr.y()) {
            this.D = new TBLiveOpenCardView(context);
            this.D.setId(10);
            this.D.setEnableConsumePlayer(false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            frameLayout.removeAllViews();
            frameLayout.addView(this.D, 0, layoutParams);
        } else {
            this.D = (TBLiveOpenCardView) frameLayout.findViewById(10);
            if (this.D == null) {
                this.D = new TBLiveOpenCardView(context);
                this.D.setId(10);
                this.D.setEnableConsumePlayer(false);
                frameLayout.addView(this.D, 0, new FrameLayout.LayoutParams(-1, -1));
            }
        }
        a(frameLayout);
        if (!com.taobao.taolive.sdk.utils.b.d(context)) {
            return;
        }
        com.taobao.android.live.plugin.proxy.f.C().destroyDisplayView(context, this.C);
        this.C = com.taobao.android.live.plugin.proxy.f.C().createDisplayView(context, frameLayout, false);
        JSONObject jSONObject = this.u;
        if (jSONObject == null || this.C == null) {
            return;
        }
        this.C.refreshData((Map) JSONObject.toJavaObject(jSONObject.getJSONObject("modelDebugInfo"), Map.class), (Map) JSONObject.toJavaObject(this.u.getJSONObject("explainDebugInfo"), Map.class));
    }

    private boolean a() {
        int i;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : tee.a() && (i = getDXRuntimeContext().i()) >= 0 && i <= 5;
    }

    private void a(FrameLayout frameLayout) {
        int a2;
        int a3;
        int a4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
            return;
        }
        TBLiveOpenCardView tBLiveOpenCardView = (TBLiveOpenCardView) frameLayout.findViewById(10);
        boolean a5 = a();
        tBLiveOpenCardView.getCover().setWhenNullClearImg(true);
        if (a5 && tBLiveOpenCardView.getCover() != null && tBLiveOpenCardView.getCover().getDrawable() != null) {
            tBLiveOpenCardView.getCover().setWhenNullClearImg(false);
        }
        if (!this.G) {
            tBLiveOpenCardView.setPlayVideo(this.t);
            tBLiveOpenCardView.setLiveVideo(this.p);
            tBLiveOpenCardView.setEnableConsumePlayer(false);
            tBLiveOpenCardView.setPlayUrl(this.s);
            tBLiveOpenCardView.setVideoLoop(this.z);
            int i = this.d;
            if (i > 0) {
                tBLiveOpenCardView.setPlayDuration(i);
            }
            JSONObject jSONObject = this.u;
            if (jSONObject != null) {
                tBLiveOpenCardView.setPlayerData(jSONObject);
            }
            if (prr.e() && this.J) {
                Object obj = this.H;
                if ((obj instanceof JSONObject) && ((JSONObject) obj).size() > 0) {
                    tBLiveOpenCardView.setChatData((JSONObject) this.H);
                }
            }
            if (prr.w() && !pro.e(this.I)) {
                tBLiveOpenCardView.setViewInfoLifeCycleSyncOpenCard(getEngine(), getParentWidget(), this.I);
            }
        }
        if (!pro.e(this.E) && !pro.e(this.F) && tBLiveOpenCardView.getCover() != null) {
            tBLiveOpenCardView.getCover().setStrategyConfig(ImageStrategyConfig.a(this.F, this.E));
        }
        tBLiveOpenCardView.setScaleType(pbh.c(this.x));
        tBLiveOpenCardView.setImageUrl(this.m);
        a(tBLiveOpenCardView);
        b(tBLiveOpenCardView);
        c(tBLiveOpenCardView);
        Object obj2 = this.i;
        if (obj2 != null) {
            tBLiveOpenCardView.setTag(obj2);
        }
        if (!StringUtils.isEmpty(this.f) && -1 != (a4 = pbh.a(this.f))) {
            tBLiveOpenCardView.setBackgroundResource(a4);
        }
        if (!StringUtils.isEmpty(this.r) && -1 != (a3 = pbh.a(this.r))) {
            tBLiveOpenCardView.setPlaceHoldImageResId(a3);
        }
        if (StringUtils.isEmpty(this.q) || -1 == (a2 = pbh.a(this.q))) {
            return;
        }
        tBLiveOpenCardView.setColorFilter(a2);
    }

    private void a(TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9598a", new Object[]{this, tBLiveOpenCardView});
        } else if (StringUtils.isEmpty(this.y) || tBLiveOpenCardView == null) {
        } else {
            int a2 = pbh.a(this.y);
            if (a2 != -1) {
                tBLiveOpenCardView.setImageResource(pbh.a(this.y));
                return;
            }
            Resources resources = tBLiveOpenCardView.getContext().getResources();
            if (resources != null) {
                a2 = resources.getIdentifier(this.y, com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, tBLiveOpenCardView.getContext().getPackageName());
            }
            if (a2 == -1 || a2 == 0) {
                return;
            }
            tBLiveOpenCardView.setImageResource(a2);
        }
    }

    private void b(TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a04d829", new Object[]{this, tBLiveOpenCardView});
        } else if (StringUtils.isEmpty(this.A) || StringUtils.isEmpty(this.g)) {
        } else {
            if (this.A.equals(this.g)) {
                tBLiveOpenCardView.setVisibility(0);
            } else {
                tBLiveOpenCardView.setVisibility(8);
            }
        }
    }

    private void c(TBLiveOpenCardView tBLiveOpenCardView) {
        RatioFeature ratioFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442056c8", new Object[]{this, tBLiveOpenCardView});
        } else if (this.B <= mto.a.GEO_NOT_SUPPORT) {
        } else {
            AbsFeature<? super ImageView> findFeature = tBLiveOpenCardView.findFeature(RatioFeature.class);
            if (findFeature != null) {
                ratioFeature = (RatioFeature) findFeature;
            } else {
                ratioFeature = new RatioFeature();
                ratioFeature.setHost(tBLiveOpenCardView);
                tBLiveOpenCardView.addFeature(ratioFeature);
            }
            ratioFeature.setRatio((float) this.B);
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
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == -8136938095111281463L) {
            this.u = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == 2072487133191711170L) {
            this.H = obj;
        } else if (j == 1035483994773344437L) {
            this.h = obj;
        } else if (j == 38174466807L) {
            this.i = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 2897469727848826591L) {
            this.E = str;
        } else if (j == -5713278466016543530L) {
            this.F = str;
        } else if (j == -6737373688188729886L) {
            this.f = str;
        } else if (j == -5287008133921364644L) {
            this.g = str;
        } else if (j == -9130050081556616801L) {
            this.I = str;
        } else if (j == 8499485291207392157L) {
            this.j = str;
        } else if (j == -1666749237118992970L) {
            this.l = str;
        } else if (j == -7963020384368345866L) {
            this.m = str;
        } else if (j == 8472049768233163199L) {
            this.n = str;
        } else if (j == 1805057142456087674L) {
            this.o = str;
        } else if (j == 10220202113345640L) {
            this.q = str;
        } else if (j == 800013180966223437L) {
            this.r = str;
        } else if (j == 3882830683672803752L) {
            this.s = str;
        } else if (j == 5615326228419484723L) {
            this.v = str;
        } else if (j == 7638094872275769326L) {
            this.w = str;
        } else if (j == 526508988394598507L) {
            this.x = str;
        } else if (j == 19617083574627L) {
            this.y = str;
        } else if (j == 5637158515563704755L) {
            this.A = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == -9012118380120751455L) {
            this.k = d;
        } else if (j == 3898487036836366973L) {
            this.B = d;
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
        } else if (j == 1174195036188518487L) {
            if (i == 0) {
                z = false;
            }
            this.f21417a = z;
        } else if (j == DXTBLIMAGEVIEW_ENABLEREUSE) {
            if (i == 0) {
                z = false;
            }
            this.M = z;
        } else if (j == 4954174782170669367L) {
            if (i == 0) {
                z = false;
            }
            this.G = z;
        } else if (j == 4881218296263318520L) {
            if (i == 0) {
                z = false;
            }
            this.b = z;
        } else if (j == 3517744115322646514L) {
            if (i == 0) {
                z = false;
            }
            this.c = z;
        } else if (j == 5291123061236748602L) {
            if (i == 0) {
                z = false;
            }
            this.J = z;
        } else if (j == -7241847713988459768L) {
            this.d = i;
        } else if (j == 7153269919816174219L) {
            this.e = i;
        } else if (j == 5266419815834493443L) {
            this.K = i;
        } else if (j == 9122203915275105128L) {
            if (i == 0) {
                z = false;
            }
            this.p = z;
        } else if (j == 850419666986385006L) {
            if (i == 0) {
                z = false;
            }
            this.t = z;
        } else if (j == 311349093421208690L) {
            if (i == 0) {
                z = false;
            }
            this.z = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : j == 526508988394598507L ? AliSDetailScaleType.centerCrop : super.getDefaultValueForStringAttr(j);
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
        if (j == 9122203915275105128L) {
            return 1;
        }
        if (j != 850419666986385006L) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.m;
    }
}
