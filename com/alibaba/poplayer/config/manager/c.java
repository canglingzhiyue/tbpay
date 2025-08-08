package com.alibaba.poplayer.config.manager;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import tb.cac;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1859264162);
    }

    public static BaseConfigItem a(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseConfigItem) ipChange.ipc$dispatch("4c44f974", new Object[]{baseConfigItem}) : baseConfigItem;
    }

    public static BaseConfigItem a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConfigItem) ipChange.ipc$dispatch("869cc34c", new Object[]{str, str2, str3});
        }
        BaseConfigItem baseConfigItem = (BaseConfigItem) JSON.parseObject(str, BaseConfigItem.class);
        if (baseConfigItem != null && StringUtils.isEmpty(baseConfigItem.type) && StringUtils.isEmpty(baseConfigItem.params)) {
            if (!StringUtils.isEmpty(com.alibaba.poplayer.factory.a.a().b())) {
                baseConfigItem.type = com.alibaba.poplayer.factory.a.a().b();
            } else {
                baseConfigItem.type = "webview";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("url", baseConfigItem.url);
            hashMap.put("enableHardwareAcceleration", Boolean.valueOf(baseConfigItem.enableHardwareAcceleration));
            baseConfigItem.params = JSON.toJSONString(hashMap);
        }
        if (baseConfigItem != null) {
            baseConfigItem.parseTimeStamps();
            baseConfigItem.parseConfigParams();
            baseConfigItem.indexID = str2;
            baseConfigItem.configVersion = str3;
            baseConfigItem.json = str;
        }
        return baseConfigItem;
    }

    public static BaseConfigItem a(Event event, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConfigItem) ipChange.ipc$dispatch("c0c09459", new Object[]{event, list});
        }
        Uri parse = Uri.parse(event.originUri);
        if (!"directly".equals(parse.getQueryParameter("openType"))) {
            return null;
        }
        BaseConfigItem baseConfigItem = (BaseConfigItem) JSON.parseObject(a(parse), BaseConfigItem.class);
        try {
            String d = InternalTriggerController.d();
            HashMap hashMap = new HashMap();
            hashMap.put("uri", String.valueOf(parse.getHost()));
            hashMap.put("error", "usingOpenTypeDirectly");
            hashMap.put("page", d);
            hashMap.put("pageUrl", InternalTriggerController.c());
            hashMap.put("type", "directly");
            hashMap.put("uuid", baseConfigItem.uuid);
            hashMap.put("indexID", baseConfigItem.indexID);
            hashMap.put("config", event.originUri);
            cac.a().a("other", d, null, hashMap);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PageConfigMgr.parseEventUriConfig.trackAction.error.", th);
        }
        baseConfigItem.parseConfigParams();
        if (PopLayer.getReference().getPopLayerViewAdapter() == null || !PopLayer.getReference().getPopLayerViewAdapter().isHitBlackList(parse, baseConfigItem, list)) {
            return baseConfigItem;
        }
        com.alibaba.poplayer.utils.c.b("configCheck", baseConfigItem.indexID, "PageConfigMgr.parseEventUriConfig.HitBlackList.Ignore.");
        return null;
    }

    private static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : uri.getQueryParameterNames()) {
                jSONObject.put(str, uri.getQueryParameter(str));
            }
        } catch (Throwable unused) {
            com.alibaba.poplayer.utils.c.a("DefaultConfigManager.parseUri.");
        }
        return jSONObject.toString();
    }
}
