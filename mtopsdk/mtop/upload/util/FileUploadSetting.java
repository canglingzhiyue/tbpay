package mtopsdk.mtop.upload.util;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.xstate.NetworkClassEnum;
import tb.kge;

/* loaded from: classes9.dex */
public final class FileUploadSetting {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static int DEFAULT_SEGMENT_RETRY_TIMES = 0;
    private static int DEFAULT_SEGMENT_SIZE = 0;
    private static int DEFAULT_UPLOAD_THREAD_NUMS = 0;
    private static final int MAX_SEGMENT_RETRY_TIMES = 10;
    private static final int MAX_UPLOAD_THREAD_NUMS = 10;
    private static final int MIN_SEGMENT_RETRY_TIMES = 0;
    private static final int MIN_UPLOAD_THREAD_NUMS = 1;
    private static final String TAG = "mtopsdk.FileUploadSetting";
    public static final SparseArray<String> uploadDomainMap;

    private FileUploadSetting() {
    }

    static {
        kge.a(-1141548150);
        DEFAULT_SEGMENT_RETRY_TIMES = 2;
        DEFAULT_UPLOAD_THREAD_NUMS = 2;
        DEFAULT_SEGMENT_SIZE = 131072;
        SparseArray<String> sparseArray = new SparseArray<>(3);
        uploadDomainMap = sparseArray;
        sparseArray.put(EnvModeEnum.ONLINE.getEnvMode(), "upload.m.taobao.com");
        uploadDomainMap.put(EnvModeEnum.PREPARE.getEnvMode(), "upload.wapa.taobao.com");
        uploadDomainMap.put(EnvModeEnum.TEST.getEnvMode(), "upload.waptest.taobao.net");
    }

    public static int getSegmentRetryTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e681b55", new Object[0])).intValue();
        }
        int i = RemoteConfig.getInstance().segmentRetryTimes;
        return (i < 0 || i > 10) ? DEFAULT_SEGMENT_RETRY_TIMES : i;
    }

    public static void setSegmentRetryTimes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0df5fed", new Object[]{new Integer(i)});
        } else if (i < 0 || i > 10) {
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                return;
            }
            TBSdkLog.w(TAG, String.format("[setSegmentRetryTimes] invalid parameter,range[%d,%d], segmentRetryTimes=%d", 0, 10, Integer.valueOf(i)));
        } else {
            DEFAULT_SEGMENT_RETRY_TIMES = i;
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i(TAG, String.format("[setSegmentRetryTimes] setSegmentRetryTimes succeed, segmentRetryTimes=%d", Integer.valueOf(i)));
        }
    }

    public static int getSegmentSize(NetworkClassEnum networkClassEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c162c0eb", new Object[]{networkClassEnum})).intValue();
        }
        if (networkClassEnum == null) {
            return DEFAULT_SEGMENT_SIZE;
        }
        Integer segmentSize = RemoteConfig.getInstance().getSegmentSize(networkClassEnum.getNetClass());
        if (segmentSize == null || segmentSize.intValue() <= 0) {
            return DEFAULT_SEGMENT_SIZE;
        }
        return segmentSize.intValue();
    }

    public static int getSegmentSize(String str, String str2) {
        Integer segmentSize;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90e334ac", new Object[]{str, str2})).intValue();
        }
        if (StringUtils.isBlank(str)) {
            return DEFAULT_SEGMENT_SIZE;
        }
        if (StringUtils.isNotBlank(str2) && (segmentSize = RemoteConfig.getInstance().getSegmentSize(StringUtils.concatStr(str, str2))) != null && segmentSize.intValue() > 0) {
            return segmentSize.intValue();
        }
        Integer segmentSize2 = RemoteConfig.getInstance().getSegmentSize(str);
        if (segmentSize2 == null || segmentSize2.intValue() <= 0) {
            return DEFAULT_SEGMENT_SIZE;
        }
        return segmentSize2.intValue();
    }

    public static void setSegmentSize(NetworkClassEnum networkClassEnum, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("911d0d7f", new Object[]{networkClassEnum, new Integer(i)});
        } else if (networkClassEnum == null || i <= 0) {
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                return;
            }
            TBSdkLog.w(TAG, String.format("[setSegmentSize] invalid parameter,networkType=%s,segmentSize=%d", networkClassEnum, Integer.valueOf(i)));
        } else {
            RemoteConfig.getInstance().setSegmentSize(networkClassEnum.getNetClass(), i);
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.w(TAG, String.format("[setSegmentSize] setSegmentSize succeed,networkType=%s,segmentSize=%d", networkClassEnum, Integer.valueOf(i)));
        }
    }

    public static int getUploadThreadsNums() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54b8a479", new Object[0])).intValue();
        }
        int i = RemoteConfig.getInstance().uploadThreadNums;
        return (i <= 0 || i > 10) ? DEFAULT_UPLOAD_THREAD_NUMS : i;
    }

    public static void setUploadThreadsNums(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749ffb49", new Object[]{new Integer(i)});
        } else if (i <= 0 || i > 10) {
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                return;
            }
            TBSdkLog.w(TAG, String.format("[setUploadThreadsNums] invalid parameter,range[%d,%d], uploadThreadsNums=%d", 1, 10, Integer.valueOf(i)));
        } else {
            DEFAULT_UPLOAD_THREAD_NUMS = i;
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i(TAG, String.format("[setUploadThreadsNums] setUploadThreadsNums succeed, uploadThreadsNums=%d", Integer.valueOf(i)));
        }
    }

    public static boolean useHttps(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2740d739", new Object[]{str})).booleanValue() : RemoteConfig.getInstance().useHttpsBizcodeSets.contains(str);
    }
}
