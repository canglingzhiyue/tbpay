package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ConsumerRightsNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.RightsNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class fcm extends eoc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<RightsNode.b> f27804a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    static {
        kge.a(-1711074809);
    }

    public fcm(String str, String str2) {
        this.f = str;
        this.g = str2;
        emu.a("com.taobao.android.detail.wrapper.ext.event.basic.OpenGuaranteeEvent");
    }

    public fcm(b bVar) {
        emu.a("com.taobao.android.detail.wrapper.ext.event.basic.OpenGuaranteeEvent");
        if (bVar == null) {
            return;
        }
        ConsumerRightsNode p = eqb.p(bVar);
        RightsNode o = eqb.o(bVar);
        if (p != null && p.rights != null && !TextUtils.isEmpty(p.url)) {
            this.f27804a = p.rights;
            this.e = p.passValue;
            this.f = p.url;
            this.g = p.type;
            this.d = p.getData().toJSONString();
            return;
        }
        this.f27804a = o.rights;
        this.d = o.params;
        this.b = b();
        this.c = o.strength;
        this.e = o.passValue;
    }

    private String b() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        Iterator<RightsNode.b> it = this.f27804a.iterator();
        while (it.hasNext()) {
            RightsNode.b next = it.next();
            int i2 = i + 1;
            if (i != 0) {
                sb.append(",");
            }
            sb.append(next.f10022a);
            i = i2;
        }
        return sb.toString();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : "all".equals(this.e);
    }
}
