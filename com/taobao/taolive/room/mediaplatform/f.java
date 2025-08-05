package com.taobao.taolive.room.mediaplatform;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ai;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.qmp;

/* loaded from: classes8.dex */
public class f implements qmp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.alilive.aliliveframework.frame.a f21630a;

    static {
        kge.a(1058127886);
        kge.a(1262784915);
    }

    public f(com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.f21630a = aVar;
    }

    @Override // tb.qmp
    public void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{this, str, strArr});
        } else {
            ai.a(this.f21630a, str, strArr);
        }
    }

    @Override // tb.qmp
    public void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
        } else {
            ai.a(this.f21630a, str, str2, map);
        }
    }

    @Override // tb.qmp
    public void a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202a441", new Object[]{this, str, hashMap});
        } else {
            ai.a(this.f21630a, str, hashMap);
        }
    }

    @Override // tb.qmp
    public void a(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a507bab7", new Object[]{this, str, str2, hashMap});
        } else {
            ai.a(this.f21630a, str, str2, (String) null, hashMap);
        }
    }

    @Override // tb.qmp
    public void a(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c673040", new Object[]{this, new Integer(i), str, map});
        } else {
            ai.a(i, str, map);
        }
    }
}
