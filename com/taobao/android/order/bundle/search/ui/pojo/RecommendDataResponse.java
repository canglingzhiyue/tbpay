package com.taobao.android.order.bundle.search.ui.pojo;

import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class RecommendDataResponse implements Serializable {
    public String debuginfo;
    public String pvid;
    public List<RecommendShop> recommendShop;
    public List<RecommendItem> result;
    public String scm;
    public String solutionCluster;
    public String solutionHost;
    public String solutionid;
    public String time_used;
    public String version;

    static {
        kge.a(633292905);
        kge.a(1028243835);
    }
}
