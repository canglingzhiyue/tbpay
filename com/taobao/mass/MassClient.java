package com.taobao.mass;

import android.content.ComponentName;
import android.os.Handler;
import android.os.HandlerThread;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.l;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.ProcessStateListener;
import java.util.Collections;
import java.util.List;
import tb.jzv;
import tb.kge;

/* loaded from: classes.dex */
public class MassClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private static volatile MassClient instance;
    public static volatile boolean topicRegistered;
    private Handler handler;
    private IMassService iMassService;

    public static /* synthetic */ IMassService access$002(MassClient massClient, IMassService iMassService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMassService) ipChange.ipc$dispatch("df0e84f5", new Object[]{massClient, iMassService});
        }
        massClient.iMassService = iMassService;
        return iMassService;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : TAG;
    }

    public static /* synthetic */ IMassService access$200(MassClient massClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMassService) ipChange.ipc$dispatch("8df9d544", new Object[]{massClient}) : massClient.getMassService();
    }

    static {
        kge.a(211191655);
        TAG = MassClient.class.getSimpleName();
        topicRegistered = false;
    }

    public static MassClient getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MassClient) ipChange.ipc$dispatch("b26aa7ac", new Object[0]);
        }
        if (instance == null) {
            synchronized (MassClient.class) {
                if (instance == null) {
                    instance = new MassClient();
                }
            }
        }
        return instance;
    }

    private MassClient() {
        HandlerThread handlerThread = new HandlerThread(TAG);
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
    }

    private IMassService getMassService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMassService) ipChange.ipc$dispatch("72e69fd3", new Object[]{this});
        }
        if (!l.d()) {
            return null;
        }
        if (this.iMassService == null) {
            final ComponentName componentName = new ComponentName(jzv.a(), AccsIPCProvider.class);
            try {
                this.iMassService = (IMassService) jzv.b(componentName, IMassService.class, new Pair[0]);
            } catch (IPCException e) {
                ALog.e(TAG, "[getMassService]", null, e);
            }
            jzv.a(new ProcessStateListener() { // from class: com.taobao.mass.MassClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.aranger.intf.ProcessStateListener
                public void onProcessStart(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("107b37c3", new Object[]{this, str});
                    }
                }

                @Override // com.taobao.aranger.intf.ProcessStateListener
                public void onProcessStop(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("72a7dcc3", new Object[]{this, str});
                        return;
                    }
                    try {
                        MassClient.access$002(MassClient.this, (IMassService) jzv.b(componentName, IMassService.class, new Pair[0]));
                    } catch (IPCException e2) {
                        ALog.e(MassClient.access$100(), "[getMassService]", null, e2);
                    }
                }
            });
        }
        return this.iMassService;
    }

    public void registerTopic(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba126267", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str2)) {
            ALog.e(TAG, "registerTopic error, topic is null", new Object[0]);
        } else if (!l.b()) {
        } else {
            topicRegistered = true;
            this.handler.post(new Runnable() { // from class: com.taobao.mass.MassClient.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        MassClient.access$200(MassClient.this).registerTopic(str, str2);
                    } catch (Exception e) {
                        ALog.e(MassClient.access$100(), "registerTopic error", e, new Object[0]);
                    }
                }
            });
        }
    }

    public void unregisterTopic(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56dc16e", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str2)) {
            ALog.e(TAG, "unregisterTopic error, topic is null", new Object[0]);
        } else if (!l.b()) {
        } else {
            this.handler.post(new Runnable() { // from class: com.taobao.mass.MassClient.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        MassClient.access$200(MassClient.this).unregisterTopic(str, str2);
                    } catch (Exception e) {
                        ALog.e(MassClient.access$100(), "unregisterTopic error", e, new Object[0]);
                    }
                }
            });
        }
    }

    public List<String> getTopicsByService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b740deb2", new Object[]{this, str});
        }
        try {
            return l.b() ? getMassService().getTopicsByService(str) : Collections.emptyList();
        } catch (Exception e) {
            ALog.e(TAG, "getTopicsByService error", e, new Object[0]);
            return Collections.emptyList();
        }
    }

    public boolean isNotEmpty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8421800f", new Object[]{this})).booleanValue() : topicRegistered && !getInstance().getTopicsByService("powermsg").isEmpty();
    }
}
