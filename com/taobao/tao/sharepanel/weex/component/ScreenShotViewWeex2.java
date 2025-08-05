package com.taobao.tao.sharepanel.weex.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;
import com.taobao.share.globalmodel.e;
import io.unicorn.plugin.platform.WeexPlatformView;
import tb.kge;
import tb.nyk;

/* loaded from: classes8.dex */
public class ScreenShotViewWeex2 extends WeexPlatformView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context context;
    public ImageView imageView;

    static {
        kge.a(-59365552);
    }

    public ScreenShotViewWeex2(Context context, int i) {
        super(context, i);
        this.imageView = null;
        this.context = context;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        ImageView imageView = this.imageView;
        if (imageView != null) {
            return imageView;
        }
        ImageView imageView2 = new ImageView(this.context);
        imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (nyk.b(e.b().j().businessId)) {
            b.h().a(this.context).a(e.b().j().screenshot).into(imageView2);
        }
        return imageView2;
    }
}
