package com.taobao.themis.external.embed;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/taobao/themis/external/embed/Weex2StartParams;", "Lcom/taobao/themis/external/embed/StartParams;", "Ljava/io/Serializable;", "()V", "initData", "Lcom/alibaba/fastjson/JSONObject;", "getInitData", "()Lcom/alibaba/fastjson/JSONObject;", "setInitData", "(Lcom/alibaba/fastjson/JSONObject;)V", "themis_interface_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class Weex2StartParams extends StartParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject initData;

    static {
        kge.a(1494138107);
        kge.a(1028243835);
    }

    public final JSONObject getInitData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("312669f7", new Object[]{this}) : this.initData;
    }

    public final void setInitData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ded6d", new Object[]{this, jSONObject});
        } else {
            this.initData = jSONObject;
        }
    }
}
