package tb;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.mytaobao.homepage.a;
import com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity;
import com.taobao.mytaobao.ut.c;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;

/* loaded from: classes7.dex */
public class mue implements View.OnClickListener, a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MyTaoBaoActionBarManager";

    /* renamed from: a  reason: collision with root package name */
    private TextView f31266a;
    private TextView b;
    private TextView c;
    private FrameLayout d;
    private final mud e;
    private View f;
    private LinearLayout g;
    private TUrlImageView h;
    private TUrlImageView i;
    private TUrlImageView j;
    private ViewStub k;
    private LinearLayout l;
    private LinearLayout m;

    static {
        kge.a(-328807301);
        kge.a(-345307126);
        kge.a(-1201612728);
    }

    public static /* synthetic */ void a(mue mueVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3cd455", new Object[]{mueVar, jSONObject});
        } else {
            mueVar.b(jSONObject);
        }
    }

    public mue(View view) {
        this.f = view;
        b(view);
        this.e = new mud();
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b.setOnClickListener(this);
        this.c.setOnClickListener(this);
        TUrlImageView tUrlImageView = this.h;
        if (tUrlImageView != null) {
            tUrlImageView.setOnClickListener(this);
        }
        TUrlImageView tUrlImageView2 = this.i;
        if (tUrlImageView2 != null) {
            tUrlImageView2.setOnClickListener(this);
        }
        TUrlImageView tUrlImageView3 = this.j;
        if (tUrlImageView3 == null) {
            return;
        }
        tUrlImageView3.setOnClickListener(this);
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.d = (FrameLayout) view.findViewById(R.id.mtb_actionbar_root);
            this.f31266a = (TextView) view.findViewById(R.id.tv_mytaobao_center_nick);
            this.b = (TextView) view.findViewById(R.id.tv_mytaobao_settings_text);
            this.c = (TextView) view.findViewById(R.id.tv_mytaobao_actionbar_xiaomi_text);
            this.k = (ViewStub) view.findViewById(R.id.actionbar_stub_view);
            this.l = (LinearLayout) view.findViewById(R.id.txt_action_container);
            this.g = (LinearLayout) view.findViewById(R.id.llTitleBarContainer);
            int f = mxo.f();
            ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
            layoutParams.height = DensityUtil.dip2px(Globals.getApplication(), 48.0f) + f;
            this.g.setLayoutParams(layoutParams);
            this.g.setPadding(0, f, 0, 0);
            if (b.c()) {
                View inflate = this.k.inflate();
                this.m = (LinearLayout) inflate.findViewById(R.id.img_action_container);
                this.h = (TUrlImageView) inflate.findViewById(R.id.img_mytaobao_actionbar_message);
                this.i = (TUrlImageView) inflate.findViewById(R.id.img_mytaobao_actionbar_xiaomi);
                this.j = (TUrlImageView) inflate.findViewById(R.id.img_mytaobao_actionbar_settings);
            }
            int i = 8;
            this.l.setVisibility(b.c() ? 8 : 0);
            LinearLayout linearLayout = this.m;
            if (linearLayout == null) {
                return;
            }
            if (b.c()) {
                i = 0;
            }
            linearLayout.setVisibility(i);
        }
    }

    @Override // com.taobao.mytaobao.homepage.a
    public FrameLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.mytaobao.homepage.a
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.f31266a;
        if (textView == null || this.b == null || this.c == null) {
            return;
        }
        textView.setText(this.e.a());
        this.b.setText(this.e.c());
        this.c.setText(this.e.b());
        if (z) {
            this.d.setBackgroundColor(-855310);
        }
        int i = 8;
        this.l.setVisibility(b.c() ? 8 : 0);
        LinearLayout linearLayout = this.m;
        if (linearLayout != null) {
            if (b.c()) {
                i = 0;
            }
            linearLayout.setVisibility(i);
        }
        TUrlImageView tUrlImageView = this.h;
        if (tUrlImageView == null || this.i == null || this.j == null) {
            return;
        }
        tUrlImageView.setImageUrl((!(this.d.getBackground() instanceof ColorDrawable) || !mxh.a(((ColorDrawable) this.d.getBackground()).getColor())) ? this.e.g() : this.e.j());
        this.i.setImageUrl((!(this.d.getBackground() instanceof ColorDrawable) || !mxh.a(((ColorDrawable) this.d.getBackground()).getColor())) ? this.e.h() : this.e.k());
        this.j.setImageUrl((!(this.d.getBackground() instanceof ColorDrawable) || !mxh.a(((ColorDrawable) this.d.getBackground()).getColor())) ? this.e.i() : this.e.l());
    }

    @Override // com.taobao.mytaobao.homepage.a
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            final JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            try {
                b(jSONObject2);
            } catch (Throwable unused) {
                View view = this.f;
                if (view == null) {
                    return;
                }
                view.post(new Runnable() { // from class: tb.mue.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            mue.a(mue.this, jSONObject2);
                        } catch (Throwable unused2) {
                        }
                    }
                });
            }
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                if (entry.getKey().contains("headerModule")) {
                    JSONObject jSONObject2 = (JSONObject) entry.getValue();
                    if (jSONObject2 == null) {
                        return;
                    }
                    this.e.a(jSONObject2.getJSONObject("fields"));
                }
            }
        }
    }

    @Override // com.taobao.mytaobao.homepage.a
    public void a(View view) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null || (frameLayout = this.d) == null) {
        } else {
            frameLayout.addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.taobao.mytaobao.homepage.a
    public void a(int i) {
        TextView textView;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.f31266a == null || this.b == null || (textView = this.c) == null) {
        } else {
            textView.setTextColor(i);
            this.b.setTextColor(i);
            this.f31266a.setTextColor(i);
            this.l.setVisibility(b.c() ? 8 : 0);
            LinearLayout linearLayout = this.m;
            if (linearLayout != null) {
                if (!b.c()) {
                    i2 = 8;
                }
                linearLayout.setVisibility(i2);
            }
            TUrlImageView tUrlImageView = this.h;
            if (tUrlImageView == null || this.i == null || this.j == null) {
                return;
            }
            tUrlImageView.setImageUrl(mxh.a(i) ? this.e.j() : this.e.g());
            this.i.setImageUrl(mxh.a(i) ? this.e.k() : this.e.h());
            this.j.setImageUrl(mxh.a(i) ? this.e.l() : this.e.i());
        }
    }

    @Override // com.taobao.mytaobao.homepage.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout == null) {
            return;
        }
        if (!z) {
            i = 4;
        }
        frameLayout.setVisibility(i);
    }

    @Override // com.taobao.mytaobao.homepage.a
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            return frameLayout.getVisibility();
        }
        return -1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        TUrlImageView tUrlImageView;
        TUrlImageView tUrlImageView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == this.b.getId() || ((tUrlImageView = this.j) != null && id == tUrlImageView.getId())) {
            c.b("Page_MyTaobao", "Page_MyTaobao_Button-MyNickName", c.a("a2141.7631743.1.25", (String) null, (String) null, (Map<String, String>) null));
            String e = this.e.e();
            if (TextUtils.isEmpty(e)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean(NewTaobaoSettingActivity.EXTRA_KEY_SHOW_LOGOUT, true);
            Nav.from(Globals.getApplication()).withExtras(bundle).toUri(e);
            com.taobao.mytaobao.base.c.x = e;
        } else if (id == this.c.getId() || ((tUrlImageView2 = this.i) != null && id == tUrlImageView2.getId())) {
            String d = this.e.d();
            if (TextUtils.isEmpty(d)) {
                return;
            }
            Nav.from(Globals.getApplication()).toUri(d);
            com.taobao.mytaobao.base.c.x = d;
        } else {
            TUrlImageView tUrlImageView3 = this.h;
            if (tUrlImageView3 == null || id != tUrlImageView3.getId()) {
                return;
            }
            c.b("Page_MyTaobao", "Page_MyTaobao_Button-Message", c.a("a2141.7631743.1.101", (String) null, (String) null, (Map<String, String>) null));
            String f = this.e.f();
            if (TextUtils.isEmpty(f)) {
                return;
            }
            Nav.from(Globals.getApplication()).toUri(f);
            com.taobao.mytaobao.base.c.x = f;
        }
    }

    @Override // com.taobao.mytaobao.homepage.a
    public void a(View.OnClickListener onClickListener) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        } else if (onClickListener == null || (frameLayout = this.d) == null) {
        } else {
            frameLayout.setOnClickListener(onClickListener);
        }
    }
}
