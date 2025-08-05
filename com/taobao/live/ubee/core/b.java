package com.taobao.live.ubee.core;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.ubee.mtop.report.ReportConfigData;
import com.taobao.live.ubee.mtop.report.ReportConfigRequest;
import com.taobao.live.ubee.mtop.report.ReportConfigResponse;
import com.taobao.live.ubee.utils.k;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ReportConfigManager";

    /* renamed from: a  reason: collision with root package name */
    private static ReportConfigData f17803a;
    private static long b;

    static {
        kge.a(-1882246631);
    }

    public static /* synthetic */ long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue();
        }
        b = j;
        return j;
    }

    public static /* synthetic */ ReportConfigData a(ReportConfigData reportConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReportConfigData) ipChange.ipc$dispatch("f9d66abe", new Object[]{reportConfigData});
        }
        f17803a = reportConfigData;
        return reportConfigData;
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        ReportConfigData reportConfigData = f17803a;
        if (reportConfigData == null) {
            return null;
        }
        return reportConfigData.config;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        ReportConfigData reportConfigData = f17803a;
        if (reportConfigData == null) {
            return null;
        }
        return reportConfigData.data;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (e()) {
        } else {
            d();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            k.a(new ReportConfigRequest(), new IRemoteBaseListener() { // from class: com.taobao.live.ubee.core.ReportConfigManager$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else if (mtopResponse == null) {
                    } else {
                        Log.e(b.TAG, "onSystemError: errorMsg = " + mtopResponse.getRetMsg() + "  errorCode = " + mtopResponse.getRetCode());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (!(baseOutDo instanceof ReportConfigResponse)) {
                    } else {
                        b.a(System.currentTimeMillis());
                        b.a(((ReportConfigResponse) baseOutDo).mo2429getData());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else if (mtopResponse == null) {
                    } else {
                        Log.e(b.TAG, "onError: errorMsg = " + mtopResponse.getRetMsg() + "  errorCode = " + mtopResponse.getRetCode());
                    }
                }
            }, ReportConfigResponse.class);
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        ReportConfigData reportConfigData = f17803a;
        if (reportConfigData != null && reportConfigData.config != null) {
            long longValue = f17803a.config.getLongValue("delay");
            long currentTimeMillis = System.currentTimeMillis() - b;
            Log.e(TAG, "interval = " + currentTimeMillis);
            if (currentTimeMillis < longValue * 1000) {
                return true;
            }
        }
        return false;
    }
}
