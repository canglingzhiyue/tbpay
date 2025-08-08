package com.taobao.android.detail.wrapper.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.detail.wrapper.newsku.maccolor.a;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.tao.TaobaoApplication;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class MacColorActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1513696444);
    }

    public static /* synthetic */ Object ipc$super(MacColorActivity macColorActivity, String str, Object... objArr) {
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

    public MacColorActivity() {
        f.a("com.taobao.android.detail", "com.taobao.android.detail.wrapper.activity.MacColorActivity");
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
        try {
            Map map = (Map) getIntent().getSerializableExtra("fields");
            JSONObject jSONObject = new JSONObject(map);
            final String str = (String) ((Map) map.get("queryParams")).get("sku_token");
            final List list = (List) map.get("vPropertyList");
            com.taobao.android.detail.wrapper.newsku.maccolor.a aVar = new com.taobao.android.detail.wrapper.newsku.maccolor.a(this);
            aVar.a(jSONObject);
            aVar.a((String) map.get("url"), new a.InterfaceC0452a() { // from class: com.taobao.android.detail.wrapper.activity.MacColorActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.wrapper.newsku.maccolor.a.InterfaceC0452a
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    Map map2 = null;
                    for (Map map3 : list) {
                        String str3 = (String) map3.get("pvId");
                        if (!StringUtils.isEmpty(str3) && str3.contains(str2)) {
                            map3.put("macVidChanged", "true");
                            map2 = map3;
                        }
                    }
                    if (map2 == null) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("params", (Object) map2);
                    jSONObject2.put("action", (Object) "biz_maccolor");
                    jSONObject2.put("skuToken", (Object) str);
                    Intent intent = new Intent();
                    intent.setAction("com.taobao.sku.intent.action.transferData");
                    intent.putExtra("stringifyData", jSONObject2.toJSONString());
                    intent.addCategory("android.intent.category.DEFAULT");
                    MacColorActivity.this.sendBroadcast(intent);
                    MacColorActivity.this.finish();
                }
            });
        } catch (Exception unused) {
            finish();
        }
    }
}
