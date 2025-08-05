package com.taobao.avplayer;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public class k implements com.taobao.avplayer.common.q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DWContext f16522a;
    private FrameLayout b;
    private ImageView c;
    private DWLifecycleType d;

    static {
        kge.a(1744414932);
        kge.a(556437024);
    }

    public k(DWContext dWContext, String str) {
        this.f16522a = dWContext;
        a(str);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.b = (FrameLayout) this.f16522a.getActivity().getLayoutInflater().inflate(R.layout.dw_gif_frontcover, (ViewGroup) null);
        this.c = (ImageView) this.b.findViewById(R.id.dw_gif_frontcover_cover);
        DWContext dWContext = this.f16522a;
        if (dWContext == null || dWContext.mDWImageAdapter == null) {
            return;
        }
        this.f16522a.mDWImageAdapter.a(str, this.c);
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.avplayer.common.q
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        this.d = dWLifecycleType;
        if (this.d != DWLifecycleType.BEFORE) {
            this.b.setVisibility(8);
        } else if (!this.f16522a.isNeedFrontCover()) {
        } else {
            this.b.setVisibility(0);
        }
    }
}
