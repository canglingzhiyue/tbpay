package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.b;
import com.taobao.share.globalmodel.e;
import com.taobao.share.ui.engine.structure.a;

/* loaded from: classes8.dex */
public class oit extends oio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1202223677);
    }

    public oit(oif oifVar) {
        super(oifVar);
    }

    @Override // tb.oio
    public boolean b(Context context, b bVar, int i, com.taobao.share.ui.engine.render.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3095705c", new Object[]{this, context, bVar, new Integer(i), bVar2})).booleanValue();
        }
        if (!(bVar instanceof a)) {
            return false;
        }
        return "2".equals(((a) bVar).d().i());
    }

    @Override // tb.oio
    public void c(Context context, b bVar, int i, com.taobao.share.ui.engine.render.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92230b7", new Object[]{this, context, bVar, new Integer(i), bVar2});
            return;
        }
        a aVar = (a) bVar;
        if (aVar.c == null || !StringUtils.equals("true", aVar.c.getString("isDisabled"))) {
            e.b().j()._defineToolUrl = aVar.d().a();
            obk.a().onEvent(bVar);
        }
        oup.a(aVar.d().c(), "", aVar.d().l());
    }
}
