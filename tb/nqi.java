package tb;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.s;
import com.taobao.search.mmd.recommendtip.FlowLayout;
import com.taobao.search.mmd.util.d;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.e;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.util.List;
import tb.itb;
import tb.nqw;

/* loaded from: classes7.dex */
public class nqi extends nqj<ActivateCellBean, e> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final itb.a CREATOR;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final int m;
    private static final int n;

    /* renamed from: a  reason: collision with root package name */
    public TextView f31662a;
    public TIconFontTextView e;
    public FlowLayout f;
    public TextView g;

    public static /* synthetic */ Object ipc$super(nqi nqiVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-569675187);
        kge.a(-1201612728);
        i = l.a(10);
        j = l.a(10);
        k = l.a(16);
        l = l.a(5);
        m = l.a(12);
        n = l.a(5);
        CREATOR = new itb.a() { // from class: tb.nqi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public nqi a(itb.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (nqi) ipChange.ipc$dispatch("f4319bbd", new Object[]{this, bVar}) : new nqi(R.layout.tbsearch_sf_activate_group_discovery, bVar.f29303a, bVar.b, bVar.c, (e) bVar.f);
            }
        };
    }

    public nqi(int i2, Activity activity, ium iumVar, ViewGroup viewGroup, e eVar) {
        super(LayoutInflater.from(activity).inflate(i2, viewGroup, false), activity, iumVar, eVar);
        b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f31662a = (TextView) this.itemView.findViewById(R.id.group_title);
        this.e = (TIconFontTextView) this.itemView.findViewById(R.id.close_btn);
        this.e.setOnClickListener(this);
        this.f = (FlowLayout) this.itemView.findViewById(R.id.activate_item_container);
        this.g = (TextView) this.itemView.findViewById(R.id.close_hint);
        this.g.setVisibility(8);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.itemView.getLayoutParams() != null) {
            this.itemView.getLayoutParams().height = 0;
            this.itemView.requestLayout();
        } else {
            this.itemView.setVisibility(8);
        }
    }

    @Override // tb.nqj
    public void a(int i2, ActivateCellBean activateCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa535e2", new Object[]{this, new Integer(i2), activateCellBean});
        } else if (activateCellBean == null) {
            c();
        } else if (activateCellBean.activateItems == null || activateCellBean.activateItems.size() == 0) {
            c();
        } else {
            this.e.setVisibility(0);
            this.f31662a.setText(activateCellBean.name);
            this.e.setTag(activateCellBean);
            if (s.a(f(activateCellBean.type), false)) {
                b(activateCellBean.name);
            } else {
                a(activateCellBean.activateItems, String.valueOf(activateCellBean.rownnum));
                d(activateCellBean.name);
            }
            if (!TextUtils.isEmpty(activateCellBean.name)) {
                this.f31662a.setText(activateCellBean.name);
            }
            this.itemView.setVisibility(0);
            this.itemView.getLayoutParams().height = -2;
        }
    }

    private void a(List<ActivateBean> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
            return;
        }
        this.f.removeAllViews();
        if (list == null) {
            return;
        }
        this.f.setMaxLines(TextUtils.isEmpty(str) ? Integer.MAX_VALUE : Integer.parseInt(str));
        for (ActivateBean activateBean : list) {
            if (activateBean != null) {
                View a2 = a(activateBean);
                a2.setOnClickListener(this);
                this.f.addView(a2);
            }
        }
    }

    public View a(ActivateBean activateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a4c3af8a", new Object[]{this, activateBean});
        }
        LinearLayout linearLayout = new LinearLayout(this.b);
        linearLayout.setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setLayoutParams(marginLayoutParams);
        marginLayoutParams.setMargins(0, i, j, 0);
        linearLayout.setTag(activateBean);
        int i2 = m;
        linearLayout.setPadding(i2, 0, i2, 0);
        linearLayout.setBackgroundDrawable(this.b.getResources().getDrawable(R.drawable.tbsearch_activate_tag_background));
        TextView textView = new TextView(this.b);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = n;
        textView.setLayoutParams(layoutParams);
        textView.setTextColor(this.b.getResources().getColor(R.color.black_33));
        textView.setText(activateBean.keyword);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        linearLayout.addView(textView);
        if (!TextUtils.isEmpty(activateBean.tagText)) {
            TextView textView2 = new TextView(this.b);
            textView2.setTextSize(1, 10.0f);
            textView2.setTextColor(d.a(activateBean.tagColor, -1));
            textView2.setText(activateBean.tagText);
            int a2 = l.a(3);
            textView2.setPadding(a2, 0, a2, 0);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(l.a(0.5f), d.a(activateBean.tagBorderColor, -1));
            gradientDrawable.setColor(d.a(activateBean.tagBgColor, -1));
            gradientDrawable.setCornerRadius(l.a(3));
            ViewCompat.setBackground(textView2, gradientDrawable);
            linearLayout.addView(textView2);
        }
        return linearLayout;
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        this.f.setVisibility(8);
        this.e.setText(R.string.uik_icon_attention_forbid);
        if (!TextUtils.isEmpty(str)) {
            TextView textView = this.g;
            textView.setText("当前" + str + "已隐藏");
            TIconFontTextView tIconFontTextView = this.e;
            tIconFontTextView.setContentDescription(b.a(R.string.taobao_app_1005_1_16694) + str);
        } else {
            this.g.setText("当前内容已隐藏");
            this.e.setContentDescription(b.a(R.string.taobao_app_1005_1_16658));
        }
        this.g.setVisibility(0);
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.g.startAnimation(alphaAnimation);
        b(str);
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        this.f.setVisibility(0);
        this.e.setText(R.string.uik_icon_attention);
        if (TextUtils.isEmpty(str)) {
            this.e.setContentDescription("隐藏当前内容");
        } else {
            TIconFontTextView tIconFontTextView = this.e;
            tIconFontTextView.setContentDescription(b.a(R.string.taobao_app_1005_1_16647) + str);
        }
        this.g.setVisibility(8);
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.f.startAnimation(alphaAnimation);
        d(str);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == this.e.getId()) {
            Object tag = view.getTag();
            if (!(tag instanceof ActivateCellBean)) {
                return;
            }
            a((ActivateCellBean) tag);
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                i2 = viewGroup.indexOfChild(view);
            }
            Object tag2 = view.getTag();
            if (!(tag2 instanceof ActivateBean)) {
                return;
            }
            postEvent(nqw.a.a((ActivateBean) tag2, i2, ((ActivateCellBean) this.h).suggestRn));
        }
    }

    private void a(ActivateCellBean activateCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d87ba35", new Object[]{this, activateCellBean});
        } else if (activateCellBean == null) {
            Log.e("ActivateGroupWidget", "activate group is null");
        } else if (TextUtils.isEmpty(activateCellBean.type)) {
            Log.e("ActivateGroupWidget", "activate group type is empty");
        } else {
            String f = f(activateCellBean.type);
            boolean z = !s.a(f, false);
            if (z) {
                c(activateCellBean.name);
            } else {
                a(activateCellBean.activateItems, String.valueOf(activateCellBean.rownnum));
                e(activateCellBean.name);
            }
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("isHide", String.valueOf(z));
            com.taobao.search.mmd.util.e.a("HideActivate", (ArrayMap<String, String>) arrayMap);
            String str = "close " + activateCellBean.type + " " + z;
            s.b(f, z);
        }
    }

    private static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "activate_closed_";
        }
        return "activate_closed_" + str;
    }
}
