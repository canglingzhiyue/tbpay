package tb;

import android.app.Application;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.taobao.subservice.biz.smartloadingservice.impl.biz.cache.a;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class lrx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30879a;
    private a b;

    static {
        kge.a(-188029361);
    }

    public lrx(ljs ljsVar, a aVar) {
        this.f30879a = ljsVar;
        this.b = aVar;
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        String a2 = this.f30879a.a().a();
        List<BaseSectionModel<?>> b = this.b.b(a2);
        List<BaseSectionModel<?>> a3 = a(i, b);
        if (a3 == null) {
            ldf.d("SmartLoadingInsertCardHelper", "insertSectionModelList == null 取到的插卡数据为空");
            return;
        }
        b.removeAll(a3);
        a(a3);
        this.b.a(a2, b);
        a();
        lql.a(i3, i2, i);
        if (jqm.a()) {
            Application application = Globals.getApplication();
            Toast.makeText(application, "补卡 " + i + "张", 0).show();
        }
        ldf.d("SmartLoadingInsertCardHelper", "数据处理完成，准备刷新UI插卡啦");
    }

    private List<BaseSectionModel<?>> a(int i, List<BaseSectionModel<?>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("79225e3b", new Object[]{this, new Integer(i), list});
        }
        if (list.isEmpty()) {
            ldf.d("SmartLoadingInsertCardHelper", "sectionModelList.size() == 0");
            return null;
        }
        if (list.size() < i) {
            ldf.d("SmartLoadingInsertCardHelper", "内存中剩余卡片个数小于需要插卡的值，当前内存个数为：" + list.size());
            i = list.size();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(list.get(i2));
        }
        return arrayList;
    }

    private void a(List<BaseSectionModel<?>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30879a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("SmartLoadingInsertCardHelper", "containerDataService == null");
            return;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            ldf.d("SmartLoadingInsertCardHelper", "containerData == null");
            return;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            ldf.d("SmartLoadingInsertCardHelper", "baseData == null");
            return;
        }
        for (BaseSectionModel<?> baseSectionModel : list) {
            if (baseSectionModel.getArgs() != null) {
                baseSectionModel.getArgs().put("isSmartLoading", (Object) true);
            }
        }
        List sections = base.getSections();
        sections.addAll(list);
        containerData.updateBaseSections(sections);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30879a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        iContainerDataService.triggerEvent("OnlyUiRefresh", null);
    }
}
