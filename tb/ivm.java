package tb;

import android.os.Handler;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.boarding.LocaleModel;
import com.taobao.android.editionswitcher.boarding.d;
import com.taobao.android.editionswitcher.boarding.h;
import com.taobao.android.editionswitcher.homepage.c;
import com.taobao.android.editionswitcher.request.HomeLocationRet;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ivm;

/* loaded from: classes5.dex */
public class ivm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f29332a;
    public static long b;
    private static String c;
    private static String d;

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : c;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : d;
    }

    static {
        kge.a(-465268812);
        f29332a = "I18N_BOARDING_COMPENSATION";
        b = 60000L;
        c = "Page_LocalBoarding";
        d = "boardingABApi";
    }

    public void a(Map<String, String> map, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a971c039", new Object[]{this, map, iRemoteBaseListener});
        } else if (iRemoteBaseListener != null) {
            try {
                TLog.loge("EditionSwitcher", "i18nboarding request checkBlack");
                MtopRequest mtopRequest = new MtopRequest();
                mtopRequest.setApiName("mtop.taobao.wireless.home.location");
                mtopRequest.setVersion("1.0");
                mtopRequest.setNeedSession(false);
                mtopRequest.setNeedEcode(false);
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    for (String str : map.keySet()) {
                        jSONObject.put(str, (Object) map.get(str));
                    }
                }
                mtopRequest.setData(jSONObject.toJSONString());
                MtopBusiness.build(mtopRequest, TaoHelper.getTTID()).registerListener((IRemoteListener) iRemoteBaseListener).mo1335useWua().mo1305reqMethod(MethodEnum.POST).startRequest(HomeLocationRet.class);
            } catch (Exception unused) {
            }
        }
    }

    public void a(final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b12945", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            try {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                MtopRequest mtopRequest = new MtopRequest();
                mtopRequest.setApiName("mtop.ovs.setting.country.lang.get");
                mtopRequest.setVersion("1.0");
                mtopRequest.setNeedSession(false);
                mtopRequest.setNeedEcode(false);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scenario", (Object) "onboarding");
                mtopRequest.setData(jSONObject.toJSONString());
                MtopBusiness.build(mtopRequest, TaoHelper.getTTID()).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.editionswitcher.api.EditionApi$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else if (atomicBoolean.getAndSet(false)) {
                            AppMonitor.Alarm.commitFail(ivm.a(), ivm.b(), mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                            TLog.loge("EditionSwitcher", "i18nboarding request onSystemError" + mtopResponse.getRetMsg());
                            TBS.Ext.commitEvent(ivm.a(), 2101, "boardingRequestFail", "", "", "spm=a2141.29233349,enableI18n=true");
                            dVar.a(false);
                        } else {
                            TLog.loge("EditionSwitcher", "i18nboarding timeout and onSystemError");
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        boolean z = true;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        boolean andSet = atomicBoolean.getAndSet(false);
                        try {
                            AppMonitor.Alarm.commitSuccess(ivm.a(), ivm.b());
                            LocaleModel localeModel = (LocaleModel) JSON.parseObject(mtopResponse.getDataJsonObject().toString(), LocaleModel.class);
                            if ((localeModel == null || localeModel.currentCountryInfo == null) && andSet) {
                                TLog.loge("EditionSwitcher", "i18nboarding request success data is null");
                                TBS.Ext.commitEvent(ivm.a(), 2101, "boardingRequestSuccess", "", "", "spm=a2141.29233349,enableI18n=true");
                                dVar.a(false);
                            }
                            h.f12282a = localeModel;
                            LocaleModel.SiteLangModel siteLangModel = localeModel.currentCountryInfo;
                            if (siteLangModel.i18nBlackIp || !siteLangModel.i18nEnable) {
                                z = false;
                            }
                            if (andSet) {
                                TLog.loge("EditionSwitcher", "i18nboarding request success should enter boarding : " + z);
                                dVar.a(z);
                            } else if (z) {
                                TLog.loge("EditionSwitcher", "i18nboarding request success and timeout need mark");
                                c.a(ivm.f29332a, String.valueOf(System.currentTimeMillis()));
                            } else {
                                TLog.loge("EditionSwitcher", "i18nboarding request success and timeout need not mark");
                            }
                        } catch (Exception e) {
                            TLog.loge("EditionSwitcher", "i18nboarding request success but parse error : " + e);
                            if (!andSet) {
                                return;
                            }
                            dVar.a(false);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else if (atomicBoolean.getAndSet(false)) {
                            AppMonitor.Alarm.commitFail(ivm.a(), ivm.b(), mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                            TLog.loge("EditionSwitcher", "i18nboarding request onSystemError" + mtopResponse.getRetMsg());
                            dVar.a(false);
                        } else {
                            TLog.loge("EditionSwitcher", "i18nboarding timeout and onError");
                        }
                    }
                }).mo1335useWua().mo1305reqMethod(MethodEnum.POST).startRequest(BaseOutDo.class);
                TLog.loge("EditionSwitcher", "i18nboarding start request...");
                TBS.Ext.commitEvent(c, 2101, "boardingStartRequest", "", "", "spm=a2141.29233349");
                new Handler().postDelayed(new Runnable() { // from class: tb.ivm.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!atomicBoolean.getAndSet(false)) {
                        } else {
                            dVar.a(false);
                            TLog.loge("EditionSwitcher", "i18nboarding request force timeout ");
                            TBS.Ext.commitEvent(ivm.a(), 2101, "boardingRequestTimeout", "", "", "spm=a2141.29233349");
                            AppMonitor.Alarm.commitFail(ivm.a(), ivm.b(), "timeout", "");
                        }
                    }
                }, 700L);
            } catch (Exception e) {
                TLog.loge("EditionSwitcher", "i18nboarding request Exception : " + e);
                dVar.a(false);
            }
        }
    }
}
