package com.taobao.android.dinamicx.widget;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;

/* loaded from: classes.dex */
public class a implements ao {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamicx.widget.ao
    public String a(String str, int i, int i2, DXImageWidgetNode.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d07a8cb4", new Object[]{this, str, new Integer(i), new Integer(i2), dVar});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            ImageStrategyConfig.a a2 = (TextUtils.isEmpty(dVar.e) || dVar.f < 0) ? ImageStrategyConfig.a(dVar.e) : ImageStrategyConfig.a(dVar.e, dVar.f);
            if (dVar.a() == 2) {
                a2.d(true);
            }
            if (dVar.d() && "heightLimit".equals(dVar.i)) {
                a2.a(ImageStrategyConfig.SizeLimitType.HEIGHT_LIMIT);
            }
            a2.a(b.a(dVar));
            return ImageStrategyDecider.decideUrl(str, Integer.valueOf(i), Integer.valueOf(i2), a2.a());
        } catch (Throwable unused) {
            return null;
        }
    }
}
