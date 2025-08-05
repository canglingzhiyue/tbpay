package com.taobao.falco.mega;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.v;
import com.taobao.android.abilityidl.ability.AbsFalcoAbility;
import com.taobao.android.abilityidl.ability.ga;
import com.taobao.falco.FalcoScreenshotMonitor;
import java.util.HashMap;
import java.util.Map;
import tb.als;
import tb.gml;

/* loaded from: classes7.dex */
public class FalcoAbility extends AbsFalcoAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(FalcoAbility falcoAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFalcoAbility
    public void updateScreenshotMonitorParams(als alsVar, ga gaVar, gml gmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eed2aa5", new Object[]{this, alsVar, gaVar, gmlVar});
            return;
        }
        FalcoScreenshotMonitor v = v.b().v();
        if (v == null) {
            gmlVar.a(new ErrorResult(100, "截屏埋点注册失败：功能关闭", (Map<String, ? extends Object>) null));
        } else if (gaVar.b != null && gaVar.b.size() > 0) {
            final Map<String, String> a2 = a(gaVar.b);
            if (v.a(gaVar.f8881a, new FalcoScreenshotMonitor.a() { // from class: com.taobao.falco.mega.FalcoAbility.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.falco.FalcoScreenshotMonitor.a
                public Map<String, String> a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Map) ipChange2.ipc$dispatch("a014a89d", new Object[]{this}) : a2;
                }
            })) {
                return;
            }
            gmlVar.a(new ErrorResult(100, "截屏埋点注册失败：bizid不能为空且长度不能超过100", (Map<String, ? extends Object>) null));
        } else if (v.a(gaVar.f8881a)) {
        } else {
            gmlVar.a(new ErrorResult(100, "截屏埋点解注册失败：bizid不能为空且长度不能超过100", (Map<String, ? extends Object>) null));
        }
    }

    private Map<String, String> a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                hashMap.put(key, value.toString());
            } else {
                hashMap.put(key, null);
            }
        }
        return hashMap;
    }
}
