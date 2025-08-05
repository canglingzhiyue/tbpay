package com.taobao.android.live.plugin.atype.flexalocal.ui;

import android.content.Context;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ae;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.a;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.playcontrol.c;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;
import tb.pmd;
import tb.pmf;
import tb.poy;
import tb.poz;

/* loaded from: classes6.dex */
public class TimePlayToastFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mContentView;
    private f mHandler;
    private Toast mToast;

    static {
        kge.a(1640761430);
    }

    public static /* synthetic */ Object ipc$super(TimePlayToastFrame timePlayToastFrame, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ View access$000(TimePlayToastFrame timePlayToastFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e821ccd6", new Object[]{timePlayToastFrame}) : timePlayToastFrame.mContentView;
    }

    @Deprecated
    public TimePlayToastFrame(Context context) {
        super(context);
        this.mHandler = new f(new a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.ui.TimePlayToastFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.a
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                }
            }
        });
    }

    @Deprecated
    public TimePlayToastFrame(Context context, boolean z) {
        super(context, z);
        this.mHandler = new f(new a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.ui.TimePlayToastFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.a
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                }
            }
        });
    }

    public TimePlayToastFrame(Context context, boolean z, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z);
        this.mHandler = new f(new a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.ui.TimePlayToastFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.a
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                }
            }
        });
        this.mFrameContext = aVar;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
            return;
        }
        VideoInfo u = poy.u(this.mFrameContext);
        if (u == null || c.i(this.mFrameContext) != VideoStatus.VIDEO_TIMESHIFT_STATUS || !"1".equals(u.roomStatus)) {
            return;
        }
        viewStub.setLayoutResource(R.layout.taolive_time_player_toast2_flexalocal);
        this.mContentView = viewStub.inflate();
        checkTimePlayMode();
        ((TUrlImageView) this.mContentView.findViewById(R.id.taolive_time_player_toast2_icon_image)).setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01YRqKMn1oXDt9UFqTZ_!!6000000005234-2-tps-30-15.png");
        showToast();
        this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.ui.TimePlayToastFrame.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TimePlayToastFrame.access$000(TimePlayToastFrame.this) == null) {
                } else {
                    TimePlayToastFrame.access$000(TimePlayToastFrame.this).setVisibility(8);
                }
            }
        }, 10000L);
    }

    private void showToast() {
        VideoInfo u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95d00b1", new Object[]{this});
        } else if (poy.ah(this.mFrameContext) || (u = poy.u(this.mFrameContext)) == null || c.i(this.mFrameContext) != VideoStatus.VIDEO_TIMESHIFT_STATUS || !"1".equals(u.roomStatus) || this.mToast != null) {
        } else {
            int abid = getABID();
            if (abid == 0) {
                this.mToast = new Toast(this.mContext);
                View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_time_player_toast_flexalocal, (ViewGroup) null);
                ((TUrlImageView) inflate.findViewById(R.id.time_play_icon2)).setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01YzMACX1maJP10i4O1_!!6000000004970-2-tps-118-118.png");
                ((TUrlImageView) inflate.findViewById(R.id.time_play_bg3)).setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN017Vwvhv1h7qi4dIo2t_!!6000000004231-2-tps-720-240.png");
                this.mToast.setView(inflate);
                this.mToast.setGravity(17, 0, 0);
                this.mToast.setDuration(1);
                this.mToast.show();
            } else if (abid == 1) {
                this.mToast = new Toast(this.mContext);
                View inflate2 = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_time_player_toast_new_flexalocal, (ViewGroup) null);
                this.mToast.setView(inflate2);
                ((TUrlImageView) inflate2.findViewById(R.id.taolive_time_play_toast_icon_image)).setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01y9KEIO26A0tw4Opmh_!!6000000007620-54-tps-64-64.apng");
                this.mToast.setGravity(17, 0, 0);
                this.mToast.setDuration(0);
                this.mToast.show();
            } else if (abid == 2) {
                this.mToast = Toast.makeText(this.mContext, "正在播放宝贝讲解", 0);
                this.mToast.show();
            }
            poz.c(true, n.b(this.mFrameContext));
        }
    }

    private int getABID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbed0ccc", new Object[]{this})).intValue();
        }
        pmf t = pmd.a().t();
        if (t == null) {
            return 0;
        }
        return v.b(t.a("taolive", "timePlayerToastABID", "id", "0"));
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Toast toast = this.mToast;
        if (toast != null) {
            toast.cancel();
        }
        f fVar = this.mHandler;
        if (fVar == null) {
            return;
        }
        fVar.removeCallbacksAndMessages(null);
    }

    public void checkTimePlayMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b787a493", new Object[]{this});
        } else if (!ae.b(ae.SHOW_TIME_PLAY_BOTTOM_TOAST)) {
            VideoInfo u = poy.u(this.mFrameContext);
            if (u == null || u.broadCaster == null) {
                this.mContentView.setVisibility(8);
            } else if (c.i(this.mFrameContext) == VideoStatus.VIDEO_TIMESHIFT_STATUS && "1".equals(u.roomStatus)) {
                this.mContentView.setVisibility(0);
                ae.a(ae.SHOW_TIME_PLAY_BOTTOM_TOAST, true);
            } else {
                this.mContentView.setVisibility(8);
            }
        } else {
            this.mContentView.setVisibility(8);
        }
    }
}
