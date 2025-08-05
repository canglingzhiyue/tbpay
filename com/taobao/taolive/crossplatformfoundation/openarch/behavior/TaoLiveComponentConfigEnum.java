package com.taobao.taolive.crossplatformfoundation.openarch.behavior;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/openarch/behavior/TaoLiveComponentConfigEnum;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "TaoLiveComponentConfigEnum_Default", "TaoLiveComponentConfigEnum_LegacyLiveRoom", "TaoLiveComponentConfigEnum_202307_HaoKanMixed", "TaoLiveComponentConfigEnum_202309_ShopTab3", "TaoLiveComponentConfigEnum_202310_MixLiveAndTab", "TaoLiveComponentConfigEnum_202310_MixLive", "TaoLiveComponentConfigEnum_202401_HomeTab", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaoLiveComponentConfigEnum extends Enum<TaoLiveComponentConfigEnum> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TaoLiveComponentConfigEnum[] $VALUES;
    public static final TaoLiveComponentConfigEnum TaoLiveComponentConfigEnum_Default = new TaoLiveComponentConfigEnum("TaoLiveComponentConfigEnum_Default", 0, 0);
    public static final TaoLiveComponentConfigEnum TaoLiveComponentConfigEnum_LegacyLiveRoom = new TaoLiveComponentConfigEnum("TaoLiveComponentConfigEnum_LegacyLiveRoom", 1, 1);
    public static final TaoLiveComponentConfigEnum TaoLiveComponentConfigEnum_202307_HaoKanMixed = new TaoLiveComponentConfigEnum("TaoLiveComponentConfigEnum_202307_HaoKanMixed", 2, 2);
    public static final TaoLiveComponentConfigEnum TaoLiveComponentConfigEnum_202309_ShopTab3 = new TaoLiveComponentConfigEnum("TaoLiveComponentConfigEnum_202309_ShopTab3", 3, 3);
    public static final TaoLiveComponentConfigEnum TaoLiveComponentConfigEnum_202310_MixLiveAndTab = new TaoLiveComponentConfigEnum("TaoLiveComponentConfigEnum_202310_MixLiveAndTab", 4, 4);
    public static final TaoLiveComponentConfigEnum TaoLiveComponentConfigEnum_202310_MixLive = new TaoLiveComponentConfigEnum("TaoLiveComponentConfigEnum_202310_MixLive", 5, 5);
    public static final TaoLiveComponentConfigEnum TaoLiveComponentConfigEnum_202401_HomeTab = new TaoLiveComponentConfigEnum("TaoLiveComponentConfigEnum_202401_HomeTab", 6, 6);

    private static final /* synthetic */ TaoLiveComponentConfigEnum[] $values() {
        return new TaoLiveComponentConfigEnum[]{TaoLiveComponentConfigEnum_Default, TaoLiveComponentConfigEnum_LegacyLiveRoom, TaoLiveComponentConfigEnum_202307_HaoKanMixed, TaoLiveComponentConfigEnum_202309_ShopTab3, TaoLiveComponentConfigEnum_202310_MixLiveAndTab, TaoLiveComponentConfigEnum_202310_MixLive, TaoLiveComponentConfigEnum_202401_HomeTab};
    }

    static {
        TaoLiveComponentConfigEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TaoLiveComponentConfigEnum(String str, int i, int i2) {
    }

    public static a<TaoLiveComponentConfigEnum> getEntries() {
        return $ENTRIES;
    }

    public static TaoLiveComponentConfigEnum valueOf(String str) {
        return (TaoLiveComponentConfigEnum) Enum.valueOf(TaoLiveComponentConfigEnum.class, str);
    }

    public static TaoLiveComponentConfigEnum[] values() {
        return (TaoLiveComponentConfigEnum[]) $VALUES.clone();
    }
}
