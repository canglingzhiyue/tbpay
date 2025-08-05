package mtopsdk.mtop.upload;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import tb.kge;

/* loaded from: classes9.dex */
public class DefaultFileUploadListener implements FileUploadBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.DefaultFileUploadListener";
    private FileUploadListener oldListener;

    static {
        kge.a(315861102);
        kge.a(1696106886);
    }

    public DefaultFileUploadListener() {
    }

    public DefaultFileUploadListener(FileUploadListener fileUploadListener) {
        this.oldListener = fileUploadListener;
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        FileUploadListener fileUploadListener = this.oldListener;
        if (fileUploadListener != null) {
            fileUploadListener.onStart();
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            return;
        }
        TBSdkLog.d(TAG, "[onStart]onStart called., ThreadName:" + Thread.currentThread().getName());
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
    public void onProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
            return;
        }
        FileUploadListener fileUploadListener = this.oldListener;
        if (fileUploadListener != null) {
            fileUploadListener.onProgress(i);
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            return;
        }
        TBSdkLog.d(TAG, "[onProgress]onProgress (percentage=" + i + "), ThreadName:" + Thread.currentThread().getName());
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
    public void onFinish(UploadFileInfo uploadFileInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d514e0", new Object[]{this, uploadFileInfo, str});
            return;
        }
        FileUploadListener fileUploadListener = this.oldListener;
        if (fileUploadListener != null) {
            fileUploadListener.onFinish(str);
        } else {
            onFinish(str);
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener
    public void onError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
            return;
        }
        FileUploadListener fileUploadListener = this.oldListener;
        if (fileUploadListener != null) {
            fileUploadListener.onError(str2, str3);
        } else {
            onError(str2, str3);
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadListener
    @Deprecated
    public void onError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
        } else if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
        } else {
            TBSdkLog.d(TAG, "[onError]onError errCode=" + str + ", errMsg=" + str2 + " , ThreadName:" + Thread.currentThread().getName());
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadListener
    @Deprecated
    public void onFinish(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99807463", new Object[]{this, str});
        } else if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
        } else {
            TBSdkLog.d(TAG, "[onFinish]onFinish url=" + str + ", ThreadName:" + Thread.currentThread().getName());
        }
    }
}
