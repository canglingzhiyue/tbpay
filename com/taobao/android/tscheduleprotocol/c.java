package com.taobao.android.tscheduleprotocol;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference<b> f15686a = new AtomicReference<>(null);
    private static final b b = new b() { // from class: com.taobao.android.tscheduleprotocol.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.tscheduleprotocol.b
        public int a(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("20476506", new Object[]{this, str, map})).intValue();
            }
            return 0;
        }

        @Override // com.taobao.android.tscheduleprotocol.b
        public int a(String str, Map<String, String> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ee015622", new Object[]{this, str, map, obj})).intValue();
            }
            return 0;
        }
    };

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("823bc6f4", new Object[]{bVar});
        } else if (f15686a.compareAndSet(null, bVar)) {
            Log.e("ScheduleInterceptor", "settled interceptor");
        } else {
            Log.e("ScheduleInterceptor", "already settled interceptor");
        }
    }

    public static int a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20476506", new Object[]{str, map})).intValue();
        }
        b bVar = f15686a.get();
        if (bVar == null) {
            bVar = b;
        }
        return bVar.a(str, map);
    }

    public static int a(String str, Map<String, String> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee015622", new Object[]{str, map, obj})).intValue();
        }
        b bVar = f15686a.get();
        if (bVar == null) {
            bVar = b;
        }
        return bVar.a(str, map, obj);
    }
}
