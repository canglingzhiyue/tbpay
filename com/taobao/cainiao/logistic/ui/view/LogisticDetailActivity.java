package com.taobao.cainiao.logistic.ui.view;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.helper.g;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.hyk;
import tb.hyq;
import tb.kge;

/* loaded from: classes6.dex */
public class LogisticDetailActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f16852a = "LogisticDetailActivity";
    private String b;
    private MtopBusiness c;

    static {
        kge.a(1049769008);
    }

    public static /* synthetic */ Object ipc$super(LogisticDetailActivity logisticDetailActivity, String str, Object... objArr) {
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

    public static /* synthetic */ MtopBusiness a(LogisticDetailActivity logisticDetailActivity, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("15ed770f", new Object[]{logisticDetailActivity, mtopBusiness});
        }
        logisticDetailActivity.c = mtopBusiness;
        return mtopBusiness;
    }

    public static /* synthetic */ String a(LogisticDetailActivity logisticDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a21f719", new Object[]{logisticDetailActivity}) : logisticDetailActivity.b;
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().addFlags(67108864);
            getWindow().setStatusBarColor(0);
        }
        setContentView(R.layout.activity_cn_logistic);
        String d = g.d(getIntent());
        if (!TextUtils.isEmpty(d)) {
            this.b = hyk.L();
            String trim = d.trim();
            this.b += trim;
            a(trim);
        } else {
            String b = g.b(getIntent(), "mailNo");
            String b2 = g.b(getIntent(), CoreConstants.IN_PARAMS_ORDER_CODE);
            this.b = hyk.M();
            if (!TextUtils.isEmpty(b)) {
                this.b += "%26mailNo%3D" + b.trim();
            }
            if (!TextUtils.isEmpty(b2)) {
                this.b += "%26orderCode%3D" + b2.trim();
            }
            hyq.a("LogisticDetailActivity", (TextUtils.isEmpty(b) || TextUtils.isEmpty(b2)) ? "CNLD_DEFGRADE_2_MAILNO" : "CNLD_EMPTY_ORDERID", "intent=" + a());
            Nav.from(this).toUri(this.b);
            finish();
        }
        String a2 = a();
        hyq.a("LogisticDetailActivity", "CN_LD_DEGRADE", "intent=" + a2);
        TLog.loge("LogisticDetailActivity", "intent = " + a2 + " origin url = " + this.b);
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        Intent intent = getIntent();
        if (intent == null) {
            return "";
        }
        ComponentName component = intent.getComponent();
        StringBuilder sb = new StringBuilder();
        sb.append("componentName:");
        if (component != null) {
            sb.append(component.getPackageName());
            sb.append("|");
            sb.append(component.getClassName());
        } else {
            sb.append("null");
        }
        sb.append("#Intent:");
        if (intent.getData() != null) {
            sb.append(intent.getData().toString());
        } else {
            sb.append("null");
        }
        return sb.toString();
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(CoreConstants.IN_PARAM_BIZ_ORDER_ID, (Object) str);
        jSONObject2.put("originalJumpUrl", (Object) this.b);
        jSONObject.put("params", (Object) a.a(jSONObject2.toJSONString()));
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.logistics.detail.route");
        mtopRequest.setVersion("1.0");
        mtopRequest.setData(jSONObject.toJSONString());
        this.c = MtopBusiness.build(mtopRequest);
        this.c.mo1305reqMethod(MethodEnum.GET);
        this.c.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.cainiao.logistic.ui.view.LogisticDetailActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                Nav.from(LogisticDetailActivity.this).toUri(LogisticDetailActivity.a(LogisticDetailActivity.this));
                LogisticDetailActivity.a(LogisticDetailActivity.this, null);
                TLog.loge("LogisticDetailActivity", "logistics.detail.route onSystemError ", mtopResponse != null ? mtopResponse.toString() : "");
                LogisticDetailActivity.this.finish();
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
                    if (parseObject.getJSONObject("data") != null) {
                        String string = parseObject.getJSONObject("data").getString("result");
                        if (!TextUtils.isEmpty(string)) {
                            Nav.from(LogisticDetailActivity.this).toUri(string);
                            String str2 = "CN_DEGRADE_2_NATIVE";
                            String str3 = string.contains("order_detail.htm") ? str2 : "CN_DEGRADE_2_MINIAPP";
                            if (!string.contains("order_detail.htm")) {
                                str2 = "CN_DEGRADE_2_MINIAPP";
                            }
                            hyq.a("LogisticDetailActivity", str3, str2);
                            LogisticDetailActivity.this.finish();
                            return;
                        }
                    }
                } catch (Exception e) {
                    TLog.loge("LogisticDetailActivity", "logistics.detail.route error ", e);
                }
                Nav.from(LogisticDetailActivity.this).toUri(LogisticDetailActivity.a(LogisticDetailActivity.this));
                LogisticDetailActivity.a(LogisticDetailActivity.this, null);
                LogisticDetailActivity.this.finish();
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                Nav.from(LogisticDetailActivity.this).toUri(LogisticDetailActivity.a(LogisticDetailActivity.this));
                LogisticDetailActivity.a(LogisticDetailActivity.this, null);
                TLog.loge("LogisticDetailActivity", "logistics.detail.route onError ", mtopResponse != null ? mtopResponse.toString() : "");
                LogisticDetailActivity.this.finish();
            }
        });
        this.c.startRequest();
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        MtopBusiness mtopBusiness = this.c;
        if (mtopBusiness == null) {
            return;
        }
        mtopBusiness.cancelRequest();
    }
}
