package com.taobao.passivelocation.report.service;

import android.app.Application;
import android.app.IntentService;
import android.content.Intent;
import android.location.Location;
import android.taobao.util.a;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.passivelocation.business.PassiveLocationBusiness;
import com.taobao.passivelocation.domain.LBSDTO;
import com.taobao.passivelocation.domain.LBSWifiDTO;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;
import tb.mto;
import tb.ndp;
import tb.ndr;
import tb.ndu;
import tb.ndw;
import tb.nea;

/* loaded from: classes7.dex */
public class LocationReportService extends IntentService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCATION_EXTRA_REPORT_ACTION = "location_extra_report_data";
    public static final String LOCATION_UPLOAD_ACTION = "com.taobao.passivelocation.report.service.LOCATION_UPLOAD_ACTION";
    public static final String LOCATION_UPLOAD_SINGLE_ACTION = "com.taobao.passivelocation.report.service.LOCATION_UPLOAD_SINGLE_ACTION";
    public static final String LOCATION_UPLOAD_START = "com.taobao.passivelocation.report.service.LOCATION_UPLOAD_START";
    private static final String LOG = "lbs_passive.report_LCPSER";

    static {
        kge.a(280363677);
    }

    public static /* synthetic */ Object ipc$super(LocationReportService locationReportService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1899989668) {
            super.onStart((Intent) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 413640386) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate();
            return null;
        }
    }

    public LocationReportService() {
        this("LocationReportService");
    }

    public LocationReportService(String str) {
        super(str);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        nea.d(LOG, "[onStart] onCreate invoked");
        super.onCreate();
        ndw.f31376a = getApplicationContext();
    }

    @Override // android.app.IntentService, android.app.Service
    public void onStart(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec0755c", new Object[]{this, intent, new Integer(i)});
            return;
        }
        nea.d(LOG, "[onStart] onStart invoked");
        super.onStart(intent, i);
        if (intent == null || StringUtils.isEmpty(intent.getAction())) {
        }
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1253e327", new Object[]{this, intent});
        } else if (intent == null || StringUtils.isEmpty(intent.getAction())) {
        } else {
            String action = intent.getAction();
            if (LOCATION_UPLOAD_SINGLE_ACTION.equals(action)) {
                return;
            }
            if (LOCATION_UPLOAD_ACTION.equals(action)) {
                doDowngradableUploadData(intent);
            } else {
                nea.d(LOG, "unknown location report source");
            }
        }
    }

    private void doDowngradableUploadData(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ec61e4", new Object[]{this, intent});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig("gps", "reportSwitch", "on");
        if ("on".equalsIgnoreCase(config)) {
            nea.d(LOG, "report switch is on, reportSwitch=" + config);
            uploadLocationData(intent);
            return;
        }
        nea.d(LOG, "report switch is off, reportSwitch=" + config);
    }

    public void uploadLocationData(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912180e4", new Object[]{this, intent});
            return;
        }
        nea.d(LOG, "data report begin");
        JSONArray jSONArray = new JSONArray();
        Location location = null;
        try {
            if (intent.hasExtra(LOCATION_EXTRA_REPORT_ACTION)) {
                location = (Location) intent.getExtras().get(LOCATION_EXTRA_REPORT_ACTION);
            }
            if (location != null && location.getLongitude() > mto.a.GEO_NOT_SUPPORT && location.getLatitude() > mto.a.GEO_NOT_SUPPORT) {
                nea.d(LOG, "processReportData(cursor, array) invoked");
                processReportData(location, jSONArray);
                nea.d(LOG, "doDataReport(array)");
                if (jSONArray.length() > 0) {
                    doDataReport(jSONArray);
                    ndw.c = false;
                    return;
                }
                nea.d(LOG, "JSONArray is null!");
                return;
            }
            nea.d(LOG, "no data to report, report progress ends");
        } catch (Exception e) {
            nea.d(LOG, "upload data error: " + e.getMessage());
        }
    }

    private void doDataReport(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a0a10a", new Object[]{this, jSONArray});
            return;
        }
        nea.d(LOG, "doDataReport invoked");
        PassiveLocationBusiness passiveLocationBusiness = new PassiveLocationBusiness((Application) ndw.f31376a);
        passiveLocationBusiness.registerRemoteListener(new UpdateLocationBizListener());
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        nea.d(LOG, "data to be reported through MTOP：" + jSONArray.toString());
        String jSONArray2 = jSONArray.toString();
        if (!StringUtils.isEmpty(jSONArray2)) {
            nea.d(LOG, "report data is: " + jSONArray2);
            passiveLocationBusiness.reportLbsData(jSONArray.toString());
            return;
        }
        nea.d(LOG, "report data is null!");
    }

    private void processReportData(Location location, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457e2318", new Object[]{this, location, jSONArray});
            return;
        }
        LBSDTO storeLocationData = storeLocationData(location);
        doBase64Wifis(storeLocationData);
        if (ndr.b) {
            storeLocationData.setGatherType((short) 2);
        } else {
            storeLocationData.setGatherType((short) 1);
        }
        try {
            String jSONString = JSON.toJSONString(storeLocationData);
            if (!StringUtils.isEmpty(jSONString)) {
                jSONArray.put(new JSONObject(jSONString));
            } else {
                nea.d(LOG, "this data is null");
            }
        } catch (Exception unused) {
            nea.d(LOG, "an exception occurs when doing data transition");
        }
    }

    private LBSDTO storeLocationData(Location location) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LBSDTO) ipChange.ipc$dispatch("99793c73", new Object[]{this, location}) : ndu.a(location);
    }

    private void doBase64Wifis(LBSDTO lbsdto) {
        LBSWifiDTO[] wifis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edce9753", new Object[]{this, lbsdto});
        } else if (lbsdto == null || lbsdto.getWifis() == null) {
            if (lbsdto == null) {
                return;
            }
            nea.d(LOG, "isTimeOnly=" + lbsdto.isTimeOnly());
        } else {
            for (LBSWifiDTO lBSWifiDTO : lbsdto.getWifis()) {
                String ssid = lBSWifiDTO.getSsid();
                if (!StringUtils.isEmpty(ssid)) {
                    lBSWifiDTO.setSsid(new String(a.a(ssid.getBytes())));
                } else {
                    nea.d(LOG, "ssid=" + ssid + "，data：" + JSON.toJSONString(lBSWifiDTO));
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public class UpdateLocationBizListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-810995454);
            kge.a(-525336021);
        }

        private UpdateLocationBizListener() {
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            nea.d(LocationReportService.LOG, "[onError] deleting data");
            deleteData(mtopResponse, false);
            nea.d(LocationReportService.LOG, "[onError] delete data success");
        }

        private void deleteData(MtopResponse mtopResponse, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a0f7033", new Object[]{this, mtopResponse, new Boolean(z)});
            } else if (mtopResponse == null || StringUtils.isEmpty(mtopResponse.getRetCode()) || mtopResponse.getRetCode().startsWith("FAIL_SYS")) {
            } else {
                nea.d(LocationReportService.LOG, "retCode=" + mtopResponse.getRetCode());
                try {
                    nea.d(LocationReportService.LOG, "delete data operation done");
                    if (z) {
                        return;
                    }
                    ndp.a(null);
                } catch (Exception unused) {
                    nea.a(LocationReportService.LOG, "delete data operation failed");
                }
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            nea.d(LocationReportService.LOG, "[onSuccess] deleting data");
            deleteData(mtopResponse, true);
            nea.d(LocationReportService.LOG, "[onSuccess] delete data success");
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            nea.d(LocationReportService.LOG, "[onSystemError] deleting data");
            deleteData(mtopResponse, false);
            nea.d(LocationReportService.LOG, "[onSystemError] delete data success");
        }
    }
}
