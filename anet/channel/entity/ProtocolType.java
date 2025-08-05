package anet.channel.entity;

import tb.kge;

/* loaded from: classes.dex */
public final class ProtocolType {
    public static int ALL;
    public static int TCP;
    public static int UDP;

    static {
        kge.a(-514464833);
        TCP = 1;
        UDP = 2;
        ALL = TCP | UDP;
    }
}
