package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.utils.o;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.pfl;

/* loaded from: classes8.dex */
public class pfr implements PlayerController2.b, PlayerController2.c, PlayerController2.d, PlayerController2.e, pfl.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView c;
    private List<LiveItem.TimeMovingLabelInfos> d;
    private com.taobao.alilive.aliliveframework.frame.a e;
    private String h;
    private pfl i;
    private VideoFrame2 j;
    private LiveItem.TimeMovingLabelInfos k;
    private boolean l;

    /* loaded from: classes8.dex */
    public interface a {
        void a(Object obj);
    }

    static {
        kge.a(1884779213);
        kge.a(2144175604);
        kge.a(-1827108764);
        kge.a(723380708);
        kge.a(-2007539546);
        kge.a(-640105246);
    }

    @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.e
    public void onStopTrackingTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95d1c6", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.b
    public void onPlayProgress(long j) {
        List<LiveItem.TimeMovingLabelInfos> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b7f5a1d", new Object[]{this, new Long(j)});
        } else if (this.i == null || (list = this.d) == null || list.size() <= 0) {
        } else {
            if (this.k == null || (j < this.d.get(0).oppsTime && this.k != this.d.get(0))) {
                c();
            }
            if (j < this.k.oppsTime || this.l) {
                return;
            }
            a(this.k, false);
        }
    }

    @Override // tb.pfl.a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        List<LiveItem.TimeMovingLabelInfos> list = this.d;
        if (list == null || list.get(i) == null) {
            return;
        }
        a(this.d.get(i), true);
    }

    private void a(LiveItem.TimeMovingLabelInfos timeMovingLabelInfos, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d17a597", new Object[]{this, timeMovingLabelInfos, new Boolean(z)});
            return;
        }
        pfl pflVar = this.i;
        if (pflVar == null || this.c == null || this.d == null) {
            return;
        }
        pflVar.a(timeMovingLabelInfos.hashCode());
        this.i.notifyDataSetChanged();
        int indexOf = this.d.indexOf(timeMovingLabelInfos);
        if (indexOf < 0) {
            return;
        }
        if (z) {
            if (this.j != null && timeMovingLabelInfos.oppsTime >= 0) {
                this.j.seekTo(timeMovingLabelInfos.oppsTime);
                o.a(this.e, 19999, "timeshiftSeekToByStruct", (Map<String, String>) null);
                if (!this.j.isPlaying()) {
                    this.j.resumePlay();
                }
            }
        } else {
            this.c.smoothScrollToPosition(indexOf);
        }
        if (indexOf < this.d.size() - 1) {
            this.k = this.d.get(indexOf + 1);
            this.l = false;
            return;
        }
        List<LiveItem.TimeMovingLabelInfos> list = this.d;
        this.k = list.get(list.size() - 1);
        this.l = true;
    }

    private void c() {
        pfl pflVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        List<LiveItem.TimeMovingLabelInfos> list = this.d;
        if (list == null || list.size() <= 0 || (pflVar = this.i) == null || this.c == null) {
            return;
        }
        pflVar.a(-1);
        this.i.notifyDataSetChanged();
        this.c.smoothScrollToPosition(0);
        this.k = this.d.get(0);
        this.l = false;
    }

    @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.e
    public void onStopTrackingTouch(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8624ddbe", new Object[]{this, new Boolean(z), new Long(j)});
        } else if (!z) {
        } else {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("item_id", this.h);
                hashMap.put("dianjijiaohu_type", String.valueOf(2));
                o.a(this.e, "jichujiaohu_dianji", (Map<String, String>) hashMap);
            } catch (Exception unused) {
            }
            int a2 = a(j);
            List<LiveItem.TimeMovingLabelInfos> list = this.d;
            if (list == null) {
                return;
            }
            if (a2 >= list.size()) {
                if (a2 != this.d.size()) {
                    return;
                }
                a(this.d.get(a2 - 1), false);
            } else if (a2 > 0) {
                a(this.d.get(a2 - 1), false);
            } else {
                c();
            }
        }
    }

    private int a(long j) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821974f", new Object[]{this, new Long(j)})).intValue();
        }
        List<LiveItem.TimeMovingLabelInfos> list = this.d;
        if (list != null && list.size() > 0) {
            int size = this.d.size() - 1;
            while (i <= size) {
                int i2 = (i + size) / 2;
                if (this.d.size() > i2) {
                    if (this.d.get(i2).oppsTime > j) {
                        size = i2 - 1;
                    } else if (this.d.get(i2).oppsTime <= j) {
                        i = i2 + 1;
                    }
                }
            }
        }
        return i;
    }

    @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            VideoInfo u = poy.u(this.e);
            HashMap hashMap = new HashMap();
            hashMap.put("item_id", this.h);
            hashMap.put("entrySpm", poy.T(this.e));
            hashMap.put("entryLiveSource", poy.R(this.e));
            hashMap.put("spm-url", poy.K(this.e));
            hashMap.put("jiangjie_ID", poy.C(this.e));
            if (u != null) {
                hashMap.put("feed_id", u.liveId);
                hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(u.status));
                if (u.broadCaster != null) {
                    hashMap.put("account_id", u.broadCaster.accountId);
                }
            }
            hashMap.put("spm-cnt", o.c(this.e));
            o.a(this.e, 19999, "livestart", hashMap);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        VideoInfo u = poy.u(this.e);
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", this.h);
        hashMap.put("entrySpm", poy.T(this.e));
        hashMap.put("entryLiveSource", poy.R(this.e));
        hashMap.put("spm-url", poy.K(this.e));
        hashMap.put("jiangjie_ID", poy.C(this.e));
        if (u != null) {
            hashMap.put("feed_id", u.liveId);
            hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(u.status));
            if (u.broadCaster != null) {
                hashMap.put("account_id", u.broadCaster.accountId);
            }
        }
        hashMap.put("spm-cnt", o.c(this.e));
        o.a(this.e, 19999, "livefinished", hashMap);
    }
}
