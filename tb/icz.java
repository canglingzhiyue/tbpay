package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

@AURAExtensionImpl(code = "tbbuy.impl.aspect.error.adjust.popupWindow")
/* loaded from: classes6.dex */
public final class icz extends arm implements arp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2053044068);
        kge.a(-1795775593);
    }

    public static /* synthetic */ Object ipc$super(icz iczVar, String str, Object... objArr) {
        if (str.hashCode() == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arp
    public void afterFlowExecute(c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6cdb92", new Object[]{this, cVar, aVar, new Boolean(z)});
        }
    }

    @Override // tb.arp
    public void afterServiceExecute(c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2b82a1", new Object[]{this, cVar, aVar, new Boolean(z)});
        }
    }

    @Override // tb.arp
    public void beforeFlowExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f04d21", new Object[]{this, aURAInputData, aVar});
        }
    }

    @Override // tb.arm, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.arm, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            super.onCreate(qVar, fVar);
        }
    }

    @Override // tb.aro
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
        } else if (!"-1000_EMPTY_RENDER_TREE".equals(bVar.a())) {
        } else {
            AURAGlobalData b = b();
            if (b == null) {
                arc.a().a("TBBuyPopupWindowErrorExtension globalData is null");
                return;
            }
            AURAParseIO aURAParseIO = (AURAParseIO) b.get("globalDataCacheParseIO", AURAParseIO.class);
            if (aURAParseIO == null) {
                arc.a().a("TBBuyPopupWindowErrorExtension cacheParseIO is null");
                return;
            }
            c();
            com.taobao.android.buy.internal.a aVar = (com.taobao.android.buy.internal.a) a().a(com.taobao.android.buy.internal.a.class.getSimpleName(), com.taobao.android.buy.internal.a.class);
            if (aVar != null) {
                aVar.a(aURAParseIO);
            } else {
                arc.a().a("TBBuyPopupWindowErrorExtension dataUpdate aliBuyPresenter is null");
            }
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.alibaba.android.aura.service.event.c.a(a().b(), azo.EVENT_TYPE, new d());
        }
    }

    @Override // tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
        } else if (!com.alibaba.android.aura.service.parse.a.PARSE_SERVICE_CODE.equals(aVar.c())) {
        } else {
            Serializable data = aURAInputData.getData();
            if (!(data instanceof AURAParseIO)) {
                arc.a().a("TBBuyPopupWindowErrorExtension input is null");
                return;
            }
            AURAParseIO aURAParseIO = (AURAParseIO) data;
            AURAGlobalData b = b();
            if (b == null) {
                arc.a().a("TBBuyPopupWindowErrorExtension globalData is null");
            } else {
                b.update("globalDataCacheParseIO", aURAParseIO);
            }
        }
    }
}
