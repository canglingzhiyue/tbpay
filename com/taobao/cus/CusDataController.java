package com.taobao.cus;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.cus.config.model.CusContentModel;
import com.taobao.tao.Globals;
import com.taobao.update.datasource.local.UpdateInfo;
import java.io.Serializable;
import tb.kge;
import tb.mre;
import tb.mrh;
import tb.nkt;
import tb.rfy;

/* loaded from: classes7.dex */
public class CusDataController {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private CusContentModel f16933a;
    private UpdateInfo.UpdateData b;
    private ApkDownloadContext c;

    /* loaded from: classes7.dex */
    public static class ApkDownloadContext implements Serializable {
        public String appVersion;
        public String downloadUrl;
        public String fileMd5;
        public String fileName;
        public String filePath;
        public long fileSize;

        static {
            kge.a(1682934025);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-566550842);
    }

    public CusContentModel a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CusContentModel) ipChange.ipc$dispatch("4bf7173a", new Object[]{this});
        }
        if (this.f16933a == null) {
            String b = mrh.b(mrh.SP_KEY_UPDATE_MODEL, "");
            if (!StringUtils.isEmpty(b)) {
                CusContentModel cusContentModel = (CusContentModel) JSONObject.parseObject(b, CusContentModel.class);
                if (!b(cusContentModel)) {
                    com.alibaba.poplayer.utils.c.a("UpdateDataController.getApkUpdateModel.updateContentModel.Invalid.return.null.", new Object[0]);
                    return null;
                }
                this.f16933a = cusContentModel;
            }
        }
        return this.f16933a;
    }

    public void a(CusContentModel cusContentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b13023a", new Object[]{this, cusContentModel});
        } else if (!b(cusContentModel)) {
        } else {
            this.f16933a = cusContentModel;
            mrh.a(mrh.SP_KEY_UPDATE_MODEL, JSON.toJSONString(cusContentModel));
        }
    }

    public UpdateInfo.UpdateData b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdateInfo.UpdateData) ipChange.ipc$dispatch("820929d7", new Object[]{this});
        }
        if (this.b == null) {
            this.b = rfy.getInstance().getApkUpdateData();
        }
        return this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        CusContentModel a2 = a();
        if (a2 == null) {
            com.alibaba.poplayer.utils.c.a("UpdateDataController.needUpdate.apkUpdateModel=null.return.false.", new Object[0]);
            return false;
        } else if (a2.needUpdate) {
            return nkt.b(a2.updateAppVersion, Globals.getVersionName()) > 0;
        } else {
            com.alibaba.poplayer.utils.c.a("UpdateDataController.needUpdate.apkUpdateModel.needUpdate=false.return.false.", new Object[0]);
            return false;
        }
    }

    private boolean b(CusContentModel cusContentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cbca85d", new Object[]{this, cusContentModel})).booleanValue();
        }
        if (cusContentModel == null) {
            return false;
        }
        if (!cusContentModel.success) {
            com.alibaba.poplayer.utils.c.a("UpdateDataController.isUpdateContentValid.apkUpdateModel.success=false.", new Object[0]);
            return false;
        }
        long i = mre.a().i();
        long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp(false);
        boolean z = cusContentModel.serverTimestamp + (1000 * i) < currentTimeStamp;
        com.alibaba.poplayer.utils.c.a("UpdateDataController.isUpdateContentValid.dataOutOfTime=%s.updateDataValidInterval=%s.curTime=%s.serverTimestamp=%s.", Boolean.valueOf(z), Long.valueOf(i), Long.valueOf(currentTimeStamp), Long.valueOf(cusContentModel.serverTimestamp));
        if (z || StringUtils.isEmpty(cusContentModel.localAppVersion)) {
            return false;
        }
        String versionName = Globals.getVersionName();
        boolean z2 = nkt.b(cusContentModel.localAppVersion, versionName) != 0;
        com.alibaba.poplayer.utils.c.a("UpdateDataController.isUpdateContentValid.versionChanged=%s.curAppVersion=%s.localAppVersion=%s.", Boolean.valueOf(z2), versionName, cusContentModel.localAppVersion);
        return !z2;
    }

    public ApkDownloadContext d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApkDownloadContext) ipChange.ipc$dispatch("9c394cb3", new Object[]{this});
        }
        if (this.c == null) {
            String b = mrh.b(mrh.SP_KEY_LAST_DOWNLOAD_CONTEXT_PRE, "");
            if (!StringUtils.isEmpty(b)) {
                this.c = (ApkDownloadContext) JSONObject.parseObject(b, ApkDownloadContext.class);
            }
        }
        return this.c;
    }

    public void a(ApkDownloadContext apkDownloadContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df927430", new Object[]{this, apkDownloadContext});
            return;
        }
        this.c = apkDownloadContext;
        mrh.a(mrh.SP_KEY_LAST_DOWNLOAD_CONTEXT_PRE, apkDownloadContext != null ? JSONObject.toJSONString(apkDownloadContext) : "");
    }
}
