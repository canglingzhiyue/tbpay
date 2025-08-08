package com.taobao.infoflow.core.subservice.base.item.itemrenderservice;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.itemrenderservice.local.NestedEmptyView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.base.IItemRenderService;
import com.taobao.infoflow.protocol.view.item.b;
import com.taobao.infoflow.protocol.view.item.c;
import java.util.HashMap;
import tb.kge;
import tb.ljs;

/* loaded from: classes.dex */
public class a implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f17368a;
    private final IItemRenderService.a b;
    private final HashMap<String, b> c = new HashMap<>();
    private final HashMap<Integer, b> d = new HashMap<>();

    static {
        kge.a(-848385420);
        kge.a(1914589183);
    }

    public a(ljs ljsVar, IItemRenderService.a aVar) {
        this.b = aVar;
        a(ljsVar);
    }

    private void a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
        } else {
            this.f17368a = (b) ljsVar.a(IDxItemRenderService.class);
        }
    }

    private void a(String str, int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f1e507", new Object[]{this, str, new Integer(i), bVar});
            return;
        }
        this.c.put(str, bVar);
        this.d.put(Integer.valueOf(i), bVar);
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public void preRender(Context context, BaseSectionModel<?> baseSectionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23eb059f", new Object[]{this, context, baseSectionModel, new Boolean(z), new Integer(i)});
        } else {
            a(baseSectionModel.getSectionBizCode(), baseSectionModel).preRender(context, baseSectionModel, z, i);
        }
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public View createView(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("97790b1e", new Object[]{this, viewGroup, new Integer(i)});
        }
        View createView = a(i).createView(viewGroup, i);
        return createView == null ? new NestedEmptyView(viewGroup.getContext()) : createView;
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public void bindData(View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43424acc", new Object[]{this, view, baseSectionModel});
        } else if (view instanceof NestedEmptyView) {
        } else {
            a(baseSectionModel.getSectionBizCode()).bindData(view, baseSectionModel);
        }
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public int getViewType(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9fbda37", new Object[]{this, baseSectionModel})).intValue();
        }
        Integer a2 = a(baseSectionModel);
        if (a2 != null) {
            return a2.intValue();
        }
        return a(baseSectionModel.getSectionBizCode(), baseSectionModel).getViewType(baseSectionModel);
    }

    private b a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a7010d1", new Object[]{this, new Integer(i)});
        }
        b bVar = this.d.get(Integer.valueOf(i));
        return bVar == null ? this.f17368a : bVar;
    }

    @Override // com.taobao.infoflow.protocol.view.item.c
    public b a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9e4cae1a", new Object[]{this, str}) : a(str, null);
    }

    private b a(String str, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c5e722d2", new Object[]{this, str, baseSectionModel});
        }
        b bVar = this.c.get(str);
        if (bVar == null) {
            bVar = b(str, baseSectionModel);
        }
        return bVar == null ? this.f17368a : bVar;
    }

    private b b(String str, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ce82a731", new Object[]{this, str, baseSectionModel});
        }
        b a2 = this.b.a(str);
        if (a2 != null) {
            a(str, a2.getViewType(baseSectionModel), a2);
        }
        return a2;
    }

    private Integer a(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("e4cc40d7", new Object[]{this, baseSectionModel});
        }
        if (baseSectionModel != null && !StringUtils.isEmpty(baseSectionModel.getSectionBizCode())) {
            return (baseSectionModel.getExt() == null || !baseSectionModel.getExt().getBooleanValue("hidden")) ? null : -1;
        }
        return -1;
    }
}
