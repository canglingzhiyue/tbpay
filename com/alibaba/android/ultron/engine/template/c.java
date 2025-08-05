package com.alibaba.android.ultron.engine.template;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.h;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1263740758);
    }

    public static JSONObject a(String str, TemplateInfo templateInfo) {
        String a2;
        com.taobao.alivfssdk.cache.b cacheForModule;
        h b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6f533705", new Object[]{str, templateInfo});
        }
        if (str == null || (a2 = a(templateInfo)) == null || (cacheForModule = AVFSCacheManager.getInstance().cacheForModule(str)) == null || (b = cacheForModule.b()) == null) {
            return null;
        }
        Object b2 = b.b(a2);
        if (b2 instanceof JSONObject) {
            return (JSONObject) b2;
        }
        return null;
    }

    public static String a(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb48e011", new Object[]{templateInfo});
        }
        if (templateInfo == null || templateInfo.getTemplateId() == null || templateInfo.getVersion() == null) {
            return null;
        }
        return templateInfo.getTemplateId() + "_" + templateInfo.getVersion();
    }
}
