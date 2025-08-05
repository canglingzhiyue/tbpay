package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.a;
import com.taobao.taolive.sdk.model.f;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.hgs;
import tb.hki;
import tb.kge;
import tb.sss;
import tb.sst;

/* loaded from: classes5.dex */
public class MuteFrame extends BaseFrame implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mRootView;
    private TUrlImageView muteImg;
    private View segmentView;
    private TextView textView;
    private final f weakHandler;

    static {
        kge.a(124068661);
        kge.a(-1905361424);
    }

    public static /* synthetic */ Object ipc$super(MuteFrame muteFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
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

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean lazyInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4de9efe", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ View access$000(MuteFrame muteFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("1cba1bd3", new Object[]{muteFrame}) : muteFrame.mRootView;
    }

    public static /* synthetic */ void access$100(MuteFrame muteFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4109d582", new Object[]{muteFrame, new Boolean(z)});
        } else {
            muteFrame.handleRemindView(z);
        }
    }

    public static /* synthetic */ f access$200(MuteFrame muteFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("43770c9b", new Object[]{muteFrame}) : muteFrame.weakHandler;
    }

    public MuteFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.weakHandler = new f(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mRootView = view;
        this.mRootView.setVisibility(8);
        this.muteImg = (TUrlImageView) view.findViewById(R.id.taolive_bottombar_mute_img_icon);
        this.textView = (TextView) view.findViewById(R.id.taolive_bottombar_mute_text);
        this.segmentView = view.findViewById(R.id.taolive_bottombar_mute_segment);
        this.muteImg.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01WCTQSN1mVjRSBzmbz_!!6000000004960-2-tps-108-108.png");
        view.setContentDescription("取消静音");
        hki.a(view);
        this.mRootView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.MuteFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else if (MuteFrame.this.mFrameContext == null || MuteFrame.this.mFrameContext.e() == null) {
                } else {
                    sss M = MuteFrame.this.mFrameContext.M();
                    if (M != null) {
                        M.a(false);
                    }
                    MuteFrame.access$000(MuteFrame.this).setVisibility(8);
                    MuteFrame.this.mFrameContext.e().a("com.taobao.taolive.mute_notify_showcase", true, MuteFrame.this.mFrameContext.G());
                }
            }
        });
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        handleMuteVisiable();
    }

    private void handleRemindView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("291d2cdb", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.textView;
        int i = 8;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
        View view = this.segmentView;
        if (view == null) {
            return;
        }
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    private void handleMuteVisiable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6386b2b", new Object[]{this});
        } else if (sst.b(this.mFrameContext)) {
            if (this.weakHandler == null) {
                return;
            }
            inflateViewOnNeed();
            this.weakHandler.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.MuteFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (MuteFrame.access$000(MuteFrame.this) == null) {
                    } else {
                        MuteFrame.access$000(MuteFrame.this).setVisibility(0);
                        if (sst.c()) {
                            MuteFrame.access$100(MuteFrame.this, true);
                            sst.b();
                            if (MuteFrame.access$200(MuteFrame.this) != null) {
                                MuteFrame.access$200(MuteFrame.this).postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.MuteFrame.2.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            MuteFrame.access$100(MuteFrame.this, false);
                                        }
                                    }
                                }, hgs.p().longValue() * 1000);
                            }
                        } else {
                            MuteFrame.access$100(MuteFrame.this, false);
                        }
                        if (MuteFrame.this.mFrameContext == null || MuteFrame.this.mFrameContext.e() == null) {
                            return;
                        }
                        MuteFrame.this.mFrameContext.e().a("com.taobao.taolive.mute_notify_showcase", false, MuteFrame.this.mFrameContext.G());
                    }
                }
            });
        } else {
            View view = this.mRootView;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            if (this.mFrameContext == null || this.mFrameContext.e() == null) {
                return;
            }
            this.mFrameContext.e().a("com.taobao.taolive.mute_notify_showcase", true, this.mFrameContext.G());
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
        handleMuteVisiable();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        f fVar = this.weakHandler;
        if (fVar == null) {
            return;
        }
        fVar.removeCallbacksAndMessages(null);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_bottombar_mute_layout_flexalocal;
    }
}
