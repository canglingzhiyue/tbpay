package com.taobao.live.home.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.tio;

/* loaded from: classes7.dex */
public class LiveTabView extends LinearLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_COUNT = 4;
    private int mClickCount;
    private int mCurPos;
    private Handler mHandler;
    private a mOnTabClickListener;
    private List<View> mTabViews;
    private List<b> mTabs;

    /* loaded from: classes7.dex */
    public interface a {
        boolean a();
    }

    /* loaded from: classes7.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f17763a;
        public int b;
        public String c;
        public String d;
        public int e;
        public int f;
        public boolean g = false;
        public boolean h = false;
        public String i;
    }

    public static /* synthetic */ Object ipc$super(LiveTabView liveTabView, String str, Object... objArr) {
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

    public static /* synthetic */ int access$002(LiveTabView liveTabView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a5d12", new Object[]{liveTabView, new Integer(i)})).intValue();
        }
        liveTabView.mClickCount = i;
        return i;
    }

    public LiveTabView(Context context) {
        super(context);
        this.mTabViews = new ArrayList(4);
        this.mTabs = new ArrayList(4);
        this.mClickCount = 0;
        this.mCurPos = -1;
        init();
    }

    public LiveTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTabViews = new ArrayList(4);
        this.mTabs = new ArrayList(4);
        this.mClickCount = 0;
        this.mCurPos = -1;
        init();
    }

    public LiveTabView(Context context, AttributeSet attributeSet, int i) {
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
            ipChange.ipc$dispatch("8e85a771", new Object[]{this, aVar});
        } else {
            this.mOnTabClickListener = aVar;
        }
    }

    public void addTab(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e344e4", new Object[]{this, bVar});
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.live_tab_view, (ViewGroup) this, false);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.live_tab_img);
        TextView textView = (TextView) inflate.findViewById(R.id.live_tab_title);
        if (!tio.a(bVar.c)) {
            tUrlImageView.setImageUrl(bVar.c);
        } else {
            tUrlImageView.setImageResource(bVar.f17763a);
        }
        textView.setText(bVar.i);
        textView.setTextColor(bVar.e);
        inflate.setTag(Integer.valueOf(this.mTabViews.size()));
        inflate.setOnClickListener(this);
        this.mTabViews.add(inflate);
        this.mTabs.add(bVar);
        addView(inflate);
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
            return (b) ipChange.ipc$dispatch("a4509c8c", new Object[]{this, new Integer(i)});
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
        boolean z = aVar != null && !aVar.a();
        if (this.mCurPos == intValue && z) {
            this.mClickCount++;
            int i = this.mClickCount;
            if (1 == i) {
                if (this.mHandler == null) {
                    this.mHandler = new Handler();
                }
                this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.live.home.view.LiveTabView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            LiveTabView.access$002(LiveTabView.this, 0);
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
                    if (!tio.a(bVar.d)) {
                        tUrlImageView.setImageUrl(bVar.d);
                    } else {
                        tUrlImageView.setImageResource(bVar.b);
                    }
                    if (bVar.h) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                    }
                    textView.setTextColor(bVar.f);
                } else {
                    if (!tio.a(bVar.c)) {
                        tUrlImageView.setImageUrl(bVar.c);
                    } else {
                        tUrlImageView.setImageResource(bVar.f17763a);
                    }
                    if (bVar.g) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                    }
                    textView.setTextColor(bVar.e);
                }
            }
        }
    }
}
