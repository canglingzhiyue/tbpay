package tb;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.utils.o;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import com.taobao.taolive.sdk.ui.media.playercontrol.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.pfr;

/* loaded from: classes8.dex */
public class pgh implements PlayerController2.b, PlayerController2.c, PlayerController2.d, PlayerController2.e, pgi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    public View f32627a;
    public PlayerController2 b;
    public String c;
    private Context d;
    private List<LiveItem.TimeMovingLabelInfos> e;
    private pgg f;
    private RecyclerView g;
    private pgj h;
    private LiveItem.TimeMovingLabelInfos i;
    private boolean j;
    private VideoFrame2 k;
    private a l;

    @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.e
    public void onStopTrackingTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95d1c6", new Object[]{this, new Boolean(z)});
        }
    }

    public static /* synthetic */ a a(pgh pghVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("60e0f81c", new Object[]{pghVar}) : pghVar.l;
    }

    public static /* synthetic */ List a(pgh pghVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1f4bf86f", new Object[]{pghVar, list});
        }
        pghVar.e = list;
        return list;
    }

    public static /* synthetic */ List b(pgh pghVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d1babedf", new Object[]{pghVar}) : pghVar.e;
    }

    public static /* synthetic */ RecyclerView c(pgh pghVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("5e04f7bb", new Object[]{pghVar}) : pghVar.g;
    }

    public static /* synthetic */ pgj d(pgh pghVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pgj) ipChange.ipc$dispatch("a0a780e9", new Object[]{pghVar}) : pghVar.h;
    }

    static {
        kge.a(1528849580);
        kge.a(409727702);
        kge.a(2144175604);
        kge.a(-1827108764);
        kge.a(-2007539546);
        kge.a(-640105246);
        TAG = pgh.class.getSimpleName();
    }

    public pgh(Context context, pgg pggVar, String str, a aVar) {
        this.l = aVar;
        this.d = context;
        this.f = pggVar;
        a(str);
        d();
        c();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.f32627a = LayoutInflater.from(this.d).inflate(R.layout.taolive_highligt_dx_timeshift_struct_list, (ViewGroup) null);
        this.g = (RecyclerView) this.f32627a.findViewById(R.id.taolive_higlight_dx_timeshift_struct_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.d);
        linearLayoutManager.setOrientation(0);
        this.g.setLayoutManager(linearLayoutManager);
        this.e = pfy.a(str);
        this.h = new pgj(this.d, this.e, this, this.c, this.l);
        this.h.a(this.e);
        this.g.setAdapter(this.h);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        pgf b = pfb.a(this.l).b();
        if (b == null || b.c == null) {
            return;
        }
        this.k = b.c;
        this.c = b.f32625a;
        this.b = this.k.getPlayerController();
        PlayerController2 playerController2 = this.b;
        if (playerController2 == null) {
            return;
        }
        playerController2.setPlayProgressListener(this);
        this.b.setSeekStopTrackingListener(this);
        this.b.setPlayerStatusListener(this);
        this.b.setmPlayStartOrCompletionListener(this);
        this.b.setPlayRateListener(new c() { // from class: tb.pgh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.playercontrol.c
            public boolean a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("item_id", pgh.this.c);
                    hashMap.put("dianjijiaohu_type", String.valueOf(2));
                    o.a(pgh.a(pgh.this), "jichujiaohu_view", (Map<String, String>) hashMap);
                } catch (Exception unused) {
                }
                return false;
            }
        });
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            pfb.a(this.l).a(new pfr.a() { // from class: tb.pgh.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pfr.a
                public void a(Object obj) {
                    pgh pghVar;
                    List<LiveItem.TimeMovingLabelInfos> list;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                    } else if (!(obj instanceof LiveItem.TimeMovingPlayInfo)) {
                    } else {
                        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) obj;
                        if (!TextUtils.isEmpty(timeMovingPlayInfo.itemId)) {
                            pgh.this.c = timeMovingPlayInfo.itemId;
                        }
                        pgh.a(pgh.this, (List) null);
                        if (com.taobao.taolive.movehighlight.utils.c.a() && timeMovingPlayInfo.spfPlayVideo != null) {
                            if (timeMovingPlayInfo.spfPlayVideo.timeMovingLabelInfos != null && timeMovingPlayInfo.spfPlayVideo.timeMovingLabelInfos.size() > 0) {
                                pghVar = pgh.this;
                                list = timeMovingPlayInfo.spfPlayVideo.timeMovingLabelInfos;
                                pgh.a(pghVar, list);
                            }
                            if (pgh.b(pgh.this) != null) {
                            }
                            pgh.c(pgh.this).setVisibility(8);
                        }
                        if (com.taobao.taolive.movehighlight.utils.c.a() && timeMovingPlayInfo.timeMovingLabelInfos != null) {
                            pghVar = pgh.this;
                            list = timeMovingPlayInfo.timeMovingLabelInfos;
                            pgh.a(pghVar, list);
                        }
                        if (pgh.b(pgh.this) != null || pgh.b(pgh.this).size() == 0) {
                            pgh.c(pgh.this).setVisibility(8);
                        } else {
                            new Handler().post(new Runnable() { // from class: tb.pgh.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    pgh.c(pgh.this).setVisibility(0);
                                    if (pgh.d(pgh.this) == null) {
                                        return;
                                    }
                                    Collections.sort(pgh.b(pgh.this));
                                    pgh.d(pgh.this).a(pgh.b(pgh.this));
                                    pgh.d(pgh.this).notifyDataSetChanged();
                                }
                            });
                        }
                    }
                }
            });
        }
    }

    @Override // tb.pgi
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        List<LiveItem.TimeMovingLabelInfos> list = this.e;
        if (list == null || list.get(i) == null) {
            return;
        }
        a(this.e.get(i), true);
    }

    @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.b
    public void onPlayProgress(long j) {
        List<LiveItem.TimeMovingLabelInfos> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b7f5a1d", new Object[]{this, new Long(j)});
        } else if (this.h == null || (list = this.e) == null || list.size() <= 0) {
        } else {
            if (this.i == null || (j < this.e.get(0).oppsTime && this.i != this.e.get(0))) {
                e();
            }
            if (j < this.i.oppsTime || this.j) {
                return;
            }
            a(this.i, false);
        }
    }

    private void e() {
        pgj pgjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        List<LiveItem.TimeMovingLabelInfos> list = this.e;
        if (list == null || list.size() <= 0 || (pgjVar = this.h) == null || this.g == null) {
            return;
        }
        pgjVar.a(-1);
        this.h.notifyDataSetChanged();
        this.g.smoothScrollToPosition(0);
        this.i = this.e.get(0);
        this.j = false;
    }

    private void a(LiveItem.TimeMovingLabelInfos timeMovingLabelInfos, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d17a597", new Object[]{this, timeMovingLabelInfos, new Boolean(z)});
            return;
        }
        pgj pgjVar = this.h;
        if (pgjVar == null || this.g == null || this.e == null) {
            return;
        }
        pgjVar.a(timeMovingLabelInfos.hashCode());
        this.h.notifyDataSetChanged();
        int indexOf = this.e.indexOf(timeMovingLabelInfos);
        if (indexOf < 0) {
            return;
        }
        if (z && this.k != null && timeMovingLabelInfos.oppsTime >= 0) {
            this.k.seekTo(timeMovingLabelInfos.oppsTime);
            o.a(this.l, 19999, "timeshiftSeekToByStruct", (Map<String, String>) null);
            if (!this.k.isPlaying()) {
                this.k.resumePlay();
            }
        }
        this.g.smoothScrollToPosition(indexOf);
        if (indexOf < this.e.size() - 1) {
            this.i = this.e.get(indexOf + 1);
            this.j = false;
            return;
        }
        List<LiveItem.TimeMovingLabelInfos> list = this.e;
        this.i = list.get(list.size() - 1);
        this.j = true;
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
                hashMap.put("item_id", this.c);
                hashMap.put("dianjijiaohu_type", String.valueOf(2));
                o.a(this.l, "jichujiaohu_dianji", (Map<String, String>) hashMap);
            } catch (Exception unused) {
            }
            int a2 = a(j);
            List<LiveItem.TimeMovingLabelInfos> list = this.e;
            if (list == null || list.size() <= 0) {
                return;
            }
            if (a2 >= this.e.size()) {
                if (a2 != this.e.size()) {
                    return;
                }
                a(this.e.get(a2 - 1), false);
            } else if (a2 > 0) {
                a(this.e.get(a2 - 1), false);
            } else {
                e();
            }
        }
    }

    private int a(long j) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821974f", new Object[]{this, new Long(j)})).intValue();
        }
        List<LiveItem.TimeMovingLabelInfos> list = this.e;
        if (list != null && list.size() > 0) {
            int size = this.e.size() - 1;
            while (i <= size) {
                int i2 = (i + size) / 2;
                if (this.e.size() > i2) {
                    if (this.e.get(i2).oppsTime > j) {
                        size = i2 - 1;
                    } else if (this.e.get(i2).oppsTime <= j) {
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
            VideoInfo u = poy.u(this.l);
            HashMap hashMap = new HashMap();
            hashMap.put("item_id", this.c);
            hashMap.put("entrySpm", poz.g(n.b(this.l)));
            hashMap.put("entryLiveSource", poz.f(n.b(this.l)));
            hashMap.put("spm-url", poz.a(n.b(this.l)));
            hashMap.put("jiangjie_ID", poy.C(this.l));
            if (u != null) {
                hashMap.put("feed_id", u.liveId);
                hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(u.status));
                if (u.broadCaster != null) {
                    hashMap.put("account_id", u.broadCaster.accountId);
                }
            }
            hashMap.put("spm-cnt", o.c(this.l));
            o.a(this.l, 19999, "livestart", hashMap);
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
        VideoInfo u = poy.u(this.l);
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", this.c);
        hashMap.put("entrySpm", poz.g(n.b(this.l)));
        hashMap.put("entryLiveSource", poz.f(n.b(this.l)));
        hashMap.put("spm-url", poz.a(n.b(this.l)));
        hashMap.put("jiangjie_ID", poy.C(this.l));
        if (u != null) {
            hashMap.put("feed_id", u.liveId);
            hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(u.status));
            if (u.broadCaster != null) {
                hashMap.put("account_id", u.broadCaster.accountId);
            }
        }
        hashMap.put("spm-cnt", o.c(this.l));
        o.a(this.l, 19999, "livefinished", hashMap);
    }
}
