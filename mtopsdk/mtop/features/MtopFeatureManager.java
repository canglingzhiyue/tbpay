package mtopsdk.mtop.features;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

/* loaded from: classes.dex */
public final class MtopFeatureManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopFeatureManager";

    /* loaded from: classes9.dex */
    public enum MtopFeatureEnum {
        SUPPORT_RELATIVE_URL(1),
        UNIT_INFO_FEATURE(2),
        DISABLE_WHITEBOX_SIGN(3),
        SUPPORT_UTDID_UNIT(4),
        DISABLE_X_COMMAND(5),
        SUPPORT_OPEN_ACCOUNT(6);
        
        long feature;

        MtopFeatureEnum(long j) {
            this.feature = j;
        }

        public long getFeature() {
            return this.feature;
        }
    }

    static {
        kge.a(-982240217);
    }

    public static long getMtopFeatureValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1775d577", new Object[]{new Integer(i)})).longValue();
        }
        if (i > 0) {
            return 1 << (i - 1);
        }
        return 0L;
    }

    public static long getMtopTotalFeatures(Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("788adb97", new Object[]{mtop})).longValue();
        }
        long j = 0;
        if (mtop == null) {
            mtop = Mtop.instance(null);
        }
        try {
            for (Integer num : mtop.getMtopConfig().mtopFeatures) {
                j |= getMtopFeatureValue(num.intValue());
            }
        } catch (Exception e) {
            TBSdkLog.w(TAG, mtop.getInstanceId() + " [getMtopTotalFeatures] get mtop total features error.---" + e.toString());
        }
        return j;
    }

    public static int getMtopFeatureByFeatureEnum(MtopFeatureEnum mtopFeatureEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30999b1f", new Object[]{mtopFeatureEnum})).intValue();
        }
        if (mtopFeatureEnum == null) {
            return 0;
        }
        switch (mtopFeatureEnum) {
            case SUPPORT_RELATIVE_URL:
                return 1;
            case UNIT_INFO_FEATURE:
                return 2;
            case DISABLE_WHITEBOX_SIGN:
                return 3;
            case SUPPORT_UTDID_UNIT:
                return 4;
            case DISABLE_X_COMMAND:
                return 5;
            case SUPPORT_OPEN_ACCOUNT:
                return 6;
            default:
                return 0;
        }
    }

    public static void setMtopFeatureFlag(Mtop mtop, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bfeaa29", new Object[]{mtop, new Integer(i), new Boolean(z)});
            return;
        }
        if (mtop == null) {
            mtop = Mtop.instance(null);
        }
        Set<Integer> set = mtop.getMtopConfig().mtopFeatures;
        if (z) {
            set.add(Integer.valueOf(i));
        } else {
            set.remove(Integer.valueOf(i));
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, mtop.getInstanceId() + " [setMtopFeatureFlag] set feature=" + i + " , openFlag=" + z);
    }
}
