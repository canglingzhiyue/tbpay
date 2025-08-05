package com.taobao.infoflow.core.subservice.base.item.itemrenderservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IItemRenderService;
import com.taobao.infoflow.protocol.view.item.b;
import com.taobao.infoflow.protocol.view.item.c;
import tb.kge;
import tb.lgh;
import tb.ljs;

/* loaded from: classes.dex */
public class ItemRenderServiceImpl implements IItemRenderService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ljs mInfoFlowContext;
    private IItemRenderService.a mItemRenderFactory;
    private a mItemRenderPresenter;

    static {
        kge.a(41017153);
        kge.a(-979429922);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public static /* synthetic */ b access$000(ItemRenderServiceImpl itemRenderServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("fe763f19", new Object[]{itemRenderServiceImpl, str}) : itemRenderServiceImpl.createCustomItemRender(str);
    }

    public static /* synthetic */ b access$100(ItemRenderServiceImpl itemRenderServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d4957c1a", new Object[]{itemRenderServiceImpl, str}) : itemRenderServiceImpl.createDefaultItemRender(str);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
        } else {
            this.mInfoFlowContext = ljsVar;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IItemRenderService
    public void setItemRenderFactory(IItemRenderService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c5b4fc0", new Object[]{this, aVar});
        } else {
            this.mItemRenderFactory = aVar;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IItemRenderService
    public c getItemRenderPresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("e759853b", new Object[]{this});
        }
        if (this.mItemRenderPresenter == null) {
            this.mItemRenderPresenter = new a(this.mInfoFlowContext, createItemRenderFactory());
        }
        return this.mItemRenderPresenter;
    }

    private IItemRenderService.a createItemRenderFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IItemRenderService.a) ipChange.ipc$dispatch("411236a2", new Object[]{this}) : new IItemRenderService.a() { // from class: com.taobao.infoflow.core.subservice.base.item.itemrenderservice.ItemRenderServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.base.IItemRenderService.a
            public b a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (b) ipChange2.ipc$dispatch("9e4cae1a", new Object[]{this, str});
                }
                b access$000 = ItemRenderServiceImpl.access$000(ItemRenderServiceImpl.this, str);
                return access$000 != null ? access$000 : ItemRenderServiceImpl.access$100(ItemRenderServiceImpl.this, str);
            }
        };
    }

    private b createCustomItemRender(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c2f505e5", new Object[]{this, str});
        }
        IItemRenderService.a aVar = this.mItemRenderFactory;
        if (aVar != null) {
            return aVar.a(str);
        }
        return null;
    }

    private b createDefaultItemRender(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b2ec92cd", new Object[]{this, str});
        }
        if (!"loading".equals(str)) {
            return null;
        }
        return new lgh(this.mInfoFlowContext);
    }
}
