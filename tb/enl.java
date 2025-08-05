package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.factory.manager.a;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.b;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class enl extends ene<epf> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HashMap<String, b> b;
    public ArrayList<Event> c;
    public enk d;
    public String e;

    static {
        kge.a(-1420449518);
    }

    public enl(List<epf> list) {
        super(list);
        this.c = new ArrayList<>();
        emu.a("com.taobao.android.detail.datasdk.engine.structure.desc.DetailDescStructure");
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
            if (!TextUtils.isEmpty(next.f10063a)) {
                this.b.put(next.f10063a, next);
            }
        }
    }

    public void a(Context context, ArrayList<ActionModel> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9bb14a", new Object[]{this, context, arrayList});
            return;
        }
        a n = emx.a(context).b().n();
        Iterator<ActionModel> it = arrayList.iterator();
        while (it.hasNext()) {
            Event a2 = n.a(it.next(), null, null, null);
            if (a2 != null) {
                this.c.add(a2);
            }
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        HashMap<String, b> hashMap = this.b;
        return hashMap != null && !hashMap.isEmpty();
    }
}
