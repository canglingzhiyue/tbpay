package com.taobao.pha.tb;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.pha.core.p;
import tb.kge;

/* loaded from: classes.dex */
public class g implements Nav.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f18816a;
    private final e b = new e();

    static {
        kge.a(699125813);
        kge.a(-234059470);
        f18816a = g.class.getSimpleName();
    }

    @Override // com.taobao.android.nav.Nav.h
    public boolean beforeNavTo(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
        }
        if (intent != null) {
            try {
                if (p.d() && (data = intent.getData()) != null && data.isHierarchical() && this.b.a(data)) {
                    this.b.process(intent, null);
                }
            } catch (Exception e) {
                Log.e(f18816a, "beforeNavTo exception:", e);
            }
        }
        return true;
    }
}
