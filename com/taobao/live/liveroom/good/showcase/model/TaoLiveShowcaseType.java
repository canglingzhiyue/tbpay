package com.taobao.live.liveroom.good.showcase.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/live/liveroom/good/showcase/model/TaoLiveShowcaseType;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_NORMAL", "TYPE_SECKILL", "TYPE_EXPLAININT", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TaoLiveShowcaseType extends Enum<TaoLiveShowcaseType> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ TaoLiveShowcaseType[] $VALUES;
    public static final TaoLiveShowcaseType TYPE_NORMAL = new TaoLiveShowcaseType("TYPE_NORMAL", 0);
    public static final TaoLiveShowcaseType TYPE_SECKILL = new TaoLiveShowcaseType("TYPE_SECKILL", 1);
    public static final TaoLiveShowcaseType TYPE_EXPLAININT = new TaoLiveShowcaseType("TYPE_EXPLAININT", 2);

    private static final /* synthetic */ TaoLiveShowcaseType[] $values() {
        return new TaoLiveShowcaseType[]{TYPE_NORMAL, TYPE_SECKILL, TYPE_EXPLAININT};
    }

    static {
        TaoLiveShowcaseType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.a($values);
    }

    private TaoLiveShowcaseType(String str, int i) {
    }

    public static kotlin.enums.a<TaoLiveShowcaseType> getEntries() {
        return $ENTRIES;
    }

    public static TaoLiveShowcaseType valueOf(String str) {
        return (TaoLiveShowcaseType) Enum.valueOf(TaoLiveShowcaseType.class, str);
    }

    public static TaoLiveShowcaseType[] values() {
        return (TaoLiveShowcaseType[]) $VALUES.clone();
    }
}
