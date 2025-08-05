package com.ut.mini.exposure;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ut_exposure_data_spm = -17006;
    public static final int ut_exposure_root_spm = -17005;
    public static final int ut_exprosure_common_info_tag = -17003;
    public static final int ut_exprosure_ignore_tag = -17004;
    public static final int ut_exprosure_tag = -17001;
    public static final int ut_exprosure_tag_for_weex = -17002;

    static {
        kge.a(-2026554280);
    }

    public static void setExposure(View view, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd38d6f", new Object[]{view, str, str2, map});
        } else if (view == null) {
            a.b(null, "error,view is null");
        } else if (TextUtils.isEmpty(str)) {
            a.b(null, "error,block is empty");
        } else if (TextUtils.isEmpty(str2)) {
            a.b(null, "error,viewId is empty");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("UT_EXPROSURE_BLOCK", str);
            hashMap.put("UT_EXPROSURE_VIEWID", str2);
            if (map != null) {
                hashMap.put("UT_EXPROSURE_ARGS", map);
            }
            view.setTag(ut_exprosure_tag, hashMap);
        }
    }

    public static void setExposureSpmAB(View view, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120e43b7", new Object[]{view, str, str2});
        } else if (view == null) {
            a.b(null, "error,view is null");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            a.b(null, "spmA or spmB is empty");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("x-spm-a", str);
            hashMap.put("x-spm-b", str2);
            view.setTag(ut_exposure_root_spm, hashMap);
        }
    }

    public static void setExposureSpmCD(View view, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93011b77", new Object[]{view, str, str2});
        } else if (view == null) {
            a.b(null, "error,view is null");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            a.b(null, "spmC or spmD is empty");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("x-spm-c", str);
            hashMap.put("x-spm-d", str2);
            view.setTag(ut_exposure_data_spm, hashMap);
        }
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else if (view == null) {
            a.b(null, "error,view is null");
        } else {
            view.setTag(ut_exprosure_tag_for_weex, null);
        }
    }

    public static void setExposureForWeex(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e66e72a", new Object[]{view});
        } else if (view == null) {
            a.b(null, "error,view is null");
        } else {
            view.setTag(ut_exprosure_tag_for_weex, "auto");
        }
    }

    public static boolean isExposureViewForWeex(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad8bf97b", new Object[]{view})).booleanValue() : (view == null || view.getTag(ut_exprosure_tag_for_weex) == null) ? false : true;
    }

    public static boolean isExposureView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("45f2f599", new Object[]{view})).booleanValue() : (view == null || view.getTag(ut_exprosure_tag) == null) ? false : true;
    }

    public static boolean isIngoneExposureView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41d17335", new Object[]{view})).booleanValue() : (view == null || view.getTag(ut_exprosure_ignore_tag) == null) ? false : true;
    }

    public static void setIgnoreTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91698b5c", new Object[]{view});
        } else if (view == null) {
        } else {
            view.setTag(ut_exprosure_ignore_tag, "user");
        }
    }

    public static void clearIgnoreTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21db0a11", new Object[]{view});
        } else if (view == null) {
        } else {
            view.setTag(ut_exprosure_ignore_tag, null);
        }
    }

    public static boolean b(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{view})).booleanValue() : (view == null || view.getTag(-17007) == null) ? false : true;
    }

    public static void setViewGroupTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f69018", new Object[]{view});
        } else if (view == null) {
        } else {
            view.setTag(-17007, "1");
        }
    }

    public static void clearViewGroupTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7e9943", new Object[]{view});
        } else if (view == null) {
        } else {
            view.setTag(-17007, null);
        }
    }
}
