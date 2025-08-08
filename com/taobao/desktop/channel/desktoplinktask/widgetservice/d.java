package com.taobao.desktop.channel.desktoplinktask.widgetservice;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.b;
import com.taobao.desktop.channel.desktoplinktask.trigger.f;
import com.taobao.tbpoplayer.nativerender.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.kgz;
import tb.kha;
import tb.khm;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Map<String, List<b>> f16956a = new ConcurrentHashMap();

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final d f16957a;

        static {
            kge.a(1901162681);
            f16957a = new d();
        }

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("8e9d4b5d", new Object[0]) : f16957a;
        }
    }

    static {
        kge.a(-1356704794);
    }

    public static /* synthetic */ void lambda$Q1swNnJ3y_Uqg2F6AdzLn816gEw(b bVar) {
        c(bVar);
    }

    public static /* synthetic */ void lambda$hcg4k9VhhB9k5E5QYpNy51nH2LU(d dVar, String str) {
        dVar.d(str);
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("8e9d4b5d", new Object[0]) : a.a();
    }

    public boolean a(String str) {
        List<b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && (list = this.f16956a.get(str)) != null && list.size() > 0) {
            for (b bVar : list) {
                if (bVar != null && bVar.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public Map<String, Integer> b() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            for (Map.Entry<String, List<b>> entry : this.f16956a.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    Iterator<b> it = entry.getValue().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        b next = it.next();
                        if (next != null && next.c()) {
                            z = true;
                            break;
                        }
                    }
                    hashMap.put(key, Integer.valueOf(z ? 1 : 0));
                }
            }
        } catch (Throwable th) {
            kgz.a("FloatWindowManager.getAllWindowStatus.error", th);
        }
        return hashMap;
    }

    public boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2d53ce2", new Object[]{this, bVar})).booleanValue();
        }
        if (bVar == null || bVar.f16946a == null) {
            return false;
        }
        String str = bVar.f16946a.c;
        if (StringUtils.isEmpty(str)) {
            kgz.b("addNewRequest.bizCode.null.return", new Object[0]);
            return false;
        }
        List<b> list = null;
        if (this.f16956a.containsKey(str)) {
            list = this.f16956a.get(str);
        }
        if (list != null && !list.isEmpty()) {
            kgz.b("addNewRequest.sameBizCode.AlreadyPopping.cancel.bizCode=%s", str);
            return false;
        }
        if (list == null) {
            list = new ArrayList<>();
            this.f16956a.put(str, list);
        }
        list.add(bVar);
        return true;
    }

    public void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            kgz.b("close.bizCode.empty", new Object[0]);
        } else {
            kha.b(new Runnable() { // from class: com.taobao.desktop.channel.desktoplinktask.widgetservice.-$$Lambda$d$hcg4k9VhhB9k5E5QYpNy51nH2LU
                {
                    d.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    d.lambda$hcg4k9VhhB9k5E5QYpNy51nH2LU(d.this, str);
                }
            });
        }
    }

    public /* synthetic */ void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        try {
            List<b> list = this.f16956a.get(str);
            if (list == null || list.size() <= 0) {
                return;
            }
            for (b bVar : list) {
                bVar.c.a("NativeClose", "", true, (j) null);
            }
        } catch (Throwable th) {
            kgz.a("FloatWindowManager.close.byBizCode.error", th);
        }
    }

    public void b(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e664c11f", new Object[]{this, bVar});
        } else if (bVar == null) {
            kgz.b("close.windowRequest.invalid", new Object[0]);
        } else if (bVar.d()) {
            kgz.b("close.windowRequest.isAlreadyClosed", new Object[0]);
        } else {
            bVar.a(true);
            f fVar = bVar.f16946a;
            if (fVar != null) {
                String str = fVar.c;
                if (StringUtils.isEmpty(str)) {
                    return;
                }
                List<b> list = this.f16956a.get(str);
                if (list != null) {
                    list.remove(bVar);
                    if (list.isEmpty()) {
                        this.f16956a.remove(str);
                    }
                }
                c(str);
                if (fVar.f != null) {
                    kgz.b("FloatWindowRequestManager.onClose.bizCode=%s", str);
                    fVar.f.b(fVar);
                    fVar.f = null;
                }
            }
            kha.b(new Runnable() { // from class: com.taobao.desktop.channel.desktoplinktask.widgetservice.-$$Lambda$d$Q1swNnJ3y_Uqg2F6AdzLn816gEw
                @Override // java.lang.Runnable
                public final void run() {
                    d.lambda$Q1swNnJ3y_Uqg2F6AdzLn816gEw(b.this);
                }
            });
        }
    }

    public static /* synthetic */ void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f44560", new Object[]{bVar});
            return;
        }
        try {
            if (bVar.b == null) {
                return;
            }
            bVar.b.c();
            bVar.b = null;
        } catch (Throwable th) {
            kgz.a("FloatWindowManager.close.byRequest.error", th);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        try {
            Intent intent = new Intent("com.taobao.desktop.float_window_close");
            intent.putExtra("bizCode", str);
            khm.a().b().sendBroadcast(intent);
            kgz.b("FloatWindowTrigger.sendFloatWindowClose.bizCode=%s", str);
        } catch (Throwable th) {
            kgz.a("FloatWindowTrigger.sendFloatWindowClose.error", th);
        }
    }
}
