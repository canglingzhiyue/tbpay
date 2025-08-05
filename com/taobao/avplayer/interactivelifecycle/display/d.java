package com.taobao.avplayer.interactivelifecycle.display;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.bd;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.AVSDKLog;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DWContext f16516a;
    private FrameLayout b;

    static {
        kge.a(-1092083898);
    }

    public d(DWContext dWContext) {
        this.f16516a = dWContext;
        this.b = new FrameLayout(this.f16516a.getActivity());
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18835af", new Object[]{this, view, layoutParams});
            return;
        }
        bd ictAddWeexCallback = this.f16516a.getIctAddWeexCallback();
        if (ictAddWeexCallback == null) {
            this.b.addView(view, layoutParams);
            return;
        }
        String str = (String) view.getTag(R.id.weex_view_source);
        String str2 = (String) view.getTag(R.id.target_screen_type);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = "";
            str2 = str;
        }
        if (ictAddWeexCallback.a(view, str, str2) || view == null) {
            return;
        }
        try {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
        } catch (Throwable th) {
            AVSDKLog.e("DWInteractiveView", th.toString());
        }
        if (view.getParent() != null) {
            return;
        }
        this.b.addView(view, layoutParams);
    }

    public void b(View view, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff47adb0", new Object[]{this, view, layoutParams});
        } else {
            this.b.addView(view, layoutParams);
        }
    }
}
