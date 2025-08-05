package com.taobao.mytaobao.newsetting;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import tb.kge;
import tb.mxr;

/* loaded from: classes7.dex */
public class VideoAutoPlaySettingActivity extends CustomBaseActivity implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f18418a;
    private View b;
    private View c;
    private com.taobao.global.setting.c d;

    static {
        kge.a(-275817314);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(VideoAutoPlaySettingActivity videoAutoPlaySettingActivity, String str, Object... objArr) {
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
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    public VideoAutoPlaySettingActivity() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.layout_video_auto_play_setting);
        getSupportActionBar().a(getString(R.string.setting_general_video_play_title));
        View findViewById = findViewById(R.id.mobile_flow_and_WIFI_rl);
        View findViewById2 = findViewById(R.id.only_WIFI_rl);
        View findViewById3 = findViewById(R.id.close_rl);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        this.f18418a = findViewById(R.id.icon_select_mobile_and_wifi);
        this.b = findViewById(R.id.icon_select_only_wifi);
        this.c = findViewById(R.id.icon_select_close);
        this.d = com.taobao.global.setting.c.a(getApplicationContext(), "mytaobao");
        if (com.taobao.global.setting.util.e.a(getApplicationContext()).a("Global_App_Video_Play_Network_Type")) {
            a2 = this.d.b().a(0);
        } else {
            a2 = this.d.b().a(1);
        }
        a(a2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.mobile_flow_and_WIFI_rl) {
            a(1);
        } else if (id == R.id.only_WIFI_rl) {
            a(0);
        } else if (id != R.id.close_rl) {
        } else {
            a(2);
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            this.f18418a.setVisibility(0);
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.d.c().a(1);
            mxr.a("video", 1);
            TBS.Adv.ctrlClicked("Page_TBGeneralSettingVC", CT.Button, "VideoPlay-allon");
        } else if (i == 2) {
            this.f18418a.setVisibility(8);
            this.b.setVisibility(8);
            this.c.setVisibility(0);
            this.d.c().a(2);
            mxr.a("video", 2);
            TBS.Adv.ctrlClicked("Page_TBGeneralSettingVC", CT.Button, "VideoPlay-alloff");
        } else {
            this.f18418a.setVisibility(8);
            this.b.setVisibility(0);
            this.c.setVisibility(8);
            this.d.c().a(0);
            mxr.a("video", 0);
            TBS.Adv.ctrlClicked("Page_TBGeneralSettingVC", CT.Button, "VideoPlay-WIFI");
        }
    }
}
