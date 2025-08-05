package com.taobao.avplayer.playercontrol;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class f implements View.OnClickListener, aw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final float[] d;

    /* renamed from: a  reason: collision with root package name */
    public DWContext f16571a;
    private FrameLayout b;
    private TextView c;
    private int e = 0;
    private j f;

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        }
    }

    static {
        kge.a(1406326012);
        kge.a(-123403623);
        kge.a(-1201612728);
        d = new float[]{1.0f, 1.5f, 0.8f};
    }

    public f(DWContext dWContext, FrameLayout frameLayout) {
        this.f16571a = dWContext;
        this.b = frameLayout;
        a();
        DWContext dWContext2 = this.f16571a;
        if (dWContext2 == null || dWContext2.getVideo() == null) {
            return;
        }
        this.f16571a.getVideo().b(this);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        DWContext dWContext = this.f16571a;
        if (dWContext == null || dWContext.getVideo() == null || this.b == null || this.f16571a.mPlayContext.getPlayerType() == 2 || !this.f16571a.isPlayRateBtnEnable()) {
            return;
        }
        this.c = (TextView) this.b.findViewById(R.id.video_controller_playrate_icon);
        if (this.c == null) {
            return;
        }
        if (this.f16571a.mShowPlayRate) {
            this.c.setVisibility(0);
            this.c.setOnClickListener(this);
            return;
        }
        this.c.setVisibility(8);
    }

    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76c9748", new Object[]{this, jVar});
        } else {
            this.f = jVar;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        float[] fArr = d;
        int length = (this.e + 1) % fArr.length;
        float f = fArr[length];
        j jVar = this.f;
        if (jVar != null) {
            z = jVar.onPlayRateChanged(f);
        }
        if (!z) {
            return;
        }
        this.e = length;
        int i = this.e;
        if (i == 0) {
            this.c.setText(R.string.tbavsdk_playrate_normal);
        } else if (i == 1) {
            this.c.setText(R.string.tbavsdk_playrate_high);
        } else if (i == 2) {
            this.c.setText(R.string.tbavsdk_playrate_low);
        }
        DWContext dWContext = this.f16571a;
        if (dWContext == null || dWContext.mUTAdapter == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("speed", String.valueOf(f));
        hashMap.put("mute", this.f16571a.isMute() ? "true" : "false");
        this.f16571a.mUTAdapter.a("DWVideo", "Button", "videospeed", this.f16571a.getUTParams(), hashMap);
    }
}
