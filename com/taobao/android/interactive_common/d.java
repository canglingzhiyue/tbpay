package com.taobao.android.interactive_common;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.component.CXPhotoViewComponent;
import com.taobao.android.interactive_common.wxmodule.CXContentToolsModule;
import com.taobao.android.interactive_common.wxmodule.CXNavModule;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a() throws WXException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        WXSDKEngine.registerModule("contentTools", CXContentToolsModule.class);
        WXSDKEngine.registerModule("contentNavigator", CXNavModule.class);
        WXSDKEngine.registerComponent("cximage", CXPhotoViewComponent.class);
    }
}
