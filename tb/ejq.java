package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import java.util.HashMap;
import java.util.Map;
import tb.bga;

/* loaded from: classes4.dex */
public class ejq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-290532741);
    }

    public ejq() {
        emu.a("com.taobao.android.detail.core.standard.itemThrough.SupportItemThroughHelper");
    }

    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        if (!(context instanceof DetailCoreActivity)) {
            return false;
        }
        JSONObject a2 = a((DetailCoreActivity) context);
        if (a2 == null || a2.isEmpty()) {
            i.a("SupportItemThroughHelper", "feature is invalid");
            return false;
        }
        return TextUtils.equals(a2.getString("itemThrough"), "true");
    }

    public void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
        } else if (!(context instanceof DetailCoreActivity) || map == null) {
        } else {
            map.put("lastItemId", b((DetailCoreActivity) context));
        }
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (!a(context)) {
        } else {
            bga.c.a("detail_aura", "finalUltron", "E_DETAIL_INDUSTRY_SUPPORT_ITEM_THROUGH", "default", true);
        }
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
        } else if (!(context instanceof DetailCoreActivity)) {
        } else {
            DetailCoreActivity detailCoreActivity = (DetailCoreActivity) context;
            if (!detailCoreActivity.F() || !detailCoreActivity.H()) {
                return;
            }
            UMLinkLogInterface a2 = bpp.a();
            a2.logError("AURAMonitor", "TaobaoIndustryDetail", dwq.AURA_MODULE_NAME, null, "itemThroughGoUpgrade", "itemId_" + b(detailCoreActivity), new HashMap(), a.a(new HashMap()));
            HashMap hashMap = new HashMap();
            a2.commitFailure(dwq.AURA_MODULE_NAME, "AURAMonitor", "1.0", "AURAMonitor", "TaobaoIndustryDetail", hashMap, "itemThroughGoUpgrade", "itemId_" + b(detailCoreActivity));
        }
    }

    private JSONObject a(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5bda3213", new Object[]{this, detailCoreActivity});
        }
        try {
            return detailCoreActivity.C().f10055a.a().getJSONObject("feature");
        } catch (Throwable th) {
            i.a("SupportItemThroughHelper", th.toString());
            return null;
        }
    }

    private String b(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21858b0e", new Object[]{this, detailCoreActivity});
        }
        try {
            c C = detailCoreActivity.C();
            if (C == null) {
                return "";
            }
            String i = C.i();
            return i == null ? "" : i;
        } catch (Throwable th) {
            i.a("SupportItemThroughHelper", th.toString());
            return "";
        }
    }
}
