package com.alipay.mobile.verifyidentity.prodmanger.biopen.helper;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.data.BioPageData;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICProdmngRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class BioListHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5971a = "BioListHelper";
    private static long b;

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            d();
        }
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f5971a;
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            MicroModuleContext.getInstance().toast(MicroModuleContext.getInstance().getContext().getResources().getString(R.string.vi_system_error), R.drawable.vi_warning, 0);
        }
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            MicroModuleContext.getInstance().toast(MicroModuleContext.getInstance().getContext().getResources().getString(R.string.vi_network_error), R.drawable.vi_warning, 0);
        }
    }

    public static void doBioListRequest(final String str, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6547d9cf", new Object[]{str, bundle});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - b;
        if (0 >= j || j >= 1000) {
            b = elapsedRealtime;
            z = false;
        }
        if (z) {
            return;
        }
        final Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioListHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MicroModuleContext.getInstance().showProgressDialog("");
                    MICProdmngRequest mICProdmngRequest = new MICProdmngRequest();
                    mICProdmngRequest.envData = EnvInfoUtil.getBaseEnvData();
                    mICProdmngRequest.module = str;
                    mICProdmngRequest.action = "query";
                    mICProdmngRequest.params = new HashMap();
                    for (String str2 : bundle2.keySet()) {
                        mICProdmngRequest.params.put(str2, bundle2.get(str2));
                    }
                    BioListHelper.a(new MICRpcServiceBiz().prodmng(mICProdmngRequest), str, bundle);
                    MicroModuleContext.getInstance().dismissProgressDialog();
                } catch (RpcException unused) {
                    MicroModuleContext.getInstance().dismissProgressDialog();
                    BioListHelper.a();
                    VerifyLogCat.e(BioListHelper.b(), "RpcException");
                }
            }
        }, "QUERY_BIO_LIST");
    }

    public static /* synthetic */ void a(MICProdmngResponse mICProdmngResponse, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b7fe7e", new Object[]{mICProdmngResponse, str, bundle});
        } else if (mICProdmngResponse == null) {
            String str2 = f5971a;
            VerifyLogCat.i(str2, "产品列表页面请求rpc异常 response: " + mICProdmngResponse);
            d();
        } else {
            if (bundle != null) {
                String string = bundle.getString("sceneId");
                String valueOf = String.valueOf(mICProdmngResponse.success);
                String str3 = mICProdmngResponse.code;
                String valueOf2 = String.valueOf(mICProdmngResponse.finish);
                HashMap hashMap = new HashMap();
                hashMap.put("success", valueOf);
                hashMap.put("module", str);
                hashMap.put("code", str3);
                hashMap.put("finish", valueOf2);
                hashMap.put("sceneId", string);
                VerifyLogger.getInstance().eventBehavior("UC-MobileIC-20180830-1", "", "", "", hashMap);
            }
            if (mICProdmngResponse.data == null) {
                d();
            } else if (mICProdmngResponse.success) {
                if (mICProdmngResponse.data != null) {
                    String str4 = mICProdmngResponse.data.get("result");
                    String str5 = mICProdmngResponse.data.get("introduceText");
                    String str6 = mICProdmngResponse.data.get("introduceUrl");
                    String str7 = f5971a;
                    VerifyLogCat.i(str7, "产品列表页面请求rpc结果，bioListData: " + str4 + ", introduceText: " + str5 + ", introduceUrl: " + str6);
                    if (StringUtils.isEmpty(str4)) {
                        c();
                        return;
                    }
                    try {
                        BioPageData bioPageData = (BioPageData) JSON.parseObject(str4, BioPageData.class);
                        if (str4 == null) {
                            c();
                        } else {
                            if (bioPageData.menuGroup != null && bioPageData.menuGroup.get(0) != null) {
                                if (bioPageData.menuGroup.get(0).menus == null) {
                                    c();
                                }
                            }
                            c();
                        }
                    } catch (Exception unused) {
                        VerifyLogCat.i(f5971a, "json fail");
                        c();
                    }
                    Intent intent = new Intent(MicroModuleContext.getInstance().getContext(), BioListActivity.class);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("bioListData", str4);
                    bundle2.putString("biolistintroducetxt", str5);
                    bundle2.putString("biolistintrodicturl", str6);
                    bundle2.putBundle("initParams", bundle);
                    intent.putExtras(bundle2);
                    MicroModuleContext.getInstance().startProdActivityByContext(intent);
                    return;
                }
                c();
            } else {
                c();
            }
        }
    }
}
