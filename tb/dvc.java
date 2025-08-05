package tb;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Process;
import android.os.UserHandle;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.dve;

/* loaded from: classes4.dex */
public class dvc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f27011a;

    static {
        kge.a(542426438);
        f27011a = new String[]{"/oat/arm/base.odex", "/oat/arm/base.vdex", "/oat/arm64/base.odex", "/oat/arm64/base.vdex"};
    }

    public static long a(Context context) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6454", new Object[]{context})).longValue();
        }
        final String absolutePath = new File(context.getPackageResourcePath()).getParentFile().getAbsolutePath();
        long j = 0;
        if (TextUtils.isEmpty(absolutePath)) {
            TLog.loge(CacheCleaner.MODULE, "OatDirCalculator", "calculateSize: query apk install path wrong, path " + absolutePath);
            return 0L;
        }
        final ArrayList arrayList = new ArrayList();
        for (String str : f27011a) {
            arrayList.add(absolutePath + str);
        }
        final HashMap hashMap = new HashMap();
        dve.a(new dve.b() { // from class: tb.dvc.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dve.b
            public void a(dve.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("818dec8", new Object[]{this, aVar});
                    return;
                }
                String str2 = aVar.g;
                if (!str2.startsWith(absolutePath + "/oat") || !arrayList.contains(aVar.g)) {
                    return;
                }
                if (hashMap.containsKey(aVar.g) && ((dve.a) hashMap.get(aVar.g)).d > aVar.d) {
                    return;
                }
                hashMap.put(aVar.g, aVar);
            }
        });
        for (Map.Entry entry : hashMap.entrySet()) {
            dve.a aVar = (dve.a) entry.getValue();
            j += (aVar.b - aVar.f27014a) + aVar.d;
        }
        return j;
    }

    public static long a(Context context, String str) {
        UUID uuid;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b6361e", new Object[]{context, str})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService("storagestats");
        StorageManager storageManager = (StorageManager) context.getSystemService(WXStorageModule.NAME);
        long j = 0;
        if (storageManager == null || storageStatsManager == null) {
            TLog.loge(CacheCleaner.MODULE, "OatDirCalculator", "apkInstallSize: query storage error, storageManager " + storageManager + ", storageStatsManager " + storageStatsManager);
            dvp.a("StorageMgrNoPermission", "");
            return 0L;
        }
        List<StorageVolume> storageVolumes = storageManager.getStorageVolumes();
        UserHandle myUserHandle = Process.myUserHandle();
        try {
            for (StorageVolume storageVolume : storageVolumes) {
                String uuid2 = storageVolume.getUuid();
                if (uuid2 == null) {
                    try {
                        uuid = StorageManager.UUID_DEFAULT;
                    } catch (Exception unused) {
                        uuid = StorageManager.UUID_DEFAULT;
                    }
                } else {
                    uuid = UUID.fromString(uuid2);
                }
                j += storageStatsManager.queryStatsForPackage(uuid, str, myUserHandle).getAppBytes();
            }
        } catch (Exception e) {
            TLog.loge(CacheCleaner.MODULE, "OatDirCalculator", "apkInstallSize: with exception " + e);
        }
        TLog.loge(CacheCleaner.MODULE, "OatDirCalculator", "apkInstallSize: consume time " + (System.currentTimeMillis() - currentTimeMillis));
        return j;
    }

    public static long b(Context context, String str) {
        UUID uuid;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b80d7fd", new Object[]{context, str})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService("storagestats");
        StorageManager storageManager = (StorageManager) context.getSystemService(WXStorageModule.NAME);
        long j = 0;
        if (storageManager == null || storageStatsManager == null) {
            TLog.loge(CacheCleaner.MODULE, "OatDirCalculator", "appDataSize: query storage error, storageManager " + storageManager + ", storageStatsManager " + storageStatsManager);
            dvp.a("StorageMgrNoPermission", "");
            return 0L;
        }
        List<StorageVolume> storageVolumes = storageManager.getStorageVolumes();
        UserHandle myUserHandle = Process.myUserHandle();
        try {
            for (StorageVolume storageVolume : storageVolumes) {
                String uuid2 = storageVolume.getUuid();
                if (uuid2 == null) {
                    try {
                        uuid = StorageManager.UUID_DEFAULT;
                    } catch (Exception unused) {
                        uuid = StorageManager.UUID_DEFAULT;
                    }
                } else {
                    uuid = UUID.fromString(uuid2);
                }
                j += storageStatsManager.queryStatsForPackage(uuid, str, myUserHandle).getDataBytes();
            }
        } catch (Exception e) {
            TLog.loge(CacheCleaner.MODULE, "OatDirCalculator", "appDataSize: with exception " + e);
        }
        TLog.loge(CacheCleaner.MODULE, "OatDirCalculator", "apkInstallSize: consume time " + (System.currentTimeMillis() - currentTimeMillis));
        return j;
    }
}
