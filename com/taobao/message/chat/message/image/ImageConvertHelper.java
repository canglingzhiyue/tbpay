package com.taobao.message.chat.message.image;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import tb.kge;

/* loaded from: classes7.dex */
public class ImageConvertHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int EXPRESSION_WIDTH_LIMIT = DisplayUtil.dip2px(ApplicationUtil.getApplication(), 150.0f);

    static {
        kge.a(-1368686466);
    }

    public void adjustImageSize(Image image) {
        float f;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65e12a", new Object[]{this, image});
        } else if (image.width == 0 || image.height == 0) {
        } else {
            if (image.width > image.height) {
                f = image.height;
                i = image.width;
            } else {
                f = image.width;
                i = image.height;
            }
            float f2 = f / i;
            if (image.width > image.height) {
                int i2 = this.EXPRESSION_WIDTH_LIMIT;
                if (image.width * 1.5d <= i2) {
                    i2 = (int) (image.width * 1.5d);
                }
                image.width = i2;
                image.height = (int) (image.width * f2);
                return;
            }
            int i3 = this.EXPRESSION_WIDTH_LIMIT;
            if (image.height * 1.5d <= i3) {
                i3 = (int) (image.height * 1.5d);
            }
            image.height = i3;
            image.width = (int) (image.height * f2);
        }
    }
}
