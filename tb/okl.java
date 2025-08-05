package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.c;
import com.taobao.tao.log.f;

/* loaded from: classes8.dex */
public class okl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f32141a;

    static {
        kge.a(-2134851476);
        f32141a = "SendMessage";
    }

    public static void a(Context context, jhh jhhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8175f3a6", new Object[]{context, jhhVar});
        } else {
            a(context, jhhVar, false);
        }
    }

    public static void a(Context context, jhh jhhVar, Boolean bool) {
        okj b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f7fde7", new Object[]{context, jhhVar, bool});
            return;
        }
        f.a().h().a(oko.e, jhhVar.c, "[SendMessage] 开始发送消息");
        oki okiVar = new oki();
        okiVar.b = context;
        okiVar.c = jhhVar.f29554a;
        okiVar.d = f.a().m();
        okiVar.e = f.a().i();
        okiVar.g = f.o();
        okiVar.f = jhd.a().b();
        okk g = f.a().g();
        if (g != null) {
            if (bool.booleanValue()) {
                b = g.c(okiVar);
            } else {
                b = g.b(okiVar);
            }
            if (b != null && b.f32140a != null) {
                c.a().a(b.b, b.d, b.c, b.f32140a.getBytes());
                return;
            } else if (bool.booleanValue()) {
                return;
            } else {
                Log.e(f32141a, "send request message error,result is null ");
                return;
            }
        }
        Log.e(f32141a, "send request message error,you need impl message sender ");
        f.a().h().b(oko.f, "SEND MESSAGE", "发送消息失败，因为没有实现消息服务");
    }
}
