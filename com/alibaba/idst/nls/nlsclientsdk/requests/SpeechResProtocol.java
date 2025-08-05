package com.alibaba.idst.nls.nlsclientsdk.requests;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class SpeechResProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> header = new HashMap();
    public Map<String, Object> payload = new HashMap();

    static {
        kge.a(-635078252);
    }

    public String getNameSpace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3e990d94", new Object[]{this}) : (String) this.header.get("namespace");
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : (String) this.header.get("name");
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue() : ((Integer) this.header.get("status")).intValue();
    }

    public String getStatusText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15bcd9e4", new Object[]{this}) : (String) this.header.get(Constant.PROP_STATUS_TEXT);
    }
}
