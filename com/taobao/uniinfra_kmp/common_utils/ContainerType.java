package com.taobao.uniinfra_kmp.common_utils;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/taobao/uniinfra_kmp/common_utils/ContainerType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "KSerial", "KParallel", "common_utils_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ContainerType extends Enum<ContainerType> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ ContainerType[] $VALUES;
    private final int value;
    public static final ContainerType KSerial = new ContainerType("KSerial", 0, 0);
    public static final ContainerType KParallel = new ContainerType("KParallel", 1, 1);

    private static final /* synthetic */ ContainerType[] $values() {
        return new ContainerType[]{KSerial, KParallel};
    }

    static {
        ContainerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.a($values);
    }

    private ContainerType(String str, int i, int i2) {
        this.value = i2;
    }

    public static kotlin.enums.a<ContainerType> getEntries() {
        return $ENTRIES;
    }

    public static ContainerType valueOf(String str) {
        return (ContainerType) Enum.valueOf(ContainerType.class, str);
    }

    public static ContainerType[] values() {
        return (ContainerType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
