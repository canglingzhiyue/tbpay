package com.taobao.agoo;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.IAgooAppReceiver;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.init.Launcher_InitPush;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.c;
import com.taobao.accs.utl.d;
import com.taobao.accs.utl.f;
import com.taobao.accs.utl.l;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.CallBack;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;
import tb.ddk;
import tb.ddl;
import tb.ddo;
import tb.kge;

/* loaded from: classes.dex */
public final class TaobaoRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ddk f8381a;
    private static boolean b;
    private static AtomicBoolean c;
    public static final List<CallBack> pushListeners;

    @Deprecated
    public static void setBuilderSound(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51421635", new Object[]{context, str});
        }
    }

    @Deprecated
    public static void setNotificationIcon(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c45408", new Object[]{context, new Integer(i)});
        }
    }

    @Deprecated
    public static void setNotificationSound(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cf7f0f5", new Object[]{context, new Boolean(z)});
        }
    }

    @Deprecated
    public static void setNotificationVibrate(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e86c95", new Object[]{context, new Boolean(z)});
        }
    }

    public static /* synthetic */ ddk a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ddk) ipChange.ipc$dispatch("f039e93", new Object[0]) : f8381a;
    }

    public static /* synthetic */ ddk a(ddk ddkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ddk) ipChange.ipc$dispatch("6331584e", new Object[]{ddkVar});
        }
        f8381a = ddkVar;
        return ddkVar;
    }

    static {
        kge.a(-1692995161);
        pushListeners = new CopyOnWriteArrayList();
        c = new AtomicBoolean(false);
    }

    private TaobaoRegister() {
        throw new UnsupportedOperationException();
    }

    public static synchronized void setAccsConfigTag(Context context, String str) {
        synchronized (TaobaoRegister.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51ebec67", new Object[]{context, str});
                return;
            }
            Config.mAccsConfigTag = str;
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
            if (configByTag == null) {
                throw new RuntimeException("accs config not exist!! please set accs config first!!");
            }
            ALog.i("TaobaoRegister", "setAccsConfigTag", "config", configByTag.toString());
            com.taobao.accs.client.a.c = configByTag.getAuthCode();
            Config.setAgooAppKey(context, configByTag.getAppKey());
            String appSecret = configByTag.getAppSecret();
            c.b = appSecret;
            if (!StringUtils.isEmpty(appSecret)) {
                com.taobao.accs.client.a.f8207a = 2;
            }
        }
    }

    @Deprecated
    public static synchronized void register(Context context, String str, String str2, String str3, IRegister iRegister) throws AccsException {
        synchronized (TaobaoRegister.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb4e93cf", new Object[]{context, str, str2, str3, iRegister});
            } else {
                register(context, "default", str, str2, str3, iRegister);
            }
        }
    }

    public static synchronized void register(final Context context, String str, final String str2, String str3, final String str4, final IRegister iRegister) throws AccsException {
        synchronized (TaobaoRegister.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db8b32c5", new Object[]{context, str, str2, str3, str4, iRegister});
                return;
            }
            if (context != null && !StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str)) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    ALog.isUseTlog = false;
                    anet.channel.util.ALog.setUseTlog(false);
                }
                ALog.i("TaobaoRegister", "register", "appKey", str2, Constants.KEY_CONFIG_TAG, str);
                final Context applicationContext = context.getApplicationContext();
                Config.mAccsConfigTag = str;
                Config.setAgooAppKey(context, str2);
                c.b = str3;
                if (!StringUtils.isEmpty(str3)) {
                    com.taobao.accs.client.a.f8207a = 2;
                }
                AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
                if (configByTag == null) {
                    new AccsClientConfig.Builder().setAppKey(str2).setAppSecret(str3).setTag(str).build();
                } else {
                    com.taobao.accs.client.a.c = configByTag.getAuthCode();
                }
                final com.taobao.accs.a accsInstance = ACCSManager.getAccsInstance(context, str2, str);
                accsInstance.bindApp(applicationContext, str2, str3, str4, new IAgooAppReceiver() { // from class: com.taobao.agoo.TaobaoRegister.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.accs.IAppReceiver
                    public Map<String, String> getAllServices() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Map) ipChange2.ipc$dispatch("4e25da25", new Object[]{this});
                        }
                        return null;
                    }

                    @Override // com.taobao.accs.IAppReceiver
                    public String getService(String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (String) ipChange2.ipc$dispatch("46264ad0", new Object[]{this, str5});
                        }
                        return null;
                    }

                    @Override // com.taobao.accs.IAppReceiver
                    public void onBindApp(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a1fbb8b7", new Object[]{this, new Integer(i)});
                        }
                    }

                    @Override // com.taobao.accs.IAppReceiver
                    public void onBindUser(String str5, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d2ee7e0b", new Object[]{this, str5, new Integer(i)});
                        }
                    }

                    @Override // com.taobao.accs.IAppReceiver
                    public void onData(String str5, String str6, byte[] bArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("20c4430b", new Object[]{this, str5, str6, bArr});
                        }
                    }

                    @Override // com.taobao.accs.IAppReceiver
                    public void onSendData(String str5, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("46c12d21", new Object[]{this, str5, new Integer(i)});
                        }
                    }

                    @Override // com.taobao.accs.IAppReceiver
                    public void onUnbindApp(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1230c610", new Object[]{this, new Integer(i)});
                        }
                    }

                    @Override // com.taobao.accs.IAppReceiver
                    public void onUnbindUser(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2f4f2cdc", new Object[]{this, new Integer(i)});
                        }
                    }

                    @Override // com.taobao.accs.IAgooAppReceiver, com.taobao.accs.IAppReceiverV1
                    public void onBindApp(int i, String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("370ec2c1", new Object[]{this, new Integer(i), str5});
                            return;
                        }
                        try {
                            ALog.i("TaobaoRegister", "onBindApp", "errorCode", Integer.valueOf(i));
                            if (i == 200) {
                                if (TaobaoRegister.a() == null) {
                                    TaobaoRegister.a(new ddk(applicationContext));
                                }
                                GlobalClientInfo.getInstance(context).registerListener(NotifManager.getServiceId(context, TaobaoConstants.SERVICE_ID_DEVICECMD), TaobaoRegister.a());
                                if (l.s(context)) {
                                    if (StringUtils.isEmpty(str5)) {
                                        iRegister.onFailure(TaobaoConstants.REGISTER_ERROR, "agoo server error deviceid null");
                                        return;
                                    }
                                    TaobaoRegister.setIsRegisterSuccess(true);
                                    f.a().b();
                                    UtilityImpl.saveUtdid(Config.PREFERENCES, GlobalClientInfo.getContext());
                                    iRegister.onSuccess(str5);
                                } else if (ddk.b.b(applicationContext.getPackageName()) && !UtilityImpl.notificationStateChanged(Constants.SP_CHANNEL_FILE_NAME, context)) {
                                    TaobaoRegister.setIsRegisterSuccess(true);
                                    f.a().b();
                                    ALog.i("TaobaoRegister", "agoo already Registered return ", new Object[0]);
                                    if (iRegister == null) {
                                        return;
                                    }
                                    iRegister.onSuccess(Config.getDeviceToken(applicationContext));
                                } else {
                                    byte[] a2 = ddo.a(applicationContext, str2, str4);
                                    if (a2 == null) {
                                        if (iRegister == null) {
                                            return;
                                        }
                                        iRegister.onFailure(TaobaoConstants.REGISTER_ERROR, "req data null");
                                        return;
                                    }
                                    String sendRequest = accsInstance.sendRequest(applicationContext, new ACCSManager.AccsRequest(null, TaobaoConstants.SERVICE_ID_DEVICECMD, a2, null));
                                    if (StringUtils.isEmpty(sendRequest)) {
                                        if (iRegister == null) {
                                            return;
                                        }
                                        iRegister.onFailure(TaobaoConstants.REGISTER_ERROR, "accs channel disabled!");
                                    } else if (iRegister == null) {
                                    } else {
                                        TaobaoRegister.a().f26707a.put(sendRequest, iRegister);
                                    }
                                }
                            } else if (iRegister == null) {
                            } else {
                                iRegister.onFailure(String.valueOf(i), "accs bindapp error!");
                            }
                        } catch (Throwable th) {
                            ALog.e("TaobaoRegister", "register onBindApp", th, new Object[0]);
                        }
                    }

                    @Override // com.taobao.accs.IAgooAppReceiver
                    public String getAppkey() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("c9396be5", new Object[]{this}) : str2;
                    }
                });
                return;
            }
            ALog.e("TaobaoRegister", "register params null", "appkey", str2, Constants.KEY_CONFIG_TAG, str);
        }
    }

    public static void registerManuMonitor(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a5b2c5", new Object[]{context});
        } else if (c.getAndSet(true) || c.a(context)) {
        } else {
            Launcher_InitPush.initPushChannel(context);
        }
    }

    public static synchronized void setAlias(Context context, String str, ICallback iCallback) {
        synchronized (TaobaoRegister.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cee3b2c", new Object[]{context, str, iCallback});
                return;
            }
            b bVar = new b(iCallback);
            ALog.i("TaobaoRegister", ddl.JSON_CMD_SETALIAS, "alias", str);
            String deviceToken = Config.getDeviceToken(context);
            String agooAppKey = Config.getAgooAppKey(context);
            if (StringUtils.isEmpty(agooAppKey) || StringUtils.isEmpty(deviceToken) || context == null || StringUtils.isEmpty(str)) {
                bVar.onFailure(TaobaoConstants.ALIAS_ERROR, "input params null!!");
                ALog.e("TaobaoRegister", "setAlias param null", "appkey", agooAppKey, "deviceId", deviceToken, "alias", str, "context", context);
                return;
            }
            if (f8381a == null) {
                f8381a = new ddk(context.getApplicationContext());
            }
            if (ddk.b.d(str)) {
                ALog.i("TaobaoRegister", "setAlias already set", "alias", str);
                bVar.onSuccess();
                return;
            }
            com.taobao.accs.a accsInstance = ACCSManager.getAccsInstance(context, agooAppKey, Config.getAccsConfigTag(context));
            if (!l.s(context) && !ddk.b.b(context.getPackageName())) {
                bVar.onFailure(TaobaoConstants.ALIAS_ERROR, "bindApp first!!");
                return;
            }
            String serviceId = NotifManager.getServiceId(context, TaobaoConstants.SERVICE_ID_DEVICECMD);
            GlobalClientInfo.getInstance(context).registerListener(serviceId, f8381a);
            String sendRequest = accsInstance.sendRequest(context, new ACCSManager.AccsRequest(null, NotifManager.getServiceId(context, serviceId), ddl.a(agooAppKey, deviceToken, str), null));
            if (StringUtils.isEmpty(sendRequest)) {
                bVar.onFailure(TaobaoConstants.ALIAS_ERROR, "accs channel disabled!");
                return;
            }
            bVar.b = str;
            f8381a.f26707a.put(sendRequest, bVar);
        }
    }

    public static synchronized void removeAlias(Context context, String str, ICallback iCallback) {
        synchronized (TaobaoRegister.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b906ca", new Object[]{context, str, iCallback});
                return;
            }
            a aVar = new a(iCallback);
            ALog.i("TaobaoRegister", ddl.JSON_CMD_REMOVEALIAS, new Object[0]);
            String deviceToken = Config.getDeviceToken(context);
            String agooAppKey = Config.getAgooAppKey(context);
            if (!StringUtils.isEmpty(agooAppKey) && !StringUtils.isEmpty(deviceToken) && context != null && !StringUtils.isEmpty(str)) {
                com.taobao.accs.a accsInstance = ACCSManager.getAccsInstance(context, agooAppKey, Config.getAccsConfigTag(context));
                if (f8381a == null) {
                    f8381a = new ddk(context.getApplicationContext());
                }
                String serviceId = NotifManager.getServiceId(context, TaobaoConstants.SERVICE_ID_DEVICECMD);
                GlobalClientInfo.getInstance(context).registerListener(serviceId, f8381a);
                String sendRequest = accsInstance.sendRequest(context, new ACCSManager.AccsRequest(null, serviceId, ddl.c(agooAppKey, deviceToken, str), null));
                if (StringUtils.isEmpty(sendRequest)) {
                    aVar.onFailure(TaobaoConstants.ALIAS_ERROR, "accs channel disabled!");
                    return;
                } else {
                    f8381a.f26707a.put(sendRequest, aVar);
                    return;
                }
            }
            aVar.onFailure(TaobaoConstants.ALIAS_ERROR, "input params null!!");
            ALog.e("TaobaoRegister", "setAlias param null", "appkey", agooAppKey, "deviceId", deviceToken, "alias", str, "context", context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
        r11.onFailure(com.taobao.agoo.TaobaoConstants.ALIAS_ERROR, "input params null!!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void removeAlias(android.content.Context r10, com.taobao.agoo.ICallback r11) {
        /*
            java.lang.Class<com.taobao.agoo.TaobaoRegister> r0 = com.taobao.agoo.TaobaoRegister.class
            monitor-enter(r0)
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.agoo.TaobaoRegister.$ipChange     // Catch: java.lang.Throwable -> Ld6
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> Ld6
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L19
            java.lang.String r2 = "e69da394"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Ld6
            r4[r5] = r10     // Catch: java.lang.Throwable -> Ld6
            r4[r3] = r11     // Catch: java.lang.Throwable -> Ld6
            r1.ipc$dispatch(r2, r4)     // Catch: java.lang.Throwable -> Ld6
            monitor-exit(r0)
            return
        L19:
            java.lang.String r1 = "TaobaoRegister"
            java.lang.String r2 = "removeAlias"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Ld6
            com.taobao.accs.utl.ALog.i(r1, r2, r6)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r1 = org.android.agoo.common.Config.getDeviceToken(r10)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = org.android.agoo.common.Config.getPushAliasToken(r10)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r6 = org.android.agoo.common.Config.getAgooAppKey(r10)     // Catch: java.lang.Throwable -> Lc9
            boolean r7 = android.text.StringUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lc9
            if (r7 != 0) goto L93
            boolean r7 = android.text.StringUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lc9
            if (r7 != 0) goto L93
            if (r10 == 0) goto L93
            boolean r7 = android.text.StringUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lc9
            if (r7 == 0) goto L44
            goto L93
        L44:
            java.lang.String r3 = org.android.agoo.common.Config.getAccsConfigTag(r10)     // Catch: java.lang.Throwable -> Lc9
            com.taobao.accs.a r3 = com.taobao.accs.ACCSManager.getAccsInstance(r10, r6, r3)     // Catch: java.lang.Throwable -> Lc9
            tb.ddk r4 = com.taobao.agoo.TaobaoRegister.f8381a     // Catch: java.lang.Throwable -> Lc9
            if (r4 != 0) goto L5b
            tb.ddk r4 = new tb.ddk     // Catch: java.lang.Throwable -> Lc9
            android.content.Context r7 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> Lc9
            r4.<init>(r7)     // Catch: java.lang.Throwable -> Lc9
            com.taobao.agoo.TaobaoRegister.f8381a = r4     // Catch: java.lang.Throwable -> Lc9
        L5b:
            java.lang.String r4 = "AgooDeviceCmd"
            java.lang.String r4 = org.android.agoo.control.NotifManager.getServiceId(r10, r4)     // Catch: java.lang.Throwable -> Lc9
            com.taobao.accs.client.GlobalClientInfo r7 = com.taobao.accs.client.GlobalClientInfo.getInstance(r10)     // Catch: java.lang.Throwable -> Lc9
            tb.ddk r8 = com.taobao.agoo.TaobaoRegister.f8381a     // Catch: java.lang.Throwable -> Lc9
            r7.registerListener(r4, r8)     // Catch: java.lang.Throwable -> Lc9
            byte[] r1 = tb.ddl.b(r6, r1, r2)     // Catch: java.lang.Throwable -> Lc9
            com.taobao.accs.ACCSManager$AccsRequest r2 = new com.taobao.accs.ACCSManager$AccsRequest     // Catch: java.lang.Throwable -> Lc9
            r6 = 0
            r2.<init>(r6, r4, r1, r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r10 = r3.sendRequest(r10, r2)     // Catch: java.lang.Throwable -> Lc9
            boolean r1 = android.text.StringUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Lc9
            if (r1 == 0) goto L88
            if (r11 == 0) goto L91
            java.lang.String r10 = "504.1"
            java.lang.String r1 = "accs channel disabled!"
            r11.onFailure(r10, r1)     // Catch: java.lang.Throwable -> Lc9
            goto Ld4
        L88:
            if (r11 == 0) goto L91
            tb.ddk r1 = com.taobao.agoo.TaobaoRegister.f8381a     // Catch: java.lang.Throwable -> Lc9
            java.util.Map<java.lang.String, com.taobao.agoo.ICallback> r1 = r1.f26707a     // Catch: java.lang.Throwable -> Lc9
            r1.put(r10, r11)     // Catch: java.lang.Throwable -> Lc9
        L91:
            monitor-exit(r0)
            return
        L93:
            if (r11 == 0) goto L9d
            java.lang.String r7 = "504.1"
            java.lang.String r8 = "input params null!!"
            r11.onFailure(r7, r8)     // Catch: java.lang.Throwable -> Lc9
        L9d:
            java.lang.String r11 = "TaobaoRegister"
            java.lang.String r7 = "removeAlias param null"
            r8 = 8
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r9 = "appkey"
            r8[r5] = r9     // Catch: java.lang.Throwable -> Lc9
            r8[r3] = r6     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = "deviceId"
            r8[r4] = r3     // Catch: java.lang.Throwable -> Lc9
            r3 = 3
            r8[r3] = r1     // Catch: java.lang.Throwable -> Lc9
            r1 = 4
            java.lang.String r3 = "pushAliasToken"
            r8[r1] = r3     // Catch: java.lang.Throwable -> Lc9
            r1 = 5
            r8[r1] = r2     // Catch: java.lang.Throwable -> Lc9
            r1 = 6
            java.lang.String r2 = "context"
            r8[r1] = r2     // Catch: java.lang.Throwable -> Lc9
            r1 = 7
            r8[r1] = r10     // Catch: java.lang.Throwable -> Lc9
            com.taobao.accs.utl.ALog.e(r11, r7, r8)     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r0)
            return
        Lc9:
            r10 = move-exception
            java.lang.String r11 = "TaobaoRegister"
            java.lang.String r1 = "removeAlias"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Ld6
            com.taobao.accs.utl.ALog.e(r11, r1, r10, r2)     // Catch: java.lang.Throwable -> Ld6
        Ld4:
            monitor-exit(r0)
            return
        Ld6:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.removeAlias(android.content.Context, com.taobao.agoo.ICallback):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
        r11.onFailure(com.taobao.agoo.TaobaoConstants.ALIAS_ERROR, "input params null!!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void removeAllAlias(android.content.Context r10, com.taobao.agoo.ICallback r11) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.agoo.TaobaoRegister.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r10
            r1[r2] = r11
            java.lang.String r10 = "eb1dc43b"
            r0.ipc$dispatch(r10, r1)
            return
        L15:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "removeAllAlias"
            java.lang.String r5 = "TaobaoRegister"
            com.taobao.accs.utl.ALog.i(r5, r1, r0)
            java.lang.String r0 = org.android.agoo.common.Config.getDeviceToken(r10)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r6 = org.android.agoo.common.Config.getAgooAppKey(r10)     // Catch: java.lang.Throwable -> Lab
            boolean r7 = android.text.StringUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r8 = "504.1"
            if (r7 != 0) goto L84
            boolean r7 = android.text.StringUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lab
            if (r7 != 0) goto L84
            if (r10 != 0) goto L38
            goto L84
        L38:
            java.lang.String r2 = org.android.agoo.common.Config.getAccsConfigTag(r10)     // Catch: java.lang.Throwable -> Lab
            com.taobao.accs.a r2 = com.taobao.accs.ACCSManager.getAccsInstance(r10, r6, r2)     // Catch: java.lang.Throwable -> Lab
            tb.ddk r3 = com.taobao.agoo.TaobaoRegister.f8381a     // Catch: java.lang.Throwable -> Lab
            if (r3 != 0) goto L4f
            tb.ddk r3 = new tb.ddk     // Catch: java.lang.Throwable -> Lab
            android.content.Context r7 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> Lab
            r3.<init>(r7)     // Catch: java.lang.Throwable -> Lab
            com.taobao.agoo.TaobaoRegister.f8381a = r3     // Catch: java.lang.Throwable -> Lab
        L4f:
            java.lang.String r3 = "AgooDeviceCmd"
            java.lang.String r3 = org.android.agoo.control.NotifManager.getServiceId(r10, r3)     // Catch: java.lang.Throwable -> Lab
            com.taobao.accs.client.GlobalClientInfo r7 = com.taobao.accs.client.GlobalClientInfo.getInstance(r10)     // Catch: java.lang.Throwable -> Lab
            tb.ddk r9 = com.taobao.agoo.TaobaoRegister.f8381a     // Catch: java.lang.Throwable -> Lab
            r7.registerListener(r3, r9)     // Catch: java.lang.Throwable -> Lab
            byte[] r0 = tb.ddl.a(r6, r0)     // Catch: java.lang.Throwable -> Lab
            com.taobao.accs.ACCSManager$AccsRequest r6 = new com.taobao.accs.ACCSManager$AccsRequest     // Catch: java.lang.Throwable -> Lab
            r7 = 0
            r6.<init>(r7, r3, r0, r7)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r10 = r2.sendRequest(r10, r6)     // Catch: java.lang.Throwable -> Lab
            boolean r0 = android.text.StringUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L7a
            if (r11 == 0) goto L83
            java.lang.String r10 = "accs channel disabled!"
            r11.onFailure(r8, r10)     // Catch: java.lang.Throwable -> Lab
            goto Lb1
        L7a:
            if (r11 == 0) goto L83
            tb.ddk r0 = com.taobao.agoo.TaobaoRegister.f8381a     // Catch: java.lang.Throwable -> Lab
            java.util.Map<java.lang.String, com.taobao.agoo.ICallback> r0 = r0.f26707a     // Catch: java.lang.Throwable -> Lab
            r0.put(r10, r11)     // Catch: java.lang.Throwable -> Lab
        L83:
            return
        L84:
            if (r11 == 0) goto L8c
            java.lang.String r7 = "input params null!!"
            r11.onFailure(r8, r7)     // Catch: java.lang.Throwable -> Lab
        L8c:
            java.lang.String r11 = "removeAllAlias param null"
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Lab
            java.lang.String r8 = "appkey"
            r7[r4] = r8     // Catch: java.lang.Throwable -> Lab
            r7[r2] = r6     // Catch: java.lang.Throwable -> Lab
            java.lang.String r2 = "deviceId"
            r7[r3] = r2     // Catch: java.lang.Throwable -> Lab
            r2 = 3
            r7[r2] = r0     // Catch: java.lang.Throwable -> Lab
            r0 = 4
            java.lang.String r2 = "context"
            r7[r0] = r2     // Catch: java.lang.Throwable -> Lab
            r0 = 5
            r7[r0] = r10     // Catch: java.lang.Throwable -> Lab
            com.taobao.accs.utl.ALog.e(r5, r11, r7)     // Catch: java.lang.Throwable -> Lab
            return
        Lab:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r4]
            com.taobao.accs.utl.ALog.e(r5, r1, r10, r11)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.removeAllAlias(android.content.Context, com.taobao.agoo.ICallback):void");
    }

    @Deprecated
    public static void bindAgoo(Context context, String str, String str2, CallBack callBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01cc8b6", new Object[]{context, str, str2, callBack});
        } else {
            bindAgoo(context, null);
        }
    }

    @Deprecated
    public static void unBindAgoo(Context context, String str, String str2, CallBack callBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cc645d", new Object[]{context, str, str2, callBack});
        } else {
            unbindAgoo(context, null);
        }
    }

    public static void registerPushListener(Context context, CallBack callBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1712414", new Object[]{context, callBack});
        } else if (!UtilityImpl.isChannelProcess(context)) {
            ALog.e("TaobaoRegister", "registerPushListener not in channel", new Object[0]);
        } else {
            pushListeners.add(callBack);
        }
    }

    public static void unregisterPushListener(Context context, CallBack callBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e039bcdb", new Object[]{context, callBack});
        } else if (!UtilityImpl.isChannelProcess(context)) {
            ALog.e("TaobaoRegister", "unregisterPushListener not in channel", new Object[0]);
        } else {
            pushListeners.remove(callBack);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
        r14.onFailure(com.taobao.agoo.TaobaoConstants.UNBINDAGOO_ERROR, "input params null!!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void a(android.content.Context r13, com.taobao.agoo.ICallback r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.a(android.content.Context, com.taobao.agoo.ICallback, boolean):void");
    }

    public static void bindAgoo(Context context, ICallback iCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d60ccb", new Object[]{context, iCallback});
        } else {
            a(context, iCallback, true);
        }
    }

    public static void unbindAgoo(Context context, ICallback iCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d4d364", new Object[]{context, iCallback});
        } else {
            a(context, iCallback, false);
        }
    }

    public static void clickMessage(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb1f036", new Object[]{context, str, str2});
        } else {
            clickMessage(context, str, str2, 0, 0L);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static void clickMessage(android.content.Context r23, java.lang.String r24, java.lang.String r25, int r26, long r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.clickMessage(android.content.Context, java.lang.String, java.lang.String, int, long):void");
    }

    public static void dismissMessage(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba2ab38", new Object[]{context, str, str2});
            return;
        }
        NotifManager notifManager = new NotifManager();
        MsgDO msgDO = null;
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i("TaobaoRegister", "dismissMessage", "msgid", str, AgooConstants.MESSAGE_EXT, str2);
            }
            if (StringUtils.isEmpty(str)) {
                ALog.d("TaobaoRegister", "messageId == null", new Object[0]);
                return;
            }
            notifManager.init(context);
            MsgDO msgDO2 = new MsgDO();
            try {
                msgDO2.msgIds = str;
                msgDO2.extData = str2;
                msgDO2.messageSource = "accs";
                msgDO2.msgStatus = "9";
                AgooFactory agooFactory = new AgooFactory();
                agooFactory.init(context, notifManager, null);
                agooFactory.updateNotifyMsg(str, "9");
                notifManager.reportNotifyMessage(msgDO2);
            } catch (Throwable th) {
                th = th;
                msgDO = msgDO2;
                try {
                    ALog.e("TaobaoRegister", "dismissMessage,error=" + th, new Object[0]);
                } finally {
                    if (msgDO != null) {
                        notifManager.reportNotifyMessage(msgDO);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void exposureMessage(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34840b5", new Object[]{context, str, str2});
            return;
        }
        NotifManager notifManager = new NotifManager();
        MsgDO msgDO = null;
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i("TaobaoRegister", "exposureMessage", "msgid", str, AgooConstants.MESSAGE_EXT, str2);
            }
            if (StringUtils.isEmpty(str)) {
                ALog.d("TaobaoRegister", "messageId == null", new Object[0]);
                return;
            }
            notifManager.init(context);
            MsgDO msgDO2 = new MsgDO();
            try {
                msgDO2.msgIds = str;
                msgDO2.extData = str2;
                msgDO2.messageSource = "accs";
                msgDO2.msgStatus = "10";
                new AgooFactory().init(context, notifManager, null);
                notifManager.reportNotifyMessage(msgDO2);
            } catch (Throwable th) {
                th = th;
                msgDO = msgDO2;
                try {
                    ALog.e("TaobaoRegister", "exposureMessage,error=" + th, new Object[0]);
                } finally {
                    if (msgDO != null) {
                        notifManager.reportNotifyMessage(msgDO);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void pingApp(Context context, String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eba9c73", new Object[]{context, str, str2, str3, new Integer(i)});
            return;
        }
        NotifManager notifManager = new NotifManager();
        notifManager.init(context);
        notifManager.pingApp(str, str2, str3, i);
    }

    public static void setAgooMsgReceiveService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ccbd5c", new Object[]{str});
        } else {
            com.taobao.accs.client.a.b = str;
        }
    }

    public static void setEnv(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad7fded", new Object[]{context, new Integer(i)});
        } else {
            ACCSClient.setEnvironment(context, i);
        }
    }

    @Deprecated
    public static void unregister(Context context, CallBack callBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cd7ea9", new Object[]{context, callBack});
        } else {
            unbindAgoo(context, null);
        }
    }

    public static boolean isRegisterSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f459d6e1", new Object[0])).booleanValue() : b;
    }

    public static void setIsRegisterSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f3ca99", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static void enableNotification(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd87e9c6", new Object[]{context, str, new Integer(i)});
        } else if (!c.a(context)) {
        } else {
            com.taobao.agoo.notification.a.a(context, str, i);
        }
    }

    public static boolean isNotificationEnabled(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8217fe59", new Object[]{context})).booleanValue() : com.taobao.agoo.notification.a.a(context);
    }

    /* loaded from: classes.dex */
    public static class b extends ICallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ICallback f8384a;

        static {
            kge.a(253631216);
        }

        public b(ICallback iCallback) {
            this.f8384a = iCallback;
            this.b = iCallback.b;
        }

        @Override // com.taobao.agoo.ICallback
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            ICallback iCallback = this.f8384a;
            if (iCallback != null) {
                iCallback.onSuccess();
            }
            d.a("accs", BaseMonitor.ALARM_SET_ALIAS, "");
        }

        @Override // com.taobao.agoo.ICallback
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            ICallback iCallback = this.f8384a;
            if (iCallback != null) {
                iCallback.onFailure(str, str2);
            }
            ALog.e("TaobaoRegister", "setAlias onFailure", "errCode", str, "errDesc", str2, "extra", this.b);
            d.a("accs", BaseMonitor.ALARM_SET_ALIAS, "", str, str2);
        }
    }

    /* loaded from: classes4.dex */
    public static class a extends ICallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ICallback f8383a;

        static {
            kge.a(507674100);
        }

        public a(ICallback iCallback) {
            this.f8383a = iCallback;
            this.b = iCallback.b;
        }

        @Override // com.taobao.agoo.ICallback
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            ICallback iCallback = this.f8383a;
            if (iCallback != null) {
                iCallback.onSuccess();
            }
            d.a("accs", BaseMonitor.ALARM_REMOVE_ALIAS, "");
        }

        @Override // com.taobao.agoo.ICallback
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            ICallback iCallback = this.f8383a;
            if (iCallback != null) {
                iCallback.onFailure(str, str2);
            }
            ALog.e("TaobaoRegister", "setAlias onFailure", "errCode", str, "errDesc", str2, "extra", this.b);
            d.a("accs", BaseMonitor.ALARM_REMOVE_ALIAS, "", str, str2);
        }
    }
}
