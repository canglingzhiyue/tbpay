package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.android.task.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.base.b;
import com.taobao.mytaobao.base.c;
import com.taobao.mytaobao.pagev2.dataservice.a;

/* loaded from: classes7.dex */
public class mwx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-892240833);
    }

    public static /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            d();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            Coordinator.execute(new Runnable() { // from class: tb.mwx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        mwx.c();
                    }
                }
            });
        } else {
            d();
        }
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        c cVar = c.INSTANCE;
        if (c.x() && !c.r()) {
            e();
        } else {
            f();
        }
    }

    private static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        try {
            b.a(new Runnable() { // from class: tb.mwx.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    xok b;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String userId = Login.getUserId();
                    if (TextUtils.isEmpty(userId)) {
                        return;
                    }
                    a.a(userId);
                    xoh.a(userId);
                    if (!mxz.b() || (b = xoh.b()) == null) {
                        return;
                    }
                    b.b();
                }
            }, 500L);
        } catch (Throwable th) {
            if (Versions.isDebug()) {
                throw th;
            }
        }
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            return;
        }
        JSONObject l = com.taobao.mytaobao.ultron.b.a().l();
        mxe.INSTANCE.l();
        final String jSONString = l == null ? null : l.toJSONString();
        if (!mxz.b() || !a()) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.mwx.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    com.taobao.mytaobao.basement.weex.a.INSTANCE.d(jSONString);
                }
            }
        }, 500L);
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        JSONObject o = com.taobao.mytaobao.ultron.b.a().o();
        if (o == null) {
            return false;
        }
        try {
            if (!TextUtils.equals("true", o.getString("newBasementContainer"))) {
                return false;
            }
            return TextUtils.equals("weex", o.getString("pageType"));
        } catch (Throwable unused) {
            return false;
        }
    }
}
