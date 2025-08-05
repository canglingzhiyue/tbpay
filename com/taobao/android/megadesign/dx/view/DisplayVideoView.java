package com.taobao.android.megadesign.dx.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.av;
import com.taobao.avplayer.bk;
import com.taobao.avplayer.common.z;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.common.Constants;
import com.uc.webview.export.media.CommandID;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.eby;
import tb.ftu;
import tb.gbg;
import tb.kal;
import tb.mxf;
import tb.oyw;
import tb.sku;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b,\b\u0016\u0018\u0000 |2\u00020\u00012\u00020\u0002:\u0001|B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u00106\u001a\u000207H\u0016J\u000f\u00108\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u00109J4\u0010:\u001a&\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010;j\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u0001`<2\u0006\u0010.\u001a\u00020/H\u0016J\u000f\u0010=\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0002\u0010?J\n\u0010@\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010A\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010B\u001a\u000207H\u0002J\b\u0010C\u001a\u000207H\u0002J\u0012\u0010D\u001a\u0002072\b\u0010E\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010F\u001a\u000207H\u0016J\b\u0010G\u001a\u00020\u0012H\u0016J\b\u0010H\u001a\u00020\u0012H\u0016J\u0010\u0010I\u001a\u0002072\u0006\u0010J\u001a\u00020\u0012H\u0016J\b\u0010K\u001a\u000207H\u0014J\b\u0010L\u001a\u000207H\u0014J\b\u0010M\u001a\u000207H\u0016J\b\u0010N\u001a\u000207H\u0016J\"\u0010O\u001a\u0002072\b\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0016J\b\u0010T\u001a\u000207H\u0016J\"\u0010U\u001a\u0002072\b\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0016J\b\u0010V\u001a\u000207H\u0016J\u0010\u0010W\u001a\u0002072\u0006\u0010P\u001a\u00020\u0012H\u0016J\b\u0010X\u001a\u000207H\u0016J\u0012\u0010Y\u001a\u0002072\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J \u0010Z\u001a\u0002072\u0006\u0010[\u001a\u00020\b2\u0006\u0010\\\u001a\u00020\b2\u0006\u0010]\u001a\u00020\bH\u0016J\u0010\u0010^\u001a\u0002072\u0006\u0010P\u001a\u00020\bH\u0016J\b\u0010_\u001a\u000207H\u0016J\b\u0010`\u001a\u000207H\u0016J\b\u0010a\u001a\u000207H\u0016J\b\u0010b\u001a\u000207H\u0002J\u0010\u0010c\u001a\u0002072\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010d\u001a\u0002072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010e\u001a\u0002072\b\u0010f\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010g\u001a\u0002072\u0006\u0010h\u001a\u00020\b2\u0006\u0010i\u001a\u00020\bH\u0016J\u0010\u0010j\u001a\u0002072\u0006\u0010k\u001a\u00020\u0012H\u0016J\u0010\u0010l\u001a\u0002072\u0006\u0010'\u001a\u00020\u0012H\u0016J\u0012\u0010m\u001a\u0002072\b\u0010n\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010o\u001a\u0002072\b\u0010p\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010q\u001a\u0002072\u0006\u0010r\u001a\u00020\bH\u0016J\u0010\u0010s\u001a\u0002072\u0006\u0010 \u001a\u00020\u0012H\u0016J\b\u0010t\u001a\u000207H\u0002J\u0012\u0010u\u001a\u0002072\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u0010v\u001a\u0002072\b\u00100\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010w\u001a\u0002072\b\u00103\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010x\u001a\u0002072\b\u0010y\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010z\u001a\u000207H\u0002J\b\u0010{\u001a\u000207H\u0002R\u0014\u0010\n\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006}"}, d2 = {"Lcom/taobao/android/megadesign/dx/view/DisplayVideoView;", "Landroid/widget/FrameLayout;", "Lcom/taobao/avplayer/IDWVideoLifecycleListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DXTSVIDEOVIEW_SCALETYPE_CENTERCROP", "getDXTSVIDEOVIEW_SCALETYPE_CENTERCROP", "()I", "DXTSVIDEOVIEW_SCALETYPE_FITCENTER", "getDXTSVIDEOVIEW_SCALETYPE_FITCENTER", "DXTSVIDEOVIEW_SCALETYPE_FITXY", "getDXTSVIDEOVIEW_SCALETYPE_FITXY", Constants.Name.AUTO_PLAY, "", "bizCode", "", "coverImageView", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "coverRltLayout", "Landroid/widget/RelativeLayout;", "hookClickListener", "Lcom/taobao/avplayer/common/IDWRootViewClickListener;", "isContinuePlay", "()Z", "setContinuePlay", "(Z)V", ftu.LOOP_PLAY, "isShowProgress", "ivPlayButton", "lp", "Landroid/widget/FrameLayout$LayoutParams;", "mCoverUrl", "mHeight", "mIconUrl", "mMuted", "mScaleType", "mVideoUrl", "mWidth", "needScreenButton", "tbdwInstance", "Lcom/taobao/avplayer/TBDWInstance;", "utParams", "Lcom/alibaba/fastjson/JSONObject;", "videoId", oyw.VIDEO_PLAY_SCENES, "videoRootView", sku.KEY_VIDEO_SOURCE, "videoViewExtend", "Landroid/view/View;", "destroyVideo", "", "getCurrentVideoPosition", "()Ljava/lang/Integer;", "getUTParams", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getVideoDuration", "", "()Ljava/lang/Long;", "getVideoId", "getVideoUrl", "hideCoverImageView", "hidePlayerBtn", "hookRootViewClickListener", "clickListener", mxf.initView, "isPaused", "isPlaying", "muteVideo", "mute", "onAttachedToWindow", "onDetachedFromWindow", "onVideoClose", "onVideoComplete", "onVideoError", "p0", "", p1.d, "p2", "onVideoFullScreen", "onVideoInfo", "onVideoNormalScreen", "onVideoPause", "onVideoPlay", "onVideoPrepared", "onVideoProgressChanged", "currentPosition", "bufferPercent", "total", "onVideoSeekTo", "onVideoStart", "pauseVideo", "playVideo", "resetVideoBackground", "setAutoPlay", "setBizCode", "setCoverImage", "imageUrl", "setLayoutMeasure", "videoWidth", "videoHeight", "setLooping", "loop", CommandID.setMuted, "setPlayButtonImage", eby.KEY_PIC_URL, "setPlayScene", "playScene", "setScaleType", "scaleType", "setShowProgress", "setUpVideo", "setUtParams", "setVideoID", "setVideoSource", "setVideoUrl", "url", "showCoverImageView", "showPlayerBtn", "Companion", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public class DisplayVideoView extends FrameLayout implements av {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private static WeakReference<bk> currentVideoInstance;
    private final int DXTSVIDEOVIEW_SCALETYPE_CENTERCROP;
    private final int DXTSVIDEOVIEW_SCALETYPE_FITCENTER;
    private final int DXTSVIDEOVIEW_SCALETYPE_FITXY;
    private boolean autoPlay;
    private String bizCode;
    private TUrlImageView coverImageView;
    private RelativeLayout coverRltLayout;
    private z hookClickListener;
    private boolean isContinuePlay;
    private boolean isLoop;
    private boolean isShowProgress;
    private TUrlImageView ivPlayButton;
    private final FrameLayout.LayoutParams lp;
    private String mCoverUrl;
    private int mHeight;
    private String mIconUrl;
    private boolean mMuted;
    private int mScaleType;
    private String mVideoUrl;
    private int mWidth;
    private boolean needScreenButton;
    private bk tbdwInstance;
    private JSONObject utParams;
    private String videoId;
    private String videoPlayScenes;
    private FrameLayout videoRootView;
    private String videoSource;
    private View videoViewExtend;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", kal.POINT_HOOK}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class b implements z {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // com.taobao.avplayer.common.z
        public final boolean hook() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int[] iArr = new int[2];
            DisplayVideoView.this.getLocationInWindow(iArr);
            if (iArr[1] >= gbg.c(DisplayVideoView.this.getContext())) {
                return;
            }
            DisplayVideoView.this.playVideo();
        }
    }

    public static /* synthetic */ Object ipc$super(DisplayVideoView displayVideoView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/taobao/android/megadesign/dx/view/DisplayVideoView$Companion;", "", "()V", "currentVideoInstance", "Ljava/lang/ref/WeakReference;", "Lcom/taobao/avplayer/TBDWInstance;", "getCurrentVideoInstance", "()Ljava/lang/ref/WeakReference;", "setCurrentVideoInstance", "(Ljava/lang/ref/WeakReference;)V", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public WeakReference<bk> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("989ead36", new Object[]{this}) : DisplayVideoView.access$getCurrentVideoInstance$cp();
        }

        public void a(WeakReference<bk> weakReference) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb9cf36", new Object[]{this, weakReference});
            } else {
                DisplayVideoView.access$setCurrentVideoInstance$cp(weakReference);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q.d(context, "context");
        this.DXTSVIDEOVIEW_SCALETYPE_FITXY = 1;
        this.DXTSVIDEOVIEW_SCALETYPE_CENTERCROP = 2;
        this.coverImageView = new TUrlImageView(getContext());
        this.mIconUrl = "https://gw.alicdn.com/imgextra/i1/O1CN01ysjU9x1kB0849a3h3_!!6000000004644-2-tps-308-308.png";
        this.mScaleType = -1;
        this.autoPlay = true;
        this.lp = new FrameLayout.LayoutParams(-1, -1);
        this.hookClickListener = b.INSTANCE;
        initView();
    }

    public /* synthetic */ DisplayVideoView(Context context, AttributeSet attributeSet, int i, int i2, o oVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final /* synthetic */ WeakReference access$getCurrentVideoInstance$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("8348e2d9", new Object[0]) : currentVideoInstance;
    }

    public static final /* synthetic */ void access$setCurrentVideoInstance$cp(WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bedbe6ff", new Object[]{weakReference});
        } else {
            currentVideoInstance = weakReference;
        }
    }

    public final int getDXTSVIDEOVIEW_SCALETYPE_FITCENTER() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b475c5d", new Object[]{this})).intValue() : this.DXTSVIDEOVIEW_SCALETYPE_FITCENTER;
    }

    public final int getDXTSVIDEOVIEW_SCALETYPE_FITXY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e227a809", new Object[]{this})).intValue() : this.DXTSVIDEOVIEW_SCALETYPE_FITXY;
    }

    public final int getDXTSVIDEOVIEW_SCALETYPE_CENTERCROP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7a96c2a2", new Object[]{this})).intValue() : this.DXTSVIDEOVIEW_SCALETYPE_CENTERCROP;
    }

    public final boolean isContinuePlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b6960cd0", new Object[]{this})).booleanValue() : this.isContinuePlay;
    }

    public final void setContinuePlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c7e750", new Object[]{this, new Boolean(z)});
        } else {
            this.isContinuePlay = z;
        }
    }

    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.coverImageView = new TUrlImageView(getContext());
        this.coverImageView.setWhenNullClearImg(true);
        this.coverImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    private final void setUpVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b5ed65", new Object[]{this});
            return;
        }
        Context context = getContext();
        if (context != null) {
            bk.a aVar = new bk.a((Activity) context);
            int i = this.mHeight;
            if (i > 0) {
                aVar.d(i);
            }
            int i2 = this.mWidth;
            if (i2 > 0) {
                aVar.c(i2);
            }
            aVar.a(this.mVideoUrl);
            aVar.o(false);
            aVar.e(this.bizCode);
            aVar.b(this.videoId);
            aVar.c(this.videoSource);
            aVar.s(!this.isShowProgress);
            aVar.g(this.videoPlayScenes);
            JSONObject jSONObject = this.utParams;
            RelativeLayout relativeLayout = null;
            aVar.a(jSONObject != null ? getUTParams(jSONObject) : null);
            if (this.mMuted) {
                aVar.f(true);
                aVar.g(false);
            } else {
                aVar.f(false);
                aVar.g(true);
                aVar.n(true);
            }
            if (this.needScreenButton) {
                aVar.n(true);
            } else {
                aVar.n(false);
            }
            int i3 = this.mScaleType;
            if (i3 == this.DXTSVIDEOVIEW_SCALETYPE_FITCENTER) {
                aVar.a(DWAspectRatio.DW_FIT_CENTER);
                this.coverImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (i3 == this.DXTSVIDEOVIEW_SCALETYPE_CENTERCROP) {
                aVar.a(DWAspectRatio.DW_CENTER_CROP);
                this.coverImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else if (i3 == this.DXTSVIDEOVIEW_SCALETYPE_FITXY) {
                aVar.a(DWAspectRatio.DW_FIT_X_Y);
                this.coverImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            if (this.isContinuePlay) {
                aVar.m(false);
            }
            if (this.mCoverUrl != null) {
                TUrlImageView tUrlImageView = new TUrlImageView(getContext());
                int i4 = this.mScaleType;
                if (i4 == this.DXTSVIDEOVIEW_SCALETYPE_FITCENTER) {
                    tUrlImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } else if (i4 == this.DXTSVIDEOVIEW_SCALETYPE_CENTERCROP) {
                    tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                } else if (i4 == this.DXTSVIDEOVIEW_SCALETYPE_FITXY) {
                    tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                }
                tUrlImageView.setImageUrl(this.mCoverUrl);
                com.taobao.avplayer.interactivelifecycle.frontcover.model.a aVar2 = new com.taobao.avplayer.interactivelifecycle.frontcover.model.a();
                aVar2.a(tUrlImageView);
                aVar.i(true);
                aVar.a(aVar2);
            }
            this.tbdwInstance = aVar.c();
            bk bkVar = this.tbdwInstance;
            if (bkVar != null) {
                bkVar.hideCloseView();
            }
            bk bkVar2 = this.tbdwInstance;
            if (bkVar2 != null) {
                bkVar2.setVideoBackgroundColor(0);
            }
            bk bkVar3 = this.tbdwInstance;
            if (bkVar3 != null) {
                bkVar3.setVideoLifecycleListener(this);
            }
            bk bkVar4 = this.tbdwInstance;
            if (bkVar4 != null) {
                bkVar4.setRootViewClickListener(this.hookClickListener);
            }
            bk bkVar5 = this.tbdwInstance;
            ViewGroup view = bkVar5 != null ? bkVar5.getView() : null;
            if (view == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
            }
            this.videoRootView = (FrameLayout) view;
            this.videoViewExtend = LayoutInflater.from(getContext()).inflate(R.layout.mega_video_extend, (ViewGroup) this.videoRootView, false);
            View view2 = this.videoViewExtend;
            TUrlImageView tUrlImageView2 = view2 != null ? (TUrlImageView) view2.findViewById(R.id.iv_play_btn) : null;
            if (tUrlImageView2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
            }
            this.ivPlayButton = tUrlImageView2;
            View view3 = this.videoViewExtend;
            if (view3 != null) {
                relativeLayout = (RelativeLayout) view3.findViewById(R.id.rlt_toast);
            }
            if (relativeLayout == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
            }
            this.coverRltLayout = relativeLayout;
            TUrlImageView tUrlImageView3 = this.ivPlayButton;
            if (tUrlImageView3 != null) {
                tUrlImageView3.setImageUrl(this.mIconUrl);
            }
            removeAllViews();
            addView(this.videoRootView, 0, this.lp);
            addView(this.coverImageView, 1, this.lp);
            addView(this.videoViewExtend, 2, this.lp);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        bk bkVar = this.tbdwInstance;
        if (bkVar == null) {
            return;
        }
        bkVar.start();
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        bk bkVar = this.tbdwInstance;
        if (bkVar != null && isPlaying()) {
            bkVar.pauseVideo();
        }
        showPlayerBtn();
    }

    public void destroyVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545abca8", new Object[]{this});
            return;
        }
        showPlayerBtn();
        showCoverImageView();
        bk bkVar = this.tbdwInstance;
        if (bkVar == null) {
            return;
        }
        bkVar.setVideoLifecycleListener(null);
        bkVar.destroy();
        this.tbdwInstance = null;
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        bk bkVar = this.tbdwInstance;
        return bkVar != null && bkVar.getVideoState() == 1;
    }

    public boolean isPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ec0d383", new Object[]{this})).booleanValue();
        }
        bk bkVar = this.tbdwInstance;
        return bkVar != null && bkVar.getVideoState() == 2;
    }

    public void muteVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b98628b", new Object[]{this, new Boolean(z)});
            return;
        }
        setMuted(z);
        bk bkVar = this.tbdwInstance;
        if (bkVar == null) {
            return;
        }
        bkVar.mute(this.mMuted);
    }

    public HashMap<String, String> getUTParams(JSONObject utParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b87797b1", new Object[]{this, utParams});
        }
        q.d(utParams, "utParams");
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str : utParams.keySet()) {
            String valueOf = String.valueOf(str);
            hashMap.put(valueOf, (String) utParams.get(valueOf));
        }
        return hashMap;
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        hideCoverImageView();
        hidePlayerBtn();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        showPlayerBtn();
        showCoverImageView();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        Companion.a(new WeakReference<>(this.tbdwInstance));
        hidePlayerBtn();
        hideCoverImageView();
        resetVideoBackground();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        resetVideoBackground();
        hidePlayerBtn();
        hideCoverImageView();
        destroyVideo();
        RelativeLayout relativeLayout = this.coverRltLayout;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(0);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoComplete() {
        bk bkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        bk bkVar2 = this.tbdwInstance;
        if (bkVar2 == null) {
            return;
        }
        if (!isPlaying() && (bkVar = this.tbdwInstance) != null && bkVar.getCurrentPosition() == 0) {
            showPlayerBtn();
            showCoverImageView();
        }
        if (!this.isLoop) {
            return;
        }
        hidePlayerBtn();
        hideCoverImageView();
        bkVar2.replay();
    }

    private final void resetVideoBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216b3241", new Object[]{this});
            return;
        }
        bk bkVar = this.tbdwInstance;
        if (bkVar == null) {
            return;
        }
        bkVar.setVideoBackgroundColor(-16777216);
    }

    private final void showCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3ff68d", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.coverImageView;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setVisibility(0);
    }

    private final void hideCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ad192", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.coverImageView;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setVisibility(8);
    }

    private final void showPlayerBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc57ac5", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.ivPlayButton;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setVisibility(0);
    }

    private final void hidePlayerBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a0510a0", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.ivPlayButton;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        WeakReference<bk> a2;
        bk bkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (isPlaying()) {
            return;
        }
        WeakReference<bk> a3 = Companion.a();
        if ((a3 != null ? a3.get() : null) != null && q.a(this.tbdwInstance, Companion.a()) && (a2 = Companion.a()) != null && (bkVar = a2.get()) != null) {
            bkVar.pauseVideo();
        }
        setUpVideo();
        RelativeLayout relativeLayout = this.coverRltLayout;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (!this.autoPlay) {
            return;
        }
        postDelayed(new c(), 700L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        pauseVideo();
        destroyVideo();
        Companion.a(null);
    }

    public void setLayoutMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61484b39", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mWidth = i;
        this.mHeight = i2;
    }

    public void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
        } else {
            this.mVideoUrl = str;
        }
    }

    public void setCoverImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e694ff7", new Object[]{this, str});
            return;
        }
        this.mCoverUrl = str;
        this.coverImageView.setImageUrl(this.mCoverUrl);
    }

    public void setPlayButtonImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285fe304", new Object[]{this, str});
        } else {
            this.mIconUrl = str;
        }
    }

    public void setLooping(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c734b1", new Object[]{this, new Boolean(z)});
        } else {
            this.isLoop = z;
        }
    }

    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
        } else {
            this.mMuted = z;
        }
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.bizCode = str;
        }
    }

    public void setUtParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86fabc22", new Object[]{this, jSONObject});
        } else {
            this.utParams = jSONObject;
        }
    }

    public void setVideoSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0c1645", new Object[]{this, str});
        } else {
            this.videoSource = str;
        }
    }

    public void setVideoID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a27a7a5", new Object[]{this, str});
        } else {
            this.videoId = str;
        }
    }

    public void setScaleType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i)});
        } else {
            this.mScaleType = i;
        }
    }

    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z || !e.INSTANCE.a(getContext())) {
            z2 = false;
        }
        this.autoPlay = z2;
    }

    public void setShowProgress(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df0bce1", new Object[]{this, new Boolean(z)});
        } else {
            this.isShowProgress = z;
        }
    }

    public void setPlayScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5624d87", new Object[]{this, str});
        } else {
            this.videoPlayScenes = str;
        }
    }

    public void hookRootViewClickListener(z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb7c82c", new Object[]{this, zVar});
            return;
        }
        this.hookClickListener = zVar;
        bk bkVar = this.tbdwInstance;
        if (bkVar == null) {
            return;
        }
        bkVar.setRootViewClickListener(this.hookClickListener);
    }

    public Long getVideoDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("d511195", new Object[]{this});
        }
        bk bkVar = this.tbdwInstance;
        if (bkVar == null) {
            return null;
        }
        return Long.valueOf(bkVar.getDuration());
    }

    public Integer getCurrentVideoPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("869b1b6f", new Object[]{this});
        }
        bk bkVar = this.tbdwInstance;
        if (bkVar == null) {
            return null;
        }
        return Integer.valueOf(bkVar.getCurrentPosition());
    }

    public String getVideoId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this}) : this.videoId;
    }

    public String getVideoUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this}) : this.mVideoUrl;
    }
}
