package com.taobao.taolive.crossplatformfoundation.arch.core.service.playcontrol.state;

import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.flexbox.layoutmanager.view.b;
import kotlin.Metadata;
import tb.sii;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/playcontrol/state/PlayControlPlayerState;", "", "state", "", "<init>", "(Ljava/lang/String;II)V", "getState", "()I", a.ATOM_EXT_Undefined, b.PULL_INIT, "Prepared", "Play", "Stop", sii.CARD_MISS_VIDEO_STATUS_PAUSE, com.taobao.homepage.pop.ucp.b.KEY_RESUME, "Seek", "Error", "Stalled", "InfoReport", "ProgressReport", "Playing", "PreparedFinished", "Pausing", "Completed", "LoopCompleted", "Destroy", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlayControlPlayerState extends Enum<PlayControlPlayerState> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ PlayControlPlayerState[] $VALUES;
    private final int state;
    public static final PlayControlPlayerState Undefined = new PlayControlPlayerState(a.ATOM_EXT_Undefined, 0, 0);
    public static final PlayControlPlayerState Init = new PlayControlPlayerState(b.PULL_INIT, 1, 1);
    public static final PlayControlPlayerState Prepared = new PlayControlPlayerState("Prepared", 2, 2);
    public static final PlayControlPlayerState Play = new PlayControlPlayerState("Play", 3, 3);
    public static final PlayControlPlayerState Stop = new PlayControlPlayerState("Stop", 4, 4);
    public static final PlayControlPlayerState Pause = new PlayControlPlayerState(sii.CARD_MISS_VIDEO_STATUS_PAUSE, 5, 5);
    public static final PlayControlPlayerState Resume = new PlayControlPlayerState(com.taobao.homepage.pop.ucp.b.KEY_RESUME, 6, 6);
    public static final PlayControlPlayerState Seek = new PlayControlPlayerState("Seek", 7, 7);
    public static final PlayControlPlayerState Error = new PlayControlPlayerState("Error", 8, 16);
    public static final PlayControlPlayerState Stalled = new PlayControlPlayerState("Stalled", 9, 17);
    public static final PlayControlPlayerState InfoReport = new PlayControlPlayerState("InfoReport", 10, 18);
    public static final PlayControlPlayerState ProgressReport = new PlayControlPlayerState("ProgressReport", 11, 19);
    public static final PlayControlPlayerState Playing = new PlayControlPlayerState("Playing", 12, 20);
    public static final PlayControlPlayerState PreparedFinished = new PlayControlPlayerState("PreparedFinished", 13, 21);
    public static final PlayControlPlayerState Pausing = new PlayControlPlayerState("Pausing", 14, 22);
    public static final PlayControlPlayerState Completed = new PlayControlPlayerState("Completed", 15, 23);
    public static final PlayControlPlayerState LoopCompleted = new PlayControlPlayerState("LoopCompleted", 16, 24);
    public static final PlayControlPlayerState Destroy = new PlayControlPlayerState("Destroy", 17, 255);

    private static final /* synthetic */ PlayControlPlayerState[] $values() {
        return new PlayControlPlayerState[]{Undefined, Init, Prepared, Play, Stop, Pause, Resume, Seek, Error, Stalled, InfoReport, ProgressReport, Playing, PreparedFinished, Pausing, Completed, LoopCompleted, Destroy};
    }

    static {
        PlayControlPlayerState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.a($values);
    }

    private PlayControlPlayerState(String str, int i, int i2) {
        this.state = i2;
    }

    public static kotlin.enums.a<PlayControlPlayerState> getEntries() {
        return $ENTRIES;
    }

    public static PlayControlPlayerState valueOf(String str) {
        return (PlayControlPlayerState) Enum.valueOf(PlayControlPlayerState.class, str);
    }

    public static PlayControlPlayerState[] values() {
        return (PlayControlPlayerState[]) $VALUES.clone();
    }

    public final int getState() {
        return this.state;
    }
}
