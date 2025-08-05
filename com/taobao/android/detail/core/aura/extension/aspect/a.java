package com.taobao.android.detail.core.aura.extension.aspect;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import tb.arm;
import tb.eca;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.aspect.error.downgrade")
/* loaded from: classes4.dex */
public final class a extends arm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1224910841);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a() {
        emu.a("com.taobao.android.detail.core.aura.extension.aspect.AliDetailDowngradeExtension");
    }

    @Override // tb.aro
    public void a(com.alibaba.android.aura.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            return;
        }
        if ("AURARenderServiceDomain".equals(bVar.f()) && bVar.c() != null && bVar.c().get("containerName") != null) {
            String bVar2 = bVar.toString();
            String a2 = i.a("AliDetailDowngradeExtension", BTags.DxRender);
            com.taobao.android.detail.core.utils.i.a(a2, "aura render dx error:" + bVar2);
            eca.a(a().e(), bVar2, bVar.c(), eca.TYPE_DETAIL_AURA);
        }
        if ("AURANextRPCServiceDomain".equals(bVar.f())) {
            return;
        }
        if ("-3000_EMPTY_PROTOCOL_VERSION_BELOW_4".equals(bVar.a())) {
            a("protocol_version_below_4");
        } else if (bVar.d() != 0) {
        } else {
            a("aura_frame_error_" + bVar.a());
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            com.taobao.android.detail.core.aura.utils.c.a(a().e(), str);
        }
    }
}
