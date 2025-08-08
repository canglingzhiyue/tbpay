package com.taobao.android.weex_framework.module.builtin;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.util.g;
import tb.jvb;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1860095635);
    }

    public static boolean a(MUSModule mUSModule, String str, b bVar) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3415c86c", new Object[]{mUSModule, str, bVar})).booleanValue();
        }
        if (!(mUSModule.getInstance() instanceof jvb)) {
            return false;
        }
        jvb jvbVar = (jvb) mUSModule.getInstance();
        String b = jvbVar.b();
        if (!StringUtils.isEmpty(b) && (parse = Uri.parse(b)) != null && parse.isHierarchical() && parse.getQueryParameter("wx_popId") != null && l.a().p() != null) {
            l.a().p().a(mUSModule, str);
            if (bVar != null) {
                bVar.a("MUS_SUCCESS");
            }
            return true;
        } else if (jvbVar.getActivityNav() != null && jvbVar.getActivityNav().b(mUSModule.getInstance().getUIContext(), mUSModule.getInstance(), str)) {
            if (bVar != null) {
                bVar.a("MUS_SUCCESS");
            }
            return true;
        } else {
            if (jvbVar.getUIContext() instanceof Activity) {
                Activity activity = (Activity) jvbVar.getUIContext();
                if (bVar != null) {
                    bVar.a("MUS_SUCCESS");
                }
                activity.finish();
            }
            return true;
        }
    }

    public static boolean b(MUSModule mUSModule, String str, b bVar) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddf95ad", new Object[]{mUSModule, str, bVar})).booleanValue();
        }
        if (!(mUSModule.getInstance() instanceof jvb)) {
            return false;
        }
        jvb jvbVar = (jvb) mUSModule.getInstance();
        jvbVar.setIgnoreWhiteScreenReport(true);
        String b = jvbVar.b();
        if (!StringUtils.isEmpty(b) && (parse = Uri.parse(b)) != null && parse.isHierarchical() && parse.getQueryParameter("wx_popId") != null && l.a().p() != null) {
            l.a().p().b(mUSModule, str);
            if (bVar != null) {
                bVar.a("MUS_SUCCESS");
            }
            return true;
        }
        if (!StringUtils.isEmpty(str)) {
            if (jvbVar.getActivityNav() != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", (Object) str);
                if (jvbVar.getActivityNav().a(mUSModule.getInstance().getUIContext(), mUSModule.getInstance(), jSONObject.toJSONString())) {
                    if (mUSModule.getInstance().getUIContext() instanceof Activity) {
                        ((Activity) mUSModule.getInstance().getUIContext()).finish();
                    }
                    if (bVar != null) {
                        bVar.a("MUS_SUCCESS");
                    }
                    return true;
                }
            }
            try {
                String string = JSON.parseObject(str).getString("url");
                if (!StringUtils.isEmpty(string)) {
                    Uri parse2 = Uri.parse(string);
                    String scheme = parse2.getScheme();
                    Uri.Builder buildUpon = parse2.buildUpon();
                    if (StringUtils.isEmpty(scheme)) {
                        buildUpon.scheme("http");
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
                    intent.addCategory("com.taobao.android.intent.category.MUS");
                    intent.putExtra("instanceId", jvbVar.getInstanceId());
                    jvbVar.getUIContext().startActivity(intent);
                    if (mUSModule.getInstance().getUIContext() instanceof Activity) {
                        ((Activity) mUSModule.getInstance().getUIContext()).finish();
                    }
                    if (bVar != null) {
                        bVar.a("MUS_SUCCESS");
                    }
                }
            } catch (Exception e) {
                g.c("MUSNativeApiModel", e);
                if (bVar != null) {
                    bVar.a(com.taobao.android.weex_ability.page.a.RESULT_ERROR);
                }
            }
        } else if (bVar != null) {
            bVar.a(com.taobao.android.weex_ability.page.a.RESULT_ERROR);
        }
        return true;
    }
}
