package com.taobao.uniinfra_kmp.common_utils.app;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.o;
import tb.kge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/taobao/uniinfra_kmp/common_utils/app/EnvType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "ONLINE", "PRE", "DAILY", "Companion", "common_utils_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EnvType extends Enum<EnvType> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ EnvType[] $VALUES;
    public static final a Companion;
    public static final EnvType ONLINE = new EnvType("ONLINE", 0, 0);
    public static final EnvType PRE = new EnvType("PRE", 1, 1);
    public static final EnvType DAILY = new EnvType("DAILY", 2, 2);

    private static final /* synthetic */ EnvType[] $values() {
        return new EnvType[]{ONLINE, PRE, DAILY};
    }

    static {
        EnvType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        Companion = new a(null);
    }

    private EnvType(String str, int i, int i2) {
    }

    public static kotlin.enums.a<EnvType> getEntries() {
        return $ENTRIES;
    }

    public static EnvType valueOf(String str) {
        return (EnvType) Enum.valueOf(EnvType.class, str);
    }

    public static EnvType[] values() {
        return (EnvType[]) $VALUES.clone();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/taobao/uniinfra_kmp/common_utils/app/EnvType$Companion;", "", "<init>", "()V", "envFromValue", "Lcom/taobao/uniinfra_kmp/common_utils/app/EnvType;", "value", "", "common_utils_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-109279588);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }
}
