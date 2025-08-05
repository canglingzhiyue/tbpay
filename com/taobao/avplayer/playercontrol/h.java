package com.taobao.avplayer.playercontrol;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.kcl;
import tb.kge;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f16574a;

    static {
        kge.a(2007755814);
    }

    public static /* synthetic */ ViewGroup a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("ba9cb04b", new Object[]{hVar}) : hVar.f16574a;
    }

    public h(ViewGroup viewGroup) {
        this.f16574a = viewGroup;
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_DWToastContainer);
    }

    public void a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123a1ce", new Object[]{this, str, new Float(f)});
            return;
        }
        final View inflate = LayoutInflater.from(this.f16574a.getContext()).inflate(R.layout.dw_toast, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = f == 0.0f ? kcl.a(this.f16574a.getContext(), 20.0f) : kcl.a(this.f16574a.getContext(), f);
        this.f16574a.addView(inflate, layoutParams);
        ((TextView) inflate.findViewById(R.id.dw_toast_tv)).setText(str);
        inflate.setVisibility(0);
        inflate.bringToFront();
        inflate.postDelayed(new Runnable() { // from class: com.taobao.avplayer.playercontrol.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    h.a(h.this).removeView(inflate);
                }
            }
        }, 3000L);
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (this.f16574a == null || view == null) {
        } else {
            this.f16574a.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
