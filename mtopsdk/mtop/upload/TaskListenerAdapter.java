package mtopsdk.mtop.upload;

import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.d;
import com.uploader.export.e;
import com.uploader.export.i;
import com.uploader.export.j;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import tb.kge;

/* loaded from: classes9.dex */
public class TaskListenerAdapter implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.TaskListenerAdapter";
    private DefaultFileUploadListenerWrapper listenerWrapper;
    private UploadFileInfo uploadFileInfo;

    static {
        kge.a(1455941266);
        kge.a(1593071130);
    }

    public TaskListenerAdapter(UploadFileInfo uploadFileInfo, DefaultFileUploadListenerWrapper defaultFileUploadListenerWrapper) {
        this.listenerWrapper = defaultFileUploadListenerWrapper;
        this.uploadFileInfo = uploadFileInfo;
    }

    @Override // com.uploader.export.d
    public void onWait(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be90445", new Object[]{this, iVar});
        } else if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
        } else {
            TBSdkLog.i(TAG, "onWait called.");
        }
    }

    @Override // com.uploader.export.d
    public void onStart(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ee4d16", new Object[]{this, iVar});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "onStart called.");
        }
        this.listenerWrapper.onStart();
    }

    @Override // com.uploader.export.d
    public void onResume(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc5b564d", new Object[]{this, iVar});
        } else if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
        } else {
            TBSdkLog.i(TAG, "onResume called.");
        }
    }

    @Override // com.uploader.export.d
    public void onPause(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a48f02", new Object[]{this, iVar});
        } else if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
        } else {
            TBSdkLog.i(TAG, "onPause called.");
        }
    }

    @Override // com.uploader.export.d
    public void onSuccess(i iVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ea4aef", new Object[]{this, iVar, eVar});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "onSuccess called.");
        }
        this.listenerWrapper.onFinish(this.uploadFileInfo, eVar.b());
        doRemove();
    }

    @Override // com.uploader.export.d
    public void onFailure(i iVar, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b751f291", new Object[]{this, iVar, jVar});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "onFailure called.");
        }
        this.listenerWrapper.onError(jVar.f24058a, jVar.b, jVar.c);
        doRemove();
    }

    @Override // com.uploader.export.d
    public void onCancel(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("227e67e0", new Object[]{this, iVar});
        } else if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
        } else {
            TBSdkLog.i(TAG, "onCancel called.");
        }
    }

    @Override // com.uploader.export.d
    public void onProgress(i iVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b04c96", new Object[]{this, iVar, new Integer(i)});
        } else {
            this.listenerWrapper.onProgress(i);
        }
    }

    private void doRemove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c891f6", new Object[]{this});
        } else {
            FileUploadMgr.getInstance().removeArupTask(this.uploadFileInfo);
        }
    }
}
