package com.taobao.vpm.pixai;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vpm.VPMAdapterManager;
import com.taobao.vpm.module.AlgLogParams;
import com.taobao.vpm.module.RenderLogParams;
import com.taobao.vpm.utils.VPMConstant;
import com.taobao.vpm.utils.a;
import java.util.HashMap;
import java.util.Map;
import tb.rim;

/* loaded from: classes9.dex */
public class PixAICommit extends rim {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void renderLogCommit(String str, String str2, String str3, String str4, String str5, RenderLogParams renderLogParams, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5012a5c2", new Object[]{this, str, str2, str3, str4, str5, renderLogParams, map});
            return;
        }
        try {
            if (!a.a(VPMAdapterManager.mConfigAdapter.getConfig(VPMConstant.VPM_ORANGE_GROUP_NAME, VPMConstant.ORANGE_ENABLE_PIXELAI, "true"))) {
                return;
            }
            new HashMap();
            Map<String, String> mapParams = renderLogParams.getMapParams();
            if (!TextUtils.isEmpty(str) && str != null) {
                mapParams.put("appName", str);
            }
            if (!TextUtils.isEmpty(str2) && str2 != null) {
                mapParams.put("scene", str2);
            }
            if (!TextUtils.isEmpty(str3) && str3 != null) {
                mapParams.put("renderName", str3);
            }
            if (!TextUtils.isEmpty(str4) && str4 != null) {
                mapParams.put("token", str4);
            }
            if (map != null) {
                mapParams.put("extras", map.toString());
            }
            if (str5 == null) {
                str5 = "";
            }
            trackCustom(VPMConstant.PIXELAI_UI_PAGENAME, VPMConstant.PIXELAI_UT_EVENTID, str5, "", "", mapParams);
        } catch (Throwable unused) {
        }
    }

    public void algLogCommit(String str, String str2, String str3, AlgLogParams algLogParams, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf152f94", new Object[]{this, str, str2, str3, algLogParams, map});
            return;
        }
        try {
            if (!a.a(VPMAdapterManager.mConfigAdapter.getConfig(VPMConstant.VPM_ORANGE_GROUP_NAME, VPMConstant.ORANGE_ENABLE_PIXELAI, "true"))) {
                return;
            }
            new HashMap();
            Map<String, String> mapParams = algLogParams.getMapParams();
            if (!TextUtils.isEmpty(str) && str != null) {
                mapParams.put("scene", str);
            }
            if (!TextUtils.isEmpty(str2) && str2 != null) {
                mapParams.put("renderName", str2);
            }
            if (!TextUtils.isEmpty(str3) || str3 != null) {
                mapParams.put("token", str3);
            }
            if (map != null) {
                mapParams.put("extras", map.toString());
            }
            trackCustom(VPMConstant.PIXELAI_UI_PAGENAME, VPMConstant.PIXELAI_UT_EVENTID, "", "", "", mapParams);
        } catch (Throwable unused) {
        }
    }
}
