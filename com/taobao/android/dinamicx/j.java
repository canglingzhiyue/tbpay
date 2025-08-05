package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bf;
import com.taobao.application.common.IApmEventListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class j implements IDXApmManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<bf.a, IApmEventListener> f11875a = new HashMap();

    @Override // com.taobao.android.dinamicx.IDXApmManager
    public void a(final bf.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e67c83", new Object[]{this, aVar});
        } else if (this.f11875a.containsKey(aVar)) {
        } else {
            IApmEventListener iApmEventListener = new IApmEventListener() { // from class: com.taobao.android.dinamicx.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IApmEventListener
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                    } else {
                        aVar.onEvent(i);
                    }
                }
            };
            this.f11875a.put(aVar, iApmEventListener);
            com.taobao.application.common.c.a(iApmEventListener);
        }
    }
}
