package com.taobao.taolive.uikit.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IRemoteBaseListener f22033a;
    private RemoteBusiness b;
    private IMTOPDataObject c;

    static {
        kge.a(676305864);
    }

    public a(IRemoteBaseListener iRemoteBaseListener) {
        this.f22033a = iRemoteBaseListener;
    }

    public void a(int i, IMTOPDataObject iMTOPDataObject, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658e86b0", new Object[]{this, new Integer(i), iMTOPDataObject, cls});
            return;
        }
        this.c = iMTOPDataObject;
        RemoteBusiness remoteBusiness = this.b;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("x-m-biz-live-bizcode", aw.BIZCODE_TAOBAO);
        this.b = (RemoteBusiness) RemoteBusiness.build(iMTOPDataObject).registeListener((IRemoteListener) this.f22033a).mo1338reqContext((Object) this).mo1340setBizId(59).mo1297headers((Map<String, String>) hashMap);
        this.b.startRequest(i, cls);
    }
}
