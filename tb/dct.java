package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.activelocation.mtop.pois.MtopPoiRequest;
import com.taobao.activelocation.mtop.pois.MtopPoiResponse;
import com.taobao.activelocation.mtop.pois.MtopPoiResponseData;
import com.taobao.activelocation.mtop.pois.Poi;
import com.taobao.activelocation.report.service.ActiveReportService;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.LocationErrorCode;
import com.taobao.location.common.LocationTypeEnum;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.location.common.TBPoiDetailDO;
import com.taobao.location.common.a;
import com.taobao.orange.OrangeConfig;
import com.taobao.passivelocation.PassiveLocationApplication;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.MtopConvert;

/* loaded from: classes4.dex */
public class dct implements dcs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAVI_RESULT = "tb_location_navi_result";
    private static dct c;
    private Handler b;
    private Context e;
    private final boolean f;
    private TBLocationDTO d = null;

    /* renamed from: a  reason: collision with root package name */
    private HandlerThread f26694a = new HandlerThread("location message process");

    static {
        kge.a(2002072149);
        kge.a(-1972026585);
    }

    public static /* synthetic */ Handler a(dct dctVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b1e9a703", new Object[]{dctVar}) : dctVar.b;
    }

    public static /* synthetic */ TBLocationDTO a(dct dctVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLocationDTO) ipChange.ipc$dispatch("cf367eb6", new Object[]{dctVar, hashMap}) : dctVar.a((HashMap<String, String>) hashMap);
    }

    public static /* synthetic */ List a(dct dctVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a3b516f0", new Object[]{dctVar, str, str2}) : dctVar.a(str, str2);
    }

    public static /* synthetic */ void a(dct dctVar, ITBLocationCallback iTBLocationCallback, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb836469", new Object[]{dctVar, iTBLocationCallback, tBLocationDTO});
        } else {
            dctVar.a(iTBLocationCallback, tBLocationDTO);
        }
    }

    public static /* synthetic */ void a(dct dctVar, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152e7273", new Object[]{dctVar, tBLocationDTO});
        } else {
            dctVar.b(tBLocationDTO);
        }
    }

    public static /* synthetic */ void a(dct dctVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ff7a42", new Object[]{dctVar, map});
        } else {
            dctVar.a(map);
        }
    }

    public static /* synthetic */ void b(dct dctVar, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e82c7b4", new Object[]{dctVar, tBLocationDTO});
        } else {
            dctVar.c(tBLocationDTO);
        }
    }

    public static /* synthetic */ dct c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dct) ipChange.ipc$dispatch("1e66e6a7", new Object[0]) : c;
    }

    public static /* synthetic */ void c(dct dctVar, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d71cf5", new Object[]{dctVar, tBLocationDTO});
        } else {
            dctVar.d(tBLocationDTO);
        }
    }

    public static synchronized dct b() {
        synchronized (dct.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dct) ipChange.ipc$dispatch("16b54148", new Object[0]);
            }
            if (c == null) {
                c = new dct();
            }
            return c;
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.e = context;
        }
    }

    private dct() {
        this.f26694a.start();
        this.b = new Handler(this.f26694a.getLooper()) { // from class: tb.dct.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 673877017) {
                    super.handleMessage((Message) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
                if (com.taobao.location.common.LocationTypeEnum.valueOfType(r9) == com.taobao.location.common.LocationTypeEnum.NLPLOCATION) goto L16;
             */
            @Override // android.os.Handler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void handleMessage(android.os.Message r11) {
                /*
                    r10 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = tb.dct.AnonymousClass1.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 1
                    if (r1 == 0) goto L15
                    r1 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r3 = 0
                    r1[r3] = r10
                    r1[r2] = r11
                    java.lang.String r11 = "282a8c19"
                    r0.ipc$dispatch(r11, r1)
                    return
                L15:
                    java.lang.Object r0 = r11.obj
                    com.taobao.location.aidl.ITBLocationCallback r0 = (com.taobao.location.aidl.ITBLocationCallback) r0
                    android.os.Bundle r1 = r11.getData()
                    int r3 = r11.what
                    if (r3 == 0) goto L9a
                    if (r3 == r2) goto L25
                    goto Le3
                L25:
                    java.util.HashMap r2 = new java.util.HashMap
                    r2.<init>()
                    java.lang.String r3 = tb.dcq.d
                    java.lang.String r4 = tb.dcq.d
                    java.lang.String r4 = r1.getString(r4)
                    r2.put(r3, r4)
                    java.lang.String r3 = tb.dcq.e
                    java.lang.String r4 = tb.dcq.e
                    java.lang.String r4 = r1.getString(r4)
                    r2.put(r3, r4)
                    java.lang.String r3 = tb.dcq.f26692a
                    boolean r3 = r1.containsKey(r3)
                    if (r3 == 0) goto L8b
                    java.lang.String r3 = tb.dcq.f26692a
                    int r9 = r1.getInt(r3)
                    java.lang.String r3 = tb.dcq.b
                    android.os.Parcelable r1 = r1.getParcelable(r3)
                    r5 = r1
                    com.taobao.location.common.TBLocationOption r5 = (com.taobao.location.common.TBLocationOption) r5
                    tb.dct r1 = tb.dct.this     // Catch: java.lang.Exception -> L6c
                    android.os.Handler r4 = tb.dct.a(r1)     // Catch: java.lang.Exception -> L6c
                    tb.dct r7 = tb.dct.c()     // Catch: java.lang.Exception -> L6c
                    r3 = r9
                    r6 = r0
                    r8 = r2
                    tb.dcr r1 = tb.dcv.a(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L6c
                    r1.a()     // Catch: java.lang.Exception -> L6c
                    goto L82
                L6c:
                    r1 = move-exception
                    java.lang.String r3 = "lbs_LocationManager"
                    java.lang.String r4 = "handleMessage, MSG_DO_LOCATION"
                    android.util.Log.e(r3, r4, r1)
                    tb.dct r1 = tb.dct.this
                    com.taobao.location.common.TBLocationDTO r3 = tb.dct.a(r1, r2)
                    tb.dct.a(r1, r0, r3)
                    tb.dct r0 = tb.dct.this
                    tb.dct.a(r0, r2)
                L82:
                    com.taobao.location.common.LocationTypeEnum r0 = com.taobao.location.common.LocationTypeEnum.valueOfType(r9)
                    com.taobao.location.common.LocationTypeEnum r1 = com.taobao.location.common.LocationTypeEnum.NLPLOCATION
                    if (r0 != r1) goto Le3
                    goto L94
                L8b:
                    tb.dct r1 = tb.dct.this
                    com.taobao.location.common.TBLocationDTO r3 = tb.dct.a(r1, r2)
                    tb.dct.a(r1, r0, r3)
                L94:
                    tb.dct r0 = tb.dct.this
                    tb.dct.a(r0, r2)
                    goto Le3
                L9a:
                    java.lang.String r2 = tb.dcq.c
                    android.os.Parcelable r2 = r1.getParcelable(r2)
                    com.taobao.location.common.TBLocationDTO r2 = (com.taobao.location.common.TBLocationDTO) r2
                    java.lang.String r3 = tb.dcq.b
                    android.os.Parcelable r1 = r1.getParcelable(r3)
                    com.taobao.location.common.TBLocationOption r1 = (com.taobao.location.common.TBLocationOption) r1
                    com.taobao.location.common.TBLocationOption$DataModel r3 = r1.getDataModel()
                    boolean r3 = r3.matchAddressModel(r2)
                    if (r3 != 0) goto Lb9
                    tb.dct r3 = tb.dct.this
                    tb.dct.a(r3, r2)
                Lb9:
                    com.taobao.location.common.TBLocationOption$DataModel r1 = r1.getDataModel()
                    boolean r1 = r1.matchPoiModel(r2)
                    if (r1 != 0) goto Lcf
                    tb.dct r1 = tb.dct.this
                    java.lang.String r3 = r2.latitude
                    java.lang.String r4 = r2.longitude
                    java.util.List r1 = tb.dct.a(r1, r3, r4)
                    r2.pois = r1
                Lcf:
                    tb.dct r1 = tb.dct.this
                    r1.a(r2)
                    tb.dct r1 = tb.dct.this
                    tb.dct.b(r1, r2)
                    tb.dct r1 = tb.dct.this
                    tb.dct.c(r1, r2)
                    tb.dct r1 = tb.dct.this
                    tb.dct.a(r1, r0, r2)
                Le3:
                    super.handleMessage(r11)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: tb.dct.AnonymousClass1.handleMessage(android.os.Message):void");
            }
        };
        this.f = PassiveLocationApplication.useService(Globals.getApplication());
    }

    private void a(ITBLocationCallback iTBLocationCallback, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9417caee", new Object[]{this, iTBLocationCallback, tBLocationDTO});
            return;
        }
        try {
            iTBLocationCallback.onLocationChanged(tBLocationDTO);
        } catch (RemoteException e) {
            Log.e("lbs_LocationManager", "结果回调异常", e);
        }
    }

    public void a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d6c9b8", new Object[]{this, tBLocationDTO});
            return;
        }
        this.d = tBLocationDTO;
        c(JSON.toJSONString(tBLocationDTO));
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            String path = Globals.getApplication().getFilesDir().getPath();
            FileOutputStream fileOutputStream = new FileOutputStream(path + "/tb_location_navi_result");
            fileOutputStream.write(str.getBytes());
            fileOutputStream.close();
        } catch (Exception e) {
            Log.e("lbs_LocationManager", "写缓存异常", e);
        }
    }

    private void c(String str) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if ("true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "isWriteFileSync", "true"))) {
            try {
                a.b.lock();
                b(str);
                try {
                    a.b.unlock();
                } catch (Throwable th) {
                    th = th;
                    sb = new StringBuilder();
                    sb.append("unlock error");
                    sb.append(th);
                    TLog.loge("lbs_LocationManager", sb.toString());
                }
            } catch (Throwable th2) {
                try {
                    TLog.loge("lbs_LocationManager", "writeFileWithAsync error = " + th2);
                    AppMonitor.Counter.commit("passivelocation", "writeFileWithAsyncError", 1.0d);
                    try {
                        a.b.unlock();
                    } catch (Throwable th3) {
                        th = th3;
                        sb = new StringBuilder();
                        sb.append("unlock error");
                        sb.append(th);
                        TLog.loge("lbs_LocationManager", sb.toString());
                    }
                } catch (Throwable th4) {
                    try {
                        a.b.unlock();
                    } catch (Throwable th5) {
                        TLog.loge("lbs_LocationManager", "unlock error" + th5);
                    }
                    throw th4;
                }
            }
        } else {
            b(str);
        }
    }

    private String d() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        try {
            str2 = Globals.getApplication().getFilesDir().getPath() + "/tb_location_navi_result";
        } catch (Exception e) {
            e = e;
            str = "";
        }
        if (!a(str2)) {
            return "";
        }
        FileInputStream fileInputStream = new FileInputStream(str2);
        byte[] bArr = new byte[fileInputStream.available()];
        fileInputStream.read(bArr);
        str = new String(bArr, "utf-8");
        try {
            fileInputStream.close();
        } catch (Exception e2) {
            e = e2;
            Log.e("lbs_LocationManager", "读缓存异常", e);
            return str;
        }
        return str;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // tb.dcs
    public TBLocationDTO a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("17ffc33e", new Object[]{this});
        }
        TBLocationDTO tBLocationDTO = this.d;
        if (tBLocationDTO != null) {
            return tBLocationDTO;
        }
        String d = d();
        if (!StringUtils.isEmpty(d)) {
            this.d = (TBLocationDTO) JSON.parseObject(d, TBLocationDTO.class);
        }
        return this.d;
    }

    public synchronized void a(TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback) {
        TBLocationDTO a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2445a5a", new Object[]{this, tBLocationOption, iTBLocationCallback});
        } else if (this.b == null) {
        } else {
            Message obtainMessage = this.b.obtainMessage(1, iTBLocationCallback);
            Bundle bundle = new Bundle();
            if ("on".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "allLocation", "on"))) {
                if (e() && (a2 = dcv.a(Globals.getApplication())) != null) {
                    a(a2);
                    a(iTBLocationCallback, a2);
                    return;
                }
                bundle.putInt(dcq.f26692a, LocationTypeEnum.MEMORYLOCATION.getType());
            } else {
                Log.e("lbs_LocationManager", "主动定位模块降级");
            }
            bundle.putParcelable(dcq.b, tBLocationOption);
            obtainMessage.setData(bundle);
            this.b.sendMessage(obtainMessage);
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        try {
            if (this.e != null) {
                if ((this.e.getApplicationInfo().flags & 2) != 0) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private TBLocationDTO a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("4d036ebb", new Object[]{this, hashMap});
        }
        TBLocationDTO tBLocationDTO = new TBLocationDTO();
        tBLocationDTO.isNavSuccess = false;
        tBLocationDTO.setErrorCode(Integer.valueOf(LocationErrorCode.FAIL.getCode()));
        if (hashMap != null) {
            String str = hashMap.get(dcq.d);
            String str2 = hashMap.get(dcq.e);
            if (str != null) {
                try {
                    tBLocationDTO.setErrorCode(Integer.valueOf(Integer.parseInt(str) + 1000));
                } catch (Exception unused) {
                }
            }
            if (str2 != null) {
                try {
                    tBLocationDTO.setErrorCode(Integer.valueOf(Integer.parseInt(str2)));
                } catch (Exception unused2) {
                }
            }
        }
        dcv.a(tBLocationDTO);
        return tBLocationDTO;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01db A[Catch: Throwable -> 0x021c, TryCatch #0 {Throwable -> 0x021c, blocks: (B:55:0x0178, B:57:0x0184, B:59:0x0196, B:61:0x019c, B:77:0x01c9, B:79:0x01db, B:81:0x01e1, B:83:0x01ef, B:85:0x0206, B:82:0x01ed, B:64:0x01a4, B:66:0x01aa, B:69:0x01b1, B:71:0x01ba, B:73:0x01c0), top: B:90:0x0178 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(com.taobao.location.common.TBLocationDTO r20) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dct.b(com.taobao.location.common.TBLocationDTO):void");
    }

    private List<TBPoiDetailDO> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c4a1d4b", new Object[]{this, str, str2});
        }
        ArrayList arrayList = new ArrayList();
        try {
            double parseDouble = Double.parseDouble(str);
            double parseDouble2 = Double.parseDouble(str2);
            MtopPoiRequest mtopPoiRequest = new MtopPoiRequest();
            mtopPoiRequest.setLatitude(parseDouble);
            mtopPoiRequest.setLongitude(parseDouble2);
            MtopResponse syncRequest = RemoteBusiness.build(Globals.getApplication(), mtopPoiRequest, TaoApplication.getTTID()).mo1342showLoginUI(false).mo1340setBizId(75).syncRequest();
            if (syncRequest.isApiSuccess()) {
                for (Poi poi : ((MtopPoiResponseData) MtopConvert.mtopResponseToOutputDO(syncRequest, MtopPoiResponse.class).mo2429getData()).getPois()) {
                    TBPoiDetailDO tBPoiDetailDO = new TBPoiDetailDO();
                    tBPoiDetailDO.name = poi.getName();
                    tBPoiDetailDO.type = poi.getType();
                    tBPoiDetailDO.tel = poi.getTel();
                    tBPoiDetailDO.distance = poi.getDistance();
                    tBPoiDetailDO.direction = poi.getDirection();
                    tBPoiDetailDO.address = poi.getAddress();
                    String location = poi.getLocation();
                    if (!location.isEmpty() && location.contains(",")) {
                        String[] split = location.split(",");
                        tBPoiDetailDO.longitude = split[0];
                        tBPoiDetailDO.latitude = split[1];
                    }
                    arrayList.add(tBPoiDetailDO);
                }
            }
        } catch (Exception e) {
            String str3 = "POI数据获取失败： " + e.getMessage();
        }
        return arrayList;
    }

    private void c(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41cb163a", new Object[]{this, tBLocationDTO});
        } else if (!ActiveReportService.a(ActiveReportService.LOCATION_CHANGE_ACTION)) {
        } else {
            try {
                final Intent intent = new Intent(ActiveReportService.LOCATION_CHANGE_ACTION);
                intent.putExtra("locationdto", tBLocationDTO);
                intent.putExtra(ActiveReportService.REPORT_TIME_THRESHOLD_CKECKED, true);
                intent.setPackage(Globals.getApplication().getPackageName());
                if (this.f) {
                    Globals.getApplication().startService(intent);
                } else {
                    this.b.post(new Runnable() { // from class: tb.dct.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ActiveReportService.a(intent);
                            }
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (!ActiveReportService.a(ActiveReportService.LOCATION_ERROR_ACTION)) {
        } else {
            try {
                final Intent intent = new Intent(ActiveReportService.LOCATION_ERROR_ACTION);
                if (map != null) {
                    intent.putExtra(dcq.d, map.get(dcq.d));
                    intent.putExtra(dcq.e, map.get(dcq.e));
                }
                intent.putExtra(ActiveReportService.REPORT_TIME_THRESHOLD_CKECKED, true);
                intent.setPackage(Globals.getApplication().getPackageName());
                if (this.f) {
                    Globals.getApplication().startService(intent);
                } else {
                    this.b.post(new Runnable() { // from class: tb.dct.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ActiveReportService.a(intent);
                            }
                        }
                    });
                }
            } catch (Exception e) {
                Log.e("lbs_LocationManager", "ErrorReport异常", e);
            }
        }
    }

    private void d(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7453c7b", new Object[]{this, tBLocationDTO});
            return;
        }
        try {
            Mtop.instance(Globals.getApplication(), TaoApplication.getTTID()).setCoordinates(tBLocationDTO.getLongitude(), tBLocationDTO.getLatitude());
        } catch (Exception e) {
            Log.e("lbs_LocationManager", "设置mtop接口经纬度异常", e);
        }
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (b.a().c(mqt.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC) == null) {
            TLog.loge("lbs_LocationManager", "AmapSearch 未远程化");
            return true;
        }
        g a2 = h.a(this.e);
        if (a2.a().contains(mqt.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC)) {
            TLog.loge("lbs_LocationManager", "AmapSearch 已安装");
            return true;
        }
        TLog.loge("lbs_LocationManager", "AmapSearch 未安装");
        ArrayList arrayList = new ArrayList();
        arrayList.add(mqt.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC);
        a2.a(arrayList);
        return false;
    }
}
