package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.taobao.util.k;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.ScanFromEnum;
import com.etao.feimagesearch.capture.scan.m;
import com.taobao.android.base.Versions;
import com.taobao.android.scancode.common.object.ScancodeResult;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.barcode.business.GetMedicineUrlBussiness;
import com.taobao.taobao.scancode.barcode.business.a;
import com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.a;
import com.taobao.taobao.scancode.gateway.util.UrlModifyAdapter;
import com.taobao.taobao.scancode.gateway.util.d;
import com.taobao.taobao.scancode.gateway.util.i;
import com.taobao.taobao.scancode.gateway.util.j;
import com.taobao.taobao.scancode.gateway.util.p;
import com.taobao.taobao.scancode.gateway.util.r;
import com.taobao.taobao.scancode.history.object.Product;
import com.taobao.taobao.scancode.history.object.ScanDo;
import com.taobao.taobao.scancode.history.object.ScanList;
import com.taobao.taobao.scancode.huoyan.util.f;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import mtopsdk.common.util.SymbolExpUtil;

/* loaded from: classes8.dex */
public class oyg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HISTORY_TYPE_BARCODE = 1;
    public static final int HISTORY_TYPE_EXPRESS = 4;
    public static final int HISTORY_TYPE_GEN3 = 3;
    public static final int HISTORY_TYPE_QRCODE = 2;
    public static final int HISTORY_TYPE_UNKNOWN_CODE = 5;

    static {
        kge.a(-1379694726);
    }

    public static /* synthetic */ void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{new Integer(i), str});
        } else {
            b(i, str);
        }
    }

    public static /* synthetic */ void a(ScanList scanList, ScanDo scanDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d2c587", new Object[]{scanList, scanDo});
        } else {
            c(scanList, scanDo);
        }
    }

    public static /* synthetic */ void a(String str, Product product, ScanDo scanDo, Activity activity, css cssVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f191f226", new Object[]{str, product, scanDo, activity, cssVar});
        } else {
            b(str, product, scanDo, activity, cssVar);
        }
    }

    public static /* synthetic */ boolean a(Application application, ScanList scanList) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("29726051", new Object[]{application, scanList})).booleanValue() : b(application, scanList);
    }

    public static /* synthetic */ void b(ScanList scanList, ScanDo scanDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6fdac48", new Object[]{scanList, scanDo});
        } else {
            d(scanList, scanDo);
        }
    }

    public static ScanList a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScanList) ipChange.ipc$dispatch("48996695", new Object[]{application});
        }
        acv.a(application);
        String string = application.getSharedPreferences("ScanHistoryListDataPersistCacheKey", 0).getString("ScanHistoryListDataPersistCacheKey", "");
        ScanList scanList = null;
        if (!StringUtils.isEmpty(string)) {
            scanList = (ScanList) JSON.parseObject(string, ScanList.class);
        } else {
            k.a(oxy.TAG, "load Cache cache data not exist");
        }
        if (scanList != null) {
            return scanList;
        }
        ScanList scanList2 = new ScanList();
        scanList2.setList(new ArrayList());
        return scanList2;
    }

    private static boolean b(Application application, ScanList scanList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5823ca70", new Object[]{application, scanList})).booleanValue();
        }
        application.getSharedPreferences("ScanHistoryListDataPersistCacheKey", 0).edit().putString("ScanHistoryListDataPersistCacheKey", JSON.toJSONString(scanList)).commit();
        return true;
    }

    private static void c(ScanList scanList, ScanDo scanDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17289309", new Object[]{scanList, scanDo});
        } else if (scanList != null && scanList.getList() != null && scanDo != null) {
            String str = "insertScanHistoryDo " + JSON.toJSONString(scanDo);
            String link = scanDo.getLink();
            int i = 0;
            for (ScanDo scanDo2 : scanList.getList()) {
                if (link != null && link.equals(scanDo2.getLink())) {
                    break;
                }
                i++;
            }
            if (i < scanList.getList().size()) {
                scanList.getList().remove(i);
            }
            scanList.getList().add(0, scanDo);
            if (scanList.getList().size() <= 24) {
                return;
            }
            scanList.getList().remove(scanList.getList().size() - 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.oyg$1] */
    public static void a(final Application application, final ScancodeResult scancodeResult, final MaResult maResult, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da555db", new Object[]{application, scancodeResult, maResult, new Boolean(z)});
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: tb.oyg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    cot.c(oxy.TAG, "asyncInsertScanHistoryDoV2: scanResult=" + JSON.toJSONString(ScancodeResult.this) + "\n, decodeResult=" + JSON.toJSONString(maResult));
                    ScanDo scanDo = new ScanDo();
                    if (ScancodeResult.this.type == ScancodeType.QR) {
                        if (ScancodeResult.this.code.contains("taobao.com")) {
                            scanDo.setImage(0);
                            scanDo.setTitle("淘宝网网址");
                        } else if (ScancodeResult.this.code.contains("tmall.com")) {
                            scanDo.setImage(3);
                            scanDo.setTitle("天猫网网址");
                        } else if (ScancodeResult.this.code.startsWith(com.taobao.search.common.util.k.HTTP_PREFIX) || ScancodeResult.this.code.startsWith(com.taobao.search.common.util.k.HTTPS_PREFIX) || ScancodeResult.this.code.startsWith("www.") || ScancodeResult.this.code.startsWith("wap.")) {
                            scanDo.setImage(1);
                            scanDo.setTitle("二维码内容");
                        } else {
                            scanDo.setImage(2);
                            scanDo.setTitle("文本");
                        }
                        scanDo.setType(2);
                    } else if (ScancodeResult.this.type == ScancodeType.PRODUCT) {
                        scanDo.setImage(1);
                        scanDo.setTitle("商品条形码");
                        scanDo.setType(1);
                    } else if (ScancodeResult.this.type == ScancodeType.MEDICINE) {
                        scanDo.setImage(1);
                        scanDo.setTitle("药品条形码");
                        scanDo.setType(1);
                    } else if (ScancodeResult.this.type == ScancodeType.GEN3) {
                        scanDo.setImage(0);
                        scanDo.setTitle("淘宝网网址");
                        scanDo.setType(3);
                    } else if (ScancodeResult.this.type == ScancodeType.EXPRESS) {
                        if (oxy.j()) {
                            scanDo.setImage(1);
                            scanDo.setTitle("快递条形码");
                            scanDo.setType(4);
                        }
                    } else if (oxy.k()) {
                        scanDo.setImage(1);
                        scanDo.setTitle("普通条形码");
                        scanDo.setType(5);
                    }
                    if (!z && scanDo.getImage() != 2) {
                        scanDo.setDesc("连接网络获取详情");
                    }
                    scanDo.setNetworkAvailable(z);
                    scanDo.setLink(ScancodeResult.this.code);
                    scanDo.setTime(new Date().getTime());
                    scanDo.setDecodeResult(maResult);
                    ScanList a2 = oyg.a(application);
                    a2.setNetworkAvailable(z);
                    oyg.a(a2, scanDo);
                    oyg.a(application, a2);
                    return null;
                }
            }.execute(new Void[0]);
        }
    }

    public static void a(boolean z, Activity activity, ScanDo scanDo, css cssVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83dfcf14", new Object[]{new Boolean(z), activity, scanDo, cssVar});
        } else if (scanDo == null || activity == null) {
        } else {
            if (scanDo.getType() != 1 && scanDo.getType() != 2) {
                return;
            }
            Product product = scanDo.getProduct();
            String link = scanDo.getLink();
            Application application = activity.getApplication();
            if (!StringUtils.isEmpty(link) && !z && (scanDo.getType() == 1 || link.startsWith(com.taobao.search.common.util.k.HTTP_PREFIX) || link.startsWith(com.taobao.search.common.util.k.HTTPS_PREFIX) || link.startsWith("www.") || link.startsWith("wap."))) {
                p.a(activity.getLayoutInflater(), application, application.getString(R.string.scancode_no_network));
            } else {
                a(activity, link, product, scanDo, cssVar);
            }
        }
    }

    private static void a(final Activity activity, final String str, final Product product, final ScanDo scanDo, final css cssVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a119082", new Object[]{activity, str, product, scanDo, cssVar});
            return;
        }
        final Application application = activity.getApplication();
        if (new a(application).a(str, new a.InterfaceC0882a() { // from class: tb.oyg.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobao.scancode.barcode.business.a.InterfaceC0882a
            public void a(final String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.oyg.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (str == null || str.equals(str2) || StringUtils.isEmpty(str2) || str2.startsWith("alipays://")) {
                                oyg.a(str, product, scanDo, activity, cssVar);
                            } else {
                                try {
                                    oyg.a(scanDo.getType(), str);
                                    j.a(application, cssVar).a(str2);
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        }
                    });
                }
            }
        })) {
            return;
        }
        b(str, product, scanDo, activity, cssVar);
    }

    public static void a(boolean z, Activity activity, ScanDo scanDo, d dVar, css cssVar) {
        String scanFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448cd7ee", new Object[]{new Boolean(z), activity, scanDo, dVar, cssVar});
        } else if (a(scanDo)) {
            a(z, activity, scanDo, cssVar);
        } else {
            MaResult decodeResult = scanDo.getDecodeResult();
            ScancodeType a2 = oxy.a(decodeResult);
            if (a2 != null) {
                a(a2, scanDo.getLink());
            }
            if (m.a(activity)) {
                scanFrom = ScanFromEnum.SYS_HISTORY.getScanFrom();
            } else {
                scanFrom = ScanFromEnum.PLT_HISTORY.getScanFrom();
            }
            if (oxy.l()) {
                dVar.b(decodeResult, null, scanFrom);
            } else {
                dVar.a(activity, decodeResult, scanFrom);
            }
        }
    }

    private static boolean a(ScanDo scanDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9453cb5", new Object[]{scanDo})).booleanValue();
        }
        if (scanDo.getType() != 1 && scanDo.getType() != 2) {
            return false;
        }
        if (scanDo.getDecodeResult() == null) {
            cot.c(oxy.TAG, "decode result is null");
            return true;
        }
        cot.c(oxy.TAG, "decode result exists");
        return oxy.c();
    }

    private static void b(int i, String str) {
        ScancodeType scancodeType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf2bb84", new Object[]{new Integer(i), str});
        } else if (i < 0 || StringUtils.isEmpty(str)) {
        } else {
            if (i == 1) {
                if (com.taobao.android.scancode.common.util.a.b(str)) {
                    scancodeType = ScancodeType.MEDICINE;
                } else {
                    scancodeType = ScancodeType.PRODUCT;
                }
            } else if (i == 3) {
                scancodeType = ScancodeType.GEN3;
            } else if (i == 2) {
                scancodeType = ScancodeType.QR;
            } else {
                scancodeType = ScancodeType.ERROR;
            }
            CT ct = CT.Button;
            TBS.Adv.ctrlClickedOnPage("HuoyanHistory", ct, "HistoryClick", "content=" + str, "type=" + scancodeType.name().toLowerCase(Locale.getDefault()));
        }
    }

    private static void a(ScancodeType scancodeType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ee42bf", new Object[]{scancodeType, str});
        } else if (scancodeType == null || StringUtils.isEmpty(str)) {
        } else {
            CT ct = CT.Button;
            TBS.Adv.ctrlClickedOnPage("HuoyanHistory", ct, "HistoryClick", "content=" + str, "type=" + scancodeType.name().toLowerCase(Locale.getDefault()));
        }
    }

    private static void b(String str, Product product, final ScanDo scanDo, final Activity activity, final css cssVar) {
        IpChange ipChange = $ipChange;
        int i = 2;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5a5545", new Object[]{str, product, scanDo, activity, cssVar});
        } else if (activity == null) {
        } else {
            final oyc oycVar = new oyc(activity, cssVar);
            if (StringUtils.isEmpty(str)) {
                return;
            }
            b(scanDo.getType(), str);
            if (scanDo.getType() == 1) {
                if (product != null) {
                    i = product.getType();
                } else if (!com.taobao.android.scancode.common.util.a.b(scanDo.getLink())) {
                    i = 1;
                }
                if (!scanDo.isNetworkAvailable()) {
                    return;
                }
                if (i == 1) {
                    oycVar.b(str, i, null);
                } else {
                    new GetMedicineUrlBussiness(new GetMedicineUrlBussiness.b() { // from class: tb.oyg.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.taobao.scancode.barcode.business.GetMedicineUrlBussiness.b
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            LayoutInflater layoutInflater = activity.getLayoutInflater();
                            Context context = activity;
                            p.a(layoutInflater, context, context.getString(R.string.scancode_server_error));
                        }

                        @Override // com.taobao.taobao.scancode.barcode.business.GetMedicineUrlBussiness.b
                        public void a(String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                            } else {
                                oycVar.b(scanDo.getLink(), 3, str2);
                            }
                        }
                    }, str).handleMedicine();
                }
            } else if (str.startsWith(com.taobao.search.common.util.k.HTTP_PREFIX) || str.startsWith(com.taobao.search.common.util.k.HTTPS_PREFIX) || str.startsWith("www.") || str.startsWith("wap.")) {
                try {
                    String config = OrangeConfig.getInstance().getConfig("android_scancode_client", "host_switch_list", "");
                    if (!StringUtils.isEmpty(config)) {
                        String host = new URL(str).getHost();
                        String[] split = config.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                        int length = split.length;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            } else if (split[i2].equalsIgnoreCase(host)) {
                                str = f.a(str, host, "b.tb.cn");
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    String a2 = r.a(str, "_tbScancodeApproach_=scanHistory");
                    if (i.a(activity, a2)) {
                        return;
                    }
                    if (com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.a.a(a2)) {
                        com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.a.a(a2, new a.InterfaceC0885a() { // from class: tb.oyg.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.a.InterfaceC0885a
                            public void a(String str2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                                } else if (activity.isFinishing()) {
                                } else {
                                    j.a(activity, cssVar).a(str2);
                                }
                            }

                            @Override // com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.a.InterfaceC0885a
                            public void b(String str2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str2});
                                } else if (activity.isFinishing()) {
                                } else {
                                    j.a(activity, cssVar).a(str2);
                                }
                            }
                        });
                    } else {
                        new UrlModifyAdapter().a(a2, new UrlModifyAdapter.a() { // from class: tb.oyg.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.taobao.scancode.gateway.util.UrlModifyAdapter.a
                            public void a(String str2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                                    return;
                                }
                                try {
                                    if (activity.isFinishing()) {
                                        return;
                                    }
                                    j.a(activity, cssVar).a(str2);
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        });
                    }
                    if (!Versions.isDebug()) {
                        return;
                    }
                    String str2 = "onItemClick link = " + a2;
                } catch (Exception e) {
                    if (!Versions.isDebug()) {
                        return;
                    }
                    String str3 = "onItemClick e = " + e.toString();
                }
            } else {
                try {
                    TBMaterialDialog build = new TBMaterialDialog.Builder(activity).build();
                    build.setCancelable(true);
                    build.setMessage(str);
                    build.setCanceledOnTouchOutside(true);
                    build.show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{application});
        } else {
            application.getSharedPreferences("ScanHistoryListDataPersistCacheKey", 0).edit().putString("ScanHistoryListDataPersistCacheKey", "").commit();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.oyg$6] */
    public static void a(final Application application, final ScanDo scanDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de3e00", new Object[]{application, scanDo});
        } else if (scanDo == null) {
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: tb.oyg.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    ScanList a2 = oyg.a(application);
                    oyg.b(a2, scanDo);
                    oyg.a(application, a2);
                    return null;
                }
            }.execute(new Void[0]);
        }
    }

    private static void d(ScanList scanList, ScanDo scanDo) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("575379ca", new Object[]{scanList, scanDo});
        } else if (scanList != null && scanList.getList() != null && scanDo != null) {
            String link = scanDo.getLink();
            for (ScanDo scanDo2 : scanList.getList()) {
                if (link != null && link.equals(scanDo2.getLink())) {
                    break;
                }
                i++;
            }
            if (i >= scanList.getList().size()) {
                return;
            }
            scanDo.setDecodeResult(scanList.getList().remove(i).getDecodeResult());
            scanList.getList().add(i, scanDo);
        }
    }
}
