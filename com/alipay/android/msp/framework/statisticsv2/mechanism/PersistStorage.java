package com.alipay.android.msp.framework.statisticsv2.mechanism;

import android.text.TextUtils;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.statisticsv2.Recorder;
import com.alipay.android.msp.framework.storage.FileUtils;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.DateUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes3.dex */
public class PersistStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String FILE_STATISTICS_V2 = "cashier_statistics_v2";

    /* renamed from: a  reason: collision with root package name */
    private static File f4860a;

    /* loaded from: classes3.dex */
    public interface IUpdateCallback {
        File getFile();

        void setFile(File file);
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b();
        }
    }

    public static /* synthetic */ void a(Recorder recorder, IUpdateCallback iUpdateCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d371d12", new Object[]{recorder, iUpdateCallback});
        } else {
            b(recorder, iUpdateCallback);
        }
    }

    public static /* synthetic */ void a(IUpdateCallback iUpdateCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97b0aa4", new Object[]{iUpdateCallback});
        } else {
            b(iUpdateCallback);
        }
    }

    public static synchronized void init() {
        synchronized (PersistStorage.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
                return;
            }
            if (f4860a == null) {
                File file = new File(MspConfig.getInstance().getLogsPathV2());
                f4860a = file;
                if (!file.exists()) {
                    f4860a.mkdirs();
                }
            }
        }
    }

    private static synchronized void b(Recorder recorder, IUpdateCallback iUpdateCallback) {
        synchronized (PersistStorage.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78b70293", new Object[]{recorder, iUpdateCallback});
                return;
            }
            if (recorder != null) {
                String format = recorder.format();
                String buildRandomFileInBasePath = FileUtils.buildRandomFileInBasePath(f4860a.getAbsolutePath());
                FileUtils.encryptWrite(buildRandomFileInBasePath, format);
                if (iUpdateCallback != null) {
                    File file = iUpdateCallback.getFile();
                    if (file != null) {
                        FileUtils.delete(file);
                    }
                    iUpdateCallback.setFile(new File(buildRandomFileInBasePath));
                }
            }
        }
    }

    public static void asyncSave(final Recorder recorder, final IUpdateCallback iUpdateCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24842aca", new Object[]{recorder, iUpdateCallback});
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.statisticsv2.mechanism.PersistStorage.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PersistStorage.a(Recorder.this, iUpdateCallback);
                    }
                }
            });
        }
    }

    private static synchronized void b(IUpdateCallback iUpdateCallback) {
        synchronized (PersistStorage.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f266725", new Object[]{iUpdateCallback});
                return;
            }
            if (iUpdateCallback != null) {
                File file = iUpdateCallback.getFile();
                if (file != null && file.exists() && file.isFile()) {
                    file.delete();
                }
                iUpdateCallback.setFile(null);
            }
        }
    }

    public static void asyncDelete(final IUpdateCallback iUpdateCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7ecc8a", new Object[]{iUpdateCallback});
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.statisticsv2.mechanism.PersistStorage.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PersistStorage.a(IUpdateCallback.this);
                    }
                }
            });
        }
    }

    public static void asyncUploadPreviousRecords() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90029f75", new Object[0]);
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.statisticsv2.mechanism.PersistStorage.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PersistStorage.a();
                    }
                }
            });
        }
    }

    private static synchronized void b() {
        synchronized (PersistStorage.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
                return;
            }
            LogUtil.record(4, "phonecashiermsp#log", "StatisticManager::uploadLocalRecord", "mdap channel");
            File[] listFiles = new File(MspConfig.getInstance().getLogsPathV2()).listFiles();
            if (listFiles != null && listFiles.length > 0) {
                Arrays.sort(listFiles, new Comparator<File>() { // from class: com.alipay.android.msp.framework.statisticsv2.mechanism.PersistStorage.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.Comparator
                    public int compare(File file, File file2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("f3a0238d", new Object[]{this, file, file2})).intValue() : file2.getName().compareTo(file.getName());
                    }
                });
                int i = 0;
                for (File file : listFiles) {
                    if (!a(file)) {
                        i++;
                        if (i > 4) {
                            return;
                        }
                        String decryptRead = FileUtils.decryptRead(file);
                        if (!TextUtils.isEmpty(decryptRead)) {
                            String str = decryptRead.substring(0, decryptRead.length() - 1) + ",(" + DateUtil.format() + ")]";
                            LogUtil.record(4, "phonecashiermsp#log", "PersistStorage.uploadLocalRecords", Utils.truncateString(str, 256));
                            LoggerFactory.getBehavorLogger().customContent(LogCategory.CATEGORY_ALIPAYSDK, str);
                        }
                        FileUtils.delete(file);
                    }
                }
            }
        }
    }

    private static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        Map<Integer, MspContext> mspContextMap = MspContextManager.getInstance().getMspContextMap();
        if (mspContextMap != null && !mspContextMap.isEmpty()) {
            for (MspContext mspContext : mspContextMap.values()) {
                if (mspContext.getStatisticInfo().persistCheck(file)) {
                    return true;
                }
            }
        }
        return false;
    }
}
