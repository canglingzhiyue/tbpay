package com.taobao.tao;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.InstantPatcher;
import com.taobao.android.ab.api.a;
import java.util.HashMap;
import tb.okh;

/* loaded from: classes.dex */
public class d extends l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public d(Application application, String str, String str2) {
        super(application, str, str2);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c.a(new Runnable() { // from class: com.taobao.tao.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        InstantPatcher.create(d.this.f20679a).applyPatch();
                    }
                }
            });
        }
    }

    @Override // com.taobao.tao.l
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a();
        a.a(this.f20679a);
        okh.a(this.f20679a, null);
        d();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("processName", TaobaoApplication.sProcessName);
            hashMap.put("startTime", Long.valueOf(TaobaoApplication.START));
            hashMap.put("version", TaobaoApplication.sAppVersion);
            com.taobao.android.tbuprofen.adapter.anr.i.a(this.f20679a, hashMap);
        } catch (Throwable unused) {
        }
    }
}
