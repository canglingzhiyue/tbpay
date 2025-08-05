package com.taobao.vessel.local;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;
import tb.rgw;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public rgw f23449a;

    static {
        kge.a(-825143830);
    }

    public boolean a(Map<String, Object> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("867e6a11", new Object[]{this, map, aVar})).booleanValue();
        }
        rgw rgwVar = this.f23449a;
        if (rgwVar != null) {
            rgwVar.a(map, new com.taobao.vessel.base.a(aVar));
        }
        return true;
    }
}
