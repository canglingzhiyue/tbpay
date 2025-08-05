package com.taobao.avplayer.playercontrol.hiv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.interactivelifecycle.hiv.request.ContentDetailData;
import com.taobao.avplayer.playercontrol.hiv.d;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class f implements aw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DWContext f16592a;
    private View b;
    private ImageView c;
    private TextView d;
    private ContentDetailData e;
    private d f;
    private h g;
    private boolean h;

    static {
        kge.a(1531941981);
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
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
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

    public static /* synthetic */ ContentDetailData a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContentDetailData) ipChange.ipc$dispatch("785f2946", new Object[]{fVar}) : fVar.e;
    }

    public static /* synthetic */ d a(f fVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("513e304a", new Object[]{fVar, dVar});
        }
        fVar.f = dVar;
        return dVar;
    }

    public static /* synthetic */ DWContext b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWContext) ipChange.ipc$dispatch("1ff480c0", new Object[]{fVar}) : fVar.f16592a;
    }

    public static /* synthetic */ d c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("6bafaf24", new Object[]{fVar}) : fVar.f;
    }

    public static /* synthetic */ h d(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("b150f23f", new Object[]{fVar}) : fVar.g;
    }

    public static /* synthetic */ View e(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fc5d0544", new Object[]{fVar}) : fVar.b;
    }

    public f(DWContext dWContext) {
        this.f16592a = dWContext;
        e();
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_HivVideoExtDataBarController);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.b = LayoutInflater.from(this.f16592a.getActivity()).inflate(R.layout.dw_hiv_player_control_ext_data_bar, (ViewGroup) null);
        this.c = (ImageView) this.b.findViewById(R.id.img_player_control_video_ext_data_goods_list);
        this.d = (TextView) this.b.findViewById(R.id.img_player_control_video_ext_data_goods_list_text);
        this.c.setOnClickListener(new a());
        DWContext dWContext = this.f16592a;
        if (dWContext != null && dWContext.getVideo() != null) {
            this.f16592a.getVideo().b(this);
        }
        DWContext dWContext2 = this.f16592a;
        if (com.taobao.avplayer.playercontrol.hiv.a.a(dWContext2, dWContext2.getShowGoodsList(), this.f16592a.getGoodsListFullScreenShown(), this.f16592a.getOrangeGoodsListShown())) {
            return;
        }
        this.c.setVisibility(8);
        this.d.setVisibility(8);
    }

    public void a(ContentDetailData contentDetailData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19dc05de", new Object[]{this, contentDetailData});
        } else if (contentDetailData == null) {
        } else {
            this.e = contentDetailData;
            List<ContentDetailData.RelatedItem> shopOrTalentRelatedItems = this.e.getShopOrTalentRelatedItems();
            if (shopOrTalentRelatedItems == null || shopOrTalentRelatedItems.isEmpty()) {
                return;
            }
            a(shopOrTalentRelatedItems.size());
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d.setText(String.valueOf(i));
        }
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.setVisibility(8);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.e == null) {
        } else {
            this.b.setVisibility(0);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        d dVar = this.f;
        if (dVar == null) {
            return;
        }
        dVar.a();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (this.d == null) {
                return;
            }
            ((ViewGroup) this.d.getParent()).removeView(this.d);
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            return;
        }
        if (dWVideoScreenType == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
            this.h = true;
        }
        if (dWVideoScreenType == DWVideoScreenType.NORMAL && (dVar = this.f) != null) {
            dVar.a();
            this.h = false;
        }
        DWContext dWContext = this.f16592a;
        if (!com.taobao.avplayer.playercontrol.hiv.a.a(dWContext, dWContext.getShowGoodsList(), this.f16592a.getGoodsListFullScreenShown(), this.f16592a.getOrangeGoodsListShown())) {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        this.d.setVisibility(0);
    }

    /* loaded from: classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1914702487);
            kge.a(-1201612728);
        }

        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<ContentDetailData.RelatedItem> shopOrTalentRelatedItems;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (f.a(f.this) == null || f.b(f.this) == null || (shopOrTalentRelatedItems = f.a(f.this).getShopOrTalentRelatedItems()) == null || shopOrTalentRelatedItems.isEmpty()) {
            } else {
                if (f.c(f.this) == null) {
                    f fVar = f.this;
                    f.a(fVar, new d(f.b(fVar), f.a(f.this)));
                    f.c(f.this).a(new d.a() { // from class: com.taobao.avplayer.playercontrol.hiv.f.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.avplayer.playercontrol.hiv.d.a
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            } else if (f.d(f.this) == null) {
                            } else {
                                f.d(f.this);
                            }
                        }

                        @Override // com.taobao.avplayer.playercontrol.hiv.d.a
                        public void b() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                            } else if (f.d(f.this) == null) {
                            } else {
                                f.d(f.this);
                            }
                        }
                    });
                    f.c(f.this).a((ViewGroup) f.e(f.this).getParent().getParent());
                }
                f.c(f.this).b();
                if (f.d(f.this) != null) {
                    f.d(f.this);
                }
                j.a(f.b(f.this), "fullItemClick", j.b(f.b(f.this), f.a(f.this)));
            }
        }
    }
}
