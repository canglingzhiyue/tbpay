package com.taobao.android.fluid.framework.deprecated.message.module.notify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.deprecated.message.module.notify.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.smc;
import tb.smd;
import tb.spz;

/* loaded from: classes5.dex */
public class NotifyImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Class<? extends a>> f12542a;
    private final HashMap<Class<? extends a>, a> b = new HashMap<>();

    /* loaded from: classes5.dex */
    public interface a {
        void a(Context context);

        void a(Context context, String str);

        void a(Context context, String str, a.C0495a c0495a);
    }

    static {
        kge.a(1626590439);
        f12542a = new HashMap<>();
        a("", smc.class);
        a("DAI", smd.class);
    }

    public static void a(String str, Class<? extends a> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{str, cls});
        } else {
            f12542a.put(str, cls);
        }
    }

    public void a(Context context, String str, a.C0495a c0495a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ccf7", new Object[]{this, context, str, c0495a});
            return;
        }
        a b = b(str);
        if (b == null) {
            return;
        }
        b.a(context, str, c0495a);
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        a b = b(str);
        if (b == null) {
            return;
        }
        b.a(context, str);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        for (Map.Entry<Class<? extends a>, a> entry : this.b.entrySet()) {
            a value = entry.getValue();
            if (value != null) {
                value.a(context);
            }
        }
        this.b.clear();
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            String[] split = str.split("_");
            if (split.length > 1) {
                return split[0];
            }
        }
        return "";
    }

    private a b(String str) {
        Class<? extends a> cls;
        String a2 = a(str);
        try {
            if (!StringUtils.isEmpty(a2)) {
                cls = f12542a.get(a2);
            } else {
                cls = f12542a.get("");
            }
            if (cls != null) {
                a aVar = this.b.get(cls);
                if (aVar != null) {
                    return aVar;
                }
                a newInstance = cls.newInstance();
                this.b.put(cls, newInstance);
                return newInstance;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* loaded from: classes5.dex */
    public static class CommonBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final List<a.C0495a> f12543a = new ArrayList();

        static {
            kge.a(633923144);
        }

        public void a(a.C0495a c0495a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15dcac79", new Object[]{this, c0495a});
            } else {
                this.f12543a.add(c0495a);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                try {
                    if (intent.getAction() != null) {
                        spz.a("CommonBroadcastReceiver", intent.getAction());
                    }
                    Bundle extras = intent.getExtras();
                    JSONObject jSONObject = null;
                    if (extras != null) {
                        Set<String> keySet = extras.keySet();
                        JSONObject jSONObject2 = new JSONObject();
                        for (String str : keySet) {
                            Object obj = extras.get(str);
                            jSONObject2.put(str, (Object) (obj == null ? null : obj.toString()));
                        }
                        jSONObject = jSONObject2;
                    }
                    Iterator<a.C0495a> it = this.f12543a.iterator();
                    while (it.hasNext()) {
                        a.C0495a next = it.next();
                        if (next.b > 0) {
                            next.a(jSONObject);
                            next.b--;
                        }
                        if (next.b <= 0) {
                            it.remove();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f12543a.clear();
            }
        }
    }
}
