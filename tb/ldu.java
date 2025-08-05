package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService;

/* loaded from: classes7.dex */
public class ldu extends lds {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1125748259);
    }

    public static /* synthetic */ Object ipc$super(ldu lduVar, String str, Object... objArr) {
        if (str.hashCode() == -1167027415) {
            super.d((BaseSectionModel) objArr[0], (BaseSubItemModel) objArr[1], (View) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ldu(ljs ljsVar) {
        super(ljsVar);
    }

    @Override // tb.lds
    public void b(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e949f36b", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            return;
        }
        ldf.b("HTap", "首页点击无记录");
        b();
    }

    @Override // tb.lds
    public void d(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba709329", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            return;
        }
        super.d(baseSectionModel, baseSubItemModel, view);
        ljg.a(baseSubItemModel);
        ljg.b(baseSubItemModel);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ISmartBackRefreshService iSmartBackRefreshService = (ISmartBackRefreshService) a().a(ISmartBackRefreshService.class);
        if (iSmartBackRefreshService == null) {
            return;
        }
        iSmartBackRefreshService.setDirectClickInInfoFlow(true);
    }
}
