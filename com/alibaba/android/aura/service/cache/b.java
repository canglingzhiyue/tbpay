package com.alibaba.android.aura.service.cache;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aqq;
import tb.arc;
import tb.ard;
import tb.arj;
import tb.bbh;
import tb.kge;

/* loaded from: classes2.dex */
public final class b extends arj<AURACacheInput, AURACacheOutput> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f2168a;

    static {
        kge.a(-344034264);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
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

    public static /* synthetic */ a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("df4e4c6f", new Object[]{bVar}) : bVar.f2168a;
    }

    @Override // com.alibaba.android.aura.n, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.f2168a = new a("AURA_" + qVar.d());
    }

    @Override // tb.arj
    public void a(final AURAInputData<AURACacheInput> aURAInputData, final aqq<AURACacheOutput> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143e57a0", new Object[]{this, aURAInputData, aqqVar});
            return;
        }
        super.a(aURAInputData, aqqVar);
        final AURACacheInput data = aURAInputData.getData();
        int i = data.operatorType;
        if (i == 0) {
            bbh.a(new Runnable() { // from class: com.alibaba.android.aura.service.cache.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (b.a(b.this) == null || aqqVar == null) {
                    } else {
                        try {
                            aqqVar.a(c.a(new AURACacheOutput(b.a(b.this).a(data.cacheKey)), aURAInputData));
                        } catch (Exception e) {
                            ard a2 = arc.a();
                            a2.b("缓存读取出错：" + e.getMessage());
                        }
                    }
                }
            });
        } else if (i != 1) {
        } else {
            Object obj = data.cacheObject;
            this.f2168a.a(data.cacheKey, obj);
            aqqVar.a(c.a(new AURACacheOutput(obj), aURAInputData));
        }
    }

    @Override // com.alibaba.android.aura.n, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        a aVar = this.f2168a;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }
}
