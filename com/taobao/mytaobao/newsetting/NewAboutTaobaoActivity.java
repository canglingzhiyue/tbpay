package com.taobao.mytaobao.newsetting;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.base.Versions;
import com.taobao.android.nav.Nav;
import com.taobao.statistic.TBS;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.Globals;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.update.datasource.local.UpdateInfo;
import java.util.HashMap;
import tb.kge;
import tb.mxj;
import tb.ovv;

/* loaded from: classes7.dex */
public class NewAboutTaobaoActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f18394a;
    private ViewGroup b;
    private ViewGroup c;
    private TextView d;
    private TextView e;
    private TextView f;
    private boolean g;
    private TextView h;

    static {
        kge.a(1086602599);
    }

    public static /* synthetic */ Object ipc$super(NewAboutTaobaoActivity newAboutTaobaoActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode != 1893326613) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
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

    public NewAboutTaobaoActivity() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ void a(NewAboutTaobaoActivity newAboutTaobaoActivity, Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0fd34a", new Object[]{newAboutTaobaoActivity, context, str, str2});
        } else {
            newAboutTaobaoActivity.a(context, str, str2);
        }
    }

    public static /* synthetic */ void a(NewAboutTaobaoActivity newAboutTaobaoActivity, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849be383", new Object[]{newAboutTaobaoActivity, str, strArr});
        } else {
            newAboutTaobaoActivity.a(str, strArr);
        }
    }

    public static /* synthetic */ boolean a(NewAboutTaobaoActivity newAboutTaobaoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("69bf7ad6", new Object[]{newAboutTaobaoActivity})).booleanValue() : newAboutTaobaoActivity.g;
    }

    public static /* synthetic */ void b(NewAboutTaobaoActivity newAboutTaobaoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc34631", new Object[]{newAboutTaobaoActivity});
        } else {
            newAboutTaobaoActivity.d();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.new_mytaobao_setting_about_us);
        getSupportActionBar().b(R.string.mytaobao_about_phonetaobao);
        getPublicMenu().setOnOverflowButtonClickListener(new TBPublicMenu.TBOnOverflowButtonClickListener() { // from class: com.taobao.mytaobao.newsetting.NewAboutTaobaoActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnOverflowButtonClickListener
            public void onOverflowButtonClicked() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ddc419b", new Object[]{this});
                } else {
                    TBS.Ext.commitEvent("Page_MYTBSettingVC_aboutTB", Integer.parseInt("2101"), "Page_MYTBSettingVC_aboutTB_功能直达", null, null, "spm=a2141.20998086.4.9");
                }
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.20998086.4.1");
        com.taobao.mytaobao.ut.c.a(this, "Page_MYTBSettingVC_aboutTB");
        com.taobao.mytaobao.ut.c.a(this, hashMap);
        a();
        c();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = (ViewGroup) findViewById(R.id.rl_setting_about_us_evaluate);
        this.f18394a = (TextView) findViewById(R.id.tv_about_us_version);
        this.f18394a.setText(getString(R.string.mytaobao_version) + " " + Globals.getVersionName());
        this.b = (ViewGroup) findViewById(R.id.rl_setting_about_us_evaluate);
        this.c = (ViewGroup) findViewById(R.id.rl_setting_about_us_version_check);
        if (com.taobao.mytaobao.base.c.v()) {
            this.c.setVisibility(8);
        }
        this.d = (TextView) findViewById(R.id.tv_setting_about_version_check_desc);
        View findViewById = findViewById(R.id.if_setting_about_version_check_arrow);
        this.g = b();
        if (mxj.a("newUpdateApi", true)) {
            if (!com.taobao.mytaobao.base.c.v()) {
                ovv.getInstance(this).update(true);
            }
        } else if (this.g) {
            this.d.setText("去更新");
        } else {
            findViewById.setVisibility(8);
            this.d.setText("当前为最新版");
        }
        this.e = (TextView) findViewById(R.id.tv_about_us_copy_right);
        this.f = (TextView) findViewById(R.id.tv_about_us_app_policy);
        this.h = (TextView) findViewById(R.id.tv_filing_code);
        this.h.setText(mxj.a("fillCodeTxt", "备案号：浙B2-20080224-50A >"));
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
        }
        TBS.Ext.commitEvent("Page_MYTBSettingVC_aboutTB", Integer.parseInt("2101"), "Page_MYTBSettingVC_aboutTB_返回", null, null, "spm=a2141.20998086.4.8");
        finish();
        return true;
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue() : super.onOptionsItemSelected(menuItem);
    }

    private boolean b() {
        UpdateInfo data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (com.taobao.mytaobao.base.c.v() || (data = com.taobao.update.datasource.local.a.getInstance(this).getData()) == null) {
            return false;
        }
        return data.updateList.containsKey("main");
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mytaobao.newsetting.NewAboutTaobaoActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                NewAboutTaobaoActivity.a(NewAboutTaobaoActivity.this, "Page_MYTBSettingVC_aboutTB_去评价", new String[]{"spm=a2141.20998086.4.2"});
                NewAboutTaobaoActivity newAboutTaobaoActivity = NewAboutTaobaoActivity.this;
                NewAboutTaobaoActivity.a(newAboutTaobaoActivity, newAboutTaobaoActivity, "com.taobao.taobao", null);
            }
        });
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mytaobao.newsetting.NewAboutTaobaoActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                NewAboutTaobaoActivity.a(NewAboutTaobaoActivity.this, "Page_MYTBSettingVC_aboutTB_版本更新", new String[]{"spm=a2141.20998086.4.3"});
                if (mxj.a("newUpdateApi", true)) {
                    if (com.taobao.mytaobao.base.c.v()) {
                        return;
                    }
                    ovv.getInstance(NewAboutTaobaoActivity.this).update(false);
                } else if (!NewAboutTaobaoActivity.a(NewAboutTaobaoActivity.this)) {
                    Toast.makeText(NewAboutTaobaoActivity.this, "当前为最新版", 0).show();
                } else {
                    NewAboutTaobaoActivity newAboutTaobaoActivity = NewAboutTaobaoActivity.this;
                    NewAboutTaobaoActivity.a(newAboutTaobaoActivity, newAboutTaobaoActivity, "com.taobao.taobao", null);
                }
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mytaobao.newsetting.NewAboutTaobaoActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                NewAboutTaobaoActivity.a(NewAboutTaobaoActivity.this, "Page_MYTBSettingVC_aboutTB_版权信息", new String[]{"spm=a2141.20998086.4.4"});
                Nav.from(Globals.getApplication()).toUri("http://h5.m.taobao.com/other/android_legal.html");
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mytaobao.newsetting.NewAboutTaobaoActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                NewAboutTaobaoActivity.a(NewAboutTaobaoActivity.this, "Page_MYTBSettingVC_aboutTB_软件许可使用协议", new String[]{"spm=a2141.20998086.4.6"});
                Nav.from(Globals.getApplication()).toUri("http://terms.alicdn.com/legal-agreement/terms/suit_bu1_taobao/suit_bu1_taobao201901082305_94250.html");
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mytaobao.newsetting.NewAboutTaobaoActivity.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    Nav.from(Globals.getApplication()).toUri(mxj.a("fillCodeUrl", "https://beian.miit.gov.cn"));
                }
            }
        });
        e();
    }

    private void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{this, context, str, str2});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
            if (!TextUtils.isEmpty(str2)) {
                intent.setPackage(str2);
            }
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{this, str, strArr});
        } else {
            TBS.Ext.commitEvent("Page_MYTBSettingVC_aboutTB", Integer.parseInt("2101"), str, null, null, strArr);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TextView textView = (TextView) findViewById(R.id.tv_setting_about_app_build_info);
        textView.setText("Build id: " + getResources().getString(R.string.packageTag));
        textView.setVisibility(0);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (Versions.isDebug()) {
            d();
        } else {
            this.f18394a.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mytaobao.newsetting.NewAboutTaobaoActivity.7
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private int b = 0;
                private long c = System.currentTimeMillis();

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (this.b < 0) {
                    } else {
                        if (System.currentTimeMillis() - this.c > 500) {
                            this.b = 0;
                        }
                        this.b++;
                        this.c = System.currentTimeMillis();
                        if (this.b < 5) {
                            return;
                        }
                        NewAboutTaobaoActivity.b(NewAboutTaobaoActivity.this);
                        this.b = -1;
                    }
                }
            });
        }
    }
}
