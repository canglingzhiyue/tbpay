package android.taobao.windvane.extra.uc;

import android.os.Handler;
import android.taobao.windvane.extra.uc.prefetch.TNetCallBack;
import android.taobao.windvane.monitor.a;
import anetwork.channel.NetworkEvent;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.taobao.tao.Globals;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.mtc;
import tb.mtd;
import tb.mtf;
import tb.mtj;
import tb.mtk;

/* loaded from: classes2.dex */
public class DowngradableSSRService implements mtd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE = "DowngradableSSRService";
    private static final JSONObject args;
    private final mtd mService = mtf.b();

    public static /* synthetic */ JSONObject access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("42811697", new Object[0]) : args;
    }

    static {
        kge.a(1832813163);
        kge.a(-1825485896);
        args = new JSONObject();
    }

    @Override // tb.mtd
    public boolean asyncSend(mtj mtjVar, final mtc mtcVar, Handler handler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d571220", new Object[]{this, mtjVar, mtcVar, handler})).booleanValue() : this.mService.asyncSend(mtjVar, new mtc() { // from class: android.taobao.windvane.extra.uc.DowngradableSSRService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.mtc
            public void onResponse(mtj mtjVar2, int i, Map<String, List<String>> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a35e9ad6", new Object[]{this, mtjVar2, new Integer(i), map});
                    return;
                }
                mtc mtcVar2 = mtcVar;
                if (mtcVar2 != null) {
                    mtcVar2.onResponse(mtjVar2, i, map);
                }
                try {
                    DowngradableSSRService.access$000().put(ZimMessageChannel.K_RPC_RES_CODE, (Object) Integer.valueOf(i));
                } catch (Exception unused) {
                }
            }

            @Override // tb.mtc
            public void onReceiveData(mtj mtjVar2, byte[] bArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8d536689", new Object[]{this, mtjVar2, bArr});
                    return;
                }
                mtc mtcVar2 = mtcVar;
                if (mtcVar2 == null) {
                    return;
                }
                mtcVar2.onReceiveData(mtjVar2, bArr);
            }

            @Override // tb.mtc
            public void onError(final mtj mtjVar2, mtk mtkVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab769ea9", new Object[]{this, mtjVar2, mtkVar});
                    return;
                }
                if (mtkVar != null && mtjVar2 != null) {
                    try {
                        DowngradableSSRService.access$000().put("errorCode", (Object) Integer.valueOf(mtkVar.f31246a));
                        DowngradableSSRService.access$000().put("errorMsg", (Object) mtkVar.c);
                        a.commitFail("mtopSSRFinish", mtkVar.f31246a, DowngradableSSRService.access$000().toJSONString(), mtjVar2.f31244a);
                    } catch (Exception unused) {
                    }
                }
                e.a(RVLLevel.Error, DowngradableSSRService.MODULE).a("mtopSSRFinish").a((Map<String, ?>) DowngradableSSRService.access$000()).a();
                if (mtjVar2 != null && mtkVar != null && mtkVar.f31246a == 417) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", (Object) mtjVar2.f31244a);
                    a.commitSuccess("mtopSSRDowngrade", jSONObject.toJSONString());
                    e.a(RVLLevel.Error, DowngradableSSRService.MODULE, "downgrade network to normal request");
                    RequestImpl requestImpl = new RequestImpl(mtjVar2.f31244a);
                    requestImpl.setFollowRedirects(false);
                    requestImpl.setRetryTime(AliRequestAdapter.retryTimes);
                    requestImpl.setConnectTimeout(AliRequestAdapter.connectTimeout);
                    requestImpl.setReadTimeout(AliRequestAdapter.readTimeout);
                    requestImpl.setCookieEnabled(WVUCWebView.isNeedCookie(mtjVar2.f31244a));
                    requestImpl.setMethod(mtjVar2.b);
                    if (mtjVar2.c != null) {
                        for (Map.Entry<String, String> entry : mtjVar2.c.entrySet()) {
                            requestImpl.addHeader(entry.getKey(), entry.getValue());
                        }
                    }
                    new DegradableNetwork(Globals.getApplication()).asyncSend(requestImpl, mtjVar2.f31244a, null, new TNetCallBack() { // from class: android.taobao.windvane.extra.uc.DowngradableSSRService.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // anetwork.channel.NetworkCallBack.FinishListener
                        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                            } else if (finishEvent == null) {
                            } else {
                                int httpCode = finishEvent.getHttpCode();
                                if (httpCode < 0) {
                                    String desc = finishEvent.getDesc();
                                    RVLLevel rVLLevel = RVLLevel.Error;
                                    e.a(rVLLevel, DowngradableSSRService.MODULE, "error code = " + httpCode + ", desc=" + desc + ", url = " + mtjVar2.f31244a);
                                    if (mtcVar == null) {
                                        return;
                                    }
                                    mtcVar.onError(mtjVar2, new mtk.a().a(httpCode).b(desc).a());
                                } else if (mtcVar == null) {
                                } else {
                                    mtcVar.onFinish(mtjVar2);
                                }
                            }
                        }

                        @Override // anetwork.channel.NetworkCallBack.ProgressListener
                        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
                            } else if (progressEvent == null || mtcVar == null) {
                            } else {
                                mtcVar.onReceiveData(mtjVar2, Arrays.copyOf(progressEvent.getBytedata(), progressEvent.getSize()));
                            }
                        }

                        @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
                        public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return ((Boolean) ipChange3.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
                            }
                            if (mtcVar != null) {
                                mtcVar.onResponse(mtjVar2, i, map);
                            }
                            return false;
                        }
                    });
                    return;
                }
                mtc mtcVar2 = mtcVar;
                if (mtcVar2 == null) {
                    return;
                }
                mtcVar2.onError(mtjVar2, mtkVar);
            }

            @Override // tb.mtc
            public void onFinish(mtj mtjVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cfd81c6", new Object[]{this, mtjVar2});
                    return;
                }
                mtc mtcVar2 = mtcVar;
                if (mtcVar2 != null) {
                    mtcVar2.onFinish(mtjVar2);
                }
                if (mtjVar2 != null) {
                    try {
                        a.commitSuccess("mtopSSRFinish", mtjVar2.f31244a);
                    } catch (Exception unused) {
                        return;
                    }
                }
                e.a(RVLLevel.Error, DowngradableSSRService.MODULE).a("mtopSSRFinish").a((Map<String, ?>) DowngradableSSRService.access$000()).a();
            }
        }, handler);
    }

    @Override // tb.mtd
    public boolean cancel(mtj mtjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9299d0f2", new Object[]{this, mtjVar})).booleanValue() : this.mService.cancel(mtjVar);
    }
}
