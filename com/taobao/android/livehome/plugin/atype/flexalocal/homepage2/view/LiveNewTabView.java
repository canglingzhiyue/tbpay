package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.c;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.l;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class LiveNewTabView extends LinearLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_COUNT = 4;
    private int mClickCount;
    private int mCurPos;
    private Handler mHandler;
    private a mOnTabClickListener;
    private List<View> mTabViews;
    private List<b> mTabs;

    /* loaded from: classes6.dex */
    public interface a {
        void a(View view, int i);

        void b(View view, int i);

        boolean i();
    }

    static {
        kge.a(-855427240);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(LiveNewTabView liveNewTabView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public static /* synthetic */ int access$002(LiveNewTabView liveNewTabView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68edfee6", new Object[]{liveNewTabView, new Integer(i)})).intValue();
        }
        liveNewTabView.mClickCount = i;
        return i;
    }

    public LiveNewTabView(Context context) {
        super(context);
        this.mTabViews = new ArrayList(4);
        this.mTabs = new ArrayList(4);
        this.mClickCount = 0;
        this.mCurPos = -1;
        init();
    }

    public LiveNewTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTabViews = new ArrayList(4);
        this.mTabs = new ArrayList(4);
        this.mClickCount = 0;
        this.mCurPos = -1;
        init();
    }

    public LiveNewTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTabViews = new ArrayList(4);
        this.mTabs = new ArrayList(4);
        this.mClickCount = 0;
        this.mCurPos = -1;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOrientation(0);
        setGravity(17);
    }

    public void setOnTabClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987c891d", new Object[]{this, aVar});
        } else {
            this.mOnTabClickListener = aVar;
        }
    }

    public void addTab(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70fd890", new Object[]{this, bVar});
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.live_tab_view_flexalocal, (ViewGroup) this, false);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.live_tab_img);
        TextView textView = (TextView) inflate.findViewById(R.id.live_tab_title);
        if (!l.a((CharSequence) bVar.f14212a)) {
            tUrlImageView.setImageUrl(bVar.f14212a);
        }
        textView.setText(bVar.g);
        textView.setTextColor(bVar.c);
        inflate.setTag(Integer.valueOf(this.mTabViews.size()));
        inflate.setOnClickListener(this);
        this.mTabViews.add(inflate);
        this.mTabs.add(bVar);
        addView(inflate);
    }

    public View getTabView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ff7d487a", new Object[]{this, new Integer(i)});
        }
        List<View> list = this.mTabViews;
        if (list != null && list.size() != 0 && i >= 0 && i < this.mTabViews.size()) {
            return this.mTabViews.get(i);
        }
        return null;
    }

    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
            return;
        }
        if (i >= this.mTabViews.size() || i < 0) {
            i = 0;
        }
        if (i == this.mTabViews.size()) {
            return;
        }
        this.mTabViews.get(i).performClick();
        updateState(i);
    }

    public b getTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8225efb8", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.mTabs.size()) {
            return this.mTabs.get(i);
        }
        return null;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.mTabs.clear();
        this.mTabViews.clear();
        this.mCurPos = -1;
        removeAllViewsInLayout();
    }

    public void reLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b672e144", new Object[]{this});
        } else if (!this.mTabViews.isEmpty()) {
            int size = getResources().getDisplayMetrics().widthPixels / this.mTabViews.size();
            for (int i = 0; i < this.mTabViews.size(); i++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(size, -1);
                View view = this.mTabViews.get(i);
                if (view != null) {
                    view.setLayoutParams(layoutParams);
                }
            }
            requestLayout();
            invalidate();
        }
    }

    public void reLayoutAdaptiveMarketing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649399a", new Object[]{this});
        } else if (!this.mTabViews.isEmpty()) {
            int size = getResources().getDisplayMetrics().widthPixels / (this.mTabViews.size() + 1);
            for (int i = 0; i < this.mTabViews.size(); i++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(size, -1);
                View view = this.mTabViews.get(i);
                if (view != null) {
                    if (i == 1) {
                        layoutParams.rightMargin = size / 2;
                    } else if (i == 2) {
                        layoutParams.leftMargin = size / 2;
                    }
                    view.setLayoutParams(layoutParams);
                }
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        a aVar = this.mOnTabClickListener;
        boolean z = aVar != null && !aVar.i();
        if (this.mCurPos == intValue && z) {
            a aVar2 = this.mOnTabClickListener;
            if (aVar2 != null) {
                aVar2.b(view, intValue);
            }
            this.mClickCount++;
            int i = this.mClickCount;
            if (1 == i) {
                if (this.mHandler == null) {
                    this.mHandler = new Handler();
                }
                this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.LiveNewTabView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            LiveNewTabView.access$002(LiveNewTabView.this, 0);
                        }
                    }
                }, 250L);
                return;
            } else if (2 != i) {
                return;
            } else {
                this.mClickCount = 0;
                return;
            }
        }
        this.mCurPos = intValue;
        a aVar3 = this.mOnTabClickListener;
        if (aVar3 != null) {
            aVar3.a(view, intValue);
        }
        updateState(intValue);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mTabViews.clear();
        this.mTabs.clear();
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        reLayout();
    }

    public void updateState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3165b14", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < this.mTabViews.size(); i2++) {
            View view = this.mTabViews.get(i2);
            if (view != null) {
                TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.live_tab_img);
                TextView textView = (TextView) view.findViewById(R.id.live_tab_title);
                b bVar = this.mTabs.get(i2);
                if (i == i2) {
                    if (!l.a((CharSequence) bVar.b)) {
                        tUrlImageView.setImageUrl(bVar.b);
                    }
                    if (bVar.f) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                    }
                    textView.setTextColor(bVar.d);
                    textView.setTypeface(Typeface.defaultFromStyle(1));
                } else {
                    if (!l.a((CharSequence) bVar.f14212a)) {
                        tUrlImageView.setImageUrl(bVar.f14212a);
                    }
                    if (bVar.e) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                    }
                    textView.setTextColor(bVar.c);
                    textView.setTypeface(Typeface.defaultFromStyle(0));
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f14212a;
        public String b;
        public int c;
        public int d;
        public boolean e = false;
        public boolean f = false;
        public String g;

        static {
            kge.a(-1619431383);
        }

        public b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("eb5f650d", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2b8a4bce", new Object[]{this, str});
            }
            this.f14212a = str;
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6bb5328f", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3eb215f6", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public b b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("76a2f115", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }
    }

    public void updateTab(int i, b bVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a39d809b", new Object[]{this, new Integer(i), bVar});
        } else if (i >= this.mTabViews.size() || (view = this.mTabViews.get(i)) == null) {
        } else {
            TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.live_tab_img);
            TextView textView = (TextView) view.findViewById(R.id.live_tab_title);
            if (tUrlImageView == null || textView == null || this.mTabs == null) {
                return;
            }
            tUrlImageView.setImageUrl(bVar.f14212a);
            textView.setText(bVar.g);
            textView.setTextColor(bVar.c);
            invalidate();
            this.mTabs.set(i, bVar);
        }
    }

    public void setTabCornerMark(int i, TabManager.TabBottom tabBottom) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9771736b", new Object[]{this, new Integer(i), tabBottom});
        } else if ((this.mTabViews == null && tabBottom == null) || tabBottom.subscriptInfo == null || i >= this.mTabViews.size() || (view = this.mTabViews.get(i)) == null) {
        } else {
            if (!TextUtils.isEmpty(tabBottom.subscriptInfo.getString("backgroundPicUrl"))) {
                TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.live_tab_corner_mark_img);
                if (tUrlImageView == null) {
                    return;
                }
                if (tabBottom.isSelected) {
                    tUrlImageView.setVisibility(8);
                    return;
                }
                tUrlImageView.setImageUrl(tabBottom.subscriptInfo.getString("backgroundPicUrl"));
                if (tabBottom.subscriptInfo.getBoolean("animation") != null && tabBottom.subscriptInfo.getBoolean("animation").booleanValue()) {
                    tUrlImageView.setSkipAutoSize(true);
                }
                tUrlImageView.setVisibility(0);
                return;
            }
            TextView textView = (TextView) view.findViewById(R.id.live_tab_corner_mark_text);
            if (textView == null) {
                return;
            }
            if (tabBottom.isSelected) {
                textView.setVisibility(8);
                return;
            }
            String string = tabBottom.subscriptInfo.getString("title");
            if (string.length() <= 4) {
                if (string.length() == 1) {
                    float f = getResources().getDisplayMetrics().density;
                    int i2 = (int) (5.0f * f);
                    int i3 = (int) (f * 1.0f);
                    textView.setPadding(i2, i3, i2, i3);
                    textView.requestLayout();
                }
                if (i == this.mTabViews.size() - 1 && string.length() == 4) {
                    ((RelativeLayout.LayoutParams) textView.getLayoutParams()).setMarginStart((c.a() * 35) / 750);
                }
                textView.setText(string);
            }
            textView.setVisibility(0);
        }
    }
}
