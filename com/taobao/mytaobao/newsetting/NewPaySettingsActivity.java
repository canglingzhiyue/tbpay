package com.taobao.mytaobao.newsetting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.nav.Nav;
import com.taobao.android.task.Coordinator;
import com.taobao.mytaobao.newsetting.business.model.PaySettingItem;
import com.taobao.mytaobao.newsetting.business.response.PaySettingPageResponse;
import com.taobao.statistic.TBS;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.mvn;
import tb.mvo;
import tb.mxz;

/* loaded from: classes7.dex */
public class NewPaySettingsActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TRecyclerView f18402a;
    private com.taobao.mytaobao.newsetting.adapter.a b;
    private List<PaySettingItem> c;
    private TextView e;

    /* renamed from: com.taobao.mytaobao.newsetting.NewPaySettingsActivity$3  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass3 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RemoteBusiness mo1337addListener = RemoteBusiness.build(com.taobao.mytaobao.newsetting.business.request.b.a(NewPaySettingsActivity.this), TaoHelper.getTTID()).mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.mytaobao.newsetting.NewPaySettingsActivity.3.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    List<PaySettingItem> list;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (mtopResponse == null || !(baseOutDo instanceof PaySettingPageResponse) || (list = ((PaySettingPageResponse) baseOutDo).mo2429getData().result) == null || list.size() <= 0) {
                    } else {
                        NewPaySettingsActivity.a(NewPaySettingsActivity.this, list);
                        Coordinator.execute(new Runnable() { // from class: com.taobao.mytaobao.newsetting.NewPaySettingsActivity.3.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    com.taobao.mytaobao.newSettingV2.a.INSTANCE.a("key_cache_setting_pay", JSON.toJSONString(NewPaySettingsActivity.a(NewPaySettingsActivity.this)));
                                }
                            }
                        });
                    }
                }
            });
            mo1337addListener.mo1328setUnitStrategy("UNIT_TRADE");
            mo1337addListener.startRequest(PaySettingPageResponse.class);
        }
    }

    static {
        kge.a(1029808951);
    }

    public static /* synthetic */ Object ipc$super(NewPaySettingsActivity newPaySettingsActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2133689546:
                super.onStart();
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
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    public NewPaySettingsActivity() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ List a(NewPaySettingsActivity newPaySettingsActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("10a8ab05", new Object[]{newPaySettingsActivity}) : newPaySettingsActivity.c;
    }

    public static /* synthetic */ void a(NewPaySettingsActivity newPaySettingsActivity, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df26cbf3", new Object[]{newPaySettingsActivity, list});
        } else {
            newPaySettingsActivity.a(list);
        }
    }

    public static /* synthetic */ com.taobao.mytaobao.newsetting.adapter.a b(NewPaySettingsActivity newPaySettingsActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.newsetting.adapter.a) ipChange.ipc$dispatch("5d0b2d80", new Object[]{newPaySettingsActivity}) : newPaySettingsActivity.b;
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.new_mytaobao_pay_setting_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().d();
            getSupportActionBar().b(R.string.mytaobao_setting_pay);
        }
        getPublicMenu().setOnOverflowButtonClickListener(new TBPublicMenu.TBOnOverflowButtonClickListener() { // from class: com.taobao.mytaobao.newsetting.NewPaySettingsActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnOverflowButtonClickListener
            public void onOverflowButtonClicked() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ddc419b", new Object[]{this});
                } else {
                    TBS.Ext.commitEvent("Page_MYTBSettingVC_pay", Integer.parseInt("2101"), "Page_MYTBSettingVC_pay_功能直达", null, null, "spm=a2141.20998086.2.8");
                }
            }
        });
        try {
            this.systemBarDecorator = new SystemBarDecorator(this);
            this.systemBarDecorator.enableImmersiveStatusBar(true);
        } catch (Throwable th) {
            Log.e("TBMainActivity", "enableImmersiveStatusBar failed:", th);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.20998086.2.1");
        com.taobao.mytaobao.ut.c.a(this, "Page_MYTBSettingVC_pay");
        com.taobao.mytaobao.ut.c.a(this, hashMap);
        b();
        c();
        d();
    }

    private void b() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f18402a = (TRecyclerView) findViewById(R.id.recycle_pay_setting_page_main_items);
        this.e = (TextView) findViewById(R.id.tv_pay_setting_desc);
        this.f18402a.setLayoutManager(new LinearLayoutManager(this, 1, false));
        String str = mxz.e;
        if (StringUtils.isEmpty(str) || (textView = this.e) == null) {
            return;
        }
        textView.setText(str);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b = new com.taobao.mytaobao.newsetting.adapter.a(this);
        this.f18402a.setAdapter(this.b);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.mytaobao.newsetting.NewPaySettingsActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    List parseArray = JSON.parseArray(com.taobao.mytaobao.newSettingV2.a.INSTANCE.a("key_cache_setting_pay"), PaySettingItem.class);
                    if (NewPaySettingsActivity.a(NewPaySettingsActivity.this) != null) {
                        return;
                    }
                    if (parseArray == null || parseArray.isEmpty()) {
                        NewPaySettingsActivity.a(NewPaySettingsActivity.this, mvn.a());
                    } else {
                        NewPaySettingsActivity.a(NewPaySettingsActivity.this, parseArray);
                    }
                }
            });
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            Coordinator.execute(new AnonymousClass3());
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        a();
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
        }
        TBS.Ext.commitEvent("Page_MYTBSettingVC_pay", Integer.parseInt("2101"), "Page_MYTBSettingVC_pay_返回", null, null, "spm=a2141.20998086.2.7");
        finish();
        return true;
    }

    private void a(final List<PaySettingItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.c = list;
        runOnUiThread(new Runnable() { // from class: com.taobao.mytaobao.newsetting.NewPaySettingsActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                NewPaySettingsActivity.b(NewPaySettingsActivity.this).a(list);
                NewPaySettingsActivity.b(NewPaySettingsActivity.this).notifyDataSetChanged();
            }
        });
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        String a2 = mvo.a(i, this.c);
        try {
            JSONObject parseObject = JSONObject.parseObject(intent.getStringExtra("result"));
            if (parseObject != null) {
                if (parseObject.getBoolean("cancel").booleanValue()) {
                    z = true;
                }
            }
        } catch (Exception unused) {
        }
        if (!StringUtils.isEmpty(a2) && !z) {
            Nav.from(this).toUri(a2);
        } else {
            a();
        }
    }
}
