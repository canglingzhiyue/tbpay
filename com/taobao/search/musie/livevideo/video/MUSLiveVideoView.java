package com.taobao.search.musie.livevideo.video;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_uikit.widget.img.UIImageDrawable;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.MediaType;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.mediaplay.player.e;
import tb.kge;
import tb.noa;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes7.dex */
public class MUSLiveVideoView extends ViewGroup implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "mus-live-video";
    public static final String TAG_NAME = "mus-live-video";
    private boolean hidePoster;
    private a mCallback;
    private int mHeight;
    private MediaPlayCenter mMPC;
    private boolean mPlayed;
    private int mWidth;
    private UIImageDrawable posterDrawable;
    private boolean valid;
    private MusLiveVideo videoNode;

    static {
        kge.a(-201259975);
        kge.a(-613305621);
    }

    public static /* synthetic */ Object ipc$super(MUSLiveVideoView mUSLiveVideoView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1944670684:
                super.invalidateDrawable((Drawable) objArr[0]);
                return null;
            case -1894755994:
                return new Boolean(super.verifyDrawable((Drawable) objArr[0]));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 1289754646:
                super.setPadding(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
        }
    }

    public MUSLiveVideoView(Context context) {
        super(context);
        this.hidePoster = false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        if (drawable != this.posterDrawable) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }

    private void loadPoster(MUSDKInstance mUSDKInstance, String str, String str2, int i, int i2, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7c374c9", new Object[]{this, mUSDKInstance, str, str2, new Integer(i), new Integer(i2), rect});
        } else if (StringUtils.isEmpty(str)) {
            releasePoster(mUSDKInstance);
        } else {
            this.posterDrawable = new UIImageDrawable();
            this.posterDrawable.a(rect);
            this.posterDrawable.setBounds(0, 0, i, i2);
            this.posterDrawable.setCallback(this);
            this.posterDrawable.a(null, mUSDKInstance, str, "", str2, i, i2, MUSImageQuality.AUTO);
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c16ae24", new Object[]{this, drawable});
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        UIImageDrawable uIImageDrawable = this.posterDrawable;
        if (uIImageDrawable == null) {
            return;
        }
        uIImageDrawable.setBounds(0, 0, i, i2);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.setPadding(i, i2, i3, i4);
        UIImageDrawable uIImageDrawable = this.posterDrawable;
        if (uIImageDrawable == null) {
            return;
        }
        uIImageDrawable.a(new Rect(i, i2, i3, i4));
    }

    private void releasePoster(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c433ec9b", new Object[]{this, mUSDKInstance});
        } else if (this.posterDrawable == null) {
        } else {
            invalidate();
            this.posterDrawable.a(mUSDKInstance);
            this.posterDrawable.setCallback(null);
            this.posterDrawable = null;
        }
    }

    public void mount(MusLiveVideo musLiveVideo, MUSDKInstance mUSDKInstance, a aVar, int i, int i2, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca62204", new Object[]{this, musLiveVideo, mUSDKInstance, aVar, new Integer(i), new Integer(i2), rect});
            return;
        }
        this.videoNode = musLiveVideo;
        reset();
        this.mPlayed = false;
        this.mWidth = i;
        this.mHeight = i2;
        this.mCallback = aVar;
        loadPoster(mUSDKInstance, (String) musLiveVideo.getAttribute(MusLiveVideo.ATTR_POSTER), (String) musLiveVideo.getAttribute("objectFit"), i, i2, rect);
        this.valid = false;
        this.hidePoster = false;
        tryLoadVideo();
    }

    public void hidePoster() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b45a236", new Object[]{this});
        } else if (this.hidePoster) {
        } else {
            this.hidePoster = true;
            invalidate();
        }
    }

    public void showPoster() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de00f231", new Object[]{this});
        } else if (!this.hidePoster) {
        } else {
            this.hidePoster = false;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        super.dispatchDraw(canvas);
        UIImageDrawable uIImageDrawable = this.posterDrawable;
        if (uIImageDrawable == null || this.hidePoster) {
            return;
        }
        uIImageDrawable.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (getChildCount() == 0) {
        } else {
            getChildAt(0).layout(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        if (getChildCount() == 0) {
            return;
        }
        getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - getPaddingTop()) - getPaddingBottom(), 1073741824));
    }

    private void tryLoadVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb9b741", new Object[]{this});
        } else if (this.valid) {
        } else {
            this.valid = true;
            addNewVideo(this.mCallback, (String) this.videoNode.getAttribute("src"), this.videoNode.isLoop(), this.videoNode.isMuted(), (String) this.videoNode.getAttribute("videoId"), this.mWidth, this.mHeight);
        }
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else if (this.mMPC == null || !this.valid) {
        } else {
            this.mPlayed = false;
            this.valid = false;
            removeAllViews();
            this.mMPC.release();
            this.mMPC.destroy();
            this.mMPC = null;
        }
    }

    private static MediaAspectRatio getResizeMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaAspectRatio) ipChange.ipc$dispatch("441bb214", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return MediaAspectRatio.DW_FIT_CENTER;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3143043) {
            if (hashCode != 94852023) {
                if (hashCode == 951526612 && str.equals("contain")) {
                    c = 0;
                }
            } else if (str.equals("cover")) {
                c = 2;
            }
        } else if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_fill)) {
            c = 1;
        }
        if (c == 0) {
            return MediaAspectRatio.DW_FIT_CENTER;
        }
        if (c == 1) {
            return MediaAspectRatio.DW_FIT_X_Y;
        }
        if (c == 2) {
            return MediaAspectRatio.DW_CENTER_CROP;
        }
        return MediaAspectRatio.DW_FIT_CENTER;
    }

    private void addNewVideo(a aVar, String str, boolean z, boolean z2, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18f2b01", new Object[]{this, aVar, str, new Boolean(z), new Boolean(z2), str2, new Integer(i), new Integer(i2)});
            return;
        }
        this.mCallback = aVar;
        b bVar = new b((String) this.videoNode.getAttribute("bizFrom"), (String) this.videoNode.getAttribute("contentId"), (JSONObject) this.videoNode.getAttribute("utParams"), (String) this.videoNode.getAttribute("objectFit"));
        bVar.a((Boolean) this.videoNode.getAttribute("controls"));
        bVar.d((Boolean) this.videoNode.getAttribute(MusLiveVideo.ATTR_SHOW_CENTER_PLAY_BTN));
        bVar.b((Boolean) this.videoNode.getAttribute(MusLiveVideo.ATTR_SHOW_FULLSCREEN_BTN));
        bVar.c((Boolean) this.videoNode.getAttribute(MusLiveVideo.ATTR_SHOW_PLAY_BTN));
        bVar.e((Boolean) this.videoNode.getAttribute(MusLiveVideo.ATTR_SHOW_MUTE_BTN));
        bVar.a((String) this.videoNode.getAttribute(MusLiveVideo.ATTR_PLAY_SCENES));
        if (this.mMPC == null) {
            this.mMPC = new MediaPlayCenter(getContext());
            this.mMPC.setMediaUrl(str);
            this.mMPC.setMediaType(MediaType.LIVE);
            this.mMPC.setConfigGroup("DW");
            this.mMPC.setNeedPlayControlView(false);
            this.mMPC.hiddenMiniProgressBar(true);
            this.mMPC.hideController();
            this.mMPC.setVideoLoop(z);
            this.mMPC.setMute(z2);
            this.mMPC.setMediaAspectRatio(getResizeMode(bVar.a()));
            this.mMPC.setBizCode(StringUtils.isEmpty(bVar.b()) ? noa.DEFAULT_VIDEO_BIZ_CODE : bVar.b());
            this.mMPC.setPlayScenes(StringUtils.isEmpty(bVar.c()) ? noa.DEFAULE_VIDEO_PLAY_SCENES : bVar.c());
            this.mMPC.setup();
            this.mMPC.setMediaLifecycleListener(this);
        }
        View view = this.mMPC.getView();
        if (view == null) {
            throw new RuntimeException("IMUSVideoAdapter mustn't return null");
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
    }

    public void unmount(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c637732f", new Object[]{this, mUSDKInstance});
            return;
        }
        this.mWidth = 0;
        this.mHeight = 0;
        this.mCallback = null;
        this.videoNode = null;
        reset();
        releasePoster(mUSDKInstance);
    }

    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        tryLoadVideo();
        MediaPlayCenter mediaPlayCenter = this.mMPC;
        if (mediaPlayCenter == null) {
            return;
        }
        this.mPlayed = true;
        mediaPlayCenter.start();
    }

    public void onPlayed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4331dd19", new Object[]{this});
        } else {
            this.mPlayed = true;
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMPC;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.pause();
    }

    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMPC;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.seekTo(i * 1000);
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.mMPC == null) {
        } else {
            if (this.mPlayed) {
                reset();
                tryLoadVideo();
            }
            showPoster();
        }
    }

    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMPC;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.mute(z);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
            return;
        }
        a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.onVideoStart();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.onVideoStop();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.onVideoStart();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
        } else if (!g.a()) {
        } else {
            g.a("mus-live-video", "video prepared");
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            return;
        }
        g.f("mus-live-video", "video error: code " + iMediaPlayer + ", detail: " + i2);
        a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onVideoFail();
        }
        showPoster();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            return;
        }
        a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.onVideoFinish();
        showPoster();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.onVideoProgressChanged(i, i3);
    }
}
