package com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a;
import com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode;
import com.taobao.taolive.movehighlight.utils.f;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.y;
import java.util.Map;
import tb.kge;
import tb.pfb;
import tb.pfj;
import tb.pfm;
import tb.pfn;
import tb.pfx;
import tb.pfy;
import tb.pgp;
import tb.sgr;
import tb.sss;
import tb.sst;

/* loaded from: classes8.dex */
public class TimeShiftItemTimeShiftDXFrame extends AbstractTimeShiftDXFrame implements sgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout frameLayout;
    private boolean mIsFirst;
    private pfm timeShiftBottomUtils;
    private DXRootView timeShiftDxRootView;
    private pfj timeShiftModel;
    private a timeShiftRequestDx;
    private pfn timeshiftDxUtils;
    private VideoInfo videoInfo;

    static {
        kge.a(-1799209889);
        kge.a(1522751733);
    }

    public static /* synthetic */ Object ipc$super(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame, String str, Object... objArr) {
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

    public static /* synthetic */ FrameLayout access$000(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("86759e8e", new Object[]{timeShiftItemTimeShiftDXFrame}) : timeShiftItemTimeShiftDXFrame.frameLayout;
    }

    public static /* synthetic */ DXRootView access$100(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("f9cbb6cd", new Object[]{timeShiftItemTimeShiftDXFrame}) : timeShiftItemTimeShiftDXFrame.timeShiftDxRootView;
    }

    public static /* synthetic */ VideoInfo access$200(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoInfo) ipChange.ipc$dispatch("37fb17e6", new Object[]{timeShiftItemTimeShiftDXFrame}) : timeShiftItemTimeShiftDXFrame.videoInfo;
    }

    public static /* synthetic */ pfm access$300(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pfm) ipChange.ipc$dispatch("32d542a7", new Object[]{timeShiftItemTimeShiftDXFrame}) : timeShiftItemTimeShiftDXFrame.timeShiftBottomUtils;
    }

    public static /* synthetic */ pfm access$302(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame, pfm pfmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pfm) ipChange.ipc$dispatch("f2103eb0", new Object[]{timeShiftItemTimeShiftDXFrame, pfmVar});
        }
        timeShiftItemTimeShiftDXFrame.timeShiftBottomUtils = pfmVar;
        return pfmVar;
    }

    public static /* synthetic */ pfn access$400(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pfn) ipChange.ipc$dispatch("73002987", new Object[]{timeShiftItemTimeShiftDXFrame}) : timeShiftItemTimeShiftDXFrame.timeshiftDxUtils;
    }

    public TimeShiftItemTimeShiftDXFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.mIsFirst = true;
    }

    @Override // com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame
    public void showTimeShiftLayerCallBack(Map<String, String> map, boolean z, pgp pgpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6943f26b", new Object[]{this, map, new Boolean(z), pgpVar});
        } else if (map == null) {
        } else {
            String str = map.get("timeMovingId");
            String str2 = map.get("itemId");
            this.mIsFirst = z;
            showTimeShift(map.get("timeShiftSoure"), str, str2, map.get(aw.PARAM_TIMEMOVE_KEYPOINTID), pgpVar);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        super.onCreateView2(viewGroup);
        if (viewGroup instanceof FrameLayout) {
            this.frameLayout = (FrameLayout) viewGroup;
            this.timeShiftRequestDx = new a(this.mLiveDataModel, this.frameLayout, this.mFrameContext);
        }
        if (!y.a()) {
            return;
        }
        if (!y.b(this.mContext) && !y.c(this.mContext)) {
            return;
        }
        y.a(this);
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
        this.timeShiftDxRootView = pfx.a().a(this.mContext, "highlight_dx_layout_manager_new");
        if (this.timeShiftDxRootView == null || this.timeShiftRequestDx == null) {
            return;
        }
        this.timeshiftDxUtils = new pfn(this.mContext, this.timeShiftDxRootView, this.mFrameContext, this.mLiveDataModel);
        this.timeShiftRequestDx.a(this.timeshiftDxUtils);
        this.timeShiftModel = new pfj();
        initTimeShiftAction(this.timeShiftRequestDx, this.timeshiftDxUtils, this.timeShiftModel);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (y.a() && (y.b(this.mContext) || y.c(this.mContext))) {
            y.b(this);
        }
        a aVar = this.timeShiftRequestDx;
        if (aVar != null) {
            aVar.a();
            this.timeShiftRequestDx = null;
        }
        this.mIsFirst = true;
    }

    private void showTimeShift(String str, String str2, String str3, String str4, pgp pgpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5acdc5e", new Object[]{this, str, str2, str3, str4, pgpVar});
            return;
        }
        pfn pfnVar = this.timeshiftDxUtils;
        if (pfnVar == null) {
            return;
        }
        int a2 = pfnVar.a(str3, str2);
        if (this.mIsFirst || (!StringUtils.isEmpty(str) && "goodsList".equals(str) && a2 == -1)) {
            a aVar = this.timeShiftRequestDx;
            if (aVar == null) {
                return;
            }
            aVar.a(this.mFrameContext, pgpVar, str3, str4, new a.b() { // from class: com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.TimeShiftItemTimeShiftDXFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a.b
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        return;
                    }
                    TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this).setVisibility(0);
                    if (TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this).getChildCount() != 0) {
                        TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this).removeAllViews();
                    }
                    if (TimeShiftItemTimeShiftDXFrame.access$100(TimeShiftItemTimeShiftDXFrame.this) == null) {
                        return;
                    }
                    TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this).addView(TimeShiftItemTimeShiftDXFrame.access$100(TimeShiftItemTimeShiftDXFrame.this));
                    if (TimeShiftItemTimeShiftDXFrame.access$200(TimeShiftItemTimeShiftDXFrame.this) != null) {
                        if (TimeShiftItemTimeShiftDXFrame.access$300(TimeShiftItemTimeShiftDXFrame.this) == null) {
                            TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame = TimeShiftItemTimeShiftDXFrame.this;
                            TimeShiftItemTimeShiftDXFrame.access$302(timeShiftItemTimeShiftDXFrame, new pfm(timeShiftItemTimeShiftDXFrame.mFrameContext, TimeShiftItemTimeShiftDXFrame.this.mLiveDataModel, TimeShiftItemTimeShiftDXFrame.this.mContext, TimeShiftItemTimeShiftDXFrame.access$100(TimeShiftItemTimeShiftDXFrame.this)));
                        }
                        jSONObject = TimeShiftItemTimeShiftDXFrame.access$300(TimeShiftItemTimeShiftDXFrame.this).a(jSONObject);
                    }
                    pfy.a(jSONObject);
                    pfx.a().a(TimeShiftItemTimeShiftDXFrame.access$100(TimeShiftItemTimeShiftDXFrame.this), jSONObject, TimeShiftItemTimeShiftDXFrame.this.mFrameContext);
                    TimeShiftItemTimeShiftDXFrame.access$400(TimeShiftItemTimeShiftDXFrame.this).a(DXHighlightScrollableLayoutWidgetNode.LOAD_MORE_IDLE_STRING);
                    TimeShiftItemTimeShiftDXFrame.access$400(TimeShiftItemTimeShiftDXFrame.this).a(0);
                    f.a().e(System.currentTimeMillis());
                    pfb.a(TimeShiftItemTimeShiftDXFrame.this.getFrameContext()).a(jSONObject);
                }
            });
            this.mIsFirst = false;
            return;
        }
        this.timeshiftDxUtils.b(a2);
    }

    @Override // tb.sgr
    public void onScreenOrientationChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
        } else if (this.timeShiftDxRootView == null) {
        } else {
            pfx a2 = pfx.a();
            DXRootView dXRootView = this.timeShiftDxRootView;
            a2.a(dXRootView, dXRootView.getData(), this.mFrameContext);
        }
    }

    @Override // com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame
    public void abstractRefreshBottomByMute(boolean z) {
        sss M;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6df1b99", new Object[]{this, new Boolean(z)});
        } else if (this.timeShiftBottomUtils == null) {
        } else {
            if (this.mFrameContext != null && (M = this.mFrameContext.M()) != null) {
                M.a(z);
            }
            this.timeShiftBottomUtils.a(z);
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
