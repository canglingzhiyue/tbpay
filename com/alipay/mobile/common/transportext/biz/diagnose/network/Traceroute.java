package com.alipay.mobile.common.transportext.biz.diagnose.network;

/* loaded from: classes3.dex */
public class Traceroute {
    public static final int PINGROUTE = 3;
    public static final int PINGROUTE_THRESHOLD = 4;
    public static final int PING_ONLY = 1;
    public static final int TRACEROUTE_ONLY = 2;

    /* loaded from: classes3.dex */
    public static class PingInf {
        public String domain = "www.taobao.com";
        public int waiting = 5;
        public int trying = 1;
        public int count = 1;
        public int type = 1;
        public int threshold = 1000;
        public int timeoutNum = 6;
    }
}
