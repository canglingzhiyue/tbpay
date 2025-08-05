package com.taobao.weex.ui.animation;

import android.os.Build;
import android.util.Property;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class CameraDistanceProperty extends Property<View, Float> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CameraDistance";
    private static CameraDistanceProperty instance;

    static {
        kge.a(-1028854406);
    }

    public static Property<View, Float> getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Property) ipChange.ipc$dispatch("735939c1", new Object[0]) : instance;
    }

    private CameraDistanceProperty() {
        super(Float.class, TAG);
    }

    @Override // android.util.Property
    public Float get(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("abe63b1e", new Object[]{this, view});
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return Float.valueOf(view.getCameraDistance());
        }
        return Float.valueOf(Float.NaN);
    }

    @Override // android.util.Property
    public void set(View view, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0588b0", new Object[]{this, view, f});
        } else {
            view.setCameraDistance(f.floatValue());
        }
    }
}
