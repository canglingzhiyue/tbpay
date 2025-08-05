package tb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager;
import com.taobao.android.detail2.core.mainpic.a;
import com.taobao.android.detail2.core.mainpic.b;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.fit;
import tb.pig;

/* loaded from: classes5.dex */
public class rbv extends pig<ovb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String f;
    public static phy g;
    private fit h;
    private View i;
    private View j;
    private fit.a k;

    public static /* synthetic */ Object ipc$super(rbv rbvVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ fit a(rbv rbvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fit) ipChange.ipc$dispatch("c4cd1383", new Object[]{rbvVar}) : rbvVar.h;
    }

    public static /* synthetic */ void a(rbv rbvVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd2b8c54", new Object[]{rbvVar, str, jSONObject});
        } else {
            rbvVar.a(str, jSONObject);
        }
    }

    @Override // tb.pig
    public /* synthetic */ void b(ovb ovbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e72dcfbf", new Object[]{this, ovbVar});
        } else {
            a(ovbVar);
        }
    }

    static {
        kge.a(477787692);
        f = "video";
        g = new phy() { // from class: tb.rbv.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.phy
            public pig a(ViewGroup viewGroup, a aVar, b.a aVar2, pig.a aVar3) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (pig) ipChange.ipc$dispatch("7d43a62a", new Object[]{this, viewGroup, aVar, aVar2, aVar3}) : new rbv((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.newdetail_media_container_layout, viewGroup, false), aVar, aVar2, aVar3);
            }
        };
    }

    public rbv(ViewGroup viewGroup, a aVar, b.a aVar2, pig.a aVar3) {
        super(viewGroup, aVar, aVar2, aVar3);
        this.k = new fit.a() { // from class: tb.rbv.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fit.a
            public void a(String str, JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
                } else {
                    rbv.a(rbv.this, str, jSONObject);
                }
            }

            @Override // tb.fit.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                fhi e = rbv.this.f32680a.e();
                if (e == null || rbv.this.d == 0) {
                    return;
                }
                if (e.f == 0 && ((ovb) rbv.this.d).d == 0 && !e.z && !((ovb) rbv.this.d).e) {
                    if (e.ai) {
                        fjt.a(fjt.TAG_TIP, "NdVideoSettingHelper: MainPic-视频未自动播放场景，不上报 FcpVideoReady 。");
                    } else {
                        com.taobao.android.detail2.core.framework.a f2 = rbv.this.f32680a.b().f();
                        fjp.b(f2, fjp.SECTION_FIRST_VIDEO_READY, "nid=" + e.k);
                        if (e.d) {
                            e.d = false;
                            com.taobao.android.detail2.core.framework.a f3 = rbv.this.f32680a.b().f();
                            fjp.b(f3, fjp.SECTION_FIRST_OPEN_IMMEDIATELY_VIDEO_READY, "nid=" + e.k);
                        }
                    }
                    if (rbv.this.f32680a.b() != null && rbv.this.f32680a.b().k() != null && rbv.this.f32680a.b().k().a() && e.f == 0 && rbv.this.f32680a.b().k().b() && !NavBarViewManager.c(rbv.this.f32680a.b().h().G())) {
                        rbv.this.f32680a.b().k().d();
                    }
                }
                rbv.this.f32680a.f();
            }

            @Override // tb.fit.a
            public void a(SuccPhenixEvent succPhenixEvent, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2e6d4d64", new Object[]{this, succPhenixEvent, new Boolean(z)});
                    return;
                }
                fhi e = rbv.this.f32680a.e();
                if (e == null || rbv.this.d == 0) {
                    return;
                }
                if (e.f == 0 && ((ovb) rbv.this.d).d == 0 && !e.z && !((ovb) rbv.this.d).e && !z && rbv.this.f32680a.b().h().ar()) {
                    ctu.a("mainPicVideoFirstCoverSuccess");
                    ctu.a();
                    if (!e.ag) {
                        com.taobao.android.detail2.core.framework.a f2 = rbv.this.f32680a.b().f();
                        fjp.b(f2, fjp.SECTION_FIRST_NATIVE_PIC_VISIBLE, "nid=" + e.k);
                    }
                    if (!e.ac) {
                        return;
                    }
                    e.ac = false;
                    com.taobao.android.detail2.core.framework.a f3 = rbv.this.f32680a.b().f();
                    fjp.b(f3, fjp.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_PIC_VISIBLE, "nid=" + e.k);
                } else if (e.f != 1 || ((ovb) rbv.this.d).d != 0 || e.z || ((ovb) rbv.this.d).e || z || !rbv.this.f32680a.b().h().an() || !rbv.this.f32680a.d().g()) {
                } else {
                    ctu.a("mainPicVideoSecondCoverSuccess");
                    ctu.a();
                    com.taobao.android.detail2.core.framework.a f4 = rbv.this.f32680a.b().f();
                    fjp.b(f4, fjp.SECTION_SECOND_NATIVE_PIC_VISIBLE, "nid=" + e.k);
                }
            }

            @Override // tb.fit.a
            public HashMap<String, String> b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this});
                }
                HashMap<String, String> hashMap = (HashMap) rbv.this.f32680a.c().y().a("item", null, rbv.this.f32680a.e());
                if (rbv.this.f32680a.c() != null) {
                    hashMap = (HashMap) fjg.a(rbv.this.f32680a.b().f(), rbv.this.f32680a.b().h(), hashMap, rbv.this.f32680a.e());
                }
                if (rbv.this.d != 0) {
                    hashMap.put("cardUTArgs", rbv.this.f32680a.e().K().toJSONString());
                }
                return hashMap;
            }
        };
        this.h = new fit(aVar2.b(), viewGroup, aVar2.c(), aVar2.d());
        this.h.a(this.k);
        viewGroup.setOnTouchListener(new ojz(viewGroup, viewGroup.getContext(), this.b) { // from class: tb.rbv.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ojz
            public String b() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "frame";
            }

            @Override // tb.ojz
            public int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
                }
                if (rbv.this.d == 0) {
                    return -1;
                }
                return ((ovb) rbv.this.d).d;
            }
        });
        this.i = viewGroup.findViewById(R.id.imv_play_public_pause);
        this.i.setOnTouchListener(new ojz(this.i, viewGroup.getContext(), this.b) { // from class: tb.rbv.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ojz
            public String b() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "playBtn";
            }

            @Override // tb.ojz
            public int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
                }
                if (rbv.this.d == 0) {
                    return -1;
                }
                return ((ovb) rbv.this.d).d;
            }

            @Override // tb.ojz
            public void a(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    rbv.a(rbv.this).c("nativeClick");
                }
            }
        });
        this.i.setHapticFeedbackEnabled(false);
        this.j = viewGroup.findViewById(R.id.video_host);
        this.j.setOnTouchListener(new ojz(this.j, viewGroup.getContext(), this.b) { // from class: tb.rbv.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ojz
            public String b() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "video";
            }

            @Override // tb.ojz
            public int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
                }
                if (rbv.this.d == 0) {
                    return -1;
                }
                return ((ovb) rbv.this.d).d;
            }

            @Override // tb.ojz
            public void a(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    rbv.a(rbv.this).h();
                }
            }
        });
        this.j.setHapticFeedbackEnabled(false);
    }

    public void a(ovb ovbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ab3d9d", new Object[]{this, ovbVar});
        } else if (ovbVar == null) {
        } else {
            ctu.a("mainPicVideoFirstBind");
            this.h.a(this.f32680a.e(), ovbVar.b());
            ctu.a();
            this.h.i();
        }
    }

    @Override // tb.pig
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        fit fitVar = this.h;
        if (fitVar == null) {
            return;
        }
        fitVar.a(str);
    }

    @Override // tb.pig
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        fit fitVar = this.h;
        if (fitVar == null) {
            return;
        }
        fitVar.b(str);
    }

    @Override // tb.pig
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        fit fitVar = this.h;
        if (fitVar == null) {
            return;
        }
        fitVar.b();
    }

    @Override // tb.pig
    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            return;
        }
        fit fitVar = this.h;
        if (fitVar == null) {
            return;
        }
        fitVar.c();
    }

    @Override // tb.pig
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        fit fitVar = this.h;
        if (fitVar == null) {
            return;
        }
        fitVar.b(this.f32680a.e());
    }

    @Override // tb.pig
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        fit fitVar = this.h;
        if (fitVar == null) {
            return;
        }
        fitVar.a(jSONObject);
    }

    @Override // tb.pig
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        fit fitVar = this.h;
        if (fitVar == null) {
            return;
        }
        fitVar.d();
    }

    @Override // tb.pig
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        fit fitVar = this.h;
        if (fitVar == null) {
            return;
        }
        fitVar.j();
    }

    private void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) str);
        jSONObject2.put("info", (Object) jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("position", (Object) Integer.valueOf(((ovb) this.d).d));
        jSONObject2.put("extra", (Object) jSONObject3);
        this.f32680a.a("mediaChannelToWeex", jSONObject2);
    }
}
