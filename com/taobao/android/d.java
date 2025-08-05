package com.taobao.android;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class d implements com.taobao.orange.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final c f9328a;

    static {
        kge.a(-1236315314);
        kge.a(-1209827241);
    }

    public d(c cVar) {
        this.f9328a = cVar;
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        String str2 = "onConfigUpdate(" + str + ", " + map + riy.BRACKET_END_STR;
        this.f9328a.a(str, map);
    }
}
