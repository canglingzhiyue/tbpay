package com.taobao.tao;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.modular.b;
import com.taobao.android.nav.Nav;
import com.taobao.android.nav.jump.JumpAbility;
import com.taobao.android.nav.jump.a;
import com.taobao.android.nav.n;
import com.taobao.android.task.Coordinator;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.tao.log.TLog;
import com.taobao.tao.tbmainfragment.SupportActivity;
import com.taobao.tao.tbmainfragment.s;
import com.taobao.tao.util.TBMainLog;
import com.taobao.taobao.R;
import com.taobao.weex.adapter.TBWXNavPreProcessor;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tb.fpz;
import tb.gmm;
import tb.kge;
import tb.omh;
import tb.rjl;
import tb.scr;
import tb.scs;

/* loaded from: classes.dex */
public class InitNav implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, String> sFragmentMap;

    public static /* synthetic */ String access$100(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("30255a5e", new Object[]{str}) : simpleUrl(str);
    }

    static {
        kge.a(1496818771);
        kge.a(1028243835);
        sFragmentMap = new HashMap<String, String>() { // from class: com.taobao.tao.InitNav.1
            {
                put("miniDetail", "com.alibaba.triver.triver_weex.minidetail.MiniDetailWeexFragment");
            }
        };
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        Nav.initSwitch(application);
        Nav.setProcessorMonitor(new n() { // from class: com.taobao.tao.InitNav.2
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int b;
            private long c = 0;
            private String d = "";
            private String e = "";
            private int f = -1;

            public static /* synthetic */ void a(AnonymousClass2 anonymousClass2, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("eaac0aa", new Object[]{anonymousClass2, str, str2});
                } else {
                    anonymousClass2.b(str, str2);
                }
            }

            private void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                this.c = 0L;
                this.d = "";
            }

            private String a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
                }
                return str + ":" + str2 + ",";
            }

            private void b(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                    return;
                }
                try {
                    AppMonitor.Counter.commit("Nav", str, str2, 1.0d);
                    TLog.loge("Nav", "InitNav", "count app monitor, point is " + str + ", value is " + str2);
                } catch (Throwable th) {
                    TLog.loge("Nav", "InitNav", "count failed" + th);
                }
            }

            private void a(final String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    Coordinator.execute(new Runnable() { // from class: com.taobao.tao.InitNav.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            for (String str2 : StringUtils.split(str, "##")) {
                                AnonymousClass2.a(AnonymousClass2.this, "NavDuration", str2);
                            }
                        }
                    });
                }
            }

            @Override // com.taobao.android.nav.n
            public void a(Context context, com.taobao.android.nav.e eVar, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3cdc14db", new Object[]{this, context, eVar, new Long(j)});
                } else {
                    a(context, eVar.name(), j);
                }
            }

            @Override // com.taobao.android.nav.n
            public void a(Context context, String str, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d51105da", new Object[]{this, context, str, new Long(j)});
                } else if (this.b > 0) {
                } else {
                    this.d += a("uri", this.e);
                    this.d += a("name", str);
                    this.d += a("dur", String.valueOf(j));
                    this.d += "##";
                }
            }

            @Override // com.taobao.android.nav.n
            public void a(Context context, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("61b6362a", new Object[]{this, context, str});
                    return;
                }
                this.b = new Random().nextInt(com.taobao.tao.tbmainfragment.d.h());
                if (this.b > 0) {
                    TLog.loge("Nav", "InitNav", "random threshold: " + this.b + ", so skip monitor");
                    return;
                }
                a();
                this.e = str;
                this.c = SystemClock.uptimeMillis();
            }

            @Override // com.taobao.android.nav.n
            public void b(Context context, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b80d809", new Object[]{this, context, str});
                } else if (this.b > 0) {
                } else {
                    this.d += a("uri", this.e);
                    this.d += a("total", String.valueOf(SystemClock.uptimeMillis() - this.c));
                    a(this.d);
                    this.b = 1000000;
                }
            }

            @Override // com.taobao.android.nav.n
            public void a(Context context, String str, Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("47d01c0b", new Object[]{this, context, str, th});
                    return;
                }
                if (this.f == -1) {
                    this.f = new Random().nextInt(com.taobao.tao.tbmainfragment.d.i());
                }
                if (this.f > 0) {
                    return;
                }
                String a2 = a(PushMessageHelper.ERROR_TYPE, str);
                b("NavError", a2 + a(MUSAppMonitor.ERROR_MSG, th.toString()));
            }
        });
        com.taobao.android.modular.c.a(new b() { // from class: com.taobao.tao.InitNav.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.modular.b
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else {
                    TLog.loge(str, str2);
                }
            }

            @Override // com.taobao.android.modular.b
            public void a(String str, String str2, Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c430ebf9", new Object[]{this, str, str2, th});
                } else {
                    TLog.loge(str, str2, th);
                }
            }

            @Override // com.taobao.android.modular.b
            public void b(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                } else {
                    TLog.logw(str, str2);
                }
            }

            @Override // com.taobao.android.modular.b
            public void b(String str, String str2, Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("586f5b98", new Object[]{this, str, str2, th});
                } else {
                    TLog.logw(str, str2, th);
                }
            }
        });
        Nav.setNavResolver(new com.taobao.android.nav.g());
        Nav.setTransition(R.anim.push_left_in, R.anim.push_left_out);
        Nav.registerPriorHooker(new com.alibaba.analytics.e(), 1);
        a.a().a(new JumpAbility() { // from class: com.taobao.tao.InitNav.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.nav.jump.JumpAbility
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : JumpAbility.JUMP_ABILITY_FLOATING_WINDOW;
            }

            @Override // com.taobao.android.nav.jump.JumpAbility
            public boolean a(com.taobao.android.nav.jump.b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("e816845d", new Object[]{this, bVar})).booleanValue();
                }
                if (bVar == null) {
                    return false;
                }
                gmm gmmVar = new gmm();
                gmmVar.a(bVar.b.a());
                gmmVar.a(bVar.f14455a);
                gmmVar.a(new WeakReference<>(bVar.b.m()));
                gmmVar.a(Integer.valueOf(bVar.b.f()));
                scr a2 = scs.a(gmmVar, (com.taobao.android.stdpop.api.a) null);
                TBMainLog.tlog("NavJumpAbility", "jump: " + a2.f33478a + " " + a2.b + " " + a2.c);
                return a2.f33478a;
            }
        });
        a.a().a(new JumpAbility() { // from class: com.taobao.tao.InitNav.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.nav.jump.JumpAbility
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : JumpAbility.NAV_JUMP_ABILITY_FRAGMENT;
            }

            private Bundle a(Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Bundle) ipChange2.ipc$dispatch("68eb9a9", new Object[]{this, intent});
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getBundle(com.taobao.tao.tbmainfragment.i.KEY_FRAGMENT_ARGS);
                }
                return null;
            }

            private Bundle b(Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Bundle) ipChange2.ipc$dispatch("7c08dfea", new Object[]{this, intent});
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getBundle(com.taobao.tao.tbmainfragment.i.KEY_FRAGMENT_BUNDLE);
                }
                return null;
            }

            private String c(Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("249b0259", new Object[]{this, intent});
                }
                Bundle b = b(intent);
                if (b != null) {
                    return b.getString(com.taobao.tao.tbmainfragment.i.KEY_FRAGMENT_NAME);
                }
                return null;
            }

            @Override // com.taobao.android.nav.jump.JumpAbility
            public boolean a(com.taobao.android.nav.jump.b bVar) {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("e816845d", new Object[]{this, bVar})).booleanValue();
                }
                if (!com.taobao.tao.tbmainfragment.d.f()) {
                    TBMainLog.tlog("FragmentJumpAbility", "can not jump for jump ability switch off");
                    return false;
                } else if (bVar == null) {
                    TBMainLog.tlog("FragmentJumpAbility", "jumpIntentCompat is null");
                    return false;
                } else {
                    Context a2 = bVar.b.a();
                    if (!com.taobao.tao.tbmainfragment.d.b(a2)) {
                        TBMainLog.tlog("FragmentJumpAbility", "can not jump for switch off");
                        return false;
                    }
                    if (a2 instanceof fpz) {
                        a2 = ((fpz) a2).a();
                    }
                    if (!(a2 instanceof SupportActivity)) {
                        TBMainLog.tlog("FragmentJumpAbility", "dx context is not SupportActivity");
                        return false;
                    }
                    SupportActivity supportActivity = (SupportActivity) a2;
                    if (supportActivity.isDestroyed()) {
                        TBMainLog.tlog("FragmentJumpAbility", "context is destroyed. " + supportActivity);
                        omh.a("context_is_destroyed", supportActivity.getClass().getName());
                        return false;
                    }
                    FragmentManager supportFragmentManager = supportActivity.getSupportFragmentManager();
                    if (supportFragmentManager == null) {
                        TBMainLog.tlog("FragmentJumpAbility", "fragment manager is null");
                        return false;
                    }
                    int c = com.taobao.tao.tbmainfragment.i.c(supportFragmentManager);
                    if (c >= 3) {
                        TBMainLog.tlog("FragmentJumpAbility", "fragment count is " + c);
                        return false;
                    }
                    String c2 = c(bVar.f14455a);
                    if (c2 == null) {
                        TBMainLog.tlog("FragmentJumpAbility", "fragmentName is null");
                        return false;
                    }
                    try {
                        z = s.a((SupportActivity) a2, bVar.f14455a, c2, a(bVar.f14455a));
                    } catch (Throwable th) {
                        TBMainLog.tlog("FragmentJumpAbility", "jump to fragment error: " + th);
                    }
                    if (z) {
                        AppMonitor.Counter.commit(com.taobao.tao.tbmainfragment.i.SAVE_INSTANCE_MODULE_NAME, com.taobao.tao.tbmainfragment.i.JUMP_TO_FRAGMENT, 1.0d);
                        bVar.b.b(true, "TBFragmentHookProcessor");
                        bVar.b.a(true, "TBFragmentHookProcessor");
                    }
                    TBMainLog.tlog("FragmentJumpAbility", "jump to fragment: " + c2 + " ret: " + z);
                    return z;
                }
            }
        });
        Nav.registerPreprocessor(new com.taobao.order.downgrade.detail.a());
        Nav.registerPreprocessor(new com.taobao.vividsocial.upgrade.g());
        Nav.registerPreprocessor(new NavHyBridPreProcessor());
        Nav.registerPreprocessor(new com.taobao.android.nav.j());
        Nav.registerPreprocessor(new TBWXNavPreProcessor());
        Nav.registerStickPreprocessor(new NavMunionAdPreProcessor());
        Nav.registerPreprocessor(new rjl());
        Nav.registerPreprocessor(new com.tmall.wireless.membershop.core.c());
        Nav.registerAfterProcessor(new com.tmall.wireless.membershop.core.d());
        Nav.registerNavMonitor(new Nav.j() { // from class: com.taobao.tao.InitNav.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.nav.Nav.j
            public void a(Context context, String str, Exception exc, boolean z) {
                IpChange ipChange2 = $ipChange;
                boolean z2 = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f1c6fb8", new Object[]{this, context, str, exc, new Boolean(z)});
                    return;
                }
                if (z && (context == null || !context.getString(R.string.package_type).equals("1") || !context.getString(R.string.publish_type).equals("0"))) {
                    z2 = false;
                }
                if (!z2) {
                    return;
                }
                String access$100 = InitNav.access$100(str);
                com.alibaba.ha.bizerrorreporter.module.a aVar = new com.alibaba.ha.bizerrorreporter.module.a();
                if (!StringUtils.isEmpty(str)) {
                    aVar.b = AggregationType.CONTENT;
                    aVar.d = access$100;
                    aVar.j = str;
                } else {
                    aVar.b = AggregationType.STACK;
                }
                aVar.k = exc;
                aVar.f3119a = "EVENT_NAV_ERROR";
                com.alibaba.ha.bizerrorreporter.e.a().a(context, aVar);
            }
        });
    }

    private static String simpleUrl(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4e146932", new Object[]{str}) : (StringUtils.isEmpty(str) || (indexOf = str.indexOf(63)) == -1) ? str : str.substring(0, indexOf);
    }
}
