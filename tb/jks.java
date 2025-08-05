package tb;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.nav.Nav;
import com.taobao.android.tschedule.TScheduleWVPlugin;
import com.taobao.android.tschedule.parser.b;
import com.taobao.android.tschedule.parser.expr.edition.EditionInfo;
import com.taobao.android.tschedule.parser.expr.location.LocationInfo;
import com.taobao.android.tschedule.parser.expr.login.LoginInfo;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.login4android.api.Login;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class jks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1800046067);
    }

    public static /* synthetic */ b a(jks jksVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("8cea418e", new Object[]{jksVar}) : jksVar.a();
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        jmf.a("TScheduleLauncher init");
        q.a("TScheduleWVPlugin", (Class<? extends e>) TScheduleWVPlugin.class, false);
        final String valueOf = String.valueOf(hashMap.get("deviceId"));
        final String valueOf2 = String.valueOf(hashMap.get("ttid"));
        if (com.taobao.android.tschedule.e.a(application, new com.taobao.android.tschedule.b() { // from class: tb.jks.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.tschedule.b
            public String d() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("43881515", new Object[]{this}) : "com.taobao.taobao";
            }

            @Override // com.taobao.android.tschedule.b
            public String e() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "taobao_schedule";
            }

            @Override // com.taobao.android.tschedule.b
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : valueOf2;
            }

            @Override // com.taobao.android.tschedule.b
            public String b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : valueOf;
            }

            @Override // com.taobao.android.tschedule.b
            public String c() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("bd025a76", new Object[]{this}) : valueOf;
            }

            @Override // com.taobao.android.tschedule.b
            public b f() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (b) ipChange2.ipc$dispatch("361973f5", new Object[]{this}) : jks.a(jks.this);
            }
        })) {
            b();
            jmf.a("TScheduleLauncher init", new String[0]);
            return;
        }
        jmf.a("TScheduleLauncher init", "shutdown");
    }

    private b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("bbd24a30", new Object[]{this}) : new b() { // from class: tb.jks.2
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private LoginInfo b;
            private LocationInfo c;
            private EditionInfo d;

            @Override // com.taobao.android.tschedule.parser.b
            public LoginInfo a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (LoginInfo) ipChange2.ipc$dispatch("a4b0934d", new Object[]{this});
                }
                if (this.b == null) {
                    try {
                        this.b = new LoginInfo(Login.getUserId(), Login.getOldUserId(), Login.getUserName(), Login.getNick(), Login.getOldNick());
                    } catch (Throwable th) {
                        jkq.a("TS.ExprDataProvider", "prepare LoginInfo error", th);
                    }
                }
                return this.b;
            }

            @Override // com.taobao.android.tschedule.parser.b
            public LocationInfo b() {
                AnonymousClass2 anonymousClass2;
                TBLocationDTO b;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (LocationInfo) ipChange2.ipc$dispatch("ea84d920", new Object[]{this});
                }
                if (this.c == null) {
                    try {
                        b = TBLocationClient.b();
                        try {
                            anonymousClass2 = this;
                        } catch (Throwable th) {
                            th = th;
                            anonymousClass2 = this;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        anonymousClass2 = this;
                    }
                    try {
                        anonymousClass2.c = new LocationInfo(b.provinceCode, b.provinceName, b.cityCode, b.cityName, b.areaCode, b.areaName, b.longitude, b.latitude, String.valueOf(b.altitude), b.address, String.valueOf(b.timeStamp), String.valueOf(b.accuracy), b.countryCode, b.countryName, null);
                    } catch (Throwable th3) {
                        th = th3;
                        jkq.a("TS.ExprDataProvider", "get cahce location error", th);
                        return anonymousClass2.c;
                    }
                } else {
                    anonymousClass2 = this;
                }
                return anonymousClass2.c;
            }

            @Override // com.taobao.android.tschedule.parser.b
            public EditionInfo c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (EditionInfo) ipChange2.ipc$dispatch("7270321", new Object[]{this});
                }
                if (this.d == null) {
                    try {
                        PositionInfo b = com.taobao.android.editionswitcher.b.b(com.taobao.android.tschedule.e.b());
                        this.d = new EditionInfo(b.countryName, b.countryCode, b.countryNumCode, b.languageCode, b.actualLanguageCode, b.currencyCode, b.hngCookie, b.cityName, b.cityId, b.area, b.editionCode, b.isVillageUser);
                    } catch (Throwable th) {
                        jkq.a("TS.ExprDataProvider", "get cahce location error", th);
                    }
                }
                return this.d;
            }
        };
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            jmf.a("registerNavTrigger");
            if (jmh.a(jmg.SWITCH_KEY_ENABLE_NAV, false)) {
                Nav.registerPriorHooker(new Nav.e() { // from class: tb.jks.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.nav.Nav.e
                    public boolean a(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9c9cc21", new Object[]{this, context, intent})).booleanValue() : com.taobao.android.tschedule.e.i().a(intent);
                    }
                }, 2);
                Nav.registerLastPreprocessor(new Nav.h() { // from class: tb.jks.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.nav.Nav.h
                    public boolean beforeNavTo(Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue() : com.taobao.android.tschedule.e.i().b(intent);
                    }
                });
            }
            jmf.a("registerNavTrigger", new String[0]);
        } catch (Throwable th) {
            jkq.a("TS.Launcher", "registerNavTrigger error", th);
        }
    }
}
