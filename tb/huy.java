package tb;

import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.arc;

/* loaded from: classes2.dex */
public abstract class huy implements ase {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-85807375);
        kge.a(-1145322328);
    }

    public static List<a> a(List<AttachedResponse> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d8d1c104", new Object[]{list, str});
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (AttachedResponse attachedResponse : list) {
            if (baw.a()) {
                ard a2 = arc.a();
                a2.a("接收到异步数据：" + attachedResponse.getBody(), arc.a.a().a("AURA/ability").b());
            }
            if (attachedResponse != null && str.equalsIgnoreCase(attachedResponse.getReqId())) {
                a aVar = new a();
                aVar.b(attachedResponse.getErrorCode());
                aVar.c(attachedResponse.getErrorMsg());
                aVar.a(attachedResponse.isSucceed().booleanValue());
                aVar.a(bba.a(attachedResponse.getBody()));
                aVar.a(attachedResponse.getHeaders());
                aVar.a(attachedResponse);
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public static List<a> a(List<xih> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (xih xihVar : list) {
            if (baw.a()) {
                ard a2 = arc.a();
                a2.a("接收到异步数据：" + xihVar.b(), arc.a.a().a("AURA/ability").b());
            }
            a aVar = new a();
            aVar.a(xihVar.e());
            aVar.a(xihVar.b());
            aVar.b(xihVar.a());
            aVar.a(xihVar);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public static void a(boolean z, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b2a168", new Object[]{new Boolean(z), runnable, runnable2});
        } else if (z) {
            bbh.a(runnable, runnable2);
        } else {
            try {
                runnable.run();
            } catch (Throwable th) {
                arc.a().a(AURATraceUtil.a(th), arc.a.a().a("AURA/error").b());
                if (runnable2 == null) {
                    return;
                }
                runnable2.run();
            }
        }
    }
}
