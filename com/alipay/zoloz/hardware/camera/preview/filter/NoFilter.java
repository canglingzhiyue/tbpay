package com.alipay.zoloz.hardware.camera.preview.filter;

import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NoFilter extends AFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.zoloz.hardware.camera.preview.filter.AFilter
    public void onSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public NoFilter(Resources resources) {
        super(resources);
        this.j = "NoFilter";
    }

    @Override // com.alipay.zoloz.hardware.camera.preview.filter.AFilter
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b("shader/base_vertex.sh", "shader/base_fragment.sh");
        }
    }
}
