package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.a;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.b;
import com.taobao.taolive.room.utils.as;
import com.taobao.taolive.room.utils.v;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pjt implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Map<String, String> CLASS_MAPPING;
    public static final String TAG = "AbilityCompontent";

    /* renamed from: a  reason: collision with root package name */
    private Map<OpenAbilityCompontentTypeEnum, b> f32706a = new HashMap();

    static {
        kge.a(-40072676);
        kge.a(826918925);
        HashMap hashMap = new HashMap();
        CLASS_MAPPING = hashMap;
        hashMap.put("tab2", "com.taobao.android.tab2liveroom.liveroom.plugins.SubLiveAbilityCostomizedPlugin");
        CLASS_MAPPING.put("shop2F", "com.taobao.taolive.room.controller2.TBLVOpenShopCardComponent");
    }

    public pjt a(pkg pkgVar) {
        this.f32706a = new pjs().a(pkgVar);
        if (pkgVar != null && pkgVar.f != null && as.i()) {
            String str = CLASS_MAPPING.get(v.a(pkgVar.f.get("OpenWatchType")));
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f32706a = (Map) Class.forName(str).getMethod("customizedPluginMap", Map.class, Map.class).invoke(null, this.f32706a, pkgVar.f);
                } catch (Exception e) {
                    Log.e(TAG, "createComponentWithContext", e);
                }
            }
        }
        return this;
    }

    @Override // com.taobao.taolive.room.openarchitecture.opencompontent.ability.a
    public b c(OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("13c415ac", new Object[]{this, openAbilityCompontentTypeEnum});
        }
        Map<OpenAbilityCompontentTypeEnum, b> map = this.f32706a;
        if (map == null) {
            return null;
        }
        return map.get(openAbilityCompontentTypeEnum);
    }

    @Override // com.taobao.taolive.room.openarchitecture.opencompontent.ability.a
    public Object a(OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("831873a6", new Object[]{this, openAbilityCompontentTypeEnum});
        }
        Map<OpenAbilityCompontentTypeEnum, b> map = this.f32706a;
        if (map != null && (bVar = map.get(openAbilityCompontentTypeEnum)) != null) {
            return bVar.c;
        }
        return null;
    }

    @Override // com.taobao.taolive.room.openarchitecture.opencompontent.ability.a
    public boolean b(OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c379d6f", new Object[]{this, openAbilityCompontentTypeEnum})).booleanValue();
        }
        Map<OpenAbilityCompontentTypeEnum, b> map = this.f32706a;
        if (map != null && (bVar = map.get(openAbilityCompontentTypeEnum)) != null) {
            return bVar.b;
        }
        return false;
    }
}
