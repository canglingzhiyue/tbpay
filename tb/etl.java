package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.tool.DIConstants;
import com.taobao.android.detail.industry.tool.a;
import com.taobao.taobao.R;

@AURAExtensionImpl(code = "industryDetail.impl.event.picGalleryExitExpand.onExitExpand")
/* loaded from: classes4.dex */
public final class etl implements ejy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1537065804);
        kge.a(1259087748);
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public etl() {
        emu.a("com.taobao.android.detail.industry.adapter.event.FrameExpendExitEvent");
    }

    @Override // tb.ejy
    public void a(RecyclerView recyclerView, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9e40dc", new Object[]{this, recyclerView, view, new Integer(i), new Integer(i2)});
            return;
        }
        Object tag = view.getTag(R.id.aura_render_component_weex2_instance);
        if (tag instanceof bag) {
            ((bag) tag).a(DIConstants.WEXX_EVENT_MODULE, DIConstants.EVENT_NAME_LIFE_CYCLE, "onExpendExit");
            a.a("FrameExpendExitEvent", "onPicGalleryExitExpand weexInstance");
            return;
        }
        Object tag2 = view.getTag(R.id.detail_industry_component_trwidget_instance);
        if (tag2 instanceof TRWidgetInstance) {
            int c = gbg.c(view.getContext(), i) << 1;
            int c2 = gbg.c(view.getContext(), i2) << 1;
            ((TRWidgetInstance) tag2).updateSize(c, c2);
            a.a("FrameExpendExitEvent", "onPicGalleryExitExpand widgetInstance: " + c + "," + c2);
            return;
        }
        a.b("FrameExpendExitEvent", "no implement");
    }
}
