package anetwork.channel.monitor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface NetworkQualityLevel {
    public static final int EXCELLENT = 3;
    public static final int NORMAL = 2;
    public static final int POOR = 1;
    public static final int UNDETECTED = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Definition {
    }
}
