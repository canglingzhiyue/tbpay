package com.taobao.taolive.crossplatformfoundation.arch.core.definition;

import com.taobao.android.weex_framework.util.a;
import kotlin.Metadata;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/definition/OpenArchEventCategory;", "", "<init>", "(Ljava/lang/String;I)V", a.ATOM_EXT_Undefined, "MessageService", "PlayControlService", "OpenArch", "Interactive", "Domain", "Watch", "Field", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenArchEventCategory extends Enum<OpenArchEventCategory> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ OpenArchEventCategory[] $VALUES;
    public static final OpenArchEventCategory Undefined = new OpenArchEventCategory(a.ATOM_EXT_Undefined, 0);
    public static final OpenArchEventCategory MessageService = new OpenArchEventCategory("MessageService", 1);
    public static final OpenArchEventCategory PlayControlService = new OpenArchEventCategory("PlayControlService", 2);
    public static final OpenArchEventCategory OpenArch = new OpenArchEventCategory("OpenArch", 3);
    public static final OpenArchEventCategory Interactive = new OpenArchEventCategory("Interactive", 4);
    public static final OpenArchEventCategory Domain = new OpenArchEventCategory("Domain", 5);
    public static final OpenArchEventCategory Watch = new OpenArchEventCategory("Watch", 6);
    public static final OpenArchEventCategory Field = new OpenArchEventCategory("Field", 7);

    private static final /* synthetic */ OpenArchEventCategory[] $values() {
        return new OpenArchEventCategory[]{Undefined, MessageService, PlayControlService, OpenArch, Interactive, Domain, Watch, Field};
    }

    static {
        OpenArchEventCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OpenArchEventCategory(String str, int i) {
    }

    public static kotlin.enums.a<OpenArchEventCategory> getEntries() {
        return $ENTRIES;
    }

    public static OpenArchEventCategory valueOf(String str) {
        return (OpenArchEventCategory) Enum.valueOf(OpenArchEventCategory.class, str);
    }

    public static OpenArchEventCategory[] values() {
        return (OpenArchEventCategory[]) $VALUES.clone();
    }
}
