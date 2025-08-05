package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.util.d;
import com.taobao.search.sf.a;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public abstract class nvu<BEAN> extends ius<BEAN, RelativeLayout, a> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RelativeLayout f31793a;
    private int b;
    private int c;
    private ViewGroup d;

    static {
        kge.a(-1726732466);
        kge.a(-1201612728);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, android.widget.RelativeLayout] */
    @Override // tb.ius
    public /* synthetic */ RelativeLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : d();
    }

    public nvu(Activity activity, ium iumVar, a aVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, aVar, viewGroup, iurVar);
        ensureView();
    }

    @Override // tb.ius, tb.iup
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        this.f31793a.setContentDescription(b.a(R.string.taobao_app_1005_1_22844));
        this.f31793a.setOnClickListener(this);
        this.b = DensityUtil.dip2px(getActivity(), 60.0f);
        this.c = DensityUtil.dip2px(getActivity(), 21.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.d;
        if (viewGroup == 0) {
            return;
        }
        viewGroup.removeView(getView());
        ((RelativeLayout) getView()).removeAllViews();
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else if (viewGroup == null) {
        } else {
            viewGroup.addView(this.f31793a, new RelativeLayout.LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
            this.d = viewGroup;
        }
    }

    public TextView a(String str, int i, int i2, int i3, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("f8634ddc", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), onClickListener});
        }
        TextView textView = new TextView(getActivity());
        textView.setText(str);
        textView.setTextColor(i3);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setContentDescription(str);
        this.f31793a.addView(textView);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        int i4 = this.b;
        layoutParams.height = i4;
        layoutParams.width = i4;
        textView.setBackgroundResource(R.drawable.tbsearch_longpress_layer_round_button_bg);
        GradientDrawable gradientDrawable = (GradientDrawable) textView.getBackground();
        gradientDrawable.mutate();
        gradientDrawable.setGradientType(0);
        if (Build.VERSION.SDK_INT >= 16) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            gradientDrawable.setColors(new int[]{i, i2});
        } else {
            gradientDrawable.setColor(i);
        }
        textView.setOnClickListener(onClickListener);
        return textView;
    }

    public void b() {
        Animator ofFloat;
        IpChange ipChange = $ipChange;
        char c = 1;
        char c2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        boolean z = this.d.getWidth() > this.d.getHeight();
        a(z, this.f31793a.getChildCount());
        int childCount = this.f31793a.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            ofFloat = ViewAnimationUtils.createCircularReveal(this.f31793a, this.d.getWidth() / 2, this.d.getHeight() / 2, 0.0f, Math.max(this.d.getHeight(), this.d.getWidth()));
        } else {
            ofFloat = ObjectAnimator.ofFloat(this.f31793a, "alpha", 0.0f, 1.0f);
        }
        ofFloat.setDuration(300L);
        arrayList.add(ofFloat);
        String str = z ? "translationX" : "translationY";
        boolean z2 = childCount % 2 == 0;
        int i = this.c + this.b;
        int round = z2 ? Math.round(childCount / 2) - 1 : Math.round(childCount / 2);
        int i2 = z2 ? (-i) / 2 : 0;
        int i3 = 0;
        while (i3 < childCount) {
            if (i3 == round) {
                i2 = z2 ? (-i) / 2 : 0;
            } else {
                i2 = i3 > round ? i2 + i : i2 - i;
            }
            View childAt = this.f31793a.getChildAt(i3);
            float[] fArr = new float[2];
            fArr[c2] = 0.0f;
            fArr[c] = i2;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, str, fArr);
            ofFloat2.setDuration(300L);
            ofFloat2.setInterpolator(new OvershootInterpolator());
            arrayList.add(ofFloat2);
            i3++;
            c = 1;
            c2 = 0;
        }
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }

    public void a(TextView textView, boolean z, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268507a0", new Object[]{this, textView, new Boolean(z), str, str2, str3, str4});
        } else if (z) {
            textView.setTextColor(d.a(str2, Color.parseColor("#ffffff")));
            textView.setText(str);
            textView.setContentDescription(str);
        } else {
            textView.setTextColor(d.a(str4, Color.parseColor("#99ffffff")));
            textView.setText(str3);
            textView.setContentDescription(str3);
        }
    }

    public void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
        } else if (!z && i >= 4) {
            ArrayList arrayList = new ArrayList(4);
            for (int i2 = 0; i2 < 4; i2++) {
                arrayList.add(this.f31793a.getChildAt(i2));
            }
            this.f31793a.removeAllViews();
            for (int i3 = 0; i3 < 2; i3++) {
                LinearLayout linearLayout = new LinearLayout(getActivity());
                this.f31793a.addView(linearLayout);
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setOrientation(0);
                int i4 = i3 << 1;
                View view = (View) arrayList.get(i4 + 1);
                linearLayout.addView((View) arrayList.get(i4));
                linearLayout.addView(view);
                ((LinearLayout.LayoutParams) view.getLayoutParams()).setMargins(this.c, 0, 0, 0);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view != this.f31793a) {
        } else {
            a();
        }
    }

    public RelativeLayout d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("c366a2bb", new Object[]{this});
        }
        this.f31793a = (RelativeLayout) LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_longpress_layer_layout, (ViewGroup) null, false);
        this.f31793a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ium parent = getRoot().getParent();
        if ((parent instanceof nus) && ((nus) parent).x()) {
            this.f31793a.setBackgroundResource(R.drawable.tbsearch_inshop_longpress_2021_bg);
        }
        return this.f31793a;
    }
}
