package com.alipay.mobile.common.transportext.biz.diagnose.network;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SpeedTestLinkData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String ip = null;
    public int port = -1;
    public String result = "n";
    public String describe = null;
    public String channel = null;
    public float connTime = 0.0f;
    public float sslTime = 0.0f;
    public float rtt = 0.0f;
    public int errCode = -2;
    public String data = null;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str = this.ip;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str + ";" + this.port);
        sb.append(";");
        String str3 = this.result;
        if (str3 == null) {
            str3 = "n";
        }
        sb.append(str3);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(";");
        String str4 = this.describe;
        if (str4 == null) {
            str4 = "-";
        }
        sb3.append(str4);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append(";");
        String str5 = this.channel;
        if (str5 != null) {
            str2 = str5;
        }
        sb5.append(str2);
        return (((sb5.toString() + ";" + this.connTime) + ";" + this.sslTime) + ";" + this.rtt) + ";" + this.errCode;
    }
}
