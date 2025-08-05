package com.taobao.android.dinamicx;

import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fwl;
import tb.sco;

/* loaded from: classes5.dex */
public class ch implements com.taobao.android.dinamicx.widget.t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        com.alibaba.ability.localization.b.a(new b.a() { // from class: com.taobao.android.dinamicx.ch.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ability.localization.b.a
            public void a(Language language, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("246661b", new Object[]{this, language, str});
                } else {
                    fwl.b().e();
                }
            }
        });
    }

    @Override // com.taobao.android.dinamicx.widget.t
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : com.alibaba.ability.localization.b.a().getTag();
    }

    @Override // com.taobao.android.dinamicx.widget.t
    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : sco.a(str);
    }
}
