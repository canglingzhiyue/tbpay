package tv.danmaku.ijk.media.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import anet.channel.util.HttpConstant;
import com.taobao.taobaoavsdk.util.b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import tb.ddc;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes.dex */
public class NativeMediaPlayer extends MonitorMediaPlayer implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
    private MediaPlayer mMediaPlayer;
    private boolean mOnError;

    @Deprecated
    /* loaded from: classes.dex */
    public interface OnSeekCompleteListener {
        void onSeekComplete(IMediaPlayer iMediaPlayer);
    }

    static {
        kge.a(-1835702979);
        kge.a(-29101414);
        kge.a(-631130887);
        kge.a(780529206);
        kge.a(-1603622315);
        kge.a(2016666867);
        kge.a(820997771);
        kge.a(-1016690258);
    }

    public NativeMediaPlayer() {
        this.mOnError = false;
        initPlayer();
    }

    public NativeMediaPlayer(Context context) {
        super(context);
        this.mOnError = false;
        initPlayer();
    }

    public NativeMediaPlayer(Context context, ddc ddcVar) {
        super(context, ddcVar);
        this.mOnError = false;
        initPlayer();
    }

    private void initPlayer() {
        this.mMediaPlayer = new MediaPlayer();
        this.mMediaPlayer.setOnPreparedListener(this);
        this.mMediaPlayer.setOnCompletionListener(this);
        this.mMediaPlayer.setOnBufferingUpdateListener(this);
        this.mMediaPlayer.setOnVideoSizeChangedListener(this);
        this.mMediaPlayer.setOnErrorListener(this);
        this.mMediaPlayer.setOnInfoListener(this);
        this.mMediaPlayer.setOnSeekCompleteListener(this);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getCurrentPosition() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getDuration() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public Map<String, String> getQos() {
        return null;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
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
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void instantSeekTo(long j) {
        if (this.mMediaPlayer != null) {
            if (this.mVolume != 0.0f && !this.bInstantSeeked) {
                this.mMediaPlayer.setVolume(0.0f, 0.0f);
            }
            this.bInstantSeeked = true;
            monitorSeek();
            this.mMediaPlayer.seekTo((int) j);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlaying() {
        try {
            if (this.mMediaPlayer == null) {
                return false;
            }
            return this.mMediaPlayer.isPlaying();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        if (this.mOnBufferingUpdateListener != null) {
            this.mOnBufferingUpdateListener.onBufferingUpdate(this, i);
        }
        if (this.mOnBufferingUpdateListeners != null) {
            for (IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener : this.mOnBufferingUpdateListeners) {
                onBufferingUpdateListener.onBufferingUpdate(this, i);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        monitorComplete();
        if (this.mOnPreCompletionListeners != null) {
            for (IMediaPlayer.OnPreCompletionListener onPreCompletionListener : this.mOnPreCompletionListeners) {
                onPreCompletionListener.onPreCompletion(this);
            }
        }
        if (this.bLooping) {
            this.bSeeked = true;
            if (this.mOnLoopCompletionListeners != null) {
                for (IMediaPlayer.OnLoopCompletionListener onLoopCompletionListener : this.mOnLoopCompletionListeners) {
                    onLoopCompletionListener.onLoopCompletion(this);
                }
            }
            start();
            return;
        }
        if (this.mOnCompletionListener != null) {
            this.mOnCompletionListener.onCompletion(this);
        }
        if (this.mOnCompletionListeners == null) {
            return;
        }
        for (IMediaPlayer.OnCompletionListener onCompletionListener : this.mOnCompletionListeners) {
            onCompletionListener.onCompletion(this);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.mOnError) {
            return true;
        }
        this.mOnError = true;
        monitorError(i, i2);
        monitorPlayExperience();
        boolean z = false;
        if (this.mOnErrorListener != null) {
            z = this.mOnErrorListener.onError(this, i, i2);
        }
        if (this.mOnErrorListeners != null) {
            for (IMediaPlayer.OnErrorListener onErrorListener : this.mOnErrorListeners) {
                z = onErrorListener.onError(this, i, i2);
            }
        }
        return z;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 701) {
            monitorBufferStart(System.currentTimeMillis());
        } else if (i == 702) {
            monitorBufferEnd(System.currentTimeMillis());
        } else if (i == 3) {
            monitorRenderStart(0L);
        }
        boolean z = false;
        if (this.mOnInfoListener != null) {
            z = this.mOnInfoListener.onInfo(this, i, i2, 0L, null);
        }
        if (this.mOnInfoListeners != null) {
            for (IMediaPlayer.OnInfoListener onInfoListener : this.mOnInfoListeners) {
                z = onInfoListener.onInfo(this, i, i2, 0L, null);
            }
        }
        return z;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        monitorPrepared(0L);
        if (this.mOnPreparedListener != null) {
            this.mOnPreparedListener.onPrepared(this);
        }
        if (this.mOnPreparedListeners != null) {
            for (IMediaPlayer.OnPreparedListener onPreparedListener : this.mOnPreparedListeners) {
                onPreparedListener.onPrepared(this);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.mOnSeekCompletionListener != null) {
            this.mOnSeekCompletionListener.onSeekComplete(this);
        }
        if (this.mOnSeekCompletionListeners != null) {
            for (IMediaPlayer.OnSeekCompletionListener onSeekCompletionListener : this.mOnSeekCompletionListeners) {
                onSeekCompletionListener.onSeekComplete(this);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.mOnVideoSizeChangedListener != null) {
            this.mOnVideoSizeChangedListener.onVideoSizeChanged(this, i, i2, 0, 0);
        }
        if (this.mOnVideoSizeChangedListeners != null) {
            for (IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener : this.mOnVideoSizeChangedListeners) {
                onVideoSizeChangedListener.onVideoSizeChanged(this, i, i2, 0, 0);
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void pause() throws IllegalStateException {
        if (this.mMediaPlayer != null) {
            monitorPause();
            this.mMediaPlayer.pause();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
        if (this.mMediaPlayer != null) {
            this.mOnError = false;
            monitorPrepare();
            this.mMediaPlayer.prepareAsync();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void release() {
        if (this.mMediaPlayer != null) {
            monitorPlayExperience();
            monitorRelease();
            this.mMediaPlayer.release();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void releasePrefixInUIThread() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
        if (this.mMediaPlayer != null) {
            monitorPlayExperience();
            monitorReset();
            this.mMediaPlayer.reset();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j) throws IllegalStateException {
        if (this.mMediaPlayer != null) {
            if (this.mVolume != 0.0f && this.bInstantSeeked) {
                this.mMediaPlayer.setVolume(this.mVolume, this.mVolume);
            }
            this.bInstantSeeked = false;
            monitorSeek();
            this.mMediaPlayer.seekTo((int) j);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j, boolean z, boolean z2) throws IllegalStateException {
        seekTo(j);
    }

    public void setAudioStreamType(int i) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setAudioStreamType(i);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        Context context = this.mContextRef == null ? null : this.mContextRef.get();
        String monitorDataSource = monitorDataSource(str);
        if (this.mMediaPlayer == null || TextUtils.isEmpty(monitorDataSource)) {
            return;
        }
        if (!monitorDataSource.startsWith("http")) {
            if (monitorDataSource.startsWith("content://")) {
                this.mMediaPlayer.setDataSource(context, Uri.parse(monitorDataSource));
                return;
            } else {
                this.mMediaPlayer.setDataSource(monitorDataSource);
                return;
            }
        }
        Uri parse = Uri.parse(monitorDataSource);
        HashMap hashMap = new HashMap();
        String b = b.b(context);
        if (!TextUtils.isEmpty(b)) {
            hashMap.put(HttpConstant.USER_AGENT, b);
        }
        try {
            if (!TextUtils.isEmpty(this.mCdnIp) && !isUseVideoCache()) {
                String host = parse.getHost();
                parse = Uri.parse(monitorDataSource.replaceFirst(host, this.mCdnIp));
                hashMap.put(HttpConstant.HOST, host);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.mMediaPlayer.setDataSource(context, parse, hashMap);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setDisplay(surfaceHolder);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setMuted(boolean z) {
        if (this.mMediaPlayer != null) {
            float f = z ? 0.0f : this.mVolume;
            this.mMediaPlayer.setVolume(f, f);
        }
    }

    @Deprecated
    public final void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setPlayRate(float f) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setScreenOnWhilePlaying(z);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurface(Surface surface) {
        this.mSurface = surface;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setSurface(surface);
            } catch (Exception unused) {
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurfaceSize(int i, int i2) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setVolume(float f, float f2) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            this.mVolume = f;
            mediaPlayer.setVolume(f, f2);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void start() throws IllegalStateException {
        if (this.mMediaPlayer != null) {
            monitorStart();
            this.mMediaPlayer.start();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void stop() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }
}
