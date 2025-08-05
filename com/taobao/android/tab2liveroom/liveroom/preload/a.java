package com.taobao.android.tab2liveroom.liveroom.preload;

import android.os.CountDownTimer;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends CountDownTimer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private InterfaceC0587a f15303a;

    /* renamed from: com.taobao.android.tab2liveroom.liveroom.preload.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC0587a {
        void onFinish();
    }

    static {
        kge.a(1402618614);
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
        }
    }

    public a(long j) {
        super(j, j / 60);
    }

    public void a(InterfaceC0587a interfaceC0587a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807eec8f", new Object[]{this, interfaceC0587a});
        } else {
            this.f15303a = interfaceC0587a;
        }
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
            return;
        }
        InterfaceC0587a interfaceC0587a = this.f15303a;
        if (interfaceC0587a == null) {
            return;
        }
        interfaceC0587a.onFinish();
    }
}
