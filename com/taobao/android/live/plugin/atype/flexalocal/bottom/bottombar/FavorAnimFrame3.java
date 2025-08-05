package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.FavorAnimView2;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.kge;

/* loaded from: classes5.dex */
public class FavorAnimFrame3 extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FavorAnimView2 mFavorView;

    static {
        kge.a(-2024124842);
    }

    public static /* synthetic */ Object ipc$super(FavorAnimFrame3 favorAnimFrame3, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -1073179481:
                super.onFreezeLayout();
                return null;
            case -908767872:
                super.onUnfreezeLayout();
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "tl-favor-anim";
    }

    public FavorAnimFrame3(Context context, a aVar) {
        super(context, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_frame_favor3_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mFavorView = (FavorAnimView2) findViewById(R.id.taolive_room_frame_favor);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.mFavorView.init(tBLiveDataModel, this.mFrameContext);
        this.mFavorView.checkFavorPicByUrl(tBLiveDataModel.mVideoInfo.favorImg);
        this.mFavorView.setVisibility(0);
    }

    public void setNeedShowFavor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49bc10c4", new Object[]{this, new Boolean(z)});
            return;
        }
        FavorAnimView2 favorAnimView2 = this.mFavorView;
        if (favorAnimView2 == null) {
            return;
        }
        favorAnimView2.setNeedShowFavor(z);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        FavorAnimView2 favorAnimView2 = this.mFavorView;
        if (favorAnimView2 == null) {
            return;
        }
        favorAnimView2.destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onFreezeLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00894a7", new Object[]{this});
            return;
        }
        super.onFreezeLayout();
        FavorAnimView2 favorAnimView2 = this.mFavorView;
        if (favorAnimView2 == null) {
            return;
        }
        favorAnimView2.setVisibility(8);
        this.mFavorView.clearMessages();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onUnfreezeLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d54d80", new Object[]{this});
            return;
        }
        super.onUnfreezeLayout();
        FavorAnimView2 favorAnimView2 = this.mFavorView;
        if (favorAnimView2 == null) {
            return;
        }
        favorAnimView2.setVisibility(0);
    }
}
