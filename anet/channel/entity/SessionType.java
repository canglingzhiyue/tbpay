package anet.channel.entity;

import tb.kge;

/* loaded from: classes.dex */
public final class SessionType {
    public static int ALL;
    public static int LONG_LINK;
    public static int SHORT_LINK;

    static {
        kge.a(1479769987);
        LONG_LINK = 1;
        SHORT_LINK = 2;
        ALL = LONG_LINK | SHORT_LINK;
    }
}
