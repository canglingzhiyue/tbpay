package com.taobao.android.sku.bizevent;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.android.ultron.event.p;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cag;
import tb.iyb;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "dismissAndOpenUrl";
    private iyb b;
    private Handler l = new Handler(Looper.getMainLooper());

    static {
        kge.a(-1280706658);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == -1814481661) {
            super.a((com.alibaba.android.ultron.event.base.e) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(c cVar, com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d85ff2", new Object[]{cVar, eVar});
        } else {
            cVar.d(eVar);
        }
    }

    public c(iyb iybVar) {
        this.b = iybVar;
    }

    private void d(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else {
            super.a(eVar);
        }
    }

    @Override // com.alibaba.android.ultron.event.p, com.alibaba.android.ultron.event.q
    public void a(final com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        String e = e();
        if (e == null || !e.startsWith(cag.PAGE_SCHEME)) {
            z = false;
        }
        if (!z) {
            d(eVar);
        } else {
            this.l.postDelayed(new Runnable() { // from class: com.taobao.android.sku.bizevent.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.a(c.this, eVar);
                    }
                }
            }, 20L);
        }
        if (this.b == null || TextUtils.isEmpty(e)) {
            return;
        }
        this.b.a();
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (b() != null && b().getFields() != null) {
            return b().getFields().getString("url");
        }
        return null;
    }
}
