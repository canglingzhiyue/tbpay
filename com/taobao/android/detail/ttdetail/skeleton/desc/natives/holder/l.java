package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.k;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.av;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes5.dex */
public class l extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.k> implements av {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RelativeLayout g;
    private RelativeLayout h;
    private ImageView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private LinearLayout m;
    private String n;
    private String o;
    private String p;
    private ImageView q;
    private DWInstance r;
    private boolean s;
    private final int t;
    private final int u;
    private int v;

    static {
        kge.a(1267972563);
        kge.a(688755897);
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
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

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, kVar})).booleanValue() : c2(kVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, kVar}) : a2(kVar);
    }

    public l(Context context) {
        super(context);
        this.t = com.taobao.android.detail.ttdetail.utils.f.a(9.0f);
        this.u = com.taobao.android.detail.ttdetail.utils.f.a(12.0f);
        this.v = 0;
        this.v = (int) Math.ceil(((com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a) - (this.u << 1)) - this.t) / 2);
        this.h = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_iteminfo_video, (ViewGroup) null);
        this.i = (ImageView) this.h.findViewById(R.id.normalPic);
        this.k = (TextView) this.h.findViewById(R.id.tvPrice);
        this.j = (TextView) this.h.findViewById(R.id.tvItemTitle);
        this.l = (TextView) this.h.findViewById(R.id.tvSaleCount);
        this.m = (LinearLayout) this.h.findViewById(R.id.tagContainer);
        this.q = (ImageView) this.h.findViewById(R.id.video_state);
        this.g = (RelativeLayout) this.h.findViewById(R.id.videoContainer);
    }

    private void d(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.k kVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68fa9f9c", new Object[]{this, kVar});
            return;
        }
        int a2 = com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a);
        ImageView imageView = this.i;
        if (!StringUtils.isEmpty(kVar.h)) {
            try {
                float parseFloat = Float.parseFloat(kVar.h);
                i = ((int) (a2 * parseFloat)) - ((int) (((1.0f / parseFloat) - 1.0f) * com.taobao.android.detail.ttdetail.utils.f.a(3.0f)));
            } catch (Exception unused) {
            }
        }
        if (i <= 0) {
            i = this.v;
        }
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        layoutParams.width = i;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(i, i);
        }
        layoutParams2.width = i;
        layoutParams2.height = i;
        imageView.setLayoutParams(layoutParams2);
        int ceil = (int) Math.ceil((i * 40) / 369);
        ViewGroup.LayoutParams layoutParams3 = this.q.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = new ViewGroup.LayoutParams(-2, ceil);
        }
        layoutParams3.width = -2;
        layoutParams3.height = ceil;
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams.topMargin = i - ((int) Math.ceil((ceil * 3) / 4));
            marginLayoutParams.leftMargin = com.taobao.android.detail.ttdetail.utils.f.a(12.0f);
        }
        this.q.setLayoutParams(layoutParams3);
        a(this.q, kVar);
        ViewGroup.LayoutParams layoutParams4 = this.j.getLayoutParams();
        if (layoutParams4 == null) {
            layoutParams4 = new ViewGroup.LayoutParams(i, -2);
        }
        layoutParams4.width = i;
        this.j.setLayoutParams(layoutParams4);
        this.h.setLayoutParams(layoutParams);
    }

    private void a(ImageView imageView, com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4cf593", new Object[]{this, imageView, kVar});
            return;
        }
        String str = kVar.w;
        if (StringUtils.isEmpty(str)) {
            imageView.setVisibility(8);
            return;
        }
        com.taobao.android.detail.ttdetail.utils.q.a(imageView, str);
        imageView.setVisibility(0);
    }

    public void a(ArrayList<k.a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        this.m.removeAllViews();
        if (arrayList != null && arrayList.size() > 0) {
            View a2 = a(arrayList.get(0));
            if (a2 != null) {
                this.m.addView(a2);
            }
        } else if (!StringUtils.isEmpty(this.n)) {
            String[] split = this.n.split(",");
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            for (String str : split) {
                k.a a3 = a(str);
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
            View a4 = a(arrayList.get(0));
            if (a4 != null) {
                this.m.addView(a4);
            }
        }
        if (this.m.getChildCount() > 0) {
            this.j.setMaxLines(1);
            this.m.setVisibility(0);
            return;
        }
        this.j.setLines(2);
        this.j.setMaxLines(2);
        this.m.setVisibility(8);
    }

    private k.a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k.a) ipChange.ipc$dispatch("2f938578", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return new k.a(str, 0, 0);
        }
        return null;
    }

    public View a(k.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a428e67e", new Object[]{this, aVar});
        }
        if (aVar == null || StringUtils.isEmpty(aVar.f10879a)) {
            return null;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, com.taobao.android.detail.ttdetail.utils.f.a(12.0f));
        layoutParams.rightMargin = com.taobao.android.detail.ttdetail.utils.f.a(3.0f);
        ImageView imageView = new ImageView(this.f10821a);
        imageView.setLayoutParams(layoutParams);
        com.taobao.android.detail.ttdetail.utils.q.a(imageView, aVar.f10879a);
        return imageView;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fc80f35b", new Object[]{this, kVar}) : this.h;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.k kVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e4a1a", new Object[]{this, kVar});
            return;
        }
        String str = kVar.f10878a;
        String str2 = kVar.b;
        String str3 = kVar.c;
        String str4 = kVar.d;
        this.p = kVar.e;
        this.o = kVar.f;
        this.n = kVar.y;
        if (!StringUtils.isEmpty(this.p) || !StringUtils.isEmpty(this.o)) {
            this.h.setClickable(true);
        } else {
            this.h.setClickable(false);
        }
        try {
            z = e(kVar);
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            str = kVar.z;
        }
        this.i.setVisibility(0);
        ImageView imageView = this.i;
        com.taobao.android.detail.ttdetail.utils.q.a(imageView, str);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, com.taobao.android.detail.ttdetail.utils.f.a(10.0f), 0, 0);
        layoutParams.addRule(3, imageView.getId());
        this.j.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(7, imageView.getId());
        layoutParams2.addRule(5, imageView.getId());
        layoutParams2.addRule(3, this.j.getId());
        this.m.setLayoutParams(layoutParams2);
        if (!StringUtils.isEmpty(str2)) {
            String str5 = "¥ " + str2;
            int indexOf = str5.indexOf(".");
            if (indexOf > 0) {
                String substring = str5.substring(indexOf + 1);
                try {
                    if (!StringUtils.isEmpty(substring) && Integer.parseInt(substring) <= 0) {
                        str5 = str5.substring(0, indexOf);
                        indexOf = -1;
                    }
                } catch (NumberFormatException unused2) {
                }
            }
            SpannableString spannableString = new SpannableString(str5);
            spannableString.setSpan(new AbsoluteSizeSpan(com.taobao.android.detail.ttdetail.utils.f.a(12.0f)), 0, 2, 33);
            if (indexOf > 0) {
                spannableString.setSpan(new AbsoluteSizeSpan(com.taobao.android.detail.ttdetail.utils.f.a(18.0f)), 2, indexOf, 33);
                spannableString.setSpan(new AbsoluteSizeSpan(com.taobao.android.detail.ttdetail.utils.f.a(12.0f)), indexOf, str5.length(), 33);
            } else {
                spannableString.setSpan(new AbsoluteSizeSpan(com.taobao.android.detail.ttdetail.utils.f.a(18.0f)), 2, str5.length(), 33);
            }
            this.k.setText(spannableString);
        }
        if (!StringUtils.isEmpty(str3)) {
            this.j.setText(str3);
        }
        if (!StringUtils.isEmpty(str4)) {
            this.l.setText(str4);
        }
        a(kVar.x);
        d(kVar);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("354c74df", new Object[]{this, kVar})).booleanValue() : kVar.f10878a == null || kVar.b == null || kVar.c == null;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ff8829", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        DWInstance dWInstance = this.r;
        if (dWInstance == null || dWInstance.getVideoState() != 1) {
            return;
        }
        this.r.pauseVideo();
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void cG_() {
        DWInstance dWInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3813ba2", new Object[]{this});
        } else if (!this.s || (dWInstance = this.r) == null || dWInstance.getVideoState() != 2) {
        } else {
            this.r.playVideo();
        }
    }

    private boolean e(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ca8ca61", new Object[]{this, kVar})).booleanValue();
        }
        if (!c() || StringUtils.isEmpty(kVar.A)) {
            return false;
        }
        kVar.a(new k.b() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.l.1
        });
        return true;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ImageView imageView = this.i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        this.i.setVisibility(4);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else {
            d();
        }
    }
}
