package com.alipay.mobile.common.transportext.biz.diagnose.network;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SpeedTestPingData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int seq = -1;
    public String ip = null;
    public int ttl = 0;
    public float time = 0.0f;
    public String data = null;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(this.seq);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(";");
        String str2 = this.ip;
        if (str2 != null) {
            str = str2;
        }
        sb3.append(str);
        return (sb3.toString() + ";" + this.ttl) + ";" + this.time;
    }
}
