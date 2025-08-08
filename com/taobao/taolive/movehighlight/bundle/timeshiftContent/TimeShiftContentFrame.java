package com.taobao.taolive.movehighlight.bundle.timeshiftContent;

import android.content.Context;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bundle.timeshiftContent.b;
import com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.LiveCommonIssueInteractResponseData;
import com.taobao.taolive.movehighlight.utils.d;
import com.taobao.taolive.movehighlight.utils.e;
import com.taobao.taolive.movehighlight.utils.f;
import com.taobao.taolive.movehighlight.utils.m;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;
import tb.ibq;
import tb.kge;
import tb.pfb;
import tb.pfg;
import tb.pfj;
import tb.pfk;
import tb.pfm;
import tb.pfx;
import tb.pgp;
import tb.pqj;
import tb.sss;
import tb.sst;

/* loaded from: classes8.dex */
public class TimeShiftContentFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int selectedPosition;
    private DXRootView contentDxRootView;
    private FrameLayout frameLayout;
    private boolean mIsFirst;
    private pfm timeShiftBottomUtils;
    private b timeShiftContentRequest;
    private pfj timeShiftModel;
    private VideoInfo videoInfo;

    public static /* synthetic */ Object ipc$super(TimeShiftContentFrame timeShiftContentFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1777320968:
                super.onCreateView2((ViewGroup) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(TimeShiftContentFrame timeShiftContentFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9baad5", new Object[]{timeShiftContentFrame, jSONObject});
        } else {
            timeShiftContentFrame.renderContentRootView(jSONObject);
        }
    }

    public static /* synthetic */ void access$100(TimeShiftContentFrame timeShiftContentFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf0b85b4", new Object[]{timeShiftContentFrame, jSONObject});
        } else {
            timeShiftContentFrame.sendOpenAccessDetailByList(jSONObject);
        }
    }

    public static /* synthetic */ b access$200(TimeShiftContentFrame timeShiftContentFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("93c9164", new Object[]{timeShiftContentFrame}) : timeShiftContentFrame.timeShiftContentRequest;
    }

    public static /* synthetic */ DXRootView access$300(TimeShiftContentFrame timeShiftContentFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("6c917cd9", new Object[]{timeShiftContentFrame}) : timeShiftContentFrame.contentDxRootView;
    }

    public static /* synthetic */ void access$400(TimeShiftContentFrame timeShiftContentFrame, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1b5c90", new Object[]{timeShiftContentFrame, dXWidgetNode});
        } else {
            timeShiftContentFrame.refreshBottomTemplate(dXWidgetNode);
        }
    }

    public static /* synthetic */ boolean access$502(TimeShiftContentFrame timeShiftContentFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7c8ee56", new Object[]{timeShiftContentFrame, new Boolean(z)})).booleanValue();
        }
        timeShiftContentFrame.mIsFirst = z;
        return z;
    }

    public static /* synthetic */ void access$600(TimeShiftContentFrame timeShiftContentFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa25e8b", new Object[]{timeShiftContentFrame, str});
        } else {
            timeShiftContentFrame.showTimeShiftContent(str);
        }
    }

    public static /* synthetic */ pfj access$700(TimeShiftContentFrame timeShiftContentFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pfj) ipChange.ipc$dispatch("2f813950", new Object[]{timeShiftContentFrame}) : timeShiftContentFrame.timeShiftModel;
    }

    public static /* synthetic */ pfm access$800(TimeShiftContentFrame timeShiftContentFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pfm) ipChange.ipc$dispatch("ff416d4c", new Object[]{timeShiftContentFrame}) : timeShiftContentFrame.timeShiftBottomUtils;
    }

    public TimeShiftContentFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.mIsFirst = true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        super.onCreateView2(viewGroup);
        if (!(viewGroup instanceof FrameLayout)) {
            return;
        }
        this.frameLayout = (FrameLayout) viewGroup;
        selectedPosition = 0;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (i != 1) {
            return;
        }
        initView();
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.videoInfo = k.a(this.mLiveDataModel);
        if (this.videoInfo == null) {
            return;
        }
        this.timeShiftContentRequest = new b(this.mLiveDataModel, this.mFrameContext);
        this.contentDxRootView = pfx.a().a(this.mContext, "highlight_dx_layout_manager_content");
        if (this.contentDxRootView == null) {
            return;
        }
        this.timeShiftModel = new pfj();
        this.timeShiftContentRequest = new b(this.mLiveDataModel, this.mFrameContext);
        initTimeShiftAction();
    }

    private void showTimeShiftContent(String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f785f2", new Object[]{this, str});
        } else if (!this.mIsFirst || (bVar = this.timeShiftContentRequest) == null) {
        } else {
            bVar.a(str, new b.a() { // from class: com.taobao.taolive.movehighlight.bundle.timeshiftContent.TimeShiftContentFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.movehighlight.bundle.timeshiftContent.b.a
                public void a(NetResponse netResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("734351c3", new Object[]{this, netResponse});
                        return;
                    }
                    JSONObject jSONObject = (JSONObject) pqj.a(netResponse.getDataJsonObject().toString());
                    TimeShiftContentFrame.access$000(TimeShiftContentFrame.this, jSONObject);
                    TimeShiftContentFrame.access$100(TimeShiftContentFrame.this, jSONObject);
                }

                @Override // com.taobao.taolive.movehighlight.bundle.timeshiftContent.b.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        TimeShiftContentFrame.access$000(TimeShiftContentFrame.this, null);
                    }
                }
            });
            this.mIsFirst = false;
        }
    }

    private void sendOpenAccessDetailByList(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aed5e6d", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (this.mFrameContext == null || this.mFrameContext.o() == null || jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("model")) == null || (jSONArray = jSONObject2.getJSONArray("timeMovingList")) == null || jSONArray.size() <= 0 || (jSONObject3 = jSONArray.getJSONObject(0)) == null) {
                return;
            }
            e.a(this.mFrameContext, this.mLiveDataModel, jSONObject3);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        selectedPosition = 0;
        pfj pfjVar = this.timeShiftModel;
        if (pfjVar != null) {
            pfjVar.a();
        }
        b bVar = this.timeShiftContentRequest;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    private void renderContentRootView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5003bf", new Object[]{this, jSONObject});
            return;
        }
        this.frameLayout.setVisibility(0);
        if (this.frameLayout.getChildCount() != 0) {
            this.frameLayout.removeAllViews();
        }
        DXRootView dXRootView = this.contentDxRootView;
        if (dXRootView == null) {
            return;
        }
        this.frameLayout.addView(dXRootView);
        if (this.timeShiftBottomUtils == null) {
            this.timeShiftBottomUtils = new pfm(this.mFrameContext, this.mLiveDataModel, this.mContext, this.contentDxRootView);
        }
        JSONObject a2 = this.timeShiftBottomUtils.a(jSONObject);
        handleSpeakingMark(a2);
        pfx.a().a(this.contentDxRootView, a2, this.mFrameContext);
        f.a().e(System.currentTimeMillis());
    }

    private void handleSpeakingMark(JSONObject jSONObject) {
        JSONArray jSONArray;
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f75aa64", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("model");
        if (jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray("timeMovingList")) == null || jSONArray.size() <= 0) {
            return;
        }
        b bVar = this.timeShiftContentRequest;
        if (bVar != null) {
            bVar.a(jSONArray.size());
        }
        if (jSONArray.size() == 1) {
            jSONObject.put("isSingleItem", (Object) true);
        } else {
            jSONObject.put("isSingleItem", (Object) false);
        }
        JSONObject jSONObject3 = jSONArray.getJSONObject(0).getJSONObject("timeMovingPlayInfo");
        if (jSONObject3 == null || (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) pqj.a(jSONObject3.toJSONString(), LiveItem.TimeMovingPlayInfo.class)) == null) {
            return;
        }
        jSONObject.put("itemIsSpeaking", (Object) Boolean.valueOf(timeMovingPlayInfo.isSpeaking));
        playKandian(timeMovingPlayInfo);
    }

    private void playKandian(LiveItem.TimeMovingPlayInfo timeMovingPlayInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2cbb7", new Object[]{this, timeMovingPlayInfo});
        } else if (timeMovingPlayInfo == null) {
        } else {
            HashMap<String, String> a2 = pfk.a(timeMovingPlayInfo, timeMovingPlayInfo.playUrl, this.mFrameContext);
            if (pfb.a(getFrameContext()).l() == null) {
                return;
            }
            pfb.a(this.mFrameContext).l().m(this.mFrameContext, a2);
        }
    }

    private void refreshBottomTemplate(final DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d83cf608", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode == null) {
        } else {
            final DXWidgetRefreshOption a2 = new DXWidgetRefreshOption.a().a(2).a(true).b(true).a();
            new Handler().postDelayed(new Runnable() { // from class: com.taobao.taolive.movehighlight.bundle.timeshiftContent.TimeShiftContentFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        pfx.a().f32613a.a(dXWidgetNode, 0, a2);
                    }
                }
            }, 100L);
        }
    }

    static {
        kge.a(-1988698421);
        selectedPosition = 0;
    }

    private void initTimeShiftAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4028022", new Object[]{this});
        } else {
            pfb.a(getFrameContext()).a(new pfg() { // from class: com.taobao.taolive.movehighlight.bundle.timeshiftContent.TimeShiftContentFrame.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pfg
                public com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a) ipChange2.ipc$dispatch("4abfcc25", new Object[]{this});
                    }
                    return null;
                }

                @Override // tb.pfg
                public void a(LiveTimemovingModel liveTimemovingModel, DXRuntimeContext dXRuntimeContext) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9756d6d5", new Object[]{this, liveTimemovingModel, dXRuntimeContext});
                    }
                }

                @Override // tb.pfg
                public ibq b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (ibq) ipChange2.ipc$dispatch("16b78305", new Object[]{this});
                    }
                    return null;
                }

                @Override // tb.pfg
                public b c() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (b) ipChange2.ipc$dispatch("28d2bbd7", new Object[]{this}) : TimeShiftContentFrame.access$200(TimeShiftContentFrame.this);
                }

                @Override // tb.pfg
                public void a(JSONObject jSONObject) {
                    JSONObject jSONObject2;
                    LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                    } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("timeMovingPlayInfo")) == null || (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) pqj.a(jSONObject2, LiveItem.TimeMovingPlayInfo.class)) == null) {
                    } else {
                        HashMap<String, String> a2 = pfk.a(timeMovingPlayInfo, timeMovingPlayInfo.playUrl, TimeShiftContentFrame.this.mFrameContext);
                        f.a().a(System.currentTimeMillis());
                        f.a().a(f.e);
                        d.a(a2, TimeShiftContentFrame.this.mContext, TimeShiftContentFrame.this.mFrameContext);
                        if (TimeShiftContentFrame.access$300(TimeShiftContentFrame.this) != null && TimeShiftContentFrame.access$300(TimeShiftContentFrame.this).getExpandWidgetNode() != null) {
                            TimeShiftContentFrame.access$300(TimeShiftContentFrame.this).getData().put("itemIsSpeaking", (Object) Boolean.valueOf(timeMovingPlayInfo.isSpeaking));
                            TimeShiftContentFrame.access$400(TimeShiftContentFrame.this, TimeShiftContentFrame.access$300(TimeShiftContentFrame.this).getExpandWidgetNode().queryWidgetNodeByUserId("bottomLayoutId"));
                        }
                        e.a(TimeShiftContentFrame.this.mFrameContext, TimeShiftContentFrame.this.mLiveDataModel, jSONObject);
                    }
                }

                @Override // tb.pfg
                public void a(Map<String, String> map, boolean z, pgp pgpVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49a42bce", new Object[]{this, map, new Boolean(z), pgpVar});
                    } else if (map == null) {
                    } else {
                        TimeShiftContentFrame.access$502(TimeShiftContentFrame.this, z);
                        TimeShiftContentFrame.access$600(TimeShiftContentFrame.this, map.get(aw.PARAM_TIMEMOVE_KEYPOINTID));
                    }
                }

                @Override // tb.pfg
                public void a(final LiveTimemovingModel liveTimemovingModel) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4a4c8664", new Object[]{this, liveTimemovingModel});
                    } else if (liveTimemovingModel.rightInfo != null && "1".equals(liveTimemovingModel.rightInfo.status) && TimeShiftContentFrame.access$700(TimeShiftContentFrame.this) != null) {
                        TimeShiftContentFrame.access$700(TimeShiftContentFrame.this).a(liveTimemovingModel, new pfj.a() { // from class: com.taobao.taolive.movehighlight.bundle.timeshiftContent.TimeShiftContentFrame.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.pfj.a
                            public void a(LiveCommonIssueInteractResponseData liveCommonIssueInteractResponseData) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("59a5515c", new Object[]{this, liveCommonIssueInteractResponseData});
                                } else if (TimeShiftContentFrame.this.mContext == null || liveCommonIssueInteractResponseData.benefitVO == null || StringUtils.isEmpty(liveCommonIssueInteractResponseData.benefitVO.toastTips)) {
                                } else {
                                    m.a(TimeShiftContentFrame.this.mContext, liveCommonIssueInteractResponseData.benefitVO.toastTips);
                                    com.taobao.taolive.movehighlight.utils.a.a(liveTimemovingModel, TimeShiftContentFrame.this.mContext, TimeShiftContentFrame.this.mFrameContext);
                                }
                            }

                            @Override // tb.pfj.a
                            public void a() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                } else if (TimeShiftContentFrame.this.mContext == null) {
                                } else {
                                    m.a(TimeShiftContentFrame.this.mContext, "领取失败：活动太火爆了，领取失败");
                                    com.taobao.taolive.movehighlight.utils.a.a(liveTimemovingModel, TimeShiftContentFrame.this.mContext, TimeShiftContentFrame.this.mFrameContext);
                                }
                            }
                        });
                    } else {
                        com.taobao.taolive.movehighlight.utils.a.a(liveTimemovingModel, TimeShiftContentFrame.this.mContext, TimeShiftContentFrame.this.mFrameContext);
                    }
                }

                @Override // tb.pfg
                public void a(boolean z) {
                    sss M;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    } else if (TimeShiftContentFrame.access$800(TimeShiftContentFrame.this) == null) {
                    } else {
                        if (TimeShiftContentFrame.this.mFrameContext != null && (M = TimeShiftContentFrame.this.mFrameContext.M()) != null) {
                            M.a(z);
                        }
                        TimeShiftContentFrame.access$800(TimeShiftContentFrame.this).a(z);
                    }
                }
            });
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        pfm pfmVar = this.timeShiftBottomUtils;
        if (pfmVar == null) {
            return;
        }
        pfmVar.a(sst.b(this.mFrameContext));
    }
}
