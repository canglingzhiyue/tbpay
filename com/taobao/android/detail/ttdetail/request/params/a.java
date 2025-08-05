package com.taobao.android.detail.ttdetail.request.params;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Params;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.utils.ak;
import com.taobao.android.detail.ttdetail.utils.aq;
import com.taobao.android.detail.ttdetail.utils.d;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import com.taobao.taolive.room.utils.aw;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import tb.ecd;
import tb.eyz;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f10787a;
    private Intent d;
    private String e;
    private String f;
    private String g;
    private String h;
    private boolean i;
    private String l;
    private Map<String, String> b = new HashMap();
    private JSONObject c = new JSONObject();
    private long j = 0;
    private long k = 0;

    static {
        kge.a(818113304);
        f10787a = new String[]{"ref_wp_pk", "ref_wp_m", "ref_wp_p", "collocation_id", "action_id", ChatInputConstant.PANEL_ID_ALBUM, "mmtag", "scm", aw.PARAM_PVID, "spm-cnt", "spm", "pre_item_id", "pre_seller_id", "weitao_user_id", "fromtorelation", "afcflow", "bc_fl_src", "crm_s_src", "action", "list_param", "list_type", "object_id", "object_type", ecd.K_EFFECT_BDID, "carrier_id"};
    }

    public a(Intent intent) {
        a(intent);
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (intent != null) {
            this.g = intent.getStringExtra(com.taobao.android.detail.ttdetail.constant.a.KEY_NAV);
            if (TextUtils.isEmpty(this.g)) {
                this.g = String.valueOf(UUID.randomUUID().hashCode());
            }
            this.d = intent;
            this.e = ak.a(intent);
            String str = this.e;
            this.l = str;
            this.f = str;
            this.b.put("item_id", this.l);
            if (TextUtils.isEmpty(this.l)) {
                i.a("itemId为空， url=" + this.d.getDataString());
            }
            this.j = intent.getLongExtra("NAV_TO_URL_START_UPTIME", 0L);
            this.k = intent.getLongExtra("NAV_START_ACTIVITY_UPTIME", 0L);
            Uri data = intent.getData();
            if (data == null) {
                return;
            }
            this.h = data.getQueryParameter("clickid");
            if (TextUtils.isEmpty(this.h)) {
                this.h = intent.getStringExtra("clickid");
            }
            this.i = "true".equals(data.getQueryParameter(ecd.V_EFFECT_ACTION_SECKILL));
            a(intent.getExtras());
            a(data);
        } else {
            this.g = String.valueOf(UUID.randomUUID().hashCode());
        }
    }

    private void a(Uri uri) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
        } else if (!TextUtils.isEmpty(uri.getQuery()) && (queryParameterNames = uri.getQueryParameterNames()) != null && !queryParameterNames.isEmpty()) {
            for (String str : queryParameterNames) {
                if (!"referrer".equals(str)) {
                    this.b.put(str, uri.getQueryParameter(str));
                }
            }
        }
    }

    private void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
        } else if (bundle != null) {
            for (String str : bundle.keySet()) {
                if (!"referrer".equals(str) && !"transImgUrl".equals(str) && !"transImgRatio".equals(str) && !"transImgType".equals(str)) {
                    this.b.put(str, String.valueOf(bundle.get(str)));
                }
            }
        }
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap(this.b);
        String[] j = j.j();
        if (j != null) {
            for (String str : j) {
                if (!TextUtils.isEmpty(str) && !b(str)) {
                    hashMap.remove(str);
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : j.aa() && TextUtils.equals(this.b.get("list_type"), "search") && TextUtils.equals(str, "list_param");
    }

    public void a(eyz eyzVar) {
        String str;
        JSONObject trackParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cff6d2", new Object[]{this, eyzVar});
        } else if (eyzVar == null) {
        } else {
            b();
            Params params = (Params) eyzVar.a(Params.class);
            if (params != null && (trackParams = params.getTrackParams()) != null) {
                this.c.putAll(trackParams);
            }
            Feature feature = (Feature) eyzVar.a(Feature.class);
            Item item = (Item) eyzVar.a(Item.class);
            Seller seller = (Seller) eyzVar.a(Seller.class);
            if (item != null) {
                str = (feature == null || !feature.isOneProductMM()) ? item.getItemId() : item.getPlatformItemId();
            } else {
                str = "";
            }
            JSONObject jSONObject = this.c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("item_id", (Object) str);
            this.c.put("shop_id", (Object) d.b(seller, ""));
            this.c.put("seller_id", (Object) d.a(seller, ""));
            String string = PreferenceManager.getDefaultSharedPreferences(f.a()).getString("appGuide", "");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.c.put("appGuide", (Object) string);
        }
    }

    public JSONObject b() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        if (this.c.isEmpty()) {
            for (String str : f10787a) {
                String str2 = this.b.get(str);
                if (str2 != null) {
                    this.c.put(str, (Object) str2);
                }
            }
            String str3 = this.b.get("track_params");
            if (!TextUtils.isEmpty(str3)) {
                try {
                    this.c.putAll(aq.a(JSON.parseObject(str3)));
                } catch (Throwable unused) {
                }
            }
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.h;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.i;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.l;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.f;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.f = str;
            i.a("updateRequestItemId=" + this.f);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.l = this.f;
        this.b.put("item_id", this.l);
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.g;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        Uri data = this.d.getData();
        if (data != null) {
            return TextUtils.equals("true", data.getQueryParameter("99tm"));
        }
        return false;
    }
}
