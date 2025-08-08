package com.taobao.android.gateway.msgcenter;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, a> f12705a = new HashMap();

    static {
        kge.a(-614608923);
    }

    public void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43817ef7", new Object[]{this, str, aVar});
            return;
        }
        synchronized (b.class) {
            this.f12705a.put(str, aVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        synchronized (b.class) {
            this.f12705a.clear();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a();
        }
    }

    public boolean a(Message message) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1be9bf6b", new Object[]{this, message})).booleanValue();
        }
        if (message == null || StringUtils.isEmpty(message.getChannelId()) || (aVar = this.f12705a.get(message.getChannelId())) == null) {
            return false;
        }
        aVar.a(message);
        return true;
    }
}
