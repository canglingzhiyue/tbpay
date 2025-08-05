package com.taobao.dxng.kmp_api_exporter;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/dxng/kmp_api_exporter/MTOPUnit;", "", "<init>", "(Ljava/lang/String;I)V", "UNIT_TRADE", "UNIT_GUIDE", "kmp_api_exporter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MTOPUnit extends Enum<MTOPUnit> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MTOPUnit[] $VALUES;
    public static final MTOPUnit UNIT_TRADE = new MTOPUnit("UNIT_TRADE", 0);
    public static final MTOPUnit UNIT_GUIDE = new MTOPUnit("UNIT_GUIDE", 1);

    private static final /* synthetic */ MTOPUnit[] $values() {
        return new MTOPUnit[]{UNIT_TRADE, UNIT_GUIDE};
    }

    static {
        MTOPUnit[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private MTOPUnit(String str, int i) {
    }

    public static a<MTOPUnit> getEntries() {
        return $ENTRIES;
    }

    public static MTOPUnit valueOf(String str) {
        return (MTOPUnit) Enum.valueOf(MTOPUnit.class, str);
    }

    public static MTOPUnit[] values() {
        return (MTOPUnit[]) $VALUES.clone();
    }
}
