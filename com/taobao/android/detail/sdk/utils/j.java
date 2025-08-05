package com.taobao.android.detail.sdk.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.ewm;
import tb.jko;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PAGE_EVENT_ID = 65172;
    public static final String PAGE_NAME = "Page_Detail";
    public static final String TAG_API_REQUEST = "mReq";
    public static final String TAG_CREATE_DETAIL_MODEL = "mCreateDetailModel";
    public static final String TAG_CREATE_LAYOUT_MODEL = "mCreateLayoutModel";
    public static final String TAG_CREATE_MAIN = "mLoad";
    public static final String TAG_CREATE_PROTOCOL_MAP = "mCreateProtocolMap";
    public static final String TAG_CREATE_VIEW_MODEL = "mCreateViewModel";
    public static final String TAG_DESC_LOAD = "desc_load";
    public static final String TAG_FETCH_TEMPLATE = "mFetchTemplate";
    public static final String TAG_INIT = "mInit";
    public static final String TAG_LOAD = "load";
    public static final String TAG_MTOP = "mMtop";
    public static final String TAG_PROCESS_DATA = "mProcessData";
    public static final String TAG_TEMPLATE_ARRIVED_PHASE = "mTemplateArrivedPhase";
    public static final String TAG_TEMPLATE_FROM_FILE = "mTemplateFromFile";
    public static final String TAG_TEMPLATE_FROM_MEM = "mTemplateFromMem";
    public static final String TAG_TEMPLATE_FROM_NETWORK = "mTemplateFromNetwork";
    public static final String TAG_TEMPLATE_PARSE_JSON = "mTemplateParseJSON";
    public static final String TAG_THREAD_SWITCH = "mThreadSwitch";
    public static final String TAG_UPDATE_MAIN = "mUpdate";

    static {
        kge.a(1790270549);
        tpc.a("com.taobao.android.detail.sdk.utils.SDKPerfMonitor");
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            ewm.a(65172, "Page_Detail", str);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            ewm.b(65172, "Page_Detail", str);
        }
    }

    public static void a(HashMap<String, jko> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{hashMap});
            return;
        }
        jko jkoVar = null;
        long j = 0;
        for (jko jkoVar2 : hashMap.values()) {
            long j2 = jkoVar2.e + jkoVar2.f + jkoVar2.g + jkoVar2.h;
            if (j2 > j) {
                jkoVar = jkoVar2;
                j = j2;
            }
        }
        if (jkoVar == null) {
            return;
        }
        ewm.a(65172, "Page_Detail", "mTemplateArrivedPhase", jkoVar.d);
        ewm.a(65172, "Page_Detail", "mTemplateFromMem", jkoVar.e);
        ewm.a(65172, "Page_Detail", "mTemplateFromFile", jkoVar.f);
        ewm.a(65172, "Page_Detail", "mTemplateFromNetwork", jkoVar.g);
        ewm.a(65172, "Page_Detail", "mTemplateParseJSON", jkoVar.h);
    }
}
