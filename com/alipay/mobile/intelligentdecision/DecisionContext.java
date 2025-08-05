package com.alipay.mobile.intelligentdecision;

import android.content.Context;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DecisionContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile DecisionContext b;

    /* renamed from: a  reason: collision with root package name */
    private Context f5715a;
    private String c;

    private DecisionContext() {
    }

    public static DecisionContext getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecisionContext) ipChange.ipc$dispatch("9fb05722", new Object[0]);
        }
        if (b == null) {
            synchronized (DecisionContext.class) {
                if (b == null) {
                    b = new DecisionContext();
                }
            }
        }
        return b;
    }

    public void attachContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff7db7", new Object[]{this, context});
        } else {
            this.f5715a = context;
        }
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.f5715a;
    }

    public String getCurrentUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae6810c", new Object[]{this});
        }
        DecisionLogcat.b("DecisionContext", "get uid:" + this.c);
        return this.c;
    }

    public void setCurrentUid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d327ea", new Object[]{this, str});
            return;
        }
        this.c = str;
        DecisionLogcat.b("DecisionContext", "setCurrentUid uid:" + str);
    }
}
