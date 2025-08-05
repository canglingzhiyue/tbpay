package com.taobao.weex.adapter;

import com.taobao.android.nav.r;
import com.taobao.vessel.utils.b;
import tb.kge;

/* loaded from: classes9.dex */
public class TBWXNavProcessorNodeUriFilterItem0 extends r {
    static {
        kge.a(308388404);
    }

    public TBWXNavProcessorNodeUriFilterItem0() {
        addQueryFilter("wh_weex");
        addQueryFilter(b.WX_TPL);
        addQueryFilter("_wx_devtool");
        addQueryFilter("_wx_f_");
    }
}
