package tb;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class krm extends aec<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1711753060);
    }

    public static /* synthetic */ Object ipc$super(krm krmVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public krm(bbz bbzVar) {
        super(bbzVar);
    }

    @Override // tb.abg
    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        String stringExtra = intent.getStringExtra("stringifyAddCartResult");
        return !StringUtils.isEmpty(stringExtra) && a(stringExtra);
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            JSONObject jSONObject = (JSONObject) JSONObject.parse(Base64.decode(parseObject.getString("addBagExParamFromCartFeedFlow"), 0), new Feature[0]);
            boolean equals = this.f25281a.P().equals(jSONObject.getString("cartInstanceId"));
            if (equals && (jSONObject.get("popId") instanceof String)) {
                return true;
            }
            String string = parseObject.getString("cartId");
            if (equals) {
                b(string);
            }
            return equals;
        } catch (Throwable th) {
            jqg.a("AddOnRefreshProcessor", th.getMessage());
            return false;
        }
    }

    private void b(String str) {
        List<b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        IDMComponent e = this.f25281a.n().e("submit");
        if (e == null) {
            return;
        }
        Map<String, List<b>> eventMap = e.getEventMap();
        boolean a2 = a();
        if (eventMap != null && (list = eventMap.get("updateCartAfterAdd")) != null) {
            for (b bVar : list) {
                if (StringUtils.equals(bVar.getType(), "updateCartAfterAdd")) {
                    bVar.writeFields("cartId", str);
                    bmz a3 = this.f25281a.F().a();
                    a3.c("updateCartAfterAdd");
                    a3.a(bVar.getType());
                    a3.a(bVar);
                    a3.a(e);
                    a3.a("rebuildArea", Integer.valueOf(a2 ? 127 : 5));
                    this.f25281a.a(e, a3, true, null, null);
                }
            }
        }
        if (!a2) {
            return;
        }
        if (this.f25281a.n().d()) {
            bby d = this.f25281a.x().d();
            if (d == null) {
                return;
            }
            d.e();
            return;
        }
        aat aatVar = (aat) this.f25281a.S();
        if (aatVar == null) {
            return;
        }
        aatVar.h().S().m();
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        JSONObject i = bem.i(this.f25281a.n());
        if (i != null && i.getBoolean("needScrollToTop") != null) {
            return i.getBooleanValue("needScrollToTop");
        }
        return true;
    }
}
