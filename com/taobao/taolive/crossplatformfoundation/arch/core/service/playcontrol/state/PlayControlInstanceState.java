package com.taobao.taolive.crossplatformfoundation.arch.core.service.playcontrol.state;

import com.taobao.android.weex_framework.util.a;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\n\u0010\u0002\u001a\u00060\u0004j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\u00060\u0004j\u0002`\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/playcontrol/state/PlayControlInstanceState;", "", "state", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/playcontrol/state/TPlayControlInstanceState;", "", "<init>", "(Ljava/lang/String;II)V", "getState", "()I", TLogTracker.LEVEL_INFO, a.ATOM_EXT_Undefined, "InitInstance", "InitPlayerControl", "LoadContext", "PerformUIAction", "ComponentLoaded", "PerformPlayerAction", "DestroyInstance", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlayControlInstanceState extends Enum<PlayControlInstanceState> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ PlayControlInstanceState[] $VALUES;
    private final int state;
    public static final PlayControlInstanceState Undefined = new PlayControlInstanceState(a.ATOM_EXT_Undefined, 0, 0);
    public static final PlayControlInstanceState InitInstance = new PlayControlInstanceState("InitInstance", 1, 1);
    public static final PlayControlInstanceState InitPlayerControl = new PlayControlInstanceState("InitPlayerControl", 2, 2);
    public static final PlayControlInstanceState LoadContext = new PlayControlInstanceState("LoadContext", 3, 4);
    public static final PlayControlInstanceState PerformUIAction = new PlayControlInstanceState("PerformUIAction", 4, 8);
    public static final PlayControlInstanceState ComponentLoaded = new PlayControlInstanceState("ComponentLoaded", 5, 16);
    public static final PlayControlInstanceState PerformPlayerAction = new PlayControlInstanceState("PerformPlayerAction", 6, 32);
    public static final PlayControlInstanceState DestroyInstance = new PlayControlInstanceState("DestroyInstance", 7, 64);

    private static final /* synthetic */ PlayControlInstanceState[] $values() {
        return new PlayControlInstanceState[]{Undefined, InitInstance, InitPlayerControl, LoadContext, PerformUIAction, ComponentLoaded, PerformPlayerAction, DestroyInstance};
    }

    static {
        PlayControlInstanceState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private PlayControlInstanceState(String str, int i, int i2) {
        this.state = i2;
    }

    public static kotlin.enums.a<PlayControlInstanceState> getEntries() {
        return $ENTRIES;
    }

    public static PlayControlInstanceState valueOf(String str) {
        return (PlayControlInstanceState) Enum.valueOf(PlayControlInstanceState.class, str);
    }

    public static PlayControlInstanceState[] values() {
        return (PlayControlInstanceState[]) $VALUES.clone();
    }

    public final int getState() {
        return this.state;
    }
}
