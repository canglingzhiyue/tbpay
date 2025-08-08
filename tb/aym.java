package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class aym {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACTION = "action";
    public static final String KEY_ADJUST_OPTIMIZE = "needAdjustOptimize";
    public static final String KEY_TARGET = "target";

    static {
        kge.a(1529230460);
    }

    public static UMFLinkageTrigger a(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFLinkageTrigger) ipChange.ipc$dispatch("46c7b2b5", new Object[]{aURAEventIO});
        }
        d eventModel = aURAEventIO.getEventModel();
        String b = eventModel.b();
        String b2 = b(aURAEventIO);
        JSONObject c = eventModel.c();
        if (c == null) {
            return new UMFLinkageTrigger(b2, b, null);
        }
        String string = c.getString("action");
        String string2 = c.getString("target");
        if (!StringUtils.isEmpty(string2)) {
            b2 = string2;
        }
        String string3 = c.getString(KEY_ADJUST_OPTIMIZE);
        UMFLinkageTrigger uMFLinkageTrigger = new UMFLinkageTrigger(b2, b, string);
        uMFLinkageTrigger.setNeedAdjustOptimize(string3);
        return uMFLinkageTrigger;
    }

    private static String b(AURAEventIO aURAEventIO) {
        AURARenderComponent d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab3f456b", new Object[]{aURAEventIO});
        }
        d eventModel = aURAEventIO.getEventModel();
        if (eventModel != null && (d = eventModel.d()) != null && !StringUtils.isEmpty(d.key)) {
            return d.key;
        }
        return null;
    }
}
