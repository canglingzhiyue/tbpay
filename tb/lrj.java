package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class lrj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IJsBridgeService f30861a;
    private ArrayList<lrr> b;

    static {
        kge.a(1524244010);
    }

    public lrj(ljs ljsVar) {
        this.f30861a = (IJsBridgeService) ljsVar.a(IJsBridgeService.class);
    }

    public void a(lrg lrgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3569b97", new Object[]{this, lrgVar});
        } else if (this.f30861a == null) {
            ldf.d("ShareDataJsNativeFeatureRegister", "registerJsNativeFeature jsBridgeService is null");
        } else {
            this.b = b(lrgVar);
            Iterator<lrr> it = this.b.iterator();
            while (it.hasNext()) {
                this.f30861a.registerJsNativeFeature(it.next());
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f30861a == null) {
            ldf.d("ShareDataJsNativeFeatureRegister", "unRegisterJsNativeFeature jsBridgeService is null");
        } else {
            ArrayList<lrr> arrayList = this.b;
            if (arrayList == null || arrayList.isEmpty()) {
                ldf.d("ShareDataJsNativeFeatureRegister", "unRegisterJsNativeFeature mNativeFeatures is null");
                return;
            }
            Iterator<lrr> it = this.b.iterator();
            while (it.hasNext()) {
                lrr next = it.next();
                this.f30861a.unRegisterJsNativeFeature(next);
                next.b();
            }
            this.b.clear();
        }
    }

    private ArrayList<lrr> b(lrg lrgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("62f689f2", new Object[]{this, lrgVar});
        }
        ArrayList<lrr> arrayList = new ArrayList<>(5);
        arrayList.add(new lrm(lrgVar));
        arrayList.add(new lrk(lrgVar));
        arrayList.add(new lrl(lrgVar));
        arrayList.add(new lrn(lrgVar));
        arrayList.add(new lro(lrgVar));
        return arrayList;
    }
}
