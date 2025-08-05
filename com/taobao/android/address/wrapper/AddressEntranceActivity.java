package com.taobao.android.address.wrapper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.WeexPopContainer;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.nav.Nav;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.uc.webview.export.extension.UCExtension;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.dof;
import tb.efe;
import tb.gvl;
import tb.riu;

/* loaded from: classes4.dex */
public class AddressEntranceActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "addressEntry";

    /* renamed from: a  reason: collision with root package name */
    private Uri f8983a;
    private long b;
    private long c;

    public static /* synthetic */ Object ipc$super(AddressEntranceActivity addressEntranceActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode != 1150324634) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.finish();
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.b = System.currentTimeMillis();
        dof.a("createEntryAct", "" + this.b, "", null);
        String b = efe.b("address_test_serial", "");
        if (!TextUtils.isEmpty(b)) {
            Toast.makeText(this, "address_test_serial:" + b, 0).show();
        }
        efe.a((Activity) this);
        a(getIntent());
        c.f8984a = getApplicationContext();
        c();
        d();
        b();
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        this.c = System.currentTimeMillis();
        dof.a("finishEntryAct", "" + this.c, String.valueOf(this.c - this.b), null);
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (intent == null || intent.getData() == null) {
            setResult(0);
            finish();
        } else {
            this.f8983a = intent.getData();
            c.s = null;
            if (efe.c("enable_full_address_info")) {
                Boolean bool = false;
                try {
                    Object obj = intent.getExtras().get(c.KEY_NEEDFULLADDRESSINFO);
                    AdapterForTLog.logd(TAG, "get needFullAddressInfo:" + obj);
                    if (obj != null) {
                        if (obj instanceof Boolean) {
                            bool = (Boolean) obj;
                        } else if (obj instanceof String) {
                            bool = Boolean.valueOf((String) obj);
                        } else {
                            bool = Boolean.valueOf(String.valueOf(intent.getExtras().get(c.KEY_NEEDFULLADDRESSINFO)));
                        }
                    } else {
                        AdapterForTLog.logd(TAG, "not contain needFullAddressInfo");
                    }
                } catch (Exception e) {
                    AdapterForTLog.logd(TAG, "get needFullAddressInfo error:" + e.getMessage());
                }
                c.t = bool.booleanValue();
                return;
            }
            c.t = false;
        }
    }

    private void b() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f8983a == null) {
            setResult(0);
            finish();
        } else {
            String a2 = a();
            Intent intent = getIntent();
            String str3 = null;
            Bundle extras = intent == null ? null : intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            if (this.f8983a.toString().contains("select_address_list")) {
                e();
            } else if (this.f8983a.toString().contains("wap_deliver_address_list")) {
                if (efe.b(this, ThemisConfig.SCENE_MANAGER)) {
                    ThemisConfig.a(this, ThemisConfig.SCENE_MANAGER, a2, UCExtension.EXTEND_INPUT_TYPE_IDCARD);
                } else {
                    Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).toUri(gvl.a(this, efe.a(this, efe.c(c.c, "pageType=1&" + a2))));
                }
            } else {
                String str4 = "";
                if (this.f8983a.toString().contains("edit_address") || this.f8983a.toString().contains("add_address")) {
                    String string = extras.getString("sourceAddress");
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            str4 = JSON.parseObject(string).getString(c.K_DELIVERY_ID);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    if (this.f8983a.toString().contains("edit_address")) {
                        if (TextUtils.isEmpty(str4)) {
                            str2 = a2 + "&pageType=0";
                        } else {
                            str2 = a2 + "&deliverId=" + str4 + "&pageType=1";
                        }
                        str = a(str2);
                    } else {
                        str = a2 + "&pageType=0";
                    }
                    if (efe.c(this)) {
                        f(efe.c(efe.b("addressEditUrlThemis", "https://pages-fast.m.taobao.com/wow/z/uniapp/1010507/vip/receiver-address-themis/address-pro?x-ssr=true"), str));
                    } else {
                        Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).toUri(gvl.a(this, efe.a(this, efe.c(c.d, str))));
                    }
                } else if (this.f8983a.toString().contains("/deliver/map.htm")) {
                    Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).toUri(gvl.a(this, efe.c(c.e, a2)));
                } else if (this.f8983a.toString().contains("/deliver/switch_address.htm")) {
                    if (ThemisConfig.a(ThemisConfig.SCENE_LBS_LIST)) {
                        ThemisConfig.a(this, ThemisConfig.SCENE_LBS_LIST, a2, UCExtension.EXTEND_INPUT_TYPE_IDCARD);
                    } else {
                        Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).toUri(gvl.a(this, efe.c(c.f, a2)));
                    }
                } else if (this.f8983a.toString().contains("/deliver/change_address.htm")) {
                    if (intent != null) {
                        try {
                            if (extras.get("data") != null) {
                                c.a((Map) extras.get("data"));
                            }
                        } catch (Throwable th2) {
                            AdapterForTLog.loge(TAG, "parse data error", th2);
                        }
                    }
                    if (c.u != null) {
                        AdapterForTLog.logd(TAG, "change address data= " + JSON.toJSONString(c.u));
                    } else {
                        AdapterForTLog.logd(TAG, "change address data= null");
                    }
                    if ("true".equals(efe.b("select_degrade", str4))) {
                        if (ThemisConfig.a("change")) {
                            ThemisConfig.a(this, "change", str4, UCExtension.EXTEND_INPUT_TYPE_IDCARD);
                        } else {
                            Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).toUri(gvl.a(this, c.b));
                        }
                    } else {
                        a("change", c.b, false, false);
                    }
                } else if (this.f8983a.toString().contains("/deliver/transparent_address.htm")) {
                    if (intent != null) {
                        try {
                            str3 = intent.getStringExtra(c.K_COMMON_ADDRESS_URL);
                            AdapterForTLog.logd(TAG, "transparent_address url = " + str3);
                            c.a(extras.getString("data"));
                        } catch (Throwable th3) {
                            AdapterForTLog.logd(TAG, "transparent_address error:" + th3.getMessage());
                        }
                    }
                    AdapterForTLog.logd(TAG, "transparent_address data= " + c.v);
                    if (!TextUtils.isEmpty(str3)) {
                        a("cart", str3, true, true);
                    }
                } else if (this.f8983a.toString().contains("/deliver/common_address.htm")) {
                    try {
                        String queryParameter = this.f8983a.getQueryParameter("bizId");
                        if (TextUtils.isEmpty(queryParameter)) {
                            queryParameter = extras.getString("bizId");
                        }
                        String queryParameter2 = this.f8983a.getQueryParameter("data");
                        if (TextUtils.isEmpty(queryParameter2)) {
                            Object obj = extras.get("data");
                            if (obj instanceof String) {
                                queryParameter2 = (String) obj;
                            } else {
                                if (obj != null) {
                                    str4 = obj.toString();
                                }
                                queryParameter2 = str4;
                            }
                        }
                        AdapterForTLog.logd(TAG, "common_address bizId=" + queryParameter + " data:" + queryParameter2);
                        c.a(queryParameter2);
                        a(queryParameter, ThemisConfig.a(queryParameter, a2), true, true);
                    } catch (Throwable th4) {
                        AdapterForTLog.logd(TAG, "common_address error:" + th4.getMessage());
                    }
                }
            }
            finish();
        }
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        Uri uri = this.f8983a;
        if (uri == null) {
            return "";
        }
        String query = uri.getQuery();
        return !TextUtils.isEmpty(query) ? query : "";
    }

    private String a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!c.t) {
            return str;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Bundle extras = getIntent().getExtras();
            Set<String> keySet = extras.keySet();
            for (String str2 : efe.b("address_edit_exclude_params", "referrer").split(";")) {
                AdapterForTLog.loge(TAG, "addIntentExtraInfo remove:" + str2 + " result:" + keySet.remove(str2));
            }
            for (String str3 : keySet) {
                Object obj = extras.get(str3);
                sb.append("&");
                sb.append(str3);
                sb.append("=");
                sb.append(obj);
            }
            return str + sb.toString();
        } catch (Exception e) {
            AdapterForTLog.logd(TAG, "addIntentExtraInfo error:" + e.getMessage());
            return str;
        }
    }

    public void a(String str, String str2, boolean z, boolean z2) {
        String str3;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a078fc", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (ThemisConfig.a(str)) {
            String a2 = ThemisConfig.a(str, "");
            if (!TextUtils.equals(str, "cart") && !TextUtils.equals(str, "purchase") && !TextUtils.equals(str, ThemisConfig.SCENE_TMALLMARKET)) {
                str3 = a2;
            } else if (ThemisConfig.b(str2)) {
                String b = efe.b(str2);
                str3 = ThemisConfig.a(str, "&addressCustomBizUrl=" + b);
            } else {
                AdapterForTLog.logd(TAG, "openPop url:" + str2);
                dof.a(dof.PAGE_NAME_ADDRESS, "url=" + str2, "", null);
            }
            Bundle bundle = new Bundle();
            bundle.putString(riu.e, str2);
            bundle.putString(riu.c, str3);
            bundle.putString("type", WeexPopContainer.b);
            bundle.putInt("fullPage", 0);
            bundle.putBoolean(WeexPopContainer.PARAMS_IS_TRANSPARENT, z);
            bundle.putBoolean(WeexPopContainer.PARAMS_SHOW_LOADING, z2);
            bundle.putString(WeexPopContainer.PARAMS_SCENE, str);
            bundle.putBoolean(WeexPopContainer.PARAMS_IS_ADDRESS_USER_WEEX2, z3);
            Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).withExtras(bundle).toUri(gvl.a(this, gvl.ORANGE_POP_LARGESCREENSTYLE_VAL, "https://my.m.taobao.com/deliver/pop_address.htm"));
            overridePendingTransition(0, 0);
        }
        str3 = str2;
        z3 = false;
        Bundle bundle2 = new Bundle();
        bundle2.putString(riu.e, str2);
        bundle2.putString(riu.c, str3);
        bundle2.putString("type", WeexPopContainer.b);
        bundle2.putInt("fullPage", 0);
        bundle2.putBoolean(WeexPopContainer.PARAMS_IS_TRANSPARENT, z);
        bundle2.putBoolean(WeexPopContainer.PARAMS_SHOW_LOADING, z2);
        bundle2.putString(WeexPopContainer.PARAMS_SCENE, str);
        bundle2.putBoolean(WeexPopContainer.PARAMS_IS_ADDRESS_USER_WEEX2, z3);
        Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).withExtras(bundle2).toUri(gvl.a(this, gvl.ORANGE_POP_LARGESCREENSTYLE_VAL, "https://my.m.taobao.com/deliver/pop_address.htm"));
        overridePendingTransition(0, 0);
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(riu.e, efe.a(this, str));
        Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).withExtras(bundle).toUri(gvl.a(this, gvl.ORANGE_POP_LARGESCREENSTYLE_VAL, "https://my.m.taobao.com/deliver/h5_pop_address.htm"));
        overridePendingTransition(0, 0);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (efe.a("weex_address_change_gray_percent")) {
                String b = efe.b("weex_address_change_gray_url", "");
                if (TextUtils.isEmpty(b)) {
                    return;
                }
                c.b = b;
                return;
            }
            String b2 = efe.b("weex_address_change_url", "");
            if (TextUtils.isEmpty(b2)) {
                return;
            }
            c.b = b2;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        try {
            if (efe.a("weex_address_picker_gray_percent")) {
                c.c = efe.b("weex_address_picker_gray_url", c.c);
            } else {
                c.c = efe.b("weex_address_picker_url", c.c);
            }
            if (efe.b()) {
                c.c = efe.b("addressNewListUrl", "https://market.m.taobao.com/app/vip/receiver-address/pages/list2?wh_weex=true&wx_navbar_hidden=true&voiceMode=true&isUnfrequent=true");
            }
            if (efe.a("weex_address_editor_gray_percent")) {
                c.d = efe.b("weex_address_editor_gray_url", c.d);
            } else {
                c.d = efe.b("weex_address_editor_url", c.d);
            }
            if (efe.a("weex_address_map_gray_percent")) {
                c.e = efe.b("weex_address_map_gray_url", c.e);
            } else {
                c.e = efe.b("weex_address_map_url", c.e);
            }
            if (efe.a("weex_address_switch_gray_percent")) {
                c.f = efe.b("weex_address_switch_gray_url", c.f);
            } else {
                c.f = efe.b("weex_address_switch_url", c.f);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return true;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        String a2 = a();
        String str = c.c + "&pageType=0";
        AddressParams addressParams = new AddressParams();
        addressParams.deliverId = intent.getStringExtra(com.taobao.android.purchase.core.address.c.K_SELECTED_ADDRESS_ID);
        addressParams.agencyReceive = intent.getStringExtra(com.taobao.android.purchase.core.address.c.K_AGENCY_RECV);
        addressParams.agencyReceiveH5Url = intent.getStringExtra(com.taobao.android.purchase.core.address.c.K_AGENCY_RECV_H5);
        addressParams.agencyReceiveHelpUrl = intent.getStringExtra(com.taobao.android.purchase.core.address.c.K_AGENCY_RECV_HEPL);
        addressParams.abroadStation = e(addressParams.agencyReceive);
        addressParams.supportStation = "1".equals(addressParams.agencyReceive);
        addressParams.needChangeKinship = true;
        addressParams.relationId = intent.getStringExtra("relationId");
        addressParams.source = intent.getStringExtra("source");
        addressParams.sites = intent.getStringExtra(c.l);
        addressParams.sellerID = intent.getStringExtra("sellerId");
        addressParams.tempData = (HashMap) intent.getSerializableExtra(com.taobao.android.purchase.core.address.c.K_TEMP_DATA);
        addressParams.extMap = intent.getStringExtra("extMap");
        addressParams.deliverAddrList = intent.getStringExtra("deliverAddrList");
        addressParams.accurateAddressInfo = intent.getStringExtra("accurateAddressInfo");
        addressParams.bizcode = intent.getStringExtra(UploadConstants.BIZ_CODE);
        try {
            Bundle extras = intent.getExtras();
            if (extras != null && efe.c("getExtNativeJson")) {
                Set<String> keySet = extras.keySet();
                JSONObject jSONObject = new JSONObject();
                for (String str2 : keySet) {
                    jSONObject.put(str2, extras.get(str2));
                }
                addressParams.extNativeJson = jSONObject;
            }
            Uri data = intent.getData();
            if (data != null && efe.c("getExtUrlJson")) {
                Set<String> queryParameterNames = data.getQueryParameterNames();
                JSONObject jSONObject2 = new JSONObject();
                for (String str3 : queryParameterNames) {
                    jSONObject2.put(str3, (Object) data.getQueryParameter(str3));
                }
                addressParams.extUrlJson = jSONObject2;
            }
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "add extJson fail", e);
        }
        c.s = addressParams;
        if (efe.b(this, ThemisConfig.SCENE_SELECT)) {
            ThemisConfig.a(this, ThemisConfig.SCENE_SELECT, a2, UCExtension.EXTEND_INPUT_TYPE_IDCARD);
        } else {
            Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).toUri(gvl.a(this, efe.a(this, efe.c(str, a2))));
        }
    }

    private boolean e(String str) {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        try {
            parseInt = Integer.parseInt(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return parseInt >= 4 && parseInt <= 10;
    }
}
