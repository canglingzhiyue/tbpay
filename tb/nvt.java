package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.parse.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;

@AURAExtensionImpl(code = "overseabuy.impl.nextrpc.attacch.response")
/* loaded from: classes9.dex */
public final class nvt implements ash {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f31792a;

    static {
        kge.a(-2043295267);
        kge.a(-173619745);
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.ash
    public boolean a(AURAParseIO aURAParseIO, String str) {
        String str2;
        String str3;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        boolean z;
        String str4 = "rpcResponseInterval";
        String str5 = "fields";
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a88da6", new Object[]{this, aURAParseIO, str})).booleanValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("cash4android", "nextRpcOpen", "true");
            if (!TextUtils.isEmpty(config) && "false".equals(config)) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (a aVar : aURAParseIO.getData()) {
                JSONObject a2 = aVar.a();
                if (a2 != null && a2.containsKey("data") && (jSONObject = a2.getJSONObject("data")) != null && jSONObject.containsKey("overseaPaymentMethod") && (jSONObject2 = jSONObject.getJSONObject("overseaPaymentMethod")) != null && jSONObject2.containsKey(str5) && (jSONObject3 = jSONObject2.getJSONObject(str5)) != null && jSONObject3.containsKey(str4)) {
                    String string = jSONObject3.getString(str4);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            long parseLong = Long.parseLong(string);
                            z = currentTimeMillis - nsr.b <= parseLong;
                            str2 = str4;
                            try {
                                String[] strArr = new String[i];
                                StringBuilder sb = new StringBuilder();
                                str3 = str5;
                                try {
                                    sb.append("allowMergeInterval:");
                                    sb.append(string);
                                    sb.append(",rpcElementShow:");
                                    sb.append(z);
                                    sb.append(",responseInterval:");
                                    sb.append(parseLong);
                                    strArr[0] = sb.toString();
                                    nan.a("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_oversea_prementpay_rpc", strArr);
                                } catch (Exception e) {
                                    e = e;
                                    TLog.loge("tmgcashier", "OvsFrontCashierNextRPC", "rpcResponseInterval error:" + e.getMessage());
                                    str4 = str2;
                                    str5 = str3;
                                    i = 1;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                str3 = str5;
                                TLog.loge("tmgcashier", "OvsFrontCashierNextRPC", "rpcResponseInterval error:" + e.getMessage());
                                str4 = str2;
                                str5 = str3;
                                i = 1;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str2 = str4;
                        }
                        if (!z) {
                            return true;
                        }
                        str4 = str2;
                        str5 = str3;
                        i = 1;
                    }
                }
                str2 = str4;
                str3 = str5;
                str4 = str2;
                str5 = str3;
                i = 1;
            }
            return false;
        } catch (Exception e4) {
            TLog.loge("tmgcashier", "OvsFrontCashierNextRPC", "handleAttachedResponse error:" + e4.getMessage());
            return false;
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f31792a = qVar;
        }
    }
}
