package com.taobao.android.order.bundle.ultron.view;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.viewholder.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.TBOrderDetailActivity;
import com.taobao.android.order.bundle.base.BaseActivity;
import com.taobao.android.order.bundle.helper.rec.OrderRecommendWrapper;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.bny;
import tb.hvn;
import tb.hyn;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends com.alibaba.android.ultron.vfw.viewholder.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_TAG = "native$recommend";
    public static final e CREATOR;
    public com.taobao.android.order.bundle.helper.rec.a e;
    public bny f;
    private JSONObject g;

    public c(bny bnyVar) {
        super(bnyVar);
        this.e = null;
        this.f = bnyVar;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        hyn.a("RecommendHolder", "onCreateView", "render", "页面渲染", "加载成功");
        if (hvn.c()) {
            this.e = new OrderRecommendWrapper((OrderRecyclerView) this.f.p(), this.f.k(), OrderRecommendWrapper.RecType.GUESS, null);
            this.e.a(false);
            if (this.f.k() instanceof TBOrderDetailActivity) {
                ((TBOrderDetailActivity) this.f.k()).a(this.e);
            }
        }
        return new View(viewGroup == null ? this.f.k() : viewGroup.getContext());
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        hyn.a("RecommendHolder", "onBindData", iDMComponent.getFields().toJSONString());
        if (iDMComponent.getFields() == null || this.e == null) {
            return;
        }
        hyn.a("RecommendHolder", "onBindData", iDMComponent.getFields().toJSONString());
        if (iDMComponent.getFields() == this.g) {
            return;
        }
        String str = null;
        bny bnyVar = this.f;
        if (bnyVar != null && (bnyVar.k() instanceof BaseActivity)) {
            str = ((BaseActivity) this.f.k()).j();
        }
        iDMComponent.getFields().put("fromPageType", (Object) str);
        this.e.a(iDMComponent.getFields(), "");
        this.g = iDMComponent.getFields();
    }

    static {
        kge.a(-1449391264);
        CREATOR = new e() { // from class: com.taobao.android.order.bundle.ultron.view.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.viewholder.e
            public com.alibaba.android.ultron.vfw.viewholder.b a(bny bnyVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.b) ipChange.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar}) : new c(bnyVar);
            }
        };
    }
}
