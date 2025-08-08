package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.eyx;
import tb.ezm;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class ab implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "setRemind";

    /* renamed from: a  reason: collision with root package name */
    private Context f10673a;
    private eyx b;

    static {
        kge.a(53600970);
        kge.a(1967244270);
    }

    public ab(Context context, eyx eyxVar) {
        this.f10673a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null) {
            return false;
        }
        odg.h().a(this.f10673a, this.b, b, new odg.g() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.SetRemindImplementor$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.odg.g
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    com.taobao.android.detail.ttdetail.utils.i.a("SetRemindImplementor", "PlatformEvn.getReminderEvn().setRemind() success");
                }
            }

            @Override // tb.odg.g
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                com.taobao.android.detail.ttdetail.utils.i.a("SetRemindImplementor", "PlatformEvn.getReminderEvn().setRemind() onError with errCode: " + str + " errMsg: " + str2);
            }
        });
        a(b, runtimeAbilityParamArr);
        return true;
    }

    private void a(JSONObject jSONObject, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ca12ce", new Object[]{this, jSONObject, runtimeAbilityParamArr});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("next");
        if (jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray("success")) == null) {
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            if (jSONObject3 != null) {
                final String string = jSONObject3.getString("type");
                if (!StringUtils.isEmpty(string)) {
                    final JSONObject jSONObject4 = jSONObject3.getJSONObject("fields");
                    if (string.equals("adjustState") && jSONObject4 != null) {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("beReplaced", (Object) "bottomBarVO");
                        jSONObject5.put("toReplace", (Object) "fields");
                        jSONObject4.put("targetReplacement", (Object) jSONObject5);
                    }
                    this.b.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.SetRemindImplementor$2
                        {
                            put("type", (Object) string);
                            put("fields", (Object) jSONObject4);
                        }
                    }), runtimeAbilityParamArr);
                }
            }
        }
    }
}
