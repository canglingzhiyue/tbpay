package com.taobao.pha.core.controller;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.SplashViewIconModel;
import com.taobao.pha.core.phacontainer.SplashFragment;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;
import tb.ngu;

/* loaded from: classes7.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AppController f18730a;
    private ArrayList<SplashViewIconModel> b;
    private String c;
    private int d;
    private String e;
    private String f;
    private boolean g = false;

    static {
        kge.a(734491844);
    }

    public static /* synthetic */ AppController a(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppController) ipChange.ipc$dispatch("d4a4981f", new Object[]{nVar}) : nVar.f18730a;
    }

    public n(AppController appController) {
        this.b = new ArrayList<>();
        this.f18730a = appController;
        ManifestModel u = this.f18730a.u();
        if (u != null) {
            this.b = u.icons;
            this.c = u.pageName;
            this.d = u.splashViewTimeout;
            this.e = u.splashViewUrl;
            this.f = u.splashViewHtml;
        }
    }

    public boolean a() {
        FragmentTransaction add;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!c()) {
            return false;
        }
        Context C = this.f18730a.C();
        if (this.g || !(C instanceof FragmentActivity)) {
            return false;
        }
        FragmentManager supportFragmentManager = ((FragmentActivity) C).getSupportFragmentManager();
        if (supportFragmentManager != null) {
            if (supportFragmentManager.findFragmentByTag(SplashFragment.FRAGMENT_TAG) != null) {
                return false;
            }
            this.f18730a.P().b(17);
            Bundle bundle = new Bundle();
            bundle.putLong("AppControllerInstanceId", this.f18730a.L());
            bundle.putString(SplashFragment.FRAGMENT_ARGS_SPLASH_VIEW_NAME, this.c);
            bundle.putString(SplashFragment.FRAGMENT_ARGS_SPLASH_VIEW_URL, this.e);
            bundle.putString(SplashFragment.FRAGMENT_ARGS_SPLASH_VIEW_HTML, this.f);
            bundle.putSerializable(SplashFragment.FRAGMENT_ARGS_SPLASH_VIEW_ICONS, this.b);
            Fragment instantiate = Fragment.instantiate(C, SplashFragment.class.getName(), bundle);
            if (ngu.j()) {
                add = supportFragmentManager.beginTransaction().add(R.id.tab_page_container, instantiate, SplashFragment.FRAGMENT_TAG);
            } else {
                add = supportFragmentManager.beginTransaction().add(16908290, instantiate, SplashFragment.FRAGMENT_TAG);
            }
            if (add != null) {
                if (ngu.n()) {
                    add.runOnCommit(new Runnable() { // from class: com.taobao.pha.core.controller.n.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (!n.a(n.this).o()) {
                            } else {
                                n.this.b();
                            }
                        }
                    }).commitAllowingStateLoss();
                } else {
                    add.commitAllowingStateLoss();
                }
            }
            this.g = true;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.pha.core.controller.n.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        n.this.b();
                    }
                }
            }, this.d);
        }
        return true;
    }

    public boolean b() {
        FragmentManager supportFragmentManager;
        Fragment findFragmentByTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!this.g) {
            return false;
        }
        this.f18730a.P().b(18);
        Context C = this.f18730a.C();
        boolean n = ngu.n();
        if ((C instanceof FragmentActivity) && (supportFragmentManager = ((FragmentActivity) C).getSupportFragmentManager()) != null && (findFragmentByTag = supportFragmentManager.findFragmentByTag(SplashFragment.FRAGMENT_TAG)) != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
            if (n) {
                this.g = false;
            }
        }
        if (!n) {
            this.g = false;
        }
        return true;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : (!StringUtils.isEmpty(this.c) && this.b.size() > 0) || !StringUtils.isEmpty(this.f) || !StringUtils.isEmpty(this.e);
    }
}
