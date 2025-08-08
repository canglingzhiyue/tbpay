package com.taobao.taolive.room.ui.h5;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.fanslevel.c;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.sdk.goodlist.i;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.tbliveinteractive.container.h5.b;
import com.taobao.tbliveinteractive.e;
import java.util.HashMap;
import tb.kge;
import tb.phq;
import tb.pmd;
import tb.poy;
import tb.pqj;
import tb.qmr;

/* loaded from: classes8.dex */
public class H5TabFrame extends BaseFrame implements i.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DP2_MODULE = "TLiveGoodH5Tab";
    private static final String DP2_MONITOR_POINT = "liveroomGoodsH5Render";
    private static final String H5_CONTAINER_ERROR_RENDER_TIMEOUT = "renderTimeout";
    private static final String TAG = "H5TabFrame";
    private b h5Container;
    private String resultUrl;
    private View retryLayout;
    private View webViewLayout;

    static {
        kge.a(486438604);
        kge.a(1214227990);
    }

    public static /* synthetic */ Object ipc$super(H5TabFrame h5TabFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
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
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ b access$000(H5TabFrame h5TabFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7a543a43", new Object[]{h5TabFrame}) : h5TabFrame.h5Container;
    }

    public static /* synthetic */ String access$100(H5TabFrame h5TabFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("70985da5", new Object[]{h5TabFrame}) : h5TabFrame.resultUrl;
    }

    public static /* synthetic */ View access$200(H5TabFrame h5TabFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("48aecb9e", new Object[]{h5TabFrame}) : h5TabFrame.webViewLayout;
    }

    public static /* synthetic */ View access$300(H5TabFrame h5TabFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("2470475f", new Object[]{h5TabFrame}) : h5TabFrame.retryLayout;
    }

    public H5TabFrame(Context context) {
        super(context);
    }

    public H5TabFrame(Context context, boolean z) {
        super(context, z);
    }

    public H5TabFrame(Context context, a aVar) {
        super(context, aVar);
    }

    public H5TabFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
    }

    public H5TabFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar) {
        super(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        b bVar = this.h5Container;
        if (bVar == null) {
            return;
        }
        bVar.k();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        b bVar = this.h5Container;
        if (bVar == null) {
            return;
        }
        bVar.l();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
        } else {
            super.onStatusChange(i, obj);
        }
    }

    public void init(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            ab.a(TAG, "[init] url empty");
        } else {
            ab.d(TAG, "[init] url: " + str);
            this.resultUrl = str;
            e tBLiveInteractiveManager = getTBLiveInteractiveManager();
            if (tBLiveInteractiveManager == null) {
                return;
            }
            if (this.mContainer == null) {
                this.mContainer = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_frame_h5_tab, (ViewGroup) null);
            }
            this.mContainer.setVisibility(0);
            this.webViewLayout = this.mContainer.findViewById(R.id.taolive_goods_frame_h5_tab_webview_layout);
            this.retryLayout = this.mContainer.findViewById(R.id.taolive_goods_frame_h5_tab_retry_layout);
            this.retryLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.room.ui.h5.H5TabFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (H5TabFrame.access$000(H5TabFrame.this) != null) {
                        H5TabFrame.access$000(H5TabFrame.this).c(H5TabFrame.access$100(H5TabFrame.this));
                    }
                    if (H5TabFrame.access$200(H5TabFrame.this) != null) {
                        H5TabFrame.access$200(H5TabFrame.this).setVisibility(0);
                    }
                    if (H5TabFrame.access$300(H5TabFrame.this) == null) {
                        return;
                    }
                    H5TabFrame.access$300(H5TabFrame.this).setVisibility(8);
                }
            });
            this.retryLayout.setVisibility(8);
            VideoInfo u = poy.u(this.mFrameContext);
            final HashMap hashMap = new HashMap();
            hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, u == null ? "-1" : u.liveId);
            this.h5Container = tBLiveInteractiveManager.a((ViewGroup) this.webViewLayout);
            this.h5Container.a(new c(this.mContext, this.mFrameContext));
            this.h5Container.a(new com.taobao.taolive.room.ui.fanslevel.b(this.mContext, this.mFrameContext));
            this.h5Container.a(new qmr.a() { // from class: com.taobao.taolive.room.ui.h5.H5TabFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.qmr.a
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                        return;
                    }
                    ab.d(H5TabFrame.TAG, "[init] renderSuccess view = " + view.toString());
                    if (H5TabFrame.access$200(H5TabFrame.this) != null) {
                        H5TabFrame.access$200(H5TabFrame.this).setBackgroundColor(0);
                        H5TabFrame.access$200(H5TabFrame.this).setVisibility(0);
                    }
                    H5TabFrame.access$000(H5TabFrame.this).i();
                    pmd.a().n().a(H5TabFrame.DP2_MODULE, H5TabFrame.DP2_MONITOR_POINT, pqj.a(hashMap));
                }

                @Override // tb.qmr.a
                public void a(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                    } else if (!H5TabFrame.H5_CONTAINER_ERROR_RENDER_TIMEOUT.equals(str2)) {
                    } else {
                        ab.d(H5TabFrame.TAG, "[init] renderError errorCode = " + str2 + ", errorMsg = " + str3);
                        if (H5TabFrame.this.mContainer != null) {
                            H5TabFrame.access$200(H5TabFrame.this).setVisibility(8);
                        }
                        if (H5TabFrame.access$300(H5TabFrame.this) != null) {
                            H5TabFrame.access$300(H5TabFrame.this).setVisibility(0);
                        }
                        pmd.a().n().a(H5TabFrame.DP2_MODULE, H5TabFrame.DP2_MONITOR_POINT, pqj.a(hashMap), str2, str3);
                    }
                }
            });
            this.h5Container.c(this.resultUrl);
        }
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
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroy();
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        b bVar = this.h5Container;
        if (bVar != null) {
            bVar.m();
            this.h5Container = null;
        }
        if (!(this.mContainer instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.mContainer).removeAllViews();
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.mContainer;
    }

    private e getTBLiveInteractiveManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a8e86078", new Object[]{this});
        }
        if (!(this.mFrameContext instanceof phq)) {
            return null;
        }
        return ((phq) this.mFrameContext).p();
    }

    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        b bVar = this.h5Container;
        if (bVar == null) {
            return;
        }
        bVar.i();
    }

    public void onHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
            return;
        }
        b bVar = this.h5Container;
        if (bVar == null) {
            return;
        }
        bVar.h();
    }
}
