package com.taobao.taolive.crossplatformfoundation.openarch.core.lifecycle;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/openarch/core/lifecycle/TaoLiveOpenLiveRoomLifeCycle;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "OnLiveRoomInitialize", "OnLiveRoomLoad", "OnLiveRoomWillAppear", "OnLiveRoomDidAppear", "OnLiveRoomWillDisappear", "OnLiveRoomDidDisappear", "OnLiveRoomDestory", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaoLiveOpenLiveRoomLifeCycle extends Enum<TaoLiveOpenLiveRoomLifeCycle> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TaoLiveOpenLiveRoomLifeCycle[] $VALUES;
    private final String code;
    public static final TaoLiveOpenLiveRoomLifeCycle OnLiveRoomInitialize = new TaoLiveOpenLiveRoomLifeCycle("OnLiveRoomInitialize", 0, "OnLiveRoomInitialize");
    public static final TaoLiveOpenLiveRoomLifeCycle OnLiveRoomLoad = new TaoLiveOpenLiveRoomLifeCycle("OnLiveRoomLoad", 1, "OnLiveRoomCreated");
    public static final TaoLiveOpenLiveRoomLifeCycle OnLiveRoomWillAppear = new TaoLiveOpenLiveRoomLifeCycle("OnLiveRoomWillAppear", 2, "OnLiveRoomWillAppear");
    public static final TaoLiveOpenLiveRoomLifeCycle OnLiveRoomDidAppear = new TaoLiveOpenLiveRoomLifeCycle("OnLiveRoomDidAppear", 3, "OnLiveRoomDidAppear");
    public static final TaoLiveOpenLiveRoomLifeCycle OnLiveRoomWillDisappear = new TaoLiveOpenLiveRoomLifeCycle("OnLiveRoomWillDisappear", 4, "OnLiveRoomWillDisappear");
    public static final TaoLiveOpenLiveRoomLifeCycle OnLiveRoomDidDisappear = new TaoLiveOpenLiveRoomLifeCycle("OnLiveRoomDidDisappear", 5, "OnLiveRoomDidDisappear");
    public static final TaoLiveOpenLiveRoomLifeCycle OnLiveRoomDestory = new TaoLiveOpenLiveRoomLifeCycle("OnLiveRoomDestory", 6, "OnLiveRoomDestory");

    private static final /* synthetic */ TaoLiveOpenLiveRoomLifeCycle[] $values() {
        return new TaoLiveOpenLiveRoomLifeCycle[]{OnLiveRoomInitialize, OnLiveRoomLoad, OnLiveRoomWillAppear, OnLiveRoomDidAppear, OnLiveRoomWillDisappear, OnLiveRoomDidDisappear, OnLiveRoomDestory};
    }

    static {
        TaoLiveOpenLiveRoomLifeCycle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TaoLiveOpenLiveRoomLifeCycle(String str, int i, String str2) {
        this.code = str2;
    }

    public static a<TaoLiveOpenLiveRoomLifeCycle> getEntries() {
        return $ENTRIES;
    }

    public static TaoLiveOpenLiveRoomLifeCycle valueOf(String str) {
        return (TaoLiveOpenLiveRoomLifeCycle) Enum.valueOf(TaoLiveOpenLiveRoomLifeCycle.class, str);
    }

    public static TaoLiveOpenLiveRoomLifeCycle[] values() {
        return (TaoLiveOpenLiveRoomLifeCycle[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }
}
