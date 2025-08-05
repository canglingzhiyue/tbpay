package com.taobao.tao.adapter.biz.weex.module;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.weex.WeexBizView;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import java.io.File;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class TaopasswordLayerModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_NAME = "com.taobao.share.weextool.NotifyModule";
    public static final String PARAMS = "com.taobao.share.weextool.params";

    static {
        kge.a(-852038927);
    }

    @WXModuleAnno
    public void closeWithParam(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b065e5", new Object[]{this, str, map});
        } else {
            WeexBizView.closeWithParam(str, map);
        }
    }

    @WXModuleAnno
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            WeexBizView.close();
        }
    }

    @WXModuleAnno
    public void getTPTaoPasswordWeexData(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53cab4cb", new Object[]{this, jSCallback});
        } else {
            jSCallback.invoke(WeexBizView.params);
        }
    }

    public static String handlerCategory(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f462961", new Object[]{wXSDKInstance});
        }
        try {
            return TaopasswordLayerModule.class.getSimpleName() + File.pathSeparatorChar + wXSDKInstance.toString();
        } catch (Throwable th) {
            TLog.loge("TaopasswordLayerModule", "NotifyModule.handlerCategory error.", th);
            return null;
        }
    }
}
