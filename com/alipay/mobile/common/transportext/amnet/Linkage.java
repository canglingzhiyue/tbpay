package com.alipay.mobile.common.transportext.amnet;

import com.alipay.mobile.common.transportext.amnet.Initialization;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface Linkage {

    /* loaded from: classes3.dex */
    public static class Cmd {
        public int type = -1;
        public byte[] data = null;
    }

    /* loaded from: classes3.dex */
    public static class Keeping {
        public int interval;
        public double rtt;
        public int sReal;
        public long stamp;
    }

    /* loaded from: classes3.dex */
    public static class Separating {
        public int cntHb;
        public int cntRetrench;
        public int codeErr;
        public boolean fast;
        public String infErr;
        public Keeping[] infHb;
        public double msFirst;
        public double msLife;
        public double msSsl;
        public boolean standard;
        public boolean ticket;
        public boolean yesSsl = false;
        public boolean yesErr = false;
        public int qoeMin = -1;
        public int qoeMax = -1;
        public String mtag = "";
        public String extMsg = "";
        public boolean isUseBifrost = false;
        public boolean isUseHttp2 = false;
        public int channelSelect = -1;
    }

    /* loaded from: classes3.dex */
    public static class Touching {
        public int cntAttempt;
        public boolean foreground;
        public String group;
        public String ipLocal;
        public String ipRemote;
        public String ipServer;
        public double msAttempt;
        public double msDns;
        public double msTcp;
        public String netname;
        public String network;
        public String portLocal;
        public String portRemote;
        public String portServer;
        public boolean proxy;
        public boolean yesLnk = false;
        public boolean freqConn = false;
        public int reason = 0;
        public long cid = 0;
        public boolean isUseBifrost = false;
        public boolean isUseHttp2 = false;
        public int channelSelect = -1;
    }

    boolean cancelAlarmTimer(int i);

    void change(int i);

    void collect(Map<Byte, Map<String, String>> map);

    void command(List<Cmd> list);

    void command(byte[] bArr);

    void establish();

    void eventTracking(String str, String str2, Map<String, String> map);

    void gather(Map<Byte, byte[]> map);

    void gift(String str, String str2);

    void initRsp(Initialization.RspInit rspInit);

    void keep(Touching touching, Keeping[] keepingArr, int i);

    String[] network();

    void panic(int i, String str);

    void reactivate();

    void report(String str, double d);

    void reportPerfinfo(Map<String, String> map);

    void resendSessionid();

    void restrict(int i, String str);

    void retrench(Touching touching);

    void separate(Touching touching, Separating separating);

    void sorry(long j, int i, String str, Map<String, String> map);

    boolean startAlarmTimer(int i, long j);

    void touch(Touching touching);
}
