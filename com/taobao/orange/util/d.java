package com.taobao.orange.util;

import mtopsdk.common.util.StringUtils;
import anet.channel.GlobalAppRuntimeInfo;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.mto;
import tb.orq;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "OrangeMonitor";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18601a;
    public static boolean b;
    public static int c;
    private static final AtomicBoolean d;

    static {
        kge.a(-2001664371);
        f18601a = false;
        c = 19997;
        b = false;
        d = new AtomicBoolean(false);
        try {
            Class.forName(OConstant.REFLECT_APPMONITOR);
            f18601a = true;
        } catch (ClassNotFoundException unused) {
            f18601a = false;
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (!f18601a) {
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2, str3);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
        } else if (!f18601a) {
        } else {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4, str5);
        }
    }

    public static void a(String str, String str2, String str3, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bf98b8", new Object[]{str, str2, str3, new Double(d2)});
        } else if (!f18601a) {
        } else {
            AppMonitor.Counter.commit(str, str2, str3, d2);
        }
    }

    public static void a(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a74f550", new Object[]{str, str2, measureSet, dimensionSet, new Boolean(z)});
        } else if (!f18601a) {
        } else {
            AppMonitor.register(str, str2, measureSet, dimensionSet, z);
        }
    }

    public static void a(String str, String str2, DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b92d996", new Object[]{str, str2, dimensionValueSet, measureValueSet});
        } else if (!f18601a) {
        } else {
            AppMonitor.Stat.commit(str, str2, dimensionValueSet, measureValueSet);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!f18601a) {
        } else {
            DimensionSet create = DimensionSet.create();
            create.addDimension("bootType");
            create.addDimension("downgradeType");
            create.addDimension("monitorType");
            create.addDimension("process");
            create.addDimension("processIsolated");
            MeasureSet create2 = MeasureSet.create();
            create2.addMeasure(b("requestCount", 10000.0d));
            create2.addMeasure(b("persistCount", 10000.0d));
            create2.addMeasure(b("restoreCount", 10000.0d));
            create2.addMeasure(b("persistTime", 1000000.0d));
            create2.addMeasure(b("restoreTime", 1000000.0d));
            create2.addMeasure(b("ioTime", 1000000.0d));
            a(OConstant.MONITOR_MODULE, OConstant.POINT_BOOT_PERF, create2, create, false);
            DimensionSet create3 = DimensionSet.create();
            create3.addDimension(OConstant.DIMEN_CONFIG_NAME);
            create3.addDimension("configVersion");
            create3.addDimension(OConstant.DIMEN_CONFIG_CHANGE_VERSION);
            create3.addDimension(OConstant.DIMEN_CONFIG_ENABLE_CHANGE_VERSION);
            create3.addDimension("process");
            create3.addDimension("processIsolated");
            create3.addDimension(OConstant.DIMEN_CONFIG_KEY);
            MeasureSet create4 = MeasureSet.create();
            a(OConstant.MONITOR_MODULE, OConstant.POINT_CONFIG_USE_DETAIL, create4, create3, false);
            create3.addDimension(OConstant.DIMEN_COMMIT_TIME);
            create3.addDimension(OConstant.DIMEN_PROCESS_START_TIME);
            create3.addDimension("isCritical");
            a(OConstant.MONITOR_MODULE, OConstant.POINT_CONFIG_USE, create4, create3, false);
            create3.addDimension(OConstant.DIMEN_IS_COLD_STARTUP);
            create3.addDimension("eagleEyeTraceId");
            create3.addDimension("dataId");
            a(OConstant.MONITOR_MODULE, OConstant.POINT_CONFIG_UPDATE, create4, create3, false);
            DimensionSet create5 = DimensionSet.create();
            create5.addDimension(OConstant.DIMEN_INDEX_UPDATE_APP_INDEX_VERSION);
            create5.addDimension(OConstant.DIMEN_INDEX_UPDATE_BASE_VERSION);
            create5.addDimension(OConstant.DIMEN_INDEX_UPDATE_DIFF_SWITCH);
            create5.addDimension("responseHeader");
            create5.addDimension("process");
            create5.addDimension("processIsolated");
            create5.addDimension(OConstant.DIMEN_COMMIT_TIME);
            a(OConstant.MONITOR_MODULE, OConstant.POINT_DIFF_INDEX_UPDATE, create4, create5, false);
            DimensionSet create6 = DimensionSet.create();
            create6.addDimension(OConstant.DIMEN_CONFIG_NAME);
            create6.addDimension("success");
            create6.addDimension(OConstant.DIMEN_FILE_LOCK);
            create6.addDimension("process");
            create6.addDimension("processIsolated");
            create6.addDimension("type");
            MeasureSet create7 = MeasureSet.create();
            create7.addMeasure("cost");
            a(OConstant.MONITOR_MODULE, OConstant.POINT_FILE_STAT, create7, create6, false);
            DimensionSet create8 = DimensionSet.create();
            create8.addDimension(OConstant.DIMEN_CONFIG_NAME);
            create8.addDimension("process");
            create8.addDimension(OConstant.DIMEN_CONFIG_LOAD_STATUS);
            create8.addDimension(OConstant.DIMEN_CONFIG_HTTP_STATUS);
            create8.addDimension(OConstant.DIMEN_CONFIG_BG);
            a(OConstant.MONITOR_MODULE, OConstant.POINT_CONFIG_LOAD, create4, create8, false);
            DimensionSet create9 = DimensionSet.create();
            create9.addDimension("process");
            create9.addDimension(OConstant.DIMEN_CONFIG_BG);
            MeasureSet create10 = MeasureSet.create();
            create10.addMeasure("bindServiceTime");
            a(OConstant.MONITOR_MODULE, "bind_service", create10, create9, false);
            DimensionSet create11 = DimensionSet.create();
            create11.addDimension("process");
            create11.addDimension(OConstant.DIMEN_CONFIG_NAME);
            a(OConstant.MONITOR_MODULE, OConstant.POINT_CHANNEL_CONFIG_USE, MeasureSet.create(), create11, false);
            DimensionSet create12 = DimensionSet.create();
            create12.addDimension("process");
            create12.addDimension(OConstant.DIMEN_CONFIG_BG);
            create12.addDimension(OConstant.DIMEN_IS_CHANNEL_PROCESS);
            create12.addDimension(OConstant.DIMEN_REPLACE_SERVICE_STATUS);
            create12.addDimension(OConstant.DIMEN_REPLACE_SERVICE_TYPE);
            MeasureSet create13 = MeasureSet.create();
            create13.addMeasure(OConstant.DIMEN_PROCESS_START_TIME);
            create13.addMeasure(OConstant.DIMEN_REPLACE_TO_LOCAL_TIME);
            create13.addMeasure(OConstant.DIMEN_REPLACE_TO_BIND_TIME);
            a(OConstant.MONITOR_MODULE, OConstant.POINT_REPLACE_SERVICE, create13, create12, false);
        }
    }

    public static void a(String str, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81239a4c", new Object[]{str, new Double(d2)});
        } else if (!f18601a || StringUtils.isEmpty(str)) {
        } else {
            DimensionValueSet create = DimensionValueSet.create();
            try {
                create.setValue("process", a.f18598a);
                create.setValue(OConstant.DIMEN_CONFIG_BG, String.valueOf(GlobalAppRuntimeInfo.isAppBackground()));
            } catch (Throwable th) {
                OLog.e(TAG, "commitConfigLoadMonitor", th, new Object[0]);
            }
            MeasureValueSet create2 = MeasureValueSet.create();
            create2.setValue("bindServiceTime", d2);
            a(OConstant.MONITOR_MODULE, str, create, create2);
        }
    }

    public static void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e70f51", new Object[]{eVar});
        } else if (!f18601a) {
        } else {
            DimensionValueSet create = DimensionValueSet.create();
            String str = "1";
            create.setValue("bootType", eVar.f18605a.f18606a ? str : "0");
            create.setValue("downgradeType", String.valueOf(eVar.f18605a.b));
            create.setValue("monitorType", String.valueOf(eVar.f18605a.c));
            create.setValue("process", a.f18598a);
            if (!com.taobao.orange.a.A) {
                str = "0";
            }
            create.setValue("processIsolated", str);
            MeasureValueSet create2 = MeasureValueSet.create();
            create2.setValue("requestCount", eVar.f18605a.d);
            create2.setValue("persistCount", eVar.f18605a.e);
            create2.setValue("restoreCount", eVar.f18605a.f);
            create2.setValue("persistTime", eVar.f18605a.g);
            create2.setValue("restoreTime", eVar.f18605a.h);
            create2.setValue("ioTime", eVar.f18605a.i);
            a(OConstant.MONITOR_MODULE, OConstant.POINT_BOOT_PERF, create, create2);
            OLog.d(TAG, "commit boot stat", eVar.f18605a.toString());
        }
    }

    public static void a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bfeb4e", new Object[]{str, str2, str3, new Boolean(z)});
        } else {
            a(str, str2, str3, z, (String) null);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else {
            a(str, str2, str3, false, str4);
        }
    }

    private static void a(String str, String str2, String str3, boolean z, String str4) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436a1d98", new Object[]{str, str2, str3, new Boolean(z), str4});
        } else if (!f18601a) {
        } else {
            if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
                OLog.e(TAG, "commit error because data empty!", new Object[0]);
                return;
            }
            if (str4 == null) {
                z2 = false;
            }
            DimensionValueSet create = DimensionValueSet.create();
            MeasureValueSet create2 = MeasureValueSet.create();
            create.setValue(OConstant.DIMEN_CONFIG_NAME, str);
            create.setValue("configVersion", str2);
            String str5 = "";
            create.setValue(OConstant.DIMEN_CONFIG_CHANGE_VERSION, str3 == null ? str5 : str3);
            String str6 = "1";
            create.setValue(OConstant.DIMEN_CONFIG_ENABLE_CHANGE_VERSION, str6);
            create.setValue("process", a.f18598a);
            if (!com.taobao.orange.a.A) {
                str6 = "0";
            }
            create.setValue("processIsolated", str6);
            if (z2) {
                create.setValue(OConstant.DIMEN_CONFIG_KEY, str4);
                a(OConstant.MONITOR_MODULE, OConstant.POINT_CONFIG_USE_DETAIL, create, create2);
                return;
            }
            String valueOf = String.valueOf(System.currentTimeMillis() - com.taobao.orange.a.Q);
            create.setValue(OConstant.DIMEN_COMMIT_TIME, valueOf);
            String l = Long.toString(a.b() - com.taobao.orange.a.Q);
            create.setValue(OConstant.DIMEN_PROCESS_START_TIME, l);
            create.setValue("isCritical", Boolean.toString(z));
            a(OConstant.MONITOR_MODULE, OConstant.POINT_CONFIG_USE, create, create2);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(OConstant.DIMEN_CONFIG_NAME, str);
                hashMap.put("configVersion", str2);
                if (str3 != null) {
                    str5 = str3;
                }
                hashMap.put(OConstant.DIMEN_CONFIG_CHANGE_VERSION, str5);
                hashMap.put("process", a.f18598a);
                hashMap.put(OConstant.DIMEN_COMMIT_TIME, valueOf);
                hashMap.put("isCritical", Boolean.toString(z));
                hashMap.put(OConstant.DIMEN_PROCESS_START_TIME, l);
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Orange_UT", c, OConstant.POINT_CONFIG_USE, "arg2", "arg3", hashMap).build());
            } catch (Exception unused) {
            }
        }
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
        } else {
            a(str, str2, str3, (Boolean) null, (String) null, (String) null);
        }
    }

    public static void a(String str, String str2, String str3, Boolean bool, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaeca351", new Object[]{str, str2, str3, bool, str4});
        } else {
            a(str, str2, str3, bool, str4, (String) null);
        }
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb13311", new Object[]{str, str2, str3, str4});
        } else {
            a(str, str2, str3, (Boolean) null, (String) null, str4);
        }
    }

    private static void a(String str, String str2, String str3, Boolean bool, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d7fadb", new Object[]{str, str2, str3, bool, str4, str5});
        } else if (!f18601a) {
        } else {
            if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
                OLog.e(TAG, "commit error because data empty!", new Object[0]);
                return;
            }
            final DimensionValueSet create = DimensionValueSet.create();
            create.setValue(OConstant.DIMEN_CONFIG_NAME, str);
            create.setValue("configVersion", str2);
            create.setValue(OConstant.DIMEN_CONFIG_CHANGE_VERSION, str3 == null ? "" : str3);
            String str6 = "1";
            create.setValue(OConstant.DIMEN_CONFIG_ENABLE_CHANGE_VERSION, str6);
            create.setValue("process", a.f18598a);
            if (!com.taobao.orange.a.A) {
                str6 = "0";
            }
            create.setValue("processIsolated", str6);
            String valueOf = String.valueOf(System.currentTimeMillis() - com.taobao.orange.a.Q);
            create.setValue(OConstant.DIMEN_COMMIT_TIME, valueOf);
            String l = Long.toString(a.b() - com.taobao.orange.a.Q);
            create.setValue(OConstant.DIMEN_PROCESS_START_TIME, l);
            create.setValue(OConstant.DIMEN_IS_COLD_STARTUP, bool == null ? "" : bool.toString());
            create.setValue("eagleEyeTraceId", str4 == null ? "" : str4);
            create.setValue("dataId", str5 == null ? "" : str5);
            final MeasureValueSet create2 = MeasureValueSet.create();
            final HashMap hashMap = new HashMap();
            hashMap.put(OConstant.DIMEN_CONFIG_NAME, str);
            hashMap.put("configVersion", str2);
            hashMap.put(OConstant.DIMEN_CONFIG_CHANGE_VERSION, str3 == null ? "" : str3);
            hashMap.put("process", a.f18598a);
            hashMap.put(OConstant.DIMEN_COMMIT_TIME, valueOf);
            hashMap.put(OConstant.DIMEN_PROCESS_START_TIME, l);
            hashMap.put(OConstant.DIMEN_IS_COLD_STARTUP, bool == null ? "" : bool.toString());
            hashMap.put("eagleEyeTraceId", str4 == null ? "" : str4);
            hashMap.put("dataId", str5 == null ? "" : str5);
            com.taobao.orange.e.a(new Runnable() { // from class: com.taobao.orange.util.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        d.a(OConstant.MONITOR_MODULE, OConstant.POINT_CONFIG_UPDATE, DimensionValueSet.this, create2);
                        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Orange_UT", d.c, OConstant.POINT_CONFIG_UPDATE, "arg2", "arg3", hashMap).build());
                    } catch (Exception unused) {
                    }
                }
            }, (bool == null || !bool.booleanValue()) ? 0L : orq.FRAME_CHECK_TIMEOUT);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        String valueOf = String.valueOf(System.currentTimeMillis() - com.taobao.orange.a.Q);
        HashMap hashMap = new HashMap();
        hashMap.put(OConstant.DIMEN_CONFIG_NAME, str);
        hashMap.put("process", a.f18598a);
        hashMap.put(OConstant.DIMEN_COMMIT_TIME, valueOf);
        hashMap.put(OConstant.DIMEN_PROCESS_START_TIME, Long.toString(a.b() - com.taobao.orange.a.Q));
        hashMap.put("isMainProcess", com.taobao.orange.a.b ? "1" : "0");
        final UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder("Orange_UT", c, "config_not_get", "arg2", "arg3", hashMap);
        com.taobao.orange.e.a(new Runnable() { // from class: com.taobao.orange.util.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    UTAnalytics.getInstance().getDefaultTracker().send(UTOriginalCustomHitBuilder.this.build());
                } catch (Exception e) {
                    OLog.e(d.TAG, "UTAnalytics send error.", e, new Object[0]);
                }
            }
        }, orq.FRAME_CHECK_TIMEOUT);
    }

    public static void a(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bfab7d", new Object[]{str, str2, str3, new Integer(i)});
        } else if (!f18601a || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
        } else {
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue(OConstant.DIMEN_CONFIG_NAME, str2);
            create.setValue("process", a.f18598a);
            create.setValue(OConstant.DIMEN_CONFIG_LOAD_STATUS, str3);
            create.setValue(OConstant.DIMEN_CONFIG_HTTP_STATUS, String.valueOf(i));
            try {
                create.setValue(OConstant.DIMEN_CONFIG_BG, String.valueOf(GlobalAppRuntimeInfo.isAppBackground()));
            } catch (Throwable th) {
                OLog.e(TAG, "commitConfigLoadMonitor", th, new Object[0]);
            }
            a(OConstant.MONITOR_MODULE, str, create, MeasureValueSet.create());
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!f18601a || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue(OConstant.DIMEN_CONFIG_NAME, str2);
            create.setValue("process", a.f18598a);
            a(OConstant.MONITOR_MODULE, str, create, MeasureValueSet.create());
        }
    }

    public static void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40669c8", new Object[]{str, str2, str3});
        } else if (!f18601a) {
        } else {
            String valueOf = String.valueOf(System.currentTimeMillis() - com.taobao.orange.a.Q);
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue(OConstant.DIMEN_INDEX_UPDATE_APP_INDEX_VERSION, str);
            create.setValue(OConstant.DIMEN_INDEX_UPDATE_BASE_VERSION, str2);
            create.setValue(OConstant.DIMEN_INDEX_UPDATE_DIFF_SWITCH, String.valueOf(com.taobao.orange.a.y));
            create.setValue("responseHeader", str3);
            create.setValue("process", a.f18598a);
            create.setValue("processIsolated", com.taobao.orange.a.A ? "1" : "0");
            create.setValue(OConstant.DIMEN_COMMIT_TIME, valueOf);
            a(OConstant.MONITOR_MODULE, OConstant.POINT_DIFF_INDEX_UPDATE, create, MeasureValueSet.create());
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(OConstant.DIMEN_INDEX_UPDATE_APP_INDEX_VERSION, str);
                hashMap.put(OConstant.DIMEN_INDEX_UPDATE_BASE_VERSION, str2);
                hashMap.put(OConstant.DIMEN_INDEX_UPDATE_DIFF_SWITCH, String.valueOf(com.taobao.orange.a.y));
                hashMap.put("responseHeader", str3);
                hashMap.put("process", a.f18598a);
                hashMap.put(OConstant.DIMEN_COMMIT_TIME, valueOf);
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Orange_UT", c, OConstant.POINT_DIFF_INDEX_UPDATE, "arg2", "arg3", hashMap).build());
            } catch (Exception unused) {
            }
        }
    }

    public static void a(String str, boolean z, boolean z2, int i, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3658eb4d", new Object[]{str, new Boolean(z), new Boolean(z2), new Integer(i), new Double(d2)});
        } else if (!f18601a) {
        } else {
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue(OConstant.DIMEN_CONFIG_NAME, str);
            String str2 = "1";
            create.setValue("success", z ? str2 : "0");
            create.setValue(OConstant.DIMEN_FILE_LOCK, z2 ? str2 : "0");
            create.setValue("process", a.f18598a);
            if (!com.taobao.orange.a.A) {
                str2 = "0";
            }
            create.setValue("processIsolated", str2);
            create.setValue("type", String.valueOf(i));
            MeasureValueSet create2 = MeasureValueSet.create();
            create2.setValue("cost", d2);
            a(OConstant.MONITOR_MODULE, OConstant.POINT_FILE_STAT, create, create2);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!f18601a) {
        } else {
            DimensionSet create = DimensionSet.create();
            create.addDimension(OConstant.DIMEN_CRITICAL_CONFIGS_VERSION);
            create.addDimension("eagleEyeTraceId");
            create.addDimension(OConstant.DIMEN_CRITICAL_FETCH_STATUS);
            create.addDimension(OConstant.DIMEN_PROCESS_START_TIME);
            create.addDimension(OConstant.DIMEN_FETCH_CRITICAL_START_TIME);
            create.addDimension(OConstant.DIMEN_FETCH_CRITICAL_END_TIME);
            create.addDimension(OConstant.DIMEN_NET_CONNECT_COST_TIME);
            create.addDimension(OConstant.DIMEN_NET_RESPONSE_COST_TIME);
            create.addDimension(OConstant.DIMEN_PARSE_COST_TIME);
            create.addDimension(OConstant.DIMEN_NET_REQUEST_START_TIME);
            create.addDimension(OConstant.DIMEN_HIT_NET_STRATEGY);
            create.addDimension(OConstant.DIMEN_IS_COLD_STARTUP);
            create.addDimension(OConstant.DIMEN_CONFIG_BG);
            a(OConstant.MONITOR_MODULE, OConstant.POINT_FETCH_CRITICAL_CONFIG, MeasureSet.create(), create, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r22, java.lang.String r23, com.taobao.orange.sync.e.a r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.util.d.a(java.lang.String, java.lang.String, com.taobao.orange.sync.e$a, boolean):void");
    }

    public static void a(String str, String str2, long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6746007c", new Object[]{str, str2, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        } else if (!f18601a) {
        } else {
            HashMap hashMap = new HashMap();
            String l = Long.toString(j - com.taobao.orange.a.Q);
            String l2 = Long.toString(j2 - com.taobao.orange.a.Q);
            String l3 = Long.toString(j3 - com.taobao.orange.a.Q);
            String l4 = Long.toString(j4 - com.taobao.orange.a.Q);
            try {
                hashMap.put("dataId", str);
                hashMap.put(OConstant.DIMEN_CRITICAL_ACCS_STATUS, str2);
                hashMap.put(OConstant.DIMEN_ACCS_START_TIME, l);
                hashMap.put(OConstant.DIMEN_ACCS_DONE_TIME, l2);
                hashMap.put(OConstant.DIMEN_PARSE_START_TIME, l3);
                hashMap.put(OConstant.DIMEN_PARSE_DONE_TIME, l4);
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Orange_UT", c, OConstant.POINT_CRITICAL_ACCS_UPDATE, "arg2", "arg3", hashMap).build());
            } catch (Exception unused) {
            }
        }
    }

    private static Measure b(String str, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Measure) ipChange.ipc$dispatch("9136c82d", new Object[]{str, new Double(d2)});
        }
        Measure measure = new Measure(str);
        measure.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(d2));
        return measure;
    }

    public static void a(String str, String str2, double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6996263c", new Object[]{str, str2, new Double(d2), new Double(d3)});
        } else if (!f18601a) {
        } else {
            DimensionValueSet create = DimensionValueSet.create();
            try {
                create.setValue("process", a.f18598a);
                create.setValue(OConstant.DIMEN_CONFIG_BG, String.valueOf(GlobalAppRuntimeInfo.isAppBackground()));
            } catch (Throwable th) {
                OLog.e(TAG, "commitConfigLoadMonitor", th, new Object[0]);
            }
            String str3 = "1";
            create.setValue(OConstant.DIMEN_IS_CHANNEL_PROCESS, com.taobao.orange.a.d ? str3 : "0");
            if (!"success".equals(str)) {
                str3 = "0";
            }
            create.setValue(OConstant.DIMEN_REPLACE_SERVICE_STATUS, str3);
            create.setValue(OConstant.DIMEN_REPLACE_SERVICE_TYPE, str2);
            MeasureValueSet create2 = MeasureValueSet.create();
            create2.setValue(OConstant.DIMEN_PROCESS_START_TIME, a.b());
            create2.setValue(OConstant.DIMEN_REPLACE_TO_LOCAL_TIME, d2);
            create2.setValue(OConstant.DIMEN_REPLACE_TO_BIND_TIME, d3);
            a(OConstant.MONITOR_MODULE, OConstant.POINT_REPLACE_SERVICE, create, create2);
        }
    }
}
