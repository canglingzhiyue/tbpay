package com.taobao.taolive.sdk.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.i;
import com.taobao.taolive.sdk.utils.n;
import java.util.HashMap;
import java.util.LinkedList;
import tb.kge;

/* loaded from: classes8.dex */
public class g implements i.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static g f21854a;
    private HashMap<String, LinkedList<h>> b = new HashMap<>();
    private HashMap<String, i> c = new HashMap<>();

    static {
        kge.a(2123451988);
        kge.a(667421175);
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("d7542705", new Object[0]);
        }
        if (f21854a == null) {
            f21854a = new g();
        }
        return f21854a;
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afab505e", new Object[]{this, hVar});
        } else if (hVar == null || !hVar.c()) {
            a("handleSubscribeTask task isNotLegal");
        } else {
            a("handleSubscribeTask init task: " + hVar);
            i iVar = this.c.get(hVar.b());
            if (iVar == null) {
                c(hVar);
                return;
            }
            a("handleSubscribeTask messageServiceTransaction = " + iVar);
            if (hVar.i().equals(iVar.e())) {
                a("handleSubscribeTask error -  pmSession equal error call");
                return;
            }
            switch (iVar.c()) {
                case 10:
                case 12:
                    a("handleSubscribeTask addTaskQueue");
                    d(hVar);
                    return;
                case 11:
                    a("handleSubscribeTask directExecuteUnSubscribeTask");
                    a(iVar, new l(iVar));
                    d(hVar);
                    return;
                default:
                    return;
            }
        }
    }

    public void b(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c35323df", new Object[]{this, hVar});
        } else if (hVar == null || !hVar.c()) {
            a("handleUnSubscribeTask task isNotLegal");
        } else {
            a("handleUnSubscribeTask init task: " + hVar);
            i iVar = this.c.get(hVar.b());
            if (iVar == null) {
                a("handleUnSubscribeTask error - drop task messageServiceTransaction = null");
                return;
            }
            a("handleUnSubscribeTask messageServiceTransaction = " + iVar);
            if (hVar.i().equals(iVar.e())) {
                switch (iVar.c()) {
                    case 10:
                        a("handleUnSubscribeTask addTaskQueue");
                        d(hVar);
                        return;
                    case 11:
                        a("handleUnSubscribeTask directExecute");
                        a(iVar, hVar);
                        return;
                    case 12:
                        a("handleUnSubscribeTask error -  drop task error call");
                        return;
                    default:
                        return;
                }
            }
            a("handleUnSubscribeTask drop task pmSession not equal");
        }
    }

    @Override // com.taobao.taolive.sdk.model.i.a
    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afabc4bd", new Object[]{this, iVar});
        } else if (iVar == null || !iVar.m()) {
            a("onEnterSuccess messageServiceTransaction isNotLegal");
        } else {
            c(iVar);
            e(iVar);
        }
    }

    @Override // com.taobao.taolive.sdk.model.i.a
    public void a(int i, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dff5ff0", new Object[]{this, new Integer(i), iVar});
        } else if (iVar == null || !iVar.m()) {
            a("onEnterSuccess messageServiceTransaction isNotLegal");
        } else {
            d(iVar);
            e(iVar);
        }
    }

    @Override // com.taobao.taolive.sdk.model.i.a
    public void b(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c353983e", new Object[]{this, iVar});
        } else if (iVar == null || !iVar.m()) {
            a("onEnterSuccess messageServiceTransaction isNotLegal");
        } else {
            a(iVar, true);
            e(iVar);
        }
    }

    @Override // com.taobao.taolive.sdk.model.i.a
    public void b(int i, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f51fc8f", new Object[]{this, new Integer(i), iVar});
        } else if (iVar == null || !iVar.m()) {
            a("onEnterSuccess messageServiceTransaction isNotLegal");
        } else {
            a(iVar, false);
            e(iVar);
        }
    }

    private void c(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6faf760", new Object[]{this, hVar});
            return;
        }
        i iVar = new i(hVar);
        iVar.a();
        iVar.a(10);
        iVar.a(this);
        this.c.put(hVar.b(), iVar);
    }

    private void a(i iVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2c14b3", new Object[]{this, iVar, hVar});
            return;
        }
        iVar.b();
        iVar.a(12);
    }

    private void d(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa2cae1", new Object[]{this, hVar});
        } else if (hVar == null || !hVar.c()) {
            a("addTaskQueue task isNotLegal");
        } else {
            a("addTaskQueue task：" + hVar);
            LinkedList<h> linkedList = this.b.get(hVar.b());
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                this.b.put(hVar.b(), linkedList);
            }
            linkedList.addLast(hVar);
        }
    }

    private void c(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6fb6bbf", new Object[]{this, iVar});
        } else if (iVar == null || !iVar.m()) {
            a("changeStateOnEnterSuccess messageServiceTransaction isNotLegal");
        } else {
            i iVar2 = this.c.get(iVar.d());
            if (iVar2 == null) {
                a("changeStateOnEnterSuccess error - cant find targetMessageServiceTransaction");
                return;
            }
            a("changeStateOnEnterSuccess messageServiceTransaction = " + iVar2);
            if (!iVar.e().equals(iVar2.e())) {
                a("changeStateOnEnterSuccess error - pmSession not equal");
                return;
            }
            switch (iVar2.c()) {
                case 10:
                    a("changeStateOnEnterSuccess changeState SUBSCRIBED");
                    iVar2.a(11);
                    return;
                case 11:
                case 12:
                    a("changeStateOnEnterSuccess error - state err");
                    return;
                default:
                    return;
            }
        }
    }

    private void d(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa33f40", new Object[]{this, iVar});
        } else if (iVar == null || !iVar.m()) {
            a("changeStateOnEnterSuccess messageServiceTransaction isNotLegal");
        } else {
            i iVar2 = this.c.get(iVar.d());
            if (iVar2 == null) {
                a("changeStateOnEnterFail error - cant find targetMessageServiceTransaction");
                return;
            }
            a("changeStateOnEnterFail messageServiceTransaction = " + iVar2);
            if (!iVar.e().equals(iVar2.e())) {
                a("changeStateOnEnterFail error - pmSession not equal");
                return;
            }
            switch (iVar2.c()) {
                case 10:
                    iVar2.a(101);
                    a("changeStateOnEnterSuccess remove");
                    this.c.remove(iVar2.d());
                    return;
                case 11:
                case 12:
                    a("changeStateOnEnterSuccess error - state err");
                    return;
                default:
                    return;
            }
        }
    }

    private void a(i iVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45cd85b7", new Object[]{this, iVar, new Boolean(z)});
        } else if (iVar == null || !iVar.m()) {
            a("changeStateOnLeave messageServiceTransaction isNotLegal");
        } else {
            i iVar2 = this.c.get(iVar.d());
            if (iVar2 == null) {
                a("changeStateOnLeave error - cant find targetMessageServiceTransaction");
                return;
            }
            a("changeStateOnLeave messageServiceTransaction = " + iVar2);
            if (!iVar.e().equals(iVar2.e())) {
                a("changeStateOnLeave error - pmSession not equal");
                return;
            }
            switch (iVar2.c()) {
                case 10:
                case 11:
                    a("changeStateOnLeave error - state err");
                    return;
                case 12:
                    iVar2.a(z ? 102 : 103);
                    a("changeStateOnLeave remove");
                    this.c.remove(iVar2.d());
                    return;
                default:
                    return;
            }
        }
    }

    private void e(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe4b12c1", new Object[]{this, iVar});
        } else if (iVar == null || !iVar.m()) {
            a("executeNextTask messageServiceTransaction isNotLegal");
        } else {
            a("executeNextTask callbackServiceTransaction = " + iVar);
            LinkedList<h> linkedList = this.b.get(iVar.d());
            if (linkedList == null) {
                a("executeNextTask queue == null");
                return;
            }
            h removeFirst = linkedList.removeFirst();
            if (removeFirst != null) {
                if (removeFirst.a()) {
                    a(removeFirst);
                } else {
                    b(removeFirst);
                }
            }
            if (!linkedList.isEmpty()) {
                return;
            }
            a("executeNextTask queue.isEmpty remove queue");
            this.b.remove(iVar.d());
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String str2 = k.TAG;
        n.a(str2, "MessageServiceQueue-" + str);
    }
}
