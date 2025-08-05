package anet.channel.detect;

/* loaded from: classes.dex */
public interface IRTTDetector {

    /* loaded from: classes2.dex */
    public interface TYPE {
        public static final int CONNECT = 1;
        public static final int PING = 3;
        public static final int REQUEST = 2;
    }

    long getRTT(String str);

    void recordRTT(String str, int i, long j);
}
