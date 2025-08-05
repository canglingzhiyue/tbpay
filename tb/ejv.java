package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.ae;
import com.taobao.weex.common.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@AURAExtensionImpl(code = "picGallery.impl.event.switchMainImage")
/* loaded from: classes4.dex */
public final class ejv extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f27352a = "PicGallerySwitchMainImageEvent";

    static {
        kge.a(-988893473);
    }

    public static /* synthetic */ Object ipc$super(ejv ejvVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : ae.EVENT_TYPE;
    }

    public ejv() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.events.PicGallerySwitchMainImageEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        AURARenderComponent d = aURAEventIO.getEventModel().d();
        if (d == null || d.data == null || d.data.fields == null) {
            ard a2 = arc.a();
            a2.c("PicGallerySwitchMainImageEvent", "innerHandleEvent", "component or component.data or component.data.fields is null,eventType=" + aURAEventIO.getEventType());
            return;
        }
        Map<String, Object> map = d.data.fields;
        JSONObject c = aURAEventIO.getEventModel().c();
        if (c == null) {
            ard a3 = arc.a();
            a3.c("PicGallerySwitchMainImageEvent", "innerHandleEvent", "eventFields is null,eventType=" + aURAEventIO.getEventType());
            return;
        }
        b().b().a("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(a(d, map, c))), null);
    }

    private a a(AURARenderComponent aURARenderComponent, Map<String, Object> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ac6104cd", new Object[]{this, aURARenderComponent, map, jSONObject});
        }
        HashMap hashMap = new HashMap();
        String string = jSONObject.getString("imageUrl");
        String str = map.get("mainImageUrl") instanceof String ? (String) map.get("mainImageUrl") : "";
        if (TextUtils.equals(string, str)) {
            hashMap.put("originImageUrl", "");
        } else {
            hashMap.put("originImageUrl", str);
        }
        hashMap.put("mainImageUrl", string);
        Object obj = map.get(Constants.Name.Recycler.LIST_DATA);
        JSONArray jSONArray = obj instanceof JSONArray ? (JSONArray) obj : null;
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    if (TextUtils.equals(jSONObject2.getString("imageUrl"), string)) {
                        jSONObject2.put(ThemisConfig.SCENE_SELECT, (Object) "true");
                    } else {
                        jSONObject2.put(ThemisConfig.SCENE_SELECT, (Object) "false");
                    }
                }
            }
        }
        return bbg.a(RuleType.PROPS_WRITE_BACK, aURARenderComponent, hashMap);
    }
}
