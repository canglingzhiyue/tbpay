package com.taobao.umipublish.monitor;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.hnl;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016JB\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/taobao/umipublish/monitor/UmiPublishMonitorImpl;", "Lcom/taobao/android/litecreator/sdk/interfaces/IMonitor;", "()V", "commitInfo", "", "info", "", "location", "data", "Lcom/alibaba/fastjson/JSONObject;", "commitWarning", "errMsg", "errCode", "subErrCode", "errInfo", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class UmiPublishMonitorImpl implements hnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1413494359);
        kge.a(79946893);
    }

    @Override // tb.hnl
    public void commitInfo(String info, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a58750", new Object[]{this, info, str, jSONObject});
            return;
        }
        q.d(info, "info");
        UmiPublishMonitor.a().a("umi_default", str, info, jSONObject);
    }

    @Override // tb.hnl
    public void commitWarning(String errMsg, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b80e152", new Object[]{this, errMsg, str, str2, str3, str4, jSONObject});
            return;
        }
        q.d(errMsg, "errMsg");
        UmiPublishMonitor.a().a("umi_default", str4, str, errMsg, str3, str2);
    }
}
