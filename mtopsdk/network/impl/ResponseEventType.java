package mtopsdk.network.impl;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes9.dex */
public interface ResponseEventType {
    public static final String EVENT_RESPONSE = "resp";
    public static final String EVENT_TRAILER = "trailer";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface Definition {
    }
}
