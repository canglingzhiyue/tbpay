package org.android.agoo.accs;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.d;
import com.taobao.agoo.TaobaoRegister;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.CallBack;
import org.android.agoo.common.Config;
import org.android.agoo.control.AgooFactory;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class AgooService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AGOOSERVICE_MESSAGE = "accs.agooService";
    private static final String TAG = "AgooService-";
    public static final CountDownLatch countDownLatch;
    public static CallBack mBindServiceCallback;
    public static CallBack mUnBindServiceCallback;
    private AgooFactory agooFactory;

    public static /* synthetic */ Object ipc$super(AgooService agooService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 413640386) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate();
            return null;
        }
    }

    public void excuteAccsData(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3044ad6", new Object[]{this, intent});
        }
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        }
    }

    static {
        kge.a(110571920);
        countDownLatch = new CountDownLatch(1);
    }

    @Override // com.taobao.accs.base.TaoBaseService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        ALog.d(TAG, "into--[onCreate]", new Object[0]);
        this.agooFactory = new AgooFactory();
        this.agooFactory.init(getApplicationContext(), null, null);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            return;
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(TAG, "into--[onData]:serviceId:" + str + ",dataId=" + str3, new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("push data:");
            sb.append(new String(bArr, Charset.forName("UTF-8")));
            ALog.d(TAG, sb.toString(), new Object[0]);
        }
        d.a("accs", BaseMonitor.COUNT_AGOO_TOTAL_ARRIVE, "total_arrive", mto.a.GEO_NOT_SUPPORT);
        try {
            this.agooFactory.saveMsg(bArr);
            this.agooFactory.msgRecevie(bArr, "accs", extraInfo);
        } catch (Throwable th) {
            ALog.e(TAG, "into--[onData,dealMessage]:error:" + th, new Object[0]);
        }
        a.f().execute(new Runnable() { // from class: org.android.agoo.accs.AgooService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (CallBack callBack : TaobaoRegister.pushListeners) {
                    try {
                        callBack.onSuccess();
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
            return;
        }
        if (ALog.isPrintLog(ALog.Level.E)) {
            ALog.e(TAG, "into--[onBind]:serviceId:" + str + ",errorCode=" + i, new Object[0]);
        }
        if (mBindServiceCallback != null && GlobalClientInfo.AGOO_SERVICE_ID.equals(str)) {
            if (i == 200) {
                mBindServiceCallback.onSuccess();
            } else {
                mBindServiceCallback.onFailure(String.valueOf(i), "bind Agoo service fail");
            }
        }
        mBindServiceCallback = null;
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
            return;
        }
        if (ALog.isPrintLog(ALog.Level.E)) {
            ALog.e(TAG, "into--[onUnbind]:serviceId:" + str + ",errorCode=" + i, new Object[0]);
        }
        if (mUnBindServiceCallback != null && GlobalClientInfo.AGOO_SERVICE_ID.equals(str)) {
            if (i == 200) {
                mUnBindServiceCallback.onSuccess();
            } else {
                mUnBindServiceCallback.onFailure(String.valueOf(i), "unbind Agoo service fail");
            }
        }
        mUnBindServiceCallback = null;
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
            return;
        }
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i(TAG, "onSendData,dataId=" + str2 + ",errorCode=" + i + ",serviceId=" + str, new Object[0]);
            }
            if (i == 200) {
                char c = 65535;
                if (str.hashCode() == -1051770333 && str.equals(AgooConstants.AGOO_SERVICE_AGOOACK)) {
                    c = 0;
                }
                d.a("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, "8/9", mto.a.GEO_NOT_SUPPORT);
                if (!StringUtils.isEmpty(str) && StringUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK) && Long.parseLong(str2) > 300000000 && Long.parseLong(str2) < 600000000) {
                    if (!ALog.isPrintLog(ALog.Level.I)) {
                        return;
                    }
                    ALog.i(TAG, "onSendData,AckData=" + str2 + ",serviceId=" + str, new Object[0]);
                } else if (StringUtils.isEmpty(str) || !StringUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK) || Long.parseLong(str2) <= 600000000 || !ALog.isPrintLog(ALog.Level.I)) {
                } else {
                    ALog.i(TAG, "onSendData,reportData=" + str2 + ",serviceId=" + str, new Object[0]);
                }
            } else if (!StringUtils.equals(AgooConstants.AGOO_SERVICE_AGOOACK, str)) {
            } else {
                Config.setReportTimes(getApplicationContext(), 1);
                d.a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, String.valueOf(i), mto.a.GEO_NOT_SUPPORT);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "onSendData exception,e=" + th.getMessage() + ",e.getStackMsg=" + getStackMsg(th), new Object[0]);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
            return;
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(TAG, "onResponse,dataId=" + str2 + ",errorCode=" + i + ",data=" + bArr + ",serviceId=" + str, new Object[0]);
        }
        String str3 = null;
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    str3 = new String(bArr, "utf-8");
                }
            } catch (Throwable th) {
                ALog.e(TAG, "onResponse get data error,e=" + th, new Object[0]);
            }
        }
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d(TAG, "onResponse,message=" + str3, new Object[0]);
        }
        if (i == 200 && StringUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK)) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.e(TAG, "request is success", "dataId", str2);
            }
            this.agooFactory.updateMsg(bArr, true);
        } else if (i != 200 && StringUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK)) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.e(TAG, "request is error", "dataId", str2, "errorid", Integer.valueOf(i));
            }
            Config.setReportTimes(getApplicationContext(), 1);
            d.a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, String.valueOf(i), mto.a.GEO_NOT_SUPPORT);
        } else if (!ALog.isPrintLog(ALog.Level.E)) {
        } else {
            ALog.e(TAG, "business request is error,message=" + str3, new Object[0]);
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    private String getStackMsg(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38cdb21", new Object[]{this, th});
        }
        StringBuffer stringBuffer = new StringBuffer();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer.append(stackTraceElement.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }
}
