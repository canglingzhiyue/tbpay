package com.taobao.tao.alipay.callservice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.alipay.export.CashdeskConstants;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import com.taobao.tao.remotebusiness.login.e;
import com.taobao.tao.remotebusiness.login.h;
import com.taobao.taobao.R;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopAccountSiteUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class AlipayCallServiceActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIPAY_EXTERN_TOKEN = "extern_token";
    public static final int ALIPAY_RESULT_CODE = 1001;

    public static /* synthetic */ Object ipc$super(AlipayCallServiceActivity alipayCallServiceActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        getWindow().addFlags(16);
        String a2 = a(getIntent(), "bizType");
        String a3 = a(getIntent(), "sign_params");
        String a4 = a(getIntent(), MtopJSBridge.MtopJSParam.ACCOUNT_SITE);
        if (a2 == null || a3 == null) {
            finish();
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(getApplication().getPackageName());
        intent.setAction(CashdeskConstants.ALIPAY_ACTION);
        intent.putExtra("bizType", a2);
        try {
            intent.putExtra("data", new JSONObject().put("sign_params", a3).put(ALIPAY_EXTERN_TOKEN, a(a4)).toString());
            startActivityForResult(intent, 1001);
        } catch (JSONException unused) {
            finish();
        }
    }

    private String a(String str) {
        e b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str != null && str.equalsIgnoreCase("xianyu") && (b = h.b(Mtop.instance(MtopAccountSiteUtils.getInstanceId("xianyu"), getApplicationContext()), null)) != null && b.f21035a != null) {
            return b.f21035a;
        }
        return Login.getSid();
    }

    public String a(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0dec1d1", new Object[]{this, intent, str});
        }
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i != 1001) {
            return;
        }
        a.a().a(intent);
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        a.a().b();
        super.onDestroy();
    }
}
