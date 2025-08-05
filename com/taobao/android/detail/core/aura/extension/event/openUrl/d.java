package com.taobao.android.detail.core.aura.extension.event.openUrl;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-437082043);
        emu.a("com.taobao.android.detail.core.aura.extension.event.openUrl.AliDetailOpenUrlUtils");
    }

    public static UMFRuleIO a(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFRuleIO) ipChange.ipc$dispatch("ac97dc68", new Object[]{aURAEventIO});
        }
        com.alibaba.android.aura.service.event.d eventModel = aURAEventIO.getEventModel();
        AURARenderComponent d = eventModel.d();
        if (d == null) {
            return null;
        }
        Event event = new Event();
        event.fields = eventModel.c();
        event.id = eventModel.a();
        event.tag = eventModel.b();
        event.type = aURAEventIO.getEventType();
        com.alibaba.android.umf.datamodel.service.rule.a aVar = new com.alibaba.android.umf.datamodel.service.rule.a();
        aVar.b = d.key;
        aVar.f2839a = RuleType.PROPS_WRITE_BACK;
        aVar.d.f2137a = d.data.fields;
        aVar.d.b = d.data.events;
        HashMap hashMap = new HashMap();
        hashMap.put(aURAEventIO.getEventModel().b(), Collections.singletonList(event));
        aVar.c.b = hashMap;
        return new UMFRuleIO(Collections.singletonList(aVar));
    }

    public static void a(Bundle bundle, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3a4492", new Object[]{bundle, str, obj});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (!(obj instanceof Serializable)) {
            } else {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
    }

    public static String a(String str, Map<String, Object> map) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        if (map == null || map.isEmpty()) {
            return str;
        }
        HashMap hashMap = new HashMap();
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String str2 : queryParameterNames) {
                if (str2 != null && (queryParameter = parse.getQueryParameter(str2)) != null) {
                    hashMap.put(str2, queryParameter);
                }
            }
        }
        hashMap.putAll(map);
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey()) && entry.getValue() != null) {
                clearQuery.appendQueryParameter((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return clearQuery.build().toString();
    }
}
