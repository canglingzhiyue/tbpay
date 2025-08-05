package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.b;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes3.dex */
public class bwm extends ctc<Object, b, CaptureManager> implements bym {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TUrlImageView f26138a;
    private TextView f;
    private TUrlImageView g;
    private int h;
    private boolean i;
    private final bxk j;
    private final ViewGroup k;
    private ViewGroup l;

    static {
        kge.a(21029779);
        kge.a(-1226764053);
    }

    public static /* synthetic */ Object ipc$super(bwm bwmVar, String str, Object... objArr) {
        if (str.hashCode() == 92838762) {
            super.c();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.bym
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        }
    }

    public static /* synthetic */ ViewGroup a(bwm bwmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("93a800f5", new Object[]{bwmVar}) : bwmVar.l;
    }

    public static /* synthetic */ void a(bwm bwmVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5bc1e3", new Object[]{bwmVar, new Integer(i)});
        } else {
            bwmVar.c(i);
        }
    }

    public static /* synthetic */ void a(bwm bwmVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5c01b4", new Object[]{bwmVar, new Boolean(z)});
        } else {
            bwmVar.c(z);
        }
    }

    public static /* synthetic */ int b(bwm bwmVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51398b75", new Object[]{bwmVar, new Integer(i)})).intValue();
        }
        bwmVar.h = i;
        return i;
    }

    public static /* synthetic */ ViewGroup b(bwm bwmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("7e73954", new Object[]{bwmVar}) : bwmVar.k;
    }

    public static /* synthetic */ int c(bwm bwmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bf956215", new Object[]{bwmVar})).intValue() : bwmVar.h;
    }

    public static /* synthetic */ TextView d(bwm bwmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("e92a1817", new Object[]{bwmVar}) : bwmVar.f;
    }

    public static /* synthetic */ bxk e(bwm bwmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bxk) ipChange.ipc$dispatch("e0aab2ad", new Object[]{bwmVar}) : bwmVar.j;
    }

    public bwm(Activity activity, cte<b, CaptureManager> cteVar, ViewGroup viewGroup, bxk bxkVar) {
        super(activity, cteVar);
        this.i = false;
        this.k = viewGroup;
        this.j = bxkVar;
        this.h = -1;
        ad.c("CaptureBottomAreaNavBarViewV2_addView", new ac() { // from class: tb.bwm.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                bwm.b(bwm.this).addView(bwm.a(bwm.this));
                bwm.a(bwm.this, 0);
                bwm.a(bwm.this, false);
            }
        });
    }

    @Override // tb.ctc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        this.l = (ViewGroup) LayoutInflater.from(this.d).inflate(R.layout.feis_view_capture_bottom_area_nav_v2, (ViewGroup) null, false);
        this.f26138a = (TUrlImageView) this.l.findViewById(R.id.iv_close);
        this.f26138a.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01ZJDNzV1x6xlJqr5p7_!!6000000006395-2-tps-26-26.png");
        this.f26138a.setOnClickListener(new View.OnClickListener() { // from class: tb.bwm.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    bwm.a(bwm.this, false);
                }
            }
        });
        this.f = (TextView) this.l.findViewById(R.id.tv_cur_tab);
        this.f.setTextSize(1, j().W() ? 21.0f : 16.0f);
        this.g = (TUrlImageView) this.l.findViewById(R.id.iv_cur_tab_hint);
    }

    @Override // tb.bym
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.i = z;
        a();
    }

    @Override // tb.bym
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        c(i);
        c(true);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.h != 1) {
        } else {
            if (this.i) {
                this.g.setVisibility(0);
                this.g.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01LzZS071FUvNUt2fHT_!!6000000000491-2-tps-128-68.png");
                return;
            }
            this.g.setVisibility(8);
        }
    }

    private void c(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            ad.c("switchShowType", new ac() { // from class: tb.bwm.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    TextView d;
                    int i2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    cot.c("AutoSize__Bottom_NavBarViewV2", "switchShowType " + i);
                    int c = bwm.c(bwm.this);
                    int i3 = i;
                    if (c == i3) {
                        cot.c("AutoSize__Bottom_NavBarViewV2", "curShowType not change");
                        return;
                    }
                    bwm.b(bwm.this, i3);
                    if (bwm.c(bwm.this) == 0) {
                        d = bwm.d(bwm.this);
                        i2 = R.string.taobao_app_1007_1_18987;
                    } else if (bwm.c(bwm.this) == 2) {
                        d = bwm.d(bwm.this);
                        i2 = R.string.taobao_app_1007_1_18919;
                    } else {
                        d = bwm.d(bwm.this);
                        i2 = R.string.taobao_app_1007_1_19914;
                    }
                    d.setText(com.alibaba.ability.localization.b.a(i2));
                    TextView d2 = bwm.d(bwm.this);
                    d2.setContentDescription(((Object) bwm.d(bwm.this).getText()) + "，" + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_selected));
                    bwm.e(bwm.this).c(bwm.c(bwm.this));
                }
            });
        }
    }

    private void c(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            ad.c("updatePageUpState", new ac() { // from class: tb.bwm.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (bwm.e(bwm.this) == null) {
                    } else {
                        bwm.e(bwm.this).b(z);
                    }
                }
            });
        }
    }
}
