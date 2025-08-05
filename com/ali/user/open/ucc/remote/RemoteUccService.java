package com.ali.user.open.ucc.remote;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.service.SessionService;
import com.ali.user.open.session.Session;
import com.ali.user.open.ucc.IRemoteUccCallback;
import com.ali.user.open.ucc.IRemoteUccService;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccService;
import com.ali.user.open.ucc.UccServiceImpl;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class RemoteUccService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RemoteUccService";
    private UccBinder binder = new UccBinder();
    private final RemoteCallbackList<IRemoteUccCallback> mTrustLoginListenerList = new RemoteCallbackList<>();
    private final RemoteCallbackList<IRemoteUccCallback> mBindListenerList = new RemoteCallbackList<>();
    private final RemoteCallbackList<IRemoteUccCallback> mUnbindListenerList = new RemoteCallbackList<>();

    static {
        kge.a(-355946155);
    }

    public static /* synthetic */ RemoteCallbackList access$000(RemoteUccService remoteUccService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteCallbackList) ipChange.ipc$dispatch("30b5e332", new Object[]{remoteUccService}) : remoteUccService.mBindListenerList;
    }

    public static /* synthetic */ RemoteCallbackList access$300(RemoteUccService remoteUccService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteCallbackList) ipChange.ipc$dispatch("8b3fe4f", new Object[]{remoteUccService}) : remoteUccService.mTrustLoginListenerList;
    }

    public static /* synthetic */ RemoteCallbackList access$400(RemoteUccService remoteUccService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteCallbackList) ipChange.ipc$dispatch("50b35cae", new Object[]{remoteUccService}) : remoteUccService.mUnbindListenerList;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent}) : this.binder;
    }

    /* loaded from: classes2.dex */
    class UccBinder extends IRemoteUccService.Stub {
        static {
            kge.a(1293145328);
        }

        UccBinder() {
        }

        @Override // com.ali.user.open.ucc.IRemoteUccService
        public String getSession(String str) {
            Session session = ((SessionService) AliMemberSDK.getService(SessionService.class)).getSession(str);
            return session == null ? "" : JSON.toJSONString(session);
        }

        @Override // com.ali.user.open.ucc.IRemoteUccService
        public void bind(String str, Map map, IRemoteUccCallback iRemoteUccCallback) {
            try {
                RemoteUccService.access$000(RemoteUccService.this).register(iRemoteUccCallback);
                UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
                UccServiceImpl.getInstance().bind(str, map, new UccCallback() { // from class: com.ali.user.open.ucc.remote.RemoteUccService.UccBinder.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.open.ucc.UccCallback
                    public void onSuccess(String str2, Map map2) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("b5e17230", new Object[]{this, str2, map2});
                            return;
                        }
                        try {
                            UccBinder.this.onReceiveSuccess(RemoteUccService.access$000(RemoteUccService.this), str2, map2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }

                    @Override // com.ali.user.open.ucc.UccCallback
                    public void onFail(String str2, int i, String str3) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("b9656df", new Object[]{this, str2, new Integer(i), str3});
                            return;
                        }
                        try {
                            UccBinder.this.onReceiveFail(RemoteUccService.access$000(RemoteUccService.this), str2, i, str3);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.ali.user.open.ucc.IRemoteUccService
        public void trustLogin(String str, Map map, IRemoteUccCallback iRemoteUccCallback) {
            try {
                RemoteUccService.access$300(RemoteUccService.this).register(iRemoteUccCallback);
                UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
                UccServiceImpl.getInstance().trustLogin(str, map, new UccCallback() { // from class: com.ali.user.open.ucc.remote.RemoteUccService.UccBinder.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.open.ucc.UccCallback
                    public void onSuccess(String str2, Map map2) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("b5e17230", new Object[]{this, str2, map2});
                            return;
                        }
                        try {
                            UccBinder.this.onReceiveSuccess(RemoteUccService.access$300(RemoteUccService.this), str2, map2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }

                    @Override // com.ali.user.open.ucc.UccCallback
                    public void onFail(String str2, int i, String str3) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("b9656df", new Object[]{this, str2, new Integer(i), str3});
                            return;
                        }
                        try {
                            UccBinder.this.onReceiveFail(RemoteUccService.access$300(RemoteUccService.this), str2, i, str3);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.ali.user.open.ucc.IRemoteUccService
        public void unbind(String str, Map map, IRemoteUccCallback iRemoteUccCallback) {
            try {
                RemoteUccService.access$400(RemoteUccService.this).register(iRemoteUccCallback);
                UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
                UccServiceImpl.getInstance().unbind(str, map, new UccCallback() { // from class: com.ali.user.open.ucc.remote.RemoteUccService.UccBinder.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.open.ucc.UccCallback
                    public void onSuccess(String str2, Map map2) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("b5e17230", new Object[]{this, str2, map2});
                            return;
                        }
                        try {
                            UccBinder.this.onReceiveSuccess(RemoteUccService.access$400(RemoteUccService.this), str2, map2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }

                    @Override // com.ali.user.open.ucc.UccCallback
                    public void onFail(String str2, int i, String str3) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("b9656df", new Object[]{this, str2, new Integer(i), str3});
                            return;
                        }
                        try {
                            UccBinder.this.onReceiveFail(RemoteUccService.access$400(RemoteUccService.this), str2, i, str3);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.ali.user.open.ucc.IRemoteUccService
        public void logout(String str) {
            UccServiceImpl.getInstance().logout(RemoteUccService.this.getApplicationContext(), str);
        }

        @Override // com.ali.user.open.ucc.IRemoteUccService
        public void logoutAll() {
            UccServiceImpl.getInstance().logoutAll(RemoteUccService.this.getApplicationContext());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onReceiveSuccess(RemoteCallbackList<IRemoteUccCallback> remoteCallbackList, String str, Map map) {
            synchronized (remoteCallbackList) {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i = 0; i < beginBroadcast; i++) {
                    try {
                        IRemoteUccCallback broadcastItem = remoteCallbackList.getBroadcastItem(i);
                        if (broadcastItem != null) {
                            broadcastItem.onSuccess(str, map);
                        }
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
                remoteCallbackList.kill();
                remoteCallbackList.finishBroadcast();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onReceiveFail(RemoteCallbackList<IRemoteUccCallback> remoteCallbackList, String str, int i, String str2) {
            synchronized (remoteCallbackList) {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        IRemoteUccCallback broadcastItem = remoteCallbackList.getBroadcastItem(i2);
                        if (broadcastItem != null) {
                            broadcastItem.onFail(str, i, str2);
                        }
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
                remoteCallbackList.kill();
                remoteCallbackList.finishBroadcast();
            }
        }
    }
}
