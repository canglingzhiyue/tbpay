package com.taobao.taolive.crossplatformfoundation.arch.core.dto_and_do.response_declared_do;

import com.taobao.taolive.room.utils.ag;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/response_declared_do/LiveDetailResponseDataRoomStatus;", "", "status", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "None", "Pre", "Living", ag.CLICK_ANCHOR_INFO_REPLAY, "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LiveDetailResponseDataRoomStatus extends Enum<LiveDetailResponseDataRoomStatus> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LiveDetailResponseDataRoomStatus[] $VALUES;
    private final String status;
    public static final LiveDetailResponseDataRoomStatus None = new LiveDetailResponseDataRoomStatus("None", 0, "-1");
    public static final LiveDetailResponseDataRoomStatus Pre = new LiveDetailResponseDataRoomStatus("Pre", 1, "0");
    public static final LiveDetailResponseDataRoomStatus Living = new LiveDetailResponseDataRoomStatus("Living", 2, "1");
    public static final LiveDetailResponseDataRoomStatus Replay = new LiveDetailResponseDataRoomStatus(ag.CLICK_ANCHOR_INFO_REPLAY, 3, "2");

    private static final /* synthetic */ LiveDetailResponseDataRoomStatus[] $values() {
        return new LiveDetailResponseDataRoomStatus[]{None, Pre, Living, Replay};
    }

    static {
        LiveDetailResponseDataRoomStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private LiveDetailResponseDataRoomStatus(String str, int i, String str2) {
        this.status = str2;
    }

    public static a<LiveDetailResponseDataRoomStatus> getEntries() {
        return $ENTRIES;
    }

    public static LiveDetailResponseDataRoomStatus valueOf(String str) {
        return (LiveDetailResponseDataRoomStatus) Enum.valueOf(LiveDetailResponseDataRoomStatus.class, str);
    }

    public static LiveDetailResponseDataRoomStatus[] values() {
        return (LiveDetailResponseDataRoomStatus[]) $VALUES.clone();
    }

    public final String getStatus() {
        return this.status;
    }
}
