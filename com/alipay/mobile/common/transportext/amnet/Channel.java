package com.alipay.mobile.common.transportext.amnet;

import java.util.Map;

/* loaded from: classes3.dex */
public interface Channel {

    /* loaded from: classes3.dex */
    public static class Obtaining {
        public byte[] body;
        public byte channel;
        public long cid;
        public Map<String, String> header;
        public int lenPkg;
        public int lenRaw;
        public double msAir;
        public double msAmnetAllTime;
        public double msCall;
        public double msCaller;
        public double msCalling;
        public double msConfirm;
        public double msEncode;
        public double msHung;
        public double msNtIO;
        public double msPassFromNative;
        public double msPassToNative;
        public double msQueueOut;
        public double msRead;
        public double msSend;
        public boolean oneshot;
        public long receipt;
        public boolean retried;
        public String targetHostShort;
        public boolean useshort;
        public int reqZipType = -1;
        public int rspZipType = -1;
        public String mtag = "";
        public String msQueneStorage = "";
        public String targetHost = "";
        public int qoeCur = -1;
        public boolean flexible = false;
        public boolean isUseBifrost = false;
        public boolean isUseHttp2 = false;
        public int ipStack = -1;
    }

    long earnest(Map<String, String> map, byte[] bArr);

    void obtain(Obtaining obtaining);

    void recycle(Map<String, String> map, byte[] bArr);

    void tell(long j, int i, int i2);

    String tracer(Map<String, String> map, byte[] bArr);
}
