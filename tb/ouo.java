package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.e;
import com.taobao.tao.sharepanel.weex.component.QRImageView;
import com.taobao.tao.sharepanel.weex.component.QRImageViewWeex2;
import com.taobao.tao.sharepanel.weex.component.ScreenShotView;
import com.taobao.tao.sharepanel.weex.component.ScreenShotViewWeex2;
import com.taobao.tao.sharepanel.weex.component.ScrollViewWeex2;
import com.taobao.tao.sharepanel.weex.component.ShareChannelView;
import com.taobao.tao.sharepanel.weex.component.ShareFriendView;
import com.taobao.tao.sharepanel.weex.component.ShareToolView;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import com.taobao.weex.ui.IFComponentHolder;
import com.taobao.weex.ui.SimpleComponentHolder;

/* loaded from: classes8.dex */
public class ouo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2084185604);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            WXSDKEngine.registerComponent((IFComponentHolder) new SimpleComponentHolder(ShareChannelView.class, new ShareChannelView.a()), false, "shareChannelView");
        } catch (WXException e) {
            e.printStackTrace();
            nyy.c("ComponentBridge", "initComponent ShareChannelView err " + e.getMessage());
        }
        try {
            WXSDKEngine.registerComponent((IFComponentHolder) new SimpleComponentHolder(ShareFriendView.class, new ShareFriendView.a()), false, "shareFriendView");
        } catch (WXException e2) {
            e2.printStackTrace();
            nyy.c("ComponentBridge", "initComponent ShareFriendView err " + e2.getMessage());
        }
        try {
            WXSDKEngine.registerComponent((IFComponentHolder) new SimpleComponentHolder(ShareToolView.class, new ShareToolView.a()), false, "shareToolView");
        } catch (WXException e3) {
            e3.printStackTrace();
            nyy.c("ComponentBridge", "initComponent ShareToolView err " + e3.getMessage());
        }
        try {
            WXSDKEngine.registerComponent((IFComponentHolder) new SimpleComponentHolder(QRImageView.class, new QRImageView.a()), false, "qrImageView");
            e.a().a("qrimageview", QRImageViewWeex2.class);
        } catch (WXException e4) {
            e4.printStackTrace();
            nyy.c("ComponentBridge", "initComponent ShareToolView err " + e4.getMessage());
        }
        try {
            WXSDKEngine.registerComponent((IFComponentHolder) new SimpleComponentHolder(ScreenShotView.class, new ScreenShotView.a()), false, "screenShotView");
            e.a().a("screenshotview", ScreenShotViewWeex2.class);
            e.a().a("sharescrollview", ScrollViewWeex2.class);
        } catch (WXException e5) {
            e5.printStackTrace();
            nyy.c("ComponentBridge", "initComponent ScreenShotView err " + e5.getMessage());
        }
    }
}
