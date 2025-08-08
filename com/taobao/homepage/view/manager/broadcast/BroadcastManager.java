package com.taobao.homepage.view.manager.broadcast;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.b;
import com.taobao.android.editionswitcher.e;
import com.taobao.android.editionswitcher.g;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.editionswitcher.request.HomeLocationResult;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.home.component.utils.i;
import com.taobao.android.task.Coordinator;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.n;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.a;
import com.taobao.tao.homepage.revision.ChangeContainerProcess;
import com.taobao.tao.recommend3.gateway.prefetch.notify.paysuccess.OrderFinishedBroadcastReceiver;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import tb.alj;
import tb.ghi;
import tb.ghj;
import tb.ghm;
import tb.ghp;
import tb.kge;
import tb.ksp;
import tb.kxf;
import tb.laq;
import tb.las;
import tb.lau;
import tb.lbo;
import tb.lbq;
import tb.oql;

/* loaded from: classes7.dex */
public class BroadcastManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_SPLASH_CLOSE = "ACTION_TAOBAO_BOOTIMAGE_COLDSTART_FLASH_CLOSE";
    public static final String ACTION_SPLASH_SHOW = "ACTION_TAOBAO_BOOTIMAGE_COLDSTART_FLASH_SHOW";

    /* renamed from: a  reason: collision with root package name */
    private lbq f17310a;
    private FestivalBroadcastReceiver b;
    private AreaChangeReceiver c;
    private SettingReceiver e;
    private OrderFinishedBroadcastReceiver g = new OrderFinishedBroadcastReceiver();

    static {
        kge.a(2081250744);
    }

    public BroadcastManager(lbo lboVar) {
        this.f17310a = lboVar.a();
        this.b = new FestivalBroadcastReceiver(this.f17310a);
        this.c = new AreaChangeReceiver(lboVar);
        this.e = new SettingReceiver(lboVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        lbq lbqVar = this.f17310a;
        Activity curActivity = lbqVar == null ? null : lbqVar.getCurActivity();
        if (curActivity != null) {
            curActivity.registerReceiver(this.b, new IntentFilter(FestivalMgr.ACTION_FESTIVAL_CHANGE));
        }
        Application application = Globals.getApplication();
        if (application != null) {
            LocalBroadcastManager.getInstance(application).registerReceiver(this.b, new IntentFilter(FestivalMgr.ACTION_FESTIVAL_CHANGE));
        }
        if (curActivity != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("EDITON_SWITCHER_EDITTION_CODE_CHANGED");
            intentFilter.addAction(b.ACTION_LOCATION_CHANGED);
            intentFilter.addAction("com.taobao.social.family.add");
            intentFilter.addAction(b.ACTION_LOCATION_RECEIVE);
            curActivity.registerReceiver(this.c, intentFilter);
        }
        LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(this.e, new IntentFilter("com.taobao.option.checkoption"));
        IntentFilter intentFilter2 = new IntentFilter(OrderFinishedBroadcastReceiver.ACTION_ORDER_DID_FINISHED);
        intentFilter2.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(this.g, intentFilter2);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.b != null) {
            this.f17310a.getCurActivity().unregisterReceiver(this.b);
            LocalBroadcastManager.getInstance(this.f17310a.getCurActivity()).unregisterReceiver(this.b);
            this.b = null;
        }
        if (this.c != null) {
            this.f17310a.getCurActivity().unregisterReceiver(this.c);
            this.c = null;
        }
        if (this.g == null) {
            return;
        }
        LocalBroadcastManager.getInstance(this.f17310a.getCurActivity()).unregisterReceiver(this.g);
    }

    public FestivalBroadcastReceiver c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FestivalBroadcastReceiver) ipChange.ipc$dispatch("2c6375ef", new Object[]{this}) : this.b;
    }

    /* loaded from: classes7.dex */
    public static class FestivalBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f17313a = true;
        public boolean b = false;
        public boolean c = false;
        public WeakReference<lbq> d;
        private boolean e;

        static {
            kge.a(-67779796);
        }

        public static /* synthetic */ Object ipc$super(FestivalBroadcastReceiver festivalBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public FestivalBroadcastReceiver(lbq lbqVar) {
            this.d = new WeakReference<>(lbqVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            ksp.c("BroadcastManager", "FestivalBroadcastReceiver.onReceive");
            lbq lbqVar = this.d.get();
            if (lbqVar == null || lbqVar.getCurActivity() == null) {
                return;
            }
            boolean a2 = a(intent.getStringExtra("extra-festival-change-reason"));
            if (this.f17313a) {
                if (!a2) {
                    return;
                }
                this.e = true;
            } else if (!a2) {
            } else {
                kxf.a().c(50034);
                kxf.a().c(50043);
            }
        }

        public void a() {
            lbq lbqVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f17313a = false;
            if (!this.e || (lbqVar = this.d.get()) == null || lbqVar.getCurActivity() == null) {
                return;
            }
            kxf.a().c(50034);
            kxf.a().c(50043);
            HomePageUtility.a(lbqVar.getCurActivity());
        }

        private boolean a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : !StringUtils.equals(str, FestivalMgr.SKIN_CHANGE_REASON_CONFIG_CHANGE) || !FestivalMgr.a().f();
        }
    }

    /* loaded from: classes7.dex */
    public static class AreaChangeReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<lbo> f17311a;

        static {
            kge.a(2087183928);
        }

        public static /* synthetic */ Object ipc$super(AreaChangeReceiver areaChangeReceiver, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public AreaChangeReceiver(lbo lboVar) {
            this.f17311a = new WeakReference<>(lboVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            ksp.c("BroadcastManager", "AreaChangeReceiver.onReceive");
            String action = intent.getAction();
            lbo lboVar = this.f17311a.get();
            if (lboVar == null || lboVar.a().getCurActivity() == null) {
                return;
            }
            HomeLocationResult homeLocationResult = null;
            if (StringUtils.equals(action, "EDITON_SWITCHER_EDITTION_CODE_CHANGED") && !n.n().j()) {
                i.b((String) null);
                alj.a().b("homepage", i.a());
                ksp.a("BroadcastManager", "AreaChangeReceiver homepage " + i.a());
                a(context);
                las.g();
                lau.a().c();
                kxf.a().c(50017);
                kxf.a().c(50020);
                ChangeContainerProcess.a().a(ChangeContainerProcess.ChangeContainerType.edition);
                oql.a().g();
                e.a(lboVar.a().getCurActivity());
            } else if (StringUtils.equals(action, b.ACTION_LOCATION_CHANGED) && !n.n().j()) {
                if (com.alibaba.ability.localization.b.c()) {
                    return;
                }
                Serializable serializableExtra = intent.getSerializableExtra(b.KEY_LOCATION_RESULT);
                if (serializableExtra instanceof HomeLocationResult) {
                    homeLocationResult = (HomeLocationResult) serializableExtra;
                }
                g.a(lboVar.a(), 0, homeLocationResult);
            } else if (StringUtils.equals(action, "com.taobao.social.family.add")) {
                a.a(context, b.REFRESH_SOURCE_OLD_USER_BIND);
            } else if (!StringUtils.equals(action, b.ACTION_LOCATION_RECEIVE) || n.n().j()) {
            } else {
                kxf.a().c(50018);
            }
        }

        private void a(Context context) {
            SimpleDateFormat simpleDateFormat;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
                return;
            }
            String str = l.b(context).hngCookie;
            if (StringUtils.isEmpty(str)) {
                return;
            }
            String replace = str.replace("|", "%7C");
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, 1);
            Date time = calendar.getTime();
            new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US).setTimeZone(TimeZone.getTimeZone("GMT"));
            String str2 = replace + ";" + ("expires=" + simpleDateFormat.format(time));
            try {
                CookieManager.getInstance().setCookie(".taobao.com", "hng=" + str2);
                CookieManager.getInstance().setCookie(".tmall.com", "hng=" + str2);
                a();
            } catch (Exception e) {
                com.taobao.android.home.component.utils.e.a("BroadcastManager", "writeCookie exception:", e);
            }
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                Coordinator.execute(new Runnable() { // from class: com.taobao.homepage.view.manager.broadcast.BroadcastManager.AreaChangeReceiver.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (Build.VERSION.SDK_INT < 21) {
                                CookieSyncManager.getInstance().sync();
                            } else {
                                CookieManager.getInstance().flush();
                            }
                        } catch (Exception e) {
                            com.taobao.android.home.component.utils.e.a("BroadcastManager", "writeCookie exception:", e);
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class SettingReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<lbo> f17314a;

        static {
            kge.a(2103108947);
        }

        public SettingReceiver(lbo lboVar) {
            this.f17314a = new WeakReference<>(lboVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            lbo lboVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (n.n().j() || (lboVar = this.f17314a.get()) == null || lboVar.a().getCurActivity() == null) {
            } else {
                String stringExtra = intent.getStringExtra("TaoOptionKey");
                if (StringUtils.isEmpty(stringExtra)) {
                    return;
                }
                String stringExtra2 = intent.getStringExtra(stringExtra);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(stringExtra, (Object) stringExtra2);
                String stringExtra3 = intent.getStringExtra(ParamsConstants.Key.PARAM_SCENE_CODE);
                laq.a().b("Broadcast").b("BroadcastManager.SettingReceiver.onReceive").a(stringExtra, stringExtra2).a(ParamsConstants.Key.PARAM_SCENE_CODE, stringExtra3).b();
                ((ghm) ghi.a(ghm.class)).doChangeVersion(ghj.a().a(stringExtra3).a(ghp.a().c(stringExtra2).b(jSONObject)), null);
            }
        }
    }
}
