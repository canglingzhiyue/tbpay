package com.taobao.live.home.dinamic.event;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.mfj;
import tb.prl;
import tb.pro;

/* loaded from: classes7.dex */
public class g extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLMTOPREFRESH = 5547302832202012607L;

    /* renamed from: a  reason: collision with root package name */
    private static final String f17743a = "g";

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(g gVar, MtopResponse mtopResponse, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe14f59e", new Object[]{gVar, mtopResponse, context});
        } else {
            gVar.a(mtopResponse, context);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (!a() || dXRuntimeContext == null || objArr == null || objArr.length <= 0) {
        } else {
            if (dXRuntimeContext.m() == null) {
                mfj.c(f17743a, "context is null.");
                return;
            }
            if (objArr[0] instanceof JSONObject) {
                try {
                    MtopRequest a2 = a((JSONObject) objArr[0]);
                    if (a2 != null) {
                        new HashMap().put("x-m-biz-live-bizcode", aw.BIZCODE_TAOBAO);
                        RemoteBusiness.build(a2).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.live.home.dinamic.event.DXTblMtopRefreshEventHandler$1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                                    return;
                                }
                                Log.e("onSystemError", "onSystemError");
                                g.a(g.this, mtopResponse, dXRuntimeContext.m());
                            }

                            @Override // com.taobao.tao.remotebusiness.IRemoteListener
                            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                                String[] split;
                                IpChange ipChange2 = $ipChange;
                                boolean z = true;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                    return;
                                }
                                try {
                                    if (!(baseOutDo instanceof NormalResponse)) {
                                        return;
                                    }
                                    NormalResponse normalResponse = (NormalResponse) baseOutDo;
                                    if (normalResponse.getRet() == null || normalResponse.getRet().length <= 0 || (split = normalResponse.getRet()[0].split("::")) == null || split.length != 2 || !"RECEIVE_ERROR".equals(split[0])) {
                                        z = false;
                                    } else {
                                        Toast.makeText(dXRuntimeContext.m(), split[1], 1).show();
                                    }
                                    if (z || normalResponse.mo2429getData() == null || normalResponse.mo2429getData().getJSONArray("cardList") == null || normalResponse.mo2429getData().getJSONArray("cardList").size() <= 0) {
                                        return;
                                    }
                                    dXRuntimeContext.s().getFlattenWidgetNode().setNeedParse();
                                    dXRuntimeContext.C().b().a(dXRuntimeContext.s(), normalResponse.mo2429getData().getJSONArray("cardList").getJSONObject(0));
                                } catch (Exception unused) {
                                }
                            }

                            @Override // com.taobao.tao.remotebusiness.IRemoteListener
                            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                                    return;
                                }
                                Log.e("onError", "onError");
                                g.a(g.this, mtopResponse, dXRuntimeContext.m());
                            }
                        }).mo1340setBizId(59).startRequest(NormalResponse.class);
                    }
                } catch (Exception unused) {
                }
            }
            JSONObject jSONObject = (JSONObject) objArr[1];
            if (jSONObject == null) {
                return;
            }
            String string = jSONObject.getString("trackInfo");
            if (jSONObject.getJSONObject(d.CLICK_MAIDIAN) == null) {
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(d.CLICK_MAIDIAN);
            if (string != null && !StringUtils.isEmpty(string)) {
                String string2 = jSONObject2.getString("name");
                prl.a(string2, jSONObject2.getString("params") + ",trackInfo=" + string);
                return;
            }
            prl.a(jSONObject2.getString("name"), jSONObject2.getString("params"));
        }
    }

    private void a(MtopResponse mtopResponse, Context context) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ea1a3b", new Object[]{this, mtopResponse, context});
        } else if (mtopResponse == null || context == null || mtopResponse.getRet() == null || mtopResponse.getRet().length <= 0 || (split = mtopResponse.getRet()[0].split("::")) == null || split.length != 2 || !"RECEIVE_ERROR".equals(split[0])) {
        } else {
            Toast.makeText(context, split[1], 1).show();
        }
    }

    private MtopRequest a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("abcadfb3", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(jSONObject.getString("mtopName"));
        mtopRequest.setNeedEcode(jSONObject.getBooleanValue(ICallService.KEY_NEED_ECODE));
        mtopRequest.setNeedSession(jSONObject.getBooleanValue("needSession"));
        mtopRequest.setVersion(jSONObject.getString("version"));
        mtopRequest.setData(jSONObject.getString("dataParams"));
        return mtopRequest;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableRedEnvelopeRefresh", "true"));
    }
}
