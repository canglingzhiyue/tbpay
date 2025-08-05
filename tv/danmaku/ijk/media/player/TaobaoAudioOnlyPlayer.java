package tv.danmaku.ijk.media.player;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.taobao.mediaplay.player.a;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.Tracer.c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ddc;
import tb.ddd;
import tb.ipw;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes9.dex */
public final class TaobaoAudioOnlyPlayer extends MonitorMediaPlayer implements a.InterfaceC0698a {
    private static final int AUDIO_EDIA_BUFFERING_UPDATE = 3;
    public static final int AUDIO_ENABLE_ACCURATE_SEEK = 20131;
    public static final int AUDIO_INT64_COMPLETE_DONE_SEEK = 60004;
    public static final int AUDIO_INT64_ENABLE_SEEK_IN_PAUSE = 80006;
    public static final int AUDIO_INT64_START_ON_PREPARED = 11007;
    public static final int AUDIO_INT64_STATE_NOTIFY_GAP = 22902;
    private static final int AUDIO_MEDIA_ERROR = 100;
    private static final int AUDIO_MEDIA_INFO = 200;
    private static final int AUDIO_MEDIA_OUT_OF_BUFFERING = 300;
    private static final int AUDIO_MEDIA_PAUSE = 8;
    private static final int AUDIO_MEDIA_PLAYBACK_COMPLETE = 2;
    private static final int AUDIO_MEDIA_PREPARED = 1;
    private static final int AUDIO_MEDIA_RESUME_BUFFERING = 301;
    private static final int AUDIO_MEDIA_SEEK_COMPLETE = 4;
    private static final int AUDIO_MEDIA_SEEK_START = 400;
    private static final int AUDIO_MEDIA_SET_VIDEO_SIZE = 5;
    private static final int AUDIO_MEDIA_START = 7;
    private static final int AUDIO_MEDIA_TIMED_TEXT = 99;
    private static final int AUDIO_MEDIA_WARMUP = 6;
    public static final int FFP_PROP_FLOAT_VOLUME = 12001;
    private static volatile boolean mIsAudioLibLoaded;
    private static ConcurrentHashMap<String, Boolean> mLoopmap;
    private static ConcurrentHashMap<String, Boolean> mPausemap;
    private static ConcurrentHashMap<String, Boolean> mPlayingmap;
    private a mActivityLifecycleCallbacks;
    private AudioEventHandler mEventHandler;
    protected boolean mFetchFFMpegSoReadyInit;
    private long mNativeMediaPlayer;
    private boolean mPauseInBackground;
    private boolean mRequestAudioFocus;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class AudioEventHandler extends Handler {
        private boolean bFirstFrameRendered;
        private WeakReference<TaobaoAudioOnlyPlayer> mWeakPlayer;

        static {
            kge.a(1483817734);
        }

        public AudioEventHandler(TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer, Looper looper) {
            super(looper);
            this.bFirstFrameRendered = false;
            this.mWeakPlayer = new WeakReference<>(taobaoAudioOnlyPlayer);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.mWeakPlayer.get();
            if (taobaoAudioOnlyPlayer == null || taobaoAudioOnlyPlayer.mNativeMediaPlayer == 0) {
                return;
            }
            EventData eventData = (EventData) message.obj;
            if (eventData != null) {
                AVSDKLog.e(c.MODULE_SDK_PAGE, "TaobaoMediaPlayer:" + taobaoAudioOnlyPlayer + " handleMessage: " + message.what + ", " + eventData.arg1 + ", " + eventData.arg2 + ", " + eventData.arg3 + ", " + ((String) eventData.obj));
            }
            String str = (String) eventData.obj;
            if (str.isEmpty()) {
                AVSDKLog.e(c.MODULE_SDK_PAGE, "token is empty");
                return;
            }
            int i = message.what;
            if (i == 1) {
                if (taobaoAudioOnlyPlayer.mOnAudioPreparedListener != null) {
                    taobaoAudioOnlyPlayer.mOnAudioPreparedListener.onPrepared(taobaoAudioOnlyPlayer, (String) eventData.obj);
                }
                if (taobaoAudioOnlyPlayer.mOnAudioPreparedListeners != null) {
                    for (IMediaPlayer.OnAudioPreparedListener onAudioPreparedListener : taobaoAudioOnlyPlayer.mOnAudioPreparedListeners) {
                        onAudioPreparedListener.onPrepared(taobaoAudioOnlyPlayer, (String) eventData.obj);
                    }
                }
                taobaoAudioOnlyPlayer.pause((String) eventData.obj);
            } else if (i == 2) {
                boolean z = false;
                boolean booleanValue = TaobaoAudioOnlyPlayer.mPausemap.containsKey(str) ? ((Boolean) TaobaoAudioOnlyPlayer.mPausemap.get(str)).booleanValue() : false;
                if (TaobaoAudioOnlyPlayer.mLoopmap.containsKey(str)) {
                    z = ((Boolean) TaobaoAudioOnlyPlayer.mLoopmap.get(str)).booleanValue();
                }
                if (taobaoAudioOnlyPlayer.mOnAudioPreCompletionListeners != null) {
                    for (IMediaPlayer.OnAudioPreCompletionListener onAudioPreCompletionListener : taobaoAudioOnlyPlayer.mOnAudioPreCompletionListeners) {
                        onAudioPreCompletionListener.onPreCompletion(taobaoAudioOnlyPlayer, str);
                    }
                }
                if (z) {
                    if (taobaoAudioOnlyPlayer.mOnAudioLoopCompletionListeners != null) {
                        for (IMediaPlayer.OnAudioLoopCompletionListener onAudioLoopCompletionListener : taobaoAudioOnlyPlayer.mOnAudioLoopCompletionListeners) {
                            onAudioLoopCompletionListener.onLoopCompletion(taobaoAudioOnlyPlayer, str);
                        }
                    }
                    if (!taobaoAudioOnlyPlayer.bPauseInBackground || !booleanValue) {
                        taobaoAudioOnlyPlayer.start(str);
                        return;
                    } else {
                        AVSDKLog.d("avsdk", "playback complete but in pause state");
                        return;
                    }
                }
                TaobaoAudioOnlyPlayer.mPlayingmap.remove(str);
                TaobaoAudioOnlyPlayer.mPausemap.put(str, true);
                if (taobaoAudioOnlyPlayer.mOnAudioCompletionListener != null) {
                    taobaoAudioOnlyPlayer.mOnAudioCompletionListener.onCompletion(taobaoAudioOnlyPlayer, str);
                }
                if (taobaoAudioOnlyPlayer.mOnAudioCompletionListeners == null) {
                    return;
                }
                for (IMediaPlayer.OnAudioCompletionListener onAudioCompletionListener : taobaoAudioOnlyPlayer.mOnAudioCompletionListeners) {
                    onAudioCompletionListener.onCompletion(taobaoAudioOnlyPlayer, str);
                }
            } else if (i == 4) {
                if (taobaoAudioOnlyPlayer.mOnAudioSeekCompletionListener != null) {
                    taobaoAudioOnlyPlayer.mOnAudioSeekCompletionListener.onSeekComplete(taobaoAudioOnlyPlayer, str);
                }
                if (taobaoAudioOnlyPlayer.mOnAudioSeekCompletionListeners == null) {
                    return;
                }
                for (IMediaPlayer.OnAudioSeekCompletionListener onAudioSeekCompletionListener : taobaoAudioOnlyPlayer.mOnAudioSeekCompletionListeners) {
                    onAudioSeekCompletionListener.onSeekComplete(taobaoAudioOnlyPlayer, str);
                }
            } else if (i == 100) {
                if ((taobaoAudioOnlyPlayer.mOnAudioErrorListener == null || !taobaoAudioOnlyPlayer.mOnAudioErrorListener.onError(taobaoAudioOnlyPlayer, (int) eventData.arg1, (int) eventData.arg2, str)) && taobaoAudioOnlyPlayer.mOnAudioCompletionListener != null) {
                    taobaoAudioOnlyPlayer.mOnAudioCompletionListener.onCompletion(taobaoAudioOnlyPlayer, str);
                }
                if (taobaoAudioOnlyPlayer.mOnAudioErrorListeners == null) {
                    return;
                }
                for (IMediaPlayer.OnAudioErrorListener onAudioErrorListener : taobaoAudioOnlyPlayer.mOnAudioErrorListeners) {
                    onAudioErrorListener.onError(taobaoAudioOnlyPlayer, (int) eventData.arg1, (int) eventData.arg2, str);
                }
            } else if (i != 200) {
                if (i != 400) {
                    return;
                }
                AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO_MEDIA_SEEK_START is " + eventData.arg1);
                if (taobaoAudioOnlyPlayer.mOnAudioSeekStartListener != null) {
                    taobaoAudioOnlyPlayer.mOnAudioSeekStartListener.onSeekStart(taobaoAudioOnlyPlayer, str);
                }
                if (taobaoAudioOnlyPlayer.mOnAudioSeekStartListeners == null) {
                    return;
                }
                for (IMediaPlayer.OnAudioSeekStartListener onAudioSeekStartListener : taobaoAudioOnlyPlayer.mOnAudioSeekStartListeners) {
                    onAudioSeekStartListener.onSeekStart(taobaoAudioOnlyPlayer, str);
                }
            } else {
                AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO_MEDIA_INFO is " + eventData.arg1);
                if (eventData.arg1 != 12160) {
                    return;
                }
                if (taobaoAudioOnlyPlayer.mOnAudioInfoListener != null) {
                    taobaoAudioOnlyPlayer.mOnAudioInfoListener.onInfo(taobaoAudioOnlyPlayer, eventData.arg1, eventData.arg2, eventData.arg3, eventData.obj, str);
                }
                if (taobaoAudioOnlyPlayer.mOnAudioInfoListeners == null) {
                    return;
                }
                for (IMediaPlayer.OnAudioInfoListener onAudioInfoListener : taobaoAudioOnlyPlayer.mOnAudioInfoListeners) {
                    onAudioInfoListener.onInfo(taobaoAudioOnlyPlayer, eventData.arg1, eventData.arg2, eventData.arg3, eventData.obj, str);
                }
            }
        }
    }

