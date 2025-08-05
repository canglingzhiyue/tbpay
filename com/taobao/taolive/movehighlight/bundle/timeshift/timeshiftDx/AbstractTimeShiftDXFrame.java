package com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bundle.timeshiftContent.b;
import com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.LiveCommonIssueInteractResponseData;
import com.taobao.taolive.movehighlight.utils.m;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import java.util.Map;
import tb.ibq;
import tb.kge;
import tb.pfb;
import tb.pfg;
import tb.pfj;
import tb.pgp;
import tb.pro;
import tb.sgr;

/* loaded from: classes8.dex */
public abstract class AbstractTimeShiftDXFrame extends BaseFrame implements sgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-141871533);
        kge.a(1522751733);
    }

    public void abstractRefreshBottomByMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6df1b99", new Object[]{this, new Boolean(z)});
        }
    }

    public abstract void showTimeShiftLayerCallBack(Map<String, String> map, boolean z, pgp pgpVar);

    public AbstractTimeShiftDXFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
    }

    public void initTimeShiftAction(final a aVar, final ibq ibqVar, final pfj pfjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3cff41f", new Object[]{this, aVar, ibqVar, pfjVar});
        } else {
            pfb.a(this.mFrameContext).a(new pfg() { // from class: com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pfg
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                    }
                }

                @Override // tb.pfg
                public b c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (b) ipChange2.ipc$dispatch("28d2bbd7", new Object[]{this});
                    }
                    return null;
                }

                @Override // tb.pfg
                public a a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (a) ipChange2.ipc$dispatch("4abfcc25", new Object[]{this}) : aVar;
                }

                @Override // tb.pfg
                public ibq b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (ibq) ipChange2.ipc$dispatch("16b78305", new Object[]{this}) : ibqVar;
                }

                @Override // tb.pfg
                public void a(Map<String, String> map, boolean z, pgp pgpVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49a42bce", new Object[]{this, map, new Boolean(z), pgpVar});
                    } else {
                        AbstractTimeShiftDXFrame.this.showTimeShiftLayerCallBack(map, z, pgpVar);
                    }
                }

                @Override // tb.pfg
                public void a(final LiveTimemovingModel liveTimemovingModel) {
                    pfj pfjVar2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4a4c8664", new Object[]{this, liveTimemovingModel});
                    } else if (liveTimemovingModel.rightInfo != null && "1".equals(liveTimemovingModel.rightInfo.status) && (pfjVar2 = pfjVar) != null) {
                        pfjVar2.a(liveTimemovingModel, new pfj.a() { // from class: com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.pfj.a
                            public void a(LiveCommonIssueInteractResponseData liveCommonIssueInteractResponseData) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("59a5515c", new Object[]{this, liveCommonIssueInteractResponseData});
                                } else if (AbstractTimeShiftDXFrame.this.mContext == null || liveCommonIssueInteractResponseData.benefitVO == null || TextUtils.isEmpty(liveCommonIssueInteractResponseData.benefitVO.toastTips)) {
                                } else {
                                    m.a(AbstractTimeShiftDXFrame.this.mContext, liveCommonIssueInteractResponseData.benefitVO.toastTips);
                                    com.taobao.taolive.movehighlight.utils.a.a(liveTimemovingModel, AbstractTimeShiftDXFrame.this.mContext, AbstractTimeShiftDXFrame.this.mFrameContext);
                                }
                            }

                            @Override // tb.pfj.a
                            public void a() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                } else if (AbstractTimeShiftDXFrame.this.mContext == null) {
                                } else {
                                    m.a(AbstractTimeShiftDXFrame.this.mContext, "领取失败：活动太火爆了，领取失败");
                                    com.taobao.taolive.movehighlight.utils.a.a(liveTimemovingModel, AbstractTimeShiftDXFrame.this.mContext, AbstractTimeShiftDXFrame.this.mFrameContext);
                                }
                            }
                        });
                    } else {
                        com.taobao.taolive.movehighlight.utils.a.a(liveTimemovingModel, AbstractTimeShiftDXFrame.this.mContext, AbstractTimeShiftDXFrame.this.mFrameContext);
                    }
                }

                @Override // tb.pfg
                public void a(final LiveTimemovingModel liveTimemovingModel, final DXRuntimeContext dXRuntimeContext) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9756d6d5", new Object[]{this, liveTimemovingModel, dXRuntimeContext});
                    } else if (liveTimemovingModel == null || liveTimemovingModel.personalityData == null) {
                    } else {
                        String string = liveTimemovingModel.personalityData.getString("subscribeStatus");
                        String str = liveTimemovingModel.extendVal.liveId;
                        String str2 = liveTimemovingModel.itemId;
                        if (TextUtils.isEmpty(string)) {
                            string = "0";
                        }
                        if (TextUtils.isEmpty(string)) {
                            return;
                        }
                        if ("1".equals(string)) {
                            new com.taobao.taolive.movehighlight.bussiness.subscribe.a(new d() { // from class: com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                                    } else if (netResponse == null || netResponse.getDataJsonObject() == null) {
                                    } else {
                                        try {
                                            if (netResponse.getDataJsonObject().getBoolean("result")) {
                                                if (AbstractTimeShiftDXFrame.this.mContext != null) {
                                                    m.a(AbstractTimeShiftDXFrame.this.mContext, "已取消预约");
                                                }
                                                HashMap hashMap = new HashMap();
                                                hashMap.put("subscribeStatus", "0");
                                                if (ibqVar == null) {
                                                    return;
                                                }
                                                ibqVar.a(liveTimemovingModel.itemId, hashMap, dXRuntimeContext);
                                            } else if (AbstractTimeShiftDXFrame.this.mContext == null) {
                                            } else {
                                                m.a(AbstractTimeShiftDXFrame.this.mContext, "取消预约失败，再试一次");
                                            }
                                        } catch (Throwable th) {
                                            th.printStackTrace();
                                        }
                                    }
                                }

                                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                                public void onError(int i, NetResponse netResponse, Object obj) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                                    } else if (AbstractTimeShiftDXFrame.this.mContext == null) {
                                    } else {
                                        m.a(AbstractTimeShiftDXFrame.this.mContext, "取消预约失败，再试一次");
                                    }
                                }
                            }).a(pro.b(str), pro.b(str2), false, "preHeat");
                        } else if (!"0".equals(string)) {
                        } else {
                            new com.taobao.taolive.movehighlight.bussiness.subscribe.a(new d() { // from class: com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                                    } else if (netResponse == null || netResponse.getDataJsonObject() == null) {
                                    } else {
                                        try {
                                            if (netResponse.getDataJsonObject().getBoolean("result")) {
                                                HashMap hashMap = new HashMap();
                                                hashMap.put("subscribeStatus", "1");
                                                if (ibqVar != null) {
                                                    ibqVar.a(liveTimemovingModel.itemId, hashMap, dXRuntimeContext);
                                                }
                                                if (AbstractTimeShiftDXFrame.this.mContext == null) {
                                                    return;
                                                }
                                                m.a(AbstractTimeShiftDXFrame.this.mContext, "预约成功，将在主播开卖时提醒你");
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            th.printStackTrace();
                                        }
                                        if (AbstractTimeShiftDXFrame.this.mContext == null) {
                                            return;
                                        }
                                        m.a(AbstractTimeShiftDXFrame.this.mContext, "活动太火爆了，再试一次");
                                    }
                                }

                                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                                public void onError(int i, NetResponse netResponse, Object obj) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                                    } else if (AbstractTimeShiftDXFrame.this.mContext == null) {
                                    } else {
                                        m.a(AbstractTimeShiftDXFrame.this.mContext, "活动太火爆了，再试一次");
                                    }
                                }
                            }).a(pro.b(str), pro.b(str2), true, "preHeat");
                        }
                    }
                }

                @Override // tb.pfg
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    } else {
                        AbstractTimeShiftDXFrame.this.abstractRefreshBottomByMute(z);
                    }
                }
            });
        }
    }
}
