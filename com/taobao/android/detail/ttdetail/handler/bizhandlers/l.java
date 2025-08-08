package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.HashMap;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class l implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openCommonDialog";

    /* renamed from: a  reason: collision with root package name */
    private Activity f10714a;
    private eyx b;

    static {
        kge.a(1768059422);
        kge.a(1967244270);
    }

    public l(Context context, eyx eyxVar) {
        if (context instanceof Activity) {
            this.f10714a = (Activity) context;
        }
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        com.taobao.android.detail.ttdetail.utils.i.a("OpenCommonDialogImplementor", com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE);
        if (aVar == null || (b = aVar.b()) == null || this.f10714a == null) {
            return false;
        }
        if (b.getBooleanValue("useBizData")) {
            b = b(b);
        }
        if (b == null) {
            return false;
        }
        String string = b.getString("itemId");
        String a2 = a(b);
        if (StringUtils.isEmpty(a2)) {
            return true;
        }
        com.taobao.android.detail.ttdetail.utils.i.a("OpenCommonDialogImplementor", a2);
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", a2);
        hashMap.put("itemId", string);
        hashMap.put("popId", b.getString("popId"));
        com.taobao.android.detail.ttdetail.utils.ae.a(hashMap, -800022, a2);
        return false;
    }

    private JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{this, jSONObject});
        }
        JSONObject b = com.taobao.android.detail.ttdetail.utils.d.b(this.b);
        if (b != null) {
            return b.getJSONObject(jSONObject.getString("bizDataKey"));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
        if (r7.equals("DinamicX") == false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(final com.alibaba.fastjson.JSONObject r19) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.handler.bizhandlers.l.a(com.alibaba.fastjson.JSONObject):java.lang.String");
    }
}
