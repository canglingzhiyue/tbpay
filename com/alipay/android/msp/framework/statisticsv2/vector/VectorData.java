package com.alipay.android.msp.framework.statisticsv2.vector;

import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.collector.AppCollector;
import com.alipay.android.msp.framework.statisticsv2.collector.DeviceCollector;
import com.alipay.android.msp.framework.statisticsv2.collector.IAsyncCollectorCallback;
import com.alipay.android.msp.framework.statisticsv2.collector.IdCollector;
import com.alipay.android.msp.framework.statisticsv2.collector.ResultCollector;
import com.alipay.android.msp.framework.statisticsv2.collector.SdkCollector;
import com.alipay.android.msp.framework.statisticsv2.collector.TimeCollector;
import com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class VectorData implements IAsyncCollectorCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f4868a;
    private final Vector b;
    private final Map<String, String> c = new ConcurrentHashMap();

    public static /* synthetic */ Vector a(VectorData vectorData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Vector) ipChange.ipc$dispatch("d176a1bc", new Object[]{vectorData}) : vectorData.b;
    }

    public static /* synthetic */ String a(VectorData vectorData, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("11eea333", new Object[]{vectorData, str}) : vectorData.a(str);
    }

    public static /* synthetic */ Map b(VectorData vectorData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e519cd57", new Object[]{vectorData}) : vectorData.c;
    }

    public VectorData(Vector vector, int i) {
        this.f4868a = i;
        this.b = vector;
        TaskHelper.executeCursur(new Runnable() { // from class: com.alipay.android.msp.framework.statisticsv2.vector.VectorData.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                String[] attrs;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (String str : VectorData.a(VectorData.this).getAttrs()) {
                    if (!TextUtils.isEmpty(str)) {
                        String a2 = VectorData.a(VectorData.this, str);
                        if (!TextUtils.isEmpty(a2)) {
                            VectorData.b(VectorData.this).put(str, a2);
                        }
                    }
                }
            }
        });
    }

    public void put(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fc7a2a", new Object[]{this, str, str2});
        } else if (str == null || str2 == null) {
        } else {
            this.c.put(str, str2);
        }
    }

    public String get(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f6158a19", new Object[]{this, str}) : str != null ? this.c.get(str) : "";
    }

    public String format() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9662a762", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Grammar.CONTAINER_START[0]);
        String[] attrs = this.b.getAttrs();
        for (String str : attrs) {
            if (str != null) {
                String filter = Grammar.filter(this.c.get(str));
                if (TextUtils.isEmpty(filter)) {
                    filter = Grammar.ATTR_DEFAULT_VALUE;
                }
                sb.append(filter);
                sb.append(Grammar.FIELD_SEPARATOR[0]);
            }
        }
        if (attrs.length > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(Grammar.CONTAINER_END[0]);
        return sb.toString();
    }

    public static boolean isEmpty(VectorData vectorData) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("628b5965", new Object[]{vectorData})).booleanValue() : vectorData == null || (map = vectorData.c) == null || map.size() == 0;
    }

    @Override // com.alipay.android.msp.framework.statisticsv2.collector.IAsyncCollectorCallback
    public void reCheck(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dcbbb66", new Object[]{this, str});
        } else if (str == null) {
        } else {
            String str2 = this.c.get(str);
            if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str2, Grammar.ATTR_DEFAULT_VALUE)) {
                return;
            }
            String a2 = a(str);
            LogUtil.record(2, "Vector:reCheck", "atr=" + str + " , newAttrValue=" + a2);
            if (TextUtils.isEmpty(a2) || TextUtils.equals(a2, Grammar.ATTR_DEFAULT_VALUE)) {
                return;
            }
            this.c.put(str, a2);
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String str2 = Grammar.ATTR_DEFAULT_VALUE;
        try {
            switch (this.b) {
                case Time:
                    str2 = TimeCollector.collectData(str, this.f4868a);
                    break;
                case Trade:
                    str2 = TradeCollector.collectData(str, this.f4868a);
                    break;
                case App:
                    str2 = AppCollector.collectData(str, this.f4868a);
                    break;
                case Sdk:
                    str2 = SdkCollector.collectData(str);
                    break;
                case Id:
                    str2 = IdCollector.collectData(str, this.f4868a);
                    break;
                case Device:
                    str2 = DeviceCollector.asyncCollectData(str, this);
                    break;
                case Result:
                    str2 = ResultCollector.collectData(str);
                    break;
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return str2;
    }
}
