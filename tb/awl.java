package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bd;
import java.util.List;
import tb.awm;

@AURAExtensionImpl(code = awl.EXTENSION_CODE)
/* loaded from: classes2.dex */
public final class awl extends awn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTENSION_CODE = "aura.impl.render.component.creator.dx";

    static {
        kge.a(96457593);
    }

    public static /* synthetic */ Object ipc$super(awl awlVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1342773960:
                return super.a();
            case -1219783041:
                super.onCreate((q) objArr[0], (f) objArr[1]);
                return null;
            case -490565331:
                return super.a((AURARenderComponent) objArr[0]);
            case -393072931:
                return super.a((ViewGroup) objArr[0], (AURARenderComponentContainer) objArr[1]);
            case 563256106:
                super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
                return null;
            case 783995076:
                super.a((AURARenderComponent) objArr[0], (View) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.awn, tb.atc
    public /* bridge */ /* synthetic */ View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        return super.a(viewGroup, aURARenderComponentContainer);
    }

    @Override // tb.awn, tb.atc
    public /* bridge */ /* synthetic */ String a() {
        return super.a();
    }

    @Override // tb.awn, tb.atc
    public /* bridge */ /* synthetic */ String a(AURARenderComponent aURARenderComponent) {
        return super.a(aURARenderComponent);
    }

    @Override // tb.awn, tb.atc
    public /* bridge */ /* synthetic */ void a(AURARenderComponent aURARenderComponent, View view, int i) {
        super.a(aURARenderComponent, view, i);
    }

    @Override // tb.awn, tb.atl, tb.arl
    public /* bridge */ /* synthetic */ void onCreate(q qVar, f fVar) {
        super.onCreate(qVar, fVar);
    }

    @Override // tb.awn, tb.atl, tb.ark
    public /* bridge */ /* synthetic */ void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
    }

    @Override // tb.awn, tb.atl, tb.arl
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // tb.awn
    public void a(bd bdVar, awm awmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19e69bb", new Object[]{this, bdVar, awmVar});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        bbe.a(riy.ARRAY_START_STR + awmVar.b().key + "] 开始渲染", null);
        DXRootView a2 = awmVar.a();
        int d = awmVar.d();
        int e = awmVar.e();
        awm.b a3 = a(d, e);
        if (a3 != null) {
            d = a3.f25653a;
            e = a3.b;
        }
        DXResult<DXRootView> a4 = bdVar.a(this.b, awmVar.c(), a2, d, e, new art(this.c, awmVar.b(), b(), m()));
        AURARenderComponentData aURARenderComponentData = awmVar.b().data;
        AURARenderComponentContainer aURARenderComponentContainer = aURARenderComponentData == null ? null : aURARenderComponentData.container;
        DinamicXEngine d2 = bdVar.d();
        if (d2 == null) {
            a("-1002", "渲染失败,engine为空", aURARenderComponentContainer);
            return;
        }
        if (a4 != null && !a4.b()) {
            d2.b(a2);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("渲染失败|");
            sb.append(a4 == null ? "" : a4.a());
            a("-1002", sb.toString(), aURARenderComponentContainer);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        bbe.a(riy.ARRAY_START_STR + awmVar.b().key + "] 渲染完成，耗时 " + (currentTimeMillis2 - currentTimeMillis), null);
    }

    private awm.b a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (awm.b) ipChange.ipc$dispatch("d18c5ea9", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        awm.b bVar = new awm.b();
        bVar.b = i2;
        bVar.f25653a = i;
        List<aee> b = b().b(aee.class);
        if (bau.a(b)) {
            return bVar;
        }
        for (aee aeeVar : b) {
            awm.b a2 = aeeVar.a(i, i2);
            if (a2 != null) {
                bVar = a2;
            }
        }
        return bVar;
    }
}
