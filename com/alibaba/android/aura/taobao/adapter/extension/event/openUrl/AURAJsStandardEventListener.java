package com.alibaba.android.aura.taobao.adapter.extension.event.openUrl;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.aem;
import tb.arc;
import tb.avi;
import tb.bba;
import tb.kge;

/* loaded from: classes2.dex */
public class AURAJsStandardEventListener implements aek {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EventType = "auraEventNotification";

    static {
        kge.a(-1496540896);
        kge.a(1845411121);
    }

    @Override // tb.aek
    public ael onEvent(int i, aej aejVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
        }
        if (i != 3005 || objArr == null || objArr.length <= 0 || !(objArr[0] instanceof String)) {
            return null;
        }
        JSONObject a2 = bba.a((String) objArr[0]);
        if (a2 == null) {
            arc.a().a("AURAJsStandardEvent eventJson is null");
            return null;
        } else if (!EventType.equalsIgnoreCase(a2.getString("event"))) {
            arc.a().a("AURAJsStandardEvent event is not auraEventNotification");
            return null;
        } else {
            JSONObject jSONObject = a2.getJSONObject("param");
            if (jSONObject == null) {
                arc.a().a("AURAJsStandardEvent param is null");
                return null;
            }
            String string = jSONObject.getString("type");
            if (TextUtils.isEmpty(string)) {
                arc.a().a("AURAJsStandardEvent eventType is null");
                return null;
            }
            routeAuraEvent(aejVar.c, string, jSONObject.getJSONObject("fields"));
            return new ael(true, null);
        }
    }

    private void routeAuraEvent(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31804a53", new Object[]{this, context, str, jSONObject});
            return;
        }
        List<s> a2 = avi.a().a(context);
        if (a2 == null) {
            arc.a().a("AURAJsStandardEvent instancePool is null");
            a2 = avi.a().b();
            if (a2 == null) {
                arc.a().a("AURAJsStandardEvent allInstancePool is null");
                return;
            }
        }
        d dVar = new d();
        dVar.a(jSONObject);
        for (s sVar : a2) {
            com.alibaba.android.aura.service.event.c.a(sVar, str, dVar);
        }
    }

    public static void a(aek aekVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfdbecb1", new Object[]{aekVar});
        } else {
            aem.a().a(aekVar);
        }
    }

    public static void b(aek aekVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5ef332", new Object[]{aekVar});
        } else {
            aem.a().b(aekVar);
        }
    }
}
