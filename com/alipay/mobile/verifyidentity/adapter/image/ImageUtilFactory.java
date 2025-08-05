package com.alipay.mobile.verifyidentity.adapter.image;

import android.content.Context;
import com.alipay.mobile.verifyidentity.image.ImageUtil;
import com.alipay.mobile.verifyidentity.image.ImageUtilImpl;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ImageUtilFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile ImageUtilImpl f5852a;

    public static ImageUtil getImageUtil(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageUtil) ipChange.ipc$dispatch("534e5ac4", new Object[]{context});
        }
        if (f5852a == null) {
            synchronized (ImageUtilFactory.class) {
                if (f5852a == null) {
                    f5852a = new ImageUtilImpl(context);
                }
            }
        }
        return f5852a;
    }
}
