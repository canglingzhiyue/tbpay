package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.wukong.bx.CcrcBHService;
import com.android.alibaba.ip.runtime.IpChange;

@InterfaceC1206ea(name = {"bhDeactivate"})
/* renamed from: com.alibaba.security.ccrc.service.build.ja  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1221ja extends AbstractC1200ca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1200ca
    public boolean a(Context context, String str, String str2, InterfaceC1203da interfaceC1203da) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f3ab13f", new Object[]{this, context, str, str2, interfaceC1203da})).booleanValue();
        }
        String str3 = (String) JsonUtils.toMap(str2).get(Ta.h);
        if (StringUtils.isEmpty(str3)) {
            AbstractC1200ca.a(interfaceC1203da, "参数异常", null);
            return true;
        }
        CcrcBHService.getBHService(str3).deActivate();
        AbstractC1200ca.a(interfaceC1203da, null);
        return true;
    }
}
