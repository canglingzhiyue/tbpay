package com.alipay.module.face.helper;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.api.BioDetectorBuilder;
import com.alipay.mobile.security.bio.api.BioResponse;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.api.ZIMResponse;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.rrv;

/* loaded from: classes3.dex */
public class FaceRpcRunnable implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String b = "FaceRpcRunnable";
    private static String g = "aliveImgUrl";

    /* renamed from: a  reason: collision with root package name */
    public ZIMFacade f6123a;
    private String c;
    private String d;
    private String e;
    private String f;
    private Bundle h;
    private BioResponse i;
    private ZIMResponse j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private MicroModule p;

    public static /* synthetic */ void a(FaceRpcRunnable faceRpcRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c423af", new Object[]{faceRpcRunnable});
        } else {
            faceRpcRunnable.a();
        }
    }

    public static /* synthetic */ void a(FaceRpcRunnable faceRpcRunnable, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2de7faf", new Object[]{faceRpcRunnable, mICRpcResponse});
        } else {
            faceRpcRunnable.a(mICRpcResponse);
        }
    }

    public FaceRpcRunnable(ZIMResponse zIMResponse, String str, String str2, String str3, String str4, Bundle bundle, boolean z, MicroModule microModule) {
        this.k = false;
        this.l = true;
        this.m = true;
        this.n = false;
        this.o = false;
        this.j = zIMResponse;
        if (zIMResponse != null && zIMResponse.extInfo != null && "993".equalsIgnoreCase(zIMResponse.extInfo.get("ui"))) {
            VerifyLogCat.i(b, "本次为【加菲】人脸回调");
            this.o = true;
        }
        a(str, str2, str3, str4, bundle, z, microModule);
    }

    public FaceRpcRunnable(BioResponse bioResponse, String str, String str2, String str3, String str4, Bundle bundle, boolean z, MicroModule microModule) {
        this.k = false;
        this.l = true;
        this.m = true;
        this.n = false;
        this.o = false;
        this.i = bioResponse;
        a(str, str2, str3, str4, bundle, z, microModule);
    }

    private void a(String str, String str2, String str3, String str4, Bundle bundle, boolean z, MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36be482", new Object[]{this, str, str2, str3, str4, bundle, new Boolean(z), microModule});
            return;
        }
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.h = bundle;
        this.l = z;
        this.p = microModule;
        if (bundle != null) {
            if ("N".equalsIgnoreCase(bundle.getString("popupErrMsg"))) {
                this.m = false;
            }
            if ("Y".equalsIgnoreCase(bundle.getString("useZim"))) {
                this.n = true;
            }
        }
        String str5 = b;
        VerifyLogCat.i(str5, "mNeedNoticeOnRpcError: " + this.m);
        String str6 = b;
        VerifyLogCat.i(str6, "mUseZim: " + this.n);
    }

    private void a(final MICRpcResponse mICRpcResponse, final ModuleExecuteResult moduleExecuteResult) {
        String string;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105a29e8", new Object[]{this, mICRpcResponse, moduleExecuteResult});
        } else if (this.m && !ModuleConstants.VI_MODULE_LOGIN_FACE.equalsIgnoreCase(this.e)) {
            VerifyLogCat.i(b, "need to ALERT when the result is failed!");
            if (mICRpcResponse != null) {
                string = mICRpcResponse.verifyMessage;
                str = mICRpcResponse.verifyCode;
            } else if (this.p.getTask().getPluginOrProxyMode()) {
                a(moduleExecuteResult);
                return;
            } else {
                string = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.face_res_net_error);
                str = "";
            }
            if (StringUtils.isEmpty(string)) {
                if ("NOT_SAME_PERSON".equalsIgnoreCase(str)) {
                    string = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.not_same_person);
                } else {
                    string = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.other_face_res_error);
                }
            }
            MicroModuleContext.getInstance().alert(null, string, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.face_res_error_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.module.face.helper.FaceRpcRunnable.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    MICRpcResponse mICRpcResponse2 = mICRpcResponse;
                    if (mICRpcResponse2 != null) {
                        FaceRpcRunnable.a(FaceRpcRunnable.this, mICRpcResponse2);
                    } else {
                        FaceRpcRunnable.this.a(moduleExecuteResult);
                    }
                }
            }, null, null);
        } else {
            VerifyLogCat.i(b, "no need to ALERT!");
            if (mICRpcResponse != null) {
                a(mICRpcResponse);
            } else {
                a(moduleExecuteResult);
            }
        }
    }

    private void a(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28c656", new Object[]{this, mICRpcResponse});
            return;
        }
        VerifyLogCat.i(b, "now we go to handleNotNullRpcRes");
        if (!mICRpcResponse.verifySuccess || !mICRpcResponse.finish) {
            z = false;
        }
        this.k = z;
        ModuleExecuteResult moduleExecuteResult = new ModuleExecuteResult();
        moduleExecuteResult.setMICRpcResponse(mICRpcResponse);
        JSONObject parseObject = JSONObject.parseObject(mICRpcResponse.data);
        HashMap<String, Object> hashMap = new HashMap<>();
        if (parseObject != null) {
            hashMap.put(g, parseObject.getString(g));
        }
        BioResponse bioResponse = this.i;
        if (bioResponse != null && bioResponse.getExt() != null) {
            hashMap.putAll(this.i.getExt());
        }
        ZIMResponse zIMResponse = this.j;
        if (zIMResponse != null && zIMResponse.extInfo != null) {
            hashMap.putAll(this.j.extInfo);
        }
        moduleExecuteResult.setExtInfo(hashMap);
        a(moduleExecuteResult);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MicroModuleContext.getInstance().finishModule(this.c, this.d, this.e);
        try {
            VerifyLogCat.i(b, "现在关闭人脸");
            if (this.n) {
                this.f6123a.command(4099);
                this.f6123a.destroy();
            } else {
                BioDetector create = BioDetectorBuilder.create(MicroModuleContext.getInstance().getContext(), new com.alipay.mobile.security.bio.module.MicroModule());
                create.command(4099);
                create.destroy();
            }
        } catch (Throwable th) {
            VerifyLogCat.e(b, "关闭人脸时出错！", th);
        }
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-170206-1", Constants.VI_ENGINE_APPID, "notifyBisSDKExit", this.d, this.c, null, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            String str = b;
            VerifyLogCat.i(str, "no need to show processdialog. mNeedProcessRes: " + this.l + ", mAutoClose: false");
            MICRpcRequest mICRpcRequest = new MICRpcRequest();
            mICRpcRequest.module = this.e;
            JSONObject jSONObject = new JSONObject();
            if (!this.n) {
                jSONObject.put("faceToken", (Object) this.f);
                jSONObject.put(rrv.BISTOKEN, (Object) this.f);
            }
            if (this.h != null) {
                jSONObject.put("zimId", (Object) this.h.getString("zimId"));
                jSONObject.put("useZim", (Object) this.h.getString("useZim"));
                String string = this.h.getString(ZIMFacade.KEY_CERT_NAME);
                String string2 = this.h.getString(ZIMFacade.KEY_CERT_NO);
                if (!StringUtils.isEmpty(string)) {
                    jSONObject.put(ZIMFacade.KEY_CERT_NAME, (Object) string);
                }
                if (!StringUtils.isEmpty(string2)) {
                    jSONObject.put(ZIMFacade.KEY_CERT_NO, (Object) string2);
                }
            }
            if (this.h != null && !StringUtils.isEmpty(this.h.getString(ZimMessageChannel.K_RPC_RES_CODE)) && !StringUtils.isEmpty(this.h.getString(ZIMFacade.KEY_BIO_ACTION))) {
                jSONObject.put(ZimMessageChannel.K_RPC_RES_CODE, (Object) this.h.getString(ZimMessageChannel.K_RPC_RES_CODE));
                jSONObject.put(ZIMFacade.KEY_BIO_ACTION, (Object) this.h.getString(ZIMFacade.KEY_BIO_ACTION));
            }
            mICRpcRequest.data = jSONObject.toString();
            mICRpcRequest.verifyId = this.c;
            mICRpcRequest.token = this.d;
            mICRpcRequest.action = "VERIFY_FACE";
            MICRpcResponse dispatch = new MICRpcServiceBiz().dispatch(mICRpcRequest);
            MicroModuleContext.getInstance().dismissProgressDialog();
            if (!this.l) {
                return;
            }
            if (dispatch != null && dispatch.success) {
                if (dispatch.verifySuccess) {
                    a(dispatch);
                    return;
                } else {
                    a(dispatch, (ModuleExecuteResult) null);
                    return;
                }
            }
            a((MICRpcResponse) null, new DefaultModuleResult("2003"));
        } catch (RpcException e) {
            String str2 = b;
            VerifyLogCat.e(str2, "RpcException " + e.getMessage());
            MicroModuleContext.getInstance().dismissProgressDialog();
            a((MICRpcResponse) null, new DefaultModuleResult("2003"));
        } catch (Exception e2) {
            VerifyLogCat.printStackTraceAndMore(e2);
            MicroModuleContext.getInstance().dismissProgressDialog();
            a((MICRpcResponse) null, new DefaultModuleResult("2002"));
        }
    }

    public final void a(ModuleExecuteResult moduleExecuteResult) {
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("515b1096", new Object[]{this, moduleExecuteResult});
            return;
        }
        if (this.n && (bundle = this.h) != null) {
            String string = bundle.getString("desensName");
            if (!StringUtils.isEmpty(string) && moduleExecuteResult != null) {
                if (moduleExecuteResult.getExtInfo() != null) {
                    moduleExecuteResult.getExtInfo().put("desensName", string);
                } else {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("desensName", string);
                    moduleExecuteResult.setExtInfo(hashMap);
                }
            }
        }
        MicroModuleContext.getInstance().notifyModuleResult(this.c, this.d, this.e, moduleExecuteResult);
        long j = this.h.getLong("face_delay_time", 0L);
        if (!this.o && this.k && 0 != j) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.module.face.helper.FaceRpcRunnable.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FaceRpcRunnable.a(FaceRpcRunnable.this);
                    }
                }
            }, j);
        } else {
            a();
        }
    }
}
