package com.taobao.cameralink.manager;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.cameralink.manager.interfaces.ICLLifeListener;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f16886a = -1;
    private FrameLayout b;
    private Activity c;
    private Context d;
    private ICLLifeListener e;

    static {
        kge.a(1147021529);
    }

    public a a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("128fdc9a", new Object[]{this, frameLayout});
        }
        this.b = frameLayout;
        return this;
    }

    public a a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("fae2490f", new Object[]{this, context});
        }
        this.d = context;
        if (context instanceof Activity) {
            this.c = (Activity) context;
        }
        return this;
    }

    public a a(ICLLifeListener iCLLifeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5d0dde1a", new Object[]{this, iCLLifeListener});
        }
        this.e = iCLLifeListener;
        return this;
    }
}
