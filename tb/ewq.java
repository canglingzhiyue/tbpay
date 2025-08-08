package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ActionModel;
import com.taobao.android.detail.sdk.model.template.b;
import com.taobao.android.detail.sdk.structure.c;
import com.taobao.android.detail.sdk.vmodel.desc.e;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class ewq extends c<e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HashMap<String, b> b;
    public ArrayList<Event> c;
    public ewp d;
    public String e;

    static {
        kge.a(-969320689);
    }

    public ewq(List<e> list) {
        super(list);
        this.c = new ArrayList<>();
        tpc.a("com.taobao.android.detail.sdk.structure.desc.DetailDescStructure");
    }

    public void a(ArrayList<b> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        this.b = new HashMap<>();
        Iterator<b> it = arrayList.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (!StringUtils.isEmpty(next.f10307a)) {
                this.b.put(next.f10307a, next);
            }
        }
    }

    public void b(ArrayList<ActionModel> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e188d161", new Object[]{this, arrayList});
            return;
        }
        Iterator<ActionModel> it = arrayList.iterator();
        while (it.hasNext()) {
            Event a2 = new ewe().a(it.next(), null);
            if (a2 != null) {
                this.c.add(a2);
            }
        }
    }
}
