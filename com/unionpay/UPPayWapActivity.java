package com.unionpay;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.taobao.linkmanager.afc.windvane.DeviceInfoJsBridge;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class UPPayWapActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private static String f24013a = "ex_mode";
    private WebView b;
    private WebViewJavascriptBridge c;
    private AlertDialog d;
    private boolean e = false;
    private String f = "";
    private String g;
    private View h;
    private aa i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(UPPayWapActivity uPPayWapActivity, boolean z) {
        View view = uPPayWapActivity.h;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra(MspGlobalDefine.SCHEME_PAY_RESULT, str);
        intent.putExtra("result_data", str2);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
            if (str != null) {
                jSONObject.put("code", str);
            }
            if (str2 != null) {
                jSONObject.put("msg", str2);
            }
            if (str3 != null) {
                jSONObject.put("value", str3);
            }
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, String str2, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
            if (str != null) {
                jSONObject2.put("code", str);
            }
            if (str2 != null) {
                jSONObject2.put("msg", str2);
            }
            if (jSONObject != null) {
                jSONObject2.put("value", jSONObject);
            }
            return jSONObject2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(UPPayWapActivity uPPayWapActivity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(uPPayWapActivity);
        uPPayWapActivity.d = builder.create();
        builder.setMessage(com.unionpay.utils.k.a().f24050a);
        builder.setTitle(com.unionpay.utils.k.a().d);
        builder.setPositiveButton(com.unionpay.utils.k.a().b, new r(uPPayWapActivity));
        builder.setNegativeButton(com.unionpay.utils.k.a().c, new s(uPPayWapActivity));
        builder.create().show();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        aa aaVar;
        String b;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            try {
                extras = intent.getExtras();
            } catch (Exception unused) {
                aa aaVar2 = this.i;
                if (aaVar2 != null) {
                    aaVar2.a(b("1", "No pay result", (String) null));
                }
            }
            if (extras == null) {
                if (this.i != null) {
                    aaVar = this.i;
                    b = b("1", "No pay result", (String) null);
                }
                this.i = null;
            }
            String string = extras.containsKey(MspGlobalDefine.SCHEME_PAY_RESULT) ? extras.getString(MspGlobalDefine.SCHEME_PAY_RESULT) : extras.containsKey("code") ? extras.getString("code") : "";
            if (StringUtils.isEmpty(string)) {
                string = "";
            }
            String string2 = extras.containsKey("data") ? extras.getString("data") : "";
            if (StringUtils.isEmpty(string2)) {
                string2 = "";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", string);
            jSONObject.put("data", string2);
            if (this.i != null) {
                aaVar = this.i;
                b = b("0", (String) null, jSONObject);
            }
            this.i = null;
            aaVar.a(b);
            this.i = null;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        View.OnClickListener onClickListener;
        super.onCreate(bundle);
        getWindow().addFlags(8192);
        try {
            try {
                if (!"949A1CC".equalsIgnoreCase(getIntent().getStringExtra("magic_data"))) {
                    finish();
                }
                this.e = "link".equals(getIntent().getStringExtra("actionType"));
                this.f = getIntent().getStringExtra(f24013a);
                if (StringUtils.isEmpty(this.f)) {
                    this.f = "00";
                }
                String str = "";
                getWindow().requestFeature(1);
                RelativeLayout relativeLayout = new RelativeLayout(this);
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(1);
                relativeLayout.addView(linearLayout, new RelativeLayout.LayoutParams(-1, -1));
                setContentView(relativeLayout);
                this.b = new WebView(this);
                this.g = getIntent().getStringExtra("actionType");
                if ("link".equals(this.g)) {
                    str = getIntent().getStringExtra("wapurl");
                } else {
                    String stringExtra = getIntent().getStringExtra("waptype");
                    String stringExtra2 = getIntent().getStringExtra("wapurl");
                    if ("new_page".equals(stringExtra)) {
                        if (stringExtra2 != null) {
                            str = stringExtra2;
                        }
                        onClickListener = new j(this);
                    } else {
                        String stringExtra3 = getIntent().getStringExtra("paydata");
                        if (stringExtra3 != null) {
                            str = stringExtra2 + "?s=" + stringExtra3;
                        }
                        onClickListener = null;
                    }
                    ImageView imageView = new ImageView(this);
                    imageView.setBackgroundDrawable(com.unionpay.utils.g.a(com.unionpay.utils.h.b));
                    int a2 = com.unionpay.utils.f.a(this, 24.0f);
                    int a3 = com.unionpay.utils.f.a(this, 18.0f);
                    int a4 = com.unionpay.utils.f.a(this, 14.0f);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
                    layoutParams.addRule(9, -1);
                    layoutParams.addRule(10, -1);
                    layoutParams.setMargins(a3, a4, 0, 0);
                    relativeLayout.addView(imageView, layoutParams);
                    if (onClickListener == null) {
                        onClickListener = new q(this);
                    }
                    imageView.setOnClickListener(onClickListener);
                    this.h = imageView;
                }
                this.b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                linearLayout.addView(this.b);
                this.c = new WebViewJavascriptBridge(this, this.b, null);
                this.c.setAllowScheme(true);
                if (this.b != null) {
                    this.b.loadUrl(str);
                }
                if (this.c == null) {
                    return;
                }
                this.c.registerHandler(DeviceInfoJsBridge.ACTION, new v(this));
                this.c.registerHandler("saveData", new t(this));
                this.c.registerHandler("getData", new u(this));
                this.c.registerHandler("removeData", new w(this));
                this.c.registerHandler("setPageBackEnable", new x(this));
                this.c.registerHandler("payBySDK", new ad(this));
                this.c.registerHandler("payResult", new k(this));
                this.c.registerHandler("closePage", new l(this));
                this.c.registerHandler("openNewPage", new m(this));
                this.c.registerHandler("checkBankSchemes", new n(this));
                this.c.registerHandler("openBankApp", new o(this));
                this.c.registerHandler("openScheme", new p(this));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.e) {
                WebView webView = this.b;
                if (webView != null && webView.canGoBack()) {
                    this.b.goBack();
                    return true;
                }
                a("cancel", (String) null);
            } else {
                onPause();
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
