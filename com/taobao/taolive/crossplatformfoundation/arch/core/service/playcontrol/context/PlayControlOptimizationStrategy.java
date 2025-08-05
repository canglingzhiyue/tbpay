package com.taobao.taolive.crossplatformfoundation.arch.core.service.playcontrol.context;

import com.taobao.tao.flexbox.layoutmanager.view.b;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/playcontrol/context/PlayControlOptimizationStrategy;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", b.PULL_ALL, "None", "AutoPlayWhenPlayComponentLoaded", "PlayerRetryStrategy1", "AutoResumeWhenPause", "ContinuePrepare", "respawnWhenMeetLiveStreamError", "respawnWhenMeetLiveStreamCompleted", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlayControlOptimizationStrategy extends Enum<PlayControlOptimizationStrategy> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PlayControlOptimizationStrategy[] $VALUES;
    private final int code;
    public static final PlayControlOptimizationStrategy All = new PlayControlOptimizationStrategy(b.PULL_ALL, 0, 65535);
    public static final PlayControlOptimizationStrategy None = new PlayControlOptimizationStrategy("None", 1, 0);
    public static final PlayControlOptimizationStrategy AutoPlayWhenPlayComponentLoaded = new PlayControlOptimizationStrategy("AutoPlayWhenPlayComponentLoaded", 2, 1);
    public static final PlayControlOptimizationStrategy PlayerRetryStrategy1 = new PlayControlOptimizationStrategy("PlayerRetryStrategy1", 3, 2);
    public static final PlayControlOptimizationStrategy AutoResumeWhenPause = new PlayControlOptimizationStrategy("AutoResumeWhenPause", 4, 4);
    public static final PlayControlOptimizationStrategy ContinuePrepare = new PlayControlOptimizationStrategy("ContinuePrepare", 5, 8);
    public static final PlayControlOptimizationStrategy respawnWhenMeetLiveStreamError = new PlayControlOptimizationStrategy("respawnWhenMeetLiveStreamError", 6, 16);
    public static final PlayControlOptimizationStrategy respawnWhenMeetLiveStreamCompleted = new PlayControlOptimizationStrategy("respawnWhenMeetLiveStreamCompleted", 7, 32);

    private static final /* synthetic */ PlayControlOptimizationStrategy[] $values() {
        return new PlayControlOptimizationStrategy[]{All, None, AutoPlayWhenPlayComponentLoaded, PlayerRetryStrategy1, AutoResumeWhenPause, ContinuePrepare, respawnWhenMeetLiveStreamError, respawnWhenMeetLiveStreamCompleted};
    }

    static {
        PlayControlOptimizationStrategy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.a($values);
    }

    private PlayControlOptimizationStrategy(String str, int i, int i2) {
        this.code = i2;
    }

    public static a<PlayControlOptimizationStrategy> getEntries() {
        return $ENTRIES;
    }

    public static PlayControlOptimizationStrategy valueOf(String str) {
        return (PlayControlOptimizationStrategy) Enum.valueOf(PlayControlOptimizationStrategy.class, str);
    }

    public static PlayControlOptimizationStrategy[] values() {
        return (PlayControlOptimizationStrategy[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
