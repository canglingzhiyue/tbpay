package com.taobao.android.detail.core.detail.content;

import android.content.Context;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.am;
import tb.arv;
import tb.dya;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "aura.impl.event.clickContent")
/* loaded from: classes4.dex */
public final class a extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2098200695);
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : am.EVENT_TYPE;
    }

    public a() {
        emu.a("com.taobao.android.detail.core.detail.content.AliDetailClickContentEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        dya y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        Context e = b().e();
        if (!(e instanceof DetailCoreActivity) || (y = ((DetailCoreActivity) e).y()) == null || y.y() == null) {
            return;
        }
        y.y().a(1);
    }
}
