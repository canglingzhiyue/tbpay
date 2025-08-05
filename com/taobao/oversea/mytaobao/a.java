package com.taobao.oversea.mytaobao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.oversea.mytaobao.b;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.nde;

/* loaded from: classes7.dex */
public class a extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RECYCLERVIEWLOADMORE = 1123213624583578651L;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
        } else {
            b.a().a(new b.a() { // from class: com.taobao.oversea.mytaobao.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.oversea.mytaobao.b.a
                public void a(MtopResponse mtopResponse, BaseOutDo baseOutDo) {
                    JSONObject jSONObject;
                    JSONObject jSONObject2;
                    JSONArray jSONArray;
                    JSONArray jSONArray2;
                    JSONObject jSONObject3;
                    JSONObject jSONObject4;
                    JSONObject jSONObject5;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5b39cfcd", new Object[]{this, mtopResponse, baseOutDo});
                        return;
                    }
                    JSONObject jSONObject6 = (JSONObject) JSON.parseObject(mtopResponse.getBytedata(), JSONObject.class, new Feature[0]);
                    try {
                        try {
                            DXMsgCenterEvent dXMsgCenterEvent = new DXMsgCenterEvent(-2277119638481222228L);
                            dXMsgCenterEvent.setType("General");
                            dXMsgCenterEvent.setMethod(DXRecyclerLayout.MSG_METHOD_APPEND_ITEMS);
                            JSONObject jSONObject7 = new JSONObject();
                            JSONArray jSONArray3 = new JSONArray();
                            JSONObject jSONObject8 = jSONObject6.getJSONObject("data").getJSONObject("data");
                            if (!jSONObject8.isEmpty()) {
                                jSONArray = jSONArray3;
                                JSONObject jSONObject9 = jSONObject8.getJSONObject("htaofeeds");
                                if (jSONObject9 != null && jSONObject9.containsKey("fields")) {
                                    jSONArray2 = (JSONArray) jSONObject9.getJSONObject("fields").values().iterator().next();
                                    jSONObject7.put("data", (Object) jSONArray2);
                                    dXMsgCenterEvent.setParams(jSONObject7);
                                    dXRuntimeContext.d().postEvent(dXMsgCenterEvent);
                                    DXMsgCenterEvent dXMsgCenterEvent2 = new DXMsgCenterEvent(DXRecyclerLayout.DXRECYCLERLAYOUT_LOADMORESTRATEGY);
                                    dXMsgCenterEvent2.setType("General");
                                    dXMsgCenterEvent2.setMethod(DXRecyclerLayout.MSG_METHOD_LOAD_MORE);
                                    jSONObject3 = new JSONObject();
                                    jSONObject3.put("status", (Object) DXRecyclerLayout.LOAD_MORE_STOPED);
                                    jSONObject4 = jSONObject6.getJSONObject("global");
                                    if (jSONObject4 != null && jSONObject4.size() > 0 && (jSONObject5 = jSONObject4.getJSONObject(nde.ECHO)) != null && jSONObject5.containsKey("end") && jSONObject5.getBoolean("end").booleanValue()) {
                                        jSONObject3.put("status", (Object) DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING);
                                    }
                                    dXMsgCenterEvent2.setParams(jSONObject3);
                                    dXRuntimeContext.d().postEvent(dXMsgCenterEvent2);
                                }
                            } else {
                                jSONArray = jSONArray3;
                            }
                            jSONArray2 = jSONArray;
                            jSONObject7.put("data", (Object) jSONArray2);
                            dXMsgCenterEvent.setParams(jSONObject7);
                            dXRuntimeContext.d().postEvent(dXMsgCenterEvent);
                            DXMsgCenterEvent dXMsgCenterEvent22 = new DXMsgCenterEvent(DXRecyclerLayout.DXRECYCLERLAYOUT_LOADMORESTRATEGY);
                            dXMsgCenterEvent22.setType("General");
                            dXMsgCenterEvent22.setMethod(DXRecyclerLayout.MSG_METHOD_LOAD_MORE);
                            jSONObject3 = new JSONObject();
                            jSONObject3.put("status", (Object) DXRecyclerLayout.LOAD_MORE_STOPED);
                            jSONObject4 = jSONObject6.getJSONObject("global");
                            if (jSONObject4 != null) {
                                jSONObject3.put("status", (Object) DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING);
                            }
                            dXMsgCenterEvent22.setParams(jSONObject3);
                            dXRuntimeContext.d().postEvent(dXMsgCenterEvent22);
                        } catch (Exception e) {
                            e.printStackTrace();
                            DXMsgCenterEvent dXMsgCenterEvent3 = new DXMsgCenterEvent(DXRecyclerLayout.DXRECYCLERLAYOUT_LOADMORESTRATEGY);
                            dXMsgCenterEvent3.setType("General");
                            dXMsgCenterEvent3.setMethod(DXRecyclerLayout.MSG_METHOD_LOAD_MORE);
                            JSONObject jSONObject10 = new JSONObject();
                            jSONObject10.put("status", (Object) DXRecyclerLayout.LOAD_MORE_STOPED);
                            JSONObject jSONObject11 = jSONObject6.getJSONObject("global");
                            if (jSONObject11 != null && jSONObject11.size() > 0 && (jSONObject2 = jSONObject11.getJSONObject(nde.ECHO)) != null && jSONObject2.containsKey("end") && jSONObject2.getBoolean("end").booleanValue()) {
                                jSONObject10.put("status", (Object) DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING);
                            }
                            dXMsgCenterEvent3.setParams(jSONObject10);
                            dXRuntimeContext.d().postEvent(dXMsgCenterEvent3);
                        }
                    } catch (Throwable th) {
                        DXMsgCenterEvent dXMsgCenterEvent4 = new DXMsgCenterEvent(DXRecyclerLayout.DXRECYCLERLAYOUT_LOADMORESTRATEGY);
                        dXMsgCenterEvent4.setType("General");
                        dXMsgCenterEvent4.setMethod(DXRecyclerLayout.MSG_METHOD_LOAD_MORE);
                        JSONObject jSONObject12 = new JSONObject();
                        jSONObject12.put("status", (Object) DXRecyclerLayout.LOAD_MORE_STOPED);
                        JSONObject jSONObject13 = jSONObject6.getJSONObject("global");
                        if (jSONObject13 != null && jSONObject13.size() > 0 && (jSONObject = jSONObject13.getJSONObject(nde.ECHO)) != null && jSONObject.containsKey("end") && jSONObject.getBoolean("end").booleanValue()) {
                            jSONObject12.put("status", (Object) DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING);
                        }
                        dXMsgCenterEvent4.setParams(jSONObject12);
                        dXRuntimeContext.d().postEvent(dXMsgCenterEvent4);
                        throw th;
                    }
                }

                @Override // com.taobao.oversea.mytaobao.b.a
                public void a(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                        return;
                    }
                    DXMsgCenterEvent dXMsgCenterEvent = new DXMsgCenterEvent(DXRecyclerLayout.DXRECYCLERLAYOUT_LOADMORESTRATEGY);
                    dXMsgCenterEvent.setType("General");
                    dXMsgCenterEvent.setMethod(DXRecyclerLayout.MSG_METHOD_LOAD_MORE);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", (Object) "failed");
                    dXMsgCenterEvent.setParams(jSONObject);
                    dXRuntimeContext.d().postEvent(dXMsgCenterEvent);
                }
            });
        }
    }
}
