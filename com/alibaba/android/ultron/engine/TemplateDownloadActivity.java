package com.alibaba.android.ultron.engine;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.android.ultron.engine.template.TemplateInfo;
import com.alibaba.android.ultron.engine.template.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.jpx;
import tb.kge;

/* loaded from: classes2.dex */
public class TemplateDownloadActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TextView f2542a;
    public String b;

    static {
        kge.a(-1717390204);
    }

    public static /* synthetic */ Object ipc$super(TemplateDownloadActivity templateDownloadActivity, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(TemplateDownloadActivity templateDownloadActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f91ea793", new Object[]{templateDownloadActivity});
        } else {
            templateDownloadActivity.c();
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
        if (!jpx.a(this)) {
            finish();
            return;
        }
        setContentView(R.layout.activity_template_mock);
        a();
        b();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f2542a = (TextView) findViewById(R.id.template_mock_info);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = d();
        this.f2542a.setText(this.b);
        if (this.b == null) {
            return;
        }
        TextView textView = this.f2542a;
        textView.setText(this.b + "\n模板信息获取中...");
        this.f2542a.postDelayed(new Runnable() { // from class: com.alibaba.android.ultron.engine.TemplateDownloadActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TemplateDownloadActivity.a(TemplateDownloadActivity.this);
                }
            }
        }, 20L);
    }

    private void c() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Response syncSend = new DegradableNetwork(this).syncSend(new RequestImpl(this.b), null);
        int statusCode = syncSend.getStatusCode();
        try {
            jSONObject = (JSONObject) JSONObject.parse(new String(syncSend.getBytedata()));
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject != null && jSONObject.getBoolean("success").booleanValue()) {
            z = true;
        }
        if (statusCode == 200 && z) {
            this.f2542a.setText(this.b + "\n模板信息获取成功, mock模板替换完成");
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 == null) {
                return;
            }
            TemplateInfo templateInfo = new TemplateInfo();
            templateInfo.setTemplateId(jSONObject2.getString("templateId"));
            templateInfo.setVersion(jSONObject2.getString("version"));
            String string = jSONObject2.getString("scenario");
            if ("detail".equals(string)) {
                string = "detail2";
            }
            d dVar = new d(this, string);
            d.i.clear();
            dVar.b(templateInfo, jSONObject2);
            this.f2542a.setText(((Object) this.f2542a.getText()) + "\n" + templateInfo.toString());
            return;
        }
        this.f2542a.setText(this.b + "\n模板信息获取失败: " + statusCode);
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        try {
            return getIntent().getData().toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
