package com.taobao.weex.ui.component.list.template.jni;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.component.WXComponent;
import tb.kge;

/* loaded from: classes9.dex */
public class NativeRenderObjectUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(372892997);
    }

    public static native void nativeAddChildRenderObject(long j, long j2);

    public static native long nativeCopyRenderObject(long j);

    public static native long nativeGetRenderObject(String str, String str2);

    public static native int nativeLayoutRenderObject(long j, float f, float f2);

    public static native int nativeRenderObjectChildCount(long j);

    public static native void nativeRenderObjectChildWaste(long j, boolean z);

    public static native long nativeRenderObjectGetChild(long j, int i);

    public static native int nativeRenderObjectGetLayoutDirectionFromPathNode(long j);

    public static native boolean nativeRenderObjectHasNewLayout(long j);

    public static native void nativeRenderObjectUpdateComponent(long j, WXComponent wXComponent);

    public static native void nativeUpdateRenderObjectAttr(long j, String str, String str2);

    public static native void nativeUpdateRenderObjectStyle(long j, String str, String str2);

    public static void updateComponentSize(WXComponent wXComponent, float f, float f2, float f3, float f4, float f5, float f6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd34781", new Object[]{wXComponent, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6)});
            return;
        }
        wXComponent.updateDemission(f, f2, f3, f4, f5, f6);
        wXComponent.applyLayoutOnly();
    }
}
