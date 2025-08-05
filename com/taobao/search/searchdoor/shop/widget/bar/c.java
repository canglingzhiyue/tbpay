package com.taobao.search.searchdoor.shop.widget.bar;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.m;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import tb.imn;
import tb.iuj;
import tb.kge;
import tb.noa;

/* loaded from: classes8.dex */
public class c implements iuj<LinearLayout, ShopSearchBarPresenter> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private EditText f19414a;
    private TextView b;
    private TextView c;
    private ImageView d;
    private LinearLayout e;
    private LinearLayout f;
    private ShopSearchBarPresenter g;
    private TextView h;
    private Handler i = new Handler(Looper.getMainLooper());
    private boolean j = false;

    static {
        kge.a(435784839);
        kge.a(1621305585);
    }

    @Override // tb.iuj
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        }
    }

    @Override // tb.iuj
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public static /* synthetic */ EditText a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("a2292676", new Object[]{cVar}) : cVar.f19414a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ LinearLayout b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.LinearLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ LinearLayout b(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c01d4bb4", new Object[]{this, context, viewGroup}) : a(context, viewGroup);
    }

    @Override // tb.iuj
    public void a(ShopSearchBarPresenter shopSearchBarPresenter, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2ff379", new Object[]{this, shopSearchBarPresenter, imnVar});
        } else {
            this.g = shopSearchBarPresenter;
        }
    }

    public LinearLayout a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("ff71cd76", new Object[]{this, context, viewGroup});
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.tbsearch_inshop_input_view, viewGroup, false);
        this.e = linearLayout;
        a(linearLayout);
        this.j = "true".equals(this.g.getWidget().getModel().b().get(noa.KEY_SEARCH_ELDER_HOME_OPEN));
        if (this.j) {
            EditText editText = this.f19414a;
            m mVar = m.INSTANCE;
            editText.setTextSize(1, m.a(14, true));
            this.b.getLayoutParams().width = l.a(87);
            this.b.getLayoutParams().height = l.a(30);
            TextView textView = this.b;
            m mVar2 = m.INSTANCE;
            textView.setTextSize(1, m.a(m.a.INSTANCE.a(), true));
            TextView textView2 = this.c;
            m mVar3 = m.INSTANCE;
            textView2.setTextSize(1, m.a(14, true));
        }
        return linearLayout;
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.f19414a = (EditText) view.findViewById(R.id.et_input);
        this.d = (ImageView) view.findViewById(R.id.iv_back);
        this.c = (TextView) view.findViewById(R.id.tv_delete);
        this.b = (TextView) view.findViewById(R.id.tv_search);
        this.f = (LinearLayout) view.findViewById(R.id.ll_input);
        this.h = (TextView) view.findViewById(R.id.photoBtn);
        this.f19414a.setOnEditorActionListener(this.g);
        this.d.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        if (!TextUtils.isEmpty(this.g.getDisplayHint())) {
            this.f19414a.setHint(this.g.getDisplayHint());
        }
        if (this.g.getDisplayQuery() != null) {
            this.f19414a.setText(this.g.getDisplayQuery());
        }
        this.d.setOnClickListener(this.g);
        this.c.setOnClickListener(this.g);
        this.b.setOnClickListener(this.g);
        this.h.setOnClickListener(this.g);
        this.f19414a.addTextChangedListener(this.g);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(view.getResources().getColor(R.color.orange));
        gradientDrawable.setCornerRadius(l.a(4));
        if (Build.VERSION.SDK_INT > 15) {
            this.b.setBackground(gradientDrawable);
        } else {
            this.b.setBackgroundDrawable(gradientDrawable);
        }
    }

    public LinearLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("660331bf", new Object[]{this}) : this.e;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f19414a == null || TextUtils.isEmpty(str)) {
        } else {
            this.f19414a.setHint(str);
        }
    }

    public void df_() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d4db224", new Object[]{this});
            return;
        }
        if (this.f19414a.getText() != null) {
            i = this.f19414a.getText().length();
        }
        this.f19414a.requestFocus();
        this.f19414a.setSelection(i);
        final InputMethodManager inputMethodManager = (InputMethodManager) Globals.getApplication().getSystemService("input_method");
        this.i.postDelayed(new Runnable() { // from class: com.taobao.search.searchdoor.shop.widget.bar.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    inputMethodManager.showSoftInput(c.a(c.this), 1);
                }
            }
        }, 100L);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.c;
        if (textView == null) {
            return;
        }
        if (!z) {
            i = 4;
        }
        textView.setVisibility(i);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.h;
        if (textView == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setBackgroundResource(R.drawable.tbsearch_style_searchbar_promotion);
        int a2 = l.a(6);
        this.f.setPadding(a2, 0, a2, 0);
        this.d.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.b.setBackgroundResource(R.drawable.tbsearch_search_btn_promotion);
        this.b.setTextColor(ContextCompat.getColor(Globals.getApplication(), R.color.tbsearch_search_btn_double11_textcolor));
    }

    public void e() {
        ShopSearchBarPresenter shopSearchBarPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        EditText editText = this.f19414a;
        if (editText == null || (shopSearchBarPresenter = this.g) == null) {
            return;
        }
        editText.removeTextChangedListener(shopSearchBarPresenter);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setBackgroundResource(R.drawable.tbsearch_searchbar_input_background);
        this.d.getDrawable().setColorFilter(ContextCompat.getColor(Globals.getApplication(), R.color.tf_D_black), PorterDuff.Mode.SRC_IN);
        this.b.setBackgroundResource(R.drawable.tbsearch_search_btn);
        this.b.setTextColor(ContextCompat.getColor(Globals.getApplication(), R.color.tbsearch_white));
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        EditText editText = this.f19414a;
        if (editText == null || str == null) {
            return;
        }
        editText.setText(str);
        this.f19414a.setSelection(str.length());
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (this.f19414a == null) {
        } else {
            b(str);
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        EditText editText = this.f19414a;
        return (editText == null || editText.getText() == null) ? "" : this.f19414a.getText().toString().trim();
    }
}
