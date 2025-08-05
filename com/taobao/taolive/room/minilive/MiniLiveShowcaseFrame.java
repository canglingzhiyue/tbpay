package com.taobao.taolive.room.minilive;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import tb.kge;

/* loaded from: classes8.dex */
public class MiniLiveShowcaseFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.alilive.aliliveframework.frame.a mFrameContext;
    private c mMiniLiveShowcaseController;

    static {
        kge.a(301330129);
    }

    public MiniLiveShowcaseFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context);
        this.mFrameContext = aVar;
        this.mMiniLiveShowcaseController = new c(this.mContext, this.mFrameContext);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        } else if (viewStub == null) {
        } else {
            this.mContainer = this.mMiniLiveShowcaseController.a(viewStub);
        }
    }

    public void setStartAnimView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48638e95", new Object[]{this, view});
            return;
        }
        c cVar = this.mMiniLiveShowcaseController;
        if (cVar == null) {
            return;
        }
        cVar.a(view);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        c cVar = this.mMiniLiveShowcaseController;
        if (cVar == null) {
            return;
        }
        cVar.a();
    }
}
