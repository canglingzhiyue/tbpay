package com.taobao.informationflowdataservice.dataservice.utils.environment;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter;
import tb.kge;
import tb.lxh;

/* loaded from: classes7.dex */
public class a implements lxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IAppAdapter f17589a = new AppAdapter();
    private d b = new d();
    private e c = new e();
    private com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.a d = new b();

    static {
        kge.a(-1215044091);
        kge.a(68699260);
    }

    @Override // tb.lxh
    public synchronized IAppAdapter a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAppAdapter) ipChange.ipc$dispatch("a1cd858c", new Object[]{this});
        }
        return this.f17589a;
    }

    @Override // tb.lxh
    public com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.c) ipChange.ipc$dispatch("9c79a901", new Object[]{this}) : this.b;
    }

    @Override // tb.lxh
    public com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.a) ipChange.ipc$dispatch("b00ba04", new Object[]{this}) : this.d;
    }
}
