package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.arc;

/* loaded from: classes2.dex */
public final class asd extends arj<AURANextRPCIO, AURAParseIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEXT_RPC_SERVICE_CODE = "aura.service.nextrpc";

    /* renamed from: a  reason: collision with root package name */
    private asc f25562a;

    static {
        kge.a(-1853537112);
    }

    public static /* synthetic */ Object ipc$super(asd asdVar, String str, Object... objArr) {
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
        } else {
            super.onCreate(qVar, fVar);
        }
    }

    @Override // tb.arj
    public void a(AURAInputData<AURANextRPCIO> aURAInputData, final aqq<AURAParseIO> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143e57a0", new Object[]{this, aURAInputData, aqqVar});
            return;
        }
        super.a(aURAInputData, aqqVar);
        if (this.f25562a == null) {
            this.f25562a = new asc();
        }
        this.f25562a.a(getExtensionManager(), getUserContext(), aURAInputData, new aqq<AURAParseIO>() { // from class: tb.asd.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 112764847) {
                    super.a((c) objArr[0]);
                    return null;
                } else if (hashCode != 744952192) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.a((b) objArr[0]);
                    return null;
                }
            }

            @Override // tb.aqq
            public void a(c<AURAParseIO> cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    return;
                }
                super.a(cVar);
                ard a2 = arc.a();
                a2.a("NextRPC服务请求结束 " + System.currentTimeMillis(), arc.a.a().a("AURA/performance").b());
                aqqVar.a(cVar);
            }

            @Override // tb.aqq, tb.aqs
            public void a(b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    return;
                }
                super.a(bVar);
                aqqVar.a(bVar);
            }
        });
    }

    @Override // com.alibaba.android.aura.n, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        asc ascVar = this.f25562a;
        if (ascVar == null) {
            return;
        }
        ascVar.a();
    }
}
