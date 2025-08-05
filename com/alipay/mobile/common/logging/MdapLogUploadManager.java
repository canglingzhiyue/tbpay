package com.alipay.mobile.common.logging;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.network.NetworkInfoGetter;
import com.alipay.mobile.common.logging.http.ConfigChangeBroadCastReceiver;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.uploader.HttpUploader;
import com.alipay.mobile.common.logging.uploader.RpcUploader;
import com.alipay.mobile.common.transport.monitor.NetworkServiceTracer;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class MdapLogUploadManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static int f5409a = 52428800;
    public static final List<String> b = new ArrayList<String>() { // from class: com.alipay.mobile.common.logging.MdapLogUploadManager.1
        {
            add(NetworkServiceTracer.REPORT_SUB_NAME_RPC);
            add("MMTP");
            add("MASS");
            add(MonitorItemConstants.PARTITION_NAME);
            add("MISC");
            add("mdaplog");
            add("network");
            add("keybiztrace");
            add("footprint");
            add("exception");
            add("crash");
            add(LogCategory.CATEGORY_HIGHAVAIL);
            add("apm");
            add(LogCategory.CATEGORY_TRAFFICLOG);
            add(LogCategory.CATEGORY_DATAFLOW);
            add(LogCategory.CATEGORY_BATTERY);
        }
    };
    public static final Comparator<File> c = new Comparator<File>() { // from class: com.alipay.mobile.common.logging.MdapLogUploadManager.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, file, file2})).intValue() : file.getName().compareTo(file2.getName());
        }
    };
    private static MdapLogUploadManager e;
    private ConfigChangeBroadCastReceiver d;
    private Context f;
    private File g;

    public static synchronized MdapLogUploadManager a(Context context) {
        synchronized (MdapLogUploadManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MdapLogUploadManager) ipChange.ipc$dispatch("73cbec85", new Object[]{context});
            }
            if (e == null) {
                e = new MdapLogUploadManager(context);
            }
            return e;
        }
    }

    public static MdapLogUploadManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MdapLogUploadManager) ipChange.ipc$dispatch("d7279e8d", new Object[0]);
        }
        MdapLogUploadManager mdapLogUploadManager = e;
        if (mdapLogUploadManager == null) {
            throw new IllegalStateException("need createInstance before use");
        }
        return mdapLogUploadManager;
    }

    private MdapLogUploadManager(Context context) {
        this.f = context;
        this.g = new File(context.getFilesDir().getAbsolutePath() + "/mdap/upload/");
        if (!this.g.exists()) {
            this.g.mkdirs();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.mobile.client.multi.CONFIG_CHANGE");
        this.d = new ConfigChangeBroadCastReceiver();
        Context context2 = this.f;
        if (context2 != null) {
            context2.registerReceiver(this.d, intentFilter);
        }
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else {
            f5409a = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: Throwable -> 0x011d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0015, B:19:0x005d, B:31:0x009f, B:35:0x00a7, B:37:0x00c3, B:39:0x00c7, B:41:0x00cd, B:43:0x00d3, B:46:0x00ea, B:47:0x00f2, B:20:0x0071, B:22:0x007c, B:24:0x0082), top: B:65:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.MdapLogUploadManager.b():void");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return b.contains(str);
        }
        return false;
    }

    public final synchronized void a(String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b028dd8", new Object[]{this, str, str2, bundle});
        } else if (LogStrategyManager.getInstance().isRealTimeLogCategory(str) && !a(str)) {
            if (LoggerFactory.getProcessInfo().isToolsProcess()) {
                LoggerFactory.getTraceLogger().warn("MdapLogUploadManager", "upload real time logCategory in tool!!");
            }
            new RpcUploader(this.g, this.f).a(str, bundle);
        } else if (LoggerFactory.getProcessInfo().isPushProcess() && bundle != null && "maxLogCount".equals(bundle.getString("event"))) {
            NetworkInfoGetter networkInfoGetter = LoggerFactory.getLogContext().getNetworkInfoGetter();
            if (networkInfoGetter != null && !networkInfoGetter.isNetworkAvailable() && !networkInfoGetter.isConnect()) {
                LoggerFactory.getTraceLogger().info("MdapLogUploadManager", "upload time is maxLogCount and network is not available!!! Do not upload category = ".concat(String.valueOf(str)));
            } else {
                b(str, str2, bundle);
            }
        } else {
            b(str, str2, bundle);
        }
    }

    private void b(String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91065937", new Object[]{this, str, str2, bundle});
            return;
        }
        LoggerFactory.getTraceLogger().info("MdapLogUploadManager", "http upload logCategory = ".concat(String.valueOf(str)));
        new HttpUploader(this.g, this.f).a(str, str2, bundle);
    }
}
