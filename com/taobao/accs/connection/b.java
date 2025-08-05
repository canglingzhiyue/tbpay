package com.taobao.accs.connection;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.utl.ALog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile IConnection b;
    public volatile boolean c;

    static {
        kge.a(410615280);
    }

    public abstract IConnection a(String str, AccsClientConfig accsClientConfig);

    public abstract List<IConnection> a();

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        }
    }

    public abstract boolean d();

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ALog.e("ConnectionService", DMComponent.RESET, new Object[0]);
        this.b = null;
    }
}
