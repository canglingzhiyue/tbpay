package com.taobao.taolive.taolivemorelive.moreliveguide;

import android.content.Context;
import android.taobao.windvane.util.m;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.listener.impl.access.ITab2MoreLiveGuideClickListener;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.morelive.TaoliveRoomTab2RightGuideFrame;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.taolivemorelive.view.MoreliveEntryView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import tb.pqq;
import tb.ssr;

/* loaded from: classes8.dex */
public class TaoTab2MoreLiveRightGuideFrame extends TaoliveRoomTab2RightGuideFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String RIGHT_ICON_URL = "https://gw.alicdn.com/imgextra/i4/O1CN01FGzKbS1Qbl7RYrwxz_!!6000000001995-2-tps-35-35.png";
    private static final int RIGHT_ICON_WIDTH_HEIGHT = 9;
    private static final String RIGHT_TEXT = "更多直播";
    private static final String TAG = "TaoTab2MoreLiveRightGuideFrame";
    private MoreliveEntryView mRootView;

    public static /* synthetic */ Object ipc$super(TaoTab2MoreLiveRightGuideFrame taoTab2MoreLiveRightGuideFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775111991:
                super.hide();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -340027132:
                super.show();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(TaoTab2MoreLiveRightGuideFrame taoTab2MoreLiveRightGuideFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d617f5", new Object[]{taoTab2MoreLiveRightGuideFrame});
        } else {
            taoTab2MoreLiveRightGuideFrame.getClickListener();
        }
    }

    public TaoTab2MoreLiveRightGuideFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar) {
        super(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.taolive.sdk.morelive.TaoliveRoomTab2RightGuideFrame
    public void showMoreLiveFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2533087e", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            hide();
        } else if (this.mRootView.isShown()) {
        } else {
            show();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        } else if (viewStub == null) {
        } else {
            m.e(TAG, "更多直播，TaoTab2MoreLiveRightGuideFrame onCreateView");
            viewStub.setLayoutResource(R.layout.taolive_more_live_guide_layout_new);
            this.mContainer = viewStub.inflate();
        }
    }

    private void initInternalView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd988bb9", new Object[]{this});
            return;
        }
        m.e(TAG, "更多直播，TaoTab2MoreLiveRightGuideFrame initInternalView");
        if (!(this.mContainer instanceof MoreliveEntryView)) {
            return;
        }
        this.mRootView = (MoreliveEntryView) this.mContainer;
        this.mRootView.setVisibility(8);
        this.mRootView.setBackgroundResource(R.drawable.tab2_more_live_right_guide_bg);
        TUrlImageView tUrlImageView = new TUrlImageView(this.mContext);
        tUrlImageView.setImageUrl(RIGHT_ICON_URL);
        int a2 = b.a(this.mContext, 9.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2, 16);
        layoutParams.leftMargin = b.a(this.mContext, 4.6f);
        tUrlImageView.setLayoutParams(layoutParams);
        this.mRootView.addView(tUrlImageView);
        TextView textView = new TextView(this.mContext);
        textView.setText("更多直播");
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 16);
        layoutParams2.leftMargin = b.a(this.mContext, 16.0f);
        layoutParams2.rightMargin = b.a(this.mContext, 6.0f);
        layoutParams2.topMargin = b.a(this.mContext, 4.0f);
        layoutParams2.bottomMargin = b.a(this.mContext, 4.0f);
        textView.setTextColor(-1);
        textView.setTextSize(0, b.a(this.mContext, 11.0f));
        textView.setLayoutParams(layoutParams2);
        this.mRootView.addView(textView);
        setRootViewClickListener();
    }

    private void setRootViewClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f166ba", new Object[]{this});
            return;
        }
        MoreliveEntryView moreliveEntryView = this.mRootView;
        if (moreliveEntryView == null) {
            return;
        }
        moreliveEntryView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.taolivemorelive.moreliveguide.TaoTab2MoreLiveRightGuideFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                pqq.b(TaoTab2MoreLiveRightGuideFrame.this.mFrameContext, "Tab2_LiveTab_MoreLive_Click", null);
                TaoTab2MoreLiveRightGuideFrame.access$000(TaoTab2MoreLiveRightGuideFrame.this);
            }
        });
    }

    private void getClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42fa642d", new Object[]{this});
        } else if (this.mFrameContext == null) {
        } else {
            ATaoLiveOpenEntity o = this.mFrameContext.o();
            if (o != null && o.eventCompontent != null && o.eventCompontent.a() != null) {
                ssr d = o.eventCompontent.a().d();
                if (d == null) {
                    return;
                }
                Object dC_ = d.dC_();
                if (!(dC_ instanceof Map)) {
                    return;
                }
                Object obj = ((Map) dC_).get(DataReceiveMonitor.CB_LISTENER);
                if (!(obj instanceof ITab2MoreLiveGuideClickListener)) {
                    return;
                }
                q.b(TAG, "更多直播间点击事件回调 = " + obj);
                ((ITab2MoreLiveGuideClickListener) obj).a();
            } else if (o == null || o.eventCompontent == null || o.eventCompontent.b() == null) {
            } else {
                o.eventCompontent.b().t();
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        if (this.mRootView == null) {
            return;
        }
        m.e(TAG, "更多直播，TaoTab2MoreLiveRightGuideFrame hide");
        this.mRootView.setVisibility(8);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        if (this.mRootView == null) {
            return;
        }
        m.e(TAG, "更多直播，TaoTab2MoreLiveRightGuideFrame show");
        this.mRootView.setVisibility(0);
        pqq.d(this.mFrameContext, "Page_TaobaoLiveWatch_Tab2_LiveTab_MoreLive_Show", null);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroy();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        MoreliveEntryView moreliveEntryView = this.mRootView;
        if (moreliveEntryView != null) {
            moreliveEntryView.removeAllViews();
        }
        this.mRootView = null;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        destroy();
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
        initInternalView();
        show();
    }
}
