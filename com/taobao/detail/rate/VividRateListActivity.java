package com.taobao.detail.rate;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.android.litecreator.localization.a;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.detail.rate.model.RateInfo;
import com.taobao.detail.rate.model.itemrates.entity.RateKeyword;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import tb.bpp;
import tb.kil;
import tb.kim;

/* loaded from: classes7.dex */
public class VividRateListActivity extends CustomBaseActivity implements RateFeedsFragment.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f17004a;
    private int b;
    private String c;
    private RateInfo d;

    public static /* synthetic */ Object ipc$super(VividRateListActivity vividRateListActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
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

    @Override // com.taobao.detail.rate.RateFeedsFragment.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
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

    public VividRateListActivity() {
        f.a("com.taobao.detail.rate", "com.taobao.detail.rate.VividRateListActivity");
        ApplicationInvoker.getInstance("com.taobao.detail.rate").invoke("com.taobao.detail.rate.RateDisplayApplication", TaobaoApplication.sApplication);
        this.b = 0;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.d = a(getIntent());
        if (TextUtils.isEmpty(this.c)) {
            setTitle(a.a(R.string.rate_rate));
        } else {
            setTitle(this.c);
        }
        if (this.d == null) {
            kim.a(a.a(R.string.rate_data_read_fail_retry));
            finish();
            return;
        }
        setContentView(R.layout.rate_list_layout);
        d dVar = new d();
        dVar.a(this.d);
        dVar.a(this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        beginTransaction.add(R.id.rate_list_container, dVar.a(), "RateFeedsFragment");
        beginTransaction.addToBackStack(null);
        beginTransaction.commitAllowingStateLoss();
        try {
            supportFragmentManager.executePendingTransactions();
        } catch (IllegalStateException unused) {
        }
    }

    private RateInfo a(Intent intent) {
        String str;
        ArrayList arrayList;
        String str2;
        String str3 = "::";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RateInfo) ipChange.ipc$dispatch("7a10c65e", new Object[]{this, intent});
        }
        RateInfo.a aVar = new RateInfo.a();
        String str4 = "itemId";
        String stringExtra = intent.getStringExtra(str4);
        String stringExtra2 = intent.getStringExtra("invokeSource");
        String stringExtra3 = intent.getStringExtra("feedId");
        String stringExtra4 = intent.getStringExtra("rateTitle");
        String stringExtra5 = intent.getStringExtra("foldFlag");
        String stringExtra6 = intent.getStringExtra("expression");
        String stringExtra7 = intent.getStringExtra("sellId");
        String str5 = stringExtra;
        String stringExtra8 = intent.getStringExtra("shopId");
        String str6 = stringExtra2;
        String stringExtra9 = intent.getStringExtra("skuVids");
        String str7 = stringExtra3;
        String stringExtra10 = intent.getStringExtra("selectTag");
        if (intent == null) {
            return null;
        }
        String str8 = stringExtra4;
        Uri data = intent.getData();
        if (data != null) {
            Set<String> a2 = kil.a(data);
            if (!a2.isEmpty()) {
                for (String str9 : a2) {
                    String str10 = str3;
                    if (!TextUtils.isEmpty(str9)) {
                        if (TextUtils.isEmpty(str5) && str9.equalsIgnoreCase(str4)) {
                            str5 = data.getQueryParameter(str9);
                        } else if (TextUtils.isEmpty(str6) && str9.equalsIgnoreCase("invokeSource")) {
                            str6 = data.getQueryParameter(str9);
                        } else if (TextUtils.isEmpty(str7) && str9.equalsIgnoreCase("feedId")) {
                            str7 = data.getQueryParameter(str9);
                        } else if (TextUtils.isEmpty(str8) && "rateTitle".equals(str9)) {
                            str8 = data.getQueryParameter(str9);
                        } else if (TextUtils.isEmpty(stringExtra5) && "foldFlag".equals(str9)) {
                            stringExtra5 = data.getQueryParameter(str9);
                        } else if (TextUtils.isEmpty(stringExtra6) && str9.equalsIgnoreCase("expression")) {
                            stringExtra6 = data.getQueryParameter(str9);
                        } else if (TextUtils.isEmpty(stringExtra7) && str9.equalsIgnoreCase("sellId")) {
                            stringExtra7 = data.getQueryParameter(str9);
                        } else if (TextUtils.isEmpty(stringExtra8) && str9.equalsIgnoreCase("shopId")) {
                            stringExtra8 = data.getQueryParameter(str9);
                        } else if (TextUtils.isEmpty(stringExtra9) && str9.equalsIgnoreCase("skuVids")) {
                            stringExtra9 = data.getQueryParameter(str9);
                        } else if (TextUtils.isEmpty(stringExtra10) && str9.equalsIgnoreCase("selectTag")) {
                            stringExtra10 = data.getQueryParameter(str9);
                        } else {
                            str2 = str4;
                            if ("pageName".equals(str9)) {
                                this.f17004a = data.getQueryParameter(str9);
                                if (!TextUtils.isEmpty(this.f17004a)) {
                                    setUTPageName(this.f17004a);
                                }
                            }
                        }
                        str3 = str10;
                    } else {
                        str2 = str4;
                    }
                    str4 = str2;
                    str3 = str10;
                }
            }
        }
        String str11 = str3;
        String str12 = stringExtra6;
        String str13 = stringExtra7;
        String str14 = stringExtra8;
        String str15 = str6;
        String str16 = stringExtra9;
        String str17 = str7;
        String str18 = stringExtra10;
        this.c = str8;
        aVar.a(str5);
        if (kil.a(str15, -1) != -1) {
            aVar.a(kil.a(str15, -1));
        }
        if (kil.a(str17, -1L) != -1) {
            aVar.a(kil.a(str17, -1L));
        }
        if (kil.a(stringExtra5, 0) == 1) {
            aVar.b(kil.a(stringExtra5, 0));
        }
        aVar.c(str12);
        aVar.g(str13);
        aVar.b(str14);
        aVar.h(str16);
        aVar.f(str18);
        try {
            aVar.a(JSONObject.parseObject(JSONObject.toJSONString(intent.getSerializableExtra("rateExtParams"))));
            str = str11;
        } catch (Throwable th) {
            UMLinkLogInterface a3 = bpp.a();
            StringBuilder sb = new StringBuilder();
            sb.append(th.toString());
            str = str11;
            sb.append(str);
            sb.append(intent.getSerializableExtra("rateExtParams"));
            a3.commitFailure("rateList", "setQuestionData", "1.0", "rateList", "", null, "setQuestionData", sb.toString());
        }
        try {
            aVar.b(JSONObject.parseObject(JSONObject.toJSONString(intent.getSerializableExtra("askInfo"))));
        } catch (Throwable th2) {
            UMLinkLogInterface a4 = bpp.a();
            a4.commitFailure("rateList", "setQuestionData", "1.0", "rateList", "", null, "setQuestionData", th2.toString() + str + intent.getSerializableExtra("askInfo"));
        }
        try {
            aVar.e(JSONObject.parseObject(JSONObject.toJSONString(intent.getSerializableExtra("exParams"))));
        } catch (Throwable th3) {
            UMLinkLogInterface a5 = bpp.a();
            a5.commitFailure("rateList", "exParams", "1.0", "rateList", "", null, "exParams", th3.toString() + str + intent.getSerializableExtra("exParams"));
        }
        try {
            aVar.d(JSONObject.parseObject(JSONObject.toJSONString(intent.getSerializableExtra("itemInfo"))));
        } catch (Throwable th4) {
            UMLinkLogInterface a6 = bpp.a();
            a6.commitFailure("rateList", "itemInfo", "1.0", "rateList", "", null, "itemInfo", th4.toString() + str + intent.getSerializableExtra("itemInfo"));
        }
        try {
            aVar.c(JSONObject.parseObject(JSONObject.toJSONString(intent.getSerializableExtra("skuInfo"))));
        } catch (Throwable th5) {
            UMLinkLogInterface a7 = bpp.a();
            a7.commitFailure("rateList", "setSkuInfo", "1.0", "rateList", "", null, "setSkuInfo", th5.toString() + str + intent.getSerializableExtra("skuInfo"));
        }
        try {
            Serializable serializableExtra = intent.getSerializableExtra("rateKeywordList");
            if (serializableExtra != null && (arrayList = (ArrayList) JSONObject.parseArray(JSONObject.toJSONString(serializableExtra), RateKeyword.class)) != null) {
                aVar.a(arrayList);
            }
        } catch (Throwable th6) {
            bpp.a().commitFailure("rateList", "setRateKeywords", "1.0", "rateList", "", null, "setRateKeywords", th6.toString());
        }
        if (TextUtils.isEmpty(aVar.a())) {
            return null;
        }
        return aVar.b();
    }

    @Override // com.taobao.detail.rate.RateFeedsFragment.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b == 1) {
        } else {
            finish();
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        kim.a();
        super.onDestroy();
    }
}
