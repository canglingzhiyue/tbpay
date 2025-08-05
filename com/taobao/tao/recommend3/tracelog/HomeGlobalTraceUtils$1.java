package com.taobao.tao.recommend3.tracelog;

import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes8.dex */
public class HomeGlobalTraceUtils$1 extends HashMap<String, Object> {
    public final /* synthetic */ MtopResponse val$response;
    public final /* synthetic */ String val$traceKey;

    public HomeGlobalTraceUtils$1(String str, MtopResponse mtopResponse) {
        this.val$traceKey = str;
        this.val$response = mtopResponse;
        put(c.b(this.val$traceKey), this.val$response.getMtopStat().toString());
        put(c.c(this.val$traceKey), Boolean.valueOf(this.val$response.isApiSuccess()));
    }
}
