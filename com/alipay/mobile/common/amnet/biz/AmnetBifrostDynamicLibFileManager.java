package com.alipay.mobile.common.amnet.biz;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.netsdkextdependapi.userinfo.UserInfoUtil;
import com.alipay.mobile.common.transport.Request;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.TransportCallbackAdapter;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.db.NetworkConfigDAO;
import com.alipay.mobile.common.transport.download.DownloadManager;
import com.alipay.mobile.common.transport.download.DownloadRequest;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;

@Deprecated
/* loaded from: classes3.dex */
public class AmnetBifrostDynamicLibFileManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AmnetBifrostDynamicLibFileManager f5360a;
    private int d;
    private boolean e;
    private boolean b = false;
    private Boolean c = null;
    private boolean f = false;

    /* loaded from: classes3.dex */
    public class DownloadBifrostLibFileRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DownloadBifrostLibFileRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (!AmnetBifrostDynamicLibFileManager.access$400(AmnetBifrostDynamicLibFileManager.this)) {
                    LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[DownloadRunnable] PreCheck not passed, return.");
                } else if (AmnetBifrostDynamicLibFileManager.this.hasBifrostLibFile()) {
                    LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[DownloadRunnable] File exist, return.");
                } else if (AmnetBifrostDynamicLibFileManager.access$500(AmnetBifrostDynamicLibFileManager.this)) {
                    LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[DownloadRunnable] Once scheduled, return.");
                } else {
                    synchronized (AmnetBifrostDynamicLibFileManager.this) {
                        if (AmnetBifrostDynamicLibFileManager.access$500(AmnetBifrostDynamicLibFileManager.this)) {
                            return;
                        }
                        AmnetBifrostDynamicLibFileManager.access$502(AmnetBifrostDynamicLibFileManager.this, true);
                        int i = 10;
                        if (TextUtils.isEmpty(UserInfoUtil.getLastUserId())) {
                            i = 5;
                        }
                        NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.AmnetBifrostDynamicLibFileManager.DownloadBifrostLibFileRunnable.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    AmnetBifrostDynamicLibFileManager.this.startDownloadBifrostLibFile();
                                }
                            }
                        }, i, TimeUnit.SECONDS);
                        LogCatUtil.debug("AmnetBifrostDynamicLibFileManager", "[DownloadRunnable] Invoked schedule, delay:" + i);
                    }
                }
            } catch (Throwable th) {
                LogCatUtil.error("AmnetBifrostDynamicLibFileManager", "[DownloadRunnable] Exception:" + th.toString(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class PostExecuteRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public PostExecuteRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            File file = null;
            try {
                File access$300 = AmnetBifrostDynamicLibFileManager.access$300(AmnetBifrostDynamicLibFileManager.this, "tmp");
                if (!access$300.exists()) {
                    LogCatUtil.error("AmnetBifrostDynamicLibFileManager", "[PostExecuteRunnable] " + access$300.getName() + " no exists.");
                    if (access$300 == null) {
                        return;
                    }
                    try {
                        boolean delete = access$300.delete();
                        LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[PostExecuteRunnable] deleteRt:" + delete);
                        return;
                    } catch (Throwable th) {
                        LogCatUtil.error("AmnetBifrostDynamicLibFileManager", "[PostExecuteRunnable] Delete exception:" + th.toString(), th);
                        return;
                    }
                }
                LogCatUtil.error("AmnetBifrostDynamicLibFileManager", "[PostExecuteRunnable] Enter. file path : " + access$300.getAbsolutePath() + ", file length: " + access$300.length());
                if (!AmnetBifrostDynamicLibFileManager.access$200(AmnetBifrostDynamicLibFileManager.this, access$300)) {
                    if (access$300 == null) {
                        return;
                    }
                    try {
                        boolean delete2 = access$300.delete();
                        LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[PostExecuteRunnable] deleteRt:" + delete2);
                        return;
                    } catch (Throwable th2) {
                        LogCatUtil.error("AmnetBifrostDynamicLibFileManager", "[PostExecuteRunnable] Delete exception:" + th2.toString(), th2);
                        return;
                    }
                }
                File access$100 = AmnetBifrostDynamicLibFileManager.access$100(AmnetBifrostDynamicLibFileManager.this);
                boolean renameTo = access$300.renameTo(access$100);
                LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[PostExecuteRunnable] Generate final file. file path: " + access$100.getAbsolutePath() + ", " + access$100.length() + ", renameRt: " + renameTo);
                if (access$300 == null) {
                    return;
                }
                try {
                    boolean delete3 = access$300.delete();
                    LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[PostExecuteRunnable] deleteRt:" + delete3);
                } catch (Throwable th3) {
                    LogCatUtil.error("AmnetBifrostDynamicLibFileManager", "[PostExecuteRunnable] Delete exception:" + th3.toString(), th3);
                }
            } catch (Throwable th4) {
                try {
                    LogCatUtil.error("AmnetBifrostDynamicLibFileManager", "[PostExecuteRunnable] Exception: " + th4.toString(), th4);
                    if (0 == 0) {
                        return;
                    }
                    try {
                        boolean delete4 = file.delete();
                        LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[PostExecuteRunnable] deleteRt:" + delete4);
                    } catch (Throwable th5) {
                        LogCatUtil.error("AmnetBifrostDynamicLibFileManager", "[PostExecuteRunnable] Delete exception:" + th5.toString(), th5);
                    }
                } catch (Throwable th6) {
                    if (0 != 0) {
                        try {
                            boolean delete5 = file.delete();
                            LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[PostExecuteRunnable] deleteRt:" + delete5);
                        } catch (Throwable th7) {
                            LogCatUtil.error("AmnetBifrostDynamicLibFileManager", "[PostExecuteRunnable] Delete exception:" + th7.toString(), th7);
                        }
                    }
                    throw th6;
                }
            }
        }
    }

    public static /* synthetic */ File access$100(AmnetBifrostDynamicLibFileManager amnetBifrostDynamicLibFileManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("4ba42cdd", new Object[]{amnetBifrostDynamicLibFileManager}) : amnetBifrostDynamicLibFileManager.a();
    }

    public static /* synthetic */ boolean access$200(AmnetBifrostDynamicLibFileManager amnetBifrostDynamicLibFileManager, File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dec246c", new Object[]{amnetBifrostDynamicLibFileManager, file})).booleanValue() : amnetBifrostDynamicLibFileManager.a(file);
    }

    public static /* synthetic */ File access$300(AmnetBifrostDynamicLibFileManager amnetBifrostDynamicLibFileManager, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("1724a11", new Object[]{amnetBifrostDynamicLibFileManager, str}) : amnetBifrostDynamicLibFileManager.a(str);
    }

    public static /* synthetic */ boolean access$400(AmnetBifrostDynamicLibFileManager amnetBifrostDynamicLibFileManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84ea1b7", new Object[]{amnetBifrostDynamicLibFileManager})).booleanValue() : amnetBifrostDynamicLibFileManager.c();
    }

    public static /* synthetic */ boolean access$500(AmnetBifrostDynamicLibFileManager amnetBifrostDynamicLibFileManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("91d2038", new Object[]{amnetBifrostDynamicLibFileManager})).booleanValue() : amnetBifrostDynamicLibFileManager.f;
    }

    public static /* synthetic */ boolean access$502(AmnetBifrostDynamicLibFileManager amnetBifrostDynamicLibFileManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eb5f3e2", new Object[]{amnetBifrostDynamicLibFileManager, new Boolean(z)})).booleanValue();
        }
        amnetBifrostDynamicLibFileManager.f = z;
        return z;
    }

    public static final AmnetBifrostDynamicLibFileManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetBifrostDynamicLibFileManager) ipChange.ipc$dispatch("32fce27c", new Object[0]);
        }
        AmnetBifrostDynamicLibFileManager amnetBifrostDynamicLibFileManager = f5360a;
        if (amnetBifrostDynamicLibFileManager != null) {
            return amnetBifrostDynamicLibFileManager;
        }
        synchronized (AmnetBifrostDynamicLibFileManager.class) {
            if (f5360a != null) {
                return f5360a;
            }
            f5360a = new AmnetBifrostDynamicLibFileManager();
            return f5360a;
        }
    }

    private AmnetBifrostDynamicLibFileManager() {
        this.d = 480000;
        this.e = false;
        this.d = AmnetSwitchManagerImpl.getInstance().getDynamicLibDownloadInterval();
        this.e = AmnetSwitchManagerImpl.getInstance().isEnabledBifrostDynamicLib();
        LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "ConfigInfos: downloadInterval: " + this.d + ", enabledBifrostDynamicLib: " + this.e);
    }

    public void asynTryDeleteOldBifrostLibFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d212a13", new Object[]{this});
            return;
        }
        try {
            NetworkAsyncTaskExecutor.executeIO(new TryDeleteOldBifrostLibFileRunnable());
        } catch (Throwable th) {
            LogCatUtil.error("AmnetBifrostDynamicLibFileManager", "[asynTryDeleteOldBifrostLibFile] Exception: " + th.toString());
        }
    }

    public boolean hasBifrostLibFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dc8eec9", new Object[]{this})).booleanValue();
        }
        try {
            if (!this.e) {
                LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[hasBifrostLibFile] Switch off.");
                return false;
            } else if (this.c != null) {
                return this.c.booleanValue();
            } else {
                synchronized (this) {
                    if (this.c != null) {
                        return this.c.booleanValue();
                    } else if (!d()) {
                        LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[hasBifrostLibFile] checkArchitecture false.");
                        Boolean bool = Boolean.FALSE;
                        this.c = bool;
                        return bool.booleanValue();
                    } else {
                        File a2 = a();
                        LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[hasBifrostLibFile] file Path: " + a2.getAbsolutePath());
                        if (!a2.exists()) {
                            LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[hasBifrostLibFile] " + a2.getName() + " no exists.");
                            Boolean bool2 = Boolean.FALSE;
                            this.c = bool2;
                            return bool2.booleanValue();
                        }
                        LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[hasBifrostLibFile] " + a2.getName() + " exists.");
                        Boolean bool3 = Boolean.TRUE;
                        this.c = bool3;
                        return bool3.booleanValue();
                    }
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error("AmnetBifrostDynamicLibFileManager", "[hasBifrostLibFile] Exception: " + th.toString(), th);
            return false;
        }
    }

    private File a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("a060c1a5", new Object[]{this}) : a((String) null);
    }

    private File a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c26a5a1b", new Object[]{this, str});
        }
        String mapLibraryName = System.mapLibraryName("Bifrost");
        if (!TextUtils.isEmpty(str)) {
            mapLibraryName = mapLibraryName + "." + str;
        }
        return new File(AmnetEnvHelper.getAppContext().getDir("plugins_lib", 0), mapLibraryName);
    }

    public void scheduleStartDownloadBifrostLibFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a5619e", new Object[]{this});
        } else if (!this.e) {
            LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[scheduleStartDownloadBifrostLibFile] Switch off.");
        } else if (!TransportStrategy.isEnableBifrost()) {
            LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[scheduleStartDownloadBifrostLibFile] isEnableBifrost it's false, return.");
        } else {
            try {
                NetworkAsyncTaskExecutor.executeIO(new DownloadBifrostLibFileRunnable());
            } catch (Throwable th) {
                LogCatUtil.error("AmnetBifrostDynamicLibFileManager", "[scheduleStartDownloadBifrostLibFile] Exception:" + th.toString(), th);
            }
        }
    }

    @Deprecated
    public void startDownloadBifrostLibFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee018f35", new Object[]{this});
            return;
        }
        try {
            if (this.b) {
                LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[startDownloadBifrostLibFile] It has been downloaded once.");
                return;
            }
            synchronized (this) {
                if (this.b) {
                    LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[startDownloadBifrostLibFile] It has been downloaded once.");
                    return;
                }
                this.b = true;
                if (!c()) {
                    LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[startDownloadBifrostLibFile] PreCheck not passed.");
                } else if (hasBifrostLibFile()) {
                    LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[startDownloadBifrostLibFile] File exist.");
                } else if (!b()) {
                    LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[startDownloadBifrostLibFile] recordLastDownloadTime result false, return.");
                } else {
                    File a2 = a("tmp");
                    if (a2.exists()) {
                        a2.delete();
                    }
                    DownloadManager downloadManager = new DownloadManager(AmnetEnvHelper.getAppContext());
                    DownloadRequest downloadRequest = new DownloadRequest(new String(Base64.decode("aHR0cHM6Ly9ndy5hbGlwYXlvYmplY3RzLmNvbS9vcy9ybXNwb3J0YWwvbnV5c2VRd01oWnlpdXh0b0lHVXgudHh0Cg==", 2), "utf-8"));
                    downloadRequest.setPath(a2.getAbsolutePath());
                    downloadRequest.setTransportCallback(new DownloadEventCallback());
                    downloadManager.addDownload(downloadRequest);
                    LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[startDownloadBifrostLibFile] Add download task finish.");
                }
            }
        } catch (Throwable th) {
            LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[startDownloadBifrostLibFile] Run exception: " + th.toString(), th);
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            String valueOf = String.valueOf(System.currentTimeMillis());
            LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[recordLastDownloadTime] lastDownloadTime: " + valueOf);
            return NetworkConfigDAO.getInstance().saveOrUpdateConfig("bifrost_dynamic_lib_last_download_time", valueOf);
        } catch (Throwable th) {
            LogCatUtil.error("AmnetBifrostDynamicLibFileManager", "[recordLastDownloadTime] Exception: " + th.toString());
            return false;
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (!this.e) {
            LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[preCheck] Switch off, return.");
            return false;
        } else if (!MiscUtils.isMainProcessRuning(AmnetEnvHelper.getAppContext())) {
            LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[preCheck] Not main process, return.");
            return false;
        } else if (!d()) {
            LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[preCheck] checkArchitecture false, return.");
            return false;
        } else if (!NetworkUtils.isWiFiMobileNetwork(AmnetEnvHelper.getAppContext())) {
            LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[preCheck] It must be a wifi network, return.");
            return false;
        } else {
            boolean isScreenOn = MiscUtils.isScreenOn(AmnetEnvHelper.getAppContext());
            boolean isAtFrontDesk = MiscUtils.isAtFrontDesk(AmnetEnvHelper.getAppContext());
            if (isScreenOn && isAtFrontDesk) {
                return e();
            }
            LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[preCheck] screenOn:" + isScreenOn + ", atFrontDesk:" + isAtFrontDesk + ",  return.");
            return false;
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        String f = f();
        LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[checkArchitecture] Get current architecture: " + f);
        if (TextUtils.isEmpty(f)) {
            LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[checkArchitecture] Unsupported architecture its null.");
            return false;
        } else if (f.trim().toLowerCase().startsWith("armeabi")) {
            return true;
        } else {
            LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[checkArchitecture] Unsupported architecture:" + f);
            return false;
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        try {
            String config = NetworkConfigDAO.getInstance().getConfig("bifrost_dynamic_lib_last_download_time");
            if (TextUtils.isEmpty(config)) {
                LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[checkDownloadInterval] lastDownloadTimeStr empty, return true.");
                return true;
            }
            Long valueOf = Long.valueOf(config);
            if (valueOf != null && valueOf.longValue() >= 1) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis < valueOf.longValue()) {
                    LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[checkDownloadInterval] Illegal currentTimeMillis:" + currentTimeMillis + ", and lastDownloadTime:" + valueOf + ", return.");
                    NetworkConfigDAO.getInstance().deleteConfig("bifrost_dynamic_lib_last_download_time");
                    return false;
                }
                long longValue = valueOf.longValue() + this.d;
                if (currentTimeMillis >= longValue) {
                    return true;
                }
                LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[checkDownloadInterval] canDownloadTime: " + longValue + ", currentTimeMillis:" + currentTimeMillis + "， can download for " + (currentTimeMillis - longValue) + " millisecond, return.");
                return false;
            }
            LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[checkDownloadInterval] Illegal lastDownloadTime:" + valueOf + ", return.");
            NetworkConfigDAO.getInstance().deleteConfig("bifrost_dynamic_lib_last_download_time");
            return false;
        } catch (Throwable th) {
            LogCatUtil.error("AmnetBifrostDynamicLibFileManager", "[checkDownloadInterval] Exception: " + th.toString());
            NetworkConfigDAO.getInstance().deleteConfig("bifrost_dynamic_lib_last_download_time");
            return false;
        }
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        String str = Build.CPU_ABI;
        return !TextUtils.isEmpty(str) ? str : Build.CPU_ABI2;
    }

    private boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{this, file})).booleanValue();
        }
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (Throwable unused) {
                    }
                }
            }
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 2);
            if (TextUtils.equals(encodeToString, "NPTNV6/MvZCLVucWnbhqNA==")) {
                return true;
            }
            LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[PostExecuteRunnable] Signatures are not equal. target signature:" + encodeToString + ", raw signature:NPTNV6/MvZCLVucWnbhqNA==");
            return false;
        } finally {
            try {
                fileInputStream.close();
            } catch (Throwable unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class TryDeleteOldBifrostLibFileRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private TryDeleteOldBifrostLibFileRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                File access$100 = AmnetBifrostDynamicLibFileManager.access$100(AmnetBifrostDynamicLibFileManager.this);
                if (access$100 != null && access$100.exists()) {
                    if (!AmnetBifrostDynamicLibFileManager.access$200(AmnetBifrostDynamicLibFileManager.this, access$100)) {
                        LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[TryDeleteOldBifrostLibFileRunnable] MD5 check faild.");
                        return;
                    }
                    boolean delete = access$100.delete();
                    LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[TryDeleteOldBifrostLibFileRunnable] deleteRt: " + delete);
                }
            } catch (Throwable th) {
                LogCatUtil.error("AmnetBifrostDynamicLibFileManager", "[TryDeleteOldBifrostLibFileRunnable] Exception: " + th.toString(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class DownloadEventCallback extends TransportCallbackAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
        public void onProgressUpdate(Request request, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f01968e", new Object[]{this, request, new Double(d)});
            }
        }

        public DownloadEventCallback() {
        }

        @Override // com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
        public void onCancelled(Request request) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9ab1ecd", new Object[]{this, request});
            } else {
                LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[onCancelled]");
            }
        }

        @Override // com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
        public void onPreExecute(Request request) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d596d2c", new Object[]{this, request});
            } else {
                LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[onPreExecute]");
            }
        }

        @Override // com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
        public void onPostExecute(Request request, Response response) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a46dd3b", new Object[]{this, request, response});
                return;
            }
            LogCatUtil.info("AmnetBifrostDynamicLibFileManager", "[onPostExecute]");
            NetworkAsyncTaskExecutor.executeIO(new PostExecuteRunnable());
        }

        @Override // com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
        public void onFailed(Request request, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9fc6d16", new Object[]{this, request, new Integer(i), str});
                return;
            }
            LogCatUtil.warn("AmnetBifrostDynamicLibFileManager", "[onFailed] code:" + i + ", msg:" + str);
        }
    }
}
