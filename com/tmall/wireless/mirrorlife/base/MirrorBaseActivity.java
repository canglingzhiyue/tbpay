package com.tmall.wireless.mirrorlife.base;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.core.splitinstall.o;
import com.alibaba.android.split.core.tasks.d;
import com.alibaba.android.split.core.tasks.e;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.taobaocompat.lifecycle.IUtActivityNotTrack;
import com.tmall.wireless.mirrorlife.base.listener.SoftHideKeyBoardUtil;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.rmz;

/* loaded from: classes9.dex */
public class MirrorBaseActivity extends CustomBaseActivity implements IUtActivityNotTrack, SoftHideKeyBoardUtil.SoftKeyboardListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public rmz b;
    public g e;

    /* renamed from: a  reason: collision with root package name */
    public List<SoftHideKeyBoardUtil.SoftKeyboardListener> f23732a = new ArrayList();
    public String c = "com.tmall.wireless.mirrorlife.main.MirrorMainFragment";
    public String d = "tmallandroid_MirrorLifeAndroid";
    public int f = -1;
    private o g = new o() { // from class: com.tmall.wireless.mirrorlife.base.MirrorBaseActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.android.split.core.listener.b
        public /* synthetic */ void onStateUpdate(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd17bbbe", new Object[]{this, mVar});
            } else {
                a(mVar);
            }
        }

        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
                return;
            }
            String str = "onStateUpdate sessionid=" + mVar.a() + ",status=" + mVar.b();
            if (mVar.a() != MirrorBaseActivity.this.f) {
                return;
            }
            int b = mVar.b();
            if (b == 5) {
                MirrorBaseActivity.a(MirrorBaseActivity.this);
            } else if (b != 6) {
            } else {
                Toast.makeText(MirrorBaseActivity.this, "加载失败，请重试", 0).show();
                MirrorBaseActivity.this.finish();
            }
        }
    };

    static {
        kge.a(1392660389);
        kge.a(1589743039);
        kge.a(-1733132022);
        kge.a(429428812);
        kge.a(1698775038);
    }

    public static /* synthetic */ Object ipc$super(MirrorBaseActivity mirrorBaseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ void a(MirrorBaseActivity mirrorBaseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0c57d4", new Object[]{mirrorBaseActivity});
        } else {
            mirrorBaseActivity.d();
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.clearFlags(201326592);
            window.getDecorView().setSystemUiVisibility(1792);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
        }
        setContentView(R.layout.mirrorlife_activity_base);
        SoftHideKeyBoardUtil.assistActivity(this, this);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(R.id.fragment_container, new MirrorLoadingFragment());
        beginTransaction.commitAllowingStateLoss();
        try {
            c.a(this.c, new c.a() { // from class: com.tmall.wireless.mirrorlife.base.MirrorBaseActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassLoaded(Class<?> cls) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                    } else {
                        MirrorBaseActivity.a(MirrorBaseActivity.this);
                    }
                }

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassNotFound() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                    } else {
                        MirrorBaseActivity.this.a();
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.tmall.wireless.mirrorlife.base.MirrorBaseActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MirrorBaseActivity.this.showLoadingMaskLayout();
                }
            }
        });
        this.e = com.taobao.appbundle.c.Companion.a().c();
        g gVar = this.e;
        if (gVar == null) {
            runOnUiThread(new Runnable() { // from class: com.tmall.wireless.mirrorlife.base.MirrorBaseActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MirrorBaseActivity.this.hideloadingMaskLayout();
                    }
                }
            });
            return;
        }
        boolean contains = gVar.a().contains(this.d);
        String str = "install modules " + contains;
        if (b.a().c(this.d) != null) {
            z = true;
        }
        String str2 = "hasDynamicFeature " + z;
        boolean p = b.a().p(this.c);
        String str3 = "isDynamicFragment " + p;
        if (contains && z && p) {
            d();
            return;
        }
        this.e.a(this.g);
        h.a(Globals.getApplication()).a(com.alibaba.android.split.core.splitinstall.j.a().a(this.d).a()).a(new e<Integer>() { // from class: com.tmall.wireless.mirrorlife.base.MirrorBaseActivity.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.tasks.e
            public /* synthetic */ void onSuccess(Integer num) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, num});
                } else {
                    a(num);
                }
            }

            public void a(Integer num) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6cdec50f", new Object[]{this, num});
                    return;
                }
                MirrorBaseActivity.this.f = num.intValue();
                String str4 = "download sucess sessionid=" + num;
            }
        }).a(new d() { // from class: com.tmall.wireless.mirrorlife.base.MirrorBaseActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.tasks.d
            public void onFailure(Exception exc) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    return;
                }
                String str4 = "download fail " + exc.getMessage();
            }
        });
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.tmall.wireless.mirrorlife.base.MirrorBaseActivity.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MirrorBaseActivity.this.hideloadingMaskLayout();
                }
            }
        });
        try {
            Fragment instantiate = Fragment.instantiate(this, this.c, null);
            if (instantiate instanceof rmz) {
                this.b = (rmz) instantiate;
            }
            if (instantiate == null) {
                return;
            }
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.fragment_container, instantiate);
            beginTransaction.commitAllowingStateLoss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        g gVar = this.e;
        if (gVar == null) {
            return;
        }
        gVar.b(this.g);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        rmz rmzVar = this.b;
        if (rmzVar == null) {
            super.onBackPressed();
        } else if (rmzVar.onBackPressed()) {
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            onBackPressed();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.tmall.wireless.mirrorlife.base.listener.SoftHideKeyBoardUtil.SoftKeyboardListener
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        for (SoftHideKeyBoardUtil.SoftKeyboardListener softKeyboardListener : this.f23732a) {
            softKeyboardListener.a(z);
        }
    }
}
