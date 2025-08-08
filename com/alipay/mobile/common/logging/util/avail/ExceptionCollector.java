package com.alipay.mobile.common.logging.util.avail;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.MTBizReportName;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ExceptionCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ExceptionCollector f5467a;
    private List<Long> b;
    private List<ExceptionData> c;
    private Context d;

    public static ExceptionCollector getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExceptionCollector) ipChange.ipc$dispatch("e8dbfb42", new Object[]{context});
        }
        if (f5467a == null) {
            synchronized (ExceptionCollector.class) {
                if (f5467a == null) {
                    f5467a = new ExceptionCollector(context);
                }
            }
        }
        return f5467a;
    }

    private ExceptionCollector(Context context) {
        if (context != null) {
            this.d = context.getApplicationContext();
        }
        if (this.d == null) {
            this.d = context;
        }
    }

    public synchronized void recordNewLaunchTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a90e6e", new Object[]{this, new Long(j)});
            return;
        }
        LoggerFactory.getTraceLogger().info("ExceptionCollector", "recordNewLaunchTime: ".concat(String.valueOf(j)));
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getLaunchTimes());
        arrayList.add(Long.valueOf(j));
        while (arrayList.size() > 3) {
            arrayList.remove(0);
        }
        b(arrayList);
    }

    public synchronized void recordException(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd4970f", new Object[]{this, str});
            return;
        }
        LoggerFactory.getTraceLogger().info("ExceptionCollector", "recordException: ".concat(String.valueOf(str)));
        if (!ExceptionData.isValidExceptionType(str)) {
            return;
        }
        List<Long> launchTimes = getLaunchTimes();
        if (launchTimes.size() <= 0) {
            return;
        }
        recordException(str, launchTimes.get(launchTimes.size() - 1).longValue());
    }

    public synchronized void recordException(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabec195", new Object[]{this, str, new Long(j)});
            return;
        }
        if (j > 0 && ExceptionData.isValidExceptionType(str)) {
            if (!LoggerFactory.getProcessInfo().isMainProcess() && LoggerFactory.getProcessInfo().isMainProcessExist()) {
                Intent intent = new Intent();
                intent.setClassName(this.d, LogContext.MAIN_SERVICE_CLASS_NAME);
                intent.setPackage(this.d.getPackageName());
                intent.setAction("ExceptionCollector_recordException");
                Bundle bundle = new Bundle();
                bundle.putString("exceptionType", str);
                bundle.putLong("clientLaunchTime", j);
                intent.putExtras(bundle);
                this.d.startService(intent);
                return;
            }
            ExceptionData exceptionData = new ExceptionData();
            exceptionData.setExceptionType(str);
            exceptionData.setClientLaunchTime(j);
            LoggerFactory.getTraceLogger().info("ExceptionCollector", "recordException: " + exceptionData.getExceptionType() + " launchTime: " + exceptionData.getClientLaunchTime());
            ArrayList<ExceptionData> arrayList = new ArrayList();
            arrayList.addAll(a(true));
            arrayList.add(exceptionData);
            Collections.sort(arrayList);
            List<Long> launchTimes = getLaunchTimes();
            ArrayList arrayList2 = new ArrayList();
            int[] iArr = new int[launchTimes.size()];
            int i = 0;
            for (int i2 = 0; i2 < launchTimes.size(); i2++) {
                for (ExceptionData exceptionData2 : arrayList) {
                    if (exceptionData2.getClientLaunchTime() == launchTimes.get((launchTimes.size() - i2) - 1).longValue()) {
                        arrayList2.add(exceptionData2);
                        iArr[i2] = iArr[i2] + 1;
                    }
                }
                if (iArr[i2] <= 0) {
                    int i3 = 0;
                    for (int i4 : iArr) {
                        i3 += i4;
                    }
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    i += iArr[i2];
                }
            }
            if (i >= 3) {
                a(arrayList2);
                arrayList.clear();
            }
            ArrayList arrayList3 = new ArrayList();
            for (ExceptionData exceptionData3 : arrayList) {
                Iterator<Long> it = launchTimes.iterator();
                while (it.hasNext()) {
                    if (exceptionData3.getClientLaunchTime() == it.next().longValue()) {
                        arrayList3.add(exceptionData3);
                    }
                }
            }
            a(arrayList3, true);
        }
    }

    public synchronized void clearException(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d84b0d93", new Object[]{this, str});
            return;
        }
        LoggerFactory.getTraceLogger().info("ExceptionCollector", "clearException: ".concat(String.valueOf(str)));
        if (!ExceptionData.isValidExceptionType(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a(false));
        Iterator<ExceptionData> it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            ExceptionData next = it.next();
            if (str == null || str.equals(next.getExceptionType())) {
                it.remove();
                z2 = true;
            }
        }
        if (z2) {
            if (ExceptionData.TYPE_START_APP_FAIL.equals(str)) {
                z = false;
            }
            a(arrayList, z);
        }
    }

    private static void a(List<ExceptionData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{list});
        } else if (list.isEmpty()) {
            LoggerFactory.getTraceLogger().info("ExceptionCollector", "reportUnAvail but exceptions is empty");
        } else {
            LoggerFactory.getTraceLogger().info("ExceptionCollector", "reportUnAvail");
            HashMap hashMap = new HashMap();
            JSONArray jSONArray = new JSONArray();
            for (ExceptionData exceptionData : list) {
                jSONArray.put(exceptionData.toJsonObject());
            }
            hashMap.put("Exceptions", jSONArray.toString());
            LoggerFactory.getMonitorLogger().mtBizReport(MTBizReportName.MTBIZ_FRAME, "CONT_UNAVAIL", "1000", hashMap);
        }
    }

    public List<Long> getLaunchTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d5dc45a3", new Object[]{this});
        }
        if (this.b == null) {
            this.b = Collections.synchronizedList(new ArrayList());
        } else if (LoggerFactory.getProcessInfo().isMainProcess()) {
            return this.b;
        }
        try {
            SharedPreferences a2 = a(this.d);
            if (a2 != null) {
                String string = a2.getString("launchTimes", "");
                LoggerFactory.getTraceLogger().info("ExceptionCollector", "getLaunchTimes: ".concat(String.valueOf(string)));
                String[] split = string.split(",");
                this.b.clear();
                for (String str : split) {
                    if (!StringUtils.isEmpty(str)) {
                        this.b.add(Long.valueOf(Long.parseLong(str)));
                    }
                }
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("ExceptionCollector", th);
        }
        return this.b;
    }

    private void b(List<Long> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        List<Long> list2 = this.b;
        if (list2 != list) {
            list2.clear();
            this.b.addAll(list);
        }
        try {
            SharedPreferences a2 = a(this.d);
            if (a2 == null) {
                return;
            }
            String str = "";
            for (int i = 0; i < this.b.size(); i++) {
                str = str + String.valueOf(this.b.get(i));
                if (i < this.b.size() - 1) {
                    str = str + ",";
                }
            }
            a2.edit().putString("launchTimes", str).apply();
            LoggerFactory.getTraceLogger().info("ExceptionCollector", "updateLaunchTimes: ".concat(String.valueOf(str)));
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("ExceptionCollector", th);
        }
    }

    private List<ExceptionData> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("95ad395b", new Object[]{this, new Boolean(z)});
        }
        List<ExceptionData> list = this.c;
        if (list == null) {
            this.c = Collections.synchronizedList(new ArrayList());
        } else if (!z) {
            return list;
        }
        try {
            SharedPreferences a2 = a(this.d);
            if (a2 != null) {
                String string = a2.getString("exceptions", "");
                LoggerFactory.getTraceLogger().info("ExceptionCollector", "getExceptions: ".concat(String.valueOf(string)));
                if (!StringUtils.isEmpty(string)) {
                    this.c.clear();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        ExceptionData exceptionData = new ExceptionData();
                        exceptionData.parse(jSONObject);
                        this.c.add(exceptionData);
                    }
                }
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("ExceptionCollector", th);
        }
        return this.c;
    }

    private void a(List<ExceptionData> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
            return;
        }
        List<ExceptionData> list2 = this.c;
        if (list2 != list) {
            list2.clear();
            this.c.addAll(list);
        }
        try {
            SharedPreferences a2 = a(this.d);
            if (a2 == null) {
                return;
            }
            JSONArray jSONArray = new JSONArray();
            for (ExceptionData exceptionData : this.c) {
                jSONArray.put(exceptionData.toJsonObject());
            }
            if (z) {
                a2.edit().putString("exceptions", jSONArray.toString()).commit();
            } else {
                a2.edit().putString("exceptions", jSONArray.toString()).apply();
            }
            LoggerFactory.getTraceLogger().info("ExceptionCollector", "updateExceptions: ".concat(String.valueOf(jSONArray)));
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("ExceptionCollector", th);
        }
    }

    private static SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6ebdfd34", new Object[]{context});
        }
        try {
            if (LoggerFactory.getProcessInfo().isMainProcess()) {
                return context.getSharedPreferences("logging_avail_analysis", 0);
            }
            return context.getSharedPreferences("logging_avail_analysis", 4);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("ExceptionCollector", "readAndParseStrategy", th);
            return null;
        }
    }
}
