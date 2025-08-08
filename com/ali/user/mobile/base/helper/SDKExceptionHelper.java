package com.ali.user.mobile.base.helper;

import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.ToastUtil;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class SDKExceptionHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static SDKExceptionHelper instance;

    private SDKExceptionHelper() {
    }

    static {
        kge.a(-512353586);
        instance = new SDKExceptionHelper();
    }

    public static SDKExceptionHelper getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SDKExceptionHelper) ipChange.ipc$dispatch("3bd51925", new Object[0]) : instance;
    }

    private void toast(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{this, str});
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.base.helper.SDKExceptionHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (StringUtils.isEmpty(str)) {
                    } else {
                        try {
                            ToastUtil.showToast(DataProviderFactory.getApplicationContext(), str, 0);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    public void rpcExceptionHandler(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4094dce", new Object[]{this, th});
            return;
        }
        th.printStackTrace();
        toast(DataProviderFactory.getApplicationContext().getString(R.string.aliuser_network_error));
    }
}
