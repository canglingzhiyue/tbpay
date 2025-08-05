package com.alipay.mobile.common.amnet.service.util;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.biz.AmnetSwitchManagerImpl;
import com.alipay.mobile.common.amnet.ipcapi.pushproc.AmnetClientService;
import com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService;
import com.alipay.mobile.common.amnet.service.AmnetMainProcService;
import com.alipay.mobile.common.amnet.service.config.CtrlNormalConfigChangedEventImpl;
import com.alipay.mobile.common.amnet.service.ipcservice.AmnetClientServiceImpl;
import com.alipay.mobile.common.amnet.service.ipcservice.OutEventNotifyServiceImpl;
import com.alipay.mobile.common.amnet.service.ipcservice.UpdateDnsServiceImpl;
import com.alipay.mobile.common.ipc.api.IPCApiFactory;
import com.alipay.mobile.common.ipc.api.ServiceBeanManager;
import com.alipay.mobile.common.transport.config.CtrlNormalConfigChangedEvent;
import com.alipay.mobile.common.transport.httpdns.ipc.UpdateDnsService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class PushIpcHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f5387a = {AmnetMainProcService.class.getName()};

    public static final void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        try {
            IPCApiFactory.getSingletonIPCContextManager().init(context, IPCApiFactory.getSingletonIPCManager());
        } catch (Throwable th) {
            LogCatUtil.error("PushIpcHelper", "[init] Exception: " + th.toString(), th);
        }
    }

    public static final ServiceBeanManager getServiceBeanManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceBeanManager) ipChange.ipc$dispatch("4fe70858", new Object[0]);
        }
        try {
            return IPCApiFactory.getSingletonServiceBeanManager();
        } catch (Exception e) {
            LogCatUtil.warn("PushIpcHelper", "[getServiceBeanManager] Exception: " + e.toString(), e);
            return null;
        }
    }

    public static final void registerDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c357a5", new Object[0]);
            return;
        }
        unregisterServiceBean(OutEventNotifyService.class.getName());
        registerServiceBean(OutEventNotifyService.class.getName(), OutEventNotifyServiceImpl.getInstance());
        unregisterServiceBean(AmnetClientService.class.getName());
        registerServiceBean(AmnetClientService.class.getName(), AmnetClientServiceImpl.getInstance());
        unregisterServiceBean(CtrlNormalConfigChangedEvent.class.getName());
        registerServiceBean(CtrlNormalConfigChangedEvent.class.getName(), new CtrlNormalConfigChangedEventImpl());
        unregisterServiceBean(UpdateDnsService.class.getName());
        registerServiceBean(UpdateDnsService.class.getName(), new UpdateDnsServiceImpl());
    }

    public static final void registerServiceBean(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b96f8f", new Object[]{str, obj});
        } else if (obj == null || TextUtils.isEmpty(str)) {
        } else {
            try {
                getServiceBeanManager().register(str, obj);
            } catch (Throwable unused) {
                LogCatUtil.error("PushIpcHelper", "[registerServiceBean] interfaceClassName:" + str + "， objImpl：" + obj.getClass().getName());
            }
        }
    }

    public static final void unregisterServiceBean(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62987fa", new Object[]{str});
            return;
        }
        try {
            getServiceBeanManager().unregister(str);
        } catch (Throwable unused) {
            LogCatUtil.error("PushIpcHelper", "[unregisterServiceBean] interfaceClassName:" + str);
        }
    }

    public static final <T> T getIpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("666d3784", new Object[]{cls});
        }
        try {
            return (T) IPCApiFactory.getSingletonIPCContextManager().getIpcCallManager().getIpcProxy(cls);
        } catch (Exception e) {
            LogCatUtil.error("PushIpcHelper", "[getIpcProxy] Exception: " + e.toString(), e);
            return null;
        }
    }

    public static boolean hasRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("def77968", new Object[0])).booleanValue();
        }
        try {
            return IPCApiFactory.getSingletonIPCManager().hashRegister();
        } catch (Exception e) {
            LogCatUtil.error("PushIpcHelper", "[hasRegister] Exception: " + e.toString(), e);
            return false;
        }
    }

    public static boolean waitBinded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6dd4b7c", new Object[0])).booleanValue();
        }
        startServiceOfMainProc();
        if (hasRegister()) {
            return true;
        }
        if (!AmnetSwitchManagerImpl.getInstance().isCanStartMainProcDispatch()) {
            LogCatUtil.info("PushIpcHelper", "[waitBinded]  CanStartMainProcDispatch is false.");
            return false;
        }
        int i = 0;
        while (i < 12) {
            if (hasRegister()) {
                LogCatUtil.info("PushIpcHelper", "Start ipc success!");
                return true;
            }
            try {
                LogCatUtil.info("PushIpcHelper", "wait bundler register! seconds=[" + i + riy.ARRAY_END_STR);
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                LogCatUtil.error("PushIpcHelper", "[waitBinded] Exception: " + e.toString(), e);
            }
            i++;
            if (i % 3 == 0) {
                startServiceOfMainProc();
            }
        }
        return false;
    }

    public static boolean startServiceOfMainProc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca183404", new Object[0])).booleanValue();
        }
        int i = 0;
        while (true) {
            String[] strArr = f5387a;
            if (i >= strArr.length) {
                return true;
            }
            Class<?> cls = Class.forName(strArr[i]);
            if (cls == null) {
                try {
                    LogCatUtil.warn("PushIpcHelper", "[startServiceOfMainProc] Not found class = " + f5387a[i]);
                    i++;
                } catch (Exception e) {
                    LogCatUtil.printError("PushIpcHelper", e);
                    return false;
                }
            } else if (!MiscUtils.isServiceAvailable(AmnetEnvHelper.getAppContext(), cls)) {
                LogCatUtil.info("PushIpcHelper", "[startServiceOfMainProc] Service is invalid： " + f5387a[i]);
                i++;
            } else {
                Context appContext = AmnetEnvHelper.getAppContext();
                Intent intent = new Intent(appContext, cls);
                intent.setPackage(appContext.getPackageName());
                appContext.bindService(intent, new CourierServiceConnection(), 1);
                LogCatUtil.info("PushIpcHelper", "Start power main proc!");
                return true;
            }
        }
    }

    public static final void unregisterAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2b4dcc", new Object[0]);
            return;
        }
        try {
            IPCApiFactory.getSingletonServiceBeanManager().unregisterAll();
        } catch (Throwable th) {
            LogCatUtil.error("PushIpcHelper", "[unregisterAll] Exception: " + th.toString(), th);
        }
    }
}
