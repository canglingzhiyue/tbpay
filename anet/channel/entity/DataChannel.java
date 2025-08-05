package anet.channel.entity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public interface DataChannel {
    public static final int RELIABLE = 1;
    public static final int UNRELIABLE = 2;

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface Definition {
    }
}
