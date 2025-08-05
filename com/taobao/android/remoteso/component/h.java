package com.taobao.android.remoteso.component;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.status.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.ihp;
import tb.ihq;
import tb.ihs;
import tb.iht;
import tb.ihw;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface a extends ihs {
        void b(int i);
    }

    public static /* synthetic */ void a(h hVar, j jVar, com.taobao.android.remoteso.component.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d2ae6", new Object[]{hVar, jVar, aVar});
        } else {
            hVar.a(jVar, aVar);
        }
    }

    public List<String> a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d4e0080c", new Object[]{this, jVar});
        }
        List<String> a2 = jVar.a("rso");
        if (a2.isEmpty()) {
            return Collections.emptyList();
        }
        iht a3 = ihq.b().a(a2);
        if (!a3.b()) {
            List<String> a4 = a(a3.a());
            RSoLog.c("remo,RSoOperator,check, rso operator exit, failure = " + a4);
            return a4;
        }
        return Collections.emptyList();
    }

    public static List<String> a(List<ihw> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        ArrayList arrayList = new ArrayList();
        for (ihw ihwVar : list) {
            arrayList.add(ihwVar.a());
        }
        return arrayList;
    }

    public void a(final j jVar, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4944bead", new Object[]{this, jVar, aVar});
            return;
        }
        List<String> a2 = jVar.a("rso");
        if (a2.isEmpty()) {
            RSoLog.c("remo,RSoOperator, install skip, no module need install");
            return;
        }
        final b bVar = new b(a2.get(0), aVar);
        a(jVar, new com.taobao.android.remoteso.component.a<com.taobao.android.remoteso.status.a>() { // from class: com.taobao.android.remoteso.component.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.remoteso.component.a
            public void a(com.taobao.android.remoteso.status.a aVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a7e805b9", new Object[]{this, aVar2});
                } else {
                    aVar2.a(bVar);
                }
            }
        });
        ihq.b().a(a2, new ihs() { // from class: com.taobao.android.remoteso.component.h.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ihs
            public void a(iht ihtVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("edb10f83", new Object[]{this, ihtVar});
                    return;
                }
                aVar.a(ihtVar);
                h.a(h.this, jVar, new com.taobao.android.remoteso.component.a<com.taobao.android.remoteso.status.a>() { // from class: com.taobao.android.remoteso.component.h.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.remoteso.component.a
                    public void a(com.taobao.android.remoteso.status.a aVar2) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("a7e805b9", new Object[]{this, aVar2});
                        } else {
                            aVar2.b(bVar);
                        }
                    }
                });
            }
        });
    }

    private void a(j jVar, com.taobao.android.remoteso.component.a<com.taobao.android.remoteso.status.a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e0b271", new Object[]{this, jVar, aVar});
        } else {
            aVar.a(ihp.by_().c());
        }
    }

    /* loaded from: classes6.dex */
    public static class b implements a.InterfaceC0565a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f14796a;
        private final a b;

        public b(String str, a aVar) {
            this.f14796a = str;
            this.b = aVar;
        }

        @Override // com.taobao.android.remoteso.status.a.InterfaceC0565a
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f14796a;
        }

        @Override // com.taobao.android.remoteso.status.a.InterfaceC0565a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.b.b(i);
            }
        }
    }
}
