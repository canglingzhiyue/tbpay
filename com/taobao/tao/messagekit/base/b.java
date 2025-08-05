package com.taobao.tao.messagekit.base;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.Command;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import tao.reactivex.f.k;
import tb.boa;
import tb.jew;
import tb.jgn;
import tb.jrg;
import tb.kge;
import tb.olv;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SparseArray<olv> f20748a = new SparseArray<>();
    private jew<Command> b = new jew<Command>() { // from class: com.taobao.tao.messagekit.base.b.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void a(Command command) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae1825c2", new Object[]{this, command});
                return;
            }
            olv olvVar = (olv) b.a(b.this).get(command.header.g);
            if (olvVar != null) {
                olvVar.a(command);
            }
            MsgLog.b("CommandManager", "command:", command.header.f31524a, "subType:", Integer.valueOf(command.header.g));
        }

        @Override // tb.jew
        public /* synthetic */ void accept(Command command) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b028bfab", new Object[]{this, command});
            } else {
                a(command);
            }
        }
    };

    static {
        kge.a(1052502496);
    }

    public static /* synthetic */ SparseArray a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseArray) ipChange.ipc$dispatch("f9b02fc6", new Object[]{bVar}) : bVar.f20748a;
    }

    public olv a(int i) {
        IpChange ipChange = $ipChange;
        return (olv) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("e665a772", new Object[]{this, new Integer(i)}) : this.f20748a.get(i));
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MsgLog.b("CommandManager", boa.TAG);
        d.a().d().a().a(new jrg<com.taobao.tao.messagekit.core.model.b>() { // from class: com.taobao.tao.messagekit.base.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public boolean a(com.taobao.tao.messagekit.core.model.b bVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("da6724ef", new Object[]{this, bVar})).booleanValue() : bVar.f20780a instanceof Command;
            }

            @Override // tb.jrg
            public /* synthetic */ boolean test(com.taobao.tao.messagekit.core.model.b bVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("5a0eabb9", new Object[]{this, bVar})).booleanValue() : a(bVar);
            }
        }).a(new jgn<com.taobao.tao.messagekit.core.model.b, Command>() { // from class: com.taobao.tao.messagekit.base.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public Command a(com.taobao.tao.messagekit.core.model.b bVar) {
                IpChange ipChange2 = $ipChange;
                return (Command) (ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("89f618a5", new Object[]{this, bVar}) : bVar.f20780a);
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.tao.messagekit.core.model.Command, java.lang.Object] */
            @Override // tb.jgn
            public /* synthetic */ Command apply(com.taobao.tao.messagekit.core.model.b bVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("7a74adc1", new Object[]{this, bVar}) : a(bVar);
            }
        }).a(k.a()).a(this.b);
    }

    public void a(int i, olv olvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c67ae32", new Object[]{this, new Integer(i), olvVar});
        } else {
            this.f20748a.put(i, olvVar);
        }
    }
}
