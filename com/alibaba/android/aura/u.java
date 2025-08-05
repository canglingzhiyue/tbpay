package com.alibaba.android.aura;

import com.alibaba.android.aura.nodemodel.subscriberelation.AURASubscribeRelationModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE_FORWARD = "forward2Service";

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, AURASubscribeRelationModel> f2215a;
    private final Map<String, a> b;

    /* loaded from: classes2.dex */
    public interface a {
    }

    static {
        kge.a(-1201927500);
        kge.a(-1807957);
    }

    public u(Map<String, AURASubscribeRelationModel> map) {
        if (map == null) {
            this.f2215a = new HashMap();
        } else {
            this.f2215a = map;
        }
        this.b = new ConcurrentHashMap();
        a(ACTION_TYPE_FORWARD);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AURASubscribeRelationModel aURASubscribeRelationModel : this.f2215a.values()) {
            if (str.equals(aURASubscribeRelationModel.actionType)) {
                arrayList.add(aURASubscribeRelationModel.dest);
            }
        }
    }

    public void a(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b4c384", new Object[]{this, str, str2, aVar});
            return;
        }
        synchronized (this) {
            this.b.put(str + "#" + str2, aVar);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce29bd70", new Object[]{this, aVar});
            return;
        }
        synchronized (this) {
            String str = null;
            Iterator<Map.Entry<String, a>> it = this.b.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, a> next = it.next();
                if (next.getValue() == aVar) {
                    str = next.getKey();
                    break;
                }
            }
            if (str != null) {
                this.b.remove(str);
            }
        }
    }
}
