package tb;

import android.view.View;
import com.alibaba.android.umf.constants.UMFConstants;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.android.umf.datamodel.a;
import com.alibaba.android.umf.datamodel.b;
import com.alibaba.android.umf.datamodel.service.render.UMFRenderIO;
import com.alibaba.android.umf.datamodel.service.render.UMFRenderOutput;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class bqx extends bqo<UMFRenderIO, UMFRenderOutput> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f26049a = "UMFRenderService";

    static {
        kge.a(-156892283);
    }

    public static /* synthetic */ Object ipc$super(bqx bqxVar, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.umf.node.service.IUMFService
    public /* synthetic */ void onExecute(UMFBaseIO uMFBaseIO, b bVar, bpx bpxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b708d66", new Object[]{this, uMFBaseIO, bVar, bpxVar});
        } else {
            a((UMFRenderIO) uMFBaseIO, bVar, bpxVar);
        }
    }

    public static /* synthetic */ bpz a(bqx bqxVar, Class cls, bqb bqbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bpz) ipChange.ipc$dispatch("8e3c6b2f", new Object[]{bqxVar, cls, bqbVar}) : bqxVar.a(cls, bqbVar);
    }

    public static /* synthetic */ bpz b(bqx bqxVar, Class cls, bqb bqbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bpz) ipChange.ipc$dispatch("28dd2db0", new Object[]{bqxVar, cls, bqbVar}) : bqxVar.a(cls, bqbVar);
    }

    @Override // tb.bqo, com.alibaba.android.umf.node.service.IUMFService
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            super.onCreate();
        }
    }

    public void a(final UMFRenderIO uMFRenderIO, final b bVar, final bpx<UMFRenderOutput> bpxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a870efd", new Object[]{this, uMFRenderIO, bVar, bpxVar});
            return;
        }
        List list = (List) a(brk.class, new bqb<brk>() { // from class: tb.bqx.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bqb
            public void a(final brk brkVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e247f6dd", new Object[]{this, brkVar});
                    return;
                }
                brkVar.a(uMFRenderIO, bVar);
                Map<String, View> a2 = brkVar.a();
                if (a2 == null || a2.isEmpty()) {
                    bpxVar.a(new a(UMFConstants.ErrorCode.RENDER_SERVICE_EXCEPTION, "数据错误，无法创建view"));
                    return;
                }
                List<brj> list2 = (List) bqx.a(bqx.this, brj.class, new bqb<brj>() { // from class: tb.bqx.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.bqb
                    public void a(brj brjVar) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("e247827e", new Object[]{this, brjVar});
                            return;
                        }
                        brjVar.a(bVar, brkVar);
                        brkVar.a(brjVar);
                    }
                }).a();
                if (list2 == null || list2.isEmpty()) {
                    bqe.a().c("UMFRenderService", "execute#there is no IUMFRenderComponentCreatorAbility, make sure you have register property");
                } else {
                    for (brj brjVar : list2) {
                        if (brjVar instanceof brl) {
                            ((brl) brjVar).a(list2);
                        }
                    }
                }
                bqx.b(bqx.this, bri.class, new bqb<bri>() { // from class: tb.bqx.1.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.bqb
                    public void a(bri briVar) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("e2470e1f", new Object[]{this, briVar});
                        } else {
                            brkVar.a(briVar);
                        }
                    }
                });
                brkVar.b();
                UMFRenderOutput uMFRenderOutput = new UMFRenderOutput();
                uMFRenderOutput.setViews(a2);
                bpxVar.a((bpx) uMFRenderOutput);
            }
        }).a();
        if (list == null || list.isEmpty()) {
            bpxVar.a(new a(UMFConstants.ErrorCode.RENDER_SERVICE_EXCEPTION, "there is no container ability for UMFRenderService"));
        } else if (list.size() <= 1) {
        } else {
            bpxVar.a(new a(UMFConstants.ErrorCode.RENDER_SERVICE_EXCEPTION, "there is more than one container ability for UMFRenderService"));
        }
    }
}
