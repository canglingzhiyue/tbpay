package com.taobao.tao.flexbox.layoutmanager.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import tb.kge;
import tb.oec;

/* loaded from: classes8.dex */
public class t implements ab.e, s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, LinkedList<s>> f20362a = new HashMap<>();
    private boolean b = false;

    static {
        kge.a(2053906375);
        kge.a(-1420926486);
        kge.a(-715605592);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(aa aaVar, aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.e
    public void a(String str, final s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca01c743", new Object[]{this, str, sVar});
            return;
        }
        final LinkedList<s> linkedList = this.f20362a.get(str);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.f20362a.put(str, linkedList);
        }
        if (this.b) {
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.t.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (linkedList.contains(sVar)) {
                    } else {
                        linkedList.add(sVar);
                    }
                }
            });
        } else if (linkedList.contains(sVar)) {
        } else {
            linkedList.add(sVar);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.e
    public void b(String str, final s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666fc3a2", new Object[]{this, str, sVar});
            return;
        }
        final LinkedList<s> linkedList = this.f20362a.get(str);
        if (linkedList == null) {
            return;
        }
        if (this.b) {
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.t.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        linkedList.remove(sVar);
                    }
                }
            });
        } else {
            linkedList.remove(sVar);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        LinkedList<s> linkedList = this.f20362a.get(eVar.c);
        if (linkedList != null) {
            this.b = true;
            Iterator<s> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().onHandleMessage(eVar);
            }
            this.b = false;
        }
        return false;
    }
}
