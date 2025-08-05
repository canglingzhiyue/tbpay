package com.taobao.tao.flexbox.layoutmanager.module;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.a;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import java.util.HashMap;
import tb.kge;

@AnyThread
/* loaded from: classes8.dex */
public class NetModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1326573999);
        kge.a(-818961104);
    }

    public static void fetch(final g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b608efde", new Object[]{cVar});
            return;
        }
        final g.d dVar = cVar.c;
        if (!(cVar.b instanceof JSONObject)) {
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.ac.a.a().a(((JSONObject) cVar.b).getString("url"), new a.InterfaceC0829a() { // from class: com.taobao.tao.flexbox.layoutmanager.module.NetModule.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.InterfaceC0829a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                g.d dVar2 = g.d.this;
                if (dVar2 == null) {
                    return;
                }
                dVar2.a(cVar, str);
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.InterfaceC0829a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                g.d dVar2 = g.d.this;
                if (dVar2 == null) {
                    return;
                }
                dVar2.a(cVar, (g.a) null);
            }
        });
    }

    public static void getNetworkInfo(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0418d52", new Object[]{cVar});
            return;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) cVar.a().getSystemService("connectivity")).getActiveNetworkInfo();
        HashMap hashMap = new HashMap();
        if (activeNetworkInfo != null) {
            hashMap.put("connect", Boolean.valueOf(activeNetworkInfo.isConnected()));
            hashMap.put("type", activeNetworkInfo.getTypeName() != null ? activeNetworkInfo.getTypeName().toLowerCase() : "");
        } else {
            hashMap.put("connect", false);
        }
        if (cVar.c == null) {
            return;
        }
        cVar.c.a(cVar, hashMap);
    }
}
