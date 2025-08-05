package tb;

import android.app.Activity;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.subscriber.widget.b;
import com.taobao.android.order.core.subscriber.widget.d;

/* loaded from: classes6.dex */
public class iat extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_URL = "url";
    public static final String KEY_QUERY_PARAM = "queryParams";
    public static final String NEXT_TAG_DISMISS = "dismiss";

    static {
        kge.a(-1340983511);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "1819876949380220675";
    }

    public static /* synthetic */ void a(iat iatVar, e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971318f9", new Object[]{iatVar, eVar, str});
        } else {
            iatVar.a(eVar, str);
        }
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(final e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (!(eVar.a() instanceof Activity) || e(eVar) == null || !(e(eVar).get("url") instanceof String)) {
            String str = null;
            if (!(eVar.a() instanceof Activity)) {
                str = "content 异常" + eVar.a();
            } else if (e(eVar) == null) {
                str = "getEventFields 为空";
            } else if (!(e(eVar).get("url") instanceof String)) {
                str = "url 参数有问题";
            }
            bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", str);
        } else {
            String string = e(eVar).getString("url");
            if (e(eVar).get("queryParams") instanceof JSONObject) {
                string = ibm.a(string, e(eVar).getJSONObject("queryParams"));
            }
            d.a(eVar.a(), string, new b() { // from class: tb.iat.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.order.core.subscriber.widget.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        iat.a(iat.this, eVar, "dismiss");
                    }
                }
            });
        }
    }
}
