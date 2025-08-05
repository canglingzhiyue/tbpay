package com.taobao.android.detail.core.detail.activity.base;

import android.app.Application;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.alibaba.security.realidentity.ui.activity.BaseBioNavigatorActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.async.d;
import com.taobao.android.detail.core.detail.kit.view.widget.base.b;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.linkback.f;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ecg;
import tb.ecu;
import tb.kge;

/* loaded from: classes4.dex */
public class BaseActivity extends FragmentActivity implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROADCAST_ACTIVITY = "Broadcast_Activity";

    /* renamed from: a  reason: collision with root package name */
    private boolean f9429a = false;
    public Application i;
    public Resources j;
    public LayoutInflater k;
    public Handler l;
    public RelativeLayout m;
    public View n;
    public View o;
    public com.taobao.android.detail.core.detail.kit.view.widget.base.a p;

    static {
        kge.a(-1362617801);
        kge.a(179342749);
    }

    public static /* synthetic */ Object ipc$super(BaseActivity baseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 224771354:
                return new Boolean(super.isDestroyed());
            case 797441118:
                super.onPause();
                return null;
            case 921927566:
                super.setContentView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public boolean a(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14b42c5", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return true;
    }

    public boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{this, message})).booleanValue();
        }
        return false;
    }

    public boolean a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab3bce31", new Object[]{this, mtopResponse})).booleanValue();
        }
        return true;
    }

    public View s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("50dc813c", new Object[]{this});
        }
        return null;
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        try {
            super.onCreate(bundle);
        } catch (Throwable th) {
            i.a(BaseBioNavigatorActivity.g, "Already attached", th);
            ecg.b(this, th);
        }
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.i = getApplication();
        this.j = this.i.getResources();
        this.k = (LayoutInflater) this.i.getSystemService("layout_inflater");
        this.l = new Handler(new a(this));
        new IntentFilter().addAction("Broadcast_Activity");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        try {
            super.onResume();
        } catch (Throwable th) {
            i.a(BaseBioNavigatorActivity.g, "onResume exception");
            ecg.b(this, th);
        }
        com.taobao.android.detail.core.detail.kit.view.widget.base.a aVar = this.p;
        if (aVar == null) {
            return;
        }
        aVar.c();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.detail.kit.view.widget.base.a aVar = this.p;
        if (aVar != null) {
            aVar.d();
            this.p = null;
        }
        RelativeLayout relativeLayout = this.m;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            this.m = null;
        }
        if (this.l != null) {
            this.l = null;
        }
        if (this.k != null) {
            this.k = null;
        }
        if (this.j != null) {
            this.j = null;
        }
        if (this.i != null) {
            this.i = null;
        }
        super.onDestroy();
        this.f9429a = true;
    }

    public View V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e93e24df", new Object[]{this}) : this.m;
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698903e0", new Object[]{this, new Integer(i)});
        } else {
            a(d.b(this.i, i), (ViewGroup.LayoutParams) null);
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
        } else {
            a(view, (ViewGroup.LayoutParams) null);
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f37f8e", new Object[]{this, view, layoutParams});
        } else {
            a(view, layoutParams);
        }
    }

    private void a(View view, ViewGroup.LayoutParams layoutParams) {
        RelativeLayout.LayoutParams layoutParams2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8549973", new Object[]{this, view, layoutParams});
            return;
        }
        this.m = new RelativeLayout(this.i);
        this.m.setId(9999);
        this.n = view;
        if (this.n != null) {
            if (layoutParams == null) {
                layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            } else {
                layoutParams2 = new RelativeLayout.LayoutParams(layoutParams);
            }
            this.m.addView(this.n, layoutParams2);
        }
        if (!ecu.y) {
            this.o = s();
            if (this.o != null) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                this.o.setVisibility(8);
                this.m.addView(this.o, layoutParams3);
                this.m.bringChildToFront(this.o);
            }
        }
        super.setContentView(this.m, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (isFinishing() || keyEvent.getRepeatCount() > 0 || a(i, keyEvent)) {
            return false;
        }
        if (4 == i) {
            W();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
            return;
        }
        if (ecu.M) {
            f.a(getIntent(), this);
        }
        finish();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.b
    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
        } else {
            finish();
        }
    }

    public boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fbb064", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return this.f9429a;
        }
        try {
            return super.isDestroyed();
        } catch (Throwable unused) {
            return this.f9429a;
        }
    }

    public View o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("28161c38", new Object[]{this}) : this.o;
    }

    public void setMask(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784c2ebd", new Object[]{this, view});
            return;
        }
        this.o = view;
        if (this.o == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.o.setVisibility(8);
        if (this.o.getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) this.o.getParent();
            if (viewGroup.getAnimation() != null) {
                viewGroup.getAnimation().cancel();
            }
            viewGroup.setLayoutTransition(null);
            viewGroup.removeView(this.o);
        }
        this.m.addView(this.o, layoutParams);
        this.m.bringChildToFront(this.o);
    }

    public com.taobao.android.detail.core.detail.kit.view.widget.base.a Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.core.detail.kit.view.widget.base.a) ipChange.ipc$dispatch("3bd0dbae", new Object[]{this});
        }
        if (this.p == null) {
            this.p = new com.taobao.android.detail.core.detail.kit.view.widget.base.a(this, this);
        }
        return this.p;
    }

    /* loaded from: classes4.dex */
    public static class a implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<BaseActivity> f9430a;

        static {
            kge.a(191095114);
            kge.a(-1043440182);
        }

        public a(BaseActivity baseActivity) {
            this.f9430a = new WeakReference<>(baseActivity);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            BaseActivity baseActivity = this.f9430a.get();
            if (baseActivity == null) {
                return true;
            }
            return baseActivity.a(message);
        }
    }
}
