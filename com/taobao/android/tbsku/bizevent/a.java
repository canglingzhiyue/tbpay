package com.taobao.android.tbsku.bizevent;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.ContractSelectedRet;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuVerticalNode;
import com.taobao.android.detail.sdk.model.node.ContractNode;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.dwd;
import tb.iyb;
import tb.iyd;
import tb.iye;
import tb.kge;

/* loaded from: classes6.dex */
public class a implements iyd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_detailAction";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, ContractSelectedRet> f15402a = new HashMap();

    static {
        kge.a(1690164377);
        kge.a(-1413102650);
    }

    public static /* synthetic */ String a(a aVar, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7f3e3e8e", new Object[]{aVar, strArr}) : aVar.a(strArr);
    }

    public static /* synthetic */ Map a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1cc6bf22", new Object[]{aVar}) : aVar.f15402a;
    }

    public static /* synthetic */ void a(a aVar, iyb iybVar, String str, String str2, boolean z, Map map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cd5403a", new Object[]{aVar, iybVar, str, str2, new Boolean(z), map, str3});
        } else {
            aVar.a(iybVar, str, str2, z, map, str3);
        }
    }

    @Override // tb.iyd
    public void a(iye iyeVar, final iyb iybVar) {
        JSONObject b;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0c8681", new Object[]{this, iyeVar, iybVar});
        } else if (iyeVar == null || iyeVar.c().size() < 3) {
        } else {
            final String valueOf = String.valueOf(iyeVar.c().get(0));
            String valueOf2 = String.valueOf(iyeVar.c().get(1));
            final String valueOf3 = String.valueOf(iyeVar.c().get(2));
            if (TextUtils.isEmpty(valueOf) || TextUtils.isEmpty(valueOf2) || valueOf3 == null || (b = iyeVar.b()) == null || (jSONObject = b.getJSONObject("fields")) == null || jSONObject.isEmpty()) {
                return;
            }
            String string = jSONObject.getString("itemId");
            String string2 = jSONObject.getString("skuId");
            JSONObject jSONObject5 = null;
            JSONObject m = iybVar.b().m();
            if (m != null && (jSONObject2 = m.getJSONObject(SkuVerticalNode.TAG)) != null && (jSONArray = jSONObject2.getJSONArray("contractData")) != null && !jSONArray.isEmpty()) {
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof JSONObject) && (jSONObject4 = (jSONObject3 = (JSONObject) next).getJSONObject("version")) != null && valueOf3.equalsIgnoreCase(jSONObject4.getString("versionCode"))) {
                        jSONObject5 = jSONObject3;
                    }
                }
            }
            JSONObject jSONObject6 = jSONObject5;
            if (jSONObject6 == null || jSONObject6.isEmpty() || !(iyeVar.a() instanceof Activity)) {
                return;
            }
            final Activity activity = (Activity) iyeVar.a();
            try {
                if ("open_contract_phone_page".equalsIgnoreCase(valueOf2)) {
                    dwd.b(activity, new com.taobao.android.detail.alicom.widget.a() { // from class: com.taobao.android.tbsku.bizevent.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.detail.alicom.widget.a
                        public void a(ContractSelectedRet contractSelectedRet) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d209380a", new Object[]{this, contractSelectedRet});
                                return;
                            }
                            Activity activity2 = activity;
                            if (activity2 == null || activity2.isFinishing() || contractSelectedRet == null) {
                                return;
                            }
                            a.a(a.this).put(contractSelectedRet.versionCode, contractSelectedRet);
                            a.a(a.this, iybVar, valueOf, valueOf3, contractSelectedRet.isSelectedComplete, contractSelectedRet.selectedRetMap, a.a(a.this, new String[]{contractSelectedRet.cityName, contractSelectedRet.planName, contractSelectedRet.phoneNumber}));
                        }
                    }, a(jSONObject6), string, string2, this.f15402a.get(valueOf3));
                } else if ("open_phone_number_sale_page".equalsIgnoreCase(valueOf2)) {
                    dwd.a(activity, new com.taobao.android.detail.alicom.widget.a() { // from class: com.taobao.android.tbsku.bizevent.a.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.detail.alicom.widget.a
                        public void a(ContractSelectedRet contractSelectedRet) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d209380a", new Object[]{this, contractSelectedRet});
                                return;
                            }
                            Activity activity2 = activity;
                            if (activity2 == null || activity2.isFinishing() || contractSelectedRet == null) {
                                return;
                            }
                            a.a(a.this).put(contractSelectedRet.versionCode, contractSelectedRet);
                            a.a(a.this, iybVar, valueOf, valueOf3, contractSelectedRet.isSelectedComplete, contractSelectedRet.selectedRetMap, a.a(a.this, new String[]{contractSelectedRet.cityName, contractSelectedRet.planName, contractSelectedRet.networkName, contractSelectedRet.phoneNumber}));
                        }
                    }, a(jSONObject6), string, string2, this.f15402a.get(valueOf3));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void a(iyb iybVar, String str, String str2, boolean z, Map<String, String> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d759d1b5", new Object[]{this, iybVar, str, str2, new Boolean(z), map, str3});
            return;
        }
        com.alibaba.android.ultron.event.base.f d = iybVar.c().d();
        if (d == null) {
            return;
        }
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("comKey", (Object) str);
        jSONObject.put("elementKey", (Object) str2);
        jSONObject.put("isComplete", (Object) Boolean.valueOf(z));
        if (map != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(map);
            jSONObject.put("params", (Object) jSONObject2);
        }
        if (!TextUtils.isEmpty(str3)) {
            jSONObject.put("selectedTips", (Object) str3);
        }
        com.alibaba.android.ultron.event.base.e a2 = d.a();
        a2.a("adjustState");
        a2.a(new DMEvent("adjustState", new JSONObject() { // from class: com.taobao.android.tbsku.bizevent.ContractOpenHandler$3
            {
                put("subType", "outer_input");
                put("payload", (Object) new JSONObject() { // from class: com.taobao.android.tbsku.bizevent.ContractOpenHandler$3.1
                    {
                        putAll(jSONObject);
                        put("action", "alicom_data_input");
                    }
                });
            }
        }, null));
        d.a(a2);
    }

    private String a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{this, strArr});
        }
        StringBuilder sb = new StringBuilder();
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(",");
                }
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private ContractNode a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContractNode) ipChange.ipc$dispatch("e12563e", new Object[]{this, jSONObject}) : new ContractNode(jSONObject);
    }
}
