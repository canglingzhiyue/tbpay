package com.alibaba.android.aura.service.event;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aqq;
import tb.arj;
import tb.arw;
import tb.kge;

/* loaded from: classes2.dex */
public final class e extends arj<AURAEventIO, AURAEventIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.service.event";

    /* renamed from: a  reason: collision with root package name */
    private b f2172a;

    static {
        kge.a(-446081544);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 339629984) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((AURAInputData) objArr[0], (aqq) objArr[1]);
            return null;
        }
    }

    @Override // com.alibaba.android.aura.n, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.f2172a = new b(qVar, getExtensionManager());
        for (arw arwVar : getExtensionManager().b(arw.class)) {
            this.f2172a.a(arwVar.e(), arwVar);
        }
    }

    @Override // tb.arj
    public void a(AURAInputData<AURAEventIO> aURAInputData, aqq<AURAEventIO> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143e57a0", new Object[]{this, aURAInputData, aqqVar});
            return;
        }
        super.a(aURAInputData, aqqVar);
        b bVar = this.f2172a;
        if (bVar == null) {
            return;
        }
        bVar.a(aURAInputData.getData(), aqqVar);
        aqqVar.a(com.alibaba.android.aura.datamodel.c.a(aURAInputData.getData(), aURAInputData));
    }

    @Override // com.alibaba.android.aura.n, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (getExtensionManager() != null && this.f2172a != null) {
            for (arw arwVar : getExtensionManager().b(arw.class)) {
                this.f2172a.a(arwVar.e());
                arwVar.onDestroy();
            }
        }
        super.onDestroy();
    }
}
