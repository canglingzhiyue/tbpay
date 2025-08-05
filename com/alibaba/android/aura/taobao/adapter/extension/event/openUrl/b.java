package com.alibaba.android.aura.taobao.adapter.extension.event.openUrl;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f2201a;
    private Map<String, Object> b;

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, Intent intent);

        void b(String str, Intent intent);
    }

    static {
        kge.a(770010746);
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45904ddf", new Object[]{this, aVar});
        } else {
            this.f2201a = aVar;
        }
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6047f11f", new Object[]{this}) : this.f2201a;
    }

    public Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.b;
    }
}
