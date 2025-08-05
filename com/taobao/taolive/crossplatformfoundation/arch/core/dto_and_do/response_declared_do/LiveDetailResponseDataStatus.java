package com.taobao.taolive.crossplatformfoundation.arch.core.dto_and_do.response_declared_do;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/response_declared_do/LiveDetailResponseDataStatus;", "", "status", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "Living", "Leave", "End", "Preview", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LiveDetailResponseDataStatus extends Enum<LiveDetailResponseDataStatus> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LiveDetailResponseDataStatus[] $VALUES;
    private final String status;
    public static final LiveDetailResponseDataStatus Living = new LiveDetailResponseDataStatus("Living", 0, "0");
    public static final LiveDetailResponseDataStatus Leave = new LiveDetailResponseDataStatus("Leave", 1, "3");
    public static final LiveDetailResponseDataStatus End = new LiveDetailResponseDataStatus("End", 2, "1");
    public static final LiveDetailResponseDataStatus Preview = new LiveDetailResponseDataStatus("Preview", 3, "4");

    private static final /* synthetic */ LiveDetailResponseDataStatus[] $values() {
        return new LiveDetailResponseDataStatus[]{Living, Leave, End, Preview};
    }

    static {
        LiveDetailResponseDataStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private LiveDetailResponseDataStatus(String str, int i, String str2) {
        this.status = str2;
    }

    public static a<LiveDetailResponseDataStatus> getEntries() {
        return $ENTRIES;
    }

    public static LiveDetailResponseDataStatus valueOf(String str) {
        return (LiveDetailResponseDataStatus) Enum.valueOf(LiveDetailResponseDataStatus.class, str);
    }

    public static LiveDetailResponseDataStatus[] values() {
        return (LiveDetailResponseDataStatus[]) $VALUES.clone();
    }

    public final String getStatus() {
        return this.status;
    }
}
