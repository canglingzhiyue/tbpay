package mtopsdk.framework.domain;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes9.dex */
public interface FilterResult {
    public static final String CONTINUE = "CONTINUE";
    public static final String STOP = "STOP";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface Definition {
    }
}
