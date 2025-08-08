package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@AURAExtensionImpl(code = "tbbuy.impl.aspect.error.downgrade")
/* loaded from: classes6.dex */
public final class idh extends idd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEGRADE_OLD_CONTAINER = "Buy2DowngradeOldProtocol";

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f28928a = new AtomicBoolean(false);

    static {
        kge.a(-1295014640);
    }

    public static /* synthetic */ Object ipc$super(idh idhVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.idd
    public void a(boolean z, JSONObject jSONObject, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f89dbe2", new Object[]{this, new Boolean(z), jSONObject, str, str2, str3});
        } else if (this.f28928a.get()) {
        } else {
            b(z, jSONObject, str, str2, str3);
        }
    }

    private void b(boolean z, JSONObject jSONObject, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75353863", new Object[]{this, new Boolean(z), jSONObject, str, str2, str3});
            return;
        }
        Context e = b().e();
        if (!(e instanceof Activity)) {
            a().a(new b(1, "DomainTaobaoGeneralPurchase", "downgrade-failed-none-activity", "context is null"));
            return;
        }
        this.f28928a.set(true);
        Intent b = fke.b(e);
        if (b == null) {
            tdh.b("EMPTY_INTENT_FORM_(executeDowngrade)", "intent is empty");
            return;
        }
        a(b);
        igd.a((Activity) e, str2);
    }

    private void a(Intent intent) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        try {
            Map map = (Map) intent.getSerializableExtra("buildOrderParams");
            if (map == null) {
                return;
            }
            String str = (String) map.get("exParams");
            if (StringUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null || !parseObject.containsKey("umfVersions")) {
                return;
            }
            parseObject.remove("umfVersions");
            map.put("exParams", parseObject.toJSONString());
        } catch (Throwable th) {
            arc.a().c("TBBuyErrorDowngradeExtension", "rmUmfVersionParam", th.toString());
        }
    }
}
