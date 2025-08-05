package com.zoloz.android.phone.zdoc.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.workspace.BioFragmentContainer;
import com.alipay.mobile.security.bio.workspace.BioFragmentResponse;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.zoloz.android.phone.zdoc.bean.a;
import com.zoloz.android.phone.zdoc.fragment.BaseDocFragment;
import com.zoloz.android.phone.zdoc.fragment.BaseFragment;
import com.zoloz.android.phone.zdoc.module.DocModule;
import com.zoloz.android.phone.zdoc.module.ZdocRemoteConfig;
import java.util.HashMap;
import java.util.Locale;
import tb.kge;
import tb.rrp;
import tb.rrq;
import tb.rrr;
import tb.rrv;

/* loaded from: classes9.dex */
public class FalconCardNativeActivityNew extends BioFragmentContainer implements rrp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Class f;
    public Fragment g;
    public String h = "";
    public Bundle i = new Bundle();
    private rrv j;
    private String k;
    private FrameLayout l;

    public static /* synthetic */ Object ipc$super(FalconCardNativeActivityNew falconCardNativeActivityNew, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alipay.mobile.security.bio.workspace.BioFragmentContainer, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ void a(FalconCardNativeActivityNew falconCardNativeActivityNew, int i, BioUploadResult bioUploadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a646f99", new Object[]{falconCardNativeActivityNew, new Integer(i), bioUploadResult});
        } else {
            falconCardNativeActivityNew.a(i, bioUploadResult);
        }
    }

    static {
        kge.a(-2053742516);
        kge.a(-195586181);
        f = ZdocRemoteConfig.class;
    }

    @Override // com.alipay.mobile.security.bio.workspace.BioFragmentContainer, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        requestWindowFeature(1);
        setRequestedOrientation(1);
        super.onCreate(bundle);
        if (BioServiceManager.getCurrentInstance() == null) {
            BioLog.e(new IllegalStateException("null == BioServiceManager.getCurrentInstance()"));
            finish();
        } else if (this.e == null) {
            BioLog.e(new IllegalStateException("null == mBioAppDescription"));
            finish();
        } else {
            a(this.e.getExtProperty().get("locale"));
            c();
            rrq.a().a(this);
            d();
            try {
                ParserConfig.getGlobalInstance().putDeserializer(DocModule.class, new a());
                ZdocRemoteConfig zdocRemoteConfig = (ZdocRemoteConfig) JSON.parseObject(this.e.getCfg(), ZdocRemoteConfig.class);
                if (zdocRemoteConfig.getCaptureMode() == 1) {
                    this.h = "com.zoloz.android.phone.zdoc.fragment.ZdocScanTasksFragment";
                } else if (zdocRemoteConfig.getCaptureMode() == 2) {
                    this.h = "com.zoloz.android.phone.zdoc.fragment.ZdocScanFancyFragment";
                } else {
                    this.h = "com.zoloz.android.phone.zdoc.fragment.ZdocCaptureFragment";
                }
                this.i.putSerializable(ALBiometricsActivityParentView.p, this.e);
                this.i.putSerializable("config", zdocRemoteConfig);
                e();
            } catch (Exception e) {
                BioLog.e(e);
                finish();
            }
        }
    }

    private void a(String str) {
        Locale locale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
        } else {
            try {
                Configuration configuration = getResources().getConfiguration();
                if (str.contains("-")) {
                    String[] split = str.split("-");
                    if (split.length == 2) {
                        locale = new Locale(split[0], split[1]);
                    } else if (split.length == 1) {
                        locale = new Locale(split[0]);
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        locale = getResources().getConfiguration().getLocales().get(0);
                    } else {
                        locale = getResources().getConfiguration().locale;
                    }
                } else {
                    locale = new Locale(str);
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    configuration.setLocale(locale);
                } else {
                    configuration.locale = new Locale(str);
                }
                getBaseContext().getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
            } catch (Exception e) {
                BioLog.e(e);
            }
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        super.onRestart();
        Fragment fragment = this.g;
        if (fragment == null || !(fragment instanceof BaseFragment)) {
            return;
        }
        ((BaseFragment) fragment).onRestart();
    }

    private void c() {
        ApSecurityService apSecurityService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.j == null) {
            this.j = (rrv) BioServiceManager.getCurrentInstance().getBioService(rrv.class);
        }
        this.k = this.e.getCfg();
        HashMap hashMap = new HashMap();
        hashMap.put(rrv.PRODUCT_ID, "zoloz_zdoc");
        hashMap.put("sdkVersion", "3.0");
        hashMap.put(rrv.BISTOKEN, this.e.getBistoken());
        String staticApDidToken = ApSecurityService.getStaticApDidToken();
        if (TextUtils.isEmpty(staticApDidToken) && (apSecurityService = (ApSecurityService) BioServiceManager.getCurrentInstance().getBioService(ApSecurityService.class)) != null) {
            staticApDidToken = apSecurityService.getApDidToken();
        }
        hashMap.put(rrv.APDIDTOKEN, staticApDidToken);
        this.j.a(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("params", this.k);
        hashMap2.put("deviceBrand", Build.BRAND);
        this.j.a(rrv.START_ZDOC, hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("module", BlobManager.META_TYPE_DOC);
        this.j.a(rrv.ZTECH_ENTER, hashMap3);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.l = new FrameLayout(this);
        this.l.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.l.setId(16908300);
        setContentView(this.l);
    }

    private void e() {
        try {
            Class<?> cls = Class.forName(this.h, true, getClassLoader());
            try {
                String a2 = a(this.l.getId(), cls.getName());
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                BaseDocFragment baseDocFragment = (BaseDocFragment) supportFragmentManager.findFragmentByTag(a2);
                if (baseDocFragment != null) {
                    if (baseDocFragment.getArguments() == null) {
                        try {
                            baseDocFragment.setArguments(this.i);
                        } catch (IllegalStateException unused) {
                        }
                    } else {
                        baseDocFragment.getArguments().putAll(this.i);
                    }
                    beginTransaction.attach(baseDocFragment);
                } else {
                    baseDocFragment = (BaseDocFragment) cls.newInstance();
                    baseDocFragment.setArguments(this.i);
                    beginTransaction.replace(this.l.getId(), baseDocFragment, a2);
                }
                beginTransaction.commitAllowingStateLoss();
                this.g = baseDocFragment;
            } catch (Exception e) {
                BioLog.e(e);
                b();
            }
        } catch (ClassNotFoundException e2) {
            BioLog.e(e2);
            b();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        zoloz.ap.com.toolkit.ui.a aVar = new zoloz.ap.com.toolkit.ui.a(this);
        if (aVar.d()) {
            return;
        }
        new com.zoloz.android.phone.zdoc.utils.a().a(rrv.SYSTEM_EXCEPTION_ERROR);
        aVar.a(getString(R.string.system_error_title), getString(R.string.system_error_msg), getString(R.string.system_error_got_it), new DialogInterface.OnClickListener() { // from class: com.zoloz.android.phone.zdoc.activities.FalconCardNativeActivityNew.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                dialogInterface.dismiss();
                FalconCardNativeActivityNew.a(FalconCardNativeActivityNew.this, 205, null);
            }
        }, null, null);
    }

    private void a(int i, BioUploadResult bioUploadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d6b2b9e", new Object[]{this, new Integer(i), bioUploadResult});
            return;
        }
        rrr rrrVar = new rrr();
        rrrVar.b = i;
        rrrVar.c = bioUploadResult;
        rrq.a().a(rrrVar);
    }

    private String a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd4d069b", new Object[]{this, new Integer(i), str});
        }
        return getClass().getSimpleName() + ":" + i + ":" + str;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        Fragment fragment = this.g;
        if (fragment instanceof BaseDocFragment) {
            z = ((BaseDocFragment) fragment).onBackPressed();
        }
        if (z) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        Fragment fragment = this.g;
        if (fragment == null) {
            return;
        }
        ((BaseDocFragment) fragment).onWindowFocusChanged(z);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment fragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if ((i >> 16) == 0 && (fragment = this.g) != null) {
            fragment.onActivityResult(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // tb.rrp
    public void a(rrr rrrVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd98af66", new Object[]{this, rrrVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(rrv.ZDOC_RESULT, Integer.toString(rrrVar.b));
        if (this.j == null) {
            this.j = (rrv) BioServiceManager.getCurrentInstance().getBioService(rrv.class);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("module", BlobManager.META_TYPE_DOC);
        this.j.a(rrv.ZTECH_EXIT, hashMap2);
        this.j.a(rrv.END_ZDOC, hashMap);
        if (rrrVar == null) {
            return;
        }
        BioFragmentResponse bioFragmentResponse = new BioFragmentResponse();
        if (rrrVar.c != null) {
            if (rrrVar.c.productRetCode != 1001) {
                z = false;
            }
            bioFragmentResponse.isSucess = z;
            bioFragmentResponse.suggest = rrrVar.c.productRetCode;
            bioFragmentResponse.resultMessage = rrrVar.c.subMsg;
            bioFragmentResponse.ext.put(BioDetector.EXT_KEY_UPLOAD_RESPONSE, JSON.toJSONString(rrrVar.c));
        }
        bioFragmentResponse.errorCode = rrrVar.b;
        bioFragmentResponse.ext.putAll(rrrVar.f33341a);
        bioFragmentResponse.token = getAppDescription().getBistoken();
        int i = rrrVar.b;
        if (i == 101 || i == 200) {
            bioFragmentResponse.subCode = com.zoloz.android.phone.zdoc.constant.a.b;
            bioFragmentResponse.subMsg = com.zoloz.android.phone.zdoc.constant.a.a(bioFragmentResponse.subCode);
        } else if (i == 100) {
            bioFragmentResponse.subCode = com.zoloz.android.phone.zdoc.constant.a.b;
            bioFragmentResponse.subMsg = com.zoloz.android.phone.zdoc.constant.a.a(bioFragmentResponse.subCode);
        } else if (i == 205) {
            bioFragmentResponse.subCode = com.zoloz.android.phone.zdoc.constant.a.f24737a;
            bioFragmentResponse.subMsg = com.zoloz.android.phone.zdoc.constant.a.a(bioFragmentResponse.subCode);
        } else if (i == 209) {
            bioFragmentResponse.subCode = com.zoloz.android.phone.zdoc.constant.a.g;
            bioFragmentResponse.subMsg = com.zoloz.android.phone.zdoc.constant.a.a(bioFragmentResponse.subCode);
        } else if (i == 202) {
            bioFragmentResponse.subCode = com.zoloz.android.phone.zdoc.constant.a.f;
            bioFragmentResponse.subMsg = com.zoloz.android.phone.zdoc.constant.a.a(bioFragmentResponse.subCode);
        } else if (i == 203) {
            bioFragmentResponse.subCode = com.zoloz.android.phone.zdoc.constant.a.e;
            bioFragmentResponse.subMsg = com.zoloz.android.phone.zdoc.constant.a.a(bioFragmentResponse.subCode);
        } else if (i == 207) {
            bioFragmentResponse.subCode = com.zoloz.android.phone.zdoc.constant.a.d;
            bioFragmentResponse.subMsg = com.zoloz.android.phone.zdoc.constant.a.a(bioFragmentResponse.subCode);
        } else if (i == 208) {
            if (rrrVar.c != null) {
                bioFragmentResponse.subCode = rrrVar.c.subCode;
                bioFragmentResponse.subMsg = rrrVar.c.subMsg;
            } else {
                bioFragmentResponse.subCode = com.zoloz.android.phone.zdoc.constant.a.h;
                bioFragmentResponse.subMsg = com.zoloz.android.phone.zdoc.constant.a.a(bioFragmentResponse.subCode);
            }
        } else if (i == 301) {
            bioFragmentResponse.subCode = com.zoloz.android.phone.zdoc.constant.a.c;
            bioFragmentResponse.subMsg = com.zoloz.android.phone.zdoc.constant.a.a(bioFragmentResponse.subCode);
        }
        sendResponse(bioFragmentResponse);
        finishActivity(false);
    }

    @Override // com.alipay.mobile.security.bio.workspace.BioFragmentContainer, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        com.zoloz.android.phone.zdoc.ui.a.a();
    }
}
