package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.sdk.auth.OpenAuthTask;
import com.alipay.sdk.auth.manager.AFReportManager;
import com.alipay.sdk.m.d.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import tb.icf;

/* loaded from: classes3.dex */
public class AlipayResultActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ConcurrentHashMap<String, a> b = new ConcurrentHashMap<>();

    /* loaded from: classes3.dex */
    public interface a {
        void a(int i, String str, String str2);
    }

    private void a(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
            return;
        }
        a remove = b.remove(str);
        if (remove == null) {
            return;
        }
        try {
            remove.a(bundle.getInt("endCode"), bundle.getString("memo"), bundle.getString("result"));
        } finally {
            finish();
        }
    }

    public static /* synthetic */ Object ipc$super(AlipayResultActivity alipayResultActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
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
        JSONObject jSONObject;
        Bundle bundle2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra(MspGlobalDefine.SESSION);
            Bundle bundleExtra = intent.getBundleExtra("result");
            String stringExtra2 = intent.getStringExtra("scene");
            if (b.a(stringExtra) == null) {
                AFReportManager.getProvider().report(3001, "session is null");
                finish();
            } else if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
                a(stringExtra, bundleExtra);
            } else {
                if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), StandardCharsets.UTF_8));
                        jSONObject = jSONObject2.getJSONObject("result");
                        stringExtra = jSONObject2.getString(MspGlobalDefine.SESSION);
                        bundle2 = new Bundle();
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            bundle2.putString(next, jSONObject.getString(next));
                        }
                        bundleExtra = bundle2;
                    } catch (Throwable th2) {
                        th = th2;
                        bundleExtra = bundle2;
                        Log.e("AlipayResultActivity", "retry exception", th);
                        AFReportManager.getProvider().report(3002, th.getMessage());
                        if (TextUtils.isEmpty(stringExtra)) {
                        }
                        AFReportManager.getProvider().report(3001, "session or biz is null");
                        finish();
                    }
                }
                if (TextUtils.isEmpty(stringExtra) && bundleExtra != null) {
                    AFReportManager.getProvider().report(9000, icf.a.CONTROL_NAME_OK);
                    OpenAuthTask.returnResult(stringExtra, 9000, icf.a.CONTROL_NAME_OK, bundleExtra);
                    finish();
                    return;
                }
                AFReportManager.getProvider().report(3001, "session or biz is null");
                finish();
            }
        } catch (Throwable th3) {
            Log.e("AlipayResultActivity", "exception", th3);
            AFReportManager.getProvider().report(3002, th3.getMessage());
            finish();
        }
    }
}
