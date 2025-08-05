package com.taobao.dxng.kmp_api_exporter;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/dxng/kmp_api_exporter/UTStatus;", "", "<init>", "(Ljava/lang/String;I)V", "UT_H5_IN_WEBVIEW", "kmp_api_exporter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UTStatus extends Enum<UTStatus> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UTStatus[] $VALUES;
    public static final UTStatus UT_H5_IN_WEBVIEW = new UTStatus("UT_H5_IN_WEBVIEW", 0);

    private static final /* synthetic */ UTStatus[] $values() {
        return new UTStatus[]{UT_H5_IN_WEBVIEW};
    }

    static {
        UTStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UTStatus(String str, int i) {
    }

    public static a<UTStatus> getEntries() {
        return $ENTRIES;
    }

    public static UTStatus valueOf(String str) {
        return (UTStatus) Enum.valueOf(UTStatus.class, str);
    }

    public static UTStatus[] values() {
        return (UTStatus[]) $VALUES.clone();
    }
}
