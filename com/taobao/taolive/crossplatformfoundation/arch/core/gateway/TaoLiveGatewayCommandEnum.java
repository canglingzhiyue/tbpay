package com.taobao.taolive.crossplatformfoundation.arch.core.gateway;

import com.taobao.android.weex_framework.util.a;
import kotlin.Metadata;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/gateway/TaoLiveGatewayCommandEnum;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", a.ATOM_EXT_Undefined, "CreateOpenLiveRoomContext", "CreateOpenLiveRoomEntity", "PerformOpenLiveRoomLifecycle", "PerformIntent", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaoLiveGatewayCommandEnum extends Enum<TaoLiveGatewayCommandEnum> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ TaoLiveGatewayCommandEnum[] $VALUES;
    public static final TaoLiveGatewayCommandEnum Undefined = new TaoLiveGatewayCommandEnum(a.ATOM_EXT_Undefined, 0, a.ATOM_EXT_Undefined);
    public static final TaoLiveGatewayCommandEnum CreateOpenLiveRoomContext = new TaoLiveGatewayCommandEnum("CreateOpenLiveRoomContext", 1, "CreateOpenLiveRoomContext");
    public static final TaoLiveGatewayCommandEnum CreateOpenLiveRoomEntity = new TaoLiveGatewayCommandEnum("CreateOpenLiveRoomEntity", 2, "CreateOpenLiveRoomEntity");
    public static final TaoLiveGatewayCommandEnum PerformOpenLiveRoomLifecycle = new TaoLiveGatewayCommandEnum("PerformOpenLiveRoomLifecycle", 3, "PerformOpenLiveRoomLifecycle");
    public static final TaoLiveGatewayCommandEnum PerformIntent = new TaoLiveGatewayCommandEnum("PerformIntent", 4, "PerformIntent");

    private static final /* synthetic */ TaoLiveGatewayCommandEnum[] $values() {
        return new TaoLiveGatewayCommandEnum[]{Undefined, CreateOpenLiveRoomContext, CreateOpenLiveRoomEntity, PerformOpenLiveRoomLifecycle, PerformIntent};
    }

    static {
        TaoLiveGatewayCommandEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TaoLiveGatewayCommandEnum(String str, int i, String str2) {
    }

    public static kotlin.enums.a<TaoLiveGatewayCommandEnum> getEntries() {
        return $ENTRIES;
    }

    public static TaoLiveGatewayCommandEnum valueOf(String str) {
        return (TaoLiveGatewayCommandEnum) Enum.valueOf(TaoLiveGatewayCommandEnum.class, str);
    }

    public static TaoLiveGatewayCommandEnum[] values() {
        return (TaoLiveGatewayCommandEnum[]) $VALUES.clone();
    }
}
