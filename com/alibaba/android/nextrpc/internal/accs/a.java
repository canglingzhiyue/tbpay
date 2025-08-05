package com.alibaba.android.nextrpc.internal.accs;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bfp;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Object f2382a = new Object();
    private final Map<String, List<b>> b = new ConcurrentHashMap();

    /* renamed from: com.alibaba.android.nextrpc.internal.accs.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0082a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f2383a = new a();

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2f388441", new Object[0]) : f2383a;
        }
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2f388441", new Object[0]) : C0082a.a();
    }

    public void a(Context context, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84cfe75e", new Object[]{this, context, str, bVar});
            return;
        }
        synchronized (this.f2382a) {
            List<b> list = this.b.get(str);
            if (list == null) {
                GlobalClientInfo.getInstance(context).registerService(str, AccsReceiveService.class.getName());
                list = new ArrayList<>();
            }
            list.add(bVar);
            this.b.put(str, list);
        }
    }

    public void b(Context context, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a7b43df", new Object[]{this, context, str, bVar});
            return;
        }
        synchronized (this.f2382a) {
            List<b> list = this.b.get(str);
            if (list != null) {
                if (list.contains(bVar)) {
                    list.remove(bVar);
                }
                if (list.size() == 0) {
                    this.b.remove(str);
                    GlobalClientInfo.getInstance(context).unregisterListener(str);
                }
            }
        }
    }

    public void a(String str, String str2, String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        synchronized (this.f2382a) {
            bfp.a("nextrpc-accs-response", null, str, new HashMap<String, String>() { // from class: com.alibaba.android.nextrpc.internal.accs.AccsServiceManager$1
                {
                    a.this = this;
                    put("header", str4);
                }
            });
            List<b> list = this.b.get(str);
            if (list == null) {
                return;
            }
            for (b bVar : list) {
                bVar.a(str, str2, str3, JSON.parseObject(str4));
            }
        }
    }
}
