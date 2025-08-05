package com.taobao.android.dinamicx;

import android.content.Context;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageStrategyConfigBuilderInterface;
import com.taobao.android.AliUrlImageViewInterface;
import com.taobao.android.dinamic.constructor.DImageViewConstructor;
import tb.fpn;
import tb.fpr;

/* loaded from: classes.dex */
public class e implements DImageViewConstructor.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamic.constructor.DImageViewConstructor.a
    public ImageView a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("4124c730", new Object[]{this, context}) : (ImageView) com.taobao.android.k.a().b(context);
    }

    @Override // com.taobao.android.dinamic.constructor.DImageViewConstructor.a
    public void a(ImageView imageView, String str, DImageViewConstructor.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab19447", new Object[]{this, imageView, str, bVar});
            return;
        }
        AliUrlImageViewInterface aliUrlImageViewInterface = (AliUrlImageViewInterface) imageView;
        if (bVar.a()) {
            aliUrlImageViewInterface.setImageUrl(str);
        }
        if (bVar.b()) {
            float a2 = fpr.a(imageView.getContext(), bVar.f11734a, 0);
            aliUrlImageViewInterface.setCornerRadius(a2, a2, a2, a2);
            aliUrlImageViewInterface.setShape(1);
        }
        if (bVar.e()) {
            aliUrlImageViewInterface.setStrokeWidth(fpr.a(imageView.getContext(), bVar.c, 0));
        }
        if (bVar.d()) {
            aliUrlImageViewInterface.setStrokeColor(fpn.a(bVar.b, 0));
        }
        if (bVar.c() && "heightLimit".equals(bVar.e)) {
            AliImageStrategyConfigBuilderInterface newImageStrategyConfigBuilder = aliUrlImageViewInterface.newImageStrategyConfigBuilder(bVar.d);
            newImageStrategyConfigBuilder.a(AliImageStrategyConfigBuilderInterface.AliSizeLimitType.HEIGHT_LIMIT);
            aliUrlImageViewInterface.setStrategyConfig(newImageStrategyConfigBuilder.a());
        }
        if (!bVar.f()) {
            return;
        }
        aliUrlImageViewInterface.setOrientation(bVar.g);
        aliUrlImageViewInterface.setRatio(bVar.f);
    }
}
