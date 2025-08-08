package com.alipay.mobile.framework.service.common;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MpaasRpcServiceFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static MpaasRpcService f5709a;

    public static MpaasRpcService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MpaasRpcService) ipChange.ipc$dispatch("e4909cf6", new Object[0]);
        }
        Context context = TransportEnvUtil.getContext();
        if (context == null) {
            throw new RuntimeException("Context is null from TransportEnvUtil#getContext");
        }
        return getInstance(context);
    }

    public static MpaasRpcService getInstance(Context context) {
        MpaasRpcService mpaasRpcService = f5709a;
        if (mpaasRpcService != null) {
            return mpaasRpcService;
        }
        synchronized (MpaasRpcService.class) {
            if (f5709a != null) {
                return f5709a;
            } else if (context == null) {
                throw new RuntimeException("Context parameter is null.");
            } else {
                String stringFromMetaData = MiscUtils.getStringFromMetaData(context, "mpaas_rpc_service_class");
                if (!StringUtils.isEmpty(stringFromMetaData)) {
                    f5709a = (MpaasRpcService) Class.forName(stringFromMetaData, true, context.getClassLoader()).getConstructor(Context.class).newInstance(context);
                    LogCatUtil.info("MpaasRpcServiceFactory", "Loaded mpaas rpc service: " + stringFromMetaData + ", object hashcode: " + f5709a.hashCode());
                    return f5709a;
                }
                f5709a = new MpaasRpcServiceImpl(TransportEnvUtil.getContext());
                return f5709a;
            }
        }
    }

    public static void setMpaasRpcService(MpaasRpcService mpaasRpcService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aacd877", new Object[]{mpaasRpcService});
        } else {
            f5709a = mpaasRpcService;
        }
    }
}
