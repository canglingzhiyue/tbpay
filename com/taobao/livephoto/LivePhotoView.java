package com.taobao.livephoto;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.ai;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.bm;
import com.taobao.avplayer.bn;
import com.taobao.avplayer.common.af;
import com.taobao.avplayer.e;
import com.taobao.livephoto.watermask.WaterMaskView;
import com.taobao.livephoto.watermask.a;
import com.taobao.livephoto.watermask.b;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import tb.kge;
import tb.nmm;

/* loaded from: classes7.dex */
public class LivePhotoView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LivePhotoView";
    private boolean isPlaying;
    private String mCoverLocalPath;
    private bm.a mDwBuilder;
    private bm mDwLivePhotoView;
    private final List<d> mListeners;
    private ImageView mLiveIcon;
    private boolean mNeedShowLiveIcon;
    private String mVideoLocalPath;
    private final b mWaterMaskListener;
    private boolean mWidthAndHeightSet;
    private Pair<Drawable, String> unSavedWaterMask;

    static {
        kge.a(-42646737);
    }

    public static /* synthetic */ Object ipc$super(LivePhotoView livePhotoView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$000(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2882519b", new Object[]{livePhotoView})).booleanValue() : livePhotoView.isPlaying;
    }

    public static /* synthetic */ boolean access$002(LivePhotoView livePhotoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f692fe5f", new Object[]{livePhotoView, new Boolean(z)})).booleanValue();
        }
        livePhotoView.isPlaying = z;
        return z;
    }

    public static /* synthetic */ List access$100(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("84ee56ef", new Object[]{livePhotoView}) : livePhotoView.mListeners;
    }

    public static /* synthetic */ boolean access$200(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3052f1d", new Object[]{livePhotoView})).booleanValue() : livePhotoView.mNeedShowLiveIcon;
    }

    public static /* synthetic */ ImageView access$300(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("dc2f4af6", new Object[]{livePhotoView}) : livePhotoView.mLiveIcon;
    }

    public static /* synthetic */ bm access$400(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bm) ipChange.ipc$dispatch("ff7a919", new Object[]{livePhotoView}) : livePhotoView.mDwLivePhotoView;
    }

    public static /* synthetic */ String access$502(LivePhotoView livePhotoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cfb99f8", new Object[]{livePhotoView, str});
        }
        livePhotoView.mCoverLocalPath = str;
        return str;
    }

    public static /* synthetic */ boolean access$600(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("880aea21", new Object[]{livePhotoView})).booleanValue() : livePhotoView.isResourcesReady();
    }

    public static /* synthetic */ Pair access$700(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("8a150fa8", new Object[]{livePhotoView}) : livePhotoView.unSavedWaterMask;
    }

    public static /* synthetic */ Pair access$702(LivePhotoView livePhotoView, Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("9fe9fdc4", new Object[]{livePhotoView, pair});
        }
        livePhotoView.unSavedWaterMask = pair;
        return pair;
    }

    public static /* synthetic */ String access$800(LivePhotoView livePhotoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fae7ee1", new Object[]{livePhotoView}) : livePhotoView.mVideoLocalPath;
    }

    public static /* synthetic */ String access$802(LivePhotoView livePhotoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7ff8ed5", new Object[]{livePhotoView, str});
        }
        livePhotoView.mVideoLocalPath = str;
        return str;
    }

    public LivePhotoView(Context context) {
        super(context);
        this.mWidthAndHeightSet = false;
        this.mNeedShowLiveIcon = false;
        this.isPlaying = false;
        this.unSavedWaterMask = null;
        this.mWaterMaskListener = getWaterMaskListener();
        this.mListeners = new ArrayList();
        init();
    }

    public LivePhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWidthAndHeightSet = false;
        this.mNeedShowLiveIcon = false;
        this.isPlaying = false;
        this.unSavedWaterMask = null;
        this.mWaterMaskListener = getWaterMaskListener();
        this.mListeners = new ArrayList();
        init();
    }

    public LivePhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mWidthAndHeightSet = false;
        this.mNeedShowLiveIcon = false;
        this.isPlaying = false;
        this.unSavedWaterMask = null;
        this.mWaterMaskListener = getWaterMaskListener();
        this.mListeners = new ArrayList();
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mLiveIcon = (ImageView) ((FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.live_photo_view, this)).findViewById(R.id.live_icon);
        this.mDwBuilder = new bm.a((Activity) getContext()).b(false).a(getVideoLifecycleListener()).a(getLivePhotoListener()).a(new e()).a(new ai()).a(new com.taobao.avplayer.c()).a(DWAspectRatio.DW_CENTER_CROP).d("NonTBVideo").c("DWTEST").a(true);
    }

    public void addListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e727ede3", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            this.mListeners.add(dVar);
        }
    }

    public void removeListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeae7846", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            this.mListeners.remove(dVar);
        }
    }

    public void setLiveIconDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("982adef0", new Object[]{this, drawable});
            return;
        }
        ImageView imageView = this.mLiveIcon;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    public void setLiveIconVisible(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204771a2", new Object[]{this, new Boolean(z)});
            return;
        }
        ImageView imageView = this.mLiveIcon;
        if (imageView == null) {
            return;
        }
        this.mNeedShowLiveIcon = z;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void setLiveIconLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d260935f", new Object[]{this, layoutParams});
            return;
        }
        ImageView imageView = this.mLiveIcon;
        if (imageView == null) {
            return;
        }
        imageView.setLayoutParams(layoutParams);
    }

    public void setIsMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8cdd0e8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mDwBuilder.a(z);
        bm bmVar = this.mDwLivePhotoView;
        if (bmVar == null) {
            return;
        }
        bmVar.a(z);
    }

    public void setVolume(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
            return;
        }
        bm bmVar = this.mDwLivePhotoView;
        if (bmVar == null) {
            return;
        }
        bmVar.a(f);
    }

    public void setInitVideoScreenType(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702c0303", new Object[]{this, dWVideoScreenType});
        } else {
            this.mDwBuilder.a(dWVideoScreenType);
        }
    }

    public void setUserInfoAdapter(af afVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e255b543", new Object[]{this, afVar});
        } else {
            this.mDwBuilder.a(afVar);
        }
    }

    public void setConfigAdapter(com.taobao.avplayer.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a50ebd2", new Object[]{this, cVar});
        } else {
            this.mDwBuilder.a(cVar);
        }
    }

    public void setVideoAspectRatio(DWAspectRatio dWAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89072586", new Object[]{this, dWAspectRatio});
        } else {
            this.mDwBuilder.a(dWAspectRatio);
        }
    }

    public void setPlayScenes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7e5e8e", new Object[]{this, str});
        } else {
            this.mDwBuilder.e(str);
        }
    }

    public void setVideoSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0c1645", new Object[]{this, str});
        } else {
            this.mDwBuilder.d(str);
        }
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.mDwBuilder.c(str);
        }
    }

    public void setNeedLongClickStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef94925f", new Object[]{this, new Boolean(z)});
        } else {
            this.mDwBuilder.b(z);
        }
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue() : this.isPlaying;
    }

    public boolean saveToAlbum(Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1261e6f0", new Object[]{this, drawable, str})).booleanValue();
        }
        if (drawable == null || StringUtils.isEmpty(str)) {
            return false;
        }
        if (!a.a(getContext())) {
            this.unSavedWaterMask = new Pair<>(drawable, str);
            a.a(getContext(), getPermissionListener());
            return false;
        } else if (!isResourcesReady()) {
            this.unSavedWaterMask = new Pair<>(drawable, str);
            return false;
        } else {
            String saveBitmapAsFile = WaterMaskView.saveBitmapAsFile(getContext(), drawable, str);
            final com.taobao.livephoto.watermask.c cVar = new com.taobao.livephoto.watermask.c(getContext());
            cVar.a(this.mVideoLocalPath, saveBitmapAsFile, this.mWaterMaskListener);
            cVar.a(this.mCoverLocalPath, saveBitmapAsFile, getCoverViewIntrinsicWidth(), getCoverViewIntrinsicHeight(), this.mWaterMaskListener);
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.taobao.livephoto.LivePhotoView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                    } else {
                        cVar.a();
                    }
                }
            });
            return true;
        }
    }

    public void setLivePhotoInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b5c6aa5", new Object[]{this, jSONObject});
            return;
        }
        bm.a aVar = this.mDwBuilder;
        if (aVar == null) {
            return;
        }
        aVar.a(jSONObject);
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        bm.a aVar = this.mDwBuilder;
        if (aVar == null) {
            return;
        }
        aVar.b(str);
    }

    public void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
            return;
        }
        bm.a aVar = this.mDwBuilder;
        if (aVar == null) {
            return;
        }
        aVar.a(str);
    }

    public void setWidthAndHeight(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701eeb61", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        AdapterForTLog.logd(TAG, "setWidthAndHeight() width = " + i + ", height = " + i2);
        bm.a aVar = this.mDwBuilder;
        if (aVar == null) {
            return;
        }
        aVar.a(i).b(i2);
        this.mWidthAndHeightSet = true;
    }

    public void prepare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
            return;
        }
        AdapterForTLog.loge(TAG, "prepare() height = " + getHeight() + ", width = " + getWidth());
        this.mDwLivePhotoView = this.mDwBuilder.a();
        ((FrameLayout) findViewById(R.id.live_photo_container)).addView(this.mDwLivePhotoView.a(), new FrameLayout.LayoutParams(-1, -1));
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        AdapterForTLog.loge(TAG, "start() mDwLivePhotoView = " + this.mDwLivePhotoView + ", height = " + getHeight() + ", width = " + getWidth());
        if (this.mDwLivePhotoView == null) {
            prepare();
        }
        if (getWidth() <= 0 || getHeight() <= 0) {
            autoStartAfterLayoutChange();
            return;
        }
        if (!this.mWidthAndHeightSet) {
            this.mDwBuilder.b(getHeight()).a(getWidth());
        }
        this.mDwLivePhotoView.d();
    }

    public void autoStartAfterLayoutChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b9e6ca", new Object[]{this});
        } else {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.livephoto.LivePhotoView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                        return;
                    }
                    int i9 = i3 - i;
                    int i10 = i4 - i2;
                    AdapterForTLog.loge(LivePhotoView.TAG, "onLayoutChange: newWidth = " + i9 + ", newHeight = " + i10 + ", oldWidth = " + (i7 - i5) + ", oldHeight = " + (i8 - i6));
                    if (i9 <= 0 || i10 <= 0) {
                        return;
                    }
                    LivePhotoView.this.setWidthAndHeight(i9, i10);
                    LivePhotoView.this.start();
                    LivePhotoView.this.removeOnLayoutChangeListener(this);
                }
            });
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        bm bmVar = this.mDwLivePhotoView;
        if (bmVar == null) {
            return;
        }
        bmVar.f();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.mDwLivePhotoView == null) {
        } else {
            ((FrameLayout) findViewById(R.id.live_photo_container)).removeView(this.mDwLivePhotoView.a());
            this.mDwLivePhotoView.e();
            this.mDwLivePhotoView = null;
            this.mWidthAndHeightSet = false;
            this.mListeners.clear();
        }
    }

    public View getLivePhotoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5b6afbfe", new Object[]{this});
        }
        bm bmVar = this.mDwLivePhotoView;
        if (bmVar == null) {
            return null;
        }
        return bmVar.a();
    }

    public String getCoverPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("25093cf3", new Object[]{this}) : this.mCoverLocalPath;
    }

    public String getVideoPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("45bc20af", new Object[]{this}) : this.mVideoLocalPath;
    }

    public void loadVideoAndImagePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4203565", new Object[]{this});
            return;
        }
        bm bmVar = this.mDwLivePhotoView;
        if (bmVar == null) {
            return;
        }
        bmVar.b();
        this.mDwLivePhotoView.c();
    }

    private int getCoverViewIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfcd8aa1", new Object[]{this})).intValue();
        }
        bm bmVar = this.mDwLivePhotoView;
        if (bmVar != null) {
            View childAt = bmVar.a().getChildAt(1);
            if (childAt instanceof ImageView) {
                return ((ImageView) childAt).getDrawable().getIntrinsicWidth();
            }
        }
        return 0;
    }

    private int getCoverViewIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4166ae0", new Object[]{this})).intValue();
        }
        bm bmVar = this.mDwLivePhotoView;
        if (bmVar != null) {
            View childAt = bmVar.a().getChildAt(1);
            if (childAt instanceof ImageView) {
                return ((ImageView) childAt).getDrawable().getIntrinsicHeight();
            }
        }
        return 0;
    }

    private aw getVideoLifecycleListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aw) ipChange.ipc$dispatch("46864389", new Object[]{this}) : new aw() { // from class: com.taobao.livephoto.LivePhotoView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.aw
            public void onVideoStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c2b2d56d", new Object[]{this});
                    return;
                }
                AdapterForTLog.logd(LivePhotoView.TAG, "onVideoStart");
                LivePhotoView.access$002(LivePhotoView.this, true);
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.onVideoStart();
                }
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoPause(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                    return;
                }
                AdapterForTLog.logd(LivePhotoView.TAG, "onVideoPause, cover visible");
                LivePhotoView.access$002(LivePhotoView.this, false);
                if (LivePhotoView.access$200(LivePhotoView.this) && LivePhotoView.access$300(LivePhotoView.this) != null) {
                    LivePhotoView.access$300(LivePhotoView.this).setVisibility(0);
                }
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.onVideoPause(z);
                }
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoPlay() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("931007b7", new Object[]{this});
                    return;
                }
                AdapterForTLog.logd(LivePhotoView.TAG, "onVideoPlay");
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.onVideoPlay();
                }
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoSeekTo(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
                    return;
                }
                AdapterForTLog.logd(LivePhotoView.TAG, "onVideoSeekTo, currentPosition=" + i);
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.onVideoSeekTo(i);
                }
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoPrepared(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3faee61c", new Object[]{this, obj});
                    return;
                }
                AdapterForTLog.logd(LivePhotoView.TAG, "onVideoPrepared");
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.onVideoPrepared(obj);
                }
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoError(Object obj, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                    return;
                }
                AdapterForTLog.logd(LivePhotoView.TAG, "onVideoError, cover visible, what=" + i + ", extra=" + i2);
                LivePhotoView.access$002(LivePhotoView.this, false);
                if (LivePhotoView.access$200(LivePhotoView.this) && LivePhotoView.access$300(LivePhotoView.this) != null) {
                    LivePhotoView.access$300(LivePhotoView.this).setVisibility(0);
                }
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.onVideoError(obj, i, i2);
                }
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
                    return;
                }
                if (LivePhotoView.access$000(LivePhotoView.this) && LivePhotoView.access$300(LivePhotoView.this) != null) {
                    LivePhotoView.access$300(LivePhotoView.this).setVisibility(8);
                }
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.onVideoInfo(obj, j, j2, j3, obj2);
                }
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                AdapterForTLog.logd(LivePhotoView.TAG, "onVideoComplete, cover visible");
                LivePhotoView.access$002(LivePhotoView.this, false);
                if (LivePhotoView.access$200(LivePhotoView.this) && LivePhotoView.access$300(LivePhotoView.this) != null) {
                    LivePhotoView.access$300(LivePhotoView.this).setVisibility(0);
                }
                if (LivePhotoView.access$400(LivePhotoView.this) != null) {
                    LivePhotoView.access$400(LivePhotoView.this).b();
                    LivePhotoView.access$400(LivePhotoView.this).c();
                }
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.onVideoComplete();
                }
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoClose() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("24db3403", new Object[]{this});
                    return;
                }
                AdapterForTLog.logd(LivePhotoView.TAG, "onVideoClose, cover visible");
                LivePhotoView.access$002(LivePhotoView.this, false);
                if (LivePhotoView.access$200(LivePhotoView.this) && LivePhotoView.access$300(LivePhotoView.this) != null) {
                    LivePhotoView.access$300(LivePhotoView.this).setVisibility(0);
                }
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.onVideoClose();
                }
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
                    return;
                }
                AdapterForTLog.logd(LivePhotoView.TAG, "onVideoScreenChanged, screenType=" + dWVideoScreenType);
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.onVideoScreenChanged(dWVideoScreenType);
                }
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoProgressChanged(int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.onVideoProgressChanged(i, i2, i3);
                }
            }
        };
    }

    private bn getLivePhotoListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bn) ipChange.ipc$dispatch("e47a7288", new Object[]{this}) : new bn() { // from class: com.taobao.livephoto.LivePhotoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.bn
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                AdapterForTLog.logd(LivePhotoView.TAG, "onCoverImgSavedCompleted: imgUrl=" + str);
                LivePhotoView.access$502(LivePhotoView.this, str);
                if (LivePhotoView.access$600(LivePhotoView.this) && LivePhotoView.access$700(LivePhotoView.this) != null) {
                    LivePhotoView livePhotoView = LivePhotoView.this;
                    livePhotoView.saveToAlbum((Drawable) LivePhotoView.access$700(livePhotoView).first, (String) LivePhotoView.access$700(LivePhotoView.this).second);
                    LivePhotoView.access$702(LivePhotoView.this, null);
                }
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.a(str);
                }
            }

            @Override // com.taobao.avplayer.bn
            public void b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    return;
                }
                AdapterForTLog.logd(LivePhotoView.TAG, "onVideoSavedCompleted: videoLocalPath=" + LivePhotoView.access$800(LivePhotoView.this));
                LivePhotoView.access$802(LivePhotoView.this, str);
                if (LivePhotoView.access$600(LivePhotoView.this) && LivePhotoView.access$700(LivePhotoView.this) != null) {
                    LivePhotoView livePhotoView = LivePhotoView.this;
                    livePhotoView.saveToAlbum((Drawable) LivePhotoView.access$700(livePhotoView).first, (String) LivePhotoView.access$700(LivePhotoView.this).second);
                    LivePhotoView.access$702(LivePhotoView.this, null);
                }
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.b(str);
                }
            }

            @Override // com.taobao.avplayer.bn
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                AdapterForTLog.logd(LivePhotoView.TAG, "onCoverShowedSuccess: onCoverShowedSuccess");
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.a();
                }
            }

            @Override // com.taobao.avplayer.bn
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                AdapterForTLog.logd(LivePhotoView.TAG, "onCoverShowedFailed: onCoverShowedFailed");
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.b();
                }
            }
        };
    }

    private b getWaterMaskListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9546d7c3", new Object[]{this}) : new b() { // from class: com.taobao.livephoto.LivePhotoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.livephoto.watermask.b
            public void c(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88097eb4", new Object[]{this, str});
                    return;
                }
                AdapterForTLog.logd(LivePhotoView.TAG, "onWaterMaskFileSuccess: filePath=" + str);
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.c(str);
                }
            }

            @Override // com.taobao.livephoto.watermask.b
            public void d(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d23b17f5", new Object[]{this, str});
                    return;
                }
                AdapterForTLog.logd(LivePhotoView.TAG, "onWaterMaskFileFail: errorInfo=" + str);
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.d(str);
                }
            }

            @Override // com.taobao.livephoto.watermask.b
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                for (d dVar : LivePhotoView.access$100(LivePhotoView.this)) {
                    dVar.a(i);
                }
            }
        };
    }

    private boolean isResourcesReady() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9556e2d3", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.mVideoLocalPath) && !StringUtils.isEmpty(this.mCoverLocalPath);
    }

    private nmm getPermissionListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nmm) ipChange.ipc$dispatch("cd45c818", new Object[]{this}) : new nmm() { // from class: com.taobao.livephoto.LivePhotoView.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nmm
            public void a(String[] strArr, int[] iArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0ebed05", new Object[]{this, strArr, iArr});
                } else if (!a.a(LivePhotoView.this.getContext())) {
                    Toast.makeText(LivePhotoView.this.getContext(), LivePhotoView.this.getContext().getString(R.string.request_permission), 1).show();
                } else if (LivePhotoView.access$700(LivePhotoView.this) == null) {
                } else {
                    LivePhotoView livePhotoView = LivePhotoView.this;
                    livePhotoView.saveToAlbum((Drawable) LivePhotoView.access$700(livePhotoView).first, (String) LivePhotoView.access$700(LivePhotoView.this).second);
                    LivePhotoView.access$702(LivePhotoView.this, null);
                }
            }
        };
    }
}
