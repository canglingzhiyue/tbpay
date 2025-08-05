package com.taobao.android.editionswitcher;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.request.HomeLocationResult;
import com.taobao.android.editionswitcher.request.HomeLocationRet;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.login4android.api.Login;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bga;
import tb.gho;
import tb.ivm;
import tb.kge;
import tb.noa;

/* loaded from: classes5.dex */
public class LocationCallBack implements com.taobao.location.client.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_IP_BLACKLIST_CHECK = "com.alibaba.edition.action.ACTION_IP_BLACKLIST_CHECK";
    public static final String ELDER_HOME = "elderHome";
    public static final String ORIGIN_ELDER_HOME = "originElderHome";

    /* renamed from: a  reason: collision with root package name */
    private IRemoteBaseListener f12250a;
    private WeakReference<Context> b;
    private String c;
    private volatile boolean d = false;
    private boolean e = false;
    private a f;
    private b g;

    static {
        kge.a(-1778407523);
        kge.a(-394465787);
    }

    public static /* synthetic */ a a(LocationCallBack locationCallBack) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2f2205f3", new Object[]{locationCallBack}) : locationCallBack.f;
    }

    public static /* synthetic */ IRemoteBaseListener a(LocationCallBack locationCallBack, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteBaseListener) ipChange.ipc$dispatch("a4426a40", new Object[]{locationCallBack, iRemoteBaseListener});
        }
        locationCallBack.f12250a = iRemoteBaseListener;
        return iRemoteBaseListener;
    }

    public LocationCallBack(Context context, String str) {
        this.b = new WeakReference<>(context);
        this.f = new a(context, str);
        this.g = new b(context, str);
        this.c = str;
    }

    /* loaded from: classes5.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f12257a;
        private ColdStartPoplayerDoneReceiver b;
        private Runnable c;
        private boolean d;
        private Context e;

        static {
            kge.a(-2086001053);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ Runnable a(a aVar, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Runnable) ipChange.ipc$dispatch("c7108737", new Object[]{aVar, runnable});
            }
            aVar.c = runnable;
            return runnable;
        }

        public static /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cddafe3f", new Object[]{aVar});
            } else {
                aVar.b();
            }
        }

        public a(Context context, String str) {
            super(Looper.getMainLooper());
            this.f12257a = str;
            this.e = context;
            if ("coldStart".equals(str)) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(PopLayer.ACTION_FRAGMENT_SWITCH);
                this.b = new ColdStartPoplayerDoneReceiver(this);
                LocalBroadcastManager.getInstance(context).registerReceiver(this.b, intentFilter);
            }
        }

        public void a(final Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            } else if ("coldStart".equals(this.f12257a)) {
                post(new Runnable() { // from class: com.taobao.android.editionswitcher.LocationCallBack.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        a.a(a.this, runnable);
                        a.a(a.this);
                    }
                });
            } else {
                post(runnable);
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.d = true;
            b();
        }

        private void b() {
            Runnable runnable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (!this.d || (runnable = this.c) == null) {
            } else {
                postDelayed(runnable, 100L);
                this.d = false;
                this.c = null;
                LocalBroadcastManager.getInstance(this.e).unregisterReceiver(this.b);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class ColdStartPoplayerDoneReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private a f12255a;

        static {
            kge.a(-1167730840);
        }

        public ColdStartPoplayerDoneReceiver(a aVar) {
            this.f12255a = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            a aVar = this.f12255a;
            if (aVar == null) {
                return;
            }
            aVar.a();
        }
    }

    /* loaded from: classes5.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private ColdStartI8nBlacklistReceiver f12259a;

        static {
            kge.a(1515480178);
        }

        public b(Context context, String str) {
            super(Looper.getMainLooper());
            if ("coldStart".equals(str)) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(LocationCallBack.ACTION_IP_BLACKLIST_CHECK);
                this.f12259a = new ColdStartI8nBlacklistReceiver(this);
                LocalBroadcastManager.getInstance(context).registerReceiver(this.f12259a, intentFilter);
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (com.alibaba.ability.localization.b.b()) {
                TLog.loge("EditionSwitcher", "i18nboarding request checkBlack isSimplifiedChinese");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("source", "others");
                hashMap.put("userId", Login.getUserId());
                new ivm().a(hashMap, new IRemoteBaseListener() { // from class: com.taobao.android.editionswitcher.LocationCallBack$I18nBlacklistHandler$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        j.a(mtopResponse);
                        TLog.loge("EditionSwitcher", "i18nboarding request checkBlack onSystemFailure");
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        try {
                            HomeLocationResult homeLocationResult = ((HomeLocationRet) baseOutDo).data;
                            if (homeLocationResult == null || !homeLocationResult.i18nBlackIp || !com.alibaba.ability.localization.b.c()) {
                                return;
                            }
                            TLog.loge("EditionSwitcher", "i18nboarding request checkBlack show");
                            com.taobao.android.editionswitcher.boarding.a.a();
                        } catch (Exception e) {
                            TLog.loge("EditionSwitcher", "i18nboarding request checkBlack exception" + e);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        j.a(mtopResponse);
                        TLog.loge("EditionSwitcher", "i18nboarding request checkBlack exceptione");
                    }
                });
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class ColdStartI8nBlacklistReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private b f12254a;

        static {
            kge.a(-1751844700);
        }

        public ColdStartI8nBlacklistReceiver(b bVar) {
            this.f12254a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            b bVar = this.f12254a;
            if (bVar == null) {
                return;
            }
            bVar.a();
        }
    }

    @Override // com.taobao.location.client.a
    public void onLocationChanged(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
        } else if (this.d || tBLocationDTO == null) {
        } else {
            this.d = true;
            final Context context = this.b.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            if (tBLocationDTO.isNavSuccess()) {
                com.taobao.android.editionswitcher.b.b(context, "PREF_KEY_LOCATION_AREA", tBLocationDTO.getAreaName());
                TLog.loge("EditionPositionSwitcher", "EditionPositionSwitcher 定位成功");
                hashMap.put("provinceCode", tBLocationDTO.getProvinceCode());
                hashMap.put("address", tBLocationDTO.getAddress());
                hashMap.put(noa.KEY_CITY_CODE, tBLocationDTO.getCityCode());
                hashMap.put("latitude", tBLocationDTO.getLatitude());
                hashMap.put("longitude", tBLocationDTO.getLongitude());
                hashMap.put("areaCode", tBLocationDTO.getAreaCode());
            } else {
                TLog.loge("EditionPositionSwitcher", "EditionPositionSwitcher 定位失败");
                j.a(tBLocationDTO);
            }
            hashMap.put("userId", Login.getOldUserId());
            hashMap.put("source", this.c);
            this.f12250a = new IRemoteBaseListener() { // from class: com.taobao.android.editionswitcher.LocationCallBack.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    j.a(mtopResponse);
                    TLog.loge("EditionPositionSwitcher", "mtop.taobao.wireless.home.location onSystemFailure");
                    TLog.loge("EditionSwitcher", "i18nboarding location request onSystemFailure");
                    LocationCallBack.a(LocationCallBack.this, null);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    try {
                        HomeLocationResult homeLocationResult = ((HomeLocationRet) baseOutDo).data;
                        if (homeLocationResult.i18nBlackIp && com.alibaba.ability.localization.b.c()) {
                            com.taobao.android.editionswitcher.boarding.a.a();
                            return;
                        }
                        TLog.loge("EditionSwitcher", "i18nboarding location request success target edition: " + homeLocationResult.editionCode);
                        LocationCallBack.a(LocationCallBack.this, null);
                        com.taobao.android.editionswitcher.b.b();
                        com.taobao.android.editionswitcher.b.a(context, homeLocationResult);
                        TLog.loge("Page_Home", "EditionPositionSwitcher", homeLocationResult.editionCode + "通知location接口返回");
                        context.sendBroadcast(new Intent(com.taobao.android.editionswitcher.b.ACTION_LOCATION_RECEIVE));
                        TLog.loge("EditionPositionSwitcher", "发送位置接口返回广播");
                        if (homeLocationResult.yixiuTrack != null && (str = homeLocationResult.yixiuTrack.get("elderHome")) != null && str.contains("_")) {
                            String[] split = str.split("_");
                            if (split.length == 2) {
                                bga.c.a("HomePage", "elderHome", split[1], split[0]);
                            }
                        }
                        String str2 = "1".equals(homeLocationResult.elderHome) ? "1" : "0";
                        f.a().a(str2);
                        if ("OLD".equals(com.taobao.android.editionswitcher.b.b(context).editionCode)) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("elderHome", str2);
                            TBRevisionSwitchManager.i().a(hashMap2, false, 0);
                        }
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put(LocationCallBack.ORIGIN_ELDER_HOME, str2);
                        TBRevisionSwitchManager.i().a(hashMap3, false, 0);
                        Map<String, String> map = homeLocationResult.elderTags;
                        if (map == null) {
                            map = Collections.emptyMap();
                        }
                        TBRevisionSwitchManager.i().a(map, true, 0);
                        f.a().a(map);
                        TLog.loge("Page_Home", "EditionPositionSwitcher", "elderHomeForLocation=" + homeLocationResult.elderHome + "elderTags=" + map.get("evo_is_large_font"));
                        if (TextUtils.equals(homeLocationResult.isVillageUser, "y") && !com.taobao.android.editionswitcher.b.l(context)) {
                            if (TextUtils.equals(homeLocationResult.forceSwitch, "y")) {
                                com.taobao.android.editionswitcher.b.b(context, "CUN");
                                TBS.Ext.commitEvent(2201, "Page_Home", "edition-switcher-cun-force");
                                return;
                            } else if (com.taobao.android.editionswitcher.b.a(context, "PREF_KEY_CUN_USER_NOTIFY_TIME", (String) null) != null) {
                                return;
                            } else {
                                context.sendBroadcast(new Intent(com.taobao.android.editionswitcher.b.ACTION_LOCATION_CHANGED));
                                com.taobao.android.editionswitcher.core.b.a().a(null, new gho(com.taobao.android.editionswitcher.core.b.LOCATION_CHANGED));
                                Context context2 = context;
                                com.taobao.android.editionswitcher.b.b(context2, "PREF_KEY_CUN_USER_NOTIFY_TIME", "" + System.currentTimeMillis());
                                TBS.Ext.commitEvent(2201, "Page_Home", "edition-switcher-cun-alert");
                                return;
                            }
                        }
                        PositionInfo b2 = com.taobao.android.editionswitcher.b.b(context);
                        String str3 = b2.editionCode;
                        String str4 = homeLocationResult.editionCode;
                        if (!TextUtils.equals(str4, str3)) {
                            if (!TextUtils.equals("CN", str3) && !TextUtils.equals(str4, "CN") && (TextUtils.equals("CN", b2.countryCode) || TextUtils.equals("CN", homeLocationResult.countryId))) {
                                TLog.loge("EditionPositionSwitcher", String.format("%s %s 不能直接互切", str3, str4));
                            } else if (TextUtils.equals("OLD", str4) && (TextUtils.isEmpty(homeLocationResult.oldDialogTitle) || TextUtils.isEmpty(homeLocationResult.oldDialogSubTitle) || TextUtils.isEmpty(homeLocationResult.oldDialogContentImg))) {
                            } else {
                                if (TextUtils.equals("OLD", str4) && "1".equals(str2)) {
                                    LocationCallBack.a(LocationCallBack.this).a(new Runnable() { // from class: com.taobao.android.editionswitcher.LocationCallBack.1.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                return;
                                            }
                                            e.a(context);
                                            Log.e("lx", "OldinvitedElder");
                                        }
                                    });
                                } else if (!com.alibaba.ability.localization.b.c() && a(str4, 604800000L)) {
                                    long parseLong = Long.parseLong(com.taobao.android.editionswitcher.homepage.c.b(ivm.f29332a, "0"));
                                    TLog.loge("EditionPositionSwitcher", "i18nboarding check boarding mark timestamp: " + parseLong);
                                    if (System.currentTimeMillis() < parseLong + ivm.b && com.taobao.android.editionswitcher.boarding.a.b(homeLocationResult.editionCode)) {
                                        TBS.Ext.commitEvent("Page_Home", 2201, "htao_willshow-multiLangPop");
                                        com.taobao.android.editionswitcher.boarding.a.a(homeLocationResult.editionCode);
                                        return;
                                    }
                                    TLog.loge("EditionPositionSwitcher", "i18nboarding boarding mark timeout, run history path");
                                    if (homeLocationResult.ovsPopExt != null && 2 == homeLocationResult.ovsPopExt.ovsRemindKind && com.taobao.android.editionswitcher.b.a(homeLocationResult.editionCode)) {
                                        TBS.Ext.commitEvent("Page_Home", 2101, "htao_button-areaauto-confirm", null, null, "area=" + com.taobao.android.editionswitcher.b.c() + ",page_version=" + com.taobao.android.editionswitcher.b.b(context).editionCode + ",option=" + str4);
                                        com.taobao.android.editionswitcher.b.b(context, homeLocationResult.editionCode);
                                        return;
                                    }
                                    TLog.loge("EditionPositionSwitcher", str4 + "通知出现弹窗");
                                    context.sendBroadcast(new Intent(com.taobao.android.editionswitcher.b.ACTION_LOCATION_CHANGED));
                                    com.taobao.android.editionswitcher.core.b.a().a(null, new gho(com.taobao.android.editionswitcher.core.b.LOCATION_CHANGED));
                                    TLog.loge("EditionPositionSwitcher", "发送位置变化广播");
                                } else {
                                    TLog.loge("EditionSwitcher", "i18nboarding location request success fatigue hit once a week");
                                    TLog.loge("EditionPositionSwitcher", str4 + "一周内提示过了");
                                }
                            }
                        } else if (!TextUtils.equals("CN", str4) || !"1".equals(homeLocationResult.invitedElder) || f.c()) {
                        } else {
                            LocationCallBack.a(LocationCallBack.this).a(new Runnable() { // from class: com.taobao.android.editionswitcher.LocationCallBack.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    e.b(context);
                                    Log.e("lx", "OldinvitedElder");
                                }
                            });
                        }
                    } catch (Exception e) {
                        TLog.loge("EditionSwitcher", "location request suceess exception : " + e);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    j.a(mtopResponse);
                    TLog.loge("EditionPositionSwitcher", "mtop.taobao.wireless.home.location onFailure");
                    TLog.loge("EditionSwitcher", "i18nboarding location request onFailure");
                    LocationCallBack.a(LocationCallBack.this, null);
                }

                private boolean a(String str, long j) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("8123b0d6", new Object[]{this, str, new Long(j)})).booleanValue();
                    }
                    if (System.currentTimeMillis() - com.taobao.android.editionswitcher.b.c(context, str) <= j) {
                        z = false;
                    }
                    if (z) {
                        com.taobao.android.editionswitcher.b.d(context, str);
                    }
                    return z;
                }
            };
            TLog.loge("EditionSwitcher", "i18nboarding location request start...");
            new ivm().a(hashMap, this.f12250a);
        }
    }
}
