package com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.HVideoAnimationView;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.keq;
import tb.kge;
import tb.ldf;
import tb.ldk;
import tb.luv;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes7.dex */
public class HVideoAnimationView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "VideoAnimationView";
    private final List<c> listeners;
    private final ImageView mCoverImage;
    private String mCoverImageUrl;
    private final IMediaPlayer.OnErrorListener mErrorListener;
    private boolean mIsAttachedToWindow;
    private String mLocalPath;
    private final IMediaPlayer.OnCompletionListener mOnCompletionListener;
    private IMediaPlayer.OnInfoListener mOnInfoListener;
    private final TaoLiveVideoView mVideoView;

    static {
        kge.a(-1436816337);
    }

    public static /* synthetic */ Object ipc$super(HVideoAnimationView hVideoAnimationView, String str, Object... objArr) {
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

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ List access$000(HVideoAnimationView hVideoAnimationView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("cc64aa50", new Object[]{hVideoAnimationView}) : hVideoAnimationView.listeners;
    }

    public static /* synthetic */ TaoLiveVideoView access$100(HVideoAnimationView hVideoAnimationView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveVideoView) ipChange.ipc$dispatch("9192b2b0", new Object[]{hVideoAnimationView}) : hVideoAnimationView.mVideoView;
    }

    public HVideoAnimationView(Context context) {
        super(context);
        this.mIsAttachedToWindow = false;
        this.listeners = new CopyOnWriteArrayList();
        this.mOnInfoListener = new AnonymousClass1();
        this.mErrorListener = new IMediaPlayer.OnErrorListener() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.HVideoAnimationView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                HVideoAnimationView.this = this;
            }

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                ldf.d(HVideoAnimationView.TAG, "onError");
                HashMap hashMap = new HashMap(2);
                hashMap.put("what", String.valueOf(i));
                hashMap.put("extra", String.valueOf(i2));
                ldk.a(d.VIDEO_ANIMATION, keq.VIDEO_PLAY_ERROR, "", d.VIDEO_ANIMATION_BIZ_NAME, "", hashMap);
                if (HVideoAnimationView.access$100(HVideoAnimationView.this) != null) {
                    HVideoAnimationView.access$100(HVideoAnimationView.this).setVisibility(8);
                }
                HVideoAnimationView.this.pauseVideo();
                for (c cVar : HVideoAnimationView.access$000(HVideoAnimationView.this)) {
                    cVar.c();
                }
                return false;
            }
        };
        this.mOnCompletionListener = new IMediaPlayer.OnCompletionListener() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.-$$Lambda$HVideoAnimationView$-TAcrd0em7qTlfzAyxQh8__35wo
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
            public final void onCompletion(IMediaPlayer iMediaPlayer) {
                HVideoAnimationView.this.lambda$new$3$HVideoAnimationView(iMediaPlayer);
            }
        };
        this.mVideoView = initVideoView(context);
        this.mCoverImage = initCoverImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.mVideoView, 0, layoutParams);
        addView(this.mCoverImage, 1, layoutParams);
    }

    private TaoLiveVideoView initVideoView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveVideoView) ipChange.ipc$dispatch("8edd5257", new Object[]{this, context});
        }
        TaoLiveVideoView taoLiveVideoView = new TaoLiveVideoView(context);
        taoLiveVideoView.disableAutoPlayForBackground();
        taoLiveVideoView.setMuted(true);
        taoLiveVideoView.setAlpha(0.0f);
        com.taobao.taobaoavsdk.widget.media.c cVar = new com.taobao.taobaoavsdk.widget.media.c("HomePage");
        cVar.b = 2;
        cVar.c = 2;
        cVar.d = 3;
        taoLiveVideoView.setConfigAdapter(new com.taobao.taolive.uikit.livecard.d());
        taoLiveVideoView.initConfig(cVar);
        taoLiveVideoView.registerOnInfoListener(this.mOnInfoListener);
        taoLiveVideoView.registerOnErrorListener(this.mErrorListener);
        taoLiveVideoView.registerOnCompletionListener(this.mOnCompletionListener);
        return taoLiveVideoView;
    }

    private ImageView initCoverImageView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("20414ea8", new Object[]{this, context});
        }
        ImageView imageView = new ImageView(context);
        imageView.setBackgroundColor(-1);
        imageView.setVisibility(0);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    public void setLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return;
        }
        taoLiveVideoView.setLooping(z);
    }

    public void showCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3ff68d", new Object[]{this});
            return;
        }
        ldf.d(TAG, "showCoverImageView");
        luv.a(this.mCoverImage, 0);
    }

    public void hideCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ad192", new Object[]{this});
            return;
        }
        ldf.d(TAG, "hideCoverImageView");
        luv.a(this.mCoverImage, 8);
    }

    /* renamed from: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.HVideoAnimationView$1 */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 implements IMediaPlayer.OnInfoListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: lambda$3y5E4lz6VYd5frEFuFgBcJ0-SiE */
        public static /* synthetic */ void m1090lambda$3y5E4lz6VYd5frEFuFgBcJ0SiE(AnonymousClass1 anonymousClass1) {
            anonymousClass1.a();
        }

        /* renamed from: lambda$xwPFY0JV6IxeKdd2GR-vAYmVgcc */
        public static /* synthetic */ void m1091lambda$xwPFY0JV6IxeKdd2GRvAYmVgcc(AnonymousClass1 anonymousClass1) {
            anonymousClass1.b();
        }

        public AnonymousClass1() {
            HVideoAnimationView.this = r1;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            if (j == 3) {
                ldf.d(HVideoAnimationView.TAG, "MEDIA_INFO_VIDEO_RENDERING_START:");
                ldk.a(d.VIDEO_ANIMATION, keq.VIDEO_PLAY_SUCCESS, "", d.VIDEO_ANIMATION_BIZ_NAME, "", null);
                HVideoAnimationView.this.postDelayed(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.-$$Lambda$HVideoAnimationView$1$xwPFY0JV6IxeKdd2GR-vAYmVgcc
                    {
                        HVideoAnimationView.AnonymousClass1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        HVideoAnimationView.AnonymousClass1.m1091lambda$xwPFY0JV6IxeKdd2GRvAYmVgcc(HVideoAnimationView.AnonymousClass1.this);
                    }
                }, 1000L);
                HVideoAnimationView.this.postDelayed(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.-$$Lambda$HVideoAnimationView$1$3y5E4lz6VYd5frEFuFgBcJ0-SiE
                    {
                        HVideoAnimationView.AnonymousClass1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        HVideoAnimationView.AnonymousClass1.m1090lambda$3y5E4lz6VYd5frEFuFgBcJ0SiE(HVideoAnimationView.AnonymousClass1.this);
                    }
                }, 300L);
                for (c cVar : HVideoAnimationView.access$000(HVideoAnimationView.this)) {
                    cVar.a();
                }
            }
            return false;
        }

        public /* synthetic */ void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                HVideoAnimationView.this.hideCoverImageView();
            }
        }

        public /* synthetic */ void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                HVideoAnimationView.access$100(HVideoAnimationView.this).setAlpha(1.0f);
            }
        }
    }

    public /* synthetic */ void lambda$new$3$HVideoAnimationView(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c555bb", new Object[]{this, iMediaPlayer});
            return;
        }
        for (c cVar : this.listeners) {
            cVar.b();
        }
        ldf.d(TAG, MessageID.onCompletion);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        ldf.d(TAG, "onAttachedToWindow:");
        this.mIsAttachedToWindow = true;
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return;
        }
        taoLiveVideoView.setRenderType(2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mIsAttachedToWindow = false;
        ldf.d(TAG, "onDetachedFromWindow:");
        pauseVideo();
        release();
    }

    public void setCoverImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e694ff7", new Object[]{this, str});
            return;
        }
        this.mCoverImageUrl = str;
        ldf.d(TAG, "setCoverImage:" + str);
        this.mCoverImage.setImageBitmap(BitmapFactory.decodeFile(str));
    }

    public void setVideoPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f405b10f", new Object[]{this, str});
            return;
        }
        this.mLocalPath = str;
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return;
        }
        taoLiveVideoView.setVideoPath(str);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        if (this.mVideoView != null) {
            ldf.d(TAG, "release video:");
            this.mVideoView.release();
        }
        for (c cVar : this.listeners) {
            cVar.e();
        }
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null || !taoLiveVideoView.isPlaying()) {
            return;
        }
        ldf.d(TAG, "pause video:");
        this.mVideoView.pause();
        for (c cVar : this.listeners) {
            cVar.d();
        }
    }

    public boolean playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4075d2b2", new Object[]{this})).booleanValue();
        }
        ldf.d(TAG, "playVideo START:");
        ldk.a(d.VIDEO_ANIMATION, keq.VIDEO_PLAY_START, "", d.VIDEO_ANIMATION_BIZ_NAME, "", null);
        showCoverImageView();
        if (!this.mIsAttachedToWindow || TextUtils.isEmpty(this.mCoverImageUrl) || this.mVideoView == null || TextUtils.isEmpty(this.mLocalPath)) {
            ldf.d(TAG, "playVideo error attachedToWindow:" + this.mIsAttachedToWindow + ",mCoverImageUrl:" + this.mCoverImageUrl + ",mVideoView is null:" + this.mVideoView + ",mLocalPath:" + this.mLocalPath);
            HashMap hashMap = new HashMap(2);
            String str = "null";
            hashMap.put("coverImage", TextUtils.isEmpty(this.mCoverImageUrl) ? str : "notNull");
            if (!TextUtils.isEmpty(this.mLocalPath)) {
                str = "notNull";
            }
            hashMap.put("videoPath", str);
            ldk.a(d.VIDEO_ANIMATION, "videoPlayFail", "", d.VIDEO_ANIMATION_BIZ_NAME, "localResourceError", hashMap);
            return false;
        } else if (this.mVideoView.isPlaying()) {
            hideCoverImageView();
            ldf.d(TAG, "playVideo isPlaying:");
            return true;
        } else {
            ldf.d(TAG, "playVideo start:" + this.mLocalPath);
            this.mVideoView.start();
            return true;
        }
    }

    public void addVideoStateListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a99d605", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            this.listeners.add(cVar);
        }
    }

    public void clearVideoStateListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61a2e1de", new Object[]{this});
        } else {
            this.listeners.clear();
        }
    }
}
