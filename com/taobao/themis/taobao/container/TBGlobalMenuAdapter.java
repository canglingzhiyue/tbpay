package com.taobao.themis.taobao.container;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IGlobalMenuAdapter;
import com.taobao.themis.kernel.container.ui.titlebar.IMenuAction;
import com.taobao.themis.kernel.container.ui.titlebar.d;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qqr;
import tb.qqs;
import tb.qqt;
import tb.qqu;
import tb.qqv;
import tb.qqx;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u0004\u0018\u00010\n\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/taobao/themis/taobao/container/TBGlobalMenuAdapter;", "Lcom/taobao/themis/kernel/adapter/IGlobalMenuAdapter;", "()V", "createMenuItem", "Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu$TMSMenuItem;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "type", "Lcom/taobao/themis/kernel/container/ui/titlebar/IMenuAction$MenuType;", "getGlobalMenu", "Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu;", "T", "getMoreAction", "Lcom/taobao/themis/kernel/container/ui/titlebar/IMenuAction;", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TBGlobalMenuAdapter implements IGlobalMenuAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1423390490);
        kge.a(-247091328);
    }

    @Override // com.taobao.themis.kernel.adapter.IGlobalMenuAdapter
    public IMenuAction getMoreAction(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMenuAction) ipChange.ipc$dispatch("702c6557", new Object[]{this, page});
        }
        q.d(page, "page");
        return new a();
    }

    @Override // com.taobao.themis.kernel.adapter.IGlobalMenuAdapter
    public <T> d getGlobalMenu(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("1377f57a", new Object[]{this, page});
        }
        q.d(page, "page");
        return new e(page);
    }

    @Override // com.taobao.themis.kernel.adapter.IGlobalMenuAdapter
    public d.a createMenuItem(ITMSPage page, IMenuAction.MenuType type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d.a) ipChange.ipc$dispatch("3d43868", new Object[]{this, page, type});
        }
        q.d(page, "page");
        q.d(type, "type");
        switch (b.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return new qqx(page);
            case 2:
                return new qqr(page);
            case 3:
                return new qqu(page);
            case 4:
                return new qqs(page);
            case 5:
                return new qqt(page);
            case 6:
                return new qqv(page);
            default:
                return null;
        }
    }
}
