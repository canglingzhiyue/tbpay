package com.taobao.taolive.crossplatformfoundation.arch.core.gateway.handler;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/gateway/handler/TaoLiveGatewayHanderExecuteResultCode;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "PASSED", "SUCCESSFULLY", "FAILURE", "AUTHENTICATIONFAUILURE", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaoLiveGatewayHanderExecuteResultCode extends Enum<TaoLiveGatewayHanderExecuteResultCode> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TaoLiveGatewayHanderExecuteResultCode[] $VALUES;
    public static final TaoLiveGatewayHanderExecuteResultCode PASSED = new TaoLiveGatewayHanderExecuteResultCode("PASSED", 0, "PASSED");
    public static final TaoLiveGatewayHanderExecuteResultCode SUCCESSFULLY = new TaoLiveGatewayHanderExecuteResultCode("SUCCESSFULLY", 1, "SUCCESSFULLY");
    public static final TaoLiveGatewayHanderExecuteResultCode FAILURE = new TaoLiveGatewayHanderExecuteResultCode("FAILURE", 2, "FAILURE");
    public static final TaoLiveGatewayHanderExecuteResultCode AUTHENTICATIONFAUILURE = new TaoLiveGatewayHanderExecuteResultCode("AUTHENTICATIONFAUILURE", 3, "AUTHENTICATIONFAUILURE");

    private static final /* synthetic */ TaoLiveGatewayHanderExecuteResultCode[] $values() {
        return new TaoLiveGatewayHanderExecuteResultCode[]{PASSED, SUCCESSFULLY, FAILURE, AUTHENTICATIONFAUILURE};
    }

    static {
        TaoLiveGatewayHanderExecuteResultCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TaoLiveGatewayHanderExecuteResultCode(String str, int i, String str2) {
    }

    public static a<TaoLiveGatewayHanderExecuteResultCode> getEntries() {
        return $ENTRIES;
    }

    public static TaoLiveGatewayHanderExecuteResultCode valueOf(String str) {
        return (TaoLiveGatewayHanderExecuteResultCode) Enum.valueOf(TaoLiveGatewayHanderExecuteResultCode.class, str);
    }

    public static TaoLiveGatewayHanderExecuteResultCode[] values() {
        return (TaoLiveGatewayHanderExecuteResultCode[]) $VALUES.clone();
    }
}
