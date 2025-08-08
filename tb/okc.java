package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.i;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class okc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f32135a;

    static {
        kge.a(333510924);
    }

    public void a(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6cd2679", new Object[]{this, iHomeSubTabController});
            return;
        }
        lbq b = oiy.a().b();
        if (b == null) {
            ksp.c("HomeMainLandInfoFlowUtProcess", "pageProvider == null");
            return;
        }
        ksp.b("HomeMainLandInfoFlowUtProcess", "utWrite");
        las.a((Object) b.getCurActivity());
        String updatePageName = iHomeSubTabController.getUpdatePageName();
        if (!StringUtils.isEmpty(updatePageName)) {
            ksp.b("HomeMainLandInfoFlowUtProcess", "utWrite pageName : " + updatePageName);
            las.a(b.getCurActivity(), updatePageName);
        } else {
            ksp.b("HomeMainLandInfoFlowUtProcess", "utWrite default pageName : " + updatePageName);
            las.a((Context) b.getCurActivity());
        }
        String a2 = i.a();
        String updatePageUtParam = iHomeSubTabController.getUpdatePageUtParam();
        if (updatePageUtParam != null) {
            kss.a(b.getCurActivity(), updatePageUtParam);
        } else {
            kss.a(b.getCurActivity(), lbo.b().a(a2).c());
        }
        this.f32135a = iHomeSubTabController.getUpdatePageProperties();
        Map<String, String> map = this.f32135a;
        if (map != null) {
            this.f32135a = new HashMap(map);
            kss.a(b.getCurActivity(), this.f32135a);
            return;
        }
        kss.a(b.getCurActivity(), lbo.b().a(a2).a());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        lbq b = oiy.a().b();
        if (b == null) {
            ksp.c("HomeMainLandInfoFlowUtProcess", "pageProvider == null");
            return;
        }
        las.b((Object) b.getCurActivity());
        ksp.b("HomeMainLandInfoFlowUtProcess", "clearUt");
        Map<String, String> map = this.f32135a;
        if (map == null || map.isEmpty()) {
            ksp.c("HomeMainLandInfoFlowUtProcess", "lastPageProperties == null || lastPageProperties.isEmpty()");
            return;
        }
        for (Map.Entry<String, String> entry : this.f32135a.entrySet()) {
            entry.setValue(null);
        }
        kss.a(b.getCurActivity(), this.f32135a);
        this.f32135a = null;
    }

    public void b(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552e2a58", new Object[]{this, iHomeSubTabController});
            return;
        }
        Map<String, String> updateNextPageProperties = iHomeSubTabController.getUpdateNextPageProperties();
        if (updateNextPageProperties == null || updateNextPageProperties.isEmpty()) {
            return;
        }
        kss.a(updateNextPageProperties);
    }
}
