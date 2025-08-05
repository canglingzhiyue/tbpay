package mtopsdk.mtop.upload;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.statistics.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.stat.IUploadStats;
import mtopsdk.mtop.upload.domain.FileBaseInfo;
import mtopsdk.mtop.upload.domain.UploadConstants;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import mtopsdk.mtop.upload.domain.UploadToken;
import mtopsdk.mtop.upload.service.UploadFileServiceImpl;
import mtopsdk.mtop.upload.util.FileUploadThreadPoolExecutorFactory;
import mtopsdk.mtop.util.Result;
import tb.kge;

/* loaded from: classes9.dex */
public class FileUploadTask implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.FileUploadTask";
    private static volatile AtomicBoolean isRegistered;
    public UploadFileInfo fileInfo;
    public DefaultFileUploadListenerWrapper listener;

    static {
        kge.a(969302374);
        kge.a(-1390502639);
        isRegistered = new AtomicBoolean(false);
    }

    public FileUploadTask(UploadFileInfo uploadFileInfo, DefaultFileUploadListenerWrapper defaultFileUploadListenerWrapper) {
        this.fileInfo = uploadFileInfo;
        this.listener = defaultFileUploadListenerWrapper;
    }

    public void upload() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f170aa08", new Object[]{this});
        } else if (isCancelled()) {
        } else {
            this.listener.onStart();
            UploadFileServiceImpl uploadFileServiceImpl = new UploadFileServiceImpl();
            Result<UploadToken> uploadToken = uploadFileServiceImpl.getUploadToken(this.fileInfo);
            UploadToken model = uploadToken.getModel();
            if (!uploadToken.isSuccess()) {
                this.listener.onError(uploadToken.getErrType(), uploadToken.getErrCode(), uploadToken.getErrInfo());
                commitUploadStatsRecord(uploadToken, model);
                FileUploadMgr.getInstance().removeTask(this.fileInfo);
                return;
            }
            long j = model.fileBaseInfo.fileSize;
            long j2 = model.segmentSize;
            if (isCancelled()) {
                return;
            }
            long j3 = 1;
            if (j <= j2) {
                FileUploadThreadPoolExecutorFactory.submitUploadTask(new SegmentFileUploadTask(this.fileInfo, this.listener, model, 0L, uploadFileServiceImpl));
            } else {
                j3 = ((j + j2) - 1) / j2;
                while (true) {
                    long j4 = i;
                    if (j4 >= j3) {
                        break;
                    }
                    FileUploadThreadPoolExecutorFactory.submitUploadTask(new SegmentFileUploadTask(this.fileInfo, this.listener, model, model.segmentSize * j4, uploadFileServiceImpl));
                    i++;
                }
            }
            this.listener.segmentNum = j3;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            upload();
        } catch (Exception e) {
            TBSdkLog.e(TAG, "excute uploadTask exception", e);
            this.listener.onError(UploadConstants.ERRTYPE_OTHER_UPLOAD_ERROR, UploadConstants.ERRCODE_FILE_ADD_TASK_FAIL, UploadConstants.ERRMSG_FILE_ADD_TASK_FAIL);
            FileUploadMgr.getInstance().removeTask(this.fileInfo);
        }
    }

    public void notifyProgress(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d4735d", new Object[]{this, new Long(j), new Long(j2)});
        } else if (this.listener == null || j2 <= 0) {
        } else {
            this.listener.onProgress(Math.min(Math.abs(Math.round((((float) j) / ((float) j2)) * 100.0f)), 100));
        }
    }

    public boolean isCancelled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
        }
        if (!this.listener.isCancelled()) {
            return false;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d(TAG, "File Upload Task is cancelled");
        }
        return true;
    }

    public void commitUploadStatsRecord(Result result, UploadToken uploadToken) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2744f2c", new Object[]{this, result, uploadToken});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder(result.getErrCode());
            if (StringUtils.isNotBlank(result.getErrInfo())) {
                sb.append(":");
                sb.append(result.getErrInfo());
            }
            FileBaseInfo fileBaseInfo = uploadToken.fileBaseInfo;
            int totalRetryTimes = this.listener.getTotalRetryTimes();
            if (!result.isSuccess() && TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("[commitUploadStatsRecord] bizCode=");
                sb2.append(uploadToken.bizCode);
                sb2.append(",statusCode=");
                sb2.append(result.getStatusCode());
                sb2.append(",errType=");
                sb2.append(result.getErrType());
                sb2.append(",errCode=");
                sb2.append(sb.toString());
                sb2.append(",retryTimes=");
                sb2.append(totalRetryTimes);
                sb2.append(",fileType=");
                sb2.append(fileBaseInfo.fileType);
                sb2.append(",fileSize=");
                sb2.append(fileBaseInfo.fileSize);
                sb2.append(",totalTime=");
                sb2.append(this.listener.getUploadTotalTime());
                sb2.append(",segmentNum=");
                sb2.append(this.listener.segmentNum);
                sb2.append(",serverRT=");
                sb2.append(this.listener.serverRT);
                TBSdkLog.e(TAG, sb2.toString());
            }
            IUploadStats iUploadStats = Mtop.instance(null).getMtopConfig().uploadStats;
            if (isRegistered.compareAndSet(false, true)) {
                registerUploadStats(iUploadStats);
            }
            if (iUploadStats == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("bizCode", uploadToken.bizCode);
            hashMap.put("statusCode", String.valueOf(result.getStatusCode()));
            hashMap.put("errType", result.getErrType());
            hashMap.put("errCode", sb.toString());
            hashMap.put("retryTimes", String.valueOf(totalRetryTimes));
            hashMap.put(d.PARAM_UPLOAD_FILE_TYPE, fileBaseInfo.fileType);
            hashMap.put("segmentNum", String.valueOf(this.listener.segmentNum));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("totalTime", Double.valueOf(this.listener.getUploadTotalTime()));
            hashMap2.put("fileSize", Double.valueOf(fileBaseInfo.fileSize));
            hashMap2.put("serverRT", Double.valueOf(this.listener.serverRT));
            iUploadStats.onCommit(UploadConstants.UPLOAD_MODULE, UploadConstants.UPLOAD_MONITOR_POINT, hashMap, hashMap2);
        } catch (Throwable th) {
            TBSdkLog.e(TAG, "[commitUTRecord]  fileUpload commit UploadStats record error.---" + th.toString());
        }
    }

    private void registerUploadStats(IUploadStats iUploadStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c1130cb", new Object[]{this, iUploadStats});
            return;
        }
        try {
            if (iUploadStats == null) {
                if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    return;
                }
                TBSdkLog.e(TAG, "registerUploadStats failed,uploadStats is null.");
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add("bizCode");
            hashSet.add("statusCode");
            hashSet.add("errType");
            hashSet.add("errCode");
            hashSet.add("retryTimes");
            hashSet.add(d.PARAM_UPLOAD_FILE_TYPE);
            hashSet.add("segmentNum");
            HashSet hashSet2 = new HashSet();
            hashSet2.add("totalTime");
            hashSet2.add("fileSize");
            hashSet2.add("serverRT");
            iUploadStats.onRegister(UploadConstants.UPLOAD_MODULE, UploadConstants.UPLOAD_MONITOR_POINT, hashSet, hashSet2, false);
        } catch (Throwable th) {
            TBSdkLog.w(TAG, "[registerUploadStats]register UploadStats error ---", th);
        }
    }
}
