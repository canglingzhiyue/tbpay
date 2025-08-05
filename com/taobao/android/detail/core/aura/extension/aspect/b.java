package com.taobao.android.detail.core.aura.extension.aspect;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;
import java.util.List;
import tb.arc;
import tb.arm;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "aldetail.impl.aspect.error.eventRedirectError")
/* loaded from: classes4.dex */
public final class b extends arm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f9387a;
    private Context b;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-1112522370);
        ArrayList arrayList = new ArrayList();
        f9387a = arrayList;
        arrayList.add("request");
        emu.a("com.taobao.android.detail.core.aura.extension.aspect.AliDetailEventRedirectErrorExtension");
    }

    @Override // tb.arm, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.b = qVar.e();
    }

    @Override // tb.aro
    public void a(com.alibaba.android.aura.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
        } else if (bVar.c() == null || !(bVar.c().get("event") instanceof AURAEventIO)) {
            arc.a().b("AliDetailEventRedirectErrorExtension.onError:can't find event");
        } else {
            AURAEventIO aURAEventIO = (AURAEventIO) bVar.c().get("event");
            if (TextUtils.isEmpty(aURAEventIO.getEventType())) {
                arc.a().b("AliDetailEventRedirectErrorExtension.onError:can't find eventType");
            } else {
                a(aURAEventIO);
            }
        }
    }

    private boolean a(AURAEventIO aURAEventIO) {
        DetailCoreActivity detailCoreActivity;
        com.taobao.android.trade.event.d a2;
        Event a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2d42ad8", new Object[]{this, aURAEventIO})).booleanValue();
        }
        Context context = this.b;
        if (!(context instanceof DetailCoreActivity) || (a2 = com.taobao.android.trade.event.f.a((detailCoreActivity = (DetailCoreActivity) context))) == null || (a3 = com.taobao.android.detail.core.aura.utils.d.a(detailCoreActivity, aURAEventIO, com.taobao.android.detail.core.aura.utils.d.ROUTE_TABLE)) == null) {
            return false;
        }
        a2.a(a3);
        return true;
    }
}
