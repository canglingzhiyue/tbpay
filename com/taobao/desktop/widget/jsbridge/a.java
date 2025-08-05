package com.taobao.desktop.widget.jsbridge;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;
import tb.kib;
import tb.kif;

/* loaded from: classes7.dex */
public class a implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-803392175);
        kge.a(-948502777);
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String str, als alsVar, Map<String, ?> map, final aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, str, alsVar, map, alnVar});
        }
        try {
            b.a(kib.a().b(), str, JSONObject.toJSONString(map), new c() { // from class: com.taobao.desktop.widget.jsbridge.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.desktop.widget.jsbridge.c
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("result", str2);
                    aln alnVar2 = alnVar;
                    if (alnVar2 != null) {
                        alnVar2.a(new FinishResult(hashMap));
                    }
                    kif.a("WidgetServiceAbility execute success result：" + str2);
                }
            });
            return null;
        } catch (Throwable th) {
            kif.a("WidgetServiceAbility error：" + th.getMessage());
            return new ErrorResult(th.getMessage());
        }
    }
}
