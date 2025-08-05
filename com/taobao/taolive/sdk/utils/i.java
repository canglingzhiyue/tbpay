package com.taobao.taolive.sdk.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f21966a = -1.0f;
    private float b = -1.0f;
    private a c;

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(int i, int i2);
    }

    static {
        kge.a(-24176070);
    }

    public i(a aVar) {
        this.c = aVar;
    }

    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.f21966a = f;
        this.b = f2;
    }

    public void b(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f625a9", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        if (this.f21966a == -1.0f) {
            this.f21966a = f;
        }
        if (this.b == -1.0f) {
            this.b = f2;
        }
        a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.a((int) (f - this.f21966a), (int) (f2 - this.b));
    }

    public boolean c(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5dc60ee", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
        a();
        return false;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f21966a = -1.0f;
        this.b = -1.0f;
    }
}
