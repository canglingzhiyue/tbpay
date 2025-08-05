package com.taobao.dxng.kmp_api_exporter;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/dxng/kmp_api_exporter/ToastError;", "", "<init>", "(Ljava/lang/String;I)V", "CONTENT_EMPTY", "kmp_api_exporter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToastError extends Enum<ToastError> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ToastError[] $VALUES;
    public static final ToastError CONTENT_EMPTY = new ToastError("CONTENT_EMPTY", 0);

    private static final /* synthetic */ ToastError[] $values() {
        return new ToastError[]{CONTENT_EMPTY};
    }

    static {
        ToastError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ToastError(String str, int i) {
    }

    public static a<ToastError> getEntries() {
        return $ENTRIES;
    }

    public static ToastError valueOf(String str) {
        return (ToastError) Enum.valueOf(ToastError.class, str);
    }

    public static ToastError[] values() {
        return (ToastError[]) $VALUES.clone();
    }
}
