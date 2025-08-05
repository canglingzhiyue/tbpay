package com.taobao.dxng.kmp_api_exporter;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/dxng/kmp_api_exporter/ABTestError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_PARAM", "EXPERIMENT_NOT_FOUND", "VARIATION_NOT_FOUND", "kmp_api_exporter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ABTestError extends Enum<ABTestError> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ABTestError[] $VALUES;
    public static final ABTestError INVALID_PARAM = new ABTestError("INVALID_PARAM", 0);
    public static final ABTestError EXPERIMENT_NOT_FOUND = new ABTestError("EXPERIMENT_NOT_FOUND", 1);
    public static final ABTestError VARIATION_NOT_FOUND = new ABTestError("VARIATION_NOT_FOUND", 2);

    private static final /* synthetic */ ABTestError[] $values() {
        return new ABTestError[]{INVALID_PARAM, EXPERIMENT_NOT_FOUND, VARIATION_NOT_FOUND};
    }

    static {
        ABTestError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ABTestError(String str, int i) {
    }

    public static a<ABTestError> getEntries() {
        return $ENTRIES;
    }

    public static ABTestError valueOf(String str) {
        return (ABTestError) Enum.valueOf(ABTestError.class, str);
    }

    public static ABTestError[] values() {
        return (ABTestError[]) $VALUES.clone();
    }
}
