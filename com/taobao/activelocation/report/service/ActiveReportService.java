package com.taobao.activelocation.report.service;

import android.app.IntentService;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.orange.OrangeConfig;
import com.taobao.passivelocation.domain.LBSDTO;
import com.taobao.passivelocation.domain.LBSWifiDTO;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.dcq;
import tb.dcu;
import tb.kge;

/* loaded from: classes4.dex */
public class ActiveReportService extends IntentService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FORE_GROUND_ACTION = "com.taobao.activelocation.report.service.FORE_GROUND_ACTION";
    public static final String LOCATION_CHANGE_ACTION = "com.taobao.activelocation.report.service.LOCATION_CHANGE_ACTION";
    public static final String LOCATION_ERROR_ACTION = "com.taobao.activelocation.report.service.LOCATION_ERROR_ACTION";
    public static final String REPORT_TIME_THRESHOLD_CKECKED = "report_time_threshold_checked";

    /* renamed from: a  reason: collision with root package name */
    private static long f8319a;
    private static long b;

    static {
        kge.a(-464152409);
        f8319a = 0L;
        b = 0L;
    }

    public ActiveReportService() {
        this("ActiveReportService");
    }

    public ActiveReportService(String str) {
        super(str);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (LOCATION_ERROR_ACTION.equals(str)) {
            if (currentTimeMillis - b < 300000) {
                return false;
            }
            b = currentTimeMillis;
        } else if (currentTimeMillis - f8319a < 300000) {
            return false;
        } else {
            f8319a = currentTimeMillis;
        }
        return true;
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1253e327", new Object[]{this, intent});
        } else {
            a(intent);
        }
    }

    public static void a(Intent intent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{intent});
        } else if ("off".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "activeReport", "off")) || intent == null || StringUtils.isEmpty(intent.getAction())) {
        } else {
            try {
                z = intent.getBooleanExtra(REPORT_TIME_THRESHOLD_CKECKED, false);
            } catch (Exception unused) {
                z = false;
            }
            String action = intent.getAction();
            if (!z && !a(action)) {
                return;
            }
            LBSDTO lbsdto = null;
            try {
                if (FORE_GROUND_ACTION.equals(action)) {
                    lbsdto = a((short) 2);
                } else if (LOCATION_CHANGE_ACTION.equals(action)) {
                    lbsdto = a((TBLocationDTO) intent.getParcelableExtra("locationdto"), (short) 0);
                } else if (LOCATION_ERROR_ACTION.equals(action)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(dcq.d, intent.getStringExtra(dcq.d));
                    hashMap.put(dcq.e, intent.getStringExtra(dcq.e));
                    LBSDTO lbsdto2 = new LBSDTO();
                    try {
                        a.b(lbsdto2);
                        a.c(lbsdto2);
                        a.a(lbsdto2);
                        a(hashMap, lbsdto2);
                        return;
                    } catch (Exception unused2) {
                        lbsdto = lbsdto2;
                    }
                }
            } catch (Exception unused3) {
            }
            if (lbsdto == null) {
                return;
            }
            JSONArray jSONArray = new JSONArray();
            try {
                a(lbsdto, jSONArray);
                if (jSONArray.length() <= 0) {
                    return;
                }
                a(jSONArray);
            } catch (Exception unused4) {
            }
        }
    }

    private static LBSDTO a(short s) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LBSDTO) ipChange.ipc$dispatch("2e8fd9f9", new Object[]{new Short(s)}) : a((TBLocationDTO) null, s);
    }

    private static LBSDTO a(TBLocationDTO tBLocationDTO, short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LBSDTO) ipChange.ipc$dispatch("85289349", new Object[]{tBLocationDTO, new Short(s)});
        }
        LBSDTO b2 = b(tBLocationDTO, s);
        a.b(b2);
        a.c(b2);
        a.a(b2);
        return b2;
    }

    private static void a(LBSDTO lbsdto, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead6072a", new Object[]{lbsdto, jSONArray});
            return;
        }
        a(lbsdto);
        try {
            String jSONString = JSON.toJSONString(lbsdto);
            if (StringUtils.isEmpty(jSONString)) {
                return;
            }
            jSONArray.put(new JSONObject(jSONString));
        } catch (Exception unused) {
        }
    }

    private static void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e9f902", new Object[]{jSONArray});
            return;
        }
        dcu dcuVar = new dcu(Globals.getApplication());
        dcuVar.registerRemoteListener(new DataReportListener());
        if (jSONArray == null || jSONArray.length() <= 0 || StringUtils.isEmpty(jSONArray.toString())) {
            return;
        }
        dcuVar.a(jSONArray.toString());
    }

    /* loaded from: classes4.dex */
    public static class DataReportListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1675571313);
            kge.a(-525336021);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            }
        }

        private DataReportListener() {
        }
    }

    private static void a(Map<String, String> map, LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f9d205", new Object[]{map, lbsdto});
            return;
        }
        dcu dcuVar = new dcu(Globals.getApplication());
        dcuVar.registerRemoteListener(new ErrorReportListener());
        if (lbsdto == null) {
            return;
        }
        dcuVar.a(map, lbsdto);
    }

    /* loaded from: classes4.dex */
    public static class ErrorReportListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1695295123);
            kge.a(-525336021);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            }
        }

        private ErrorReportListener() {
        }
    }

    private static void a(LBSDTO lbsdto) {
        LBSWifiDTO[] lBSWifiDTOArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53bf1e90", new Object[]{lbsdto});
        } else if (lbsdto != null && lbsdto.wifis != null) {
            for (LBSWifiDTO lBSWifiDTO : lbsdto.wifis) {
                String ssid = lBSWifiDTO.getSsid();
                if (!StringUtils.isEmpty(ssid)) {
                    lBSWifiDTO.setSsid(new String(android.taobao.util.a.a(ssid.getBytes())));
                }
            }
        }
    }

    private static LBSDTO b(TBLocationDTO tBLocationDTO, short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LBSDTO) ipChange.ipc$dispatch("6e30584a", new Object[]{tBLocationDTO, new Short(s)});
        }
        LBSDTO lbsdto = new LBSDTO();
        if (tBLocationDTO != null) {
            lbsdto.accuracy = tBLocationDTO.accuracy;
            lbsdto.hasLocation = true;
            lbsdto.latitude = Double.valueOf(Double.parseDouble(tBLocationDTO.latitude));
            lbsdto.longitude = Double.valueOf(Double.parseDouble(tBLocationDTO.longitude));
            lbsdto.altitude = tBLocationDTO.altitude;
            lbsdto.province = tBLocationDTO.provinceName;
            lbsdto.provinceCode = tBLocationDTO.provinceCode;
            lbsdto.city = tBLocationDTO.cityName;
            lbsdto.cityCode = tBLocationDTO.cityCode;
            lbsdto.area = tBLocationDTO.areaName;
            lbsdto.areaCode = tBLocationDTO.areaCode;
            lbsdto.address = tBLocationDTO.address;
            lbsdto.time = tBLocationDTO.timeStamp.longValue();
            lbsdto.version = 1;
        } else {
            lbsdto.hasLocation = false;
        }
        lbsdto.gatherType = s;
        return lbsdto;
    }
}
