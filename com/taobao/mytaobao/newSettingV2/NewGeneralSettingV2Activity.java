package com.taobao.mytaobao.newSettingV2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.task.Coordinator;
import com.taobao.global.setting.c;
import com.taobao.global.setting.util.h;
import com.taobao.mytaobao.newSettingV2.data.NewGeneralSettingDataModel;
import com.taobao.mytaobao.newSettingV2.data.b;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.Globals;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;
import tb.ksz;
import tb.kta;
import tb.mtr;
import tb.mve;
import tb.mvg;
import tb.mvh;

/* loaded from: classes7.dex */
public class NewGeneralSettingV2Activity extends BaseActivity implements mvg, mvh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TRecyclerView f18384a;
    private mve b;
    private b c;

    static {
        kge.a(1382204434);
        kge.a(1829147338);
        kge.a(-205678076);
    }

    public static /* synthetic */ Object ipc$super(NewGeneralSettingV2Activity newGeneralSettingV2Activity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -641568046) {
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

    public NewGeneralSettingV2Activity() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ b a(NewGeneralSettingV2Activity newGeneralSettingV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("6b236af8", new Object[]{newGeneralSettingV2Activity}) : newGeneralSettingV2Activity.c;
    }

    public static /* synthetic */ void a(NewGeneralSettingV2Activity newGeneralSettingV2Activity, NewGeneralSettingDataModel newGeneralSettingDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e935259", new Object[]{newGeneralSettingV2Activity, newGeneralSettingDataModel});
        } else {
            newGeneralSettingV2Activity.a(newGeneralSettingDataModel);
        }
    }

    public static /* synthetic */ void a(NewGeneralSettingV2Activity newGeneralSettingV2Activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c263a419", new Object[]{newGeneralSettingV2Activity, str, str2});
        } else {
            newGeneralSettingV2Activity.a(str, str2);
        }
    }

    public static /* synthetic */ mve b(NewGeneralSettingV2Activity newGeneralSettingV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mve) ipChange.ipc$dispatch("5ee4624", new Object[]{newGeneralSettingV2Activity}) : newGeneralSettingV2Activity.b;
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_new_general_setting_v2);
        f();
        e();
        d();
        b();
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        c();
        super.onResume();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Coordinator.execute(new Runnable() { // from class: com.taobao.mytaobao.newSettingV2.NewGeneralSettingV2Activity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                NewGeneralSettingV2Activity.a(NewGeneralSettingV2Activity.this).a((mvh) NewGeneralSettingV2Activity.this);
                NewGeneralSettingV2Activity.b(NewGeneralSettingV2Activity.this).a(NewGeneralSettingV2Activity.this);
            }
        });
        this.b.e = new mtr<NewGeneralSettingDataModel>() { // from class: com.taobao.mytaobao.newSettingV2.NewGeneralSettingV2Activity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.mtr
            public /* synthetic */ void onResult(boolean z, String str, NewGeneralSettingDataModel newGeneralSettingDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc0b3077", new Object[]{this, new Boolean(z), str, newGeneralSettingDataModel});
                } else {
                    a(z, str, newGeneralSettingDataModel);
                }
            }

            public void a(boolean z, String str, NewGeneralSettingDataModel newGeneralSettingDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d1d64eca", new Object[]{this, new Boolean(z), str, newGeneralSettingDataModel});
                } else if (!NewGeneralSettingDataModel.STYLE_PICKER_SWITCH.equals(newGeneralSettingDataModel.style) || !newGeneralSettingDataModel.switchState) {
                } else {
                    NewGeneralSettingV2Activity.a(NewGeneralSettingV2Activity.this, newGeneralSettingDataModel);
                }
            }
        };
    }

    private void a(final NewGeneralSettingDataModel newGeneralSettingDataModel) {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66eec7c", new Object[]{this, newGeneralSettingDataModel});
            return;
        }
        try {
            ksz b = c.a(Globals.getApplication(), "mytaobao").b();
            JSONObject parseObject = JSONObject.parseObject((String) b.a("mytaobao", newGeneralSettingDataModel.nativeKey + "Sub", "", null));
            i = parseObject.getIntValue("startHour");
            try {
                i2 = parseObject.getIntValue("starMinute");
            } catch (Throwable unused) {
                i2 = 0;
                i3 = 0;
                MtbTimePickerDialogFragment.newInstance(i, i2, i3, i4, new mtr<JSONObject>() { // from class: com.taobao.mytaobao.newSettingV2.NewGeneralSettingV2Activity.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.mtr
                    public /* synthetic */ void onResult(boolean z, String str, JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cc0b3077", new Object[]{this, new Boolean(z), str, jSONObject});
                        } else {
                            a(z, str, jSONObject);
                        }
                    }

                    public void a(boolean z, String str, JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("86df5f7a", new Object[]{this, new Boolean(z), str, jSONObject});
                            return;
                        }
                        kta c = c.a(Globals.getApplication(), "mytaobao").c();
                        c.a("mytaobao", newGeneralSettingDataModel.nativeKey + "Sub", jSONObject.toJSONString(), null);
                        NewGeneralSettingV2Activity.a(NewGeneralSettingV2Activity.this).b();
                    }
                }).show(getSupportFragmentManager(), "picker");
            }
            try {
                i3 = parseObject.getIntValue("endHour");
                try {
                    i4 = parseObject.getIntValue("endMinute");
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                i3 = 0;
                MtbTimePickerDialogFragment.newInstance(i, i2, i3, i4, new mtr<JSONObject>() { // from class: com.taobao.mytaobao.newSettingV2.NewGeneralSettingV2Activity.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.mtr
                    public /* synthetic */ void onResult(boolean z, String str, JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cc0b3077", new Object[]{this, new Boolean(z), str, jSONObject});
                        } else {
                            a(z, str, jSONObject);
                        }
                    }

                    public void a(boolean z, String str, JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("86df5f7a", new Object[]{this, new Boolean(z), str, jSONObject});
                            return;
                        }
                        kta c = c.a(Globals.getApplication(), "mytaobao").c();
                        c.a("mytaobao", newGeneralSettingDataModel.nativeKey + "Sub", jSONObject.toJSONString(), null);
                        NewGeneralSettingV2Activity.a(NewGeneralSettingV2Activity.this).b();
                    }
                }).show(getSupportFragmentManager(), "picker");
            }
        } catch (Throwable unused4) {
            i = 0;
        }
        MtbTimePickerDialogFragment.newInstance(i, i2, i3, i4, new mtr<JSONObject>() { // from class: com.taobao.mytaobao.newSettingV2.NewGeneralSettingV2Activity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.mtr
            public /* synthetic */ void onResult(boolean z, String str, JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc0b3077", new Object[]{this, new Boolean(z), str, jSONObject});
                } else {
                    a(z, str, jSONObject);
                }
            }

            public void a(boolean z, String str, JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("86df5f7a", new Object[]{this, new Boolean(z), str, jSONObject});
                    return;
                }
                kta c = c.a(Globals.getApplication(), "mytaobao").c();
                c.a("mytaobao", newGeneralSettingDataModel.nativeKey + "Sub", jSONObject.toJSONString(), null);
                NewGeneralSettingV2Activity.a(NewGeneralSettingV2Activity.this).b();
            }
        }).show(getSupportFragmentManager(), "picker");
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c.a();
        this.b.a(this.c.c());
        this.b.notifyDataSetChanged();
        this.c.b();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.c = new b();
        this.b = new mve(this);
        this.f18384a.setAdapter(this.b);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.20998086.3.1");
        com.taobao.mytaobao.ut.c.a(this, h.PAGE_NAME);
        com.taobao.mytaobao.ut.c.a(this, hashMap);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        i();
        h();
        g();
        this.f18384a.setLayoutManager(new LinearLayoutManager(this, 1, false));
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.f18384a = (TRecyclerView) findViewById(R.id.mytaobao_setting_container);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            getPublicMenu().setOnOverflowButtonClickListener(new TBPublicMenu.TBOnOverflowButtonClickListener() { // from class: com.taobao.mytaobao.newSettingV2.NewGeneralSettingV2Activity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnOverflowButtonClickListener
                public void onOverflowButtonClicked() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ddc419b", new Object[]{this});
                    } else {
                        NewGeneralSettingV2Activity.a(NewGeneralSettingV2Activity.this, "Page_MYTBSettingVC_generic_功能直达", "a2141.20998086.3.16");
                    }
                }
            });
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.a("通用");
        supportActionBar.b(getResources().getDrawable(R.color.white));
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = null;
        if (!StringUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
            jSONObject.put("spm", (Object) str2);
        }
        com.taobao.mytaobao.ut.c.b(h.PAGE_NAME, str, com.taobao.mytaobao.ut.c.a(jSONObject));
    }

    @Override // tb.mvh
    public void a() {
        b bVar;
        ArrayList<NewGeneralSettingDataModel> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b == null || (bVar = this.c) == null || (c = bVar.c()) == null) {
        } else {
            this.f18384a.removeAllViews();
            this.b.a(c);
            this.b.notifyDataSetChanged();
        }
    }

    @Override // tb.mvg
    public void a(NewGeneralSettingDataModel newGeneralSettingDataModel, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b62c4e", new Object[]{this, newGeneralSettingDataModel, str, new Boolean(z)});
            return;
        }
        this.c.a(str, z);
        if (!NewGeneralSettingDataModel.STYLE_PICKER_SWITCH.equals(newGeneralSettingDataModel.style)) {
            return;
        }
        this.b.notifyItemChanged(this.b.a(newGeneralSettingDataModel));
    }
}
