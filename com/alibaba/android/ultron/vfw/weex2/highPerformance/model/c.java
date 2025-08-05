package com.alibaba.android.ultron.vfw.weex2.highPerformance.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.p;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f2790a = false;
    private boolean b = false;
    private boolean c = false;

    static {
        kge.a(-273900346);
    }

    private c() {
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f2790a;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f2790a = z;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public static void a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{pVar});
        } else if (pVar == null) {
            UnifyLog.d("UltronTradeHybridPreRenderStatus.initStatus", "instance is null");
        } else if (b(pVar) != null) {
            UnifyLog.d("UltronTradeHybridPreRenderStatus.initStatus", "already setup status");
        } else {
            pVar.setTag("UltronTradeHybridPreRenderStatus", new c());
        }
    }

    public static c b(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("8e1ab545", new Object[]{pVar});
        }
        if (pVar == null) {
            UnifyLog.d("UltronTradeHybridPreRenderStatus.getStatus", "instance is null");
            return null;
        }
        Object tag = pVar.getTag("UltronTradeHybridPreRenderStatus");
        if (!(tag instanceof c)) {
            UnifyLog.d("UltronTradeHybridPreRenderStatus.getStatus", "invalid status");
            return null;
        }
        return (c) tag;
    }
}
