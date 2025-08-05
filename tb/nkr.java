package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.i;
import com.taobao.android.ucp.bridge.NativeDelegate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class nkr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SWITCH_NAME = "enableUCPActionOpt";

    /* renamed from: a  reason: collision with root package name */
    private static final List<i.a> f31536a;
    private static final AtomicBoolean b;

    /* loaded from: classes4.dex */
    public static class a {
        public static final boolean sSwitchOpen;

        static {
            kge.a(1047398428);
            sSwitchOpen = dro.b(nkr.SWITCH_NAME);
        }
    }

    static {
        kge.a(-575734851);
        f31536a = new CopyOnWriteArrayList();
        b = new AtomicBoolean(false);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else if (!a.sSwitchOpen) {
        } else {
            if (b.compareAndSet(false, true)) {
                a();
            }
            i.a(new i.a() { // from class: tb.nkr.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.behavix.utils.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        NativeDelegate.fetchColdStartData();
                    }
                }
            });
        }
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        ArrayList<i.a> arrayList = new ArrayList(f31536a);
        f31536a.clear();
        for (i.a aVar : arrayList) {
            i.a(aVar);
        }
    }

    public static void a(i.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0338e41", new Object[]{aVar});
        } else if (!a.sSwitchOpen) {
            aVar.run();
        } else if (b.get()) {
            aVar.run();
        } else {
            f31536a.add(aVar);
        }
    }
}
