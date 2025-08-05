package com.taobao.update.dynamicfeature.processor;

import android.support.v4.os.EnvironmentCompat;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.utils.Constants;
import java.io.File;
import tb.kge;
import tb.rfy;
import tb.rge;
import tb.rgf;
import tb.rgg;

/* loaded from: classes9.dex */
public class e implements com.taobao.update.framework.b<com.taobao.update.dynamicfeature.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private rge f23408a = rgf.getLog(e.class, (rge) null);

    static {
        kge.a(-735309266);
        kge.a(-386319410);
    }

    @Override // com.taobao.update.framework.b
    public void execute(com.taobao.update.dynamicfeature.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431fae6e", new Object[]{this, bVar});
            return;
        }
        bVar.stage = rgg.ARG_ENV_CHECK;
        File file = new File(bVar.context.getFilesDir(), "featureupdate");
        if (!file.exists()) {
            file.mkdirs();
        }
        long j = bVar.featureUpdateData.size + 62914560;
        if (file.getUsableSpace() <= j) {
            z = false;
        }
        if (!z) {
            Log.e("SpaceCheckProcessor", "low disk");
            this.f23408a.w("low disk");
            file = null;
            File[] externalFilesDirs = rfy.sContext.getExternalFilesDirs("featureupdate");
            if (externalFilesDirs != null && externalFilesDirs.length > 0) {
                File file2 = null;
                for (File file3 : externalFilesDirs) {
                    if (EnvironmentCompat.getStorageState(file3).equals("mounted") && file3.getUsableSpace() > j) {
                        file2 = file3;
                    }
                }
                if (file2 != null && !file2.exists()) {
                    file2.mkdirs();
                }
                if (file2 == null || !file2.exists() || !file2.canWrite()) {
                    bVar.success = false;
                    bVar.errorCode = -21;
                    bVar.errorMsg = Constants.ErrorDesc.spaceError;
                    return;
                }
                file = file2;
            }
        }
        this.f23408a.w("enough space");
        bVar.downloadDir = file.getAbsolutePath();
    }
}
