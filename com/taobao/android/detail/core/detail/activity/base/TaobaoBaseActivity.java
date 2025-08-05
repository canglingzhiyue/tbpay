package com.taobao.android.detail.core.detail.activity.base;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import tb.dyz;
import tb.emu;
import tb.epj;
import tb.kge;

/* loaded from: classes4.dex */
public class TaobaoBaseActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ITrackAdapter f9431a;
    private String b;
    private String c;
    public dyz q = new dyz();

    static {
        kge.a(420418885);
    }

    public static /* synthetic */ Object ipc$super(TaobaoBaseActivity taobaoBaseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.BaseActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.f9431a = epj.j();
        emu.a("com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            super.onStart();
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (this.f9431a == null || this.q.b()) {
            return;
        }
        this.f9431a.pageEnter(this, aa(), ab(), this.b);
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        if (this.f9431a != null && !this.q.b()) {
            this.f9431a.pageLeave(this, ab(), this.b);
        }
        TStudioHelper.a().c();
        super.onPause();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.c != null) {
            this.c = null;
        }
        if (this.b != null) {
            this.b = null;
        }
        ITrackAdapter iTrackAdapter = this.f9431a;
        if (iTrackAdapter != null) {
            iTrackAdapter.pageDestroy(aa());
            this.f9431a = null;
        }
        super.onDestroy();
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        } else {
            super.onSaveInstanceState(bundle);
        }
    }

    public String aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ccc1f6d9", new Object[]{this}) : getClass().getName();
    }

    public String ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5347b178", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.c)) {
            String simpleName = getClass().getSimpleName();
            int indexOf = simpleName.indexOf(Dispatchers.TYPE_ACTIVITY);
            if (indexOf != -1) {
                simpleName = simpleName.substring(0, indexOf);
            }
            this.c = "Page_" + simpleName;
            return "Page_" + simpleName;
        }
        return this.c;
    }
}
