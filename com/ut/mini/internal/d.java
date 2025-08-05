package com.ut.mini.internal;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import tb.apo;
import tb.kge;

/* loaded from: classes.dex */
public class d implements apo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b = false;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, Integer> f24120a = new HashMap<>();

    static {
        kge.a(-771996089);
        kge.a(-1157353775);
    }

    public d() {
        this.f24120a.put("V", 5);
        this.f24120a.put(TLogTracker.LEVEL_DEBUG, 4);
        this.f24120a.put(TLogTracker.LEVEL_INFO, 3);
        this.f24120a.put("W", 2);
        this.f24120a.put("E", 1);
        this.f24120a.put("L", 0);
    }

    @Override // tb.apo
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.b) {
            return false;
        }
        try {
            return AdapterForTLog.isValid();
        } catch (Throwable unused) {
            this.b = true;
            return false;
        }
    }

    @Override // tb.apo
    public int getLogLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d423990", new Object[]{this})).intValue();
        }
        String logLevel = AdapterForTLog.getLogLevel("Analytics");
        if (this.f24120a.containsKey(logLevel)) {
            try {
                return this.f24120a.get(logLevel).intValue();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // tb.apo
    public void logd(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bebe7bb", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logd(str, str2);
        }
    }

    @Override // tb.apo
    public void logw(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcf18ce", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logw(str, str2);
        }
    }

    @Override // tb.apo
    public void logw(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192407e7", new Object[]{this, str, str2, th});
        } else {
            AdapterForTLog.logw(str, str2, th);
        }
    }

    @Override // tb.apo
    public void logi(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0cbec0", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logi(str, str2);
        }
    }

    @Override // tb.apo
    public void loge(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.loge(str, str2);
        }
    }

    @Override // tb.apo
    public void loge(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc02eb9", new Object[]{this, str, str2, th});
        } else {
            AdapterForTLog.loge(str, str2, th);
        }
    }
}
