package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.a;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ldy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f30513a;
    private DinamicXEngine b;
    private lea c;
    private led d;
    private lej e;
    private a f;

    static {
        kge.a(-1808706526);
    }

    public void a(ljs ljsVar, DXEngineConfig.a aVar, IDxItemRenderService.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef0d1f0", new Object[]{this, ljsVar, aVar, aVar2});
            return;
        }
        ldf.d("DxCenter", "initInfoFlowDxEngine");
        this.b = lei.a(ljsVar, aVar, aVar2);
        this.f30513a = this.b.a();
        this.c = new lea(this.b);
        this.d = new led();
        this.e = new lej(this.b);
        this.f = new a(ljsVar, this.b);
    }

    public void a(ljs ljsVar, List<BaseSectionModel> list, IDxItemRenderService.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e343d0f", new Object[]{this, ljsVar, list, bVar, new Boolean(z)});
        } else if (list == null || list.isEmpty()) {
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            this.c.a(ljsVar, list, arrayList, arrayList2, z);
            this.d.a(arrayList, this.f30513a, bVar);
            this.e.a(arrayList2, this.f30513a, bVar);
        }
    }

    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine != null) {
            dinamicXEngine.b().a(z, z2);
        }
        DinamicXEngine.a(true);
        b();
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7f1c9e18", new Object[]{this}) : this.f;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine == null) {
            return;
        }
        dinamicXEngine.k();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine == null) {
            return;
        }
        dinamicXEngine.o();
        fpy.a().a(this.b.a());
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine == null) {
            return;
        }
        dinamicXEngine.a(activity);
    }
}
