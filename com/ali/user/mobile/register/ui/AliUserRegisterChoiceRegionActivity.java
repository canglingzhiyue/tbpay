package com.ali.user.mobile.register.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.ali.user.mobile.base.helper.SDKExceptionHelper;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.data.RegisterComponent;
import com.ali.user.mobile.exception.RpcException;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.register.RegistConstants;
import com.ali.user.mobile.register.model.BaseRegistRequest;
import com.ali.user.mobile.register.model.MtopCountryCodeContextResult;
import com.ali.user.mobile.register.model.MtopRegisterInitcontextResponseData;
import com.ali.user.mobile.ui.widget.AUBladeView;
import com.ali.user.mobile.ui.widget.AUPinnedHeaderListView;
import com.ali.user.mobile.utils.BackgroundExecutor;
import com.ali.user.mobile.utils.CountryCodeUtil;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class AliUserRegisterChoiceRegionActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CHOOSE_REGION_REQUEST = 2001;
    public static final int PERIOD = 3000;
    private boolean isFromJSBridge;
    private boolean isFromLogin;
    public String mErrorMessage;
    public String mHotCountryTitle;
    private List<String> mLetterList;
    private HashMap<String, Integer> mLetterMap;
    public AUBladeView mLetterView;
    private List<RegionInfo> mList;
    public AUPinnedHeaderListView mListView;
    public String mLocale;
    private String mTitle;

    static {
        kge.a(-1174546119);
        kge.a(54921071);
    }

    public static /* synthetic */ Object ipc$super(AliUserRegisterChoiceRegionActivity aliUserRegisterChoiceRegionActivity, String str, Object... objArr) {
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

    public static /* synthetic */ HashMap access$000(AliUserRegisterChoiceRegionActivity aliUserRegisterChoiceRegionActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("f3f64574", new Object[]{aliUserRegisterChoiceRegionActivity}) : aliUserRegisterChoiceRegionActivity.mLetterMap;
    }

    public static /* synthetic */ boolean access$100(AliUserRegisterChoiceRegionActivity aliUserRegisterChoiceRegionActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d2dcfb4", new Object[]{aliUserRegisterChoiceRegionActivity})).booleanValue() : aliUserRegisterChoiceRegionActivity.isFromLogin;
    }

    public static /* synthetic */ void access$200(AliUserRegisterChoiceRegionActivity aliUserRegisterChoiceRegionActivity, MtopRegisterInitcontextResponseData mtopRegisterInitcontextResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57e5ec29", new Object[]{aliUserRegisterChoiceRegionActivity, mtopRegisterInitcontextResponseData});
        } else {
            aliUserRegisterChoiceRegionActivity.getCountryCodeReq(mtopRegisterInitcontextResponseData);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        if (getIntent() != null) {
            try {
                this.isFromLogin = getIntent().getBooleanExtra("from_login", false);
                this.isFromJSBridge = getIntent().getBooleanExtra("from_jsbridge", false);
                this.mTitle = getIntent().getStringExtra("title");
                this.mHotCountryTitle = getIntent().getStringExtra("hotCountryTitle");
                this.mLocale = getIntent().getStringExtra("locale");
                this.mErrorMessage = getIntent().getStringExtra("errorMsg");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.onCreate(bundle);
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_register_region;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        this.mLetterView = (AUBladeView) findViewById(R.id.contacts_letters_list);
        this.mListView = (AUPinnedHeaderListView) findViewById(R.id.register_list);
        if (getSupportActionBar() != null) {
            if (TextUtils.isEmpty(this.mTitle)) {
                this.mTitle = getResources().getString(R.string.aliuser_choose_region);
            }
            getSupportActionBar().a(this.mTitle);
        }
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            this.mList = getIntent().getParcelableArrayListExtra("region");
            this.mLetterMap = (HashMap) getIntent().getSerializableExtra(RegistConstants.LETTER);
            this.mLetterList = getIntent().getStringArrayListExtra(RegistConstants.LETTER_STR);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.mLetterMap == null) {
            this.mLetterMap = new HashMap<>();
        }
        if (this.mLetterList == null) {
            this.mLetterList = new ArrayList();
        }
        if (this.mList != null && this.mLetterMap != null && this.mLetterList.size() > 0) {
            setupAdapter();
        } else {
            getCountryCode();
        }
    }

    private void setupAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66cd599", new Object[]{this});
            return;
        }
        this.mListView.setAdapter((ListAdapter) new RegionAdapter(this, this.mList));
        this.mListView.setPinnedHeaderView(LayoutInflater.from(this).inflate(R.layout.aliuser_contact_list_head, (ViewGroup) this.mListView, false));
        this.mListView.setOnItemClickListener(this);
        this.mLetterView.setOnItemClickListener(new AUBladeView.OnItemClickListener() { // from class: com.ali.user.mobile.register.ui.AliUserRegisterChoiceRegionActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.AUBladeView.OnItemClickListener
            public void onItemClick(String str) {
                int intValue;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7d50b127", new Object[]{this, str});
                } else if (str == null || !AliUserRegisterChoiceRegionActivity.access$000(AliUserRegisterChoiceRegionActivity.this).containsKey(str) || (intValue = ((Integer) AliUserRegisterChoiceRegionActivity.access$000(AliUserRegisterChoiceRegionActivity.this).get(str)).intValue()) == -1) {
                } else {
                    AliUserRegisterChoiceRegionActivity.this.mListView.setSelection(intValue);
                }
            }
        });
    }

    public void getCountryCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8570b74", new Object[]{this});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.register.ui.AliUserRegisterChoiceRegionActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        AliUserRegisterChoiceRegionActivity.this.startAnimation();
                        HashMap hashMap = new HashMap();
                        BaseRegistRequest baseRegistRequest = new BaseRegistRequest();
                        baseRegistRequest.ext = hashMap;
                        AliUserRegisterChoiceRegionActivity.access$200(AliUserRegisterChoiceRegionActivity.this, AliUserRegisterChoiceRegionActivity.access$100(AliUserRegisterChoiceRegionActivity.this) ? (MtopRegisterInitcontextResponseData) LoginComponent.getInstance().getCountryList() : RegisterComponent.getInstance().countryCodeRes(baseRegistRequest));
                    } catch (RpcException e) {
                        AliUserRegisterChoiceRegionActivity.this.stopAnimation();
                        SDKExceptionHelper.getInstance().rpcExceptionHandler(e);
                    }
                }
            });
        }
    }

    private void getCountryCodeReq(final MtopRegisterInitcontextResponseData mtopRegisterInitcontextResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f32fa12", new Object[]{this, mtopRegisterInitcontextResponseData});
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.register.ui.AliUserRegisterChoiceRegionActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (AliUserRegisterChoiceRegionActivity.this.isFinishing()) {
                    } else {
                        AliUserRegisterChoiceRegionActivity.this.afterCountryCode(mtopRegisterInitcontextResponseData);
                    }
                }
            });
        }
    }

    public void afterCountryCode(MtopRegisterInitcontextResponseData mtopRegisterInitcontextResponseData) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25fe048", new Object[]{this, mtopRegisterInitcontextResponseData});
            return;
        }
        dismissProgressDialog();
        if (mtopRegisterInitcontextResponseData == null || mtopRegisterInitcontextResponseData.returnValue == 0) {
            return;
        }
        if (((MtopCountryCodeContextResult) mtopRegisterInitcontextResponseData.returnValue).countrycodes != null) {
            if (TextUtils.isEmpty(this.mHotCountryTitle)) {
                this.mHotCountryTitle = getResources().getString(R.string.aliuser_common_region);
            }
            this.mList = CountryCodeUtil.fillData(this.mHotCountryTitle, ((MtopCountryCodeContextResult) mtopRegisterInitcontextResponseData.returnValue).countrycodes, this.mLetterMap, this.mLetterList);
            if (this.mList != null && this.mLetterMap != null && (list = this.mLetterList) != null && list.size() > 0) {
                setupAdapter();
                return;
            }
            if (TextUtils.isEmpty(this.mErrorMessage)) {
                this.mErrorMessage = getResources().getString(R.string.aliuser_network_error);
            }
            toast(this.mErrorMessage, 3000);
            return;
        }
        toast(mtopRegisterInitcontextResponseData.message, 3000);
    }

    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        } else {
            showProgress("");
        }
    }

    public void stopAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230f929", new Object[]{this});
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.register.ui.AliUserRegisterChoiceRegionActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AliUserRegisterChoiceRegionActivity.this.dismissProgressDialog();
                    }
                }
            });
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
            return;
        }
        RegionInfo regionInfo = this.mList.get(i);
        Intent intent = new Intent();
        if (!this.isFromJSBridge) {
            intent.putExtra("region", regionInfo);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("checkPattern", regionInfo.checkPattern);
            jSONObject.put("code", regionInfo.code);
            jSONObject.put("pinyin", regionInfo.pinyin);
            jSONObject.put("domain", regionInfo.domain);
            jSONObject.put("name", regionInfo.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        intent.putExtra("regionString", jSONObject.toString());
        Properties properties = new Properties();
        properties.put("position", i + "");
        properties.put("countryCode", regionInfo.domain + "");
        UserTrackAdapter.sendUT("List_Reg_selectCountry", properties);
        setResult(-1, intent);
        finish();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        setResult(0);
        finish();
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        AUPinnedHeaderListView aUPinnedHeaderListView = this.mListView;
        if (aUPinnedHeaderListView != null) {
            aUPinnedHeaderListView.setOnItemClickListener(null);
        }
        super.onDestroy();
    }
}
