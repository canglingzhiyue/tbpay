package com.taobao.informationflowdataservice.dataservice.utils.environment;

import android.app.Application;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter;
import com.taobao.tao.Globals;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.tao.util.TaoHelper;
import com.ut.device.UTDevice;
import tb.kge;
import tb.lxm;

/* loaded from: classes7.dex */
public class AppAdapter implements IAppAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1570180215);
        kge.a(-1459924051);
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter
    public Application getApplication() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this}) : lxm.c();
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter
    public String getUTDID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b9b56f", new Object[]{this});
        }
        String str = (String) com.taobao.android.launcher.common.c.a("deviceId", null);
        return StringUtils.isEmpty(str) ? UTDevice.getUtdid(getApplication().getApplicationContext()) : str;
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter
    public String getTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[]{this});
        }
        String str = (String) com.taobao.android.launcher.common.c.a("ttid", null);
        return StringUtils.isEmpty(str) ? TaoHelper.getTTID() : str;
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter
    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this}) : Globals.getVersionName();
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter
    public int getStatusBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT < 19) {
            return 0;
        }
        return SystemBarDecorator.getStatusBarHeight(lxm.c());
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter
    public boolean isDebug() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue() : lxm.b();
    }
}
