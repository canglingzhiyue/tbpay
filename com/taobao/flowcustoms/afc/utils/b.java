package com.taobao.flowcustoms.afc.utils;

import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.kog;
import tb.koh;
import tb.mpa;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AFC_AFTER_LINK_ROUTER_TIME = "afc_after_link_router_time";
    public static final String AFC_BEFORE_LINK_ROUTER_TIME = "afc_before_link_router_time";
    public static final String AFC_FLOW_LEAVE = "afc_flow_leave";
    public static final String AFC_FLOW_LOCAL_ROUTER = "afc_flow_local_router";
    public static final String AFC_FLOW_REMOTE_ROUTER = "afc_flow_remote_router";
    public static final String AFC_FLOW_ROUTER_AFTER = "afc_flow_router_after";
    public static final String AFC_FLOW_ROUTER_BEFORE = "afc_flow_router_before";
    public static final String AFC_FLOW_TAID = "afc_flow_taid";
    public static final String AFC_FLOW_TRACK = "afc_flow_track";
    public static final String AFC_ID = "afc_id";
    public static final String AFC_LINK_CRASH_MESSAGE = "afc_link_crash_message";
    public static final String AFC_LINK_CRASH_ROUTER_LOCAL = "afc_link_crash_router_local";
    public static final String AFC_LINK_CRASH_ROUTER_URL = "afc_link_crash_router_url";
    public static final String AFC_LINK_CRASH_SMALL_HANDLE = "afc_link_crash_small_handle";
    public static final String AFC_LINK_END = "afc_link_end";
    public static final String AFC_LINK_NAV_START = "afc_link_nav_start";
    public static final String AFC_LINK_ROUTER = "afc_link_router";
    public static final String AFC_LINK_ROUTER_TIME = "afc_link_router_time";
    public static final String AFC_LINK_START = "afc_link_start";
    public static final String AFC_NAV_TIME = "afc_nav_time";
    public static final String AFC_NAV_URL = "afc_nav_url";
    public static final String AFC_REQUEST_TIME = "afc_request_time";
    public static final String AFC_SDK_INIT = "afc_sdk_init";
    public static final String AFC_SDK_INIT_TIME = "afc_sdk_init_time";
    public static final String ALIBC_FLOWCUSTOMS_INIT = "alibc_flowCustoms_init";
    public static final String APPLINK_GATEWAY = "applink_gateway";
    public static final String ARG1_DEVICE_INFO_APPLY_PRIVILEGE_COUNT = "device_info_apply_privilege_count";
    public static final String ARG1_FLOW_BACK = "return_refer_app_click";
    public static final String ARG1_FLOW_EXPOSE = "return_refer_app_expose";
    public static final int EVENT_ID_1013 = 1013;
    public static final int EVENT_ID_19999 = 19999;
    public static final int EVENT_ID_2101 = 2101;
    public static final int EVENT_ID_2201 = 2201;
    public static final String PAGE_FLOWCUSTOMS = "Page_FlowCustoms";

    /* renamed from: a  reason: collision with root package name */
    private static List<Map<String, String>> f17185a;

    public static /* synthetic */ void b(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{str, map});
        } else {
            c(str, map);
        }
    }

    static {
        kge.a(1449649399);
        f17185a = new ArrayList();
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
        } else {
            a(1013, str, str2, str3, map);
        }
    }

    public static void a(int i, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82762f2c", new Object[]{new Integer(i), str, str2, str3, map});
            return;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable unused) {
                c.b(AfcCustomSdk.LOG_TAG_UT, "AfcCustomSdk.error.eventId=" + i);
                return;
            }
        }
        Map<String, String> a2 = a(map);
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(PAGE_FLOWCUSTOMS, i, str, str2, str3, a2);
        c.a(AfcCustomSdk.LOG_TAG_UT, "eventId: " + i + "  arg1: " + str + "  arg2: " + str2 + "  arg3: " + str3 + "  properties: " + a2);
        a(str, uTOriginalCustomHitBuilder.build());
    }

    private static Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        int a2 = kog.a().a(-1);
        boolean a3 = kog.a().a(false);
        String c = kog.a().c(mpa.COLD);
        long a4 = kog.a().a(0L);
        String d = kog.a().d();
        if (!TextUtils.isEmpty(d)) {
            d = d.toLowerCase();
        }
        map.put("isInBackground", String.valueOf(a3));
        map.put("deviceLevel", String.valueOf(a2));
        map.put(koh.COLDBOOT, String.valueOf(c));
        map.put("processId", String.valueOf(Process.myPid()));
        map.put("processStart", String.valueOf(a4));
        map.put("processType", String.valueOf(0));
        if (!"cold".equals(d)) {
            a4 = AfcUtils.b();
        }
        map.put("flowStart", String.valueOf(a4));
        map.put("launchStartType", d);
        return map;
    }

    public static void a(final String str, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else if (kog.a().o) {
            d.b.a(new Runnable() { // from class: com.taobao.flowcustoms.afc.utils.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.b(str, map);
                    }
                }
            });
        } else {
            c.a(AfcCustomSdk.LOG_TAG_UT, "AfcTracker === sendUt === 同步上传数据");
            c(str, map);
        }
    }

    private static void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ec9e51", new Object[]{str, map});
            return;
        }
        try {
            if (!kog.a().n) {
                if (UTAnalytics.getInstance().isInit()) {
                    UTAnalytics.getInstance().getDefaultTracker().send(map);
                    c.a(AfcCustomSdk.LOG_TAG_UT, "AfcTracker === UT初始化成功 " + str + " === 具体参数：" + map.toString());
                    return;
                }
                f17185a.add(map);
            } else {
                UTAnalytics.getInstance().getDefaultTracker().send(map);
                c.a(AfcCustomSdk.LOG_TAG_UT, "AfcTracker === UT标记位初始化成功 " + str + " === 具体参数：" + map.toString());
            }
            c.a(AfcCustomSdk.LOG_TAG_UT, "性能节点: arg1= " + str + " === 具体参数：" + map.toString());
        } catch (Throwable th) {
            c.a(AfcCustomSdk.LOG_TAG_UT, "AfcTracker === sendData2Ut === 异常：" + th.getMessage());
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            kog.a().n = true;
            if (f17185a.size() <= 0) {
                return;
            }
            for (Map<String, String> map : f17185a) {
                UTAnalytics.getInstance().getDefaultTracker().send(map);
                c.a(AfcCustomSdk.LOG_TAG_UT, "AfcTracker === 上传缓存埋点:" + map.toString());
            }
            f17185a.clear();
        } catch (Exception e) {
            c.a(AfcCustomSdk.LOG_TAG_UT, "AfcTracker === 上传缓存的埋点异常:" + e.getMessage());
        }
    }
}
