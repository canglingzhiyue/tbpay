package com.taobao.taolive.crossplatformfoundation.arch.core.service.playcontrol.state;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/playcontrol/state/PlayControlServiceState;", "", "<init>", "(Ljava/lang/String;I)V", "setupService", "haltService", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlayControlServiceState extends Enum<PlayControlServiceState> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PlayControlServiceState[] $VALUES;
    public static final PlayControlServiceState setupService = new PlayControlServiceState("setupService", 0);
    public static final PlayControlServiceState haltService = new PlayControlServiceState("haltService", 1);

    private static final /* synthetic */ PlayControlServiceState[] $values() {
        return new PlayControlServiceState[]{setupService, haltService};
    }

    static {
        PlayControlServiceState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private PlayControlServiceState(String str, int i) {
    }

    public static a<PlayControlServiceState> getEntries() {
        return $ENTRIES;
    }

    public static PlayControlServiceState valueOf(String str) {
        return (PlayControlServiceState) Enum.valueOf(PlayControlServiceState.class, str);
    }

    public static PlayControlServiceState[] values() {
        return (PlayControlServiceState[]) $VALUES.clone();
    }
}
