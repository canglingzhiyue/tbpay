package tb;

import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class axl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1765851857);
    }

    public static UMFRuleIO a(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFRuleIO) ipChange.ipc$dispatch("ac97dc68", new Object[]{aURAEventIO});
        }
        d eventModel = aURAEventIO.getEventModel();
        AURARenderComponent d = eventModel.d();
        if (d == null) {
            return null;
        }
        Event event = new Event();
        event.fields = eventModel.c();
        event.id = eventModel.a();
        event.tag = eventModel.b();
        event.type = aURAEventIO.getEventType();
        a aVar = new a();
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
        } else if (StringUtils.isEmpty(str)) {
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        if (map == null || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry != null && !StringUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                buildUpon.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return buildUpon.build().toString();
    }
}
