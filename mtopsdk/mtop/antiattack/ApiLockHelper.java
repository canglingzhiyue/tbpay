package mtopsdk.mtop.antiattack;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;
import tb.kge;

/* loaded from: classes.dex */
public class ApiLockHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long LOCK_PERIOD = 10;
    private static final String TAG = "mtopsdk.ApiLockHelper";
    private static ConcurrentHashMap<String, LockedEntity> lockedMap;

    static {
        kge.a(-1965800520);
        lockedMap = new ConcurrentHashMap<>();
    }

    public static boolean iSApiLocked(String str, long j) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1aa39d3d", new Object[]{str, new Long(j)})).booleanValue();
        }
        if (StringUtils.isBlank(str)) {
            return false;
        }
        LockedEntity lockedEntity = lockedMap.get(str);
        if (lockedEntity != null) {
            if (Math.abs(j - lockedEntity.lockStartTime) < lockedEntity.lockInterval) {
                z = true;
            } else {
                lockedMap.remove(str);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                    TBSdkLog.w(TAG, "[iSApiLocked]remove apiKey=" + str);
                }
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                StringBuilder sb = new StringBuilder();
                sb.append("[iSApiLocked] isLocked=");
                sb.append(z);
                sb.append(", ");
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append(", currentTime=");
                sb2.append(j);
                sb2.append(", lockEntity=");
                sb2.append(lockedEntity.toString());
                sb.append((Object) sb2);
                TBSdkLog.w(TAG, sb.toString());
            }
        }
        return z;
    }

    public static void lock(String str, long j, long j2) {
        LockedEntity lockedEntity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f69666fc", new Object[]{str, new Long(j), new Long(j2)});
        } else if (StringUtils.isBlank(str)) {
        } else {
            LockedEntity lockedEntity2 = lockedMap.get(str);
            long individualApiLockInterval = j2 > 0 ? j2 / 1000 : SwitchConfig.getInstance().getIndividualApiLockInterval(str);
            if (individualApiLockInterval <= 0) {
                individualApiLockInterval = SwitchConfig.getInstance().getGlobalApiLockInterval();
                if (individualApiLockInterval <= 0) {
                    individualApiLockInterval = 10;
                }
            }
            long j3 = individualApiLockInterval;
            if (lockedEntity2 == null) {
                lockedEntity = new LockedEntity(str, j, j3);
            } else {
                lockedEntity2.lockStartTime = j;
                lockedEntity2.lockInterval = j3;
                lockedEntity = lockedEntity2;
            }
            lockedMap.put(str, lockedEntity);
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[lock]");
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(", currentTime=");
            sb2.append(j);
            sb2.append(", lockEntity=");
            sb2.append(lockedEntity.toString());
            sb.append((Object) sb2);
            TBSdkLog.w(TAG, sb.toString());
        }
    }
}
