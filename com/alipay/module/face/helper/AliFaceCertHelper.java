package com.alipay.module.face.helper;

import android.os.Bundle;
import android.os.SystemClock;
import com.alibaba.security.rp.scanface.AuditResultCallback;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.alipay.module.face.helper.AliFaceCallback;
import com.alipay.module.face.helper.NewAliFaceCallback;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class AliFaceCertHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f6110a;
    public String b;
    public String c;
    public MicroModule d;
    public Bundle e;
    public long f;
    public NewAliFaceCallback g = new NewAliFaceCallback(new NewAliFaceCallback.NewAliFaceResultCallback() { // from class: com.alipay.module.face.helper.AliFaceCertHelper.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.module.face.helper.NewAliFaceCallback.NewAliFaceResultCallback
        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            VerifyLogCat.i("AliFaceCertHelper", "集团人脸, onResultCallback:" + i);
            if (i != 1) {
                AliFaceCertHelper.a(AliFaceCertHelper.this, i);
            } else {
                AliFaceCertHelper.a(AliFaceCertHelper.this);
            }
        }
    });
    public AliFaceCallback.AliFaceResultCallback h = new AliFaceCallback.AliFaceResultCallback() { // from class: com.alipay.module.face.helper.AliFaceCertHelper.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.module.face.helper.AliFaceCallback.AliFaceResultCallback
        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            VerifyLogCat.d("AliFaceCertHelper", String.valueOf(i));
            AliFaceCertHelper.a(AliFaceCertHelper.this, SystemClock.elapsedRealtime());
            AliFaceCertHelper.b("UC-MobileIC-180108-2", AliFaceCertHelper.b(AliFaceCertHelper.this), AliFaceCertHelper.c(AliFaceCertHelper.this), String.valueOf(AliFaceCertHelper.d(AliFaceCertHelper.this) - AliFaceCertHelper.e(AliFaceCertHelper.this)), String.valueOf(i));
            if (i != 1) {
                AliFaceCertHelper.a(AliFaceCertHelper.this, i);
            } else {
                AliFaceCertHelper.a(AliFaceCertHelper.this);
            }
        }
    };
    public AuditResultCallback i = new AliFaceCallback(this.h);
    private long j;

    public static /* synthetic */ long a(AliFaceCertHelper aliFaceCertHelper, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36a0dcd1", new Object[]{aliFaceCertHelper, new Long(j)})).longValue();
        }
        aliFaceCertHelper.j = j;
        return j;
    }

    public static /* synthetic */ void a(AliFaceCertHelper aliFaceCertHelper, ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee642d7", new Object[]{aliFaceCertHelper, moduleExecuteResult});
        } else {
            aliFaceCertHelper.a((MICRpcResponse) null, moduleExecuteResult);
        }
    }

    public static /* synthetic */ String b(AliFaceCertHelper aliFaceCertHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b210bbfa", new Object[]{aliFaceCertHelper}) : aliFaceCertHelper.f6110a;
    }

    public static /* synthetic */ void b(AliFaceCertHelper aliFaceCertHelper, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("668e6c98", new Object[]{aliFaceCertHelper, mICRpcResponse});
        } else {
            aliFaceCertHelper.a(mICRpcResponse);
        }
    }

    public static /* synthetic */ void b(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2001a9b", new Object[]{str, str2, str3, str4, str5});
        } else {
            a(str, str2, str3, str4, str5);
        }
    }

    public static /* synthetic */ String c(AliFaceCertHelper aliFaceCertHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("953c6f3b", new Object[]{aliFaceCertHelper}) : aliFaceCertHelper.b;
    }

    public static /* synthetic */ long d(AliFaceCertHelper aliFaceCertHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb706e98", new Object[]{aliFaceCertHelper})).longValue() : aliFaceCertHelper.j;
    }

    public static /* synthetic */ long e(AliFaceCertHelper aliFaceCertHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d58bed37", new Object[]{aliFaceCertHelper})).longValue() : aliFaceCertHelper.f;
    }

    public static /* synthetic */ MicroModule f(AliFaceCertHelper aliFaceCertHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("72149ea4", new Object[]{aliFaceCertHelper}) : aliFaceCertHelper.d;
    }

    public AliFaceCertHelper(MicroModule microModule, String str, String str2, String str3, Bundle bundle) {
        VerifyLogCat.d("AliFaceCertHelper", "AliFaceCertHelper onCreate");
        this.d = microModule;
        this.f6110a = str;
        this.b = str2;
        this.c = str3;
        this.e = bundle;
        if (this.e == null) {
            this.e = new Bundle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (android.text.StringUtils.isEmpty(r0) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(final com.alipay.mobileic.core.model.rpc.MICRpcResponse r9, final com.alipay.mobile.verifyidentity.data.ModuleExecuteResult r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.module.face.helper.AliFaceCertHelper.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            r2 = 1
            r1[r2] = r9
            r9 = 2
            r1[r9] = r10
            java.lang.String r9 = "105a29e8"
            r0.ipc$dispatch(r9, r1)
            return
        L18:
            if (r9 == 0) goto L25
            java.lang.String r0 = r9.verifyMessage
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            if (r1 == 0) goto L23
            goto L35
        L23:
            r3 = r0
            goto L48
        L25:
            com.alipay.mobile.verifyidentity.module.MicroModule r0 = r8.d
            com.alipay.mobile.verifyidentity.data.VerifyIdentityTask r0 = r0.getTask()
            boolean r0 = r0.getPluginOrProxyMode()
            if (r0 == 0) goto L35
            r8.a(r10)
            return
        L35:
            com.alipay.mobile.verifyidentity.engine.MicroModuleContext r0 = com.alipay.mobile.verifyidentity.engine.MicroModuleContext.getInstance()
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.taobao.taobao.R.string.face_res_net_error
            java.lang.String r0 = r0.getString(r1)
            goto L23
        L48:
            com.alipay.mobile.verifyidentity.engine.MicroModuleContext r1 = com.alipay.mobile.verifyidentity.engine.MicroModuleContext.getInstance()
            r2 = 0
            com.alipay.mobile.verifyidentity.engine.MicroModuleContext r0 = com.alipay.mobile.verifyidentity.engine.MicroModuleContext.getInstance()
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r4 = com.taobao.taobao.R.string.face_res_error_confirm
            java.lang.String r4 = r0.getString(r4)
            com.alipay.module.face.helper.AliFaceCertHelper$4 r5 = new com.alipay.module.face.helper.AliFaceCertHelper$4
            r5.<init>()
            r6 = 0
            r7 = 0
            r1.alert(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.module.face.helper.AliFaceCertHelper.a(com.alipay.mobileic.core.model.rpc.MICRpcResponse, com.alipay.mobile.verifyidentity.data.ModuleExecuteResult):void");
    }

    private void a(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28c656", new Object[]{this, mICRpcResponse});
            return;
        }
        ModuleExecuteResult moduleExecuteResult = new ModuleExecuteResult();
        moduleExecuteResult.setMICRpcResponse(mICRpcResponse);
        a(moduleExecuteResult);
    }

    public final void a(ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("515b1096", new Object[]{this, moduleExecuteResult});
        } else {
            MicroModuleContext.getInstance().notifyModuleResult(this.f6110a, this.b, this.d.getModuleName(), moduleExecuteResult);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audit", str5);
        VerifyLogger.getInstance().eventBehavior(str, str2, str3, str4, hashMap);
    }

    public static /* synthetic */ void a(AliFaceCertHelper aliFaceCertHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d1df2c7", new Object[]{aliFaceCertHelper});
        } else {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.module.face.helper.AliFaceCertHelper.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        MICRpcRequest mICRpcRequest = new MICRpcRequest();
                        mICRpcRequest.action = "VERIFY_ALIFACE";
                        mICRpcRequest.module = AliFaceCertHelper.f(AliFaceCertHelper.this).getModuleName();
                        mICRpcRequest.verifyId = AliFaceCertHelper.b(AliFaceCertHelper.this);
                        mICRpcRequest.token = AliFaceCertHelper.c(AliFaceCertHelper.this);
                        AliFaceCertHelper.a(AliFaceCertHelper.this, new MICRpcServiceBiz().dispatch(mICRpcRequest));
                    } catch (RpcException e) {
                        VerifyLogCat.e("AliFaceCertHelper", "RpcException " + e.getMessage());
                        AliFaceCertHelper.a(AliFaceCertHelper.this, new DefaultModuleResult("2003"));
                    } catch (Exception unused) {
                        AliFaceCertHelper.a(AliFaceCertHelper.this, new DefaultModuleResult("2002"));
                    }
                }
            }, ModuleConstants.VI_MODULE_NAME_ALIFACE);
        }
    }

    public static /* synthetic */ void a(AliFaceCertHelper aliFaceCertHelper, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a0d91c", new Object[]{aliFaceCertHelper, new Integer(i)});
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (i == -1) {
            DefaultModuleResult defaultModuleResult = new DefaultModuleResult("1003");
            hashMap.put("faceResult", "cancel");
            defaultModuleResult.setExtInfo(hashMap);
            MicroModuleContext.getInstance().notifyAndFinishModule(aliFaceCertHelper.f6110a, aliFaceCertHelper.b, aliFaceCertHelper.d.getModuleName(), defaultModuleResult);
            return;
        }
        if (i == -2) {
            hashMap.put("faceResult", "exception");
            str = "2002";
        } else if (i == 2) {
            hashMap.put("faceResult", "failed");
            str = "1001";
        } else {
            str = "";
        }
        ModuleExecuteResult moduleExecuteResult = new ModuleExecuteResult();
        MICRpcResponse mICRpcResponse = new MICRpcResponse();
        mICRpcResponse.finishCode = str;
        moduleExecuteResult.setExtInfo(hashMap);
        moduleExecuteResult.setMICRpcResponse(mICRpcResponse);
        aliFaceCertHelper.a(moduleExecuteResult);
    }

    public static /* synthetic */ void a(AliFaceCertHelper aliFaceCertHelper, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6306c997", new Object[]{aliFaceCertHelper, mICRpcResponse});
        } else if (mICRpcResponse != null && mICRpcResponse.success) {
            if (mICRpcResponse.verifySuccess) {
                aliFaceCertHelper.a(mICRpcResponse);
            } else {
                aliFaceCertHelper.a(mICRpcResponse, (ModuleExecuteResult) null);
            }
        } else {
            aliFaceCertHelper.a((MICRpcResponse) null, new DefaultModuleResult("2003"));
        }
    }
}
