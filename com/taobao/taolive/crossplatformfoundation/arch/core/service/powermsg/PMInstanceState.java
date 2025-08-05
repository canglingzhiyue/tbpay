package com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg;

import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.kge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/PMInstanceState;", "", "state", "", "<init>", "(Ljava/lang/String;II)V", "getState", "()I", com.taobao.android.weex_framework.util.a.ATOM_EXT_Undefined, "SetupCompleted", "ShutdownCompleted", "Subscribed", "Unsubscribed", "AboutToSubscribe", "AboutToUnsubscribe", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PMInstanceState extends Enum<PMInstanceState> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ PMInstanceState[] $VALUES;
    public static final a Companion;
    private final int state;
    public static final PMInstanceState Undefined = new PMInstanceState(com.taobao.android.weex_framework.util.a.ATOM_EXT_Undefined, 0, 0);
    public static final PMInstanceState SetupCompleted = new PMInstanceState("SetupCompleted", 1, 1);
    public static final PMInstanceState ShutdownCompleted = new PMInstanceState("ShutdownCompleted", 2, 2);
    public static final PMInstanceState Subscribed = new PMInstanceState("Subscribed", 3, 3);
    public static final PMInstanceState Unsubscribed = new PMInstanceState("Unsubscribed", 4, 4);
    public static final PMInstanceState AboutToSubscribe = new PMInstanceState("AboutToSubscribe", 5, -1);
    public static final PMInstanceState AboutToUnsubscribe = new PMInstanceState("AboutToUnsubscribe", 6, -2);

    private static final /* synthetic */ PMInstanceState[] $values() {
        return new PMInstanceState[]{Undefined, SetupCompleted, ShutdownCompleted, Subscribed, Unsubscribed, AboutToSubscribe, AboutToUnsubscribe};
    }

    static {
        PMInstanceState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.a($values);
        Companion = new a(null);
    }

    private PMInstanceState(String str, int i, int i2) {
        this.state = i2;
    }

    public static kotlin.enums.a<PMInstanceState> getEntries() {
        return $ENTRIES;
    }

    public static PMInstanceState valueOf(String str) {
        return (PMInstanceState) Enum.valueOf(PMInstanceState.class, str);
    }

    public static PMInstanceState[] values() {
        return (PMInstanceState[]) $VALUES.clone();
    }

    public final int getState() {
        return this.state;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/PMInstanceState$Companion;", "", "<init>", "()V", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(1070951746);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }
}
