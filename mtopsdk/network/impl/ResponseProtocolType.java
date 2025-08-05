package mtopsdk.network.impl;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes9.dex */
public interface ResponseProtocolType {
    public static final String COMMENT = ": ";
    public static final String DATA = "data: ";
    public static final String EVENT = "event: ";
    public static final String ID = "id: ";
    public static final String RETRY = "retry: ";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface Definition {
    }
}
