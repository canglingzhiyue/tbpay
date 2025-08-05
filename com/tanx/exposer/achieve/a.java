package com.tanx.exposer.achieve;

import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.c;
import java.util.List;
import tb.dgk;
import tb.dgl;
import tb.dgy;
import tb.dha;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.tanx.exposer.achieve.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0309a {

        /* renamed from: a  reason: collision with root package name */
        public static volatile a f8152a;

        static {
            kge.a(1500334395);
            f8152a = new a((byte) 0);
        }
    }

    static {
        kge.a(2041324071);
    }

    public /* synthetic */ a(byte b) {
        this();
    }

    private a() {
    }

    public AdMonitorCommitResult a(AdMonitorType adMonitorType, List<String> list, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorCommitResult) ipChange.ipc$dispatch("eee934ac", new Object[]{this, adMonitorType, list, cVar});
        }
        try {
            if (dha.f26745a && cVar != null) {
                dha.a("utArgs", cVar.toString());
            }
            if (list != null && !list.isEmpty()) {
                dgy.a(cVar, adMonitorType);
                if (adMonitorType == AdMonitorType.EXPOSE) {
                    return new dgl(adMonitorType, list, cVar).a();
                }
                return new dgk(adMonitorType, list, cVar).a();
            }
            dgy.a(cVar, adMonitorType, "urls is empty");
            return AdMonitorCommitResult.PARAMS_ERROR;
        } catch (Exception e) {
            e.printStackTrace();
            dgy.a(cVar, adMonitorType, e.getMessage());
            return AdMonitorCommitResult.INTERNAL_ERROR;
        }
    }
}
