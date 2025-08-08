package com.taobao.android.detail.industry.scene.weex2;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.ablility.views.ARMakeupNativeView;
import com.taobao.android.detail.industry.scene.weex2.ar.ARMakeupWeexView;
import com.taobao.android.detail.industry.tool.DIComponentProtocol;
import com.taobao.android.weex_framework.module.MUSModule;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.Map;
import tb.emu;
import tb.eyh;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2099345458);
        emu.a("com.taobao.android.detail.industry.scene.weex2.DIWeexComponentUtil");
    }

    public static DIComponentProtocol a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIComponentProtocol) ipChange.ipc$dispatch("ab88a205", new Object[]{aURARenderComponent});
        }
        DIComponentProtocol dIComponentProtocol = new DIComponentProtocol(aURARenderComponent);
        if (!dIComponentProtocol.isIndustryComponent()) {
            return null;
        }
        return dIComponentProtocol;
    }

    public static void a(DIComponentProtocol dIComponentProtocol, AURARenderComponent aURARenderComponent, Map<String, Class<? extends MUSModule>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e5dd84", new Object[]{dIComponentProtocol, aURARenderComponent, map});
        } else {
            map.put("detailIndustry", DIWeex2Module.class);
        }
    }

    public static void b(DIComponentProtocol dIComponentProtocol, AURARenderComponent aURARenderComponent, Map<String, Class<? extends WeexPlatformView>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3afacb63", new Object[]{dIComponentProtocol, aURARenderComponent, map});
        } else {
            map.put(eyh.NAME, ARMakeupWeexView.class);
        }
    }

    public static View a(DIComponentProtocol dIComponentProtocol, AURARenderComponent aURARenderComponent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d4e9df89", new Object[]{dIComponentProtocol, aURARenderComponent, context});
        }
        if (!com.taobao.android.detail.industry.tool.b.e().equals(dIComponentProtocol.bizCode)) {
            return null;
        }
        return new ARMakeupNativeView(context);
    }

    public static String a(DIComponentProtocol dIComponentProtocol, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6cd572df", new Object[]{dIComponentProtocol, aURARenderComponent});
        }
        if (dIComponentProtocol.bizData != null) {
            Object obj = dIComponentProtocol.bizData.get("weexUrl");
            if (obj instanceof String) {
                String str = (String) obj;
                if (!StringUtils.isEmpty(str)) {
                    return str;
                }
            }
        }
        Object obj2 = aURARenderComponent.data.fields.get("url");
        if (!(obj2 instanceof String)) {
            return null;
        }
        String str2 = (String) obj2;
        if (StringUtils.isEmpty(str2)) {
            return null;
        }
        return str2;
    }

    public static JSONObject b(DIComponentProtocol dIComponentProtocol, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("4333b302", new Object[]{dIComponentProtocol, aURARenderComponent}) : dIComponentProtocol.bizData;
    }
}
