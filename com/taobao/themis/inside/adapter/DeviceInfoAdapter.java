package com.taobao.themis.inside.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;
import com.taobao.application.common.d;
import com.taobao.themis.kernel.adapter.IDeviceInfoAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/inside/adapter/DeviceInfoAdapter;", "Lcom/taobao/themis/kernel/adapter/IDeviceInfoAdapter;", "()V", "getDeviceScore", "", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class DeviceInfoAdapter implements IDeviceInfoAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2107696530);
        kge.a(1327341758);
    }

    @Override // com.taobao.themis.kernel.adapter.IDeviceInfoAdapter
    public int getDeviceScore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e89be20", new Object[]{this})).intValue();
        }
        d a2 = c.a();
        q.b(a2, "ApmManager.getAppPreferences()");
        return (int) a2.a(com.taobao.tbdeviceevaluator.c.KEY_NEW_SCORE, 0.0f);
    }
}
