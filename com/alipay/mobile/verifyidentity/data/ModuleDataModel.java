package com.alipay.mobile.verifyidentity.data;

import android.os.SystemClock;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.verifyidentity.log.TimeCostLog;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ModuleDataModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5858a = "ModuleDataModel";
    public String data;
    public String envType;
    public String nextStep;
    public String sceneId;
    public String token;
    public String useBird;

    public static ModuleDataModel parse(String str) {
        ModuleDataModel moduleDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModuleDataModel) ipChange.ipc$dispatch("673a43e5", new Object[]{str});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            String str2 = new String(Base64.decode(str, 0), "UTF-8");
            TimeCostLog.log(f5858a, "模块数据Base64反解耗时：", elapsedRealtime);
            moduleDataModel = (ModuleDataModel) JSON.parseObject(str2, ModuleDataModel.class);
        } catch (Exception e) {
            VerifyLogCat.e(f5858a, "模块数据Json解析失败！", e);
            moduleDataModel = null;
        }
        TimeCostLog.log(f5858a, "解析模块数据总耗时：", elapsedRealtime);
        return moduleDataModel;
    }
}
