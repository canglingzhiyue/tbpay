package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0007R=\u0010\u0007\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\n0\t¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/mytaobao/pagev2/architecture/dx/MtbDxDownloadManager;", "", "dxEngineRouter", "Lcom/taobao/android/dinamicx/DinamicXEngineRouter;", "mtbDxTemplateManager", "Lcom/taobao/mytaobao/pagev2/architecture/dx/MtbDxTemplateManager;", "(Lcom/taobao/android/dinamicx/DinamicXEngineRouter;Lcom/taobao/mytaobao/pagev2/architecture/dx/MtbDxTemplateManager;)V", "downloadSuccessListener", "Lkotlin/Function1;", "", "", "Lkotlin/ParameterName;", "name", "dxNameList", "", "getDownloadSuccessListener", "()Lkotlin/jvm/functions/Function1;", "setDownloadSuccessListener", "(Lkotlin/jvm/functions/Function1;)V", "requestingSet", "", "considerDownloadDxTemplate", "list", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f34419a;
    private rul<? super List<String>, t> b;
    private final bd c;
    private final xoc d;

    static {
        kge.a(1068553911);
    }

    public xob(bd dxEngineRouter, xoc mtbDxTemplateManager) {
        q.c(dxEngineRouter, "dxEngineRouter");
        q.c(mtbDxTemplateManager, "mtbDxTemplateManager");
        this.c = dxEngineRouter;
        this.d = mtbDxTemplateManager;
        this.f34419a = new LinkedHashSet();
        this.c.a(new fve() { // from class: tb.xob.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fve
            public final void onNotificationListener(fvb fvbVar) {
                rul<List<String>, t> a2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                } else if (fvbVar.f28139a.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    List<DXTemplateItem> list = fvbVar.f28139a;
                    if (list != null) {
                        for (DXTemplateItem dXTemplateItem : list) {
                            DXTemplateItem a3 = xob.a(xob.this).a(dXTemplateItem);
                            if (a3 != null) {
                                String str = a3.f11925a;
                                q.a((Object) str, "availableTemplateItem.name");
                                arrayList.add(str);
                                xob.b(xob.this).b(a3);
                            }
                        }
                    }
                    if ((!arrayList.isEmpty()) && (a2 = xob.this.a()) != null) {
                        a2.mo2421invoke(arrayList);
                    }
                    nwv.f("下载成功触发notify， update=" + fvbVar.c.size() + " finish=" + fvbVar.f28139a.size());
                }
            }
        });
    }

    public static final /* synthetic */ bd a(xob xobVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bd) ipChange.ipc$dispatch("a8873883", new Object[]{xobVar}) : xobVar.c;
    }

    public static final /* synthetic */ xoc b(xob xobVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xoc) ipChange.ipc$dispatch("5b0c2cc", new Object[]{xobVar}) : xobVar.d;
    }

    public final rul<List<String>, t> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("f0a3bb5", new Object[]{this}) : this.b;
    }

    public final void a(rul<? super List<String>, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc03baf", new Object[]{this, rulVar});
        } else {
            this.b = rulVar;
        }
    }

    public final void a(List<? extends DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        q.c(list, "list");
        if (list.isEmpty()) {
            return;
        }
        nwv.a("considerDownloadDxTemplate");
        ArrayList arrayList = new ArrayList();
        for (DXTemplateItem dXTemplateItem : list) {
            if (!this.f34419a.contains(dXTemplateItem.b())) {
                DXTemplateItem a2 = this.c.a(dXTemplateItem);
                if (a2 != null) {
                    this.d.b(a2);
                }
                if (a2 == null || a2.b != dXTemplateItem.b) {
                    arrayList.add(dXTemplateItem);
                }
            }
        }
        nwv.e("considerDownloadDxTemplate");
        if (!(!arrayList.isEmpty())) {
            return;
        }
        this.c.a(arrayList);
    }
}
