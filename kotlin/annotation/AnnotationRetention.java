package kotlin.annotation;

import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/annotation/AnnotationRetention;", "", "(Ljava/lang/String;I)V", "SOURCE", "BINARY", WXExceptionConfig.KEY_JS_RUNTIME, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AnnotationRetention extends Enum<AnnotationRetention> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AnnotationRetention[] $VALUES;
    public static final AnnotationRetention SOURCE = new AnnotationRetention("SOURCE", 0);
    public static final AnnotationRetention BINARY = new AnnotationRetention("BINARY", 1);
    public static final AnnotationRetention RUNTIME = new AnnotationRetention(WXExceptionConfig.KEY_JS_RUNTIME, 2);

    private static final /* synthetic */ AnnotationRetention[] $values() {
        return new AnnotationRetention[]{SOURCE, BINARY, RUNTIME};
    }

    static {
        AnnotationRetention[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AnnotationRetention(String str, int i) {
    }

    public static a<AnnotationRetention> getEntries() {
        return $ENTRIES;
    }

    public static AnnotationRetention valueOf(String str) {
        return (AnnotationRetention) Enum.valueOf(AnnotationRetention.class, str);
    }

    public static AnnotationRetention[] values() {
        return (AnnotationRetention[]) $VALUES.clone();
    }
}
