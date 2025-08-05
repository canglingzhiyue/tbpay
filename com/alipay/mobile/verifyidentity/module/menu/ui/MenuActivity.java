package com.alipay.mobile.verifyidentity.module.menu.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.module.menu.MenuModule;
import com.alipay.mobile.verifyidentity.module.menu.data.MenuData;
import com.alipay.mobile.verifyidentity.module.menu.data.MenuDataExtra;
import com.alipay.mobile.verifyidentity.module.menu.data.MenuMacan;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class MenuActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5914a = "MenuActivity";
    private MenuDataExtra b;
    private LinearLayout c;
    private ScrollView d;
    private boolean e;

    /* loaded from: classes3.dex */
    public class MenuClickRpc implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f5915a;
        private String b;

        public MenuClickRpc(String str, String str2) {
            this.f5915a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                MenuActivity.this.showProgressDialog("");
                MICRpcRequest mICRpcRequest = new MICRpcRequest();
                mICRpcRequest.module = MenuActivity.access$400(MenuActivity.this) ? this.b : !TextUtils.isEmpty(this.f5915a) ? "INIT" : ModuleConstants.VI_MODULE_VERIFY_INIT;
                mICRpcRequest.verifyId = MenuActivity.access$500(MenuActivity.this).getVerifyId();
                mICRpcRequest.token = this.f5915a;
                MICRpcResponse dispatch = new MICRpcServiceBiz().dispatch(mICRpcRequest);
                MenuActivity.this.dismissProgressDialog();
                MenuActivity.access$600(MenuActivity.this, dispatch);
            } catch (RpcException e) {
                MenuActivity.this.dismissProgressDialog();
                throw e;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(MenuActivity menuActivity, String str, Object... objArr) {
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

    public static /* synthetic */ MicroModule access$000(MenuActivity menuActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("853472ce", new Object[]{menuActivity}) : menuActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$100(MenuActivity menuActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("13bff3cf", new Object[]{menuActivity}) : menuActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$200(MenuActivity menuActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("a24b74d0", new Object[]{menuActivity}) : menuActivity.mModule;
    }

    public static /* synthetic */ MicroModuleContext access$300(MenuActivity menuActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModuleContext) ipChange.ipc$dispatch("8617a70c", new Object[]{menuActivity}) : menuActivity.mMicroModuleContext;
    }

    public static /* synthetic */ boolean access$400(MenuActivity menuActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c72cdf14", new Object[]{menuActivity})).booleanValue() : menuActivity.e;
    }

    public static /* synthetic */ MicroModule access$500(MenuActivity menuActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("4dedf7d3", new Object[]{menuActivity}) : menuActivity.mModule;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.verify_menu_activity);
        this.c = (LinearLayout) findViewById(R.id.list_root);
        this.d = (ScrollView) findViewById(R.id.scroll_view_root);
        if (getIntent() == null) {
            notifyError();
        } else {
            String stringExtra = getIntent().getStringExtra(MenuModule.ModuleData);
            if (TextUtils.isEmpty(stringExtra)) {
                notifyError();
            } else {
                this.e = getIntent().getBooleanExtra(PayPwdModule.IS_IPAY, false);
                if (this.e) {
                    writePwdBehavorLog("UC-MobileIC-20190606-6", "VIEW_MENU", "wallet_macao");
                    MenuMacan menuMacan = (MenuMacan) JSON.parseObject(stringExtra, MenuMacan.class);
                    this.b = new MenuDataExtra();
                    this.b.title = menuMacan.form_title;
                    this.b.menu = menuMacan.methods;
                } else {
                    writePwdBehavorLog("UC-MobileIC-20190606-6", "VIEW_MENU", "wallet_cn");
                    this.b = (MenuDataExtra) JSON.parseObject(stringExtra, MenuDataExtra.class);
                }
            }
        }
        MenuData menuData = new MenuData();
        menuData.title = this.b.title;
        menuData.menu = this.b.menu;
        a(menuData);
        if (this.b.innerMenu == null) {
            VerifyLogCat.i(f5914a, "no extra list needed to be shown.");
            return;
        }
        for (MenuData menuData2 : this.b.innerMenu) {
            a(menuData2);
        }
        this.d.smoothScrollTo(0, 20);
    }

    private void a(MenuData menuData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e4e258", new Object[]{this, menuData});
        } else if (menuData == null || menuData.menu == null || menuData.menu.size() <= 0) {
            VerifyLogCat.w(f5914a, "mMenuData is not legal");
            notifyError();
        } else {
            this.c.addView(new MenuListView(this, menuData));
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            alert("", getResources().getString(R.string.menu_quit_message), getResources().getString(R.string.verifyidentity_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.menu.ui.MenuActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        MenuActivity.access$300(MenuActivity.this).notifyAndFinishModule(MenuActivity.access$000(MenuActivity.this).getVerifyId(), MenuActivity.access$100(MenuActivity.this).getToken(), MenuActivity.access$200(MenuActivity.this).getModuleName(), new DefaultModuleResult("1003"));
                    }
                }
            }, getResources().getString(R.string.give_up), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.menu.ui.MenuActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    }
                }
            });
        }
    }

    public MenuClickRpc getMenuClickRpc(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MenuClickRpc) ipChange.ipc$dispatch("d64acd98", new Object[]{this, str, str2}) : new MenuClickRpc(str, str2);
    }

    public void notifyError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b87bd46", new Object[]{this});
        } else {
            this.mMicroModuleContext.notifyAndFinishModule(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), new DefaultModuleResult("2002"));
        }
    }

    public void writePwdBehavorLog(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d15438a", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("module", ModuleConstants.VI_MODULE_MENU);
        hashMap.put("code", str2);
        hashMap.put("source", str3);
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "aavv", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
    }

    public static /* synthetic */ void access$600(MenuActivity menuActivity, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba2c186c", new Object[]{menuActivity, mICRpcResponse});
            return;
        }
        VerifyLogCat.d(f5914a, "processRpcResult");
        ModuleExecuteResult moduleExecuteResult = new ModuleExecuteResult();
        moduleExecuteResult.setMICRpcResponse(mICRpcResponse);
        menuActivity.mMicroModuleContext.notifyAndFinishModule(menuActivity.mModule.getVerifyId(), menuActivity.mModule.getToken(), menuActivity.mModule.getModuleName(), moduleExecuteResult);
    }
}
