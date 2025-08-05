package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.a;

/* loaded from: classes.dex */
public abstract class ryj implements ryh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<rxn> f33419a = new LinkedList();
    public final List<rxm> b = new LinkedList();

    static {
        kge.a(-291796972);
        kge.a(1776714789);
    }

    public void a(rxn rxnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdeb6af0", new Object[]{this, rxnVar});
        } else {
            this.f33419a.add(rxnVar);
        }
    }

    public void a(rxm rxmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdeaf691", new Object[]{this, rxmVar});
        } else {
            this.b.add(rxmVar);
        }
    }

    @Override // tb.ryh
    public void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6bcae5d", new Object[]{this, str, aVar});
            return;
        }
        boolean isBlank = StringUtils.isBlank(str);
        for (rxn rxnVar : this.f33419a) {
            if (!isBlank) {
                if (!str.equals(rxnVar.a())) {
                    continue;
                } else {
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        String str2 = aVar.h;
                        TBSdkLog.i("mtopsdk.AbstractFilterManager", str2, "[start]jump to beforeFilter:" + str);
                    }
                    isBlank = true;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            String b = rxnVar.b(aVar);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                String str3 = aVar.h;
                TBSdkLog.d("mtopsdk.AbstractFilterManager", str3, "[start]execute BeforeFilter: " + rxnVar.a() + ",time(ms)= " + (System.currentTimeMillis() - currentTimeMillis));
            }
            if (b == null || "STOP".equals(b)) {
                if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    return;
                }
                String str4 = aVar.h;
                TBSdkLog.i("mtopsdk.AbstractFilterManager", str4, "[start]execute BeforeFilter: " + rxnVar.a() + ",result=" + b);
                return;
            }
        }
    }

    @Override // tb.ryh
    public void b(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea47cc1e", new Object[]{this, str, aVar});
            return;
        }
        boolean isBlank = StringUtils.isBlank(str);
        for (rxm rxmVar : this.b) {
            if (!isBlank) {
                if (!str.equals(rxmVar.a())) {
                    continue;
                } else {
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        String str2 = aVar.h;
                        TBSdkLog.i("mtopsdk.AbstractFilterManager", str2, "[callback]jump to afterFilter:" + str);
                    }
                    isBlank = true;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            String a2 = rxmVar.a(aVar);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                String str3 = aVar.h;
                TBSdkLog.d("mtopsdk.AbstractFilterManager", str3, "[callback]execute AfterFilter: " + rxmVar.a() + ",time(ms)= " + (System.currentTimeMillis() - currentTimeMillis));
            }
            if (a2 == null || "STOP".equals(a2)) {
                if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    return;
                }
                String str4 = aVar.h;
                TBSdkLog.i("mtopsdk.AbstractFilterManager", str4, "[callback]execute AfterFilter: " + rxmVar.a() + ",result=" + a2);
                return;
            }
        }
    }
}
