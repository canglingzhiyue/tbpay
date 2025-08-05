package mtopsdk.mtop.upload;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.upload.domain.UploadConstants;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import mtopsdk.mtop.upload.domain.UploadResult;
import mtopsdk.mtop.upload.domain.UploadToken;
import mtopsdk.mtop.upload.service.UploadFileService;
import mtopsdk.mtop.util.Result;
import tb.kge;

/* loaded from: classes9.dex */
public class SegmentFileUploadTask extends FileUploadTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.SegmentFileUploadTask";
    private long offset;
    private UploadToken token;
    private UploadFileService uploadService;

    static {
        kge.a(-2013970511);
    }

    public static /* synthetic */ Object ipc$super(SegmentFileUploadTask segmentFileUploadTask, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public SegmentFileUploadTask(UploadFileInfo uploadFileInfo, DefaultFileUploadListenerWrapper defaultFileUploadListenerWrapper, UploadToken uploadToken, long j, UploadFileService uploadFileService) {
        super(uploadFileInfo, defaultFileUploadListenerWrapper);
        this.token = uploadToken;
        this.offset = j;
        this.uploadService = uploadFileService;
    }

    @Override // mtopsdk.mtop.upload.FileUploadTask
    public void upload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f170aa08", new Object[]{this});
        } else if (isCancelled()) {
        } else {
            int i = 0;
            do {
                Result<UploadResult> fileUpload = this.uploadService.fileUpload(this.token, this.offset, i);
                if (isCancelled()) {
                    return;
                }
                boolean isSuccess = fileUpload.isSuccess();
                if (isSuccess) {
                    UploadResult model = fileUpload.getModel();
                    notifyProgress(this.token.uploadedLength.addAndGet(Math.min(this.token.segmentSize, this.token.fileBaseInfo.fileSize - this.offset)), this.token.fileBaseInfo.fileSize);
                    if (fileUpload.getModel().isFinish) {
                        this.listener.onFinish(this.fileInfo, model.location);
                        parseServerRT(model.serverRT);
                        commitUploadStatsRecord(fileUpload, this.token);
                        FileUploadMgr.getInstance().removeTask(this.fileInfo);
                        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                            return;
                        }
                        TBSdkLog.d(TAG, "[upload]entire file upload succeed.");
                        return;
                    } else if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                        return;
                    } else {
                        TBSdkLog.d(TAG, "[upload] segment upload succeed.offset=" + this.offset);
                        return;
                    }
                }
                if (i == this.token.retryCount && this.listener.isFinished().compareAndSet(false, true)) {
                    this.listener.onError(fileUpload.getErrType(), fileUpload.getErrCode(), fileUpload.getErrInfo());
                    this.listener.cancel();
                    commitUploadStatsRecord(fileUpload, this.token);
                }
                this.listener.countRetryTimes();
                if (UploadConstants.ERRCODE_TOKEN_EXPIRED.equalsIgnoreCase(fileUpload.getErrCode())) {
                    Result<UploadToken> uploadToken = this.uploadService.getUploadToken(this.fileInfo);
                    if (uploadToken.isSuccess()) {
                        this.token = uploadToken.getModel();
                    }
                }
                if (isSuccess) {
                    return;
                }
                i++;
            } while (i <= this.token.retryCount);
        }
    }

    private void parseServerRT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c47c929", new Object[]{this, str});
        } else if (!StringUtils.isNotBlank(str)) {
        } else {
            try {
                this.listener.serverRT = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                TBSdkLog.w(TAG, "[parseServerRT] invalid X-Server-Rt header. X-Server-Rt=" + str);
            }
        }
    }
}
