package anet.channel.strategy.dispatch;

import anet.channel.encode.FileHelper;
import anet.channel.util.ALog;
import com.alibaba.ariver.kernel.RVStartParams;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes2.dex */
public class AmdcPriorityHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long AMDC_PRIORITY_MAX_TIME = 1209600000;
    public static final String AMDC_PRIORITY_TAG = "[amdc priority]";
    public static final String DEFAULT_CONFIG = "amdc_priority_config";
    public static final String DEFAULT_CONFIG_PATH = "awcn_amdc_priority_config_dir/";
    public static final String DEFAULT_TEMPORARY_PATH = "awcn_amdc_priority_temporary_dir/";
    private static final String TAG = "anet.AmdcPriorityHelper";
    public static final int USE_AMDC_REQUEST = 0;
    public static final int USE_NETWORK_REQUEST = 1;
    public static AtomicBoolean isInit;
    public static HashMap<String, AmdcPriorityInfo> priorityInfoHashMap;

    static {
        kge.a(-1478634667);
        priorityInfoHashMap = null;
        isInit = new AtomicBoolean(false);
    }

    public static synchronized void init() {
        synchronized (AmdcPriorityHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
                return;
            }
            if (isInit.compareAndSet(false, true)) {
                File file = FileHelper.getFile("init", DEFAULT_CONFIG_PATH, DEFAULT_CONFIG, AMDC_PRIORITY_TAG);
                if (file == null) {
                    ALog.e(TAG, "[amdc priority] init find not file", "init", new Object[0]);
                    return;
                }
                String name = file.getName();
                if (System.currentTimeMillis() - file.lastModified() >= AMDC_PRIORITY_MAX_TIME) {
                    file.delete();
                    ALog.e(TAG, "[amdc priority] init removeFile success! file=" + name, "init", new Object[0]);
                } else {
                    if (priorityInfoHashMap != null && !priorityInfoHashMap.isEmpty()) {
                        ALog.e(TAG, "[amdc priority] init loadFile! map not null, file=" + name, "init", new Object[0]);
                    }
                    priorityInfoHashMap = (HashMap) FileHelper.loadFile("init", file, AMDC_PRIORITY_TAG);
                    ALog.e(TAG, "[amdc priority] init loadFile! file=" + name, "init", new Object[0]);
                }
            }
        }
    }

    public static synchronized void updatePriorityInfo(String str, String str2, String str3, long j) {
        synchronized (AmdcPriorityHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1cc8b384", new Object[]{str, str2, str3, new Long(j)});
                return;
            }
            if (str2 != null && !str2.isEmpty() && str3 != null && !str3.isEmpty() && j > 0) {
                if (priorityInfoHashMap == null) {
                    priorityInfoHashMap = new HashMap<>();
                }
                AmdcPriorityInfo amdcPriorityInfo = priorityInfoHashMap.get(str2);
                List<String> list = null;
                if (amdcPriorityInfo != null) {
                    list = amdcPriorityInfo.priorityHostList;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = list == null ? new CopyOnWriteArrayList() : list;
                priorityInfoHashMap.put(str2, new AmdcPriorityInfo(str2, str3, j, copyOnWriteArrayList));
                ALog.e(TAG, "[amdc priority] updatePriorityInfo!", str, RVStartParams.KEY_URL_SHORT, str2, "priority", str3, "priorityHostList", copyOnWriteArrayList);
            }
        }
    }

    public static synchronized void updatePriorityHost(String str, String str2, String str3, String str4) {
        synchronized (AmdcPriorityHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fb51f04", new Object[]{str, str2, str3, str4});
                return;
            }
            if (str2 != null && !str2.isEmpty() && str3 != null && !str3.isEmpty() && str4 != null && !str4.isEmpty()) {
                if (!str3.equalsIgnoreCase("openCDNPrio")) {
                    ALog.e(TAG, "[amdc priority] updatePriorityHost, tags not match!!", str, RVStartParams.KEY_URL_SHORT, str2, "tags", str3, "host", str4);
                    return;
                }
                if (priorityInfoHashMap != null && !priorityInfoHashMap.isEmpty()) {
                    AmdcPriorityInfo amdcPriorityInfo = priorityInfoHashMap.get(str2);
                    if (amdcPriorityInfo == null) {
                        return;
                    }
                    if (amdcPriorityInfo.priorityHostList == null) {
                        amdcPriorityInfo.priorityHostList = new CopyOnWriteArrayList();
                    }
                    if (!amdcPriorityInfo.priorityHostList.contains(str4)) {
                        amdcPriorityInfo.priorityHostList.add(str4);
                        ALog.e(TAG, "[amdc priority] updatePriorityHost! tags=" + str3, str, "host", str4);
                    }
                    priorityInfoHashMap.put(str2, amdcPriorityInfo);
                }
            }
        }
    }

    public static synchronized void updateFile(String str) {
        synchronized (AmdcPriorityHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30a1a6b6", new Object[]{str});
                return;
            }
            if (isInit.get()) {
                FileHelper.updateFile(priorityInfoHashMap, FileHelper.getFile(str, DEFAULT_CONFIG_PATH, DEFAULT_CONFIG, AMDC_PRIORITY_TAG), DEFAULT_CONFIG, str, DEFAULT_TEMPORARY_PATH, AMDC_PRIORITY_TAG);
                ALog.e(TAG, "[amdc priority] updateFile success!", str, new Object[0]);
            }
        }
    }

    private static AmdcPriorityInfo getPriorityInfo(String str, String str2) {
        HashMap<String, AmdcPriorityInfo> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmdcPriorityInfo) ipChange.ipc$dispatch("2e7053bf", new Object[]{str, str2});
        }
        if (str2 == null || str2.isEmpty() || (hashMap = priorityInfoHashMap) == null || hashMap.isEmpty()) {
            return null;
        }
        AmdcPriorityInfo amdcPriorityInfo = priorityInfoHashMap.get(str2);
        if (amdcPriorityInfo != null && amdcPriorityInfo.isExpired(str)) {
            ALog.e(TAG, "[amdc priority] getPriorityInfo, amdcPriorityInfo isExpired!", str, RVStartParams.KEY_URL_SHORT, str2);
            amdcPriorityInfo.isExpired.set(true);
        }
        return amdcPriorityInfo;
    }

    public static String getPriority(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a81b2eca", new Object[]{new Integer(i), str, str2});
        }
        AmdcPriorityInfo priorityInfo = getPriorityInfo(str, str2);
        if (priorityInfo == null || priorityInfo.uid == null || priorityInfo.uid.isEmpty()) {
            return null;
        }
        ALog.e(TAG, "[amdc priority] getPriority, priority=" + priorityInfo.priority, str, "type", Integer.valueOf(i), "isExpired", Boolean.valueOf(priorityInfo.isExpired.get()));
        if (i != 1 && (i != 0 || priorityInfo.isExpired.get())) {
            return null;
        }
        return priorityInfo.priority;
    }

    public static boolean isPriorityHost(String str, String str2, String str3) {
        AmdcPriorityInfo priorityInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9926f5f", new Object[]{str, str2, str3})).booleanValue();
        }
        if (str3 != null && !str3.isEmpty() && (priorityInfo = getPriorityInfo(str, str2)) != null && priorityInfo.uid != null && !priorityInfo.uid.isEmpty() && priorityInfo.priorityHostList != null && !priorityInfo.priorityHostList.isEmpty()) {
            return priorityInfo.priorityHostList.contains(str3);
        }
        return false;
    }
}
