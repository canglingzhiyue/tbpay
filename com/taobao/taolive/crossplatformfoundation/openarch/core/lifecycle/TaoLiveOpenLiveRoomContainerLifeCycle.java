package com.taobao.taolive.crossplatformfoundation.openarch.core.lifecycle;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/openarch/core/lifecycle/TaoLiveOpenLiveRoomContainerLifeCycle;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "OnLiveRoomContainerInitialize", "OnLiveRoomContainerLoad", "OnLiveRoomContainerWillAppear", "OnLiveRoomContainerDidAppear", "OnLiveRoomContainerWillDisappear", "OnLiveRoomContainerDidDisappear", "OnLiveRoomContainerDestory", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaoLiveOpenLiveRoomContainerLifeCycle extends Enum<TaoLiveOpenLiveRoomContainerLifeCycle> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TaoLiveOpenLiveRoomContainerLifeCycle[] $VALUES;
    private final String code;
    public static final TaoLiveOpenLiveRoomContainerLifeCycle OnLiveRoomContainerInitialize = new TaoLiveOpenLiveRoomContainerLifeCycle("OnLiveRoomContainerInitialize", 0, "OnLiveRoomInitialize");
    public static final TaoLiveOpenLiveRoomContainerLifeCycle OnLiveRoomContainerLoad = new TaoLiveOpenLiveRoomContainerLifeCycle("OnLiveRoomContainerLoad", 1, "OnLiveRoomCreated");
    public static final TaoLiveOpenLiveRoomContainerLifeCycle OnLiveRoomContainerWillAppear = new TaoLiveOpenLiveRoomContainerLifeCycle("OnLiveRoomContainerWillAppear", 2, "OnLiveRooWillAppear");
    public static final TaoLiveOpenLiveRoomContainerLifeCycle OnLiveRoomContainerDidAppear = new TaoLiveOpenLiveRoomContainerLifeCycle("OnLiveRoomContainerDidAppear", 3, "OnLiveRooDidAppear");
    public static final TaoLiveOpenLiveRoomContainerLifeCycle OnLiveRoomContainerWillDisappear = new TaoLiveOpenLiveRoomContainerLifeCycle("OnLiveRoomContainerWillDisappear", 4, "OnLiveRooWillDisappear");
    public static final TaoLiveOpenLiveRoomContainerLifeCycle OnLiveRoomContainerDidDisappear = new TaoLiveOpenLiveRoomContainerLifeCycle("OnLiveRoomContainerDidDisappear", 5, "OnLiveRooWDidDisappear");
    public static final TaoLiveOpenLiveRoomContainerLifeCycle OnLiveRoomContainerDestory = new TaoLiveOpenLiveRoomContainerLifeCycle("OnLiveRoomContainerDestory", 6, "OnLiveRoomDestory");

    private static final /* synthetic */ TaoLiveOpenLiveRoomContainerLifeCycle[] $values() {
        return new TaoLiveOpenLiveRoomContainerLifeCycle[]{OnLiveRoomContainerInitialize, OnLiveRoomContainerLoad, OnLiveRoomContainerWillAppear, OnLiveRoomContainerDidAppear, OnLiveRoomContainerWillDisappear, OnLiveRoomContainerDidDisappear, OnLiveRoomContainerDestory};
    }

    static {
        TaoLiveOpenLiveRoomContainerLifeCycle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TaoLiveOpenLiveRoomContainerLifeCycle(String str, int i, String str2) {
        this.code = str2;
    }

    public static a<TaoLiveOpenLiveRoomContainerLifeCycle> getEntries() {
        return $ENTRIES;
    }

    public static TaoLiveOpenLiveRoomContainerLifeCycle valueOf(String str) {
        return (TaoLiveOpenLiveRoomContainerLifeCycle) Enum.valueOf(TaoLiveOpenLiveRoomContainerLifeCycle.class, str);
    }

    public static TaoLiveOpenLiveRoomContainerLifeCycle[] values() {
        return (TaoLiveOpenLiveRoomContainerLifeCycle[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }
}
