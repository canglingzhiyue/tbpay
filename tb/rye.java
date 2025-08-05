package tb;

import android.text.TextUtils;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.middletier.fc.FCAction;
import com.alibaba.wireless.security.open.middletier.fc.IFCActionCallback;
import com.alibaba.wireless.security.open.middletier.fc.IFCComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import com.taobao.tao.remotebusiness.IInteractingListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.RequestPoolManager;
import com.taobao.tao.remotebusiness.login.h;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.antiattack.ApiLockHelper;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKUtils;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;

/* loaded from: classes.dex */
public class rye implements rxm, rxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ryf f33416a = new ryf();
    private rxp b = new rxp();

    static {
        kge.a(-1519978181);
        kge.a(178679831);
        kge.a(-2079716300);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.FCDuplexFilter";
    }

    @Override // tb.rxm
    public String a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b93eb6d", new Object[]{this, aVar});
        }
        if ((SwitchConfig.getInstance().getUseSecurityAdapter() & 2) != 2) {
            aVar.g.oldFCType = 1;
            return c(aVar);
        }
        final MtopResponse mtopResponse = aVar.c;
        int responseCode = mtopResponse.getResponseCode();
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("mtopsdk.FCDuplexFilter", " [doAfter]response code " + responseCode);
        }
        if (aVar.g.isSignDegraded) {
            if (aVar.u) {
                String str = aVar.h;
                TBSdkLog.e("mtopsdk.FCDuplexFilter", str, "[doAfter]skip fc filter, code=" + responseCode);
                return FilterResult.CONTINUE;
            } else if (!aVar.g.isSignDegradedRetry && responseCode != 419 && responseCode != 420) {
                return FilterResult.CONTINUE;
            }
        }
        Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, "bx-usesg");
        if (StringUtils.isNotBlank(singleHeaderFieldByKey) && !Boolean.parseBoolean(singleHeaderFieldByKey)) {
            aVar.g.oldFCType = 2;
            return c(aVar);
        } else if (!(aVar.o instanceof MtopBusiness)) {
            aVar.g.oldFCType = 3;
            return c(aVar);
        } else {
            if (headerFields != null) {
                try {
                    HashMap hashMap = new HashMap(headerFields);
                    hashMap.put(e.REQUEST_ID, Arrays.asList(aVar.o.requestId));
                    IFCComponent iFCComponent = (IFCComponent) SecurityGuardManager.getInstance(aVar.f25000a.getMtopConfig().context).getInterface(IFCComponent.class);
                    aVar.g.fcProcessCheckStartTime = aVar.g.currentTimeMillis();
                    if (iFCComponent != null && iFCComponent.needFCProcessOrNot(responseCode, hashMap, IFCComponent.ResponseHeaderType.KVL)) {
                        aVar.g.fcProcessCheckEndTime = aVar.g.currentTimeMillis();
                        final MtopBuilder mtopBuilder = aVar.o;
                        final Mtop mtop = aVar.f25000a;
                        RequestPoolManager.a(RequestPoolManager.Type.ANTI).a(mtop, "", (MtopBusiness) mtopBuilder);
                        IFCActionCallback iFCActionCallback = new IFCActionCallback() { // from class: tb.rye.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alibaba.wireless.security.open.middletier.fc.IFCActionCallback
                            public void onPreAction(long j, boolean z) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("c9a58b71", new Object[]{this, new Long(j), new Boolean(z)});
                                    return;
                                }
                                aVar.g.bxSessionId = String.valueOf(j);
                                aVar.g.bxUI = z;
                            }

                            @Override // com.alibaba.wireless.security.open.middletier.fc.IFCActionCallback
                            public void onAction(final long j, final FCAction.FCMainAction fCMainAction, final long j2, final HashMap hashMap2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("c828ff09", new Object[]{this, new Long(j), fCMainAction, new Long(j2), hashMap2});
                                } else {
                                    MtopSDKThreadPoolExecutorFactory.submitCallbackTask(aVar.h != null ? aVar.h.hashCode() : hashCode(), new Runnable() { // from class: tb.rye.1.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                return;
                                            }
                                            TBSdkLog.e("mtopsdk.FCDuplexFilter", " [IFCActionCallback] onAction: " + ("--->###sessionId = " + j + ", MainAction = " + fCMainAction + ", subAction = " + j2 + ", extraInfo = " + hashMap2.toString() + "### ") + aVar.h);
                                            aVar.g.fcProcessCallbackTime = aVar.g.currentTimeMillis();
                                            aVar.g.bxMainAction = fCMainAction.ordinal();
                                            aVar.g.bxSubAction = j2;
                                            if (fCMainAction == FCAction.FCMainAction.RETRY) {
                                                aVar.g.bxRetry = 1;
                                                String str2 = (String) hashMap2.get("x-bx-resend");
                                                if (StringUtils.isNotBlank(str2)) {
                                                    HashMap hashMap3 = new HashMap();
                                                    try {
                                                        hashMap3.put("x-bx-resend", URLEncoder.encode(str2, "utf-8"));
                                                        mtopBuilder.mo1297headers(hashMap3);
                                                    } catch (UnsupportedEncodingException unused) {
                                                        TBSdkLog.e("mtopsdk.FCDuplexFilter", "[IFCActionCallback]urlEncode x-bx-resend=" + str2 + "error");
                                                    }
                                                }
                                                if ((j2 & FCAction.FCSubAction.LOGIN.getValue()) <= 0) {
                                                    if ((j2 & FCAction.FCSubAction.WUA.getValue()) <= 0) {
                                                        RequestPoolManager.a(RequestPoolManager.Type.ANTI).b(mtop, "", (MtopBusiness) mtopBuilder);
                                                        return;
                                                    }
                                                    aVar.d.wuaRetry = true;
                                                    RequestPoolManager.a(RequestPoolManager.Type.ANTI).b(mtop, "", (MtopBusiness) mtopBuilder);
                                                    return;
                                                }
                                                RequestPoolManager.a(RequestPoolManager.Type.ANTI).c(mtop, "", (MtopBusiness) mtopBuilder);
                                                String str3 = mtopBuilder.mtopProp.userInfo;
                                                RequestPoolManager.a(RequestPoolManager.Type.SESSION).a(mtop, str3, (MtopBusiness) mtopBuilder);
                                                if (mtopBuilder instanceof MtopBusiness) {
                                                    MtopBusiness mtopBusiness = (MtopBusiness) mtopBuilder;
                                                    if (mtopBusiness.listener instanceof IInteractingListener) {
                                                        ((IInteractingListener) mtopBusiness.listener).onInteract("login");
                                                    }
                                                }
                                                h.a(mtop, str3, true, mtopBuilder);
                                            } else if (fCMainAction != FCAction.FCMainAction.FAIL) {
                                                RequestPoolManager.a(RequestPoolManager.Type.ANTI).c(mtop, "", (MtopBusiness) mtopBuilder);
                                                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                                                    TBSdkLog.w("mtopsdk.FCDuplexFilter", aVar.h, "[IFCActionCallback][SUCCESS/CANCEL/TIMEOUT] execute FCDuplexFilter apiKey=" + aVar.b.getKey());
                                                }
                                                aVar.c.setRetCode(ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK);
                                                aVar.c.setRetMsg(ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
                                                ryl.a(aVar);
                                            } else if ((j2 & FCAction.FCSubAction.LOGIN.getValue()) > 0) {
                                                String str4 = mtopBuilder.mtopProp.userInfo;
                                                if (mtopBuilder instanceof MtopBusiness) {
                                                    MtopBusiness mtopBusiness2 = (MtopBusiness) mtopBuilder;
                                                    if (mtopBusiness2.listener instanceof IInteractingListener) {
                                                        ((IInteractingListener) mtopBusiness2.listener).onInteract("login");
                                                    }
                                                }
                                                h.a(mtop, str4, true, mtopBuilder);
                                                RequestPoolManager.a(RequestPoolManager.Type.ANTI).c(mtop, "", (MtopBusiness) mtopBuilder);
                                                mtopResponse.setRetCode(ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK);
                                                mtopResponse.setRetMsg(ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
                                                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                                                    TBSdkLog.w("mtopsdk.FCDuplexFilter", aVar.h, "[IFCActionCallback] execute FCDuplexFilter apiKey=" + aVar.b.getKey());
                                                }
                                                ryl.a(aVar);
                                            } else if ((j2 & FCAction.FCSubAction.FL.getValue()) <= 0) {
                                                RequestPoolManager.a(RequestPoolManager.Type.ANTI).c(mtop, "", (MtopBusiness) mtopBuilder);
                                                aVar.c.setRetCode(ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK);
                                                aVar.c.setRetMsg(ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
                                                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                                                    TBSdkLog.w("mtopsdk.FCDuplexFilter", aVar.h, "[IFCActionCallback][FAIL] execute FCDuplexFilter apiKey=" + aVar.b.getKey());
                                                }
                                                ryl.a(aVar);
                                            } else {
                                                RequestPoolManager.a(RequestPoolManager.Type.ANTI).c(mtop, "", (MtopBusiness) mtopBuilder);
                                                String key = aVar.b.getKey();
                                                Object obj = hashMap2.get(IFCComponent.KEY_BX_SLEEP);
                                                if (obj != null) {
                                                    long longValue = ((Long) obj).longValue();
                                                    if (longValue > 0) {
                                                        ApiLockHelper.lock(key, SDKUtils.getCorrectionTime(), longValue);
                                                    }
                                                    aVar.g.bxSleep = longValue;
                                                }
                                                ryl.a(mtopResponse);
                                                if (StringUtils.isBlank(mtopResponse.getRetCode())) {
                                                    aVar.c.setRetCode("ANDROID_SYS_API_FLOW_LIMIT_LOCKED");
                                                    aVar.c.setRetMsg(ErrorConstant.ERRMSG_API_FLOW_LIMIT_LOCKED);
                                                }
                                                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                                                    TBSdkLog.w("mtopsdk.FCDuplexFilter", aVar.h, "[IFCActionCallback] doAfter execute FlowLimitDuplexFilter apiKey=" + key + " ,retCode=" + mtopResponse.getRetCode());
                                                }
                                                ryl.a(aVar);
                                            }
                                        }
                                    });
                                }
                            }
                        };
                        aVar.g.fcProcessStartTime = aVar.g.currentTimeMillis();
                        TBSdkLog.e("mtopsdk.FCDuplexFilter", "[IFCActionCallback]start process fc ", aVar.h);
                        iFCComponent.processFCContent(responseCode, hashMap, iFCActionCallback, IFCComponent.ResponseHeaderType.KVL);
                        return "STOP";
                    }
                    aVar.g.fcProcessCheckEndTime = aVar.g.currentTimeMillis();
                } catch (SecException e) {
                    TBSdkLog.e("mtopsdk.FCDuplexFilter", "[IFCActionCallback] fc component exception , err code = " + e.getErrorCode());
                } catch (Throwable th) {
                    TBSdkLog.e("mtopsdk.FCDuplexFilter", "[IFCActionCallback] fc component exception , msg = " + th.getMessage());
                }
            }
            return FilterResult.CONTINUE;
        }
    }

    private String c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee737ab", new Object[]{this, aVar});
        }
        if (this.f33416a == null || this.b == null) {
            TBSdkLog.i("mtopsdk.FCDuplexFilter", " [doAfter]flowLimitDuplexFilter or antiAttackAfterFilter create fail ");
            return "STOP";
        }
        if (aVar.c != null) {
            Map<String, List<String>> headerFields = aVar.c.getHeaderFields();
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, HttpHeaderConstant.BX_ACTION);
            String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, "location");
            if (!TextUtils.isEmpty(singleHeaderFieldByKey)) {
                aVar.g.bxAction = singleHeaderFieldByKey;
            }
            if (!TextUtils.isEmpty(singleHeaderFieldByKey2)) {
                aVar.g.location = singleHeaderFieldByKey2;
            }
        }
        TBSdkLog.e("mtopsdk.FCDuplexFilter", " [doOldFCAndAntiFilter] use old to do flow control, " + aVar.h);
        String a2 = this.b.a(aVar);
        return (a2 == null || "STOP".equals(a2)) ? a2 : this.f33416a.a(aVar);
    }

    @Override // tb.rxn
    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d3d918c", new Object[]{this, aVar});
        }
        ryf ryfVar = this.f33416a;
        return ryfVar != null ? ryfVar.b(aVar) : FilterResult.CONTINUE;
    }
}
