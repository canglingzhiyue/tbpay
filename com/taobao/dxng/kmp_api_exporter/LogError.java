package com.taobao.dxng.kmp_api_exporter;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/dxng/kmp_api_exporter/LogError;", "", "<init>", "(Ljava/lang/String;I)V", "_1001", "kmp_api_exporter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogError extends Enum<LogError> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LogError[] $VALUES;
    public static final LogError _1001 = new LogError("_1001", 0);

    private static final /* synthetic */ LogError[] $values() {
        return new LogError[]{_1001};
    }

    static {
        LogError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private LogError(String str, int i) {
    }

    public static a<LogError> getEntries() {
        return $ENTRIES;
    }

    public static LogError valueOf(String str) {
        return (LogError) Enum.valueOf(LogError.class, str);
    }

    public static LogError[] values() {
        return (LogError[]) $VALUES.clone();
    }
}
