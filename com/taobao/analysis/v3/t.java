package com.taobao.analysis.v3;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import java.util.List;
import java.util.Map;
import tb.mzp;

/* loaded from: classes.dex */
public class t extends a implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALL_BACK = "cb";
    public static final String CALL_BACK_DISPATCH = "cbDispatch";
    public static final String REQUEST_PROCESS = "reqProcess";
    public static final String REQUEST_SEND = "reqSend";
    public static final String REQUEST_START = "reqStart";
    public static final String RESPONSE_PROCESS = "resProcess";
    public static final String RESPONSE_RECEIVE = "resReceive";
    public static final String SERVER_RT = "serverRT";

    public t(v vVar, String str, String str2, long j, Map<String, Object> map, List<mzp> list) {
        super(vVar, str, str2, j, map, list, FalcoSpanLayer.NETWORK_ABILITY);
        LAUNCH_TYPE.a(this, Integer.valueOf(SceneIdentifier.getStartType()));
    }

    @Override // com.taobao.analysis.v3.k
    public void a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed6d4a7", new Object[]{this, l});
        } else {
            e(REQUEST_START).a(l);
        }
    }

    @Override // com.taobao.analysis.v3.k
    public void c(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7808bfa9", new Object[]{this, l});
            return;
        }
        b_(l);
        e(REQUEST_SEND).a(l);
    }

    @Override // com.taobao.analysis.v3.k
    public void b(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6fca28", new Object[]{this, l});
            return;
        }
        b_(l);
        e(REQUEST_PROCESS).a(l);
    }

    @Override // com.taobao.analysis.v3.k
    public void d(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a1b52a", new Object[]{this, l});
            return;
        }
        b_(l);
        e(RESPONSE_RECEIVE).a(l);
    }

    @Override // com.taobao.analysis.v3.k
    public void e(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("913aaaab", new Object[]{this, l});
            return;
        }
        b_(l);
        e(RESPONSE_RECEIVE).b(l);
    }

    @Override // com.taobao.analysis.v3.k
    public void f(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dd3a02c", new Object[]{this, l});
            return;
        }
        b_(l);
        e(RESPONSE_PROCESS).a(l);
    }

    @Override // com.taobao.analysis.v3.k
    public void g(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6c95ad", new Object[]{this, l});
            return;
        }
        b_(l);
        e(CALL_BACK_DISPATCH).a(l);
    }

    @Override // com.taobao.analysis.v3.k
    public void h(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7058b2e", new Object[]{this, l});
            return;
        }
        b_(l);
        e(CALL_BACK).a(l);
    }

    @Override // com.taobao.analysis.v3.k
    public void i(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39e80af", new Object[]{this, l});
        } else {
            e(CALL_BACK).b(l);
        }
    }

    @Override // com.taobao.analysis.v3.k
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (j <= 0) {
        } else {
            long n = n();
            q e = e("serverRT");
            e.a(Long.valueOf(n - j));
            e.b(Long.valueOf(n));
        }
    }
}
