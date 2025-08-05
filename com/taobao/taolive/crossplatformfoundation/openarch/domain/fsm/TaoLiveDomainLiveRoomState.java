package com.taobao.taolive.crossplatformfoundation.openarch.domain.fsm;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/openarch/domain/fsm/TaoLiveDomainLiveRoomState;", "", "<init>", "(Ljava/lang/String;I)V", "TaoLiveDomainLiveRoomStateUndefined", "TaoLiveDomainLiveRoomStateProcessUserInfo", "TaoLiveDomainLiveRoomStateProcessLifeCycleChanged", "TaoLiveDomainLiveRoomStateProcess", "TaoLiveDomainLiveRoomStateRequestLiveRoomData", "TaoLiveDomainLiveRoomStateAssembleLiveRoomViewModel", "TaoLiveDomainLiveRoomStateSyncViewModelTORenderFramework", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaoLiveDomainLiveRoomState extends Enum<TaoLiveDomainLiveRoomState> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TaoLiveDomainLiveRoomState[] $VALUES;
    public static final TaoLiveDomainLiveRoomState TaoLiveDomainLiveRoomStateUndefined = new TaoLiveDomainLiveRoomState("TaoLiveDomainLiveRoomStateUndefined", 0);
    public static final TaoLiveDomainLiveRoomState TaoLiveDomainLiveRoomStateProcessUserInfo = new TaoLiveDomainLiveRoomState("TaoLiveDomainLiveRoomStateProcessUserInfo", 1);
    public static final TaoLiveDomainLiveRoomState TaoLiveDomainLiveRoomStateProcessLifeCycleChanged = new TaoLiveDomainLiveRoomState("TaoLiveDomainLiveRoomStateProcessLifeCycleChanged", 2);
    public static final TaoLiveDomainLiveRoomState TaoLiveDomainLiveRoomStateProcess = new TaoLiveDomainLiveRoomState("TaoLiveDomainLiveRoomStateProcess", 3);
    public static final TaoLiveDomainLiveRoomState TaoLiveDomainLiveRoomStateRequestLiveRoomData = new TaoLiveDomainLiveRoomState("TaoLiveDomainLiveRoomStateRequestLiveRoomData", 4);
    public static final TaoLiveDomainLiveRoomState TaoLiveDomainLiveRoomStateAssembleLiveRoomViewModel = new TaoLiveDomainLiveRoomState("TaoLiveDomainLiveRoomStateAssembleLiveRoomViewModel", 5);
    public static final TaoLiveDomainLiveRoomState TaoLiveDomainLiveRoomStateSyncViewModelTORenderFramework = new TaoLiveDomainLiveRoomState("TaoLiveDomainLiveRoomStateSyncViewModelTORenderFramework", 6);

    private static final /* synthetic */ TaoLiveDomainLiveRoomState[] $values() {
        return new TaoLiveDomainLiveRoomState[]{TaoLiveDomainLiveRoomStateUndefined, TaoLiveDomainLiveRoomStateProcessUserInfo, TaoLiveDomainLiveRoomStateProcessLifeCycleChanged, TaoLiveDomainLiveRoomStateProcess, TaoLiveDomainLiveRoomStateRequestLiveRoomData, TaoLiveDomainLiveRoomStateAssembleLiveRoomViewModel, TaoLiveDomainLiveRoomStateSyncViewModelTORenderFramework};
    }

    static {
        TaoLiveDomainLiveRoomState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TaoLiveDomainLiveRoomState(String str, int i) {
    }

    public static a<TaoLiveDomainLiveRoomState> getEntries() {
        return $ENTRIES;
    }

    public static TaoLiveDomainLiveRoomState valueOf(String str) {
        return (TaoLiveDomainLiveRoomState) Enum.valueOf(TaoLiveDomainLiveRoomState.class, str);
    }

    public static TaoLiveDomainLiveRoomState[] values() {
        return (TaoLiveDomainLiveRoomState[]) $VALUES.clone();
    }
}
