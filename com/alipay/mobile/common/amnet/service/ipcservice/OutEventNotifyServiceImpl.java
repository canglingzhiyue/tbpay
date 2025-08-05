package com.alipay.mobile.common.amnet.service.ipcservice;

import android.content.Intent;
import android.text.TextUtils;
import com.alipay.mobile.common.amnet.api.AmnetManager;
import com.alipay.mobile.common.amnet.api.AmnetUserInfo;
import com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService;
import com.alipay.mobile.common.amnet.service.AmnetInitInfosHelper;
import com.alipay.mobile.common.amnet.service.util.AmnetManagerFactory;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class OutEventNotifyServiceImpl implements OutEventNotifyService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "OutEventNotifyServiceImpl";

    /* renamed from: a  reason: collision with root package name */
    private static OutEventNotifyServiceImpl f5385a;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private List<OutEventListener> e;

    public static final OutEventNotifyService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OutEventNotifyService) ipChange.ipc$dispatch("dd23300d", new Object[0]);
        }
        OutEventNotifyServiceImpl outEventNotifyServiceImpl = f5385a;
        if (outEventNotifyServiceImpl != null) {
            return outEventNotifyServiceImpl;
        }
        synchronized (OutEventNotifyServiceImpl.class) {
            if (f5385a != null) {
                return f5385a;
            }
            f5385a = new OutEventNotifyServiceImpl();
            return f5385a;
        }
    }

    private OutEventNotifyServiceImpl() {
    }

    public void addOutEventListener(OutEventListener outEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50125ce7", new Object[]{this, outEventListener});
        } else {
            b().add(outEventListener);
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifyAppLeaveEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf400562", new Object[]{this});
        } else if (!a().isActivated() || !this.b) {
        } else {
            this.b = false;
            a().getOutEventNotifyManager().notifyAppLeaveEvent();
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifyAppResumeEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4205f3c", new Object[]{this});
            return;
        }
        c();
        if (!a().isActivated() || this.b) {
            return;
        }
        this.b = true;
        a().getOutEventNotifyManager().notifyAppResumeEvent();
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifySeceenOnEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9434889c", new Object[]{this});
        } else if (!a().isActivated() || this.c) {
        } else {
            this.c = true;
            a().getOutEventNotifyManager().notifySeceenOnEvent();
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifySeceenOffEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b113b18", new Object[]{this});
        } else if (!a().isActivated() || !this.c) {
        } else {
            this.c = false;
            a().getOutEventNotifyManager().notifySeceenOffEvent();
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifyLoginOrLogoutEvent(String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d384136f", new Object[]{this, str, str2, bArr});
            return;
        }
        a().getOutEventNotifyManager().notifyLoginOrLogoutEvent(str, str2, bArr);
        AmnetInitInfosHelper.updateUserInfoForInitInfo(AmnetUserInfo.getUserId(), AmnetUserInfo.getSessionId());
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifyUpdateDnsInfo(byte b, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb7e565a", new Object[]{this, new Byte(b), str});
        } else if (!a().isActivated()) {
        } else {
            if (TextUtils.isEmpty(str)) {
                LogCatUtil.debug(TAG, "notifyUpdateDnsInfo,dnsType:" + ((int) b) + ",ipInfo is null,need't notify MNET");
                return;
            }
            a().getOutEventNotifyManager().notifyUpdateDnsInfo(b, str);
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void onSyncInitChanged(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64f75d4", new Object[]{this, map});
        } else {
            AmnetInitInfosHelper.updateSyncInitInfo(map);
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void receiveNetInfo(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b1a6cc", new Object[]{this, intent});
        } else if (!a().isActivated()) {
        } else {
            a().getOutEventNotifyManager().receiveNetInfo(intent);
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifySceneEvent(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6433e2ec", new Object[]{this, str, new Boolean(z)});
        } else if (!a().isActivated()) {
        } else {
            a().getOutEventNotifyManager().notifySceneEvent(str, z);
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifyResendSessionid(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7f3ec8", new Object[]{this, str, str2});
        } else if (!a().isActivated()) {
        } else {
            a().getOutEventNotifyManager().notifyResendSessionid(str, str2);
        }
    }

    public void notifyMainProcExistStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e8bb5a", new Object[]{this, new Integer(i)});
        } else if (!a().isActivated()) {
        } else {
            if (i == 1) {
                if (this.d) {
                    return;
                }
                this.d = true;
            } else if (!this.d) {
                return;
            } else {
                this.b = false;
                this.d = false;
            }
            a().getOutEventNotifyManager().notifyMainProcExistStateChanged(i);
        }
    }

    public void notifySwitchSmartHeartBeat(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f112cc", new Object[]{this, new Integer(i)});
        } else {
            a().getOutEventNotifyManager().notifySwitchSmartHeartBeat(i);
        }
    }

    public void notifySwitchOrtt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7294663c", new Object[]{this, new Integer(i)});
        } else {
            a().getOutEventNotifyManager().notifySwitchOrtt(i);
        }
    }

    public void notifySwitchDelayHandshake(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c83a30b", new Object[]{this, new Integer(i)});
        } else {
            a().getOutEventNotifyManager().notifySwitchDelayHandshake(i);
        }
    }

    public void resetEventStates() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f304a74", new Object[]{this});
            return;
        }
        this.b = false;
        this.c = false;
        this.d = false;
    }

    private AmnetManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AmnetManager) ipChange.ipc$dispatch("d8ce485c", new Object[]{this}) : AmnetManagerFactory.getInstance();
    }

    private List<OutEventListener> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new ArrayList(3);
        }
        return this.e;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        List<OutEventListener> list = this.e;
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                this.e.get(i).onAppResumeEvent();
            }
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "notifyAppResumeEvent2Listeners fail. ", th);
        }
    }
}
