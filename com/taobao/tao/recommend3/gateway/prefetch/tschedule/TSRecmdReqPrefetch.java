package com.taobao.tao.recommend3.gateway.prefetch.tschedule;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tscheduleprotocol.CustomScheduleProtocol;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.lap;
import tb.opk;
import tb.opl;
import tb.opm;

/* loaded from: classes8.dex */
public class TSRecmdReqPrefetch implements CustomScheduleProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String COMMON = "common";
    private static final String ORDER_LIST = "orderlist";
    private static final String PAY_SUCCESS = "paysuccess";
    public static final String PREFETCH_PARAMS = "prefetchParams";
    public static final String PREFETCH_PARAMS_IGNORE = "ignores";
    public static final String PREFETCH_PARAMS_PREFETCH = "prefetch";
    public static final String PREFETCH_PARAMS_TIMEOUT = "timeout";
    private static final String SCENE = "scene";
    private static final String TAG = "TSRecmdReqPrefetch";
    private final Map<String, a> mPrefetchMap = new HashMap();

    static {
        kge.a(941601830);
        kge.a(-723117889);
    }

    public TSRecmdReqPrefetch() {
        this.mPrefetchMap.put("orderlist", new opl());
        this.mPrefetchMap.put("paysuccess", new opm());
        this.mPrefetchMap.put("common", new opk());
    }

    @Override // com.taobao.android.tscheduleprotocol.CustomScheduleProtocol
    public void preload(Context context, String str, ScheduleProtocolCallback scheduleProtocolCallback, JSONObject jSONObject, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b43e4cd", new Object[]{this, context, str, scheduleProtocolCallback, jSONObject, objArr});
        } else if (jSONObject == null) {
            lap.a("recmdPrefetch", TAG, "jsonObject == null");
        } else {
            a aVar = this.mPrefetchMap.get(jSONObject.getString("scene"));
            if (aVar == null) {
                lap.a("recmdPrefetch", TAG, "recommendPrefetch == null");
                return;
            }
            lap.a("recmdPrefetch", TAG, "nav的链接是： " + str);
            aVar.a(str, jSONObject);
        }
    }
}
