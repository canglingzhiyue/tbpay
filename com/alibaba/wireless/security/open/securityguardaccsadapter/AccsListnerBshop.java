package com.alibaba.wireless.security.open.securityguardaccsadapter;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.middletier.fc.FCAction;
import com.alibaba.wireless.security.open.middletier.fc.IFCActionCallback;
import com.alibaba.wireless.security.open.middletier.fc.IFCComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class AccsListnerBshop extends AccsAbstractDataListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String TAG = "CallbackListener";
    private static volatile IFCComponent ifcComponent;
    public static Context mContext;

    public static /* synthetic */ Object ipc$super(AccsListnerBshop accsListnerBshop, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.accs.base.AccsAbstractDataListener, com.taobao.accs.base.AccsDataListener
    public void onAntiBrush(boolean z, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec7a087d", new Object[]{this, new Boolean(z), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsAbstractDataListener, com.taobao.accs.base.AccsDataListener
    public void onConnected(TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df10c6", new Object[]{this, connectInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsAbstractDataListener, com.taobao.accs.base.AccsDataListener
    public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46188f6", new Object[]{this, connectInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    static {
        kge.a(1649328894);
        ifcComponent = null;
        mContext = null;
    }

    public AccsListnerBshop(Context context) {
        mContext = context;
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            return;
        }
        try {
            if (!isUIProcess() || bArr == null || bArr.length == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("location");
            if (string == null || string.length() == 0 || string2 == null || string2.length() == 0) {
                return;
            }
            IFCActionCallback iFCActionCallback = new IFCActionCallback() { // from class: com.alibaba.wireless.security.open.securityguardaccsadapter.AccsListnerBshop.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.wireless.security.open.middletier.fc.IFCActionCallback
                public void onAction(long j, FCAction.FCMainAction fCMainAction, long j2, HashMap hashMap) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c828ff09", new Object[]{this, new Long(j), fCMainAction, new Long(j2), hashMap});
                    }
                }

                @Override // com.alibaba.wireless.security.open.middletier.fc.IFCActionCallback
                public void onPreAction(long j, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c9a58b71", new Object[]{this, new Long(j), new Boolean(z)});
                    }
                }
            };
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(string2);
            hashMap.put("location", arrayList);
            getIfcComponent().processFCContent(Integer.valueOf(string).intValue(), hashMap, iFCActionCallback, IFCComponent.ResponseHeaderType.KVL);
        } catch (Exception unused) {
        }
    }

    private IFCComponent getIfcComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFCComponent) ipChange.ipc$dispatch("a51f6e8e", new Object[]{this});
        }
        if (ifcComponent == null) {
            synchronized (AccsListnerBshop.class) {
                if (ifcComponent == null) {
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put(IFCComponent.KEY_LOGIN_MODULE, true);
                        IFCComponent iFCComponent = (IFCComponent) SecurityGuardManager.getInstance(mContext, "").getInterface(IFCComponent.class);
                        ifcComponent = iFCComponent;
                        iFCComponent.setUp(mContext, hashMap);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return ifcComponent;
    }

    private AccsListnerBshop() {
    }

    private boolean isUIProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2432f35c", new Object[]{this})).booleanValue();
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) mContext.getSystemService("activity")).getRunningAppProcesses();
        String packageName = mContext.getPackageName();
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid && packageName.equals(runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }
}
