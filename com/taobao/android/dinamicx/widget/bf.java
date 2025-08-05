package com.taobao.android.dinamicx.widget;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.gay;
import tb.kge;

/* loaded from: classes5.dex */
public interface bf extends am {
    void a(Context context, String str, a aVar, gay.b bVar);

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, String> f12079a;

        static {
            kge.a(543495557);
        }

        public void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else {
                this.f12079a = map;
            }
        }
    }
}
