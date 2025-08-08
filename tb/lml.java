package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.annotation.AliSDetailScaleType;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import com.taobao.uikit.feature.features.RatioFeature;
import java.lang.ref.WeakReference;
import tb.mto;

/* loaded from: classes7.dex */
public class lml extends DXWidgetNode implements IVideoPlayControllerService.b, ifl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHTBLIMAGEVIEW_HTBLIMAGEVIEW = -5996311416603680075L;
    public static final long DXHTBLIMAGEVIEW_MINPLAYEXPOSERATIO = 3649100718983479135L;
    public static final long DXHTBLIMAGEVIEW_ONPARENTSCROLLSTART = -1305328253755158825L;
    public static final long DXHTBLIMAGEVIEW_ONPARENTSCROLLSTOP = -88908847944554642L;
    public static final long DXHTBLIMAGEVIEW_PLAYCONTROLLERENABLE = -8795905679455764171L;
    public static final long DXHTBLIMAGEVIEW_PLAYDURATION = -7241847713988459768L;
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
    public static final String LIVE_COUNT_MAIN_BIZ = "Page_Home_VideoPlayer_Count";
    public static final String LIVE_FEATURE_TYPE = "live";
    public static final String LIVE_MAIN_BIZ = "Page_Home_VideoPlayer";

    /* renamed from: a  reason: collision with root package name */
    private final lmk f30711a = new lmk();
    private final lmm b = new lmm(this.f30711a, this);
    private WeakReference<TBLiveOpenCardView> c;

    static {
        kge.a(550496103);
        kge.a(-1812803939);
        kge.a(1186087902);
    }

    public static /* synthetic */ Object ipc$super(lml lmlVar, String str, Object... objArr) {
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

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.b
    public void a(IVideoPlayControllerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fe7668", new Object[]{this, aVar});
        } else {
            this.b.a(aVar, getDXRuntimeContext());
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.b
    public void b(IVideoPlayControllerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff1dc47", new Object[]{this, aVar});
        } else {
            this.b.b(aVar, getDXRuntimeContext());
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.b
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f30711a.a();
    }

    private TBLiveOpenCardView e() {
        View view;
        TBLiveOpenCardView tBLiveOpenCardView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveOpenCardView) ipChange.ipc$dispatch("84237a0e", new Object[]{this});
        }
        WeakReference<TBLiveOpenCardView> weakReference = this.c;
        if (weakReference != null && (tBLiveOpenCardView = weakReference.get()) != null) {
            return tBLiveOpenCardView;
        }
        WeakReference<View> wRView = getWRView();
        if (wRView != null && (view = wRView.get()) != null) {
            return (TBLiveOpenCardView) view.findViewById(10);
        }
        return null;
    }

    @Override // tb.ifl
    public Drawable b() {
        TUrlImageView cover;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("75971531", new Object[]{this});
        }
        TBLiveOpenCardView e = e();
        if (e == null || (cover = e.getCover()) == null) {
            return null;
        }
        Drawable drawable = cover.getDrawable();
        if (drawable != null) {
            ldf.d("DXHTBLImageViewWidgetNode", "find live cover view drawable.");
        }
        return drawable;
    }

    @Override // tb.ifl
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        TBLiveOpenCardView e = e();
        if (e == null) {
            return false;
        }
        ldf.d("DXHTBLImageViewWidgetNode", "hit transitionSetEnableKeepLastFrame .");
        e.setEnableKeepLastFrame(z);
        return true;
    }

    @Override // tb.ifl
    public Bitmap f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8b0379cb", new Object[]{this});
        }
        TBLiveOpenCardView e = e();
        if (e == null) {
            return null;
        }
        if (ldj.a("orange_key_get_current_frame_degrade", false)) {
            TextureView a2 = a(e.getPlayerRootView());
            if (a2 != null) {
                return a2.getBitmap();
            }
            ldf.d("DXHTBLImageViewWidgetNode", "getTransitionCurrentFrame , degrade to TextureView . ");
            return null;
        }
        return e.getCurrentFrame();
    }

    private TextureView a(ViewGroup viewGroup) {
        TextureView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureView) ipChange.ipc$dispatch("d7ce0388", new Object[]{this, viewGroup});
        }
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (a2 = a((ViewGroup) childAt)) != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // tb.ifl
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        TBLiveOpenCardView e = e();
        if (e == null) {
            return false;
        }
        TUrlImageView cover = e.getCover();
        if (cover != null && cover.getVisibility() == 0) {
            ldf.d("DXHTBLImageViewWidgetNode", "transitionItemIsPlaying coverView on display.");
            return false;
        }
        return e.isPlaying();
    }

    @Override // tb.ifl
    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this});
        }
        TBLiveOpenCardView e = e();
        if (e != null) {
            return e.getPlayerRootView();
        }
        return null;
    }

    /* loaded from: classes7.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1445488446);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lml();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lml();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof lml)) {
        } else {
            super.onClone(dXWidgetNode, z);
            this.f30711a.a(((lml) dXWidgetNode).f30711a);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        TBLiveOpenCardView tBLiveOpenCardView = new TBLiveOpenCardView(context);
        this.c = new WeakReference<>(tBLiveOpenCardView);
        tBLiveOpenCardView.setId(10);
        frameLayout.addView(tBLiveOpenCardView, 0, new FrameLayout.LayoutParams(-1, -1));
        if (jqm.a()) {
            TextView textView = new TextView(context);
            textView.setText("新组件-服务化播控");
            textView.setTextColor(Color.parseColor("#ff0000"));
            textView.setTextSize(12.0f);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2));
        }
        return frameLayout;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        TBLiveOpenCardView tBLiveOpenCardView;
        int a2;
        int a3;
        int a4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof FrameLayout) || (tBLiveOpenCardView = (TBLiveOpenCardView) view.findViewById(10)) == null) {
            return;
        }
        TUrlImageView cover = tBLiveOpenCardView.getCover();
        if (cover != null) {
            onq.a(cover, cover.getImageUrl(), null, lfx.GUESS_IMAGE_STRATEGY_CONFIG);
            String imageUrl = cover.getImageUrl();
            if (imageUrl != null && !StringUtils.equals(imageUrl, this.f30711a.i()) && tBLiveOpenCardView.isPlaying()) {
                tBLiveOpenCardView.stopVideo();
            }
        }
        tBLiveOpenCardView.setPlayVideo(this.f30711a.p());
        tBLiveOpenCardView.setLiveVideo(this.f30711a.l());
        tBLiveOpenCardView.setPlayUrl(this.f30711a.o());
        tBLiveOpenCardView.setImageUrl(this.f30711a.i());
        tBLiveOpenCardView.setEnableCoverFade(true);
        tBLiveOpenCardView.setVideoLoop(this.f30711a.v());
        tBLiveOpenCardView.setScaleType(pbh.c(this.f30711a.t()));
        a(tBLiveOpenCardView);
        b(tBLiveOpenCardView);
        c(tBLiveOpenCardView);
        d(tBLiveOpenCardView);
        e(tBLiveOpenCardView);
        if (this.f30711a.e() != null) {
            tBLiveOpenCardView.setTag(this.f30711a.e());
        }
        if (this.f30711a.y() > 0) {
            tBLiveOpenCardView.setPlayDuration(this.f30711a.y());
        }
        if (!StringUtils.isEmpty(this.f30711a.c()) && -1 != (a4 = pbh.a(this.f30711a.c()))) {
            tBLiveOpenCardView.setBackgroundResource(a4);
        }
        if (!StringUtils.isEmpty(this.f30711a.n()) && -1 != (a3 = pbh.a(this.f30711a.n()))) {
            tBLiveOpenCardView.setPlaceHoldImageResId(a3);
        }
        if (!StringUtils.isEmpty(this.f30711a.m()) && -1 != (a2 = pbh.a(this.f30711a.m()))) {
            tBLiveOpenCardView.setColorFilter(a2);
        }
        if (this.f30711a.q() == null) {
            return;
        }
        tBLiveOpenCardView.setPlayerData(this.f30711a.q());
    }

    private void a(TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9598a", new Object[]{this, tBLiveOpenCardView});
            return;
        }
        String u = this.f30711a.u();
        if (StringUtils.isEmpty(u) || tBLiveOpenCardView == null) {
            return;
        }
        int a2 = pbh.a(u);
        if (a2 != -1) {
            tBLiveOpenCardView.setImageResource(pbh.a(u));
            return;
        }
        Resources resources = tBLiveOpenCardView.getContext().getResources();
        if (resources != null) {
            a2 = resources.getIdentifier(u, com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, tBLiveOpenCardView.getContext().getPackageName());
        }
        if (a2 <= 0) {
            return;
        }
        tBLiveOpenCardView.setImageResource(a2);
    }

    private void b(TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a04d829", new Object[]{this, tBLiveOpenCardView});
            return;
        }
        String w = this.f30711a.w();
        String d = this.f30711a.d();
        if (StringUtils.isEmpty(w) || StringUtils.isEmpty(d)) {
            return;
        }
        if (w.equals(d)) {
            tBLiveOpenCardView.setVisibility(0);
        } else {
            tBLiveOpenCardView.setVisibility(8);
        }
    }

    private void c(TBLiveOpenCardView tBLiveOpenCardView) {
        ImageShapeFeature imageShapeFeature;
        float a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442056c8", new Object[]{this, tBLiveOpenCardView});
            return;
        }
        String h = this.f30711a.h();
        if (StringUtils.isEmpty(h)) {
            return;
        }
        AbsFeature<? super ImageView> findFeature = tBLiveOpenCardView.findFeature(ImageShapeFeature.class);
        if (findFeature != null) {
            imageShapeFeature = (ImageShapeFeature) findFeature;
        } else {
            imageShapeFeature = new ImageShapeFeature();
            imageShapeFeature.setHost((ImageView) tBLiveOpenCardView.getCover());
            tBLiveOpenCardView.addFeature(imageShapeFeature);
        }
        int d = pbh.d(h);
        imageShapeFeature.setShape(d);
        String f = this.f30711a.f();
        double g = this.f30711a.g();
        if (d != 1 || StringUtils.isEmpty(f)) {
            return;
        }
        if (f.endsWith("ap") || f.endsWith("np")) {
            float a3 = fpr.a(tBLiveOpenCardView.getContext(), f, 0);
            imageShapeFeature.setCornerRadius(a3, a3, a3, a3);
            int i = (int) a3;
            tBLiveOpenCardView.setCornerRadius(i, i, i, i);
            return;
        }
        if (g != mto.a.GEO_NOT_SUPPORT) {
            a2 = lut.a(f, 0.0f) * ((float) g);
        } else {
            a2 = lut.a(f, 0.0f);
        }
        float a4 = fpr.a(tBLiveOpenCardView.getContext(), a2 / 2.0f);
        imageShapeFeature.setCornerRadius(a4, a4, a4, a4);
        int i2 = (int) a4;
        tBLiveOpenCardView.setCornerRadius(i2, i2, i2, i2);
    }

    private void d(TBLiveOpenCardView tBLiveOpenCardView) {
        RatioFeature ratioFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3bd567", new Object[]{this, tBLiveOpenCardView});
            return;
        }
        double x = this.f30711a.x();
        if (x <= mto.a.GEO_NOT_SUPPORT) {
            return;
        }
        AbsFeature<? super ImageView> findFeature = tBLiveOpenCardView.findFeature(RatioFeature.class);
        if (findFeature != null) {
            ratioFeature = (RatioFeature) findFeature;
        } else {
            ratioFeature = new RatioFeature();
            ratioFeature.setHost(tBLiveOpenCardView.getCover());
            tBLiveOpenCardView.addFeature(ratioFeature);
        }
        ratioFeature.setRatio((float) x);
    }

    private void e(TBLiveOpenCardView tBLiveOpenCardView) {
        ImageShapeFeature imageShapeFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78575406", new Object[]{this, tBLiveOpenCardView});
            return;
        }
        String k = this.f30711a.k();
        String j = this.f30711a.j();
        String s = this.f30711a.s();
        String r = this.f30711a.r();
        if (StringUtils.isEmpty(k) && StringUtils.isEmpty(j) && StringUtils.isEmpty(s) && StringUtils.isEmpty(r)) {
            return;
        }
        float a2 = pbh.a(tBLiveOpenCardView.getContext(), k);
        float a3 = pbh.a(tBLiveOpenCardView.getContext(), j);
        float a4 = pbh.a(tBLiveOpenCardView.getContext(), s);
        float a5 = pbh.a(tBLiveOpenCardView.getContext(), r);
        AbsFeature<? super ImageView> findFeature = tBLiveOpenCardView.findFeature(ImageShapeFeature.class);
        if (findFeature != null) {
            imageShapeFeature = (ImageShapeFeature) findFeature;
        } else {
            imageShapeFeature = new ImageShapeFeature();
            imageShapeFeature.setHost((ImageView) tBLiveOpenCardView.getCover());
            tBLiveOpenCardView.addFeature(imageShapeFeature);
        }
        imageShapeFeature.setCornerRadius(a2, a4, a3, a5);
        tBLiveOpenCardView.setCornerRadius((int) a2, (int) a4, (int) a3, (int) a5);
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
        this.b.a(dXEvent, getDXRuntimeContext());
        long eventId = dXEvent.getEventId();
        if (eventId == 7952648158329995189L) {
            ldf.d("DXHTBLImageViewWidgetNode", "receive on scroll start event");
            postEvent(new DXEvent(-1305328253755158825L));
        } else if (eventId == -7968002352509477560L) {
            ldf.d("DXHTBLImageViewWidgetNode", "receive on scroll stop event");
            postEvent(new DXEvent(-88908847944554642L));
        } else if (eventId != 5288671110273408574L) {
            return onEvent;
        } else {
            ldk.a("live", "live_exposure", "", "Page_Home_VideoPlayer_Count", "", null);
        }
        return true;
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
            this.f30711a.a(jSONObject);
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
            this.f30711a.a(obj);
        } else if (j == 38174466807L) {
            this.f30711a.b(obj);
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
            this.f30711a.a(str);
        } else if (j == -5287008133921364644L) {
            this.f30711a.b(str);
        } else if (j == 8499485291207392157L) {
            this.f30711a.c(str);
        } else if (j == -1666749237118992970L) {
            this.f30711a.d(str);
        } else if (j == -7963020384368345866L) {
            this.f30711a.e(str);
        } else if (j == 8472049768233163199L) {
            this.f30711a.f(str);
        } else if (j == 1805057142456087674L) {
            this.f30711a.g(str);
        } else if (j == 10220202113345640L) {
            this.f30711a.h(str);
        } else if (j == 800013180966223437L) {
            this.f30711a.i(str);
        } else if (j == 3882830683672803752L) {
            this.f30711a.j(str);
        } else if (j == 5615326228419484723L) {
            this.f30711a.k(str);
        } else if (j == 7638094872275769326L) {
            this.f30711a.l(str);
        } else if (j == 526508988394598507L) {
            this.f30711a.m(str);
        } else if (j == 19617083574627L) {
            this.f30711a.n(str);
        } else if (j == 5637158515563704755L) {
            this.f30711a.o(str);
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
            this.f30711a.a(d);
        } else if (j == -9012118380120751455L) {
            this.f30711a.b(d);
        } else if (j == 3898487036836366973L) {
            this.f30711a.c(d);
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
        } else if (j == -7241847713988459768L) {
            this.f30711a.a(i);
        } else if (j == 9122203915275105128L) {
            lmk lmkVar = this.f30711a;
            if (i == 0) {
                z = false;
            }
            lmkVar.b(z);
        } else if (j == 850419666986385006L) {
            lmk lmkVar2 = this.f30711a;
            if (i == 0) {
                z = false;
            }
            lmkVar2.c(z);
        } else if (j == 311349093421208690L) {
            lmk lmkVar3 = this.f30711a;
            if (i == 0) {
                z = false;
            }
            lmkVar3.d(z);
        } else if (j == -8795905679455764171L) {
            lmk lmkVar4 = this.f30711a;
            if (i == 0) {
                z = false;
            }
            lmkVar4.a(z);
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
        if (j == 850419666986385006L) {
            return 0;
        }
        if (j == -8795905679455764171L) {
            return 1;
        }
        if (j != -7241847713988459768L) {
            return super.getDefaultValueForIntAttr(j);
        }
        return -1;
    }
}
