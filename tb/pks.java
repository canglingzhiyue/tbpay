package tb;

import com.taobao.taolive.sdk.ui.media.IMediaPlayer;

/* loaded from: classes8.dex */
public interface pks {
    void onFirstFrame(long j, long j2);

    void onLiveStartPlay(boolean z);

    void onSurfaceRenderFirstFrame(long j);

    void onVideoError(IMediaPlayer iMediaPlayer, int i, int i2);

    void onVideoInfo(IMediaPlayer iMediaPlayer, long j, long j2, Object obj);
}