    static {
        kge.a(2126771588);
        kge.a(-1854325247);
        mIsAudioLibLoaded = false;
        mLoopmap = new ConcurrentHashMap<>();
        mPausemap = new ConcurrentHashMap<>();
        mPlayingmap = new ConcurrentHashMap<>();
    }

    public TaobaoAudioOnlyPlayer() {
        this.mFetchFFMpegSoReadyInit = false;
        this.mRequestAudioFocus = false;
        this.mPauseInBackground = false;
        initPlayer(null);
    }

    public TaobaoAudioOnlyPlayer(Context context) {
        super(context);
        this.mFetchFFMpegSoReadyInit = false;
        this.mRequestAudioFocus = false;
        this.mPauseInBackground = false;
        initPlayer(null);
    }

    public TaobaoAudioOnlyPlayer(Context context, ddc ddcVar) {
        super(context);
        this.mFetchFFMpegSoReadyInit = false;
        this.mRequestAudioFocus = false;
        this.mPauseInBackground = false;
        initPlayer(null);
    }

    private native float _audioGetCurCachePosition(String str);

    private native long _audioGetCurrentPosition(String str);

    private native long _audioGetDuration(String str);

    private native boolean _audioIsPlaying(String str);

    private native void _audioPause(String str) throws IllegalStateException;

