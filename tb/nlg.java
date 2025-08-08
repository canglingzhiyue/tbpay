package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ItemInfo;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView;
import tb.qmv;

/* loaded from: classes6.dex */
public class nlg extends nlf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DXRootView h;
    private ItemInfo i;

    static {
        kge.a(-715576147);
    }

    public static /* synthetic */ Object ipc$super(nlg nlgVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 91915241) {
            super.b();
            return null;
        } else if (hashCode == 93762287) {
            return new Boolean(super.d());
        } else {
            if (hashCode != 96532850) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.g());
        }
    }

    public static /* synthetic */ ItemInfo a(nlg nlgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemInfo) ipChange.ipc$dispatch("b3df8011", new Object[]{nlgVar}) : nlgVar.i;
    }

    public nlg(Context context, hka hkaVar, String str) {
        super(context, hkaVar, str);
    }

    @Override // tb.nlf
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.i = (ItemInfo) pqj.a(this.d, ItemInfo.class);
        this.h = qmz.a(this.b.l(), this.f31547a, StringUtils.isEmpty(this.g) ? "taolive_newuser_panel" : this.g);
        if (this.h == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.f31547a);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.addView(this.h, layoutParams);
        this.c.addView(frameLayout);
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: tb.nlg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                nlg.this.b.a(true, true);
                nlg.this.b.b(nlg.this.k(), nlg.a(nlg.this));
            }
        });
        a(true);
        this.b.a(j(), this.i);
        ItemInfo itemInfo = this.i;
        if (itemInfo == null || itemInfo.cardInfoList == null || this.i.cardInfoList.size() <= 0) {
            return;
        }
        for (int i = 0; i < this.i.cardInfoList.size(); i++) {
            this.b.a("Newfans_exposure_item", (ListItemPopView.ListItemInfo) pqj.a(this.i.cardInfoList.getJSONObject(i), ListItemPopView.ListItemInfo.class));
        }
    }

    @Override // tb.nlf
    public ItemInfo a(qmv.a aVar) {
        ItemInfo itemInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemInfo) ipChange.ipc$dispatch("dda82e23", new Object[]{this, aVar});
        }
        if (aVar != null && aVar.f32947a != null && aVar.f32947a.length >= 5 && (itemInfo = this.i) != null && itemInfo.cardInfoList != null && this.i.cardInfoList.size() > 0) {
            String str = (String) aVar.f32947a[4];
            if (!StringUtils.isEmpty(str)) {
                for (int i = 0; i < this.i.cardInfoList.size(); i++) {
                    ListItemPopView.ListItemInfo listItemInfo = (ListItemPopView.ListItemInfo) pqj.a(this.i.cardInfoList.getJSONObject(i), ListItemPopView.ListItemInfo.class);
                    if (listItemInfo.item != null && str.equals(listItemInfo.item.getString("id"))) {
                        return listItemInfo;
                    }
                }
            }
        }
        return this.i;
    }

    @Override // tb.nlf
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.d.put(str, obj);
        }
    }

    @Override // tb.nlf
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.h == null || this.d == null) {
        } else {
            JSONObject jSONObject = this.d;
            if (this.b.f() == null) {
                z2 = false;
            }
            jSONObject.put("isSupport0yg", (Object) Boolean.valueOf(z2));
            qmz.a(this.b.l(), this.h, new JSONObject(this.d), this.b.g());
        }
    }

    @Override // tb.nlf
    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.h;
    }

    @Override // tb.nlf
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        this.h = null;
        this.i = null;
    }

    @Override // tb.nlf
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (!"taolive_speedbump_panel".equals(this.g)) {
            return super.g();
        }
        return true;
    }

    @Override // tb.nlf
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (!"taolive_speedbump_panel".equals(this.g)) {
            return super.d();
        }
        return true;
    }
}
