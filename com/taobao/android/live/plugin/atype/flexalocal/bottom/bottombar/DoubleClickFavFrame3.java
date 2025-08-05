package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.doubleclickfav.DoubleClickFavView2;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.ddv;
import tb.kge;
import tb.xkw;

/* loaded from: classes5.dex */
public class DoubleClickFavFrame3 extends BaseFrame implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DoubleClickFavView2 mDoubleClickFavView;

    static {
        kge.a(-1363236375);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(DoubleClickFavFrame3 doubleClickFavFrame3, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode != -309961236) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCleanUp();
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : IBottomProxy.KEY_FRAME_CLASS_DOUBLE_CLICK_FAV_FRAME_3;
    }

    public DoubleClickFavFrame3(Context context, a aVar) {
        super(context, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_room_double_click_fav_layout3_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
        } else {
            this.mDoubleClickFavView = (DoubleClickFavView2) findViewById(R.id.taolive_room_double_click_view);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.mFrameContext.e().a(this);
        this.mDoubleClickFavView.checkFavorPicByUrl(tBLiveDataModel.mVideoInfo.favorImg);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.mFrameContext.e().b(this);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        DoubleClickFavView2 doubleClickFavView2;
        DoubleClickFavView2 doubleClickFavView22;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taolive.taolive.room.double_click_favor_show".equals(str)) {
            if (!(obj instanceof PointF) || (doubleClickFavView22 = this.mDoubleClickFavView) == null) {
                return;
            }
            doubleClickFavView22.setMaxRatio(1.5f);
            this.mDoubleClickFavView.showDoubleClickFav((PointF) obj);
        } else if (xkw.EVENT_CLICK_FAVOR_IN_MIDDLE.equalsIgnoreCase(str)) {
            if (!(obj instanceof PointF) || (doubleClickFavView2 = this.mDoubleClickFavView) == null) {
                return;
            }
            doubleClickFavView2.setMaxRatio(1.2f);
            this.mDoubleClickFavView.showDoubleClickFav((PointF) obj);
        } else if (!xkw.EVENT_MEDIAPLATFORM_UPDATE_FAVOR_IMAGE.equalsIgnoreCase(str) || !(obj instanceof String)) {
        } else {
            this.mDoubleClickFavView.checkFavorPicByUrl((String) obj);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taolive.taolive.room.double_click_favor_show", xkw.EVENT_CLICK_FAVOR_IN_MIDDLE, xkw.EVENT_MEDIAPLATFORM_UPDATE_FAVOR_IMAGE};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (this.mFrameContext != null) {
            return this.mFrameContext.G();
        }
        return null;
    }
}
