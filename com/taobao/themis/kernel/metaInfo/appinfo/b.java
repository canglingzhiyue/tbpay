package com.taobao.themis.kernel.metaInfo.appinfo;

import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.i;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2000711326);
    }

    public static String a(AppModel appModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4e41d21", new Object[]{appModel});
        }
        if (appModel != null && appModel.getExtendInfos() != null) {
            try {
                String string = appModel.getExtendInfos().getString("bizType");
                if (TextUtils.isEmpty(string)) {
                    return "";
                }
                String string2 = appModel.getExtendInfos().getString(i.SUB_KEY_FRAGMENT_JUMP);
                if (TextUtils.isEmpty(string2)) {
                    return string;
                }
                return string + "_" + string2;
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public static String b(AppModel appModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("980fd062", new Object[]{appModel}) : (appModel == null || appModel.getExtendInfos() == null) ? "" : appModel.getExtendInfos().getString("engineType");
    }

    public static String a(AppModel appModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58b3c257", new Object[]{appModel, str});
        }
        if (appModel == null || appModel.getAppInfoModel() == null || appModel.getAppInfoModel().getSourcemap() == null) {
            return "";
        }
        return appModel.getAppInfoModel().getSourcemap() + "/" + str;
    }
}
