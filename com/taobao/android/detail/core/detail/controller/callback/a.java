package com.taobao.android.detail.core.detail.controller.callback;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import tb.enh;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1499712399);
    }

    public void a(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349c12f3", new Object[]{this, detailCoreActivity});
        }
    }

    public void a(DetailCoreActivity detailCoreActivity, JSONObject jSONObject, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f313cb7", new Object[]{this, detailCoreActivity, jSONObject, bVar});
        }
    }

    public void a(DetailCoreActivity detailCoreActivity, enh enhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587eb124", new Object[]{this, detailCoreActivity, enhVar});
        }
    }
}
