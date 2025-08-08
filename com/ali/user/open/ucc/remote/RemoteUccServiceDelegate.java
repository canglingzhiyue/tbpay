package com.ali.user.open.ucc.remote;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.LoginReturnData;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.CommonUtils;
import com.ali.user.open.service.SessionService;
import com.ali.user.open.session.Session;
import com.ali.user.open.ucc.IRemoteUccCallback;
import com.ali.user.open.ucc.IRemoteUccService;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccService;
import com.ali.user.open.ucc.UccServiceImpl;
import com.ali.user.open.ucc.UccServiceProviderFactory;
import com.ali.user.open.ucc.remote.broadcast.UccBroadcastHelper;
import com.ali.user.open.ucc.remote.broadcast.UccBroadcastReceiver;
import com.ali.user.open.ucc.util.UccConstants;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import tb.kge;

/* loaded from: classes2.dex */
public class RemoteUccServiceDelegate extends UccServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UccServiceImpl";
    private static volatile RemoteUccServiceDelegate sInstance;
    private IRemoteUccService mIRemoteUccService;
    private IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() { // from class: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25f12e35", new Object[]{this});
                return;
            }
            if (RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this) != null) {
                RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this).asBinder().unlinkToDeath(RemoteUccServiceDelegate.access$100(RemoteUccServiceDelegate.this), 0);
                RemoteUccServiceDelegate.access$002(RemoteUccServiceDelegate.this, null);
            }
            OrangeConfig.getInstance().registerListener(new String[]{"login4android"}, new d() { // from class: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    try {
                        if (StringUtils.equals(OrangeConfig.getInstance().getConfig("login4android", "rebind_ucc_service_when_death", "false"), "true")) {
                            RemoteUccServiceDelegate.access$200(RemoteUccServiceDelegate.this);
                        }
                        OrangeConfig.getInstance().unregisterListener(new String[]{"login4android"}, this);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }, true);
        }
    };
    private ServiceConnection conn = new ServiceConnection() { // from class: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            synchronized (RemoteUccServiceDelegate.access$300(RemoteUccServiceDelegate.this)) {
                RemoteUccServiceDelegate.access$002(RemoteUccServiceDelegate.this, IRemoteUccService.Stub.asInterface(iBinder));
                RemoteUccServiceDelegate.access$300(RemoteUccServiceDelegate.this).notifyAll();
            }
            try {
                iBinder.linkToDeath(RemoteUccServiceDelegate.access$100(RemoteUccServiceDelegate.this), 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            RemoteUccServiceDelegate.access$002(RemoteUccServiceDelegate.this, null);
            SDKLogger.d("UccServiceImpl", "binder died");
        }
    };
    private final Object mLock = new Object();

    public static /* synthetic */ Object ipc$super(RemoteUccServiceDelegate remoteUccServiceDelegate, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ IRemoteUccService access$000(RemoteUccServiceDelegate remoteUccServiceDelegate) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IRemoteUccService) ipChange.ipc$dispatch("a32fe0cc", new Object[]{remoteUccServiceDelegate}) : remoteUccServiceDelegate.mIRemoteUccService;
    }

    public static /* synthetic */ IRemoteUccService access$002(RemoteUccServiceDelegate remoteUccServiceDelegate, IRemoteUccService iRemoteUccService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteUccService) ipChange.ipc$dispatch("f7be61a", new Object[]{remoteUccServiceDelegate, iRemoteUccService});
        }
        remoteUccServiceDelegate.mIRemoteUccService = iRemoteUccService;
        return iRemoteUccService;
    }

    public static /* synthetic */ IBinder.DeathRecipient access$100(RemoteUccServiceDelegate remoteUccServiceDelegate) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBinder.DeathRecipient) ipChange.ipc$dispatch("1455439f", new Object[]{remoteUccServiceDelegate}) : remoteUccServiceDelegate.mDeathRecipient;
    }

    public static /* synthetic */ void access$200(RemoteUccServiceDelegate remoteUccServiceDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1b7cae", new Object[]{remoteUccServiceDelegate});
        } else {
            remoteUccServiceDelegate.bindService();
        }
    }

    public static /* synthetic */ Object access$300(RemoteUccServiceDelegate remoteUccServiceDelegate) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8c93ae85", new Object[]{remoteUccServiceDelegate}) : remoteUccServiceDelegate.mLock;
    }

    static {
        kge.a(1659948538);
        sInstance = null;
    }

    public static RemoteUccServiceDelegate getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteUccServiceDelegate) ipChange.ipc$dispatch("e573489", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (RemoteUccServiceDelegate.class) {
                if (sInstance == null) {
                    sInstance = new RemoteUccServiceDelegate();
                }
            }
        }
        return sInstance;
    }

    public RemoteUccServiceDelegate() {
        if (!ConfigManager.getInstance().isMultiProcessEnable || StringUtils.equals(CommonUtils.getProcessName(KernelContext.getApplicationContext()), KernelContext.getApplicationContext().getPackageName())) {
            return;
        }
        bindService();
        UccBroadcastHelper.registerLoginReceiver(KernelContext.getApplicationContext(), new UccBroadcastReceiver());
    }

    private void bindService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780e543f", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(KernelContext.getApplicationContext().getPackageName(), "com.ali.user.open.ucc.remote.RemoteUccService"));
        KernelContext.getApplicationContext().bindService(intent, this.conn, 1);
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void bind(Activity activity, String str, String str2, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("826e4477", new Object[]{this, activity, str, str2, uccCallback});
        } else {
            bind(activity, str, str2, new HashMap(4), uccCallback);
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void bind(Activity activity, String str, String str2, Map<String, String> map, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f945e6", new Object[]{this, activity, str, str2, map, uccCallback});
        } else if (activity == null) {
            bind(str, str2, map, uccCallback);
        } else {
            if (map != null) {
                map.remove("site");
            }
            if (ConfigManager.getInstance().isMultiProcessEnable && !StringUtils.equals(CommonUtils.getProcessName(activity.getApplicationContext()), activity.getPackageName())) {
                bind(str, str2, map, uccCallback);
                return;
            }
            UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
            UccServiceImpl.getInstance().bind(activity, str, str2, map, uccCallback);
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void bind(String str, String str2, Map<String, String> map, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("741f1314", new Object[]{this, str, str2, map, uccCallback});
            return;
        }
        SDKLogger.d("UccServiceImpl", "bind goUccActivity");
        if (map != null) {
            map.remove("site");
        }
        if (ConfigManager.getInstance().isMultiProcessEnable && !StringUtils.equals(CommonUtils.getProcessName(KernelContext.getApplicationContext()), KernelContext.getApplicationContext().getPackageName())) {
            bind(str2, map, uccCallback);
            return;
        }
        UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
        UccServiceImpl.getInstance().bind(str, str2, map, uccCallback);
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void bind(Activity activity, String str, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10009a81", new Object[]{this, activity, str, uccCallback});
        } else {
            bind(activity, str, new HashMap(4), uccCallback);
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void bind(Activity activity, String str, Map<String, String> map, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e62da9c", new Object[]{this, activity, str, map, uccCallback});
        } else if (activity == null) {
            bind(str, map, uccCallback);
        } else {
            if (map != null) {
                map.remove("site");
            }
            if (ConfigManager.getInstance().isMultiProcessEnable && !StringUtils.equals(CommonUtils.getProcessName(activity.getApplicationContext()), activity.getPackageName())) {
                bind(str, map, uccCallback);
                return;
            }
            UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
            UccServiceImpl.getInstance().bind(activity, str, map, uccCallback);
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void bind(final String str, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d19374a", new Object[]{this, str, map, uccCallback});
            return;
        }
        if (map != null) {
            map.remove("site");
        }
        if (ConfigManager.getInstance().isMultiProcessEnable && !StringUtils.equals(CommonUtils.getProcessName(KernelContext.getApplicationContext()), KernelContext.getApplicationContext().getPackageName())) {
            if (map == null) {
                try {
                    map = new HashMap<>();
                } catch (Throwable th) {
                    th.printStackTrace();
                    SDKLogger.e("UccServiceImpl", "remote bind exception = " + th.getMessage());
                    return;
                }
            }
            map.put("process", CommonUtils.getProcessName(KernelContext.getApplicationContext()));
            ((ExecutorService) AliMemberSDK.getService(ExecutorService.class)).execute(new Runnable() { // from class: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this) == null || RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this).asBinder() == null || !RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this).asBinder().isBinderAlive()) {
                            RemoteUccServiceDelegate.access$200(RemoteUccServiceDelegate.this);
                            RemoteUccServiceDelegate.this.waitUntilConnected(5000L);
                        }
                        if (RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this) == null) {
                            return;
                        }
                        RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this).bind(str, map, new IRemoteUccCallback.Stub() { // from class: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.3.1
                            @Override // com.ali.user.open.ucc.IRemoteUccCallback
                            public void onSuccess(String str2, Map map2) throws RemoteException {
                                if (map2 != null) {
                                    String str3 = (String) map2.get(UccConstants.PARAM_LOGIN_DATA);
                                    if (!StringUtils.isEmpty(str3)) {
                                        ((SessionService) AliMemberSDK.getService(SessionService.class)).refreshCookie(str2, (LoginReturnData) JSON.parseObject(str3, LoginReturnData.class));
                                    }
                                }
                                if (uccCallback != null) {
                                    uccCallback.onSuccess(str2, map2);
                                }
                            }

                            @Override // com.ali.user.open.ucc.IRemoteUccCallback
                            public void onFail(String str2, int i, String str3) throws RemoteException {
                                if (uccCallback != null) {
                                    uccCallback.onFail(str2, i, str3);
                                }
                            }
                        });
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        SDKLogger.e("UccServiceImpl", "remote bind exception = " + th2.getMessage());
                    }
                }
            });
            return;
        }
        UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
        UccServiceImpl.getInstance().bind(str, map, uccCallback);
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void unbind(String str, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c699f9a", new Object[]{this, str, uccCallback});
        } else {
            unbind(str, null, uccCallback);
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void unbind(final String str, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636de063", new Object[]{this, str, map, uccCallback});
            return;
        }
        if (map != null) {
            map.remove("site");
        }
        if (ConfigManager.getInstance().isMultiProcessEnable && !StringUtils.equals(CommonUtils.getProcessName(KernelContext.getApplicationContext()), KernelContext.getApplicationContext().getPackageName())) {
            if (map == null) {
                try {
                    map = new HashMap<>();
                } catch (Throwable th) {
                    th.printStackTrace();
                    SDKLogger.e("UccServiceImpl", "remote unbind exception = " + th.getMessage());
                    if (uccCallback == null) {
                        return;
                    }
                    uccCallback.onFail(str, 1999, "");
                    return;
                }
            }
            map.put("process", CommonUtils.getProcessName(KernelContext.getApplicationContext()));
            ((ExecutorService) AliMemberSDK.getService(ExecutorService.class)).execute(new Runnable() { // from class: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this) == null || RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this).asBinder() == null || !RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this).asBinder().isBinderAlive()) {
                            RemoteUccServiceDelegate.access$200(RemoteUccServiceDelegate.this);
                            RemoteUccServiceDelegate.this.waitUntilConnected(5000L);
                        }
                        if (RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this) == null) {
                            return;
                        }
                        RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this).unbind(str, map, new IRemoteUccCallback.Stub() { // from class: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.4.1
                            @Override // com.ali.user.open.ucc.IRemoteUccCallback
                            public void onSuccess(String str2, Map map2) throws RemoteException {
                                if (uccCallback != null) {
                                    uccCallback.onSuccess(str2, map2);
                                }
                            }

                            @Override // com.ali.user.open.ucc.IRemoteUccCallback
                            public void onFail(String str2, int i, String str3) throws RemoteException {
                                if (uccCallback != null) {
                                    uccCallback.onFail(str2, i, str3);
                                }
                            }
                        });
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        UccCallback uccCallback2 = uccCallback;
                        if (uccCallback2 == null) {
                            return;
                        }
                        uccCallback2.onFail(str, 1999, "");
                    }
                }
            });
            return;
        }
        UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
        UccServiceImpl.getInstance().unbind(str, map, uccCallback);
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void trustLogin(Activity activity, String str, Map<String, String> map, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("353a9b50", new Object[]{this, activity, str, map, uccCallback});
        } else if (activity == null) {
            trustLogin(str, map, uccCallback);
        } else {
            if (map != null) {
                map.remove("site");
            }
            if (ConfigManager.getInstance().isMultiProcessEnable && !StringUtils.equals(CommonUtils.getProcessName(KernelContext.getApplicationContext()), KernelContext.getApplicationContext().getPackageName())) {
                trustLogin(str, map, uccCallback);
                return;
            }
            UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
            UccServiceImpl.getInstance().trustLogin(activity, str, map, uccCallback);
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void trustLogin(final String str, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1a76fe", new Object[]{this, str, map, uccCallback});
            return;
        }
        if (map != null) {
            map.remove("site");
        }
        if (ConfigManager.getInstance().isMultiProcessEnable && !StringUtils.equals(CommonUtils.getProcessName(KernelContext.getApplicationContext()), KernelContext.getApplicationContext().getPackageName())) {
            if (map == null) {
                try {
                    map = new HashMap<>();
                } catch (Throwable th) {
                    th.printStackTrace();
                    SDKLogger.e("UccServiceImpl", "remote unbind exception = " + th.getMessage());
                    return;
                }
            }
            map.put("process", CommonUtils.getProcessName(KernelContext.getApplicationContext()));
            ((ExecutorService) AliMemberSDK.getService(ExecutorService.class)).execute(new Runnable() { // from class: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this) == null || RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this).asBinder() == null || !RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this).asBinder().isBinderAlive()) {
                            RemoteUccServiceDelegate.access$200(RemoteUccServiceDelegate.this);
                            RemoteUccServiceDelegate.this.waitUntilConnected(5000L);
                        }
                        if (RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this) == null) {
                            return;
                        }
                        RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this).trustLogin(str, map, new IRemoteUccCallback.Stub() { // from class: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.5.1
                            @Override // com.ali.user.open.ucc.IRemoteUccCallback
                            public void onSuccess(String str2, Map map2) throws RemoteException {
                                if (map2 != null) {
                                    String str3 = (String) map2.get(UccConstants.PARAM_LOGIN_DATA);
                                    if (!StringUtils.isEmpty(str3)) {
                                        ((SessionService) AliMemberSDK.getService(SessionService.class)).refreshCookie(str2, (LoginReturnData) JSON.parseObject(str3, LoginReturnData.class));
                                    }
                                }
                                if (uccCallback != null) {
                                    uccCallback.onSuccess(str2, map2);
                                }
                            }

                            @Override // com.ali.user.open.ucc.IRemoteUccCallback
                            public void onFail(String str2, int i, String str3) throws RemoteException {
                                if (uccCallback != null) {
                                    uccCallback.onFail(str2, i, str3);
                                }
                            }
                        });
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        UccCallback uccCallback2 = uccCallback;
                        if (uccCallback2 == null) {
                            return;
                        }
                        uccCallback2.onFail(str, 1999, "");
                    }
                }
            });
            return;
        }
        UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
        UccServiceImpl.getInstance().trustLogin(str, map, uccCallback);
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void logout(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d96de1", new Object[]{this, context, str});
        } else if (ConfigManager.getInstance().isMultiProcessEnable && !StringUtils.equals(CommonUtils.getProcessName(context.getApplicationContext()), context.getPackageName())) {
            try {
                if (this.mIRemoteUccService == null) {
                    bindService();
                } else {
                    this.mIRemoteUccService.logout(str);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                SDKLogger.e("UccServiceImpl", "remote unbind exception = " + th.getMessage());
            }
        } else {
            UccServiceImpl.getInstance().logout(context, str);
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void logoutAll(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34ce4ca", new Object[]{this, context});
        } else if (ConfigManager.getInstance().isMultiProcessEnable && !StringUtils.equals(CommonUtils.getProcessName(context.getApplicationContext()), context.getPackageName())) {
            try {
                if (this.mIRemoteUccService == null) {
                    bindService();
                } else {
                    this.mIRemoteUccService.logoutAll();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                SDKLogger.e("UccServiceImpl", "remote unbind exception = " + th.getMessage());
            }
        } else {
            UccServiceImpl.getInstance().logoutAll(context);
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void cleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f7d54b", new Object[]{this});
        } else {
            UccServiceProviderFactory.getInstance().cleanUp();
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public Session getSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("a5d69a45", new Object[]{this, str});
        }
        if (ConfigManager.getInstance().isMultiProcessEnable && !StringUtils.equals(CommonUtils.getProcessName(KernelContext.getApplicationContext()), KernelContext.getApplicationContext().getPackageName())) {
            try {
                if (this.mIRemoteUccService == null) {
                    bindService();
                    return null;
                }
                String session = this.mIRemoteUccService.getSession(str);
                if (!StringUtils.isEmpty(session)) {
                    return (Session) JSON.parseObject(session, Session.class);
                }
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
                SDKLogger.e("UccServiceImpl", "remote unbind exception = " + th.getMessage());
                return null;
            }
        }
        return UccServiceImpl.getInstance().getSession(str);
    }

    public boolean waitUntilConnected(long j) throws InterruptedException, TimeoutException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("766ead01", new Object[]{this, new Long(j)})).booleanValue();
        }
        try {
            if (this.mIRemoteUccService != null && this.mIRemoteUccService.asBinder() != null) {
                return true;
            }
            synchronized (this.mLock) {
                this.mLock.wait(j);
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
