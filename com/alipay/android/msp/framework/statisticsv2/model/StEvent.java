package com.alipay.android.msp.framework.statisticsv2.model;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ThreadSafeDateFormat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class StEvent implements IModel, IUpdateContinuous {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION = "action";
    public static final String ACTION_TYPE = "actionType";
    public static final String CONTENT_IGNORE = "";
    public static final String CONVERT_TIME = "convertTime";
    public static final String CURRENT_VIEW = "currentView";
    public static final String EVENT_TIME = "eventTime";
    public static final String FILL_DATE_TIME = "fillDateTime";
    public static final String NET_COST = "netCost";
    public static final String PARSE_TIME = "parseTime";
    public static final String PRE_TIME = "preTime";
    public static final String RECV_MSG = "recvMsg";
    public static final String SEND_MSG = "sendMsg";
    public static final String SERVER_COST = "serverCost";
    public static final String SHOW_TIME = "showTime";
    public static final String SHOW_WIN = "showWin";

    /* renamed from: a  reason: collision with root package name */
    private long[] f4865a;
    private Map<String, String> b = new HashMap(32);

    public StEvent() {
        updateEventTime();
    }

    public StEvent(String str, String str2, String str3) {
        this.b.clear();
        this.b.put(CURRENT_VIEW, c(str));
        this.b.put("actionType", str2);
        this.b.put("action", str3);
        updateEventTime();
    }

    public StEvent(StEvent stEvent) {
        if (stEvent == null) {
            return;
        }
        try {
            long[] jArr = stEvent.f4865a;
            this.f4865a = new long[7];
            System.arraycopy(jArr, 0, this.f4865a, 0, jArr.length);
            Map<String, String> map = stEvent.toMap();
            this.b.clear();
            if (map == null) {
                return;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.b.put(entry.getKey(), entry.getValue());
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
        if (r8.equals("action") != false) goto L11;
     */
    @Override // com.alipay.android.msp.framework.statisticsv2.model.IUpdateContinuous
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStatistic(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.statisticsv2.model.StEvent.onStatistic(java.lang.String, java.lang.String):void");
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : StringUtils.isEmpty(str) || StringUtils.equals(str, Grammar.ATTR_DEFAULT_VALUE);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        String str2 = null;
        char c = 65535;
        switch (str.hashCode()) {
            case -1833086944:
                if (str.equals(PARSE_TIME)) {
                    c = 4;
                    break;
                }
                break;
            case -1083976928:
                if (str.equals(CONVERT_TIME)) {
                    c = 3;
                    break;
                }
                break;
            case -338830486:
                if (str.equals(SHOW_TIME)) {
                    c = 6;
                    break;
                }
                break;
            case 757421630:
                if (str.equals(FILL_DATE_TIME)) {
                    c = 5;
                    break;
                }
                break;
            case 973271528:
                if (str.equals("eventStart")) {
                    c = 0;
                    break;
                }
                break;
            case 1082770363:
                if (str.equals(RECV_MSG)) {
                    c = 2;
                    break;
                }
                break;
            case 1979896537:
                if (str.equals(SEND_MSG)) {
                    c = 1;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f4865a = new long[7];
                this.f4865a[0] = SystemClock.elapsedRealtime();
                break;
            case 1:
                this.f4865a[1] = SystemClock.elapsedRealtime();
                StringBuilder sb = new StringBuilder();
                long[] jArr = this.f4865a;
                sb.append(jArr[1] - jArr[0]);
                str2 = sb.toString();
                str = PRE_TIME;
                break;
            case 2:
                this.f4865a[2] = SystemClock.elapsedRealtime();
                StringBuilder sb2 = new StringBuilder();
                long[] jArr2 = this.f4865a;
                sb2.append(jArr2[2] - jArr2[1]);
                str2 = sb2.toString();
                str = NET_COST;
                break;
            case 3:
                this.f4865a[3] = SystemClock.elapsedRealtime();
                if (this.f4865a[2] != 0) {
                    StringBuilder sb3 = new StringBuilder();
                    long[] jArr3 = this.f4865a;
                    sb3.append(jArr3[3] - jArr3[2]);
                    str2 = sb3.toString();
                    break;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    long[] jArr4 = this.f4865a;
                    sb4.append(jArr4[3] - jArr4[0]);
                    str2 = sb4.toString();
                    break;
                }
            case 4:
                this.f4865a[4] = SystemClock.elapsedRealtime();
                if (this.f4865a[3] != 0) {
                    StringBuilder sb5 = new StringBuilder();
                    long[] jArr5 = this.f4865a;
                    sb5.append(jArr5[4] - jArr5[3]);
                    str2 = sb5.toString();
                    break;
                }
                break;
            case 5:
                this.f4865a[5] = SystemClock.elapsedRealtime();
                if (this.f4865a[4] != 0) {
                    StringBuilder sb6 = new StringBuilder();
                    long[] jArr6 = this.f4865a;
                    sb6.append(jArr6[5] - jArr6[4]);
                    str2 = sb6.toString();
                    break;
                }
                break;
            case 6:
                this.f4865a[6] = SystemClock.elapsedRealtime();
                if (this.f4865a[5] != 0) {
                    StringBuilder sb7 = new StringBuilder();
                    long[] jArr7 = this.f4865a;
                    sb7.append(jArr7[6] - jArr7[5]);
                    str2 = sb7.toString();
                    break;
                }
                break;
        }
        if (str2 == null) {
            return;
        }
        this.b.put(str, str2);
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str}) : (str == null || !str.startsWith("QUICKPAY@")) ? str : str.replace("QUICKPAY@", "");
    }

    public void updateEventTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f328b45", new Object[]{this});
            return;
        }
        this.b.put(EVENT_TIME, ThreadSafeDateFormat.format(new Date(), "HH:mm:ss:SSS"));
        b("eventStart");
    }

    @Override // com.alipay.android.msp.framework.statisticsv2.model.IModel
    public Map<String, String> toMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this}) : this.b;
    }

    /* renamed from: clone */
    public StEvent m537clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StEvent) ipChange.ipc$dispatch("4ec555c5", new Object[]{this}) : new StEvent(this);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.b.keySet()) {
            sb.append(riy.BRACKET_START_STR + str + "," + this.b.get(str) + ") ");
        }
        return "StEvent{StInfo=" + sb.toString() + '}';
    }
}
