package com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg;

import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.kge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizTag;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "TaoBao", "TMall", "YouKu", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenArchPMBizTag extends Enum<OpenArchPMBizTag> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ OpenArchPMBizTag[] $VALUES;
    public static final a Companion;
    private final String code;
    public static final OpenArchPMBizTag TaoBao = new OpenArchPMBizTag("TaoBao", 0, "tb");
    public static final OpenArchPMBizTag TMall = new OpenArchPMBizTag("TMall", 1, "tm");
    public static final OpenArchPMBizTag YouKu = new OpenArchPMBizTag("YouKu", 2, "YouKu");

    private static final /* synthetic */ OpenArchPMBizTag[] $values() {
        return new OpenArchPMBizTag[]{TaoBao, TMall, YouKu};
    }

    static {
        OpenArchPMBizTag[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.a($values);
        Companion = new a(null);
    }

    private OpenArchPMBizTag(String str, int i, String str2) {
        this.code = str2;
    }

    public static kotlin.enums.a<OpenArchPMBizTag> getEntries() {
        return $ENTRIES;
    }

    public static OpenArchPMBizTag valueOf(String str) {
        return (OpenArchPMBizTag) Enum.valueOf(OpenArchPMBizTag.class, str);
    }

    public static OpenArchPMBizTag[] values() {
        return (OpenArchPMBizTag[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizTag$Companion;", "", "<init>", "()V", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(1283707569);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }
}
