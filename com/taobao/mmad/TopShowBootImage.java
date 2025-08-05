package com.taobao.mmad;

import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.view.c;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.ext.BootImageWVBridge;
import java.util.List;
import tb.kge;
import tb.sre;
import tb.srq;
import tb.stv;
import tb.tiq;
import tb.tir;

/* loaded from: classes7.dex */
public class TopShowBootImage implements sre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TopShowBootImage";

    /* renamed from: a  reason: collision with root package name */
    private srq f18100a;
    private FrameLayout b;
    private tir c;

    static {
        kge.a(295216720);
        kge.a(1532998567);
    }

    @Override // tb.sre
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : tiq.BIZ_CODE;
    }

    @Override // tb.sre
    public void a(srq srqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4d13a6", new Object[]{this, srqVar});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f18100a = srqVar;
        this.c = new tir(srqVar);
        this.c.b();
        BootImageWVBridge.register();
        stv.a(TAG, "instantiate: cost=" + (System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // tb.srv
    public void a(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i)});
            return;
        }
        stv.a(TAG, "onDownload start. startType=" + i);
        this.c.b(list, i);
    }

    @Override // tb.srv
    public void b(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0262f69", new Object[]{this, list, new Integer(i)});
            return;
        }
        stv.a(TAG, "onStart start. startType=" + i);
        this.c.a(list, i);
    }

    @Override // tb.srv
    public void a(BootImageInfo bootImageInfo, c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3bf80a", new Object[]{this, bootImageInfo, cVar, new Integer(i)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        stv.a(TAG, "onCreateView: ");
        this.f18100a.a(2001);
        this.c.a().a(cVar);
        this.b = (FrameLayout) cVar.b().getParent();
        this.c.a(this.b);
        stv.a(TAG, "onCreateView end: cost=" + (System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // tb.srv
    public void a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603694e4", new Object[]{this, cVar, new Integer(i)});
            return;
        }
        stv.a(TAG, "onViewShown: ");
        this.f18100a.b(2001);
    }

    @Override // tb.srv
    public void onTerminate(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cfaf3a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        stv.a(TAG, "onTerminate: startType=" + i + ", closeType=" + i2);
        this.c.b(i2);
        if (205 == i) {
            return;
        }
        this.c.a(i2, i3);
    }
}
