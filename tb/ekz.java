package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.android.detail.core.standard.video.d;
import com.taobao.android.detail.core.standard.video.m;
import com.taobao.android.detail.core.standard.video.n;
import com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBar;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;

@AURAExtensionImpl(code = "alidetail.impl.render.component.creator.progressBar")
/* loaded from: classes4.dex */
public final class ekz extends atl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_TYPE = "progressbar";
    public s d;
    private AURAGlobalData e;
    private d f;
    private AURARenderComponent g;
    private aqs h;
    private boolean i = false;

    static {
        kge.a(-1280304544);
    }

    public static /* synthetic */ Object ipc$super(ekz ekzVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : COMPONENT_TYPE;
    }

    public static /* synthetic */ d a(ekz ekzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("aae64252", new Object[]{ekzVar}) : ekzVar.f;
    }

    public static /* synthetic */ void a(ekz ekzVar, PicGalleryProgressBar picGalleryProgressBar, AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36e2788", new Object[]{ekzVar, picGalleryProgressBar, absPicGalleryVideoPlayer});
        } else {
            ekzVar.a(picGalleryProgressBar, absPicGalleryVideoPlayer);
        }
    }

    public static /* synthetic */ boolean a(ekz ekzVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa4bbd94", new Object[]{ekzVar, new Boolean(z)})).booleanValue();
        }
        ekzVar.i = z;
        return z;
    }

    public static /* synthetic */ aqs b(ekz ekzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aqs) ipChange.ipc$dispatch("289708be", new Object[]{ekzVar}) : ekzVar.h;
    }

    public static /* synthetic */ void b(ekz ekzVar, PicGalleryProgressBar picGalleryProgressBar, AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b97a0ec9", new Object[]{ekzVar, picGalleryProgressBar, absPicGalleryVideoPlayer});
        } else {
            ekzVar.b(picGalleryProgressBar, absPicGalleryVideoPlayer);
        }
    }

    public static /* synthetic */ void c(ekz ekzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c410bac6", new Object[]{ekzVar});
        } else {
            ekzVar.e();
        }
    }

    public ekz() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.render.component.PicGalleryProgressBarComponentExtension");
    }

    @Override // tb.atl, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.d = qVar.b();
        this.f = (d) qVar.a().get("AliDetailPicGalleryVideoManager");
    }

    @Override // tb.atl, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.h = aqsVar;
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.e = aURAGlobalData;
        c();
    }

    @Override // tb.atc
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        PicGalleryProgressBar c = c();
        emm.a(c);
        return c;
    }

    private PicGalleryProgressBar c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PicGalleryProgressBar) ipChange.ipc$dispatch("e6c82624", new Object[]{this});
        }
        PicGalleryProgressBar picGalleryProgressBar = null;
        AURAGlobalData aURAGlobalData = this.e;
        if (aURAGlobalData != null) {
            picGalleryProgressBar = (PicGalleryProgressBar) aURAGlobalData.get("AliDetailPicGalleryProgressBar", PicGalleryProgressBar.class);
        }
        if (picGalleryProgressBar == null) {
            picGalleryProgressBar = d();
        }
        this.e.update("AliDetailPicGalleryProgressBar", picGalleryProgressBar);
        return picGalleryProgressBar;
    }

    private PicGalleryProgressBar d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PicGalleryProgressBar) ipChange.ipc$dispatch("2c6968c3", new Object[]{this});
        }
        PicGalleryProgressBar picGalleryProgressBar = new PicGalleryProgressBar(this.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(bay.b(), -2);
        layoutParams.gravity = 80;
        picGalleryProgressBar.setLayoutParams(layoutParams);
        picGalleryProgressBar.setTag(R.id.standard_detail_gallery_tag_is_progressbar, "true");
        a(picGalleryProgressBar);
        return picGalleryProgressBar;
    }

    @Override // tb.atc
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
            return;
        }
        AURAGlobalData aURAGlobalData = this.e;
        if (aURAGlobalData != null) {
            aURAGlobalData.update("AliDetailPicGalleryProgressBarPosition", Integer.valueOf(i));
        }
        this.g = aURARenderComponent;
        if (this.g.data == null || this.g.data.fields == null) {
            return;
        }
        view.setTag(R.id.progress_bar_frame_tag, this.g.data.fields.get("frameTag"));
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent}) : a();
    }

    private void a(final PicGalleryProgressBar picGalleryProgressBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae0ec60", new Object[]{this, picGalleryProgressBar});
            return;
        }
        d dVar = this.f;
        if (dVar == null) {
            return;
        }
        dVar.a(new AbsPicGalleryVideoPlayer.a() { // from class: tb.ekz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
            public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c6768f81", new Object[]{this, absPicGalleryVideoPlayer, mVar});
                } else if (ekz.a(ekz.this).g() != absPicGalleryVideoPlayer) {
                } else {
                    picGalleryProgressBar.setVideoTime(absPicGalleryVideoPlayer.r());
                    picGalleryProgressBar.setShowVideoProgressBarWhenTouchDown(true);
                    ekz.a(ekz.this, picGalleryProgressBar, absPicGalleryVideoPlayer);
                }
            }

            @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
            public void b(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9a88720", new Object[]{this, absPicGalleryVideoPlayer, mVar});
                } else if (ekz.a(ekz.this).g() != absPicGalleryVideoPlayer) {
                } else {
                    picGalleryProgressBar.setShowVideoProgressBarWhenTouchDown(false);
                }
            }

            @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
            public void c(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acda7ebf", new Object[]{this, absPicGalleryVideoPlayer, mVar});
                } else if (ekz.a(ekz.this).g() != absPicGalleryVideoPlayer) {
                } else {
                    picGalleryProgressBar.setShowVideoProgressBarWhenTouchDown(false);
                    ekz.b(ekz.this, picGalleryProgressBar, absPicGalleryVideoPlayer);
                }
            }

            @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
            public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("85bc85f", new Object[]{this, absPicGalleryVideoPlayer, mVar, new Float(f)});
                } else if (ekz.a(ekz.this).g() != absPicGalleryVideoPlayer) {
                } else {
                    picGalleryProgressBar.setFrameProgress(picGalleryProgressBar.getFrameIndex() + f);
                    picGalleryProgressBar.setVideoProgress(f);
                }
            }

            @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
            public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a8fd815", new Object[]{this, absPicGalleryVideoPlayer, mVar, str, str2});
                    return;
                }
                ema.a("industryPicGalleryVideoError", ag.ARG_ERROR_CODE + str + ",errorMsg=" + str2, ekz.b(ekz.this));
            }
        });
        picGalleryProgressBar.setProgressBarSlideListener(new PicGalleryProgressBar.a() { // from class: tb.ekz.2
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private String c;
            private float d;

            @Override // com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBar.a
            public void a() {
                AbsPicGalleryVideoPlayer g;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (ekz.a(ekz.this) == null || (g = ekz.a(ekz.this).g()) == null) {
                } else {
                    ekz.a(ekz.this, true);
                    this.c = g.p();
                    if (StringUtils.equals(this.c, AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING)) {
                        g.b();
                        g.h();
                    }
                    this.d = -1.0f;
                    ekz.c(ekz.this);
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBar.a
            public void a(float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                } else if (ekz.a(ekz.this) == null || ekz.a(ekz.this).g() == null) {
                } else {
                    this.d = f;
                    picGalleryProgressBar.setFrameProgress(picGalleryProgressBar.getFrameIndex() + f);
                    picGalleryProgressBar.setVideoProgress(f);
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBar.a
            public void b() {
                AbsPicGalleryVideoPlayer g;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (ekz.a(ekz.this) == null || (g = ekz.a(ekz.this).g()) == null) {
                } else {
                    if (StringUtils.equals(this.c, AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING)) {
                        g.a();
                    }
                    float f = this.d;
                    if (f >= 0.0f) {
                        g.a(f);
                    }
                    ekz.a(ekz.this, false);
                }
            }
        });
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d == null || this.g == null) {
        } else {
            com.alibaba.android.aura.service.event.d dVar = new com.alibaba.android.aura.service.event.d();
            dVar.a("" + System.currentTimeMillis());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventId", (Object) 2101);
            jSONObject.put("page", (Object) "Page_Detail_Button_ProgressBar_industry");
            dVar.a(jSONObject);
            c.a(this.d, "userTrack", dVar);
        }
    }

    private void a(PicGalleryProgressBar picGalleryProgressBar, AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aaee12c", new Object[]{this, picGalleryProgressBar, absPicGalleryVideoPlayer});
            return;
        }
        Object a2 = absPicGalleryVideoPlayer.a(n.EXT_KEY_IS_STRUCT_VIDEO);
        if ((a2 instanceof Boolean) && ((Boolean) a2).booleanValue()) {
            return;
        }
        picGalleryProgressBar.setVisibility(0);
        emj.a(this.e);
    }

    private void b(PicGalleryProgressBar picGalleryProgressBar, AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92996d", new Object[]{this, picGalleryProgressBar, absPicGalleryVideoPlayer});
            return;
        }
        Object a2 = absPicGalleryVideoPlayer.a(n.EXT_KEY_IS_STRUCT_VIDEO);
        if ((a2 instanceof Boolean) && ((Boolean) a2).booleanValue()) {
            picGalleryProgressBar.setVisibility(4);
            return;
        }
        Object a3 = absPicGalleryVideoPlayer.a(n.EXT_KEY_VIDEO_COUNT_IN_FRAME_GROUP);
        if ((a3 instanceof Integer) && ((Integer) a3).intValue() <= 1) {
            picGalleryProgressBar.setVisibility(4);
        } else {
            picGalleryProgressBar.setVisibility(0);
        }
    }
}
