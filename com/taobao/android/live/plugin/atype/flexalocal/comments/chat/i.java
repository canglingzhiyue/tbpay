package com.taobao.android.live.plugin.atype.flexalocal.comments.chat;

import android.animation.ValueAnimator;
import android.os.CountDownTimer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import tb.kge;

/* loaded from: classes5.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DXRootView f13620a;
    public boolean c;
    public CountDownTimer e;
    public CountDownTimer f;
    public ValueAnimator g;
    public int b = -2;
    public boolean d = true;

    static {
        kge.a(354431995);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        CountDownTimer countDownTimer = this.f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = this.e;
        if (countDownTimer2 == null) {
            return;
        }
        countDownTimer2.cancel();
    }
}
