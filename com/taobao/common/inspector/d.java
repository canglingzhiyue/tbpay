package com.taobao.common.inspector;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.utils.ArtcLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import tb.kge;
import tb.kgj;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f16930a;
    private final ArrayList<Callable<kgj[]>> b = new ArrayList<>();

    static {
        kge.a(1328962629);
    }

    public d(Context context) {
        this.f16930a = context.getApplicationContext();
    }

    public d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("5b16dede", new Object[]{this});
        }
        this.b.add(new f(this.f16930a, kgj[].class, "chipset_catalog", "trtc_chipset_catalog", "config"));
        return this;
    }

    public d b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("c1ef9e9f", new Object[]{this});
        }
        this.b.add(new e(this.f16930a, kgj[].class, "trtc/chipset_catalog.json"));
        return this;
    }

    public c c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("28c85e41", new Object[]{this}) : new c(d());
    }

    private kgj[] d() {
        kgj[] kgjVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kgj[]) ipChange.ipc$dispatch("1e1c5f92", new Object[]{this});
        }
        Iterator<Callable<kgj[]>> it = this.b.iterator();
        while (it.hasNext()) {
            try {
                kgjVarArr = it.next().call();
                continue;
            } catch (Throwable unused) {
                ArtcLog.w("DeviceInspector", "configuration error", new Object[0]);
                kgjVarArr = null;
                continue;
            }
            if (kgjVarArr != null) {
                return kgjVarArr;
            }
        }
        return null;
    }
}
