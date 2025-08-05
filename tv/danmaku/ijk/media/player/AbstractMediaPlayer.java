package tv.danmaku.ijk.media.player;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes.dex */
public abstract class AbstractMediaPlayer implements IMediaPlayer {
    protected IMediaPlayer.OnAudioCompletionListener mOnAudioCompletionListener;
    protected List<IMediaPlayer.OnAudioCompletionListener> mOnAudioCompletionListeners;
    protected IMediaPlayer.OnAudioErrorListener mOnAudioErrorListener;
    protected List<IMediaPlayer.OnAudioErrorListener> mOnAudioErrorListeners;
    protected IMediaPlayer.OnAudioInfoListener mOnAudioInfoListener;
    protected List<IMediaPlayer.OnAudioInfoListener> mOnAudioInfoListeners;
    protected List<IMediaPlayer.OnAudioLoopCompletionListener> mOnAudioLoopCompletionListeners;
    protected IMediaPlayer.OnAudioPauseListener mOnAudioPauseListener;
    protected List<IMediaPlayer.OnAudioPauseListener> mOnAudioPauseListeners;
    protected List<IMediaPlayer.OnAudioPreCompletionListener> mOnAudioPreCompletionListeners;
    protected IMediaPlayer.OnAudioPreparedListener mOnAudioPreparedListener;
    protected List<IMediaPlayer.OnAudioPreparedListener> mOnAudioPreparedListeners;
    protected IMediaPlayer.OnAudioSeekCompletionListener mOnAudioSeekCompletionListener;
    protected List<IMediaPlayer.OnAudioSeekCompletionListener> mOnAudioSeekCompletionListeners;
    protected IMediaPlayer.OnAudioSeekStartListener mOnAudioSeekStartListener;
    protected List<IMediaPlayer.OnAudioSeekStartListener> mOnAudioSeekStartListeners;
    protected IMediaPlayer.OnAudioStartListener mOnAudioStartListener;
    protected List<IMediaPlayer.OnAudioStartListener> mOnAudioStartListeners;
    protected IMediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    protected List<IMediaPlayer.OnBufferingUpdateListener> mOnBufferingUpdateListeners;
    protected IMediaPlayer.OnCompletionListener mOnCompletionListener;
    protected List<IMediaPlayer.OnCompletionListener> mOnCompletionListeners;
    protected IMediaPlayer.OnErrorListener mOnErrorListener;
    protected List<IMediaPlayer.OnErrorListener> mOnErrorListeners;
    protected IMediaPlayer.OnInfoListener mOnInfoListener;
    protected List<IMediaPlayer.OnInfoListener> mOnInfoListeners;
    protected List<IMediaPlayer.OnLoopCompletionListener> mOnLoopCompletionListeners;
    protected List<IMediaPlayer.OnPreCompletionListener> mOnPreCompletionListeners;
    protected IMediaPlayer.OnPreparedListener mOnPreparedListener;
    protected List<IMediaPlayer.OnPreparedListener> mOnPreparedListeners;
    protected IMediaPlayer.OnSeekCompletionListener mOnSeekCompletionListener;
    protected List<IMediaPlayer.OnSeekCompletionListener> mOnSeekCompletionListeners;
    protected IMediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    protected List<IMediaPlayer.OnVideoSizeChangedListener> mOnVideoSizeChangedListeners;
    protected List<IMediaPlayer.OnPlayerEventListener> mPlayerEventListener;
    protected List<IMediaPlayer.OnVFPluginListener> mVFPluginListener;

