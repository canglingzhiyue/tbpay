package tb;

import android.taobao.windvane.util.m;
import com.alibaba.android.ultron.vfw.instance.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class afp implements d.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(647328192);
        kge.a(-312919124);
    }

    @Override // com.alibaba.android.ultron.vfw.instance.d.c
    public void a(List<IDMComponent> list, bnv bnvVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c33db", new Object[]{this, list, bnvVar, bVar});
            return;
        }
        IDMComponent f = bVar.f();
        if (f == null) {
            return;
        }
        m.c("DataSourceProcessor", "root component" + f.getKey());
        for (IDMComponent iDMComponent : f.getChildren()) {
            if ("TaoLiveGoodsHeader".equals(iDMComponent.getKey())) {
                if (iDMComponent.getChildren() != null) {
                    List<IDMComponent> children = iDMComponent.getChildren();
                    m.c("DataSourceProcessor", "header 区块个数：" + children.size());
                    bnvVar.a(children);
                }
            } else if ("GoodsItemList".equals(iDMComponent.getKey())) {
                if (iDMComponent.getChildren() != null) {
                    List<IDMComponent> children2 = iDMComponent.getChildren();
                    m.c("DataSourceProcessor", "列表卡片种类：" + children2.size());
                    bnvVar.b(children2);
                }
            } else if ("TaoLiveGoodsTabContainer".equals(iDMComponent.getKey()) && iDMComponent.getChildren() != null && !iDMComponent.getChildren().isEmpty()) {
                IDMComponent iDMComponent2 = iDMComponent.getChildren().get(0);
                if ("TaoLiveGoodsTab".equals(iDMComponent2.getKey())) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(iDMComponent2);
                    bnvVar.c(arrayList);
                }
            }
        }
    }
}
