package com.taobao.taolive.crossplatformfoundation.arch.core.service.message;

import com.taobao.android.weex_framework.util.a;
import kotlin.Metadata;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/OpenArchMessageServiceState;", "", "<init>", "(Ljava/lang/String;I)V", a.ATOM_EXT_Undefined, "Setup", "Shutdown", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenArchMessageServiceState extends Enum<OpenArchMessageServiceState> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ OpenArchMessageServiceState[] $VALUES;
    public static final OpenArchMessageServiceState Undefined = new OpenArchMessageServiceState(a.ATOM_EXT_Undefined, 0);
    public static final OpenArchMessageServiceState Setup = new OpenArchMessageServiceState("Setup", 1);
    public static final OpenArchMessageServiceState Shutdown = new OpenArchMessageServiceState("Shutdown", 2);

    private static final /* synthetic */ OpenArchMessageServiceState[] $values() {
        return new OpenArchMessageServiceState[]{Undefined, Setup, Shutdown};
    }

    static {
        OpenArchMessageServiceState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OpenArchMessageServiceState(String str, int i) {
    }

    public static kotlin.enums.a<OpenArchMessageServiceState> getEntries() {
        return $ENTRIES;
    }

    public static OpenArchMessageServiceState valueOf(String str) {
        return (OpenArchMessageServiceState) Enum.valueOf(OpenArchMessageServiceState.class, str);
    }

    public static OpenArchMessageServiceState[] values() {
        return (OpenArchMessageServiceState[]) $VALUES.clone();
    }
}
