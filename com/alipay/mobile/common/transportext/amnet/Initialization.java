package com.alipay.mobile.common.transportext.amnet;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class Initialization {
    public static final String KEY_USER_ID = "userId";

    /* loaded from: classes3.dex */
    public static class RspInit implements Serializable {
        public int status = -1;
        public int reconn = 60;
        public long origin = -1;
        public boolean ncrmnt = false;
        public boolean makeup = false;
        public String expand = null;
        public String device = null;
        public String mtag = "";
        public boolean notifyLoginOut = true;
        public String clientIp = "";
        public String dictId = null;
    }
}
