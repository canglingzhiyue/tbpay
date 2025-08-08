package com.taobao.tao.log;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, LogLevel> f20686a;
    private LogLevel b;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final e f20687a;

        static {
            kge.a(-1692003190);
            f20687a = new e();
        }

        public static /* synthetic */ e a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("79355303", new Object[0]) : f20687a;
        }
    }

    static {
        kge.a(431143351);
        kge.a(2019882058);
    }

    private e() {
        this.b = LogLevel.E;
        this.f20686a = new ConcurrentHashMap();
    }

    public static final e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("79355303", new Object[0]) : a.a();
    }

    public void a(Map<String, LogLevel> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map != null && map.size() > 0) {
            for (String str : map.keySet()) {
                a().a(str, map.get(str));
            }
        }
    }

    public void a(String str, LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a15dac4", new Object[]{this, str, logLevel});
        } else if (str == null) {
        } else {
            TLog.loge("TLogController", "", String.format("addModuleFilter: %s-%s", str, logLevel.getName()));
            this.f20686a.put(str, logLevel);
            if (f.a().d() != 2 || !TLogNative.isSoOpen()) {
                return;
            }
            try {
                TLogNative.addModuleFilter(str, logLevel.getIndex());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f20686a.clear();
        TLog.loge("TLogController", "", String.format("cleanModuleFilter", new Object[0]));
    }

    public void a(LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fefee4e", new Object[]{this, logLevel});
            return;
        }
        this.b = logLevel;
        if (f.a().d() != 2 || !TLogNative.isSoOpen()) {
            return;
        }
        try {
            TLogNative.setLogLevel(logLevel.getIndex());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (f.a().d() != 2 || !TLogNative.isSoOpen()) {
        } else {
            try {
                TLogNative.setLogLevel(LogLevel.L.getIndex());
                TLogNative.appenderClose();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void b(LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0fb26d", new Object[]{this, logLevel});
        } else {
            this.b = logLevel;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f20686a == null || this.b == null || !TLogNative.isSoOpen()) {
        } else {
            try {
                TLogNative.setLogLevel(this.b.getIndex());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public LogLevel a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogLevel) ipChange.ipc$dispatch("59515f18", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return this.b;
        }
        LogLevel logLevel = this.f20686a.get(str);
        return logLevel == null ? this.b : logLevel;
    }
}
