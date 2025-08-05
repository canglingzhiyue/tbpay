package anet.channel.assist;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface ICapability {
    public static final int DUAL_WIFI = 2;
    public static final int SOCKET_BOOST = 1;
    public static final int SYSTEM_NETWORK = 3;

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface Definition {
    }

    boolean isEnable();
}
