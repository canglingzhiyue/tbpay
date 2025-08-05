package com.taobao.android.megadesign.dx.view;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.avplayer.common.z;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.ftu;
import tb.kal;
import tb.oyw;
import tb.sku;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 P2\u00020\u0001:\u0002OPB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010:\u001a\u00020\u00012\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010=\u001a\u00020\u00182\u0006\u0010>\u001a\u00020\u0004H\u0016J$\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020\u0004H\u0014J\u0018\u0010F\u001a\u00020@2\u0006\u0010G\u001a\u00020\u00012\u0006\u0010H\u001a\u00020*H\u0016J\u0010\u0010I\u001a\u00020D2\u0006\u0010A\u001a\u00020BH\u0014J\u0018\u0010J\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0014J\u0018\u0010K\u001a\u00020@2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0018H\u0014J\u0018\u0010M\u001a\u00020@2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010L\u001a\u000205H\u0014J\u0018\u0010N\u001a\u00020@2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010L\u001a\u00020,H\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0018X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0018X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u0018X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0006R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lcom/taobao/android/megadesign/dx/view/DXMegaVideoWidgetNode;", "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "()V", "DXMEGAVIDEO_VIDEOPLAYSCENES", "", "getDXMEGAVIDEO_VIDEOPLAYSCENES", "()J", "DXTBVIDEOVIEW_AUTOPLAY", "getDXTBVIDEOVIEW_AUTOPLAY", "DXTBVIDEOVIEW_BIZCODE", "getDXTBVIDEOVIEW_BIZCODE", "DXTBVIDEOVIEW_COVERURL", "getDXTBVIDEOVIEW_COVERURL", "DXTBVIDEOVIEW_ICONURL", "getDXTBVIDEOVIEW_ICONURL", "DXTBVIDEOVIEW_ISLOOP", "getDXTBVIDEOVIEW_ISLOOP", "DXTBVIDEOVIEW_ISMUTE", "getDXTBVIDEOVIEW_ISMUTE", "DXTBVIDEOVIEW_ISWIFIONLY", "getDXTBVIDEOVIEW_ISWIFIONLY", "DXTBVIDEOVIEW_SCALETYPE", "getDXTBVIDEOVIEW_SCALETYPE", "DXTBVIDEOVIEW_SCALETYPE_CENTERCROP", "", "getDXTBVIDEOVIEW_SCALETYPE_CENTERCROP", "()I", "DXTBVIDEOVIEW_SCALETYPE_FITCENTER", "getDXTBVIDEOVIEW_SCALETYPE_FITCENTER", "DXTBVIDEOVIEW_SCALETYPE_FITXY", "getDXTBVIDEOVIEW_SCALETYPE_FITXY", "DXTBVIDEOVIEW_SHOWPROGRESS", "getDXTBVIDEOVIEW_SHOWPROGRESS", "DXTBVIDEOVIEW_UTPARAMS", "getDXTBVIDEOVIEW_UTPARAMS", "DXTBVIDEOVIEW_VIDEOID", "getDXTBVIDEOVIEW_VIDEOID", "DXTBVIDEOVIEW_VIDEOSOURCE", "getDXTBVIDEOVIEW_VIDEOSOURCE", "DXTBVIDEOVIEW_VIDEOURL", "getDXTBVIDEOVIEW_VIDEOURL", Constants.Name.AUTO_PLAY, "", "bizCode", "", "coverUrl", "iconUrl", ftu.LOOP_PLAY, "isMute", "isWifiOnly", "scaleType", "showProgress", "utParams", "Lcom/alibaba/fastjson/JSONObject;", "videoId", oyw.VIDEO_PLAY_SCENES, sku.KEY_VIDEO_SOURCE, "videoUrl", CartRecommendRefreshScene.build, "object", "", "getDefaultValueForIntAttr", "key", "onBindEvent", "", "context", "Landroid/content/Context;", "weakView", "Landroid/view/View;", "eventId", "onClone", "widgetNode", "deepClone", "onCreateView", "onRenderView", "onSetIntAttribute", "attr", "onSetMapAttribute", "onSetStringAttribute", "Builder", "Companion", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public class c extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
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
    private final long f14259a = 1174195036188518487L;
    private final long b = 4692571841309926215L;
    private final long c = 1756289496339923034L;
    private final long d = 4951885508200836195L;
    private final long e = com.taobao.android.icart.widget.b.DXCARTLOTTIEVIEW_ISLOOP;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/megadesign/dx/view/DXMegaVideoWidgetNode$Builder;", "Lcom/taobao/android/dinamicx/widget/IDXBuilderWidgetNode;", "()V", CartRecommendRefreshScene.build, "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "object", "", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return (DXWidgetNode) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new c());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", kal.POINT_HOOK}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.android.megadesign.dx.view.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0550c implements z {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0550c() {
        }

        @Override // com.taobao.avplayer.common.z
        public final boolean hook() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
            }
            c.this.postEvent(new DXEvent(18903999933159L));
            return true;
        }
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
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

    public static final /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : F;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/megadesign/dx/view/DXMegaVideoWidgetNode$Companion;", "", "()V", "DXMEGAVIDEOVIEW_MEGAVIDEOVIEW", "", "getDXMEGAVIDEOVIEW_MEGAVIDEOVIEW", "()J", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : c.a();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new c();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode widgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, widgetNode, new Boolean(z)});
            return;
        }
        q.d(widgetNode, "widgetNode");
        if (!(widgetNode instanceof c)) {
            return;
        }
        super.onClone(widgetNode, z);
        c cVar = (c) widgetNode;
        this.r = cVar.r;
        this.s = cVar.s;
        this.t = cVar.t;
        this.u = cVar.u;
        this.v = cVar.v;
        this.w = cVar.w;
        this.x = cVar.x;
        this.y = cVar.y;
        this.z = cVar.z;
        this.A = cVar.A;
        this.B = cVar.B;
        this.C = cVar.C;
        this.D = cVar.D;
        this.E = cVar.E;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        q.d(context, "context");
        return new DisplayVideoView(context, null, 0, 6, null);
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
        if (!(weakView instanceof DisplayVideoView)) {
            return;
        }
        DisplayVideoView displayVideoView = (DisplayVideoView) weakView;
        displayVideoView.setLayoutMeasure(getMeasuredWidth(), getMeasuredHeight());
        displayVideoView.setVideoUrl(this.E);
        displayVideoView.setVideoID(this.B);
        displayVideoView.setPlayScene(this.C);
        displayVideoView.setVideoSource(this.D);
        displayVideoView.setCoverImage(this.t);
        displayVideoView.setPlayButtonImage(this.u);
        displayVideoView.setLooping(this.v);
        displayVideoView.setMuted(this.w);
        displayVideoView.setScaleType(this.y);
        displayVideoView.setUtParams(this.A);
        displayVideoView.setBizCode(this.s);
        displayVideoView.setShowProgress(this.z);
        displayVideoView.setAutoPlay(this.r);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (j != 18903999933159L || !(view instanceof DisplayVideoView)) {
        } else {
            ((DisplayVideoView) view).hookRootViewClickListener(new C0550c());
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
        } else if (j == this.f14259a) {
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
        if (j == this.f14259a || j == this.e) {
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
}
