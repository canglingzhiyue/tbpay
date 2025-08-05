package com.taobao.detail.rate.widget;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.android.icart.widget.b;
import com.taobao.avplayer.common.z;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.ftu;
import tb.fxy;
import tb.fym;
import tb.oyw;
import tb.sku;
import tb.thr;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0002WXB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010;\u001a\u00020\u00012\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010>\u001a\u0004\u0018\u00010?J\u0010\u0010@\u001a\u00020\u00192\u0006\u0010A\u001a\u00020\u0005H\u0016J$\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020\u0005H\u0014J\"\u0010I\u001a\u00020C2\u0010\u0010J\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00020K2\u0006\u0010L\u001a\u00020-H\u0016J\u0018\u0010M\u001a\u00020C2\u0006\u0010N\u001a\u00020\u00012\u0006\u0010O\u001a\u00020+H\u0016J\u0010\u0010P\u001a\u00020G2\u0006\u0010D\u001a\u00020EH\u0014J\u0018\u0010Q\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0014J\u0018\u0010R\u001a\u00020C2\u0006\u0010A\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u0019H\u0014J\u0018\u0010T\u001a\u00020C2\u0006\u0010A\u001a\u00020\u00052\u0006\u0010S\u001a\u000206H\u0014J\u0018\u0010U\u001a\u00020C2\u0006\u0010A\u001a\u00020\u00052\u0006\u0010S\u001a\u00020-H\u0014J\"\u0010V\u001a\u00020C2\u0010\u0010J\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00020K2\u0006\u0010L\u001a\u00020-H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u0019X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u0019X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u0019X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0014\u0010(\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lcom/taobao/detail/rate/widget/DXMegaVideoWidgetNodeV2;", "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "Lcom/taobao/android/dinamicx/videoc/core/listener/IDXVideoListener;", "()V", "DXMEGAVIDEO_VIDEOPLAYSCENES", "", "getDXMEGAVIDEO_VIDEOPLAYSCENES", "()J", "DXTBVIDEOVIEW_AUTOPLAY", "getDXTBVIDEOVIEW_AUTOPLAY", "DXTBVIDEOVIEW_BIZCODE", "getDXTBVIDEOVIEW_BIZCODE", "DXTBVIDEOVIEW_COVERURL", "getDXTBVIDEOVIEW_COVERURL", "DXTBVIDEOVIEW_ICONURL", "getDXTBVIDEOVIEW_ICONURL", "DXTBVIDEOVIEW_ISLOOP", "getDXTBVIDEOVIEW_ISLOOP", "DXTBVIDEOVIEW_ISMUTE", "getDXTBVIDEOVIEW_ISMUTE", "DXTBVIDEOVIEW_ISWIFIONLY", "getDXTBVIDEOVIEW_ISWIFIONLY", "DXTBVIDEOVIEW_SCALETYPE", "getDXTBVIDEOVIEW_SCALETYPE", "DXTBVIDEOVIEW_SCALETYPE_CENTERCROP", "", "getDXTBVIDEOVIEW_SCALETYPE_CENTERCROP", "()I", "DXTBVIDEOVIEW_SCALETYPE_FITCENTER", "getDXTBVIDEOVIEW_SCALETYPE_FITCENTER", "DXTBVIDEOVIEW_SCALETYPE_FITXY", "getDXTBVIDEOVIEW_SCALETYPE_FITXY", "DXTBVIDEOVIEW_SHOWPROGRESS", "getDXTBVIDEOVIEW_SHOWPROGRESS", "DXTBVIDEOVIEW_UTPARAMS", "getDXTBVIDEOVIEW_UTPARAMS", "DXTBVIDEOVIEW_VIDEOID", "getDXTBVIDEOVIEW_VIDEOID", "DXTBVIDEOVIEW_VIDEOSOURCE", "getDXTBVIDEOVIEW_VIDEOSOURCE", "DXTBVIDEOVIEW_VIDEOURL", "getDXTBVIDEOVIEW_VIDEOURL", Constants.Name.AUTO_PLAY, "", "bizCode", "", "coverUrl", "iconUrl", ftu.LOOP_PLAY, "isMute", "isWifiOnly", "scaleType", "showProgress", "utParams", "Lcom/alibaba/fastjson/JSONObject;", "videoId", oyw.VIDEO_PLAY_SCENES, sku.KEY_VIDEO_SOURCE, "videoUrl", CartRecommendRefreshScene.build, "object", "", "findVideoView", "Lcom/taobao/detail/rate/widget/DisplayVideoViewV2;", "getDefaultValueForIntAttr", "key", "onBindEvent", "", "context", "Landroid/content/Context;", "weakView", "Landroid/view/View;", "eventId", "onCanPlay", "p0", "Lcom/taobao/android/dinamicx/videoc/core/IDXVideoController;", p1.d, "onClone", "widgetNode", "deepClone", "onCreateView", "onRenderView", "onSetIntAttribute", "attr", "onSetMapAttribute", "onSetStringAttribute", "onShouldStop", "Builder", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class DXMegaVideoWidgetNodeV2 extends DXWidgetNode implements fym {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f$a Companion = new f$a(null);
    private static final long F = -1457195038351457670L;
    private JSONObject A;
    private String B;
    private String C;
    private String D;
    private String E;
    private final int o;
    private boolean r;
    private String s;
    private String t;
    private String u;
    private boolean v;
    private boolean z;

    /* renamed from: a  reason: collision with root package name */
    private final long f17052a = 1174195036188518487L;
    private final long b = 4692571841309926215L;
    private final long c = 1756289496339923034L;
    private final long d = 4951885508200836195L;
    private final long e = b.DXCARTLOTTIEVIEW_ISLOOP;
    private final long f = 9423396980483005L;
    private final long g = -5563993334780806377L;
    private final long h = 1015096712691932083L;
    private final long i = -7928569865764566238L;
    private final long j = 7062494548025744469L;
    private final long k = 5435952498458972235L;
    private final long l = -1723821953575824099L;
    private final long m = -2940280366635818861L;
    private final long n = 7344459856848172626L;
    private final int p = 1;
    private final int q = 2;
    private boolean w = true;
    private boolean x = true;
    private int y = -1;

    public static /* synthetic */ Object ipc$super(DXMegaVideoWidgetNodeV2 dXMegaVideoWidgetNodeV2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
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

    public final long getDXTBVIDEOVIEW_AUTOPLAY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("961d9515", new Object[]{this})).longValue() : this.f17052a;
    }

    public final long getDXTBVIDEOVIEW_BIZCODE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3cdec644", new Object[]{this})).longValue() : this.b;
    }

    public final long getDXTBVIDEOVIEW_COVERURL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e30db8a", new Object[]{this})).longValue() : this.c;
    }

    public final long getDXTBVIDEOVIEW_ICONURL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2cf0c1a", new Object[]{this})).longValue() : this.d;
    }

    public final long getDXTBVIDEOVIEW_ISLOOP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb5ae2c0", new Object[]{this})).longValue() : this.e;
    }

    public final long getDXTBVIDEOVIEW_ISMUTE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("688eabb5", new Object[]{this})).longValue() : this.f;
    }

    public final long getDXTBVIDEOVIEW_ISWIFIONLY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a753815d", new Object[]{this})).longValue() : this.g;
    }

    public final long getDXTBVIDEOVIEW_SCALETYPE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4611ac08", new Object[]{this})).longValue() : this.h;
    }

    public final long getDXTBVIDEOVIEW_SHOWPROGRESS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19e2f4dc", new Object[]{this})).longValue() : this.i;
    }

    public final long getDXTBVIDEOVIEW_UTPARAMS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4c395f97", new Object[]{this})).longValue() : this.j;
    }

    public final long getDXTBVIDEOVIEW_VIDEOID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f917b09a", new Object[]{this})).longValue() : this.k;
    }

    public final long getDXMEGAVIDEO_VIDEOPLAYSCENES() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("52e3f571", new Object[]{this})).longValue() : this.l;
    }

    public final long getDXTBVIDEOVIEW_VIDEOSOURCE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e549a19a", new Object[]{this})).longValue() : this.m;
    }

    public final long getDXTBVIDEOVIEW_VIDEOURL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("be367646", new Object[]{this})).longValue() : this.n;
    }

    public final int getDXTBVIDEOVIEW_SCALETYPE_FITCENTER() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4c2b564e", new Object[]{this})).intValue() : this.o;
    }

    public final int getDXTBVIDEOVIEW_SCALETYPE_FITXY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d6b0427a", new Object[]{this})).intValue() : this.p;
    }

    public final int getDXTBVIDEOVIEW_SCALETYPE_CENTERCROP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a63206d1", new Object[]{this})).intValue() : this.q;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXMegaVideoWidgetNodeV2();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode widgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, widgetNode, new Boolean(z)});
            return;
        }
        q.d(widgetNode, "widgetNode");
        if (!(widgetNode instanceof DXMegaVideoWidgetNodeV2)) {
            return;
        }
        super.onClone(widgetNode, z);
        DXMegaVideoWidgetNodeV2 dXMegaVideoWidgetNodeV2 = (DXMegaVideoWidgetNodeV2) widgetNode;
        this.r = dXMegaVideoWidgetNodeV2.r;
        this.s = dXMegaVideoWidgetNodeV2.s;
        this.t = dXMegaVideoWidgetNodeV2.t;
        this.u = dXMegaVideoWidgetNodeV2.u;
        this.v = dXMegaVideoWidgetNodeV2.v;
        this.w = dXMegaVideoWidgetNodeV2.w;
        this.x = dXMegaVideoWidgetNodeV2.x;
        this.y = dXMegaVideoWidgetNodeV2.y;
        this.z = dXMegaVideoWidgetNodeV2.z;
        this.A = dXMegaVideoWidgetNodeV2.A;
        this.B = dXMegaVideoWidgetNodeV2.B;
        this.C = dXMegaVideoWidgetNodeV2.C;
        this.D = dXMegaVideoWidgetNodeV2.D;
        this.E = dXMegaVideoWidgetNodeV2.E;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        q.d(context, "context");
        return new DisplayVideoViewV2(context, null, 0, 6, null);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View weakView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, weakView});
            return;
        }
        q.d(context, "context");
        q.d(weakView, "weakView");
        if (!(weakView instanceof DisplayVideoViewV2)) {
            return;
        }
        DisplayVideoViewV2 displayVideoViewV2 = (DisplayVideoViewV2) weakView;
        displayVideoViewV2.setLayoutMeasure(getMeasuredWidth(), getMeasuredHeight());
        displayVideoViewV2.setVideoUrl(this.E);
        displayVideoViewV2.setVideoID(this.B);
        displayVideoViewV2.setPlayScene(this.C);
        displayVideoViewV2.setVideoSource(this.D);
        displayVideoViewV2.setCoverImage(this.t);
        displayVideoViewV2.setPlayButtonImage(this.u);
        displayVideoViewV2.setLooping(this.v);
        displayVideoViewV2.setMuted(this.w);
        displayVideoViewV2.setScaleType(this.y);
        displayVideoViewV2.setUtParams(this.A);
        displayVideoViewV2.setBizCode(this.s);
        displayVideoViewV2.setShowProgress(this.z);
        displayVideoViewV2.setAutoPlay(this.r);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (j != 18903999933159L || !(view instanceof DisplayVideoViewV2)) {
        } else {
            ((DisplayVideoViewV2) view).hookRootViewClickListener(new z() { // from class: com.taobao.detail.rate.widget.f$b
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.common.z
                public final boolean hook() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
                    }
                    DXMegaVideoWidgetNodeV2.this.postEvent(new DXEvent(18903999933159L));
                    return true;
                }
            });
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject attr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), attr});
            return;
        }
        q.d(attr, "attr");
        if (j == this.j) {
            this.A = attr;
        } else {
            super.onSetMapAttribute(j, attr);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String attr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), attr});
            return;
        }
        q.d(attr, "attr");
        if (j == this.b) {
            this.s = attr;
        } else if (j == this.c) {
            this.t = attr;
        } else if (j == this.d) {
            this.u = attr;
        } else if (j == this.k) {
            this.B = attr;
        } else if (j == this.l) {
            this.C = attr;
        } else if (j == this.m) {
            this.D = attr;
        } else if (j == this.n) {
            this.E = attr;
        } else {
            super.onSetStringAttribute(j, attr);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == this.f17052a) {
            if (i == 0) {
                z = false;
            }
            this.r = z;
        } else if (j == this.e) {
            if (i == 0) {
                z = false;
            }
            this.v = z;
        } else if (j == this.f) {
            if (i == 0) {
                z = false;
            }
            this.w = z;
        } else if (j == this.g) {
            if (i == 0) {
                z = false;
            }
            this.x = z;
        } else if (j == this.h) {
            this.y = i;
        } else if (j == this.i) {
            if (i == 0) {
                z = false;
            }
            this.z = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == this.f17052a || j == this.e) {
            return 0;
        }
        if (j == this.f || j == this.g) {
            return 1;
        }
        if (j == this.h) {
            return this.o;
        }
        if (j != this.i) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }

    @Override // tb.fym
    public void onCanPlay(fxy<?, fym> p0, String p1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcb3bff", new Object[]{this, p0, p1});
            return;
        }
        q.d(p0, "p0");
        q.d(p1, "p1");
        DisplayVideoViewV2 findVideoView = findVideoView();
        if (!(findVideoView instanceof DisplayVideoViewV2)) {
            return;
        }
        if (thr.INSTANCE.a()) {
            thr.INSTANCE.a(findVideoView);
        } else {
            findVideoView.dealPlayVideo();
        }
    }

    @Override // tb.fym
    public void onShouldStop(fxy<?, fym> p0, String p1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c198f0e", new Object[]{this, p0, p1});
            return;
        }
        q.d(p0, "p0");
        q.d(p1, "p1");
        DisplayVideoViewV2 findVideoView = findVideoView();
        if (!(findVideoView instanceof DisplayVideoViewV2)) {
            return;
        }
        if (thr.INSTANCE.a()) {
            thr.INSTANCE.b(findVideoView);
            findVideoView.dealStopVideo();
            return;
        }
        findVideoView.dealStopVideo();
    }

    public final DisplayVideoViewV2 findVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayVideoViewV2) ipChange.ipc$dispatch("48c90516", new Object[]{this});
        }
        if (getDXRuntimeContext() == null) {
            return null;
        }
        DXRuntimeContext dxRuntimeContext = getDXRuntimeContext();
        q.b(dxRuntimeContext, "dxRuntimeContext");
        View v = dxRuntimeContext.v();
        q.b(v, "dxRuntimeContext.nativeView");
        if (!(v instanceof DisplayVideoViewV2)) {
            return null;
        }
        return (DisplayVideoViewV2) v;
    }
}
