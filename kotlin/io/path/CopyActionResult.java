package kotlin.io.path;

import kotlin.Metadata;
import mtopsdk.framework.domain.FilterResult;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/path/CopyActionResult;", "", "(Ljava/lang/String;I)V", FilterResult.CONTINUE, "SKIP_SUBTREE", "TERMINATE", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CopyActionResult extends Enum<CopyActionResult> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ CopyActionResult[] $VALUES;
    public static final CopyActionResult CONTINUE = new CopyActionResult(FilterResult.CONTINUE, 0);
    public static final CopyActionResult SKIP_SUBTREE = new CopyActionResult("SKIP_SUBTREE", 1);
    public static final CopyActionResult TERMINATE = new CopyActionResult("TERMINATE", 2);

    private static final /* synthetic */ CopyActionResult[] $values() {
        return new CopyActionResult[]{CONTINUE, SKIP_SUBTREE, TERMINATE};
    }

    static {
        CopyActionResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.b.a($values);
    }

    private CopyActionResult(String str, int i) {
    }

    public static kotlin.enums.a<CopyActionResult> getEntries() {
        return $ENTRIES;
    }

    public static CopyActionResult valueOf(String str) {
        return (CopyActionResult) Enum.valueOf(CopyActionResult.class, str);
    }

    public static CopyActionResult[] values() {
        return (CopyActionResult[]) $VALUES.clone();
    }
}
