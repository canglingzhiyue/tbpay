package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.b;
import com.taobao.share.ui.engine.structure.a;

/* loaded from: classes8.dex */
public class oiv extends oio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1246109695);
    }

    public oiv(oif oifVar) {
        super(oifVar);
    }

    @Override // tb.oio
    public boolean b(Context context, b bVar, int i, com.taobao.share.ui.engine.render.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3095705c", new Object[]{this, context, bVar, new Integer(i), bVar2})).booleanValue();
        }
        if (bVar instanceof a) {
            a aVar = (a) bVar;
            if (!aVar.d().j() && aVar.e) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.oio
    public void c(Context context, b bVar, int i, com.taobao.share.ui.engine.render.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92230b7", new Object[]{this, context, bVar, new Integer(i), bVar2});
            return;
        }
        this.f32103a.b.f = bVar;
        oup.b(bVar.b(), "picture");
    }
}
