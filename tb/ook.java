package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.c;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.recommend3.dinamic.widget.RIconTextViewConstructor;
import com.taobao.tao.recommend3.dinamic.widget.RPriceViewConstructor;

/* loaded from: classes.dex */
public class ook {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1140278256);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            c.a().a("RPriceView", new RPriceViewConstructor());
            c.a().a("RIconTextView", new RIconTextViewConstructor());
            c.a().a("rOverlay", new ool());
            c.a().a("rTap", new oon());
            c.a().a("rPlatform", new ooo());
            c.a().a("rToJsonArray", new oop());
        } catch (DinamicException e) {
            e.a("DinamicException", "registerView failed", e);
            ksp.a("RmdDynamicUtil", "registeRmdView failed", e);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            c.a().a("rTabItemTap", new oom());
            c.a().a("rToJson", new ooq());
        } catch (DinamicException e) {
            e.a("DinamicException", "registerView failed", e);
            ksp.a("RmdDynamicUtil", "registeRmdView failed", e);
        }
    }
}
