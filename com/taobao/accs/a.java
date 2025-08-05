package com.taobao.accs;

import android.content.Context;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.data.AccsStreamConfig;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public interface a {
    void bindApp(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver);

    void bindService(Context context, String str);

    void bindUser(Context context, String str);

    void bindUser(Context context, String str, boolean z);

    boolean cancel(Context context, String str);

    void clearLoginInfo(Context context);

    void forceDisableService(Context context);

    void forceEnableService(Context context);

    Map<String, Boolean> forceReConnectChannel() throws Exception;

    Map<String, Boolean> getChannelState() throws Exception;

    String getConnectionUnitInfo();

    long getServerTime();

    boolean isAccsConnected();

    boolean isChannelError(int i);

    boolean isNetworkReachable(Context context);

    void queryStream(AccsStreamConfig accsStreamConfig);

    void registerConnectStateListener(AccsConnectStateListener accsConnectStateListener);

    void registerDataListener(Context context, String str, AccsAbstractDataListener accsAbstractDataListener);

    void registerHeartBeatListener(IHeartBeat iHeartBeat);

    void registerSerivce(Context context, String str, String str2);

    void sendBusinessAck(String str, String str2, String str3, short s, String str4, Map<Integer, String> map);

    String sendData(Context context, ACCSManager.AccsRequest accsRequest);

    String sendData(Context context, String str, String str2, byte[] bArr, String str3);

    String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4);

    String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url);

    String sendPushResponse(Context context, ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo);

    String sendRequest(Context context, ACCSManager.AccsRequest accsRequest);

    String sendRequest(Context context, ACCSManager.AccsRequest accsRequest, String str, boolean z);

    String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4);

    String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url);

    void setLoginInfo(Context context, ILoginInfo iLoginInfo);

    @Deprecated
    void setMode(Context context, int i);

    void setProxy(Context context, String str, int i);

    void startInAppConnection(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver);

    void subscribeStream(AccsStreamConfig accsStreamConfig);

    void unRegisterConnectStateListener(AccsConnectStateListener accsConnectStateListener);

    void unRegisterDataListener(Context context, String str);

    void unRegisterSerivce(Context context, String str);

    void unSubscribeStream(AccsStreamConfig accsStreamConfig);

    void unbindService(Context context, String str);

    void unbindUser(Context context);

    void unregisterHeartBeatListener(IHeartBeat iHeartBeat);

    void updateConfig(AccsClientConfig accsClientConfig);
}
