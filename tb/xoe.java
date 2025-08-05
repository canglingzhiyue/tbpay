package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.mytaobao.base.c;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/taobao/mytaobao/pagev2/architecture/preload/DxPreloadHelperV2;", "", "()V", "hasPreload", "", "considerPreloadDx", "", "mtbHomePageVO", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbHomePageVO;", "dxEngine", "Lcom/taobao/android/dinamicx/DinamicXEngine;", "corePreloadDx", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xoe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final xoe INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f34423a;

    static {
        kge.a(-1488512993);
        INSTANCE = new xoe();
    }

    private xoe() {
    }

    public final void a(xon xonVar, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f5d6ad2", new Object[]{this, xonVar, dinamicXEngine});
        } else if (dinamicXEngine == null || xonVar == null || f34423a) {
        } else {
            f34423a = true;
            nwv.a("corePreloadDx", 0);
            b(xonVar, dinamicXEngine);
            nwv.b("corePreloadDx", 0);
        }
    }

    private final void b(xon xonVar, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f173d3", new Object[]{this, xonVar, dinamicXEngine});
        } else if (!c.y()) {
            try {
                List<xol> b = xonVar.b();
                if (b == null) {
                    return;
                }
                for (xol xolVar : b) {
                    if (!(!q.a((Object) xolVar.c(), (Object) "dinamicx"))) {
                        DXTemplateItem a2 = dinamicXEngine.a(xolVar.e());
                        dinamicXEngine.a(Globals.getApplication(), a2, xolVar.a(), -1, (DXRenderOptions) null);
                        TLog.loge("mtbMainLink", "dx预渲染： " + a2.f11925a);
                    }
                }
            } catch (Throwable th) {
                TLog.loge("mtbMainLink", "dx预渲染报错，throw:" + th);
            }
        }
    }
}
