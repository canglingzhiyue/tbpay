package com.taobao.tao.detail.biz.adapter;

import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class DetailProfilerAdapter {
    public static final String PAGE_LOG_LOCALTIME = "Detail_LocalTime";
    public static final String TAG_NETWORK = "aNet";
    public static final String TAG_PARSE = "aParse";

    /* loaded from: classes8.dex */
    public interface DetailProfiler extends Serializable {
        void onLoadTimeBegin(String str);

        void onLoadTimeBegin(String str, boolean z);

        void onLoadTimeEnd(String str);
    }

    static {
        kge.a(-509070597);
        tpc.a("com.taobao.tao.detail.biz.adapter.DetailProfilerAdapter");
    }
}
