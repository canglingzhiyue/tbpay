package com.taobao.avplayer.playercontrol.hiv;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.common.o;
import com.taobao.avplayer.interactivelifecycle.hiv.request.ContentDetailData;
import com.taobao.avplayer.playercontrol.hiv.i;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import tb.kcl;
import tb.kge;

/* loaded from: classes6.dex */
public class e implements aw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f16585a;
    private DWContext c;
    private ImageView d;
    private ImageView e;
    private com.taobao.avplayer.common.c f;
    private FrameLayout g;
    private TextView h;
    private View i;
    private TextView j;
    private String k;
    private String l;
    private ContentDetailData o;
    private o p;
    private RelativeLayout q;
    private ImageView r;
    private i s;
    private View t;
    private int u;
    private int v;
    private boolean b = false;
    private boolean m = true;
    private boolean n = true;

    static {
        kge.a(1909618716);
        kge.a(-123403623);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
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

    public static /* synthetic */ o a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("272d32cd", new Object[]{eVar}) : eVar.p;
    }

    public static /* synthetic */ DWContext b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWContext) ipChange.ipc$dispatch("e2d4bca1", new Object[]{eVar}) : eVar.c;
    }

    public static /* synthetic */ com.taobao.avplayer.common.c c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.common.c) ipChange.ipc$dispatch("8e8986db", new Object[]{eVar}) : eVar.f;
    }

    public static /* synthetic */ String d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7510659c", new Object[]{eVar}) : eVar.k;
    }

    public static /* synthetic */ ContentDetailData e(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContentDetailData) ipChange.ipc$dispatch("7769a489", new Object[]{eVar}) : eVar.o;
    }

    public static /* synthetic */ int f(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("77a022b5", new Object[]{eVar})).intValue() : eVar.u;
    }

    public static /* synthetic */ int g(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3117b054", new Object[]{eVar})).intValue() : eVar.v;
    }

    public static /* synthetic */ View h(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f0fa5642", new Object[]{eVar}) : eVar.t;
    }

    public static /* synthetic */ i i(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("4a8ad61a", new Object[]{eVar}) : eVar.s;
    }

    public e(DWContext dWContext) {
        this.c = dWContext;
        f();
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_HivTopBarController);
    }

    public void a(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4108e726", new Object[]{this, oVar});
        } else {
            this.p = oVar;
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f16585a = (ViewGroup) LayoutInflater.from(this.c.getActivity()).inflate(R.layout.tbavsdk_hiv_video_top_controller, (ViewGroup) null, false);
        this.d = (ImageView) this.f16585a.findViewById(R.id.dw_controller_back_bt);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.hiv.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (e.a(e.this) != null && e.a(e.this).a()) {
                } else {
                    e.b(e.this).handleKeyBack();
                }
            }
        });
        this.e = (ImageView) this.f16585a.findViewById(R.id.video_controller_close);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.hiv.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (e.c(e.this) != null && e.c(e.this).a()) {
                } else {
                    e.b(e.this).getVideo().m();
                    e.this.c(false);
                }
            }
        });
        this.g = (FrameLayout) this.f16585a.findViewById(R.id.dw_event_view_container);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            FrameLayout frameLayout = this.g;
            if (frameLayout == null || !this.n || !this.m) {
                return;
            }
            frameLayout.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.n = true;
        FrameLayout frameLayout = this.g;
        if (frameLayout == null || !this.m) {
            return;
        }
        frameLayout.setVisibility(0);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.n = false;
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    public void a(final ContentDetailData contentDetailData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19dc05de", new Object[]{this, contentDetailData});
        } else if (contentDetailData == null) {
        } else {
            this.o = contentDetailData;
            View inflate = LayoutInflater.from(this.c.getActivity()).inflate(R.layout.dw_hiv_player_control_top_bar_full_screen, this.g);
            this.q = (RelativeLayout) inflate.findViewById(R.id.rl_player_control_top_bar_btn_group_container);
            this.h = (TextView) this.q.findViewById(R.id.tv_player_control_top_bar_enter_shop);
            this.j = (TextView) this.q.findViewById(R.id.tv_player_control_top_bar_user_nick);
            this.i = inflate.findViewById(R.id.ll_player_control_top_bar_enter_shop);
            this.r = (ImageView) inflate.findViewById(R.id.img_player_control_video_ext_data_share);
            this.r.setOnClickListener(new a());
            this.g.setVisibility((!this.m || !this.n) ? 8 : 0);
            if (contentDetailData.talentInfo != null && !StringUtils.isEmpty(contentDetailData.talentInfo.nick)) {
                this.l = contentDetailData.talentInfo.nick;
            }
            if (contentDetailData.shopInfo != null && !StringUtils.isEmpty(contentDetailData.shopInfo.shopUrl)) {
                this.l = contentDetailData.shopInfo.shopTitle;
                this.k = contentDetailData.shopInfo.shopUrl;
                this.h.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.hiv.e.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (e.b(e.this).getDWEventAdapter() == null || e.d(e.this) == null) {
                        } else {
                            e.b(e.this).getDWEventAdapter().a(e.d(e.this));
                            Map<String, String> b = j.b(e.b(e.this), e.e(e.this));
                            b.put("seller_id", contentDetailData.userId);
                            j.a(e.b(e.this), "fullGoShop", b);
                        }
                    }
                });
                this.i.setVisibility(0);
            }
            this.j.setText(this.l);
            if (this.s == null) {
                this.s = new i(this.c.getActivity(), this.c);
                this.s.a(this.o);
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(1001);
                arrayList.add(1002);
                this.s.a(arrayList);
                this.s.a(new i.a() { // from class: com.taobao.avplayer.playercontrol.hiv.e.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.avplayer.playercontrol.hiv.i.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        j.a(e.b(e.this), "Report", j.b(e.b(e.this), null));
                        e.b(e.this).getHivEventAdapter();
                        final String str = "http://h5.m.taobao.com/app/baqcenter/index.html?source=207&progress=" + String.valueOf(e.f(e.this)) + ";" + String.valueOf(e.g(e.this)) + "&from=" + e.b(e.this).mFrom + "&videoId=" + e.b(e.this).getVideoId() + "#videoReport";
                        Intent intent = new Intent(e.b(e.this).getActivity(), OpenUrlSpecialForAlarmActivity.class);
                        OpenUrlSpecialDTO openUrlSpecialDTO = new OpenUrlSpecialDTO();
                        b bVar = new b() { // from class: com.taobao.avplayer.playercontrol.hiv.e.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.avplayer.playercontrol.hiv.b
                            public void a() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                    return;
                                }
                                com.taobao.avplayer.common.f dWEventAdapter = e.b(e.this).getDWEventAdapter();
                                if (dWEventAdapter == null) {
                                    return;
                                }
                                dWEventAdapter.a(str);
                            }
                        };
                        OpenUrlSpecialDTO.callbackWeakReference = new WeakReference<>(bVar);
                        intent.putExtra("dto", openUrlSpecialDTO);
                        try {
                            e.b(e.this).getActivity().startActivity(intent);
                            OpenUrlSpecialDTO.callbackWeakReference = new WeakReference<>(bVar);
                        } catch (Throwable th) {
                            e.b(e.this).mTlogAdapter.a("start report activity error:" + th);
                        }
                    }
                });
            }
            this.t = this.s.c();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 5;
            layoutParams.setMargins(0, kcl.a(this.c.getActivity(), 30.0f), 0, 0);
            this.f16585a.addView(this.s.c(), layoutParams);
            this.t.setVisibility(4);
        }
    }

    public void a(com.taobao.avplayer.common.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410372b2", new Object[]{this, cVar});
        } else {
            this.f = cVar;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f16585a.setVisibility(8);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f16585a.setVisibility(0);
        }
    }

    public View e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("42261fae", new Object[]{this}) : this.f16585a;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if ((this.e == null || this.b) && !z) {
        } else {
            this.b = false;
            if (this.c.screenType() != DWVideoScreenType.NORMAL) {
                return;
            }
            this.e.setVisibility(0);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (this.b) {
        } else {
            ImageView imageView = this.e;
            if (imageView != null && imageView.getVisibility() != 4) {
                this.e.setVisibility(4);
            }
            this.b = z;
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.t;
        if (view != null && view.getVisibility() == 0) {
            this.t.setVisibility(8);
        }
        this.m = z;
        if (z && this.m && this.n && (!StringUtils.isEmpty(this.k) || !StringUtils.isEmpty(this.l))) {
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.c.screenType() != DWVideoScreenType.NORMAL && (this.c.getVideo().t() == 4 || this.c.getVideo().t() == 3)) {
            z = true;
        }
        if (z) {
            this.d.setVisibility(0);
            this.f16585a.setBackgroundResource(R.drawable.dw_notify_bar_bg);
            return;
        }
        this.d.setVisibility(8);
        this.f16585a.setBackgroundColor(0);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.j;
        if (textView == null) {
            return;
        }
        textView.setMaxEms(i);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        i iVar = this.s;
        if (iVar == null) {
            return;
        }
        try {
            iVar.d();
        } catch (Throwable th) {
            this.c.mTlogAdapter.a(th.toString());
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.u = i;
        this.v = i3;
    }

    /* loaded from: classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-895902990);
            kge.a(-1201612728);
        }

        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (e.h(e.this) == null) {
            } else {
                e.h(e.this).setVisibility(0);
                if (com.taobao.avplayer.playercontrol.hiv.a.a(e.b(e.this), e.b(e.this).getReportShown(), e.b(e.this).getReportFullScreenShown(), e.b(e.this).getOrangeReportShown())) {
                    e.i(e.this).b();
                } else {
                    e.i(e.this).a();
                }
            }
        }
    }
}
