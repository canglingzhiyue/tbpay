package com.taobao.dxng.kmp_api_exporter;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/dxng/kmp_api_exporter/MTOPResponseType;", "", "<init>", "(Ljava/lang/String;I)V", "JSON", "ORIGINAL_JSON", "kmp_api_exporter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MTOPResponseType extends Enum<MTOPResponseType> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MTOPResponseType[] $VALUES;
    public static final MTOPResponseType JSON = new MTOPResponseType("JSON", 0);
    public static final MTOPResponseType ORIGINAL_JSON = new MTOPResponseType("ORIGINAL_JSON", 1);

    private static final /* synthetic */ MTOPResponseType[] $values() {
        return new MTOPResponseType[]{JSON, ORIGINAL_JSON};
    }

    static {
        MTOPResponseType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private MTOPResponseType(String str, int i) {
    }

    public static a<MTOPResponseType> getEntries() {
        return $ENTRIES;
    }

    public static MTOPResponseType valueOf(String str) {
        return (MTOPResponseType) Enum.valueOf(MTOPResponseType.class, str);
    }

    public static MTOPResponseType[] values() {
        return (MTOPResponseType[]) $VALUES.clone();
    }
}
