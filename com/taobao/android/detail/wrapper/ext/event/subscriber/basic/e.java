package com.taobao.android.detail.wrapper.ext.event.subscriber.basic;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.fragment.RightListFragment;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.j;
import tb.dzh;
import tb.edy;
import tb.emu;
import tb.fcm;
import tb.kge;

/* loaded from: classes5.dex */
public class e implements j<fcm> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f11274a;
    private long b = 0;

    static {
        kge.a(-539477880);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ com.taobao.android.trade.event.i handleEvent(fcm fcmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, fcmVar}) : a(fcmVar);
    }

    public e(Activity activity) {
        this.f11274a = activity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.basic.OpenGuaranteeSubscriber");
    }

    public com.taobao.android.trade.event.i a(fcm fcmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("2e002ca7", new Object[]{this, fcmVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.b <= 500) {
            this.b = currentTimeMillis;
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        this.b = currentTimeMillis;
        if (TextUtils.isEmpty(fcmVar.f)) {
            if (this.f11274a instanceof FragmentActivity) {
                if (fcmVar.a()) {
                    RightListFragment.startFragment((FragmentActivity) this.f11274a, "服务说明", fcmVar.f27804a);
                } else {
                    RightListFragment.startFragment((FragmentActivity) this.f11274a, "服务说明", fcmVar.d);
                }
            }
        } else if ("0".equals(fcmVar.g)) {
            com.taobao.android.trade.event.f.a(this.f11274a).a(new edy(new com.taobao.android.detail.core.event.params.e(fcmVar.f, false, fcmVar.d)));
        }
        dzh.e(this.f11274a);
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
