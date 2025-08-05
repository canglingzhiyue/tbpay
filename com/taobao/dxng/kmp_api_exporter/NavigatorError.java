package com.taobao.dxng.kmp_api_exporter;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/dxng/kmp_api_exporter/NavigatorError;", "", "<init>", "(Ljava/lang/String;I)V", "URL_INVALID", "CLOSE_ERROR", "kmp_api_exporter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigatorError extends Enum<NavigatorError> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ NavigatorError[] $VALUES;
    public static final NavigatorError URL_INVALID = new NavigatorError("URL_INVALID", 0);
    public static final NavigatorError CLOSE_ERROR = new NavigatorError("CLOSE_ERROR", 1);

    private static final /* synthetic */ NavigatorError[] $values() {
        return new NavigatorError[]{URL_INVALID, CLOSE_ERROR};
    }

    static {
        NavigatorError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private NavigatorError(String str, int i) {
    }

    public static a<NavigatorError> getEntries() {
        return $ENTRIES;
    }

    public static NavigatorError valueOf(String str) {
        return (NavigatorError) Enum.valueOf(NavigatorError.class, str);
    }

    public static NavigatorError[] values() {
        return (NavigatorError[]) $VALUES.clone();
    }
}
