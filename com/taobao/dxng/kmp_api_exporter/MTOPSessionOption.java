package com.taobao.dxng.kmp_api_exporter;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/dxng/kmp_api_exporter/MTOPSessionOption;", "", "<init>", "(Ljava/lang/String;I)V", "AUTO_LOGIN_ONLY", "AUTO_LOGIN_AND_MANUAL_LOGIN", "kmp_api_exporter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MTOPSessionOption extends Enum<MTOPSessionOption> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MTOPSessionOption[] $VALUES;
    public static final MTOPSessionOption AUTO_LOGIN_ONLY = new MTOPSessionOption("AUTO_LOGIN_ONLY", 0);
    public static final MTOPSessionOption AUTO_LOGIN_AND_MANUAL_LOGIN = new MTOPSessionOption("AUTO_LOGIN_AND_MANUAL_LOGIN", 1);

    private static final /* synthetic */ MTOPSessionOption[] $values() {
        return new MTOPSessionOption[]{AUTO_LOGIN_ONLY, AUTO_LOGIN_AND_MANUAL_LOGIN};
    }

    static {
        MTOPSessionOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private MTOPSessionOption(String str, int i) {
    }

    public static a<MTOPSessionOption> getEntries() {
        return $ENTRIES;
    }

    public static MTOPSessionOption valueOf(String str) {
        return (MTOPSessionOption) Enum.valueOf(MTOPSessionOption.class, str);
    }

    public static MTOPSessionOption[] values() {
        return (MTOPSessionOption[]) $VALUES.clone();
    }
}
