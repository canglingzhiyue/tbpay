package com.taobao.taolive.sdk.ui.component;

import android.content.Context;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.TextView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.as;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.controller.e;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;
import tb.ddw;
import tb.kge;
import tb.phg;
import tb.xkw;

/* loaded from: classes8.dex */
public class VideoFrameErrorController implements com.taobao.taolive.sdk.model.a, a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_AUTO_DOWN = "com.taobao.taolive.room.auto_down";
    public static final int MESSAGE_WHAT_AUTO_SCROLL_NEXT_1S = 998;
    public static final int MESSAGE_WHAT_AUTO_SCROLL_NEXT_2S = 999;
    public static final int MESSAGE_WHAT_AUTO_SCROLL_NEXT_FINISH = 1000;
    public static final int UP_DOWN_SWITCH_BOTTOM = 0;
    public static final int UP_DOWN_SWITCH_INIT = 2;
    public static final int UP_DOWN_SWITCH_UP = 1;
    private TBLiveDataModel b;
    private boolean d;
    private Context e;
    private View f;
    private TextView g;
    private AliUrlImageView h;
    private TextView i;
    private f j;
    private com.taobao.alilive.aliliveframework.frame.a k;
    private TextView l;

    /* renamed from: a  reason: collision with root package name */
    private PlayerErrorState f21922a = PlayerErrorState.PLAYER_ERROR_STATE_NONE;
    private int c = 0;

    /* renamed from: com.taobao.taolive.sdk.ui.component.VideoFrameErrorController$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21923a = new int[PlayerErrorState.values().length];

        static {
            try {
                f21923a[PlayerErrorState.PLAYER_ERROR_STATE_ANCHOR_LEAVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21923a[PlayerErrorState.PLAYER_ERROR_STATE_LIVE_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21923a[PlayerErrorState.PLAYER_ERROR_STATE_USER_NETWORK_NOT_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21923a[PlayerErrorState.PLAYER_ERROR_STATE_OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public enum PlayerErrorState {
        PLAYER_ERROR_STATE_NONE,
        PLAYER_ERROR_STATE_ANCHOR_LEAVE,
        PLAYER_ERROR_STATE_USER_NETWORK_NOT_AVAILABLE,
        PLAYER_ERROR_STATE_OTHER,
        PLAYER_ERROR_STATE_LIVE_END
    }

    static {
        kge.a(-814523634);
        kge.a(-1427285697);
        kge.a(-1905361424);
    }

    @Override // com.taobao.taolive.sdk.ui.component.a
    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e0a65e7", new Object[]{this, aVar, context, view});
            return;
        }
        this.k = aVar;
        this.e = context;
        this.f = view;
        View view2 = this.f;
        if (view2 != null) {
            this.h = (AliUrlImageView) view2.findViewById(R.id.taolive_video_black_screen_img);
            AliUrlImageView aliUrlImageView = this.h;
            if (aliUrlImageView != null) {
                aliUrlImageView.setPlaceHolder(R.drawable.taolive_error_tips_img);
            }
            this.g = (TextView) this.f.findViewById(R.id.taolive_video_black_screen_tv);
            this.i = (TextView) this.f.findViewById(R.id.taolive_video_black_screen_to_next_tv);
            this.l = (TextView) this.f.findViewById(R.id.taolive_video_black_screen_resume_live);
            q.a("VideoFrameErrorController", "initErrorView");
        }
        if (this.j == null) {
            this.j = new f(this);
        }
        this.h.setVisibility(8);
    }

    @Override // com.taobao.taolive.sdk.ui.component.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f21922a = PlayerErrorState.PLAYER_ERROR_STATE_NONE;
        this.d = false;
        this.c = 0;
        q.a("VideoFrameErrorController", "resetState");
        f fVar = this.j;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages(null);
        }
        TextView textView = this.l;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // com.taobao.taolive.sdk.ui.component.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TextView textView = this.l;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (!d.c(this.e)) {
            this.f21922a = PlayerErrorState.PLAYER_ERROR_STATE_USER_NETWORK_NOT_AVAILABLE;
        }
        int i = this.c;
        if (i == 0 || i == 2) {
            if (this.f21922a != PlayerErrorState.PLAYER_ERROR_STATE_USER_NETWORK_NOT_AVAILABLE && this.f21922a != PlayerErrorState.PLAYER_ERROR_STATE_OTHER) {
                g();
            } else {
                f();
            }
        } else {
            f();
        }
        View view = this.f;
        if (view != null) {
            view.setVisibility(0);
        }
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        String str = com.taobao.taolive.sdk.playcontrol.c.i(this.k) == VideoStatus.VIDEO_TIMESHIFT_STATUS ? "timeshift" : "live";
        hashMap.put("feed_type", str);
        if (StringUtils.equals(str, "live")) {
            String i = i();
            hashMap.put("live_status", i);
            q.b("VideoFrameErrorController", "feed_type:" + str + " live_status:" + i);
        }
        if (phg.a() == null) {
            return;
        }
        phg.a().a("live_status_expo", hashMap);
    }

    private String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        int i = AnonymousClass1.f21923a[this.f21922a.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "2" : "5" : "3" : "1";
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        TextView textView = this.i;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.l;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        h();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        TextView textView = this.l;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.i;
        if (textView2 != null) {
            textView2.setVisibility(0);
            this.i.setText("3s 后进入下一个直播间");
            this.j.sendEmptyMessageDelayed(999, 1000L);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("slide_type", "other");
        if (phg.a() != null) {
            phg.a().a(this.k, "upDown_switch-exp", hashMap);
        }
        h();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        q.a("VideoFrameErrorController", "setErrorText mPlayerState:" + this.f21922a);
        if (this.g == null || this.h == null || this.i == null) {
            return;
        }
        int i = AnonymousClass1.f21923a[this.f21922a.ordinal()];
        if (i == 1) {
            this.g.setText("主播暂时离开，看看其他主播吧");
            this.h.setImageUrl(o.G());
            this.h.setVisibility(0);
            TextView textView = this.l;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view = this.f;
            if (view == null) {
                return;
            }
            view.setBackgroundResource(R.drawable.taolive_slice_scroll_common);
        } else if (i == 2) {
            if (this.c == 0) {
                this.g.setText("直播已结束，看看其他主播吧");
                this.h.setImageUrl(o.H());
            } else {
                this.g.setText("直播已结束");
                this.h.setImageUrl(o.H());
            }
            TextView textView2 = this.l;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.h.setVisibility(0);
            View view2 = this.f;
            if (view2 == null) {
                return;
            }
            view2.setBackgroundResource(R.drawable.taolive_slice_scroll_common);
        } else if (i == 3) {
            this.g.setText("哎呀，好像断网了");
            this.h.setImageUrl(o.F());
            this.h.setVisibility(8);
            View view3 = this.f;
            if (view3 == null) {
                return;
            }
            view3.setBackgroundResource(R.color.taolive_anchor_transparent_bg);
        } else if (i != 4) {
        } else {
            this.g.setText("主播网络异常，看看其他主播吧");
            this.h.setVisibility(8);
            View view4 = this.f;
            if (view4 == null) {
                return;
            }
            view4.setBackgroundResource(R.color.taolive_anchor_transparent_bg);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.component.a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    @Override // com.taobao.taolive.sdk.ui.component.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = true;
        }
    }

    @Override // com.taobao.taolive.sdk.ui.component.a
    public void a(PlayerErrorState playerErrorState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954470f7", new Object[]{this, playerErrorState});
            return;
        }
        this.f21922a = playerErrorState;
        q.b("VideoFrameErrorController", "changePlayerState state:" + playerErrorState);
    }

    @Override // com.taobao.taolive.sdk.ui.component.a
    public void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
        } else {
            this.b = tBLiveDataModel;
        }
    }

    @Override // com.taobao.taolive.sdk.ui.component.a
    public void c() {
        TBLiveDataModel tBLiveDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.d || (tBLiveDataModel = this.b) == null || tBLiveDataModel.mVideoInfo == null || this.b.mVideoInfo.roomStatus == null || !StringUtils.equals(this.b.mVideoInfo.roomStatus, "2")) {
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("feed_type", "live");
            hashMap.put("live_status", "4");
            if (phg.a() == null) {
                return;
            }
            phg.a().a("live_status_expo", hashMap);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.component.a
    public View d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this}) : this.l;
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        switch (message.what) {
            case 998:
                this.j.sendEmptyMessageDelayed(1000, 1000L);
                this.i.setText("1s后进入下一个直播间");
                return;
            case 999:
                this.j.sendEmptyMessageDelayed(998, 1000L);
                this.i.setText("2s后进入下一个直播间");
                return;
            case 1000:
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("slide_type", "automatic");
                if (phg.a() != null) {
                    phg.a().a(this.k, "upDown_switch-exp", hashMap);
                }
                TBLiveDataModel tBLiveDataModel = this.b;
                String str = (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) ? "" : this.b.mVideoInfo.liveId;
                TextView textView = this.i;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                String str2 = null;
                if (as.k() && (this.k.z() instanceof e) && ((e) this.k.z()).D) {
                    ddw a2 = ddw.a();
                    com.taobao.alilive.aliliveframework.frame.a aVar = this.k;
                    if (aVar != null) {
                        str2 = aVar.G();
                    }
                    a2.a(xkw.EVENT_NEGATIVE_FEEDBACK, str, str2);
                    return;
                }
                ddw a3 = ddw.a();
                com.taobao.alilive.aliliveframework.frame.a aVar2 = this.k;
                if (aVar2 != null) {
                    str2 = aVar2.G();
                }
                a3.a(EVENT_AUTO_DOWN, str, str2);
                return;
            default:
                return;
        }
    }
}
