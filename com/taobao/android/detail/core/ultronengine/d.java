package com.taobao.android.detail.core.ultronengine;

import android.text.TextUtils;
import com.alibaba.android.spindle.stage.StageType;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class d implements com.alibaba.android.ultron.vfw.instance.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.alibaba.android.spindle.stage.b f9924a;

    static {
        kge.a(-1500708660);
        kge.a(1988287209);
    }

    public d(com.alibaba.android.spindle.stage.b bVar) {
        this.f9924a = bVar;
        emu.a("com.taobao.android.detail.core.ultronengine.UltronContainerTrace");
    }

    @Override // com.alibaba.android.ultron.vfw.instance.a
    public void a(String str, String str2, StageType stageType) {
        com.alibaba.android.spindle.stage.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d883fd33", new Object[]{this, str, str2, stageType});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || stageType == null || (bVar = this.f9924a) == null) {
        } else {
            bVar.a(str, str2, stageType);
        }
    }
}
