package com.tmall.android.dai.model;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DAIModelTriggerType f23720a;
    private e b;
    private String c = null;

    static {
        kge.a(-826202947);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public DAIModelTriggerType b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DAIModelTriggerType) ipChange.ipc$dispatch("63d75b63", new Object[]{this}) : this.f23720a;
    }

    public void a(DAIModelTriggerType dAIModelTriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e273962", new Object[]{this, dAIModelTriggerType});
        } else {
            this.f23720a = dAIModelTriggerType;
        }
    }

    public e c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("dc5aefb4", new Object[]{this}) : this.b;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec040272", new Object[]{this, eVar});
        } else {
            this.b = eVar;
        }
    }
}
