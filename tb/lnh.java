package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.impl.a;
import java.util.Map;

/* loaded from: classes.dex */
public class lnh implements IDxItemClickService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f30741a;
    private final ljs b;

    static {
        kge.a(1622576115);
        kge.a(-1110035696);
    }

    public lnh(a aVar, ljs ljsVar) {
        this.f30741a = aVar;
        this.b = ljsVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.a
    public void a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a38c", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            return;
        }
        b(baseSubItemModel);
        a();
        b();
    }

    private void b(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed8353f", new Object[]{this, baseSubItemModel});
            return;
        }
        String c = c(baseSubItemModel);
        if (c == null || StringUtils.isEmpty(c)) {
            ldf.d("DxItemClickListener", "realTimeClickParams == null");
        } else {
            this.f30741a.c(c);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Map<String, Object> a2 = this.f30741a.a("click");
        String c = this.b.a().c();
        ldg.a("click", c, a2);
        ldg.b("click", c, a2);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f30741a.b("click");
        }
    }

    private String c(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f109e060", new Object[]{this, baseSubItemModel});
        }
        if (baseSubItemModel == null) {
            ldf.d("DxItemClickListener", "subItem == null");
            return null;
        }
        JSONObject ext = baseSubItemModel.getExt();
        if (ext == null) {
            ldf.d("DxItemClickListener", "ext == null");
            return null;
        }
        return ext.getString("realtimeClickParam");
    }
}
