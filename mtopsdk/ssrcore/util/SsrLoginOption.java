package mtopsdk.ssrcore.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes9.dex */
public interface SsrLoginOption {
    public static final String NONE = "none";
    public static final String SILENT = "silent";
    public static final String SILENT_UI = "silent-ui";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface Definition {
    }
}
