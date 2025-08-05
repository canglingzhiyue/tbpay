package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.j;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import com.taobao.taolive.room.utils.aw;
import java.util.Map;

/* loaded from: classes.dex */
public class drf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1928878141);
    }

    public static drp a(drp drpVar, JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drp) ipChange.ipc$dispatch("ecb51639", new Object[]{drpVar, jSONObject, map});
        }
        if (drpVar == null) {
            return null;
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            String string = jSONObject.getString("actionType");
            if (TextUtils.isEmpty(string)) {
                return drpVar;
            }
            drpVar.f26928a = jSONObject.getLongValue("seqId");
            drpVar.d = jSONObject.getString("scene");
            drpVar.b = jSONObject.getString("sessionId");
            drpVar.c = jSONObject.getString("bizId");
            drpVar.e = jSONObject.getLongValue("createTime");
            drpVar.f = jSONObject.getLongValue(StWindow.UPDATE_TIME);
            drpVar.g = jSONObject.getString("userId");
            if ("scrollStart".equals(string) || "scrollEnd".equals(string)) {
                drpVar.h = "scroll";
            } else if ("exposeStart".equals(string) || "exposeEnd".equals(string)) {
                drpVar.h = "expose";
            } else {
                drpVar.h = string;
            }
            drpVar.i = jSONObject.getString("actionName");
            drpVar.j = jSONObject.getLongValue("actionDuration");
            drpVar.k = jSONObject.getString(e.ACTION_ARGS);
            drpVar.l = jSONObject.getString(e.BIZ_ARGS);
            drpVar.m = jSONObject.getString("fromScene");
            drpVar.n = jSONObject.getString("toScene");
            drpVar.o = jSONObject.getString("reserve1");
            drpVar.p = jSONObject.getString("reserve2");
            drpVar.q = jSONObject.getString("periodSessionId");
            drpVar.s = jSONObject.getBooleanValue(aw.PARAM_IS_FIRST_ENTER);
            drpVar.r = jSONObject.getJSONObject(e.ACTION_ARGS);
            drpVar.a();
            if (map != null && !map.isEmpty()) {
                drpVar.v = map;
                if (!dro.m()) {
                    drpVar.u = j.d(drpVar.v);
                }
            }
        }
        return drpVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a6, code lost:
        if (r5.equals("pv") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.drp a(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.drf.a(java.lang.String):tb.drp");
    }
}
