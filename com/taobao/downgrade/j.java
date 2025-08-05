package com.taobao.downgrade;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

/* loaded from: classes.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_COST_TIME = "api_cost_time";
    public static final String EVENT_PAGE_MASTER = "AliDowngradeSDK.master";
    public static final String EVENT_PAGE_SLAVE = "AliDowngradeSDK.slave";

    /* renamed from: a  reason: collision with root package name */
    private UTOriginalCustomHitBuilder f17075a;
    private Map<String, String> b;

    public j(String str, String str2, String str3, Map<String, String> map) {
        this.b = map;
        this.b.put(API_COST_TIME, String.valueOf(f.a()));
        this.f17075a = new UTOriginalCustomHitBuilder("AliDowngradeSDK", 19999, str, str2, str3, this.b);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(this.f17075a.build());
        }
    }
}
