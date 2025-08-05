package com.taobao.infoflow.taobao.subservice.biz.pop.lifecycle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.kge;
import tb.kyu;

/* loaded from: classes7.dex */
public class TbPopLayerBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f17498a;
    private boolean b = true;
    private final Set<kyu> c = new HashSet(8);

    public static /* synthetic */ Object ipc$super(TbPopLayerBroadcastReceiver tbPopLayerBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1869955722);
        f17498a = new ArrayList(4);
    }

    public void a(kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20ac4b1", new Object[]{this, kyuVar});
        } else if (kyuVar == null) {
        } else {
            this.c.add(kyuVar);
            c(kyuVar);
        }
    }

    public void b(kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08dcb32", new Object[]{this, kyuVar});
        } else if (kyuVar == null) {
        } else {
            this.c.remove(kyuVar);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null && intent.getAction() != null) {
            String stringExtra = intent.getStringExtra("layerType");
            String action = intent.getAction();
            com.taobao.homepage.pop.utils.c.b("PopLayerBroadcastReceiver ", "onReceive pop broadcast, action=" + action + ", layerType=" + stringExtra);
            if (!a().contains(stringExtra)) {
                return;
            }
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -709918551) {
                if (hashCode == 458758047 && action.equals(PopLayer.ACTION_OUT_DISMISS)) {
                    c = 1;
                }
            } else if (action.equals(PopLayer.ACTION_OUT_DISPLAY)) {
                c = 0;
            }
            if (c == 0) {
                this.b = false;
            } else if (c == 1) {
                this.b = true;
            }
            for (kyu kyuVar : this.c) {
                c(kyuVar);
            }
        }
    }

    private void c(kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf10d1b3", new Object[]{this, kyuVar});
        } else if (this.b) {
            kyuVar.c().b();
        } else {
            kyuVar.c().a();
        }
    }

    private List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        try {
            String a2 = c.a.a("homepage_switch", "popLayerTypeFilterList", (String) null);
            if (TextUtils.isEmpty(a2)) {
                return f17498a;
            }
            return (List) JSON.parseObject(a2, new TypeReference<ArrayList<String>>() { // from class: com.taobao.infoflow.taobao.subservice.biz.pop.lifecycle.TbPopLayerBroadcastReceiver.1
            }, new Feature[0]);
        } catch (Throwable unused) {
            return f17498a;
        }
    }
}
