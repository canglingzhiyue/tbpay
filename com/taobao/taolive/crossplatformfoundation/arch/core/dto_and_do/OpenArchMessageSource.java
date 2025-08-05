package com.taobao.taolive.crossplatformfoundation.arch.core.dto_and_do;

import com.taobao.android.weex_framework.util.a;
import kotlin.Metadata;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/OpenArchMessageSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", a.ATOM_EXT_Undefined, "CDN", "PM", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenArchMessageSource extends Enum<OpenArchMessageSource> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ OpenArchMessageSource[] $VALUES;
    private final String value;
    public static final OpenArchMessageSource Undefined = new OpenArchMessageSource(a.ATOM_EXT_Undefined, 0, a.ATOM_EXT_Undefined);
    public static final OpenArchMessageSource CDN = new OpenArchMessageSource("CDN", 1, "CDN");
    public static final OpenArchMessageSource PM = new OpenArchMessageSource("PM", 2, "PM");

    private static final /* synthetic */ OpenArchMessageSource[] $values() {
        return new OpenArchMessageSource[]{Undefined, CDN, PM};
    }

    static {
        OpenArchMessageSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OpenArchMessageSource(String str, int i, String str2) {
        this.value = str2;
    }

    public static kotlin.enums.a<OpenArchMessageSource> getEntries() {
        return $ENTRIES;
    }

    public static OpenArchMessageSource valueOf(String str) {
        return (OpenArchMessageSource) Enum.valueOf(OpenArchMessageSource.class, str);
    }

    public static OpenArchMessageSource[] values() {
        return (OpenArchMessageSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
