package com.taobao.android.diagnose.config;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;
import tb.kge;

/* loaded from: classes.dex */
public class RuntimeMonitorConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int memCheckSample = 0;
    public int memExhaustLevel = 95;
    public int checkInterval = 200;
    @JSONField(deserialize = false, serialize = false)
    private final int memCheckRandomSample = new Random().nextInt(10000);
    public int exhaustCount = 4;

    static {
        kge.a(1761491347);
    }

    public boolean isCheckExhaustEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f039efa", new Object[]{this})).booleanValue() : this.memCheckSample >= this.memCheckRandomSample;
    }
}
