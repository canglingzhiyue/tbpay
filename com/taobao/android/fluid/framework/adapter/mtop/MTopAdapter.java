package com.taobao.android.fluid.framework.adapter.mtop;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.c;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.IRemoteParserListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobaocompat.lifecycle.TimestampSynchronizer;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;
import tb.oeb;
import tb.ogv;
import tb.spz;

/* loaded from: classes5.dex */
public class MTopAdapter implements IMTopAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_GROUP = "ShortVideo";
    private static final String ORANGE_KEY_DEGRADE_MTOP_ALLOW_SWITCH_TO_POST = "degradeMtopAllowSwitchToPOST";
    private static final String TAG = "MTopAdapter";
    public final Context mContext;

    /* loaded from: classes5.dex */
    public static abstract class ParserResponseCallback implements IRemoteBaseListener, IRemoteParserListener {
        static {
            kge.a(-477554048);
            kge.a(-525336021);
            kge.a(-62701575);
        }
    }

    static {
        kge.a(-1017905527);
        kge.a(-2062531353);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : IMTopAdapter.ADAPTER_NAME;
    }

    public MTopAdapter(Context context) {
        this.mContext = context;
    }

    private static boolean degradeMtopAllowSwitchToPOST() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c08fb425", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", ORANGE_KEY_DEGRADE_MTOP_ALLOW_SWITCH_TO_POST, "false"));
        } catch (Throwable th) {
            TLog.loge(TAG, "degradeMtopAllowSwitchToPOST error", th);
            return false;
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public long getServerTimeMillis() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b67da507", new Object[]{this})).longValue() : TimestampSynchronizer.getServerTime();
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public final <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, IMTopAdapter.b<T> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc68ca3", new Object[]{this, iMTOPDataObject, bVar});
        } else {
            send(iMTOPDataObject, bVar, null, null);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public final <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, b<T> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95320f24", new Object[]{this, iMTOPDataObject, bVar});
        } else {
            send(iMTOPDataObject, bVar, null, null);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public final <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, IMTopAdapter.b<T> bVar, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c344fa", new Object[]{this, iMTOPDataObject, bVar, cls});
        } else {
            send(iMTOPDataObject, bVar, null, cls);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, IMTopAdapter.b<T> bVar, IMTopAdapter.a<T> aVar, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595df0e3", new Object[]{this, iMTOPDataObject, bVar, aVar, cls});
        } else {
            send(c.a.a().a(iMTOPDataObject).a(bVar).a(aVar).a(cls).b());
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public <T extends CommonResponseOutDo> void send(c<T> cVar) {
        IRemoteListener iRemoteListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ddabed", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            IMTOPDataObject iMTOPDataObject = cVar.f12460a;
            final IMTopAdapter.b<T> bVar = cVar.c;
            final IMTopAdapter.a<T> aVar = cVar.d;
            final Class<T> cls = cVar.e;
            Context context = this.mContext;
            if (context == null) {
                bVar.a(null);
                return;
            }
            if (aVar != null) {
                iRemoteListener = new ParserResponseCallback() { // from class: com.taobao.android.fluid.framework.adapter.mtop.MTopAdapter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    private volatile CommonResponseOutDo data;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        } else if (this.data == null) {
                            bVar.a(mtopResponse, null);
                        } else {
                            bVar.a(mtopResponse, this.data);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            bVar.a(mtopResponse);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            bVar.a(mtopResponse);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteParserListener
                    public void parseResponse(MtopResponse mtopResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("12969fa0", new Object[]{this, mtopResponse});
                            return;
                        }
                        try {
                            this.data = (CommonResponseOutDo) aVar.a(mtopResponse.getBytedata(), cls);
                        } catch (Exception e) {
                            spz.a(MTopAdapter.TAG, "parseResponse error", e);
                        }
                    }
                };
            } else {
                iRemoteListener = new IRemoteBaseListener() { // from class: com.taobao.android.fluid.framework.adapter.mtop.MTopAdapter.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        } else if (baseOutDo == null) {
                            bVar.a(mtopResponse, null);
                        } else {
                            bVar.a(mtopResponse, (CommonResponseOutDo) baseOutDo);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            bVar.a(mtopResponse);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            bVar.a(mtopResponse);
                        }
                    }
                };
            }
            MtopBusiness registerListener = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, context), iMTOPDataObject).registerListener(iRemoteListener);
            if (cVar.g) {
                registerListener.mo1305reqMethod(MethodEnum.POST);
            } else if (!degradeMtopAllowSwitchToPOST()) {
                registerListener.mo1293allowSwitchToPOST(true);
            }
            if (enableSendHeadersRequest() && !ogv.a(cVar.h)) {
                spz.c(TAG, "send 请求 headers不为null");
                registerListener.mo1297headers(cVar.h);
            }
            if (cls == null || aVar != null) {
                registerListener.startRequest();
            } else {
                registerListener.startRequest(cls);
            }
            if (cVar.f == null) {
                return;
            }
            cVar.f.a(registerListener);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public <T extends CommonResponseOutDo> void sendWithPrefetch(JSONObject jSONObject, IMTopAdapter.b<T> bVar, IMTopAdapter.a<T> aVar, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cdccd8", new Object[]{this, jSONObject, bVar, aVar, cls});
        } else {
            sendWithPrefetchFromLauncher(jSONObject, bVar, aVar, cls, false);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public <T extends CommonResponseOutDo> void sendWithPrefetch(c<T> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("175da50", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            JSONObject jSONObject = cVar.b;
            final IMTopAdapter.b<T> bVar = cVar.c;
            final IMTopAdapter.a<T> aVar = cVar.d;
            final Class<T> cls = cVar.e;
            ParserResponseCallback parserResponseCallback = new ParserResponseCallback() { // from class: com.taobao.android.fluid.framework.adapter.mtop.MTopAdapter.3
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private volatile CommonResponseOutDo data;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (this.data == null) {
                        bVar.a(mtopResponse, null);
                    } else {
                        bVar.a(mtopResponse, this.data);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        bVar.a(mtopResponse);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        bVar.a(mtopResponse);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteParserListener
                public void parseResponse(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("12969fa0", new Object[]{this, mtopResponse});
                        return;
                    }
                    try {
                        this.data = (CommonResponseOutDo) aVar.a(mtopResponse.getBytedata(), cls);
                    } catch (Exception e) {
                        spz.a(MTopAdapter.TAG, "sendWithPrefetch parseResponse error", e);
                    }
                }
            };
            MtopModule.requestWithParserInner(new g.c(null, jSONObject, null), parserResponseCallback, parserResponseCallback, cVar.f, cVar.j);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter
    public <T extends CommonResponseOutDo> void sendWithPrefetchFromLauncher(JSONObject jSONObject, IMTopAdapter.b<T> bVar, IMTopAdapter.a<T> aVar, Class<T> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed107332", new Object[]{this, jSONObject, bVar, aVar, cls, new Boolean(z)});
        } else {
            sendWithPrefetch(c.a.a().a(jSONObject).a(bVar).a(aVar).a(cls).a(z).b());
        }
    }

    private boolean enableSendHeadersRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18bb373f", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableSendHeadersRequest", true);
    }
}
