package anet.channel.strategy;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.ENV;
import anet.channel.statist.StrategyStatObject;
import anet.channel.util.ALog;
import anet.channel.util.SerializeHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import tb.kge;

/* loaded from: classes.dex */
public class StrategySerializeHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_STRATEGY_FOLDER_NAME = "awcn_strategy";
    private static final String DEFAULT_STRATEGY_PRE_FOLDER_NAME = "awcn_pre_strategy";
    private static final long MAX_AVAILABLE_PERIOD = 172800000;
    private static final long MAX_FILE_NUM = 10;
    private static final String TAG = "awcn.StrategySerializeHelper";
    private static Comparator<File> comparator;
    private static File strategyFolder;
    private static File strategyPreFolder;
    private static volatile boolean toDelete;

    static {
        kge.a(-592118114);
        strategyFolder = null;
        strategyPreFolder = null;
        toDelete = false;
        comparator = new Comparator<File>() { // from class: anet.channel.strategy.StrategySerializeHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public int compare(File file, File file2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a0238d", new Object[]{this, file, file2})).intValue() : (int) (file2.lastModified() - file.lastModified());
            }
        };
    }

    public static void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{context});
            return;
        }
        if (context != null) {
            try {
                File file = new File(context.getFilesDir(), DEFAULT_STRATEGY_FOLDER_NAME);
                strategyFolder = file;
                if (!checkFolderExistOrCreate(file)) {
                    ALog.e(TAG, "create directory failed!!!", null, "dir", strategyFolder.getAbsolutePath());
                }
                if (!GlobalAppRuntimeInfo.isTargetProcess() || GlobalAppRuntimeInfo.isChannelProcess(context)) {
                    String currentProcess = GlobalAppRuntimeInfo.getCurrentProcess();
                    File file2 = new File(strategyFolder, currentProcess.substring(currentProcess.indexOf(58) + 1));
                    strategyFolder = file2;
                    if (!checkFolderExistOrCreate(file2)) {
                        ALog.e(TAG, "create directory failed!!!", null, "dir", strategyFolder.getAbsolutePath());
                    }
                }
                ALog.i(TAG, "StrateyFolder", null, "path", strategyFolder.getAbsolutePath());
                if (toDelete) {
                    clearStrategyFolder();
                    toDelete = false;
                } else {
                    ALog.i(TAG, "StrateyFolder removeInvalidFile", null, "path", strategyFolder.getAbsolutePath());
                    removeInvalidFile();
                }
            } catch (Throwable th) {
                ALog.e(TAG, "StrategySerializeHelper initialize failed!!!", null, th, new Object[0]);
                return;
            }
        }
        initializePre(context);
    }

    public static void initializePre(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e6c10e", new Object[]{context});
        } else if (context == null) {
        } else {
            try {
                File file = new File(context.getFilesDir(), DEFAULT_STRATEGY_PRE_FOLDER_NAME);
                strategyPreFolder = file;
                if (!checkFolderExistOrCreate(file)) {
                    ALog.e(TAG, "create directory failed!!!", null, "dir", strategyFolder.getAbsolutePath());
                }
                if (!GlobalAppRuntimeInfo.isTargetProcess()) {
                    String currentProcess = GlobalAppRuntimeInfo.getCurrentProcess();
                    File file2 = new File(strategyPreFolder, currentProcess.substring(currentProcess.indexOf(58) + 1));
                    strategyPreFolder = file2;
                    if (!checkFolderExistOrCreate(file2)) {
                        ALog.e(TAG, "create directory failed!!!", null, "dir", strategyPreFolder.getAbsolutePath());
                    }
                }
                ALog.e(TAG, "strategyPreFolder", null, "path", strategyPreFolder.getAbsolutePath());
                if (toDelete) {
                    clearPreStrategyFolder();
                    toDelete = false;
                    return;
                }
                ALog.e(TAG, "strategyPreFolder removeInvalidFile", null, "path", strategyPreFolder.getAbsolutePath());
                removeInvalidFile();
            } catch (Throwable th) {
                ALog.e(TAG, "StrategySerializeHelper initialize failed!!!", null, th, new Object[0]);
            }
        }
    }

    private static boolean checkFolderExistOrCreate(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("252116a2", new Object[]{file})).booleanValue();
        }
        if (file != null && !file.exists()) {
            return file.mkdir();
        }
        return true;
    }

    public static File getStrategyFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("61d4a9f7", new Object[]{str});
        }
        if (GlobalAppRuntimeInfo.getEnv() == ENV.PREPARE) {
            ALog.e(TAG, "get pre StrategyFile", null, new Object[0]);
            return getPreStrategyFile(str);
        }
        ALog.e(TAG, "get online StrategyFile", null, new Object[0]);
        checkFolderExistOrCreate(strategyFolder);
        return new File(strategyFolder, str);
    }

    public static File getPreStrategyFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c6cfe100", new Object[]{str});
        }
        checkFolderExistOrCreate(strategyPreFolder);
        return new File(strategyPreFolder, str);
    }

    public static synchronized void clearStrategyFolder() {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bba81ef5", new Object[0]);
                return;
            }
            ALog.i(TAG, "clear start.", null, new Object[0]);
            if (strategyFolder == null) {
                ALog.w(TAG, "folder path not initialized, wait to clear", null, new Object[0]);
                toDelete = true;
                return;
            }
            File[] listFiles = strategyFolder.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file : listFiles) {
                if (file.isFile()) {
                    file.delete();
                    ALog.i(TAG, "clearStrategyFolder", null, "file", file.getName());
                }
            }
            ALog.i(TAG, "clear end.", null, new Object[0]);
        }
    }

    public static synchronized void clearPreStrategyFolder() {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1dfc6d7e", new Object[0]);
                return;
            }
            ALog.i(TAG, "clear pre start.", null, new Object[0]);
            if (strategyPreFolder == null) {
                ALog.w(TAG, "folder pre path not initialized, wait to clear", null, new Object[0]);
                toDelete = true;
                return;
            }
            File[] listFiles = strategyPreFolder.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file : listFiles) {
                if (file.isFile()) {
                    file.delete();
                    ALog.i(TAG, "clearStrategyFolder", null, "file", file.getName());
                }
            }
            ALog.i(TAG, "clear pre end.", null, new Object[0]);
        }
    }

    public static synchronized File[] getSortedFiles() {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File[]) ipChange.ipc$dispatch("ac5bb387", new Object[0]);
            } else if (GlobalAppRuntimeInfo.getEnv() == ENV.PREPARE) {
                return getPreSortedFiles();
            } else if (strategyFolder == null) {
                return null;
            } else {
                File[] listFiles = strategyFolder.listFiles();
                if (listFiles != null) {
                    Arrays.sort(listFiles, comparator);
                }
                return listFiles;
            }
        }
    }

    public static synchronized File[] getPreSortedFiles() {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File[]) ipChange.ipc$dispatch("fa38cad0", new Object[0]);
            } else if (strategyPreFolder == null) {
                return null;
            } else {
                File[] listFiles = strategyPreFolder.listFiles();
                if (listFiles != null) {
                    Arrays.sort(listFiles, comparator);
                }
                return listFiles;
            }
        }
    }

    public static synchronized void removeInvalidFile() {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4575f1f6", new Object[0]);
                return;
            }
            File[] sortedFiles = getSortedFiles();
            if (sortedFiles == null) {
                return;
            }
            int i = 0;
            for (File file : sortedFiles) {
                if (!file.isDirectory()) {
                    if (System.currentTimeMillis() - file.lastModified() > (AwcnConfig.isAmdcStrategyOptEnable() ? AwcnConfig.getLongAmdcThreshold() : 172800000L)) {
                        ALog.i(TAG, "removeInvalidFile 1: ", null, "file", file.getName(), "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "isAmdcStrategyOptEnable", Boolean.valueOf(AwcnConfig.isAmdcStrategyOptEnable()));
                        file.delete();
                    } else if (file.getName().startsWith("WIFI")) {
                        int i2 = i + 1;
                        if (i > 10) {
                            ALog.i(TAG, "removeInvalidFile 2: ", null, "file", file.getName(), "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()));
                            file.delete();
                        }
                        i = i2;
                    }
                }
            }
        }
    }

    public static synchronized void persist(Serializable serializable, String str, StrategyStatObject strategyStatObject) {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6b8666a", new Object[]{serializable, str, strategyStatObject});
            } else {
                SerializeHelper.persist(serializable, getStrategyFile(str), strategyStatObject);
            }
        }
    }

    public static synchronized <T> T restore(String str, StrategyStatObject strategyStatObject) {
        synchronized (StrategySerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("e2e072ee", new Object[]{str, strategyStatObject});
            }
            return (T) SerializeHelper.restore(getStrategyFile(str), strategyStatObject);
        }
    }
}
