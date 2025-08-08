package com.taobao.avplayer.playercontrol;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.as;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.common.o;
import com.taobao.avplayer.core.protocol.DWInteractiveVideoObject;
import com.taobao.avplayer.playercontrol.hiv.OpenUrlSpecialDTO;
import com.taobao.avplayer.playercontrol.hiv.OpenUrlSpecialForAlarmActivity;
import com.taobao.avplayer.playercontrol.hiv.i;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kcl;
import tb.kcp;
import tb.kge;

/* loaded from: classes6.dex */
public class i implements aw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f16598a;
    private DWContext c;
    private ImageView d;
    private ImageView e;
    private ImageView f;
    private com.taobao.avplayer.playercontrol.hiv.i g;
    private com.taobao.avplayer.common.c h;
    private TextView i;
    private FrameLayout j;
    private String k;
    private String l;
    private int o;
    private int p;
    private View q;
    private o r;
    private TextView s;
    private boolean b = false;
    private boolean m = true;
    private boolean n = true;

    static {
        kge.a(-1174747194);
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

    public static /* synthetic */ o a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("f7962dcb", new Object[]{iVar}) : iVar.r;
    }

    public static /* synthetic */ void a(i iVar, String str, String str2, String str3, Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9685b27", new Object[]{iVar, str, str2, str3, map, map2});
        } else {
            iVar.a(str, str2, str3, map, map2);
        }
    }

    public static /* synthetic */ DWContext b(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWContext) ipChange.ipc$dispatch("5fbea8e3", new Object[]{iVar}) : iVar.c;
    }

    public static /* synthetic */ com.taobao.avplayer.common.c c(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.common.c) ipChange.ipc$dispatch("bded92d9", new Object[]{iVar}) : iVar.h;
    }

    public static /* synthetic */ View d(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f0049508", new Object[]{iVar}) : iVar.q;
    }

    public static /* synthetic */ int e(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("500f758", new Object[]{iVar})).intValue() : iVar.o;
    }

    public static /* synthetic */ int f(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c662c77", new Object[]{iVar})).intValue() : iVar.p;
    }

    public static /* synthetic */ String g(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("545fad5d", new Object[]{iVar}) : iVar.k;
    }

    public i(DWContext dWContext) {
        this.c = dWContext;
        f();
        DWContext dWContext2 = this.c;
        if (dWContext2 != null && dWContext2.getVideo() != null) {
            this.c.getVideo().b(this);
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_DWTopBarController);
    }

    public void a(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4108e726", new Object[]{this, oVar});
        } else {
            this.r = oVar;
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f16598a = (ViewGroup) LayoutInflater.from(this.c.getActivity()).inflate(R.layout.tbavsdk_video_top_controller, (ViewGroup) null, false);
        this.e = (ImageView) this.f16598a.findViewById(R.id.dw_controller_back_bt);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (i.a(i.this) != null && i.a(i.this).a()) {
                } else {
                    i.b(i.this).handleKeyBack();
                }
            }
        });
        this.f = (ImageView) this.f16598a.findViewById(R.id.video_controller_close);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.i.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (i.c(i.this) != null && i.c(i.this).a()) {
                } else {
                    i.b(i.this).getVideo().m();
                    i.this.c(false);
                }
            }
        });
        this.d = (ImageView) this.f16598a.findViewById(R.id.hiv_top_menu_btn);
        this.d.setVisibility(0);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.i.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (i.d(i.this) == null) {
                } else {
                    i.d(i.this).setVisibility(0);
                }
            }
        });
        this.j = (FrameLayout) this.f16598a.findViewById(R.id.dw_event_view_container);
        DWContext dWContext = this.c;
        if (com.taobao.avplayer.playercontrol.hiv.a.a(dWContext, dWContext.getReportShown(), this.c.getReportFullScreenShown(), this.c.getOrangeReportShown())) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
        if (this.g == null) {
            this.g = new com.taobao.avplayer.playercontrol.hiv.i(this.c.getActivity(), this.c);
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1002);
            this.g.a(new i.a() { // from class: com.taobao.avplayer.playercontrol.i.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.playercontrol.hiv.i.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    com.taobao.avplayer.playercontrol.hiv.j.a(i.b(i.this), "Report", com.taobao.avplayer.playercontrol.hiv.j.b(i.b(i.this), null));
                    final String str = "http://h5.m.taobao.com/app/baqcenter/index.html?source=207&progress=" + String.valueOf(i.e(i.this)) + ";" + String.valueOf(i.f(i.this)) + "&from=" + i.b(i.this).mFrom + "&videoId=" + i.b(i.this).getVideoId() + "#videoReport";
                    Intent intent = new Intent(i.b(i.this).getActivity(), OpenUrlSpecialForAlarmActivity.class);
                    OpenUrlSpecialDTO openUrlSpecialDTO = new OpenUrlSpecialDTO();
                    com.taobao.avplayer.playercontrol.hiv.b bVar = new com.taobao.avplayer.playercontrol.hiv.b() { // from class: com.taobao.avplayer.playercontrol.i.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.avplayer.playercontrol.hiv.b
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            com.taobao.avplayer.common.f dWEventAdapter = i.b(i.this).getDWEventAdapter();
                            if (dWEventAdapter == null) {
                                return;
                            }
                            dWEventAdapter.a(str);
                        }
                    };
                    OpenUrlSpecialDTO.callbackWeakReference = new WeakReference<>(bVar);
                    intent.putExtra("dto", openUrlSpecialDTO);
                    try {
                        i.b(i.this).getActivity().startActivity(intent);
                        OpenUrlSpecialDTO.callbackWeakReference = new WeakReference<>(bVar);
                    } catch (Throwable th) {
                        i.b(i.this).mTlogAdapter.a("start report activity error:" + th);
                    }
                }
            });
            this.g.a(arrayList);
        }
        this.q = this.g.c();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        this.f16598a.addView(this.g.c(), layoutParams);
        this.q.setVisibility(4);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.q.getVisibility() == 0) {
            this.q.setVisibility(8);
        }
        if (z) {
            FrameLayout frameLayout = this.j;
            if (frameLayout != null && this.n && this.m) {
                frameLayout.setVisibility(0);
            }
            DWContext dWContext = this.c;
            if (com.taobao.avplayer.playercontrol.hiv.a.a(dWContext, dWContext.getReportShown(), this.c.getReportFullScreenShown(), this.c.getOrangeReportShown())) {
                this.d.setVisibility(0);
                return;
            } else {
                this.d.setVisibility(8);
                return;
            }
        }
        this.j.setVisibility(8);
        this.d.setVisibility(8);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.n = true;
        FrameLayout frameLayout = this.j;
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
        FrameLayout frameLayout = this.j;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.c.getActivity());
        linearLayout.setOrientation(0);
        this.i = new TextView(this.c.getActivity());
        this.i.setTextSize(1, 14.0f);
        this.i.setBackgroundResource(R.drawable.dw_goshop_background);
        this.i.setTextColor(this.c.getActivity().getResources().getColor(R.color.dw_interactive_sdk_white));
        Drawable drawable = this.c.getActivity().getResources().getDrawable(R.drawable.dw_goshop_icon);
        drawable.setBounds(0, 0, kcl.a(this.c.getActivity(), 14.0f), kcl.a(this.c.getActivity(), 14.0f));
        kcp kcpVar = new kcp(drawable);
        SpannableString spannableString = new SpannableString("    进店");
        spannableString.setSpan(kcpVar, 0, 4, 17);
        this.i.setText(spannableString);
        this.i.setGravity(17);
        this.i.setPadding(kcl.a(this.c.getActivity(), 4.0f), kcl.a(this.c.getActivity(), 2.0f), kcl.a(this.c.getActivity(), 4.0f), kcl.a(this.c.getActivity(), 2.0f));
        this.s = new TextView(this.c.getActivity());
        this.s.setEllipsize(StringUtils.TruncateAt.END);
        this.s.setMaxLines(1);
        this.s.setMaxEms(12);
        this.s.setText(this.l);
        this.s.setSingleLine(true);
        this.s.setTextSize(1, 14.0f);
        this.s.setTextColor(this.c.getActivity().getResources().getColor(R.color.dw_interactive_sdk_white));
        this.s.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        linearLayout.addView(this.s, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, kcl.a(this.c.getActivity(), 24.0f));
        layoutParams2.leftMargin = kcl.a(this.c.getActivity(), 6.0f);
        layoutParams2.gravity = 16;
        linearLayout.addView(this.i, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, kcl.a(this.c.getActivity(), 24.0f));
        layoutParams2.gravity = 16;
        this.j.addView(linearLayout, layoutParams3);
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.i.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (i.b(i.this).getDWEventAdapter() == null || i.g(i.this) == null) {
                } else {
                    i.b(i.this).getDWEventAdapter().a(i.g(i.this));
                    HashMap hashMap = new HashMap();
                    hashMap.put("interact_object_type", "shop");
                    hashMap.put("actionResult", ALBiometricsActivityParentView.n);
                    i iVar = i.this;
                    i.a(iVar, "DWVideo", "Button", "videoShowInteract", i.b(iVar).getUTParams(), hashMap);
                }
            }
        });
    }

    public void a(DWInteractiveVideoObject dWInteractiveVideoObject) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79529c5f", new Object[]{this, dWInteractiveVideoObject});
        } else if (dWInteractiveVideoObject == null || !"shop".equals(dWInteractiveVideoObject.getShowType()) || StringUtils.isEmpty(dWInteractiveVideoObject.getEnterShopUrl())) {
        } else {
            this.l = dWInteractiveVideoObject.getUserName();
            g();
            this.k = dWInteractiveVideoObject.getEnterShopUrl();
            FrameLayout frameLayout = this.j;
            if (!this.m || !this.n) {
                i = 8;
            }
            frameLayout.setVisibility(i);
            HashMap hashMap = new HashMap();
            hashMap.put("interact_object_type", "shop");
            a("Page_DWVideo_Button-videoShowInteract", "expose", null, this.c.getUTParams(), hashMap);
        }
    }

    public void a(com.taobao.avplayer.common.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410372b2", new Object[]{this, cVar});
        } else {
            this.h = cVar;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f16598a.setVisibility(8);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f16598a.setVisibility(0);
        }
    }

    public View e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("42261fae", new Object[]{this}) : this.f16598a;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if ((this.f == null || this.b) && !z) {
        } else {
            this.b = false;
            if (this.c.screenType() != DWVideoScreenType.NORMAL) {
                return;
            }
            this.f.setVisibility(0);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (this.b) {
        } else {
            ImageView imageView = this.f;
            if (imageView != null && imageView.getVisibility() != 4) {
                this.f.setVisibility(4);
            }
            ImageView imageView2 = this.d;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                this.d.setVisibility(4);
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
        this.m = z;
        if (z && this.m && this.n && (!StringUtils.isEmpty(this.k) || !StringUtils.isEmpty(this.l))) {
            this.j.setVisibility(0);
        } else {
            this.j.setVisibility(8);
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
            if (!this.c.isMute()) {
                this.e.setVisibility(0);
            }
            try {
                this.f16598a.setBackgroundResource(R.drawable.dw_notify_bar_bg);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        this.e.setVisibility(8);
        this.f16598a.setBackgroundColor(0);
    }

    private void a(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ec7726", new Object[]{this, str, str2, str3, map, map2});
            return;
        }
        as asVar = this.c.mUTAdapter;
        if (asVar == null) {
            return;
        }
        asVar.a(str, str2, str3, map, map2);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.s;
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
        com.taobao.avplayer.playercontrol.hiv.i iVar = this.g;
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
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        } else if (dWVideoScreenType == DWVideoScreenType.LANDSCAPE_FULL_SCREEN || (imageView = this.d) == null || imageView.getVisibility() != 0) {
        } else {
            this.d.setVisibility(8);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.o = i;
        this.p = i3;
    }
}