    static {
        kge.a(1184243858);
        kge.a(-1162803091);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public float getCurCachePosition() {
        return 0.0f;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getVPMSessioinId() {
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public float getVideoRenderPts() {
        return 0.0f;
    }

    public void registerOnAudioCompletionListener(IMediaPlayer.OnAudioCompletionListener onAudioCompletionListener) {
        if (this.mOnAudioCompletionListeners == null) {
            this.mOnAudioCompletionListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnAudioCompletionListeners.contains(onAudioCompletionListener)) {
            this.mOnAudioCompletionListeners.add(onAudioCompletionListener);
        }
    }

    public void registerOnAudioErrorListener(IMediaPlayer.OnAudioErrorListener onAudioErrorListener) {
        if (this.mOnAudioErrorListeners == null) {
            this.mOnAudioErrorListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnAudioErrorListeners.contains(onAudioErrorListener)) {
            this.mOnAudioErrorListeners.add(onAudioErrorListener);
        }
    }

    public void registerOnAudioInfoListener(IMediaPlayer.OnAudioInfoListener onAudioInfoListener) {
        if (this.mOnAudioInfoListeners == null) {
            this.mOnAudioInfoListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnAudioInfoListeners.contains(onAudioInfoListener)) {
            this.mOnAudioInfoListeners.add(onAudioInfoListener);
        }
    }

    public void registerOnAudioLoopCompletionListener(IMediaPlayer.OnAudioLoopCompletionListener onAudioLoopCompletionListener) {
        if (this.mOnAudioLoopCompletionListeners == null) {
            this.mOnAudioLoopCompletionListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnAudioLoopCompletionListeners.contains(onAudioLoopCompletionListener)) {
            this.mOnAudioLoopCompletionListeners.add(onAudioLoopCompletionListener);
        }
    }

    public void registerOnAudioPauseListener(IMediaPlayer.OnAudioPauseListener onAudioPauseListener) {
        if (this.mOnAudioPauseListeners == null) {
            this.mOnAudioPauseListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnAudioPauseListeners.contains(onAudioPauseListener)) {
            this.mOnAudioPauseListeners.add(onAudioPauseListener);
        }
    }

    public void registerOnAudioPreCompletionListener(IMediaPlayer.OnAudioPreCompletionListener onAudioPreCompletionListener) {
        if (this.mOnAudioPreCompletionListeners == null) {
            this.mOnAudioPreCompletionListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnAudioPreCompletionListeners.contains(onAudioPreCompletionListener)) {
            this.mOnAudioPreCompletionListeners.add(onAudioPreCompletionListener);
        }
    }

    public final void registerOnAudioPreparedListener(IMediaPlayer.OnAudioPreparedListener onAudioPreparedListener) {
        if (this.mOnAudioPreparedListeners == null) {
            this.mOnAudioPreparedListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnAudioPreparedListeners.contains(onAudioPreparedListener)) {
            this.mOnAudioPreparedListeners.add(onAudioPreparedListener);
        }
    }

    public void registerOnAudioSeekCompleteListener(IMediaPlayer.OnAudioSeekCompletionListener onAudioSeekCompletionListener) {
        if (this.mOnAudioSeekCompletionListeners == null) {
            this.mOnAudioSeekCompletionListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnAudioSeekCompletionListeners.contains(onAudioSeekCompletionListener)) {
            this.mOnAudioSeekCompletionListeners.add(onAudioSeekCompletionListener);
        }
    }

    public void registerOnAudioSeekStartListener(IMediaPlayer.OnAudioSeekStartListener onAudioSeekStartListener) {
        if (this.mOnAudioSeekStartListeners == null) {
            this.mOnAudioSeekStartListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnAudioSeekStartListeners.contains(onAudioSeekStartListener)) {
            this.mOnAudioSeekStartListeners.add(onAudioSeekStartListener);
        }
    }

    public void registerOnAudioStartListener(IMediaPlayer.OnAudioStartListener onAudioStartListener) {
        if (this.mOnAudioStartListeners == null) {
            this.mOnAudioStartListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnAudioStartListeners.contains(onAudioStartListener)) {
            this.mOnAudioStartListeners.add(onAudioStartListener);
        }
    }

    public void registerOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        if (this.mOnBufferingUpdateListeners == null) {
            this.mOnBufferingUpdateListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnBufferingUpdateListeners.contains(onBufferingUpdateListener)) {
            this.mOnBufferingUpdateListeners.add(onBufferingUpdateListener);
        }
    }

    public void registerOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        if (this.mOnCompletionListeners == null) {
            this.mOnCompletionListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnCompletionListeners.contains(onCompletionListener)) {
            this.mOnCompletionListeners.add(onCompletionListener);
        }
    }

    public void registerOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        if (this.mOnErrorListeners == null) {
            this.mOnErrorListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnErrorListeners.contains(onErrorListener)) {
            this.mOnErrorListeners.add(onErrorListener);
        }
    }

