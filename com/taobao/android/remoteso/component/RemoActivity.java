package com.taobao.android.remoteso.component;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import com.uc.webview.export.media.MessageID;
import tb.iif;
import tb.ikq;
import tb.iky;

/* loaded from: classes6.dex */
public class RemoActivity extends AppCompatActivity implements o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f14776a = "";
    private long b = -1;
    private final Runnable c = new Runnable() { // from class: com.taobao.android.remoteso.component.RemoActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                RemoActivity.a(RemoActivity.this, "remo, RemoActivity,timeoutTask", new a<j>() { // from class: com.taobao.android.remoteso.component.RemoActivity.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.remoteso.component.a
                    public void a(j jVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fcb98db", new Object[]{this, jVar});
                            return;
                        }
                        jVar.a(l.b("timeout " + jVar));
                    }
                });
            }
        }
    };

    public static /* synthetic */ Object ipc$super(RemoActivity remoActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.remoteso.component.o
    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    public static /* synthetic */ String a(RemoActivity remoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eb21bb79", new Object[]{remoActivity}) : remoActivity.f14776a;
    }

    public static /* synthetic */ String a(RemoActivity remoActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34977aaf", new Object[]{remoActivity, str});
        }
        remoActivity.f14776a = str;
        return str;
    }

    public static /* synthetic */ void a(RemoActivity remoActivity, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd97fc1c", new Object[]{remoActivity, jVar});
        } else {
            remoActivity.a(jVar);
        }
    }

    public static /* synthetic */ void a(RemoActivity remoActivity, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ace1fb", new Object[]{remoActivity, str, aVar});
        } else {
            remoActivity.a(str, aVar);
        }
    }

    public static /* synthetic */ void a(RemoActivity remoActivity, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf236e3", new Object[]{remoActivity, str, new Boolean(z)});
        } else {
            remoActivity.a(str, z);
        }
    }

    public static /* synthetic */ Runnable b(RemoActivity remoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("f38b478c", new Object[]{remoActivity}) : remoActivity.c;
    }

    public static /* synthetic */ long c(RemoActivity remoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f75a79fd", new Object[]{remoActivity})).longValue() : remoActivity.b;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        RSoLog.c("remo, RemoActivity - onCreate initialized" + this.f14776a);
        if (bundle != null) {
            RSoLog.c("remo, RemoActivity - savedInstanceState != null, finish");
            finish();
            return;
        }
        this.b = iky.a();
        b();
        a("remo, RemoActivity,onCreate", new a<j>() { // from class: com.taobao.android.remoteso.component.RemoActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.remoteso.component.a
            public void a(j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fcb98db", new Object[]{this, jVar});
                    return;
                }
                RemoActivity.a(RemoActivity.this, jVar);
                RemoActivity.a(RemoActivity.this, jVar.g());
                iif.a(RemoActivity.a(RemoActivity.this));
            }
        });
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.c(true);
        supportActionBar.a("淘宝");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        RSoLog.c("remo, RemoActivity - onNewIntent = " + intent + this.f14776a);
        a("remo, RemoActivity,onNewIntent", new a<j>() { // from class: com.taobao.android.remoteso.component.RemoActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.remoteso.component.a
            public void a(j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fcb98db", new Object[]{this, jVar});
                } else {
                    RemoActivity.a(RemoActivity.this, jVar);
                }
            }
        });
    }

    private void a(final j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb98db", new Object[]{this, jVar});
            return;
        }
        RSoLog.c("remo, RemoActivity - bindConsumer, enter " + jVar);
        jVar.d().a(new a<Integer>() { // from class: com.taobao.android.remoteso.component.RemoActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private BaseRemoLoadingView c;

            @Override // com.taobao.android.remoteso.component.a
            public void a(Integer num) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6cdec50f", new Object[]{this, num});
                    return;
                }
                i.a((Object) RemoActivity.b(RemoActivity.this));
                i.a(RemoActivity.b(RemoActivity.this), RemoActivity.b(RemoActivity.this), 10000L);
                RSoLog.c("remo, RemoActivity - ProgressObserver = " + num + ", loadingView=" + this.c);
                if (this.c == null) {
                    this.c = jVar.l().a(RemoActivity.this.a());
                    RemoActivity.this.setContentView(this.c);
                }
                this.c.onProgressChanged(num.intValue());
                RSoLog.c("remo, RemoActivity - ProgressObserver, setContentView updated = " + this.c);
            }
        });
        jVar.c().a(new a<l>() { // from class: com.taobao.android.remoteso.component.RemoActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.remoteso.component.a
            public void a(l lVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fcc8199", new Object[]{this, lVar});
                    return;
                }
                i.a((Object) RemoActivity.b(RemoActivity.this));
                if (lVar.e()) {
                    RSoLog.c("remo, RemoActivity - ResultObserver, all success");
                    iif.a(RemoActivity.a(RemoActivity.this), iky.a() - RemoActivity.c(RemoActivity.this));
                    if (!jVar.k()) {
                        return;
                    }
                    RemoActivity.a(RemoActivity.this, "onRemoSuccess", jVar.e());
                } else if (jVar.j()) {
                    RSoLog.c("remo, RemoActivity - ResultObserver, ignore remo error view");
                    RemoActivity.a(RemoActivity.this, "onIgnoreRemoError", jVar.e());
                } else {
                    RSoLog.c("remo, RemoActivity - ResultObserver, failed  result=" + lVar);
                    String a2 = RemoActivity.a(RemoActivity.this);
                    iif.a(a2, lVar.c() + " : " + lVar.d());
                    View a3 = jVar.m().a(RemoActivity.this);
                    RemoActivity.this.setContentView(a3);
                    RSoLog.c("remo, RemoActivity - ResultObserver, setContentView updated = " + a3);
                }
            }
        });
    }

    private void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        RSoLog.c("remo, RemoActivity - ensureFinish - " + str + " , loadingComplete = " + z + " , isFinishing() =  " + isFinishing());
        if (!z || isFinishing()) {
            return;
        }
        finish();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        RSoLog.c("remo, RemoActivity - onStart = " + this.f14776a);
        a("remo, RemoActivity,onStart", new a<j>() { // from class: com.taobao.android.remoteso.component.RemoActivity.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.remoteso.component.a
            public void a(j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fcb98db", new Object[]{this, jVar});
                } else {
                    RemoActivity.a(RemoActivity.this, "onStart", jVar.e());
                }
            }
        });
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        RSoLog.c("remo, RemoActivity - onStop = " + this.f14776a);
        a("remo, RemoActivity,onStop", new a<j>() { // from class: com.taobao.android.remoteso.component.RemoActivity.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.remoteso.component.a
            public void a(j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fcb98db", new Object[]{this, jVar});
                } else {
                    RemoActivity.a(RemoActivity.this, MessageID.onStop, jVar.e());
                }
            }
        });
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        RSoLog.c("remo, RemoActivity - onDestroy = " + this.f14776a);
        i.a((Object) this.c);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (menuItem.getItemId() == 16908332) {
            RSoLog.c("remo, RemoActivity - onOptionsItemSelected home clicked");
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        RSoLog.c("remo, RemoActivity - onBackPressed");
        iif.c(this.f14776a);
        a("remo, RemoActivity,performBack", new a<j>() { // from class: com.taobao.android.remoteso.component.RemoActivity.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.remoteso.component.a
            public void a(j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fcb98db", new Object[]{this, jVar});
                } else {
                    jVar.a(l.a());
                }
            }
        });
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        RSoLog.c("remo, RemoActivity - onConfigurationChanged = " + configuration);
    }

    @Override // com.taobao.android.remoteso.component.o
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3015911) {
            if (hashCode == 108405416 && str.equals("retry")) {
                c = 1;
            }
        } else if (str.equals("back")) {
            c = 0;
        }
        if (c == 0) {
            finish();
        } else if (c != 1) {
        } else {
            iif.b(this.f14776a);
            a("remo, RemoActivity,retry", new a<j>() { // from class: com.taobao.android.remoteso.component.RemoActivity.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.remoteso.component.a
                public void a(j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fcb98db", new Object[]{this, jVar});
                    } else {
                        Remo.b(jVar.a());
                    }
                }
            });
        }
    }

    private void a(String str, a<j> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d06cfa", new Object[]{this, str, aVar});
            return;
        }
        j a2 = Remo.a();
        if (a2 == null) {
            ikq.a(str + " error:", this.f14776a);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        aVar.a(a2);
        RSoLog.c(str + " -> doWithReq done");
    }
}
