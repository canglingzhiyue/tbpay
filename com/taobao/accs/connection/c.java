package com.taobao.accs.connection;

import anet.channel.AwcnConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import java.util.Arrays;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class c extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1504548780);
    }

    @Override // com.taobao.accs.connection.b
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.accs.connection.b
    public IConnection a(String str, AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConnection) ipChange.ipc$dispatch("82d6b9ed", new Object[]{this, str, accsClientConfig});
        }
        AwcnConfig.setAccsSessionCreateForbiddenInBg(false);
        if (this.b == null) {
            this.b = new ConnectionWrapper(str);
        }
        return this.b;
    }

    @Override // com.taobao.accs.connection.b
    public List<IConnection> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        if (this.b != null) {
            return Arrays.asList(this.b);
        }
        return null;
    }
}