    public void registerOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        if (this.mOnInfoListeners == null) {
            this.mOnInfoListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnInfoListeners.contains(onInfoListener)) {
            this.mOnInfoListeners.add(onInfoListener);
        }
    }

    public void registerOnLoopCompletionListener(IMediaPlayer.OnLoopCompletionListener onLoopCompletionListener) {
        if (this.mOnLoopCompletionListeners == null) {
            this.mOnLoopCompletionListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnLoopCompletionListeners.contains(onLoopCompletionListener)) {
            this.mOnLoopCompletionListeners.add(onLoopCompletionListener);
        }
    }

    public final void registerOnPlayerEventListener(IMediaPlayer.OnPlayerEventListener onPlayerEventListener) {
        if (this.mPlayerEventListener == null) {
            this.mPlayerEventListener = new CopyOnWriteArrayList();
        }
        if (!this.mPlayerEventListener.contains(onPlayerEventListener)) {
            this.mPlayerEventListener.add(onPlayerEventListener);
        }
    }

    public void registerOnPreCompletionListener(IMediaPlayer.OnPreCompletionListener onPreCompletionListener) {
        if (this.mOnPreCompletionListeners == null) {
            this.mOnPreCompletionListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnPreCompletionListeners.contains(onPreCompletionListener)) {
            this.mOnPreCompletionListeners.add(onPreCompletionListener);
        }
    }

    public final void registerOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        if (this.mOnPreparedListeners == null) {
            this.mOnPreparedListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnPreparedListeners.contains(onPreparedListener)) {
            this.mOnPreparedListeners.add(onPreparedListener);
        }
    }

    public void registerOnSeekCompleteListener(IMediaPlayer.OnSeekCompletionListener onSeekCompletionListener) {
        if (this.mOnSeekCompletionListeners == null) {
            this.mOnSeekCompletionListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnSeekCompletionListeners.contains(onSeekCompletionListener)) {
            this.mOnSeekCompletionListeners.add(onSeekCompletionListener);
        }
    }

    public void registerOnVFPluginListener(IMediaPlayer.OnVFPluginListener onVFPluginListener) {
        if (this.mVFPluginListener == null) {
            this.mVFPluginListener = new CopyOnWriteArrayList();
        }
        if (!this.mVFPluginListener.contains(onVFPluginListener)) {
            this.mVFPluginListener.add(onVFPluginListener);
        }
    }

    public void registerOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (this.mOnVideoSizeChangedListeners == null) {
            this.mOnVideoSizeChangedListeners = new CopyOnWriteArrayList();
        }
        if (!this.mOnVideoSizeChangedListeners.contains(onVideoSizeChangedListener)) {
            this.mOnVideoSizeChangedListeners.add(onVideoSizeChangedListener);
        }
    }

    public void resetListeners() {
        this.mOnPreparedListener = null;
        this.mOnBufferingUpdateListener = null;
        this.mOnCompletionListener = null;
        this.mOnSeekCompletionListener = null;
        this.mOnVideoSizeChangedListener = null;
        this.mOnErrorListener = null;
        this.mOnInfoListener = null;
        List<IMediaPlayer.OnPreparedListener> list = this.mOnPreparedListeners;
        if (list != null) {
            list.clear();
        }
        List<IMediaPlayer.OnBufferingUpdateListener> list2 = this.mOnBufferingUpdateListeners;
        if (list2 != null) {
            list2.clear();
        }
        List<IMediaPlayer.OnPreCompletionListener> list3 = this.mOnPreCompletionListeners;
        if (list3 != null) {
            list3.clear();
        }
        List<IMediaPlayer.OnCompletionListener> list4 = this.mOnCompletionListeners;
        if (list4 != null) {
            list4.clear();
        }
        List<IMediaPlayer.OnSeekCompletionListener> list5 = this.mOnSeekCompletionListeners;
        if (list5 != null) {
            list5.clear();
        }
        List<IMediaPlayer.OnLoopCompletionListener> list6 = this.mOnLoopCompletionListeners;
        if (list6 != null) {
            list6.clear();
        }
        List<IMediaPlayer.OnVideoSizeChangedListener> list7 = this.mOnVideoSizeChangedListeners;
        if (list7 != null) {
            list7.clear();
        }
        List<IMediaPlayer.OnErrorListener> list8 = this.mOnErrorListeners;
        if (list8 != null) {
            list8.clear();
        }
        List<IMediaPlayer.OnInfoListener> list9 = this.mOnInfoListeners;
        if (list9 != null) {
            list9.clear();
        }
    }

    @Deprecated
    public final void setOnAudioCompletionListener(IMediaPlayer.OnAudioCompletionListener onAudioCompletionListener) {
        this.mOnAudioCompletionListener = onAudioCompletionListener;
    }

    @Deprecated
    public final void setOnAudioErrorListener(IMediaPlayer.OnAudioErrorListener onAudioErrorListener) {
        this.mOnAudioErrorListener = onAudioErrorListener;
    }

    @Deprecated
    public final void setOnAudioInfoListener(IMediaPlayer.OnAudioInfoListener onAudioInfoListener) {
        this.mOnAudioInfoListener = onAudioInfoListener;
    }

    @Deprecated
    public final void setOnAudioPauseListener(IMediaPlayer.OnAudioPauseListener onAudioPauseListener) {
        this.mOnAudioPauseListener = onAudioPauseListener;
    }

    public final void setOnAudioPreparedListener(IMediaPlayer.OnAudioPreparedListener onAudioPreparedListener) {
        this.mOnAudioPreparedListener = onAudioPreparedListener;
    }

    @Deprecated
    public final void setOnAudioSeekCompleteListener(IMediaPlayer.OnAudioSeekCompletionListener onAudioSeekCompletionListener) {
        this.mOnAudioSeekCompletionListener = onAudioSeekCompletionListener;
    }

    @Deprecated
    public final void setOnAudioSeekStartListener(IMediaPlayer.OnAudioSeekStartListener onAudioSeekStartListener) {
        this.mOnAudioSeekStartListener = onAudioSeekStartListener;
    }

    @Deprecated
    public final void setOnAudioStartListener(IMediaPlayer.OnAudioStartListener onAudioStartListener) {
        this.mOnAudioStartListener = onAudioStartListener;
    }

    @Deprecated
    public final void setOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
    }

    @Deprecated
    public final void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
    }

    @Deprecated
    public final void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
    }

    @Deprecated
    public final void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
    }

    @Deprecated
    public final void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
    }

    @Deprecated
    public final void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompletionListener onSeekCompletionListener) {
        this.mOnSeekCompletionListener = onSeekCompletionListener;
    }

    @Deprecated
    public final void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.mOnVideoSizeChangedListener = onVideoSizeChangedListener;
    }

    public void unregisterOnAudioCompletionListener(IMediaPlayer.OnAudioCompletionListener onAudioCompletionListener) {
        List<IMediaPlayer.OnAudioCompletionListener> list = this.mOnAudioCompletionListeners;
        if (list != null) {
            list.remove(onAudioCompletionListener);
        }
    }

    public void unregisterOnAudioErrorListener(IMediaPlayer.OnAudioErrorListener onAudioErrorListener) {
        List<IMediaPlayer.OnAudioErrorListener> list = this.mOnAudioErrorListeners;
        if (list != null) {
            list.remove(onAudioErrorListener);
        }
    }

    public void unregisterOnAudioInfoListener(IMediaPlayer.OnAudioInfoListener onAudioInfoListener) {
        List<IMediaPlayer.OnAudioInfoListener> list = this.mOnAudioInfoListeners;
        if (list != null) {
            list.remove(onAudioInfoListener);
        }
    }

    public void unregisterOnAudioLoopCompletionListener(IMediaPlayer.OnAudioLoopCompletionListener onAudioLoopCompletionListener) {
        List<IMediaPlayer.OnAudioLoopCompletionListener> list = this.mOnAudioLoopCompletionListeners;
        if (list != null) {
            list.remove(onAudioLoopCompletionListener);
        }
    }

    public void unregisterOnAudioPauseListener(IMediaPlayer.OnAudioPauseListener onAudioPauseListener) {
        List<IMediaPlayer.OnAudioPauseListener> list = this.mOnAudioPauseListeners;
        if (list != null) {
            list.remove(onAudioPauseListener);
        }
    }

    public void unregisterOnAudioPreCompletionListener(IMediaPlayer.OnAudioPreCompletionListener onAudioPreCompletionListener) {
        List<IMediaPlayer.OnAudioPreCompletionListener> list = this.mOnAudioPreCompletionListeners;
        if (list != null) {
            list.remove(onAudioPreCompletionListener);
        }
    }

    public void unregisterOnAudioPreparedListener(IMediaPlayer.OnAudioPreparedListener onAudioPreparedListener) {
        List<IMediaPlayer.OnAudioPreparedListener> list = this.mOnAudioPreparedListeners;
        if (list != null) {
            list.remove(onAudioPreparedListener);
        }
    }

    public void unregisterOnAudioSeekCompleteListener(IMediaPlayer.OnAudioSeekCompletionListener onAudioSeekCompletionListener) {
        List<IMediaPlayer.OnAudioSeekCompletionListener> list = this.mOnAudioSeekCompletionListeners;
        if (list != null) {
            list.remove(onAudioSeekCompletionListener);
        }
    }

    public void unregisterOnAudioSeekStartListener(IMediaPlayer.OnAudioSeekStartListener onAudioSeekStartListener) {
        List<IMediaPlayer.OnAudioSeekStartListener> list = this.mOnAudioSeekStartListeners;
        if (list != null) {
            list.remove(onAudioSeekStartListener);
        }
    }

    public void unregisterOnAudioStartListener(IMediaPlayer.OnAudioStartListener onAudioStartListener) {
        List<IMediaPlayer.OnAudioStartListener> list = this.mOnAudioStartListeners;
        if (list != null) {
            list.remove(onAudioStartListener);
        }
    }

    public void unregisterOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        List<IMediaPlayer.OnBufferingUpdateListener> list = this.mOnBufferingUpdateListeners;
        if (list != null) {
            list.remove(onBufferingUpdateListener);
        }
    }

    public void unregisterOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        List<IMediaPlayer.OnCompletionListener> list = this.mOnCompletionListeners;
        if (list != null) {
            list.remove(onCompletionListener);
        }
    }

    public void unregisterOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        List<IMediaPlayer.OnErrorListener> list = this.mOnErrorListeners;
        if (list != null) {
            list.remove(onErrorListener);
        }
    }

    public void unregisterOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        List<IMediaPlayer.OnInfoListener> list = this.mOnInfoListeners;
        if (list != null) {
            list.remove(onInfoListener);
        }
    }

    public void unregisterOnLoopCompletionListener(IMediaPlayer.OnLoopCompletionListener onLoopCompletionListener) {
        List<IMediaPlayer.OnLoopCompletionListener> list = this.mOnLoopCompletionListeners;
        if (list != null) {
            list.remove(onLoopCompletionListener);
        }
    }

    public void unregisterOnPlayerEventListener(IMediaPlayer.OnPlayerEventListener onPlayerEventListener) {
        List<IMediaPlayer.OnPlayerEventListener> list = this.mPlayerEventListener;
        if (list != null) {
            list.remove(onPlayerEventListener);
        }
    }

    public void unregisterOnPreCompletionListener(IMediaPlayer.OnPreCompletionListener onPreCompletionListener) {
        List<IMediaPlayer.OnPreCompletionListener> list = this.mOnPreCompletionListeners;
        if (list != null) {
            list.remove(onPreCompletionListener);
        }
    }

    public void unregisterOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        List<IMediaPlayer.OnPreparedListener> list = this.mOnPreparedListeners;
        if (list != null) {
            list.remove(onPreparedListener);
        }
    }

    public void unregisterOnSeekCompleteListener(IMediaPlayer.OnSeekCompletionListener onSeekCompletionListener) {
        List<IMediaPlayer.OnSeekCompletionListener> list = this.mOnSeekCompletionListeners;
        if (list != null) {
            list.remove(onSeekCompletionListener);
        }
    }

    public void unregisterOnVFPluginListener(IMediaPlayer.OnVFPluginListener onVFPluginListener) {
        List<IMediaPlayer.OnVFPluginListener> list = this.mVFPluginListener;
        if (list != null) {
            list.remove(onVFPluginListener);
        }
    }

    public void unregisterOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        List<IMediaPlayer.OnVideoSizeChangedListener> list = this.mOnVideoSizeChangedListeners;
        if (list != null) {
            list.remove(onVideoSizeChangedListener);
        }
    }
}
