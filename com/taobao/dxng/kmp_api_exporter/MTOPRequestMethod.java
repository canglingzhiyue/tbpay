package com.taobao.dxng.kmp_api_exporter;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/dxng/kmp_api_exporter/MTOPRequestMethod;", "", "<init>", "(Ljava/lang/String;I)V", "GET", "POST", "kmp_api_exporter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MTOPRequestMethod extends Enum<MTOPRequestMethod> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MTOPRequestMethod[] $VALUES;
    public static final MTOPRequestMethod GET = new MTOPRequestMethod("GET", 0);
    public static final MTOPRequestMethod POST = new MTOPRequestMethod("POST", 1);

    private static final /* synthetic */ MTOPRequestMethod[] $values() {
        return new MTOPRequestMethod[]{GET, POST};
    }

    static {
        MTOPRequestMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private MTOPRequestMethod(String str, int i) {
    }

    public static a<MTOPRequestMethod> getEntries() {
        return $ENTRIES;
    }

    public static MTOPRequestMethod valueOf(String str) {
        return (MTOPRequestMethod) Enum.valueOf(MTOPRequestMethod.class, str);
    }

    public static MTOPRequestMethod[] values() {
        return (MTOPRequestMethod[]) $VALUES.clone();
    }
}
