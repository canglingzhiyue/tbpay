package com.alipay.mobile.security.bio.common.statistics;

import android.content.Context;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class StatisticsProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static StatisticsProcessor f5776a;
    private final RecordExtService b;
    private Map<String, String> c;

    public static StatisticsProcessor getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatisticsProcessor) ipChange.ipc$dispatch("6ca98f68", new Object[]{context});
        }
        if (f5776a == null) {
            f5776a = new StatisticsProcessor(context);
        }
        return f5776a;
    }

    private StatisticsProcessor(Context context) {
        if (BioServiceManager.getCurrentInstance() != null) {
            this.b = (RecordExtService) BioServiceManager.getCurrentInstance().getBioService(RecordExtService.class);
        } else {
            this.b = null;
        }
    }

    public void init(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{this, str});
            return;
        }
        RecordExtService recordExtService = this.b;
        if (recordExtService == null) {
            return;
        }
        recordExtService.setUniqueID(str);
    }

    public void setGlobalMap(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3396a47", new Object[]{this, map});
            return;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        this.c.putAll(map);
    }

    public void write(RecordExtAction recordExtAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed67997", new Object[]{this, recordExtAction});
            return;
        }
        RecordExtService recordExtService = this.b;
        if (recordExtService == null) {
            return;
        }
        Map<String, String> map = this.c;
        if (map != null) {
            recordExtService.write(recordExtAction, map);
        } else {
            recordExtService.write(recordExtAction);
        }
    }

    public void writeWithKey(RecordExtAction recordExtAction, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81534466", new Object[]{this, recordExtAction, str, str2});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(str, str2);
            Map<String, String> map = this.c;
            if (map != null) {
                hashMap.putAll(map);
            }
            this.b.write(recordExtAction, hashMap);
        }
    }

    public void writeWithMap(RecordExtAction recordExtAction, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1792e16", new Object[]{this, recordExtAction, map});
        } else if (this.b == null) {
        } else {
            Map<String, String> map2 = this.c;
            if (map2 != null && map != null) {
                map.putAll(map2);
            }
            this.b.write(recordExtAction, map);
        }
    }

    public void writeWithKeys(RecordExtAction recordExtAction, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd1e239", new Object[]{this, recordExtAction, str, str2, str3, str4});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(str, str2);
            hashMap.put(str3, str4);
            Map<String, String> map = this.c;
            if (map != null) {
                hashMap.putAll(map);
            }
            this.b.write(recordExtAction, hashMap);
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else if (f5776a == null) {
        } else {
            f5776a = null;
        }
    }
}
