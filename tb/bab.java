package tb;

import android.support.v7.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.UserMotionConfig;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

@AURAExtensionImpl(code = "aura.impl.render.scroll.userMotion")
/* loaded from: classes2.dex */
public final class bab implements atg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private s f25724a;
    private UserMotionConfig b;
    private JSONObject c;
    private bac d;
    private List<e> e;

    static {
        kge.a(-508426217);
        kge.a(836884500);
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.atg
    public void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        if (jqm.a()) {
            ard a2 = arc.a();
            a2.a("AURAUserMotionScrollExtension", "onScrollStateChanged", "newState:" + i);
        }
        if (i != 0) {
            return;
        }
        a();
    }

    @Override // tb.atg
    public void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        if (jqm.a()) {
            ard a2 = arc.a();
            a2.a("AURAUserMotionScrollExtension", "onScrolled", "dx:" + i + ",dy:" + i2);
        }
        List<e> list = this.e;
        if (list == null) {
            return;
        }
        if (list.isEmpty()) {
            this.e.add(new e(i, i2));
            return;
        }
        e eVar = this.e.get(this.e.size() - 1);
        e eVar2 = new e(i, i2);
        if (i != 0) {
            if (eVar.f2213a * i > 0) {
                this.e.add(eVar2);
                return;
            }
            a();
            this.e.add(eVar2);
        } else if (i2 == 0) {
        } else {
            if (eVar.b * i2 > 0) {
                this.e.add(eVar2);
                return;
            }
            a();
            this.e.add(eVar2);
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.b = (UserMotionConfig) aURAGlobalData.get("userMotionConfig", UserMotionConfig.class);
        this.c = (JSONObject) aURAGlobalData.get("userMotionCommonArgs", JSONObject.class);
        this.d = (bac) aURAGlobalData.get("userMotionRecorder", bac.class);
        if (this.d == null) {
            this.d = new bac();
            aURAGlobalData.update("userMotionRecorder", this.d);
        }
        this.e = (List) aURAGlobalData.get("userMotionScrollDistancePeriodCache", List.class);
        if (this.e != null) {
            return;
        }
        this.e = new ArrayList();
        aURAGlobalData.update("userMotionScrollDistancePeriodCache", this.e);
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f25724a = qVar.b();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        int i = 1;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<e> list = this.e;
        if (list == null) {
            return;
        }
        int i3 = 0;
        for (e eVar : list) {
            i2 += eVar.f2213a;
            i3 += eVar.b;
        }
        com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.f fVar = null;
        if (i2 != 0) {
            fVar = com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.f.a(i2 > 0 ? 4 : 3, Math.abs(i2));
        } else if (i3 != 0) {
            if (i3 > 0) {
                i = 2;
            }
            fVar = com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.f.a(i, Math.abs(i3));
        }
        if (fVar != null && this.d != null) {
            bad.a(this.f25724a, this.b, this.c, fVar.a());
            this.d.a(fVar);
        }
        this.e.clear();
    }
}
