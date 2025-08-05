package com.alipay.android.msp.drivers.legacyapi;

import android.content.Context;
import com.alipay.android.app.helper.Tid;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.android.msp.framework.helper.TidHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TidSyncApi extends JSPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.app.template.JSPlugin
    public String pluginName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a669a95b", new Object[]{this}) : "tid.sync_tid";
    }

    @Override // com.alipay.android.app.template.JSPlugin
    public Object execute(JSPlugin.FromCall fromCall, String str, String str2, FBDocument fBDocument, long j, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("796c594e", new Object[]{this, fromCall, str, str2, fBDocument, new Long(j), context});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Tid loadOrCreateTID = TidHelper.loadOrCreateTID(context);
            String tid = loadOrCreateTID == null ? null : loadOrCreateTID.getTid();
            LogUtil.record(2, "TidSyncApi::loadOrCreateTID", "tid info=".concat(String.valueOf(tid)));
            jSONObject.put("tid", tid);
        } catch (Throwable th) {
            LogUtil.record(8, "TidSyncApi::loadOrCreateTID", "error");
            LogUtil.printExceptionStackTrace(th);
        }
        return jSONObject.toString();
    }
}
