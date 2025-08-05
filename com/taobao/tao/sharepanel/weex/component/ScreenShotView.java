package com.taobao.tao.sharepanel.weex.component;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;
import com.taobao.share.globalmodel.e;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.ComponentCreator;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import tb.kge;
import tb.nyk;

/* loaded from: classes8.dex */
public class ScreenShotView extends WXComponent<ImageView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1869025665);
    }

    public ScreenShotView(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView  reason: collision with other method in class */
    public ImageView mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("a5b11369", new Object[]{this, context});
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (nyk.b(e.b().j().businessId)) {
            b.h().a(context).a(e.b().j().screenshot).into(imageView);
        }
        return imageView;
    }

    /* loaded from: classes8.dex */
    public static class a implements ComponentCreator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1770821655);
            kge.a(1901682895);
        }

        @Override // com.taobao.weex.ui.ComponentCreator
        public WXComponent createInstance(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WXComponent) ipChange.ipc$dispatch("a264c511", new Object[]{this, wXSDKInstance, wXVContainer, basicComponentData}) : new ScreenShotView(wXSDKInstance, wXVContainer, basicComponentData);
        }
    }
}
