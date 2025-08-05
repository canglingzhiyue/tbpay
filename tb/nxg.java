package tb;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import java.util.List;
import tb.nwk;

/* loaded from: classes8.dex */
public class nxg extends ira implements nvk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1380892954);
        kge.a(-608431992);
    }

    public static /* synthetic */ Object ipc$super(nxg nxgVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 267248023) {
            super.init();
            return null;
        } else if (hashCode != 539608852) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((ViewPager) objArr[0]);
            return null;
        }
    }

    @Override // tb.ira
    public boolean a(List<TabBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
        }
        return true;
    }

    @Override // tb.ira, tb.iuh
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.init();
        nvj nvjVar = (nvj) ((iru) getWidget().getModel()).e().b(nvj.CONFIG_KEY);
        if (nvjVar == null) {
            return;
        }
        nvjVar.a(this);
    }

    @Override // tb.ira, tb.ird
    public void a(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2029c714", new Object[]{this, viewPager});
        } else {
            super.a(viewPager);
        }
    }

    public void onEventMainThread(nwk.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1245e335", new Object[]{this, bVar});
        } else if (getIView().b() == null) {
        } else {
            getIView().b().setVisibility(8);
            if (!(getIView().b().getParent() instanceof View)) {
                return;
            }
            View view = (View) getIView().b().getParent();
            view.getLayoutParams().height = 0;
            view.requestLayout();
        }
    }

    @Override // tb.nvk
    public void a(SFPromotionBean sFPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c019e54d", new Object[]{this, sFPromotionBean});
        } else {
            ((nxh) getIView()).a(sFPromotionBean);
        }
    }
}
