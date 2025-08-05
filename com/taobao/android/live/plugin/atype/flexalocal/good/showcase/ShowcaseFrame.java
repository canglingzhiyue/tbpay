package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.his;
import tb.kge;

/* loaded from: classes5.dex */
public class ShowcaseFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShowcaseFrameCommon";
    public com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c goodLiveContext;
    private d mControllerCommon;
    private LiveItem mHighlightLiveItem;

    static {
        kge.a(-540895196);
    }

    public static /* synthetic */ Object ipc$super(ShowcaseFrame showcaseFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode != 588897590) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onVideoStatusChanged(((Number) objArr[0]).intValue());
            return null;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "tl-showcase-common";
    }

    public ShowcaseFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.goodLiveContext = null;
    }

    public ShowcaseFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, LiveItem liveItem) {
        super(context, aVar);
        this.goodLiveContext = null;
        this.mHighlightLiveItem = liveItem;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) {
            return;
        }
        if (this.mFrameContext.c() instanceof com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) {
            this.goodLiveContext = (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) this.mFrameContext.c();
        }
        his.a(TAG, "onDataReceived | newShowcase.");
        this.mControllerCommon = new j((FrameLayout) getContainerView().findViewById(R.id.fl_show_case_card), this.mFrameContext.f(), tBLiveDataModel, this.goodLiveContext, this.mHighlightLiveItem);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_goods_showcase_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        d dVar = this.mControllerCommon;
        if (dVar == null) {
            return;
        }
        dVar.b();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void onVideoStatusChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2319dd36", new Object[]{this, new Integer(i)});
            return;
        }
        super.onVideoStatusChanged(i);
        if (i != 5 || this.mControllerCommon == null) {
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar = this.goodLiveContext;
        if (cVar != null && cVar.k()) {
            return;
        }
        this.mControllerCommon.a();
    }
}
