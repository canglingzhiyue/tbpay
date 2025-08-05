package tb;

import com.alibaba.android.ultron.vfw.instance.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.b;
import com.taobao.android.ultron.datamodel.imp.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class bou implements d.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f26026a;

    static {
        kge.a(-156503333);
        kge.a(-312919124);
    }

    public bou(b bVar) {
        this.f26026a = bVar;
    }

    @Override // com.alibaba.android.ultron.vfw.instance.d.c
    public final void a(List<IDMComponent> list, bnv bnvVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c33db", new Object[]{this, list, bnvVar, bVar});
        } else if (this.f26026a != null && list != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null) {
                    String b = f.b(iDMComponent);
                    if ("footer".equals(b)) {
                        arrayList2.add(iDMComponent);
                    } else if ("header".equals(b)) {
                        arrayList.add(iDMComponent);
                    } else if ("foreground".equalsIgnoreCase(b)) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(iDMComponent);
                    } else if ("background".equalsIgnoreCase(b)) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(iDMComponent);
                    }
                }
                arrayList3.add(iDMComponent);
            }
            bnvVar.a(arrayList);
            bnvVar.e(arrayList2);
            bnvVar.b(arrayList3);
            bnvVar.f(arrayList4);
            bnvVar.g(arrayList5);
        }
    }
}
