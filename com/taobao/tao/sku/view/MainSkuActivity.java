package com.taobao.tao.sku.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.android.nav.Nav;
import com.taobao.android.sku.utils.o;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.sku.a;
import com.taobao.taobao.R;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.bpp;
import tb.epp;
import tb.kge;
import tb.ovc;
import tb.ovg;

/* loaded from: classes8.dex */
public class MainSkuActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ovc f21106a;
    public String b;
    public Map<String, String> c;
    public Map<String, String> d;
    public String e;
    public String f;
    public String g;

    static {
        kge.a(-342671493);
    }

    public static /* synthetic */ Object ipc$super(MainSkuActivity mainSkuActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            } else if (hashCode != 1257714799) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            }
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public MainSkuActivity() {
        f.a("com.taobao.android.detail", "com.taobao.tao.sku.view.MainSkuActivity");
        ApplicationInvoker.getInstance("com.taobao.android.detail").invoke("com.taobao.android.detail.DetailApplication", TaobaoApplication.sApplication);
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        a.a("com.taobao.tao.sku.view.MainSkuActivity");
        try {
            this.f21106a = ovc.a(getIntent());
        } catch (Exception e) {
            epp.a("MainSkuActivity", "ParameterModel.newInstance(intent) failed.", e);
        }
        ovc ovcVar = this.f21106a;
        String str = "null";
        if (ovcVar != null) {
            String str2 = ovcVar.f32448a;
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
        }
        a(str);
        ovc ovcVar2 = this.f21106a;
        if (ovcVar2 == null) {
            a(9, (Intent) null);
            return;
        }
        this.e = ovcVar2.a();
        this.c = this.f21106a.d();
        this.d = this.f21106a.c();
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.f = this.f21106a.b();
        this.g = this.f21106a.f32448a;
        Map<String, String> map = this.c;
        if (map != null) {
            this.b = map.get("bottom_bar_style");
            if (TextUtils.isEmpty(this.b)) {
                this.b = "bottombar_style_buyaddcart";
            }
        }
        setTheme(R.style.XSkuOld_Dialog_Activity);
        setContentView(R.layout.taosku_activity_main_place_holder);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("itemId", (Object) this.e);
        a(this.e, this.f, c(this.b), jSONObject.toJSONString(), b(this.b), this.c, ovg.c(this.d), ovg.b(ovg.a(this.d)), this.f21106a.c, this.g);
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 0) {
            finish();
        }
        return onTouchEvent;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i != 10086) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityResult: resultCode/ ");
        sb.append(i);
        sb.append(" intent/ ");
        sb.append(intent == null ? "null" : intent.toString());
        Log.e("MainSkuActivity", sb.toString());
        a(i2, intent);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, "UME_SKU_MSOA_URL");
        }
    }

    private void a(final String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        UMLinkLogInterface a2 = bpp.a();
        if (a2 == null) {
            return;
        }
        a2.commitFailure("Main", str, "", "New_Sku", o.DEFAULT_BIZ_NAME, new HashMap<String, String>() { // from class: com.taobao.tao.sku.view.MainSkuActivity.1
            {
                put("errorMsg", str);
            }
        }, str2, str);
    }

    private void a(int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d12ba58", new Object[]{this, new Integer(i), intent});
            return;
        }
        setResult(i, intent);
        finish();
        if (i != 7) {
            return;
        }
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("detailSKU");
        intent.putExtra("result", "cancel");
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        if (!"bottombar_style_confirm".equals(str)) {
            if ("bottombar_style_confirm_addcart".equals(str)) {
                jSONObject.put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.tao.sku.view.MainSkuActivity.2
                    {
                        put("addCartText", "确认");
                    }
                });
            } else if ("bottombar_style_confirm_buy".equals(str)) {
                jSONObject.put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.tao.sku.view.MainSkuActivity.3
                    {
                        put("buyNowText", "确认");
                    }
                });
            } else if (!"bottombar_style_buyonly".equals(str)) {
                "bottombar_style_addcartonly".equals(str);
            }
        }
        return "&extInput=" + jSONObject.toJSONString();
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        if ("bottombar_style_confirm".equals(str)) {
            return "CONFIRM";
        }
        if (!"bottombar_style_confirm_addcart".equals(str)) {
            if ("bottombar_style_confirm_buy".equals(str) || "bottombar_style_buyonly".equals(str)) {
                return "BUYNOW";
            }
            if (!"bottombar_style_addcartonly".equals(str)) {
                return "ADDCART_AND_BUYNOW";
            }
        }
        return "ADDCART";
    }

    private boolean a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7, String str8, final String str9) {
        String str10;
        String str11;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df13f17", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7, str8, str9})).booleanValue();
        }
        if (!TextUtils.isEmpty(str9)) {
            String jSONString = new JSONObject() { // from class: com.taobao.tao.sku.view.MainSkuActivity.4
                {
                    put("bizName", (Object) str9);
                }
            }.toJSONString();
            str11 = "&skuUT=" + URLEncoder.encode(jSONString);
            str10 = "&skuInnerBizName=" + str9;
        } else {
            str10 = "";
            str11 = str10;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://sku.taobao.com/index.htm?itemId=");
        sb.append(str);
        sb.append("&skuId=");
        sb.append(str2);
        sb.append("&bottomMode=");
        sb.append(str3);
        sb.append("&ignore_toast=true");
        sb.append("&downgradeStr=");
        sb.append(URLEncoder.encode(str4));
        sb.append(!TextUtils.isEmpty(str8) ? "&urlSolid=" + URLEncoder.encode(str8) : "");
        if (TextUtils.isEmpty(str6)) {
            str6 = "";
        }
        sb.append(str6);
        if (TextUtils.isEmpty(str7)) {
            str7 = "";
        }
        sb.append(str7);
        sb.append(str10);
        sb.append(str11);
        sb.append(str5);
        String sb2 = sb.toString();
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str12 : map.keySet()) {
                bundle.putString(str12, map.get(str12));
            }
        }
        Nav.from(this).withExtras(bundle).forResult(10086).toUri(sb2);
        return true;
    }
}
