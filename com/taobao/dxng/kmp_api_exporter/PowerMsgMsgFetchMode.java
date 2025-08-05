package com.taobao.dxng.kmp_api_exporter;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/taobao/dxng/kmp_api_exporter/PowerMsgMsgFetchMode;", "", "<init>", "(Ljava/lang/String;I)V", "PUSH_ONLY", "PULL_ONLY", "PUSH_AND_PULL", "PULL_EXT", "PULL_WHEN_DISCONNECT", "kmp_api_exporter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PowerMsgMsgFetchMode extends Enum<PowerMsgMsgFetchMode> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PowerMsgMsgFetchMode[] $VALUES;
    public static final PowerMsgMsgFetchMode PUSH_ONLY = new PowerMsgMsgFetchMode("PUSH_ONLY", 0);
    public static final PowerMsgMsgFetchMode PULL_ONLY = new PowerMsgMsgFetchMode("PULL_ONLY", 1);
    public static final PowerMsgMsgFetchMode PUSH_AND_PULL = new PowerMsgMsgFetchMode("PUSH_AND_PULL", 2);
    public static final PowerMsgMsgFetchMode PULL_EXT = new PowerMsgMsgFetchMode("PULL_EXT", 3);
    public static final PowerMsgMsgFetchMode PULL_WHEN_DISCONNECT = new PowerMsgMsgFetchMode("PULL_WHEN_DISCONNECT", 4);

    private static final /* synthetic */ PowerMsgMsgFetchMode[] $values() {
        return new PowerMsgMsgFetchMode[]{PUSH_ONLY, PULL_ONLY, PUSH_AND_PULL, PULL_EXT, PULL_WHEN_DISCONNECT};
    }

    static {
        PowerMsgMsgFetchMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private PowerMsgMsgFetchMode(String str, int i) {
    }

    public static a<PowerMsgMsgFetchMode> getEntries() {
        return $ENTRIES;
    }

    public static PowerMsgMsgFetchMode valueOf(String str) {
        return (PowerMsgMsgFetchMode) Enum.valueOf(PowerMsgMsgFetchMode.class, str);
    }

    public static PowerMsgMsgFetchMode[] values() {
        return (PowerMsgMsgFetchMode[]) $VALUES.clone();
    }
}
