package com.taobao.android.detail.core.aura.broadcast;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.bbg;
import tb.dxu;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class AliDetailSKURefreshBroadcastReceiver extends AbsAliDetailUIRefreshBroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INTENT_FILTER_ACTION = "com.taobao.sku.intent.action.syncData";

    static {
        kge.a(1294588056);
    }

    public static /* synthetic */ Object ipc$super(AliDetailSKURefreshBroadcastReceiver aliDetailSKURefreshBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public AliDetailSKURefreshBroadcastReceiver(Context context, dxu dxuVar) {
        super(context, dxuVar);
        emu.a("com.taobao.android.detail.core.aura.broadcast.AliDetailSKURefreshBroadcastReceiver");
    }

    @Override // com.taobao.android.detail.core.aura.broadcast.AbsAliDetailUIRefreshBroadcastReceiver
    public UMFRuleIO a(Context context, Intent intent) {
        JSONObject parseObject;
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFRuleIO) ipChange.ipc$dispatch("c268f33f", new Object[]{this, context, intent});
        }
        String stringExtra = intent.getStringExtra("uniqueId");
        if (!(this.f9383a instanceof DetailCoreActivity)) {
            return null;
        }
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) this.f9383a;
        if (!TextUtils.equals(detailCoreActivity.h, stringExtra)) {
            return null;
        }
        if (detailCoreActivity.R()) {
            detailCoreActivity.f(false);
            return null;
        }
        String stringExtra2 = intent.getStringExtra("selectedTextMap");
        if (TextUtils.isEmpty(stringExtra2) || (parseObject = JSON.parseObject(stringExtra2)) == null) {
            return null;
        }
        String a3 = a(parseObject);
        if (TextUtils.isEmpty(a3) || (a2 = a(a3, parseObject.getBoolean("selectedSkuId").booleanValue())) == null) {
            return null;
        }
        return new UMFRuleIO(Arrays.asList(a2));
    }

    private String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        boolean booleanValue = jSONObject.getBoolean("selectedSkuId").booleanValue();
        String a2 = b.a(booleanValue ? R.string.x_detail_app_sku_selected : R.string.x_detail_app_sku_select);
        JSONArray jSONArray = jSONObject.getJSONArray("propTextList");
        if (jSONArray != null) {
            String str = a2;
            for (int i = 0; i < jSONArray.size(); i++) {
                str = str + jSONArray.getString(i) + " / ";
            }
            a2 = str;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("serviceTextList");
        if (booleanValue && jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                a2 = a2 + jSONArray2.getString(i2) + " / ";
            }
        }
        return a2.length() > 3 ? a2.substring(0, a2.length() - 3) : a2;
    }

    private a a(String str, boolean z) {
        List list;
        AURARenderComponent aURARenderComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("93504649", new Object[]{this, str, new Boolean(z)});
        }
        if (this.c == null || (list = (List) this.c.get("render_view_item_models", List.class)) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                aURARenderComponent = null;
                break;
            }
            Object next = it.next();
            if (next instanceof AURARenderComponent) {
                aURARenderComponent = (AURARenderComponent) next;
                if (TextUtils.equals(aURARenderComponent.key, "detailSku")) {
                    break;
                }
            }
        }
        if (aURARenderComponent == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("extraText", str);
        hashMap.put("idSelectedText", z ? "true" : "false");
        return bbg.a(RuleType.PROPS_WRITE_BACK, aURARenderComponent, hashMap);
    }
}
