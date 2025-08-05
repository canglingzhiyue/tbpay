package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.base.ICacheService;
import com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService;
import com.taobao.infoflow.protocol.subservice.biz.IWindVaneService;

/* loaded from: classes7.dex */
public class ldv extends lds {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ldt f30511a;

    static {
        kge.a(-1125450349);
    }

    public static /* synthetic */ Object ipc$super(ldv ldvVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1167027415) {
            super.d((BaseSectionModel) objArr[0], (BaseSubItemModel) objArr[1], (View) objArr[2]);
            return null;
        } else if (hashCode != -499218686) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((BaseSectionModel) objArr[0], (BaseSubItemModel) objArr[1], (String) objArr[2], (View) objArr[3]);
            return null;
        }
    }

    public ldv(ljs ljsVar) {
        super(ljsVar);
        this.f30511a = new ldt();
    }

    @Override // tb.lds
    public void a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23e8702", new Object[]{this, baseSectionModel, baseSubItemModel, str, view});
        } else if (this.f30511a.a(a(), str, view)) {
            ldf.d("RTap", "共享元素动画处理跳转");
        } else {
            super.a(baseSectionModel, baseSubItemModel, str, view);
        }
    }

    @Override // tb.lds
    public void b(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e949f36b", new Object[]{this, baseSectionModel, baseSubItemModel, view});
        } else if (view == null) {
        } else {
            a(baseSubItemModel.mo1100getClickParam().getItemId());
            b(baseSectionModel, baseSubItemModel);
            b();
        }
    }

    @Override // tb.lds
    public void d(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba709329", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            return;
        }
        super.d(baseSectionModel, baseSubItemModel, view);
        ljh.a(a(), view, baseSectionModel, baseSubItemModel, (JSONObject) null);
        liw.a(baseSectionModel, baseSubItemModel);
        lcy.b(baseSubItemModel.mo1100getClickParam());
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ICacheService iCacheService = (ICacheService) a().a(ICacheService.class);
        if (iCacheService == null) {
            ldf.d("RTap", "cacheService == null");
        } else {
            iCacheService.getClickCache().a(str);
        }
    }

    private void b(BaseSectionModel baseSectionModel, BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b26207", new Object[]{this, baseSectionModel, baseSubItemModel});
            return;
        }
        IWindVaneService iWindVaneService = (IWindVaneService) a().a(IWindVaneService.class);
        if (iWindVaneService == null) {
            return;
        }
        iWindVaneService.updateWindVaneClick(baseSectionModel, baseSubItemModel);
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
