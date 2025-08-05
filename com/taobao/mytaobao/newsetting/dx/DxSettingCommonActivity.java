package com.taobao.mytaobao.newsetting.dx;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.Window;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.message.util.MessageNavProcessorV2;
import com.taobao.mytaobao.aura.AuraFragment;
import com.taobao.search.common.util.i;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/DxSettingCommonActivity;", "Lcom/taobao/tao/BaseActivity;", "()V", "auraFragment", "Lcom/taobao/mytaobao/aura/AuraFragment;", "considerSetNavigationBarColor", "", MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, "", "isTranslucent", "", i.b.MEASURE_ONCREATE, "savedInstanceState", "Landroid/os/Bundle;", "toolbarNeedNewStyle", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class DxSettingCommonActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AuraFragment f18427a;

    static {
        kge.a(1309389048);
    }

    public static /* synthetic */ Object ipc$super(DxSettingCommonActivity dxSettingCommonActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
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

    @Override // com.taobao.tao.BaseActivity
    public boolean isTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab05a0da", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean toolbarNeedNewStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("405dd14d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public DxSettingCommonActivity() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        SystemBarDecorator systemBarDecorator = new SystemBarDecorator(this);
        systemBarDecorator.enableImmersiveStatusBar(true);
        systemBarDecorator.setStatusBarColor((int) 4294967295L, false);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            q.a((Object) window, "window");
            window.setNavigationBarColor((int) 4294178552L);
        }
        setContentView(R.layout.mytaobao_setting_simple_for_dx);
        Intent intent = getIntent();
        q.a((Object) intent, "intent");
        Uri data = intent.getData();
        String queryParameter = data != null ? data.getQueryParameter(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE) : null;
        if (queryParameter == null) {
            finish();
            return;
        }
        a(queryParameter);
        String queryParameter2 = data.getQueryParameter("pageTitleTag");
        String str = null;
        String str2 = queryParameter2;
        if (!(str2 == null || str2.length() == 0)) {
            str = com.alibaba.ability.localization.b.a(queryParameter2);
        }
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            z = true;
        }
        if (z) {
            str = com.alibaba.ability.localization.b.a(R.string.app_taobao);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.a(str);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.b(getResources().getDrawable(R.color.white));
        }
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(AuraFragment.class.getSimpleName());
        if (!(findFragmentByTag instanceof AuraFragment)) {
            findFragmentByTag = null;
        }
        this.f18427a = (AuraFragment) findFragmentByTag;
        if (this.f18427a != null) {
            return;
        }
        AuraFragment auraFragment = new AuraFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, queryParameter);
        bundle2.putString("dxEngineBiz", com.taobao.global.setting.d.BIZ_NAME);
        auraFragment.setArguments(bundle2);
        this.f18427a = auraFragment;
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        int i = R.id.frameLayout;
        AuraFragment auraFragment2 = this.f18427a;
        if (auraFragment2 == null) {
            q.a();
        }
        beginTransaction.add(i, auraFragment2, AuraFragment.class.getSimpleName()).commit();
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if ((!q.a((Object) str, (Object) "mtbSetting")) || Build.VERSION.SDK_INT < 21) {
        } else {
            Window window = getWindow();
            q.a((Object) window, "window");
            window.setNavigationBarColor((int) 4294178552L);
        }
    }
}
