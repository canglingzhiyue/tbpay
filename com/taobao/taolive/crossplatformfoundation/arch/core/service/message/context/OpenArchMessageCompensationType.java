package com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context;

import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.fdf;
import tb.kge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/OpenArchMessageCompensationType;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "Unknown", "Goods", fdf.TAG, "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenArchMessageCompensationType extends Enum<OpenArchMessageCompensationType> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ OpenArchMessageCompensationType[] $VALUES;
    public static final a Companion;
    private final int code;
    public static final OpenArchMessageCompensationType Unknown = new OpenArchMessageCompensationType("Unknown", 0, 0);
    public static final OpenArchMessageCompensationType Goods = new OpenArchMessageCompensationType("Goods", 1, 1);
    public static final OpenArchMessageCompensationType Comment = new OpenArchMessageCompensationType(fdf.TAG, 2, 2);

    private static final /* synthetic */ OpenArchMessageCompensationType[] $values() {
        return new OpenArchMessageCompensationType[]{Unknown, Goods, Comment};
    }

    static {
        OpenArchMessageCompensationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.a($values);
        Companion = new a(null);
    }

    private OpenArchMessageCompensationType(String str, int i, int i2) {
        this.code = i2;
    }

    public static kotlin.enums.a<OpenArchMessageCompensationType> getEntries() {
        return $ENTRIES;
    }

    public static OpenArchMessageCompensationType valueOf(String str) {
        return (OpenArchMessageCompensationType) Enum.valueOf(OpenArchMessageCompensationType.class, str);
    }

    public static OpenArchMessageCompensationType[] values() {
        return (OpenArchMessageCompensationType[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/OpenArchMessageCompensationType$Companion;", "", "<init>", "()V", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1607023219);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }
}
