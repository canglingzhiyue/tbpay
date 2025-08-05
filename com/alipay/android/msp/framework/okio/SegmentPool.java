package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* loaded from: classes3.dex */
public final class SegmentPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final SegmentPool f4837a = new SegmentPool();
    public long b;
    private Segment c;

    private SegmentPool() {
    }

    public final Segment a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Segment) ipChange.ipc$dispatch("3c9eb166", new Object[]{this});
        }
        synchronized (this) {
            if (this.c != null) {
                Segment segment = this.c;
                this.c = segment.d;
                segment.d = null;
                this.b -= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                return segment;
            }
            return new Segment();
        }
    }

    public final void a(Segment segment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23a80a6", new Object[]{this, segment});
        } else if (segment.d != null || segment.e != null) {
            throw new IllegalArgumentException();
        } else {
            synchronized (this) {
                if (this.b + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX > 65536) {
                    return;
                }
                this.b += ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                segment.d = this.c;
                segment.c = 0;
                segment.b = 0;
                this.c = segment;
            }
        }
    }
}
