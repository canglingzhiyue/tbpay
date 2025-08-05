package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.apk.ApkUpdateContext;
import com.taobao.update.apk.MainUpdateData;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.framework.b;

/* loaded from: classes9.dex */
public class rfh implements b<ApkUpdateContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int UpdateDataDiskFreeSize;

    static {
        kge.a(-1131403372);
        kge.a(-386319410);
        UpdateDataDiskFreeSize = 100;
    }

    @Override // com.taobao.update.framework.b
    public void execute(ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeed841b", new Object[]{this, apkUpdateContext});
        } else if (!TextUtils.isEmpty(apkUpdateContext.apkPath)) {
        } else {
            if (rgq.getNetworkType() == 0) {
                apkUpdateContext.success = false;
                apkUpdateContext.errorCode = -22;
                apkUpdateContext.errorMsg = rgq.getAppNameString(R.string.notice_update_err_nonetwork, UpdateRuntime.sAppName);
            } else if (apkUpdateContext.skipUpdate()) {
                apkUpdateContext.success = false;
                apkUpdateContext.errorCode = -23;
                apkUpdateContext.errorMsg = "不满足网络条件";
            } else {
                String storePath = rgq.getStorePath(apkUpdateContext.context);
                MainUpdateData mainUpdateData = apkUpdateContext.mainUpdate;
                if (rgq.hasEnoughSpace(storePath, mainUpdateData.size == 0 ? (UpdateDataDiskFreeSize << 10) << 10 : mainUpdateData.size)) {
                    return;
                }
                apkUpdateContext.success = false;
                apkUpdateContext.errorCode = -21;
                apkUpdateContext.errorMsg = rgq.getAppNameString(R.string.update_no_sdcard_space, UpdateRuntime.sAppName);
            }
        }
    }
}
