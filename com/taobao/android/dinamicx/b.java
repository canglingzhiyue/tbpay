package com.taobao.android.dinamicx;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageStrategyConfigBuilderInterface;
import com.taobao.android.AliUrlImageViewInterface;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import java.util.Map;

/* loaded from: classes.dex */
public class b implements com.taobao.android.dinamicx.widget.an {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamicx.widget.an
    public ImageView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("4124c730", new Object[]{this, context});
        }
        AliUrlImageViewInterface aliUrlImageViewInterface = (AliUrlImageViewInterface) com.taobao.android.k.a().b(context);
        aliUrlImageViewInterface.setReusableImageShape(true);
        return (ImageView) aliUrlImageViewInterface;
    }

    @Override // com.taobao.android.dinamicx.widget.an
    public void a(ImageView imageView, String str, final DXImageWidgetNode.d dVar) {
        AliImageStrategyConfigBuilderInterface newImageStrategyConfigBuilder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35de9ac6", new Object[]{this, imageView, str, dVar});
            return;
        }
        AliUrlImageViewInterface aliUrlImageViewInterface = (AliUrlImageViewInterface) imageView;
        aliUrlImageViewInterface.setSkipAutoSize(dVar.i() || dVar.g());
        aliUrlImageViewInterface.setAutoRelease(dVar.j());
        aliUrlImageViewInterface.setPlaceHoldForeground(dVar.h);
        aliUrlImageViewInterface.setPlaceHoldImageResId(dVar.g);
        aliUrlImageViewInterface.setDarkModeOverlay(dVar.h(), (int) (dVar.k() * 255.0d));
        if (dVar.c()) {
            int[] iArr = dVar.f11999a;
            aliUrlImageViewInterface.setCornerRadius(iArr[0], iArr[1], iArr[3], iArr[2]);
            aliUrlImageViewInterface.setShape(1);
        }
        if (dVar.f()) {
            aliUrlImageViewInterface.setStrokeWidth(dVar.c);
        }
        if (dVar.e()) {
            aliUrlImageViewInterface.setStrokeColor(dVar.b);
        }
        if (!StringUtils.isEmpty(dVar.e) && dVar.f >= 0) {
            newImageStrategyConfigBuilder = aliUrlImageViewInterface.newImageStrategyConfigBuilder(dVar.e, dVar.f);
        } else {
            newImageStrategyConfigBuilder = aliUrlImageViewInterface.newImageStrategyConfigBuilder(dVar.e);
        }
        if (dVar.d() && "heightLimit".equals(dVar.i)) {
            newImageStrategyConfigBuilder.a(AliImageStrategyConfigBuilderInterface.AliSizeLimitType.HEIGHT_LIMIT);
        }
        aliUrlImageViewInterface.setStrategyConfig(newImageStrategyConfigBuilder.a());
        if (dVar.j != null) {
            aliUrlImageViewInterface.succListener(new com.taobao.android.i<com.taobao.android.l>() { // from class: com.taobao.android.dinamicx.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.i
                public boolean a(com.taobao.android.l lVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f5589b42", new Object[]{this, lVar})).booleanValue();
                    }
                    DXImageWidgetNode.e eVar = new DXImageWidgetNode.e();
                    eVar.f12000a = lVar.a();
                    dVar.j.a(eVar);
                    return false;
                }
            });
        } else {
            aliUrlImageViewInterface.succListener(null);
        }
        a(str, aliUrlImageViewInterface, dVar);
    }

    private void a(String str, AliUrlImageViewInterface aliUrlImageViewInterface, DXImageWidgetNode.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2aae4c", new Object[]{this, str, aliUrlImageViewInterface, dVar});
        } else if (dVar.b()) {
            com.taobao.android.j jVar = new com.taobao.android.j();
            if (dVar != null && dVar.m() != null) {
                for (Map.Entry<String, String> entry : dVar.m().entrySet()) {
                    jVar.a(entry.getKey(), entry.getValue());
                }
            }
            if (dVar != null && dVar.n() != null) {
                jVar.a(dVar.n());
            }
            aliUrlImageViewInterface.setEnableSizeInLayoutParams(dVar.p());
            aliUrlImageViewInterface.setImageUrl(str, jVar);
        }
    }
}
