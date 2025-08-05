package com.network.diagnosis.toolchain;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.alibaba.ability.localization.b;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.TBErrorViewWidget;
import com.taobao.uikit.extend.component.error.Error;
import org.json.JSONObject;
import tb.arz;

/* loaded from: classes4.dex */
public class ErrorViewActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TBErrorView f8070a;
    private TBErrorViewWidget b;
    private RelativeLayout c;

    public static /* synthetic */ Object ipc$super(ErrorViewActivity errorViewActivity, String str, Object... objArr) {
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

    public static /* synthetic */ TBErrorViewWidget a(ErrorViewActivity errorViewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBErrorViewWidget) ipChange.ipc$dispatch("b5a4bd45", new Object[]{errorViewActivity}) : errorViewActivity.b;
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.network_error_view);
        this.f8070a = (TBErrorView) findViewById(R.id.error_view);
        this.b = (TBErrorViewWidget) findViewById(R.id.error_view_widget);
        this.c = (RelativeLayout) findViewById(R.id.layout_bg);
        a();
    }

    private void a() {
        Uri data;
        TBErrorViewWidget.Status valueOf;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        String queryParameter = data.getQueryParameter("data");
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(queryParameter);
            if (!jSONObject.optBoolean("noTitle", false)) {
                getSupportActionBar().d();
                getSupportActionBar().a(b.a(R.string.taobao_app_1012_1_14017));
                getSupportActionBar().b(getResources().getDrawable(R.color.nd_white));
            } else {
                getSupportActionBar().e();
            }
            if (jSONObject.optBoolean("darkMode", false)) {
                this.c.setBackgroundColor(-12303292);
            } else {
                this.c.setBackgroundColor(-1);
            }
            boolean optBoolean = jSONObject.optBoolean("enableDiagnosis", true);
            TBErrorView tBErrorView = this.f8070a;
            if (optBoolean) {
                z = false;
            }
            tBErrorView.setNotShowNetworkDiagnosisView(z);
            String optString = jSONObject.optString("buttonText", b.a(R.string.taobao_app_1012_1_14015));
            if (!TextUtils.isEmpty(optString)) {
                this.f8070a.setButton(TBErrorView.ButtonType.BUTTON_LEFT, optString, new View.OnClickListener() { // from class: com.network.diagnosis.toolchain.ErrorViewActivity.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        }
                    }
                });
            }
            int i = jSONObject.getInt(ZimMessageChannel.K_RPC_RES_CODE);
            String string = jSONObject.getString(arz.KEY_MAPPING_CODE);
            String string2 = jSONObject.getString("retCode");
            String string3 = jSONObject.getString("errorMsg");
            this.f8070a.setError(Error.Factory.fromMtopResponse(i, string, string2, string3));
            if (!jSONObject.optBoolean("enableWidget", false)) {
                return;
            }
            String optString2 = jSONObject.optString("status", null);
            if (!TextUtils.isEmpty(optString2)) {
                TBErrorViewWidget.Status status = TBErrorViewWidget.Status.STATUS_SYSTEM_ERROR;
                try {
                    valueOf = TBErrorViewWidget.Status.valueOf(optString2.toUpperCase());
                } catch (Exception unused) {
                }
                this.b.setStatus(valueOf);
                a(jSONObject, valueOf);
            } else {
                this.b.setError(Error.Factory.fromMtopResponse(i, string, string2, string3));
            }
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            layoutParams.width = TBErrorViewWidget.getSuggestedWidth(this);
            this.b.setLayoutParams(layoutParams);
            this.f8070a.setVisibility(4);
            this.b.postDelayed(new Runnable() { // from class: com.network.diagnosis.toolchain.ErrorViewActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ErrorViewActivity.a(ErrorViewActivity.this).setVisibility(0);
                    }
                }
            }, 500L);
        } catch (Exception unused2) {
        }
    }

    private void a(JSONObject jSONObject, TBErrorViewWidget.Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dec374b", new Object[]{this, jSONObject, status});
        } else if (status != TBErrorViewWidget.Status.STATUS_CUSTOM) {
        } else {
            String optString = jSONObject.optString("title", "custom title");
            int optInt = jSONObject.optInt("buttons", 4);
            String optString2 = jSONObject.optString("btnText", "update");
            boolean optBoolean = jSONObject.optBoolean("withProgress", true);
            this.b.setCustomTitle(optString);
            this.b.setCustomEnableButtons(optInt);
            if (optBoolean) {
                this.b.setRefreshButtonWithProgress(optString2, jSONObject.optString("btnRunningText", "updating"), null);
            } else {
                this.b.setRefreshButtonWithoutProgress(optString2, null);
            }
        }
    }
}
