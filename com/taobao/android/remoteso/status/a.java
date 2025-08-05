package com.taobao.android.remoteso.status;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.ikw;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<InterfaceC0565a> f14843a = new CopyOnWriteArraySet();

    /* renamed from: com.taobao.android.remoteso.status.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC0565a {
        String a();

        void a(int i);
    }

    public void a(InterfaceC0565a interfaceC0565a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd2739c", new Object[]{this, interfaceC0565a});
            return;
        }
        RSoLog.c("progress-> registerListener = " + interfaceC0565a);
        this.f14843a.add(interfaceC0565a);
    }

    public void b(InterfaceC0565a interfaceC0565a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e773361d", new Object[]{this, interfaceC0565a});
            return;
        }
        RSoLog.c("progress-> unregisterListener = " + interfaceC0565a);
        this.f14843a.remove(interfaceC0565a);
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        for (InterfaceC0565a interfaceC0565a : this.f14843a) {
            if (ikw.a((CharSequence) str, (CharSequence) interfaceC0565a.a())) {
                RSoLog.c("progress-> onUpdate, module=" + str + ", updateCallback=" + interfaceC0565a);
                interfaceC0565a.a(i);
            }
        }
    }
}
