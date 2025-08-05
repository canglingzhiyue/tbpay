package com.taobao.trtc.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.utils.TrtcLog;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f23105a = new HashMap();

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public TrtcInnerDefines.CallState f23106a = TrtcInnerDefines.CallState.E_CALL_IDLE;
        public TrtcDefines.TrtcUserRole b = TrtcDefines.TrtcUserRole.E_ROLE_NONE;

        static {
            kge.a(1085865410);
        }
    }

    static {
        kge.a(-1933399486);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TrtcLog.d("TrtcCall", "clear call node, " + this.f23105a);
        this.f23105a.clear();
    }

    public a a(String str, TrtcDefines.TrtcUserRole trtcUserRole) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("435dfb2f", new Object[]{this, str, trtcUserRole});
        }
        if (this.f23105a.get(str) != null) {
            TrtcLog.a("TrtcCall", "call node exist, uid: " + str);
            return null;
        }
        TrtcLog.d("TrtcCall", "new call node, id: " + str);
        a aVar = new a();
        aVar.b = trtcUserRole;
        this.f23105a.put(str, aVar);
        return aVar;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        TrtcLog.d("TrtcCall", "remove call node, remote id: " + str);
        this.f23105a.remove(str);
    }

    public void a(String str, TrtcInnerDefines.CallState callState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c55ea51", new Object[]{this, str, callState});
            return;
        }
        a aVar = this.f23105a.get(str);
        if (aVar == null) {
            return;
        }
        TrtcLog.d("TrtcCall", "update call node state " + aVar.f23106a + " -> " + callState);
        aVar.f23106a = callState;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        TrtcLog.d("TrtcCall", "isInCall: " + str);
        a aVar = this.f23105a.get(str);
        return aVar != null && aVar.f23106a == TrtcInnerDefines.CallState.E_CALL_SETUP;
    }

    public int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{this, str})).intValue();
        }
        TrtcLog.d("TrtcCall", "getUserRole userId: " + str);
        a aVar = this.f23105a.get(str);
        if (aVar == null) {
            return 0;
        }
        return aVar.b.ordinal();
    }
}
