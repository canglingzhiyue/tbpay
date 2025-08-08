package com.taobao.location.common;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode;
import com.taobao.location.client.TBLocationClient;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AtomicInteger f17829a;
    public static ReentrantLock b;

    static {
        kge.a(-1634105250);
        f17829a = new AtomicInteger(0);
        b = new ReentrantLock();
    }

    public static void a(Context context) {
        String[] a2;
        String[] a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!a() && context != null) {
            boolean z = false;
            for (String str : a(Service.class)) {
                ComponentName componentName = new ComponentName(context, str);
                if (!c(context, componentName)) {
                    TLog.loge(TBLocationClient.LOG, str + " is disable");
                    a(context, componentName);
                    z = true;
                }
            }
            for (String str2 : a(BroadcastReceiver.class)) {
                ComponentName componentName2 = new ComponentName(context, str2);
                if (!b(context, componentName2)) {
                    TLog.loge(TBLocationClient.LOG, str2 + " is disable");
                    a(context, componentName2);
                    z = true;
                }
            }
            if (!z) {
                return;
            }
            f17829a.incrementAndGet();
        }
    }

    public static void a(Context context, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46de60f", new Object[]{context, componentName});
            return;
        }
        try {
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable th) {
            TLog.loge(TBLocationClient.LOG, "enableComponent error = ", th);
        }
    }

    public static boolean b(Context context, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aee38694", new Object[]{context, componentName})).booleanValue();
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            return a(packageManager, packageManager.getReceiverInfo(componentName, 128), componentName);
        } catch (Throwable th) {
            TLog.loge(TBLocationClient.LOG, "get state error [" + componentName, th);
            return false;
        }
    }

    public static boolean c(Context context, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69592715", new Object[]{context, componentName})).booleanValue();
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            return a(packageManager, packageManager.getServiceInfo(componentName, 128), componentName);
        } catch (Throwable th) {
            TLog.loge(TBLocationClient.LOG, "get state error [" + componentName, th);
            return false;
        }
    }

    private static boolean a(PackageManager packageManager, ComponentInfo componentInfo, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91f3e9bd", new Object[]{packageManager, componentInfo, componentName})).booleanValue();
        }
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        return (componentInfo != null && componentInfo.enabled && componentEnabledSetting == 0) || componentEnabledSetting == 1;
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("tblocationcommon", "enable_limit_times", "3");
        if (StringUtils.isEmpty(config) || "*".equals(config)) {
            return false;
        }
        return Integer.parseInt(config) <= f17829a.get();
    }

    private static String[] a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("4ce9b064", new Object[]{cls});
        }
        if (cls == Service.class) {
            String[] a2 = a(ServiceNode.TAG);
            return a2 != null ? a2 : new String[]{"com.taobao.activelocation.report.service.ActiveReportService", "com.amap.api.location.APSService", "com.taobao.activelocation.report.service.ActiveReportService", "com.taobao.passivelocation.gathering.service.LocationGatheringService", "com.taobao.passivelocation.report.service.LocationReportService", "com.taobao.activelocation.service.aidl.TBLocationServiceImpl"};
        } else if (cls == BroadcastReceiver.class) {
            String[] a3 = a("receivers");
            return a3 != null ? a3 : new String[]{"com.taobao.passivelocation.gathering.receiver.LocationChangedReceiver"};
        } else {
            return new String[0];
        }
    }

    private static String[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ad023781", new Object[]{str});
        }
        String config = OrangeConfig.getInstance().getConfig("tblocationcommon", "enable_component_config", "");
        try {
            if (!StringUtils.isEmpty(config)) {
                JSONObject parseObject = JSONObject.parseObject(config);
                String string = parseObject != null ? parseObject.getString(str) : null;
                return string != null ? string.split(",") : new String[0];
            }
        } catch (Throwable th) {
            TLog.loge(TBLocationClient.LOG, "getComponentConfig error = ", th);
        }
        return null;
    }
}
