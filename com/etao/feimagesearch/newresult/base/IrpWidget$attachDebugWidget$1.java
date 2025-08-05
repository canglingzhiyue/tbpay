package com.etao.feimagesearch.newresult.base;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.ut.device.UTDevice;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.com;
import tb.cqw;
import tb.ruk;

/* loaded from: classes3.dex */
public final class IrpWidget$attachDebugWidget$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f6813a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrpWidget$attachDebugWidget$1(h hVar) {
        super(0);
        this.f6813a = hVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        cqw g = h.g(this.f6813a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("nick", Login.getNick());
        linkedHashMap.put("utdid", UTDevice.getUtdid(com.b()));
        g.a("irpContextUpload", linkedHashMap);
    }
}
