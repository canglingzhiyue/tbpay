package com.taobao.android.diagnose.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.logger.EventLogger;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class AbnormalInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ANR = 3;
    public static final int TYPE_BIZ_ERROR = 4;
    public static final int TYPE_CUSTOM_ERROR = 6;
    public static final int TYPE_FEEDBACK = 5;
    public static final int TYPE_H5_WHITE_PAGE = 9;
    public static final int TYPE_JAVA_CRASH = 1;
    public static final int TYPE_LAG = 11;
    public static final int TYPE_MEM_EXHAUST = 14;
    public static final int TYPE_MTOP_ERROR = 12;
    public static final int TYPE_MTOP_TIME = 13;
    public static final int TYPE_NATIVE_CRASH = 2;
    public static final int TYPE_NATIVE_WHITE_PAGE = 10;
    public static final int TYPE_WEEX_WHITE_PAGE = 15;
    public int type;
    public long ts = System.currentTimeMillis();
    public Map<String, String> info = new HashMap();

    static {
        kge.a(1252541338);
    }

    public AbnormalInfo(int i) {
        this.type = i;
    }

    public AbnormalInfo addInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbnormalInfo) ipChange.ipc$dispatch("f33afe1", new Object[]{this, str, str2});
        }
        this.info.put(str, str2);
        return this;
    }

    public AbnormalInfo addInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbnormalInfo) ipChange.ipc$dispatch("47b9e7c", new Object[]{this, map});
        }
        if (map != null) {
            this.info.putAll(map);
        }
        return this;
    }

    public void writeToLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8471b1", new Object[]{this});
        } else {
            EventLogger.builder(5).setData("type", String.valueOf(this.type)).setData("ts", String.valueOf(this.ts)).setData(this.info).log();
        }
    }
}
