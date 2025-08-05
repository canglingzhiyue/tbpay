package anet.channel.assist;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public interface ISocketBoostCapability extends ICapability {

    /* loaded from: classes2.dex */
    public interface Priority {
        public static final int HIGH = 0;
        public static final int LOW = 2;
        public static final int MID = 1;

        @Retention(RetentionPolicy.CLASS)
        /* loaded from: classes2.dex */
        public @interface Definition {
        }
    }

    /* loaded from: classes2.dex */
    public interface Protocol {
        public static final int TCP = 0;
        public static final int UDP = 1;

        @Retention(RetentionPolicy.CLASS)
        /* loaded from: classes2.dex */
        public @interface Definition {
        }
    }

    void clear(String str, int i, int i2);

    void set(String str, int i, int i2, int i3);
}
