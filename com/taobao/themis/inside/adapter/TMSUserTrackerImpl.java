package com.taobao.themis.inside.adapter;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.o;
import com.ut.device.UTDevice;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTPageStatus;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class TMSUserTrackerImpl implements IUserTrackerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2105066672);
        kge.a(314565071);
    }

    @Override // com.taobao.themis.kernel.adapter.IUserTrackerAdapter
    public void customAdvance(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38cf47b", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        try {
            customAdvance(str, str2, str3, str4, str5, map, null);
        } catch (Exception e) {
            TMSLogger.b("TMSUserTrackerImpl", m.CUSTOM_ADVANCE, e);
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IUserTrackerAdapter
    public void customAdvance(String str, String str2, String str3, String str4, String str5, Map<String, String> map, Map<String, ?> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d401aa", new Object[]{this, str, str2, str3, str4, str5, map, map2});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str2, Integer.parseInt(str), str3, str4, str5, map).build());
        } catch (NumberFormatException e) {
            TMSLogger.c("TMSUserTrackerImpl", e.getLocalizedMessage());
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IUserTrackerAdapter
    public void skipPage(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3613c7", new Object[]{this, activity});
            return;
        }
        TMSLogger.d("TMSUserTrackerImpl", m.SKIP_PAGE);
        if (activity == null) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().skipPage(activity);
    }

    @Override // com.taobao.themis.kernel.adapter.IUserTrackerAdapter
    public void pvWithRouterIndex(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e48fdd6", new Object[]{this, activity});
            return;
        }
        TMSLogger.d("TMSUserTrackerImpl", "pvWithRouterIndex");
        if (activity == null) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageStatus(activity, UTPageStatus.UT_PV_WITH_ROUTER_INDEX);
    }

    @Override // com.taobao.themis.kernel.adapter.IUserTrackerAdapter
    public void pageAppear(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77f6849d", new Object[]{this, activity});
            return;
        }
        TMSLogger.d("TMSUserTrackerImpl", m.PAGE_APPEAR);
        if (activity == null) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(activity);
    }

    @Override // com.taobao.themis.kernel.adapter.IUserTrackerAdapter
    public void pageAppearWithRouter(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b97e49d7", new Object[]{this, activity, new Integer(i)});
            return;
        }
        TMSLogger.d("TMSUserTrackerImpl", "pageAppearWithRouter");
        if (activity == null) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageAppearWithRouter(activity, null, i);
    }

    @Override // com.taobao.themis.kernel.adapter.IUserTrackerAdapter
    public void pageDisappear(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee04c96d", new Object[]{this, activity});
            return;
        }
        TMSLogger.d("TMSUserTrackerImpl", m.PAGE_DISAPPEAR);
        if (activity == null) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
    }

    @Override // com.taobao.themis.kernel.adapter.IUserTrackerAdapter
    public void updatePageProperties(Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb5e3e1", new Object[]{this, activity, map});
        } else if (activity == null || map == null) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, map);
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IUserTrackerAdapter
    public void updateNextPageProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203bbc0", new Object[]{this, map});
        } else if (map == null) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IUserTrackerAdapter
    public void updatePageUtParam(Activity activity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbd0ca1", new Object[]{this, activity, jSONObject});
        } else if (activity == null || jSONObject == null) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(activity, jSONObject.toJSONString());
            if (!n.q()) {
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(jSONObject.toJSONString());
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IUserTrackerAdapter
    public void updateNextPageUtParam(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243c2686", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(jSONObject.toJSONString());
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IUserTrackerAdapter
    public void updatePageName(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca06ef46", new Object[]{this, activity, str});
        } else if (activity == null || StringUtils.isEmpty(str)) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(activity, str);
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IUserTrackerAdapter
    public void updatePageUrl(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("235542fa", new Object[]{this, activity, str});
        } else if (activity == null || StringUtils.isEmpty(str)) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUrl(activity, o.b(str));
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IUserTrackerAdapter
    public String getUtdid(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b1e76f1d", new Object[]{this, activity}) : UTDevice.getUtdid(activity);
    }
}
