package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.b;

/* loaded from: classes8.dex */
public abstract class oio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public oif f32103a;

    static {
        kge.a(1161703763);
    }

    public abstract boolean b(Context context, b bVar, int i, com.taobao.share.ui.engine.render.b bVar2);

    public abstract void c(Context context, b bVar, int i, com.taobao.share.ui.engine.render.b bVar2);

    public oio(oif oifVar) {
        this.f32103a = oifVar;
    }

    public boolean a(Context context, b bVar, int i, com.taobao.share.ui.engine.render.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7808affd", new Object[]{this, context, bVar, new Integer(i), bVar2})).booleanValue();
        }
        boolean b = b(context, bVar, i, bVar2);
        if (b) {
            c(context, bVar, i, bVar2);
        }
        return b;
    }
}
