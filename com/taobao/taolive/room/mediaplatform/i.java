package com.taobao.taolive.room.mediaplatform;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy;
import com.taobao.taolive.room.utils.m;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class i implements IRecommendPopProxy.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.alilive.aliliveframework.frame.a f21631a;

    static {
        kge.a(-1985210226);
        kge.a(525621936);
    }

    public i(com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.f21631a = aVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy.b
    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else {
            m.a(this.f21631a, hashMap);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy.b
    public void b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d4b2a", new Object[]{this, hashMap});
        } else {
            m.b(this.f21631a, hashMap);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy.b
    public void c(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6eda09", new Object[]{this, hashMap});
        } else {
            m.c(this.f21631a, hashMap);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy.b
    public void d(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597068e8", new Object[]{this, hashMap});
        } else {
            m.d(this.f21631a, hashMap);
        }
    }
}
