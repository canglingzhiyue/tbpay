package tb;

import android.app.Activity;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.desc.b;
import com.taobao.android.detail.core.model.viewmodel.desc.e;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.av;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.epl;

/* loaded from: classes5.dex */
public class fao extends b<e> implements av {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RelativeLayout k;
    private RelativeLayout l;
    private DetailImageView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private LinearLayout q;
    private String r;
    private String s;
    private String t;
    private DetailImageView u;
    private DWInstance v;
    private boolean w;
    private final int x;
    private final int y;
    private final int z;

    static {
        kge.a(1657637273);
        kge.a(688755897);
    }

    public static /* synthetic */ Object ipc$super(fao faoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.avplayer.av
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((e) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, eVar})).booleanValue() : c2(eVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, eVar}) : a2(eVar);
    }

    public fao(Activity activity) {
        super(activity);
        this.x = epo.b(9);
        this.y = epo.b(12);
        this.z = (int) Math.ceil(((epo.b - (this.y << 1)) - this.x) / 2);
        this.l = (RelativeLayout) View.inflate(activity, R.layout.x_detail_desc_iteminfo_video, null);
        this.m = (DetailImageView) this.l.findViewById(R.id.normalPic);
        this.o = (TextView) this.l.findViewById(R.id.tvPrice);
        this.n = (TextView) this.l.findViewById(R.id.tvItemTitle);
        this.p = (TextView) this.l.findViewById(R.id.tvSaleCount);
        this.q = (LinearLayout) this.l.findViewById(R.id.tagContainer);
        this.u = (DetailImageView) this.l.findViewById(R.id.video_state);
        this.k = (RelativeLayout) this.l.findViewById(R.id.videoContainer);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.ItemInfoViewHolder");
    }

    private void d(e eVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06d3179", new Object[]{this, eVar});
            return;
        }
        int i2 = epo.b;
        DetailImageView detailImageView = this.m;
        if (!StringUtils.isEmpty(eVar.h)) {
            try {
                float parseFloat = Float.parseFloat(eVar.h);
                i = ((int) (i2 * parseFloat)) - ((int) (((1.0f / parseFloat) - 1.0f) * dzc.ITEM_PADDING_RIGHT));
            } catch (Exception unused) {
            }
        }
        if (i <= 0) {
            i = this.z;
        }
        ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        layoutParams.width = i;
        ViewGroup.LayoutParams layoutParams2 = detailImageView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(i, i);
        }
        layoutParams2.width = i;
        layoutParams2.height = i;
        detailImageView.setLayoutParams(layoutParams2);
        int ceil = (int) Math.ceil((i * 40) / 369);
        ViewGroup.LayoutParams layoutParams3 = this.u.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = new ViewGroup.LayoutParams(-2, ceil);
        }
        layoutParams3.width = -2;
        layoutParams3.height = ceil;
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams.topMargin = i - ((int) Math.ceil((ceil * 3) / 4));
            marginLayoutParams.leftMargin = epo.b(12);
        }
        this.u.setLayoutParams(layoutParams3);
        a(this.u, eVar);
        ViewGroup.LayoutParams layoutParams4 = this.n.getLayoutParams();
        if (layoutParams4 == null) {
            layoutParams4 = new ViewGroup.LayoutParams(i, -2);
        }
        layoutParams4.width = i;
        this.n.setLayoutParams(layoutParams4);
        this.l.setLayoutParams(layoutParams);
    }

    private void a(DetailImageView detailImageView, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd016b7b", new Object[]{this, detailImageView, eVar});
            return;
        }
        String str = eVar.j;
        if (StringUtils.isEmpty(str)) {
            detailImageView.setVisibility(8);
            return;
        }
        epj.b().a(str, detailImageView, new epl.a().c(true).a());
        detailImageView.setVisibility(0);
    }

    public void a(ArrayList<e.a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        this.q.removeAllViews();
        if (arrayList != null && arrayList.size() > 0) {
            View a2 = a(arrayList.get(0));
            if (a2 != null) {
                this.q.addView(a2);
            }
        } else if (!StringUtils.isEmpty(this.r)) {
            String[] split = this.r.split(",");
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            for (String str : split) {
                e.a a3 = a(str);
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
            View a4 = a(arrayList.get(0));
            if (a4 != null) {
                this.q.addView(a4);
            }
        }
        if (this.q.getChildCount() > 0) {
            this.n.setMaxLines(1);
            this.q.setVisibility(0);
            return;
        }
        this.n.setLines(2);
        this.n.setMaxLines(2);
        this.q.setVisibility(8);
    }

    private e.a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e.a) ipChange.ipc$dispatch("b4bc1109", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return new e.a(str, 0, 0);
        }
        return null;
    }

    public View a(e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("10ad7701", new Object[]{this, aVar});
        }
        if (aVar == null || StringUtils.isEmpty(aVar.f9748a)) {
            return null;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, epo.b(12));
        layoutParams.rightMargin = (int) (epo.f27511a * 3.0f);
        DetailImageView detailImageView = new DetailImageView(this.g);
        detailImageView.setLayoutParams(layoutParams);
        epj.b().a(aVar.f9748a, detailImageView, new epl.a().c(true).a());
        return detailImageView;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6ee5c89e", new Object[]{this, eVar}) : this.l;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(e eVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94659abb", new Object[]{this, eVar});
            return;
        }
        String str = eVar.f9747a;
        String str2 = eVar.b;
        String str3 = eVar.c;
        String str4 = eVar.d;
        this.t = eVar.e;
        this.s = eVar.f;
        this.r = eVar.l;
        if (!StringUtils.isEmpty(this.t) || !StringUtils.isEmpty(this.s)) {
            this.l.setClickable(true);
        } else {
            this.l.setClickable(false);
        }
        try {
            z = e(eVar);
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            str = eVar.m;
        }
        String str5 = str;
        this.m.setVisibility(0);
        DetailImageView detailImageView = this.m;
        epl a2 = new epl.a().b(R.drawable.detail_img_load_fail).a(R.drawable.detail_img_load_fail).c(this.m.getScaleType()).a(this.m.getScaleType()).a();
        DetailImageView detailImageView2 = this.m;
        int i = this.z;
        a(detailImageView2, str5, new epm(i, i), null, a2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, epo.b(10), 0, 0);
        layoutParams.addRule(3, detailImageView.getId());
        this.n.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(7, detailImageView.getId());
        layoutParams2.addRule(5, detailImageView.getId());
        layoutParams2.addRule(3, this.n.getId());
        this.q.setLayoutParams(layoutParams2);
        if (!StringUtils.isEmpty(str2)) {
            String str6 = "¥ " + str2;
            int indexOf = str6.indexOf(".");
            if (indexOf > 0) {
                String substring = str6.substring(indexOf + 1);
                try {
                    if (!StringUtils.isEmpty(substring) && Integer.parseInt(substring) <= 0) {
                        str6 = str6.substring(0, indexOf);
                        indexOf = -1;
                    }
                } catch (NumberFormatException unused2) {
                }
            }
            SpannableString spannableString = new SpannableString(str6);
            spannableString.setSpan(new AbsoluteSizeSpan(epo.i), 0, 2, 33);
            if (indexOf > 0) {
                spannableString.setSpan(new AbsoluteSizeSpan(epo.l), 2, indexOf, 33);
                spannableString.setSpan(new AbsoluteSizeSpan(epo.i), indexOf, str6.length(), 33);
            } else {
                spannableString.setSpan(new AbsoluteSizeSpan(epo.l), 2, str6.length(), 33);
            }
            this.o.setText(spannableString);
        }
        if (!StringUtils.isEmpty(str3)) {
            this.n.setText(str3);
        }
        if (!StringUtils.isEmpty(str4)) {
            this.p.setText(str4);
        }
        a(eVar.k);
        d(eVar);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a69661e", new Object[]{this, eVar})).booleanValue() : eVar.f9747a == null || eVar.b == null || eVar.c == null;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        DWInstance dWInstance = this.v;
        if (dWInstance == null || dWInstance.getVideoState() != 1) {
            return;
        }
        this.v.pauseVideo();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        DWInstance dWInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
        } else if (!this.w || (dWInstance = this.v) == null || dWInstance.getVideoState() != 2) {
        } else {
            this.v.playVideo();
        }
    }

    private boolean e(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a670fcdc", new Object[]{this, eVar})).booleanValue();
        }
        if (StringUtils.isEmpty(eVar.n)) {
            return false;
        }
        eVar.a(new e.b() { // from class: tb.fao.1
        });
        return true;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        DetailImageView detailImageView = this.m;
        if (detailImageView == null || detailImageView.getVisibility() != 0) {
            return;
        }
        this.m.setVisibility(4);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else {
            i();
        }
    }
}
