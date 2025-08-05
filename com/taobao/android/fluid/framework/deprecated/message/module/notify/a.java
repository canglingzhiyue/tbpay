package com.taobao.android.fluid.framework.deprecated.message.module.notify;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.p;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f12544a;
    private final Map<Context, NotifyImpl> b = new HashMap();

    static {
        kge.a(-86526971);
        f12544a = null;
    }

    private a() {
    }

    public static synchronized a a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("10203796", new Object[0]);
            }
            if (f12544a == null) {
                f12544a = new a();
            }
            return f12544a;
        }
    }

    public void a(p pVar, String str, C0495a c0495a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b8d112", new Object[]{this, pVar, str, c0495a});
            return;
        }
        NotifyImpl notifyImpl = this.b.get(pVar.getUIContext());
        if (notifyImpl == null) {
            notifyImpl = new NotifyImpl();
            this.b.put(pVar.getUIContext(), notifyImpl);
        }
        spz.a("WeexNotifyManager", "dispatchRegister" + str);
        notifyImpl.a(pVar.getUIContext().getApplicationContext(), str, c0495a);
    }

    public void a(p pVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6abfaf", new Object[]{this, pVar, str});
            return;
        }
        NotifyImpl notifyImpl = this.b.get(pVar.getUIContext());
        if (notifyImpl == null) {
            return;
        }
        notifyImpl.a(pVar.getUIContext().getApplicationContext(), str);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        NotifyImpl notifyImpl = this.b.get(context);
        if (notifyImpl == null) {
            return;
        }
        notifyImpl.a(context.getApplicationContext());
        this.b.remove(context);
    }

    /* renamed from: com.taobao.android.fluid.framework.deprecated.message.module.notify.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0495a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b f12545a;
        public int b = 1;

        static {
            kge.a(-125628370);
        }

        public C0495a(b bVar) {
            this.f12545a = bVar;
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            b bVar = this.f12545a;
            if (bVar == null) {
                return;
            }
            bVar.b(jSONObject);
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }
    }
}
