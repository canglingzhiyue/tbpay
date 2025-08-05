package com.taobao.android.weex_ability.page;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import tb.dkt;
import tb.dkx;
import tb.dlh;
import tb.dll;
import tb.dlr;
import tb.kge;

/* loaded from: classes6.dex */
public class g implements com.taobao.android.weex_framework.adapter.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INSTANCE_ID = "instanceId";
    public static final String MUS = "com.taobao.android.intent.category.MUS";

    static {
        kge.a(-670994166);
        kge.a(-1569964723);
    }

    @Override // com.taobao.android.weex_framework.adapter.h
    public void a(MUSModule mUSModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19fdd1", new Object[]{this, mUSModule, str});
            return;
        }
        MUSDKInstance mUSDKInstance = (MUSDKInstance) mUSModule.getInstance();
        if (mUSDKInstance == null) {
            return;
        }
        String instanceEnv = mUSDKInstance.getInstanceEnv("bundleUrl");
        if (TextUtils.isEmpty(instanceEnv) || !instanceEnv.contains("wx_popId")) {
            return;
        }
        a(mUSDKInstance.getUIContext(), instanceEnv);
    }

    @Override // com.taobao.android.weex_framework.adapter.h
    public void b(MUSModule mUSModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42c82892", new Object[]{this, mUSModule, str});
            return;
        }
        MUSDKInstance mUSDKInstance = (MUSDKInstance) mUSModule.getInstance();
        if (mUSDKInstance != null) {
            String instanceEnv = mUSDKInstance.getInstanceEnv("bundleUrl");
            if (!TextUtils.isEmpty(instanceEnv) && instanceEnv.contains("wx_popId")) {
                a(mUSDKInstance.getUIContext(), instanceEnv);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (mUSDKInstance.getActivityNav() != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", (Object) str);
                if (mUSDKInstance.getActivityNav().a(mUSModule.getInstance().getUIContext(), mUSModule.getInstance(), jSONObject.toJSONString())) {
                    if (!(mUSModule.getInstance().getUIContext() instanceof Activity)) {
                        return;
                    }
                    ((Activity) mUSModule.getInstance().getUIContext()).finish();
                    return;
                }
            }
            try {
                String string = JSON.parseObject(str).getString("url");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                Uri parse = Uri.parse(string);
                String scheme = parse.getScheme();
                Uri.Builder buildUpon = parse.buildUpon();
                if (TextUtils.isEmpty(scheme)) {
                    buildUpon.scheme("http");
                }
                Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
                intent.addCategory("com.taobao.android.intent.category.MUS");
                intent.putExtra("instanceId", mUSDKInstance.getInstanceId());
                mUSDKInstance.getUIContext().startActivity(intent);
                if (!(mUSModule.getInstance().getUIContext() instanceof Activity)) {
                    return;
                }
                ((Activity) mUSModule.getInstance().getUIContext()).finish();
                return;
            } catch (Exception e) {
                com.taobao.android.weex_framework.monitor.b.a();
                com.taobao.android.weex_framework.util.g.c("MUSNativeApiModel", e);
                return;
            }
        }
        com.taobao.android.weex_framework.util.g.f("MUSNativeApiModel", "param is empty");
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Uri parse = Uri.parse(str);
            String queryParameter = (parse == null || !parse.isHierarchical() || parse.getQueryParameter("wx_popId") == null) ? "" : parse.getQueryParameter("wx_popId");
            if (TextUtils.isEmpty(queryParameter)) {
                return;
            }
            dlr dlrVar = new dlr();
            dlrVar.a(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "dismissStdPop");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("popId", (Object) queryParameter);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("animation", (Object) com.taobao.android.abilitykit.ability.pop.model.d.KEY_FADE_IN_OUT);
            jSONObject3.put("tapEnable", (Object) true);
            jSONObject3.put("pushType", (Object) "outterJump");
            jSONObject3.put("originHeight", (Object) 1);
            jSONObject3.put("maxHeight", (Object) 1);
            jSONObject2.put(com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (Object) jSONObject3);
            jSONObject.put("params", (Object) jSONObject2);
            new dkt().a(new dlh(jSONObject), dlrVar, new dll() { // from class: com.taobao.android.weex_ability.page.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dll
                public void callback(String str2, dkx dkxVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("398d9b15", new Object[]{this, str2, dkxVar});
                    }
                }
            });
        }
    }
}
