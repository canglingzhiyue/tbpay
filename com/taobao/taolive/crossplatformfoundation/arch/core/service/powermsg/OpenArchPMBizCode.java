package com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg;

import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.kge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizCode;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "DefaultBizCode", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenArchPMBizCode extends Enum<OpenArchPMBizCode> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ OpenArchPMBizCode[] $VALUES;
    public static final a Companion;
    public static final OpenArchPMBizCode DefaultBizCode = new OpenArchPMBizCode("DefaultBizCode", 0, 1);
    private final int code;

    private static final /* synthetic */ OpenArchPMBizCode[] $values() {
        return new OpenArchPMBizCode[]{DefaultBizCode};
    }

    static {
        OpenArchPMBizCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.a($values);
        Companion = new a(null);
    }

    private OpenArchPMBizCode(String str, int i, int i2) {
        this.code = i2;
    }

    public static kotlin.enums.a<OpenArchPMBizCode> getEntries() {
        return $ENTRIES;
    }

    public static OpenArchPMBizCode valueOf(String str) {
        return (OpenArchPMBizCode) Enum.valueOf(OpenArchPMBizCode.class, str);
    }

    public static OpenArchPMBizCode[] values() {
        return (OpenArchPMBizCode[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizCode$Companion;", "", "<init>", "()V", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(1068400262);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }
}