    private native void _audioPrepareAsync(String str) throws IllegalStateException;

    private native void _audioSeekTo(String str, long j) throws IllegalStateException;

    private native void _audioSeekToPause(String str, long j, boolean z) throws IllegalStateException;

    private native void _audioStart(String str) throws IllegalStateException;

    private native void _audioStop(String str) throws IllegalStateException;

    private native void _audio_native_setup(Object obj);

    private native void _audiorRelease();

    private native void _setAudioDataSource(String str, String str2, String[] strArr, String[] strArr2) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    private void initFetchSo() {
        this.mFetchFFMpegSoReadyInit = com.taobao.taobaoavsdk.c.c();
    }

    private void initPlayer(ddd dddVar) {
        AudioEventHandler audioEventHandler = null;
        Context context = this.mContextRef == null ? null : this.mContextRef.get();
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO initPlayer");
        loadAudioLibrariesOnce(dddVar);
        new com.taobao.taobaoavsdk.widget.media.c("AudioOnly");
        com.taobao.taobaoavsdk.widget.media.c cVar = new com.taobao.taobaoavsdk.widget.media.c("AudioOnly");
        cVar.ah = true;
        cVar.at = true;
        setConfig(cVar);
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            audioEventHandler = new AudioEventHandler(this, mainLooper);
        }
        this.mEventHandler = audioEventHandler;
        if (context != null && this.mActivityLifecycleCallbacks == null) {
            this.mActivityLifecycleCallbacks = new a(this, (Application) context.getApplicationContext());
        }
        _audio_native_setup(new WeakReference(this));
    }

    public static boolean isAudioLibLoaded() {
        return mIsAudioLibLoaded;
    }

    public static void loadAudioLibrariesOnce(ddd dddVar) {
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO loadAudioLibrariesOnce");
        synchronized (TaobaoMediaPlayer.class) {
            if (!mIsAudioLibLoaded) {
                if (dddVar == null) {
                    System.loadLibrary("c++_shared");
                    System.loadLibrary("tbffmpeg");
                    System.loadLibrary("taobaoplayer");
                }
                mIsAudioLibLoaded = true;
            }
        }
    }

    private static void postAudioEventFromNative(Object obj, int i, long j, long j2, long j3, Object obj2) {
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer;
        if (obj == null || (taobaoAudioOnlyPlayer = (TaobaoAudioOnlyPlayer) ((WeakReference) obj).get()) == null) {
            return;
        }
        synchronized (TaobaoAudioOnlyPlayer.class) {
            if (taobaoAudioOnlyPlayer.mEventHandler != null) {
                Message obtainMessage = taobaoAudioOnlyPlayer.mEventHandler.obtainMessage(i);
                EventData eventData = new EventData();
                eventData.arg1 = j;
                eventData.arg2 = j2;
                eventData.arg3 = j3;
                eventData.obj = obj2;
                obtainMessage.obj = eventData;
                if (i == 1) {
                    taobaoAudioOnlyPlayer.mEventHandler.sendMessageAtFrontOfQueue(obtainMessage);
                } else {
                    taobaoAudioOnlyPlayer.mEventHandler.sendMessage(obtainMessage);
                }
            }
        }
    }

    public native float _audioGetPropertyFloat(String str, int i, float f);

    public native long _audioGetPropertyLong(String str, int i, long j);

    public native String _audioGetPropertyString(String str, int i);

    public native void _audioSetPropertyFloat(String str, int i, float f);

    public native void _audioSetPropertyLong(String str, int i, long j);

    public native void _audioSetPropertyString(String str, int i, String str2);

    public float getCurCachePosition(String str) {
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO getCurCachePosition token is " + str);
        return _audioGetCurCachePosition(str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getCurrentPosition() {
        return 0L;
    }

    public long getCurrentPosition(String str) {
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO getCurrentPosition token is " + str);
        return _audioGetCurrentPosition(str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getDuration() {
        return 0L;
    }

    public long getDuration(String str) {
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO getDuration token is " + str);
        return _audioGetDuration(str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public Map<String, String> getQos() {
        return null;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        return 0;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
        return 0;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
        return 0;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
        return 0;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void instantSeekTo(long j) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlaying() {
        return false;
    }

    public boolean isPlaying(String str) {
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO isPlaying token is " + str);
        return _audioIsPlaying(str);
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityPaused(Activity activity) {
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO onActivityPaused");
        if (this.mPauseInBackground && !mPlayingmap.isEmpty()) {
            if (this.mRequestAudioFocus) {
                ipw.a(this.mContextRef == null ? null : this.mContextRef.get()).a((AudioManager.OnAudioFocusChangeListener) null);
                this.mRequestAudioFocus = false;
            }
            String str = "";
            for (Map.Entry<String, Boolean> entry : mPlayingmap.entrySet()) {
                AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO onActivityPaused" + str);
                str = entry.getKey();
                if (this.mOnAudioPauseListener != null) {
                    this.mOnAudioPauseListener.onPause(str);
                }
                if (this.mOnAudioPauseListeners != null) {
                    for (IMediaPlayer.OnAudioPauseListener onAudioPauseListener : this.mOnAudioPauseListeners) {
                        onAudioPauseListener.onPause(str);
                    }
                }
                _audioPause(str);
            }
        }
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityResumed(Activity activity) {
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO onActivityResumed");
        if (this.mPauseInBackground && !mPlayingmap.isEmpty()) {
            if (!this.mRequestAudioFocus) {
                ipw.a(this.mContextRef == null ? null : this.mContextRef.get()).a((AudioManager.OnAudioFocusChangeListener) null, 1);
                this.mRequestAudioFocus = true;
            }
            String str = "";
            for (Map.Entry<String, Boolean> entry : mPlayingmap.entrySet()) {
                AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO onActivityResumed" + str);
                str = entry.getKey();
                if (this.mOnAudioStartListener != null) {
                    this.mOnAudioStartListener.onStart(str);
                }
                if (this.mOnAudioStartListeners != null) {
                    for (IMediaPlayer.OnAudioStartListener onAudioStartListener : this.mOnAudioStartListeners) {
                        onAudioStartListener.onStart(str);
                    }
                }
                _audioStart(str);
            }
        }
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityStopped(Activity activity) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void pause() throws IllegalStateException {
    }

    public void pause(String str) throws IllegalStateException {
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO pause token is " + str);
        if (!mPausemap.containsKey(str)) {
            if (this.mOnAudioPauseListener != null) {
                this.mOnAudioPauseListener.onPause(str);
            }
            if (this.mOnAudioPauseListeners != null) {
                for (IMediaPlayer.OnAudioPauseListener onAudioPauseListener : this.mOnAudioPauseListeners) {
                    onAudioPauseListener.onPause(str);
                }
            }
        }
        mPausemap.put(str, true);
        mPlayingmap.remove(str);
        try {
            _audioPause(str);
        } catch (Throwable th) {
            AVSDKLog.e(c.MODULE_SDK_PAGE, "_audioPause fail ---" + th.getMessage() + " " + th.getStackTrace());
        }
        if (!this.mRequestAudioFocus || !mPlayingmap.isEmpty()) {
            return;
        }
        ipw.a(this.mContextRef == null ? null : this.mContextRef.get()).a((AudioManager.OnAudioFocusChangeListener) null);
        this.mRequestAudioFocus = false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
    }

    public void prepareAsync(String str) throws IllegalStateException {
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO prepareAsync token is " + str);
        _audioSetPropertyLong(str, 20131, 1L);
        _audioSetPropertyLong(str, 11007, 1L);
        _audioSetPropertyLong(str, 60004, 1L);
        _audioSetPropertyLong(str, 80006, 1L);
        _audioPrepareAsync(str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void release() {
        a aVar;
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO release ");
        mLoopmap.clear();
        mPausemap.clear();
        mPlayingmap.clear();
        _audiorRelease();
        Context context = this.mContextRef == null ? null : this.mContextRef.get();
        if (this.mRequestAudioFocus && mPlayingmap.isEmpty()) {
            ipw.a(context).a((AudioManager.OnAudioFocusChangeListener) null);
            this.mRequestAudioFocus = false;
        }
        if (context == null || (aVar = this.mActivityLifecycleCallbacks) == null) {
            return;
        }
        aVar.a((Application) context.getApplicationContext());
        this.mActivityLifecycleCallbacks = null;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void releasePrefixInUIThread() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j) throws IllegalStateException {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j, boolean z, boolean z2) throws IllegalStateException {
    }

    public void seekTo(String str, long j) throws IllegalStateException {
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO seekTo token is " + str + "msec is" + j);
        try {
            _audioSeekTo(str, j);
        } catch (Throwable th) {
            AVSDKLog.e(c.MODULE_SDK_PAGE, "seekTo fail ---" + th.getMessage() + " " + th.getStackTrace());
        }
    }

    public void seekTo(String str, long j, boolean z, boolean z2) throws IllegalStateException {
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO seekTo token is " + str + "msec is" + j);
        try {
            _audioSeekToPause(str, j, z);
        } catch (Throwable th) {
            AVSDKLog.e(c.MODULE_SDK_PAGE, "seekTo fail ---" + th.getMessage() + " " + th.getStackTrace());
        }
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public int setConfig(com.taobao.taobaoavsdk.widget.media.c cVar) {
        super.setConfig(cVar);
        initFetchSo();
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String setDataSource(java.lang.String r7, java.lang.String r8) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AUDIO setDataSource token is "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = "pathis "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AVSDK"
            com.taobao.taobaoavsdk.AVSDKLog.e(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L28
            java.lang.String r7 = ""
            return r7
        L28:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "TaobaoAudioOnlyPlayer:"
            r0.append(r2)
            r0.append(r6)
            java.lang.String r2 = " setDataSource: "
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r1, r0)
            java.lang.ref.WeakReference<android.content.Context> r0 = r6.mContextRef
            r2 = 0
            if (r0 != 0) goto L4b
            r0 = r2
            goto L53
        L4b:
            java.lang.ref.WeakReference<android.content.Context> r0 = r6.mContextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
        L53:
            com.taobao.taobaoavsdk.widget.media.c r3 = r6.mConfig
            if (r3 == 0) goto L6b
            com.taobao.taobaoavsdk.widget.media.c r3 = r6.mConfig
            boolean r3 = r3.ah
            if (r3 == 0) goto L6b
            com.taobao.taobaoavsdk.widget.media.c r3 = r6.mConfig
            boolean r3 = r3.at
            if (r3 == 0) goto L6b
            java.lang.String r3 = "http"
            boolean r3 = r8.startsWith(r3)
            if (r3 != 0) goto L73
        L6b:
            java.lang.String r3 = "https"
            boolean r3 = r8.startsWith(r3)
            if (r3 == 0) goto Lce
        L73:
            java.lang.String r3 = tb.oyw.a(r0, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "TaobaoAudioOnlyPlayer getCompleteCachePath : "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r1, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto Lcf
            com.taobao.taobaoavsdk.cache.library.i r0 = tb.oyw.a(r0)
            java.lang.String r3 = r0.c(r8)
            boolean r4 = r0.a()
            java.lang.String r5 = "TaobaoAudioOnlyPlayer isCacheAvaiable : "
            if (r4 == 0) goto Lb8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            boolean r0 = r0.a()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r1, r8)
            goto Lcf
        Lb8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            boolean r0 = r0.a()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r1, r0)
        Lce:
            r3 = r8
        Lcf:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "TaobaoAudioOnlyPlayer proxyUrl : "
            r8.append(r0)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r1, r8)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L10c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            r7.append(r0)
            java.lang.String r8 = "_"
            r7.append(r8)
            double r0 = java.lang.Math.random()
            r4 = 4681608360884174848(0x40f86a0000000000, double:100000.0)
            double r0 = r0 * r4
            r7.append(r0)
            java.lang.String r7 = r7.toString()
        L10c:
            r6._setAudioDataSource(r7, r3, r2, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoAudioOnlyPlayer.setDataSource(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
    }

    public void setLooping(String str, boolean z) {
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO setLooping token is" + str);
        if (z) {
            mLoopmap.put(str, Boolean.valueOf(z));
        } else {
            mLoopmap.remove(str);
        }
    }

    public void setMuted(String str, boolean z) {
        _audioSetPropertyLong(str, 21008, z ? 1L : 0L);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setMuted(boolean z) {
    }

    public void setPauseInBackground(boolean z) {
        this.mPauseInBackground = z;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setPlayRate(float f) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
    }

    public void setStateChangeGap(String str, long j) {
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO setStateChangeGap token is " + str + "gap is " + j);
        _audioSetPropertyLong(str, 22902, j);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurface(Surface surface) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurfaceSize(int i, int i2) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setVolume(float f, float f2) {
    }

    public void setVolume(String str, float f, float f2) {
        _audioSetPropertyFloat(str, 12001, f);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void start() throws IllegalStateException {
    }

    public void start(String str) throws IllegalStateException {
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO start token is " + str);
        Context context = this.mContextRef == null ? null : this.mContextRef.get();
        if (!mPlayingmap.containsKey(str)) {
            if (this.mOnAudioStartListener != null) {
                this.mOnAudioStartListener.onStart(str);
            }
            if (this.mOnAudioStartListeners != null) {
                for (IMediaPlayer.OnAudioStartListener onAudioStartListener : this.mOnAudioStartListeners) {
                    onAudioStartListener.onStart(str);
                }
            }
        }
        mPlayingmap.put(str, true);
        mPausemap.remove(str);
        if (!this.mRequestAudioFocus && !mPlayingmap.isEmpty()) {
            ipw.a(context).a((AudioManager.OnAudioFocusChangeListener) null, 1);
            this.mRequestAudioFocus = true;
        }
        try {
            _audioStart(str);
        } catch (Throwable th) {
            AVSDKLog.e(c.MODULE_SDK_PAGE, "_audioStart fail ---" + th.getMessage() + " " + th.getStackTrace());
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void stop() throws IllegalStateException {
    }

    public void stop(String str) throws IllegalStateException {
        AVSDKLog.e(c.MODULE_SDK_PAGE, "AUDIO stop token is " + str);
        try {
            _audioPause(str);
            _audioStop(str);
        } catch (Throwable th) {
            AVSDKLog.e(c.MODULE_SDK_PAGE, "_audioStop fail ---" + th.getMessage() + " " + th.getStackTrace());
        }
        mLoopmap.remove(str);
        mPausemap.remove(str);
        mPlayingmap.remove(str);
        if (!this.mRequestAudioFocus || !mPlayingmap.isEmpty()) {
            return;
        }
        ipw.a(this.mContextRef == null ? null : this.mContextRef.get()).a((AudioManager.OnAudioFocusChangeListener) null);
        this.mRequestAudioFocus = false;
    }
}
