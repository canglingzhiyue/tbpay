package com.taobao.android.detail.ttdetail.broadcast;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.h;
import com.taobao.android.detail.ttdetail.communication.c;
import com.taobao.android.detail.ttdetail.constant.a;
import com.taobao.android.detail.ttdetail.data.meta.Trade;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.f;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import tb.eyx;
import tb.ixt;
import tb.kge;
import tb.tfu;

/* loaded from: classes4.dex */
public class a implements ixt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADD_CART = "AddCart";
    public static final String CART_REFRESH_DATA = "cartRefreshData";

    /* renamed from: a  reason: collision with root package name */
    private eyx f10513a;

    static {
        kge.a(-1857771209);
        kge.a(-321064151);
    }

    public a(eyx eyxVar) {
        this.f10513a = eyxVar;
    }

    @Override // tb.ixt
    public void a(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            c(jSONObject);
            String string = jSONObject.getString("actionFrom");
            if (StringUtils.isEmpty(string)) {
                string = "NULL";
            }
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -1519039294) {
                if (hashCode == -1270295406 && string.equals("IMG_PREVIEW_LONG_CLK")) {
                    c = 1;
                }
            } else if (string.equals("ADD_CART_SUCCESS")) {
                c = 0;
            }
            if (c != 0) {
                if (c != 1) {
                    return;
                }
                a(this.f10513a, jSONObject);
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(tfu.ADD_CART);
            if (jSONObject2 == null || jSONObject2.isEmpty()) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("skuId", (Object) jSONObject2.getString("skuId"));
            jSONObject3.put("priceText", (Object) jSONObject.getString("priceText"));
            jSONObject3.put("propTextList", jSONObject.get("propTextList"));
            try {
                str = URLEncoder.encode(jSONObject3.toJSONString(), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                str = "";
            }
            a(jSONObject.getString("addCartScene"), str, b(jSONObject));
        }
    }

    private void a(eyx eyxVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff43f5c", new Object[]{this, eyxVar, jSONObject});
        } else if (jSONObject == null) {
        } else {
            View view = null;
            Dialog dialog = (Dialog) jSONObject.getObject("dialog", Dialog.class);
            if (dialog != null) {
                view = dialog.getWindow().getDecorView();
            }
            c.a(this.f10513a.g(), new h("share", jSONObject, new RuntimeAbilityParam("shareFromSku", true), new RuntimeAbilityParam("shareContainer", view)));
        }
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        a(str2);
        if (!"native_addCart".equals(str)) {
            a(f.a(), str3);
        }
        ae.a("AddCart", (Map<String, String>) null);
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cartRefreshData");
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        intent.putExtra("stringifyAddCartResult", str);
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    private boolean a(String str) {
        final JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        JSONObject afterAddToCartAction = ((Trade) this.f10513a.a().a(Trade.class)).getAfterAddToCartAction();
        if (afterAddToCartAction == null) {
            return false;
        }
        final String string = afterAddToCartAction.getString("type");
        if (StringUtils.isEmpty(string) || (jSONObject = afterAddToCartAction.getJSONObject("fields")) == null || jSONObject.isEmpty()) {
            return false;
        }
        String string2 = jSONObject.getString("url");
        if (StringUtils.isEmpty(string2)) {
            return false;
        }
        if (!StringUtils.isEmpty(str)) {
            jSONObject.put("url", (Object) (string2 + "&skuInfo=" + str));
        }
        this.f10513a.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.broadcast.SkuActionCallback$1
            {
                put("type", (Object) string);
                put("fields", (Object) jSONObject);
            }
        }), new RuntimeAbilityParam[0]);
        return true;
    }

    private String b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject(tfu.ADD_CART)) != null) {
            return jSONObject2.getString("addCartResult");
        }
        return null;
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        boolean booleanValue = ((Boolean) this.f10513a.e().a("is99tm")).booleanValue();
        if (!"ADD_CART_SUCCESS".equals(jSONObject.getString("actionFrom")) || !booleanValue) {
            return;
        }
        com.taobao.android.detail.ttdetail.bridge.a.a("99tmCartUpdate", a.C0407a.WV_DATA_REQUEST_99_CART_UPDATE);
    }
}
