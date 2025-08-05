package com.taobao.android.detail.ttdetail.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.common.Constants;
import java.util.HashMap;
import java.util.Map;
import tb.eaz;
import tb.iyx;
import tb.kge;
import tb.lqv;
import tb.odg;

/* loaded from: classes5.dex */
public class x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-702127616);
    }

    public static Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        Application a2 = f.a();
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Build.MODEL);
        hashMap.put("osVersion", Build.VERSION.SDK_INT + "");
        hashMap.put("soVersion", "2.0");
        hashMap.put("appReqFrom", "detail");
        hashMap.put("spm-cnt", odg.s().a());
        hashMap.put("dinamic_v3", "true");
        hashMap.put("newStruct", "true");
        if (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sTryRequestDetail2))) {
            hashMap.put("mockDetailPageVersion", "2.0");
        }
        if (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sTryRequestIndustry))) {
            hashMap.put("mockDetailPageVersion", "industry");
        }
        if (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sCropMtopData))) {
            hashMap.put("reqMergeCropping", "true");
        }
        if (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sRequestWithDebugMode))) {
            hashMap.put(Constants.SP_KEY_DEBUG_MODE, "true");
        }
        hashMap.put("finalUltron", "true");
        hashMap.put("ultron2", "true");
        hashMap.put("container_type", eaz.DINAMIC_MODULE_NAME);
        hashMap.put(iyx.PARAM_VIDEO_AUTO_PLAY, String.valueOf(n.c(f.a())));
        hashMap.put("supportIndustryMainPic", "true");
        hashMap.put("dynamicJsonData", "true");
        hashMap.put(iyx.PARAM_IS_PAD_DEVICE, String.valueOf(e.b()));
        a(hashMap);
        a(a2, hashMap);
        return hashMap;
    }

    private static void a(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        lqv a2 = e.a();
        if (a2.f30840a == 3) {
            str = "high";
        } else {
            str = a2.f30840a == 2 ? "medium" : "low";
        }
        map.put("deviceLevel", str);
    }

    private static void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
            return;
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
            map.put(com.taobao.android.detail2.core.framework.data.model.d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, String.valueOf(displayMetrics.widthPixels));
            map.put("screenHeight", String.valueOf(displayMetrics.heightPixels));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
