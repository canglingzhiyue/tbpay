package com.taobao.search.common.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.tinct.ITinctOperater;
import java.util.Map;
import tb.dpl;
import tb.itw;
import tb.kge;

/* loaded from: classes7.dex */
public class ab implements itw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1225724978);
        kge.a(548598251);
    }

    @Override // tb.itw
    public void a(Map<String, TemplateBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map != null && r.bd()) {
            for (Map.Entry<String, TemplateBean> entry : map.entrySet()) {
                TemplateBean value = entry.getValue();
                if (value != null && !TextUtils.isEmpty(value.isGray)) {
                    boolean equals = TextUtils.equals(value.isGray, "true");
                    ITinctOperater.getInstance().markUsed("magellan", value.templateName, value.version, "Page_Search", equals);
                    com.taobao.android.searchbaseframe.util.k.d(dpl.LOG_TAG, "无线运维灰度模板染色，isGray=" + equals + ", templateName=" + value.templateName, new Object[0]);
                }
            }
        }
    }
}
