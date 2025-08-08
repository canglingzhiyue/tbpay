package com.ali.user.open.laxin;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.RpcRequestCallbackWithCode;
import com.ali.user.open.core.model.RpcResponse;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.laxin.LaxinLogin;
import com.ali.user.open.laxin.data.CrossAppLoginResponse;
import com.ali.user.open.laxin.data.DataRepository;
import com.ali.user.open.laxin.util.SecurityUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class LaxinService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ucc.LaxinService";
    public LaxinLogin.Stub mBinder = new AnonymousClass1();
    private String mCallingPackage;

    static {
        kge.a(1492593556);
    }

    public static /* synthetic */ Object ipc$super(LaxinService laxinService, String str, Object... objArr) {
        if (str.hashCode() == 1992651935) {
            return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ String access$000(LaxinService laxinService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a7df974e", new Object[]{laxinService}) : laxinService.mCallingPackage;
    }

    public static /* synthetic */ String access$002(LaxinService laxinService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e7a8e82", new Object[]{laxinService, str});
        }
        laxinService.mCallingPackage = str;
        return str;
    }

    public static /* synthetic */ boolean access$100(LaxinService laxinService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e36a7617", new Object[]{laxinService})).booleanValue() : laxinService.checkPermission();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService(RemoteMessageConst.NOTIFICATION)).createNotificationChannel(new NotificationChannel("laxin_channel_01", "taobao", 3));
            startForeground(1, new Notification.Builder(this, "laxin_channel_01").setContentTitle("").setContentText("").build());
            stopSelf(i2);
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent}) : this.mBinder;
    }

    /* renamed from: com.ali.user.open.laxin.LaxinService$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 extends LaxinLogin.Stub {
        LaxinDataCallback callback;

        AnonymousClass1() {
        }

        @Override // com.ali.user.open.laxin.LaxinLogin
        public void applyLaxinInfo(Map map, LaxinDataCallback laxinDataCallback) {
            this.callback = laxinDataCallback;
            if (map == null || KernelContext.getApplicationContext() == null) {
                errorBack(String.valueOf(LaxinCode.INVALID_PARAM));
                return;
            }
            LaxinService.access$002(LaxinService.this, KernelContext.getApplicationContext().getPackageManager().getNameForUid(Binder.getCallingUid()));
            final String str = (String) map.get(SessionConstants.LOGIN_SITE);
            String str2 = "loginAppKey";
            if (StringUtils.isEmpty((String) map.get(str2))) {
                str2 = "loginAppkey";
            }
            final String str3 = (String) map.get(str2);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ali.user.open.laxin.LaxinService.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (!LaxinService.access$100(LaxinService.this)) {
                            AnonymousClass1.this.errorBack(String.valueOf(LaxinCode.NOT_IN_WHITE_LIST));
                        } else {
                            DataRepository.applyLaxinToken(str, str3, LaxinService.access$000(LaxinService.this), new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.laxin.LaxinService.1.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                                public void onSuccess(RpcResponse rpcResponse) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                                    } else if (rpcResponse == null || rpcResponse.returnValue == 0) {
                                        AnonymousClass1.this.errorBack(String.valueOf(LaxinCode.EMPTY_RESULT));
                                    } else {
                                        HashMap hashMap = new HashMap();
                                        CrossAppLoginResponse crossAppLoginResponse = (CrossAppLoginResponse) rpcResponse.returnValue;
                                        try {
                                            hashMap.put("success", "1");
                                            hashMap.put("data", JSON.toJSONString(crossAppLoginResponse));
                                            AnonymousClass1.this.callback.onData(hashMap);
                                        } catch (RemoteException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }

                                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                                public void onSystemError(String str4, RpcResponse rpcResponse) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str4, rpcResponse});
                                    } else {
                                        AnonymousClass1.this.errorBack(str4);
                                    }
                                }

                                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                                public void onError(String str4, RpcResponse rpcResponse) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("3aace899", new Object[]{this, str4, rpcResponse});
                                    } else {
                                        AnonymousClass1.this.errorBack(str4);
                                    }
                                }
                            });
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, 100L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void errorBack(String str) {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("success", "0");
                hashMap.put("errorCode", str);
                if (this.callback == null) {
                    return;
                }
                this.callback.onData(hashMap);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean checkPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fc70e02", new Object[]{this})).booleanValue();
        }
        SDKLogger.e(TAG, "in checkPermission");
        if (!Boolean.parseBoolean(getCheckPermissionOrange())) {
            return true;
        }
        String str = null;
        if (Build.VERSION.SDK_INT >= 19) {
            str = this.mCallingPackage;
        }
        SDKLogger.e(TAG, "before call  SecurityUtil.checkPermission");
        return SecurityUtil.checkPermission(KernelContext.getApplicationContext(), str);
    }

    public static String getCheckPermissionOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c175a0a", new Object[0]);
        }
        try {
            return OrangeConfig.getInstance().getConfig("login4android", "check_permission", "false");
        } catch (Throwable unused) {
            return "false";
        }
    }
}
