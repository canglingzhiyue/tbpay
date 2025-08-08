package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class T {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3275a = "MNNRTManager";
    public static T b;
    public Context c;
    public String d;

    public static synchronized T a() {
        synchronized (T.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("30a07e30", new Object[0]);
            }
            if (b == null) {
                b = new T();
            }
            return b;
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!Kb.b().l()) {
        } else {
            if (this.c == null) {
                Logging.e(f3275a, "context is null");
            } else if (StringUtils.isEmpty(this.d)) {
                Logging.e(f3275a, "ttid is null");
            } else {
                com.taobao.mrt.f.a().a(new Q(this));
                C1249t.a(new S(this));
            }
        }
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        this.c = context;
        this.d = str;
    }
}
