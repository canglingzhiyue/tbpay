package com.alipay.android.msp.framework.statisticsv2;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.statisticsv2.model.StBiz;
import com.alipay.android.msp.framework.statisticsv2.model.StError;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.alipay.android.msp.framework.statisticsv2.vector.VectorArrayData;
import com.alipay.android.msp.framework.statisticsv2.vector.VectorData;
import com.alipay.android.msp.pay.results.ResultStatus;
import com.alipay.android.msp.utils.DateUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class Recorder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<Vector, VectorArrayData> f4851a;
    private Map<Vector, VectorData> b;

    public Recorder(int i) {
        LogUtil.record(2, "Recorder:init<>", "start");
        this.b = new HashMap();
        this.b.put(Vector.Time, new VectorData(Vector.Time, i));
        this.b.put(Vector.Trade, new VectorData(Vector.Trade, i));
        this.b.put(Vector.App, new VectorData(Vector.App, i));
        this.b.put(Vector.Sdk, new VectorData(Vector.Sdk, i));
        this.b.put(Vector.Id, new VectorData(Vector.Id, i));
        this.b.put(Vector.Device, new VectorData(Vector.Device, i));
        this.b.put(Vector.Result, new VectorData(Vector.Result, i));
        this.f4851a = new HashMap();
        this.f4851a.put(Vector.Event, new VectorArrayData(Vector.Event, i));
        this.f4851a.put(Vector.Error, new VectorArrayData(Vector.Error, i));
        this.f4851a.put(Vector.Window, new VectorArrayData(Vector.Window, i));
        this.f4851a.put(Vector.Biz, new VectorArrayData(Vector.Biz, i));
        LogUtil.record(2, "Recorder:init<>", "end");
    }

    public synchronized String getAttr(Vector vector, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36342cff", new Object[]{this, vector, str});
        }
        String str2 = Grammar.ATTR_DEFAULT_VALUE;
        VectorData vectorData = null;
        switch (vector) {
            case Time:
                vectorData = this.b.get(Vector.Time);
                break;
            case Trade:
                vectorData = this.b.get(Vector.Trade);
                break;
            case App:
                vectorData = this.b.get(Vector.App);
                break;
            case Sdk:
                vectorData = this.b.get(Vector.Sdk);
                break;
            case Id:
                vectorData = this.b.get(Vector.Id);
                break;
            case Device:
                vectorData = this.b.get(Vector.Device);
                break;
            case Result:
                vectorData = this.b.get(Vector.Result);
                break;
        }
        if (vectorData != null) {
            str2 = vectorData.get(str);
        }
        return str2;
    }

    public synchronized void updateAttr(Vector vector, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00571fe", new Object[]{this, vector, str, str2});
            return;
        }
        VectorData vectorData = null;
        switch (vector) {
            case Time:
                vectorData = this.b.get(Vector.Time);
                break;
            case Trade:
                vectorData = this.b.get(Vector.Trade);
                break;
            case App:
                vectorData = this.b.get(Vector.App);
                break;
            case Sdk:
                vectorData = this.b.get(Vector.Sdk);
                break;
            case Id:
                vectorData = this.b.get(Vector.Id);
                break;
            case Device:
                vectorData = this.b.get(Vector.Device);
                break;
            case Result:
                vectorData = this.b.get(Vector.Result);
                break;
        }
        if (vectorData != null) {
            vectorData.put(str, str2);
        }
    }

    public synchronized void updateResult(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e8cc83", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        LogUtil.record(2, "Recorder#updateResult", StringUtils.isEmpty(str) ? "null" : str);
        VectorData vectorData = this.b.get(Vector.Result);
        if (vectorData == null) {
            return;
        }
        String str3 = "";
        LogUtil.record(2, "Recorder#updateResult", "not use regex");
        if (!StringUtils.isEmpty(str)) {
            str3 = a(str);
            if (StringUtils.isEmpty(str3)) {
                str3 = str;
            }
        }
        LogUtil.record(2, "Recorder#updateResult", "endCode:".concat(String.valueOf(str3)));
        vectorData.put("endCode", str3);
        vectorData.put("lastPage", str2);
        vectorData.put("clientEndCode", a(str3, vectorData.get("clientEndCode")));
        vectorData.put("execTime", String.valueOf(SystemClock.elapsedRealtime() - j));
    }

    private static String a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            for (String str2 : str.split(";")) {
                if (!StringUtils.isEmpty(str2) && str2.startsWith("resultStatus={")) {
                    return str2.substring(14, str2.length() - 1);
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return null;
    }

    public synchronized int addEvent(StEvent stEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6cba92e4", new Object[]{this, stEvent})).intValue();
        }
        return this.f4851a.get(Vector.Event).add(stEvent);
    }

    public synchronized int addWindow(StWindow stWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbddffa0", new Object[]{this, stWindow})).intValue();
        }
        return this.f4851a.get(Vector.Window).add(stWindow);
    }

    public synchronized void addError(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f49d433", new Object[]{this, str, str2, th});
            return;
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            this.f4851a.get(Vector.Error).add(new StError(str, str2, th, ""));
        }
    }

    public synchronized void addError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e3624c", new Object[]{this, str, str2, str3});
            return;
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            this.f4851a.get(Vector.Error).add(new StError(str, str2, str3));
        }
    }

    public synchronized void updateBiz(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abe5c54", new Object[]{this, map});
        } else if (map != null) {
            VectorArrayData vectorArrayData = this.f4851a.get(Vector.Biz);
            for (String str : map.keySet()) {
                vectorArrayData.add(new StBiz(str, map.get(str)));
            }
        }
    }

    public synchronized void addExternalError(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ea58b", new Object[]{this, str, str2, str3, str4});
            return;
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            this.f4851a.get(Vector.Error).add(new StError(str, str2, str3, str4));
        }
    }

    public synchronized void submit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8423f89f", new Object[]{this});
            return;
        }
        String format = format();
        if (VectorData.isEmpty(this.b.get(Vector.Result)) && VectorArrayData.isEmpty(this.f4851a.get(Vector.Event)) && VectorArrayData.isEmpty(this.f4851a.get(Vector.Error)) && VectorArrayData.isEmpty(this.f4851a.get(Vector.Window)) && VectorArrayData.isEmpty(this.f4851a.get(Vector.Biz))) {
            LogUtil.record(4, "phonecashiermsp#log", "StatisticInfo.Recorder.submit skip emptyLog", format);
            return;
        }
        String str = format.substring(0, format.length() - 1) + ",(" + DateUtil.format() + ")]";
        LogUtil.record(4, "phonecashiermsp#log", "StatisticInfo.Recorder.submit", str);
        LoggerFactory.getBehavorLogger().customContent(LogCategory.CATEGORY_ALIPAYSDK, str);
    }

    public String format() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9662a762", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        try {
            a(Vector.Id, "tid");
            a(Vector.Id, "userId");
            a(Vector.App, "appName");
            a(Vector.App, "appVersion");
            a(Vector.Sdk, "drmVersion");
            a(Vector.Trade, "bizType");
            sb.append(Grammar.RECORD_START[0]);
            for (Vector vector : Vector.getBaseVectorsWithOrder()) {
                sb.append(this.b.get(vector).format());
                sb.append(Grammar.CONTAINER_SEPARATOR[0]);
            }
            for (Vector vector2 : Vector.getArrayVectorsWithOrder()) {
                sb.append(this.f4851a.get(vector2).format());
                sb.append(Grammar.CONTAINER_SEPARATOR[0]);
            }
            if (Vector.getBaseVectorsWithOrder().length + Vector.getArrayVectorsWithOrder().length > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(Grammar.RECORD_END[0]);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return sb.toString();
    }

    private void a(Vector vector, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1e28bb", new Object[]{this, vector, str});
            return;
        }
        VectorData vectorData = null;
        try {
            switch (vector) {
                case Time:
                    vectorData = this.b.get(Vector.Time);
                    break;
                case Trade:
                    vectorData = this.b.get(Vector.Trade);
                    break;
                case App:
                    vectorData = this.b.get(Vector.App);
                    break;
                case Sdk:
                    vectorData = this.b.get(Vector.Sdk);
                    break;
                case Id:
                    vectorData = this.b.get(Vector.Id);
                    break;
                case Device:
                    vectorData = this.b.get(Vector.Device);
                    break;
                case Result:
                    vectorData = this.b.get(Vector.Result);
                    break;
            }
            if (vectorData == null) {
                return;
            }
            vectorData.reCheck(str);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str)) {
            return str2;
        }
        try {
            i = Integer.parseInt(str);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        if (i == ResultStatus.SUCCEEDED.getStatus() || i == ResultStatus.FRONT_CHANNEL_SEL.getStatus()) {
            return String.valueOf(ClientEndCode.SUCCESS);
        }
        if (i == ResultStatus.FAILED.getStatus() || i == ResultStatus.PARAMS_ERROR.getStatus()) {
            return String.valueOf(ClientEndCode.SERVERERROR_COMMON);
        }
        return (StringUtils.isEmpty(str2) || StringUtils.equals(str2, Grammar.ATTR_DEFAULT_VALUE)) ? String.valueOf(ClientEndCode.USEREXIT) : str2;
    }
}
