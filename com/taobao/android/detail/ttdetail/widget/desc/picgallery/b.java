package com.taobao.android.detail.ttdetail.widget.desc.picgallery;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class b extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1637275961);
    }

    public b(MotionEvent motionEvent) {
        super(motionEvent);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.picgallery.e
    public float a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938b", new Object[]{this, new Integer(i)})).floatValue() : this.f11020a.getX(i);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.picgallery.e
    public float b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2a", new Object[]{this, new Integer(i)})).floatValue() : this.f11020a.getY(i);
    }
}
