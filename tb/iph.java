package tb;

import com.alibaba.android.ultron.vfw.template.d;
import com.alibaba.android.ultron.vfw.template.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.a;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class iph implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final d f29205a;
    private final String b;

    static {
        kge.a(2083729544);
        kge.a(717452841);
    }

    public iph(String str, d dVar) {
        this.f29205a = dVar;
        this.b = str;
    }

    @Override // com.alibaba.android.ultron.vfw.template.d
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea18f427", new Object[]{this, eVar});
            return;
        }
        d dVar = this.f29205a;
        if (dVar != null) {
            dVar.a(eVar);
        }
        if (eVar == null || eVar.b == null || eVar.b.size() <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<a> it = eVar.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next != null) {
                sb.append(next.c);
                sb.append(",");
            }
        }
        jqg.a(this.b, "#组件下载失败:", sb.toString());
    }
}
