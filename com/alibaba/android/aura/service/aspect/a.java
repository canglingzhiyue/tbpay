package com.alibaba.android.aura.service.aspect;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.AURAEmptySerializable;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import tb.aqq;
import tb.arj;
import tb.aro;
import tb.arp;
import tb.bau;
import tb.baw;
import tb.bbm;
import tb.emr;
import tb.kge;

/* loaded from: classes2.dex */
public final class a extends arj<AURAAspectServiceInput, AURAEmptySerializable> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SERVICE_CODE = "aura.service.aspect";

    /* renamed from: a  reason: collision with root package name */
    private List<AURAInputData<AURAAspectServiceInput>> f2164a = new ArrayList();

    static {
        kge.a(1960083144);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1219783041) {
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
        a();
    }

    @Override // tb.arj
    public void a(AURAInputData<AURAAspectServiceInput> aURAInputData, aqq<AURAEmptySerializable> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143e57a0", new Object[]{this, aURAInputData, aqqVar});
            return;
        }
        super.a(aURAInputData, aqqVar);
        f extensionManager = getExtensionManager();
        if (extensionManager == null) {
            a(aURAInputData);
            return;
        }
        AURAAspectServiceInput data = aURAInputData.getData();
        int type = data.getType();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            com.alibaba.android.aura.datamodel.a aspectInfo = data.getAspectInfo();
            if (type == 0) {
                for (arp arpVar : extensionManager.b(arp.class)) {
                    arpVar.beforeFlowExecute(data.getInputData(), aspectInfo);
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                for (emr emrVar : extensionManager.b(emr.class)) {
                    emrVar.a(aspectInfo, currentTimeMillis, currentTimeMillis2);
                }
            } else if (type == 1) {
                for (arp arpVar2 : extensionManager.b(arp.class)) {
                    arpVar2.afterFlowExecute(data.getOutputData(), aspectInfo, data.isError());
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                for (emr emrVar2 : extensionManager.b(emr.class)) {
                    emrVar2.a(aspectInfo, data.isError(), currentTimeMillis, currentTimeMillis3);
                }
            } else if (type == 2) {
                for (arp arpVar3 : extensionManager.b(arp.class)) {
                    arpVar3.beforeServiceExecute(data.getInputData(), aspectInfo);
                }
                long currentTimeMillis4 = System.currentTimeMillis();
                for (emr emrVar3 : extensionManager.b(emr.class)) {
                    emrVar3.b(aspectInfo, currentTimeMillis, currentTimeMillis4);
                }
            } else if (type == 3) {
                for (arp arpVar4 : extensionManager.b(arp.class)) {
                    arpVar4.afterServiceExecute(data.getOutputData(), aspectInfo, data.isError());
                }
                long currentTimeMillis5 = System.currentTimeMillis();
                for (emr emrVar4 : extensionManager.b(emr.class)) {
                    emrVar4.b(aspectInfo, data.isError(), currentTimeMillis, currentTimeMillis5);
                    aspectInfo = aspectInfo;
                }
            } else if (type == 4) {
                if (data.isAspectError()) {
                    if (baw.a()) {
                        bbm.a(getUserContext().e(), "框架不处理错误切面的错误，并且请不要在错误切面中调用onError", 0);
                    }
                } else {
                    for (aro aroVar : extensionManager.b(aro.class)) {
                        aroVar.a(data.getError());
                    }
                }
            }
        } catch (Throwable th) {
            if (baw.a()) {
                throw th;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th.printStackTrace(new PrintStream(byteArrayOutputStream));
            String str = "-5000_" + type;
            aqqVar.a(new b(1, "AURACoreDomain", str, "执行切面【" + type + "】报错，errorMessage=" + byteArrayOutputStream.toString()));
        }
        aqqVar.a(c.a(new AURAEmptySerializable(), aURAInputData));
    }

    private void a(AURAInputData<AURAAspectServiceInput> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4bc11", new Object[]{this, aURAInputData});
        } else if (this.f2164a.contains(aURAInputData)) {
        } else {
            this.f2164a.add(aURAInputData);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!bau.a(this.f2164a)) {
            aqq<AURAEmptySerializable> aqqVar = new aqq<AURAEmptySerializable>() { // from class: com.alibaba.android.aura.service.aspect.a.1
            };
            for (AURAInputData<AURAAspectServiceInput> aURAInputData : this.f2164a) {
                a(aURAInputData, aqqVar);
            }
            this.f2164a.clear();
        }
    }
}
