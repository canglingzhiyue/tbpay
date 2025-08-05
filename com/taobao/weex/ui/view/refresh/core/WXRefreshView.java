package com.taobao.weex.ui.view.refresh.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXThread;
import com.taobao.weex.ui.view.refresh.circlebar.CircleProgressBar;
import tb.kge;

/* loaded from: classes9.dex */
public class WXRefreshView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CircleProgressBar circleProgressBar;
    private LinearLayout linearLayout;

    static {
        kge.a(1909428525);
    }

    public static /* synthetic */ CircleProgressBar access$002(WXRefreshView wXRefreshView, CircleProgressBar circleProgressBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CircleProgressBar) ipChange.ipc$dispatch("b5b3de9f", new Object[]{wXRefreshView, circleProgressBar});
        }
        wXRefreshView.circleProgressBar = circleProgressBar;
        return circleProgressBar;
    }

    public static /* synthetic */ LinearLayout access$100(WXRefreshView wXRefreshView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("d77691f1", new Object[]{wXRefreshView}) : wXRefreshView.linearLayout;
    }

    public WXRefreshView(Context context) {
        super(context);
        setupViews();
    }

    public WXRefreshView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setupViews();
    }

    public WXRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setupViews();
    }

    private void setupViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142219f8", new Object[]{this});
            return;
        }
        this.linearLayout = new LinearLayout(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.linearLayout.setOrientation(1);
        this.linearLayout.setGravity(17);
        addView(this.linearLayout, layoutParams);
    }

    public void setContentGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a2b8525", new Object[]{this, new Integer(i)});
            return;
        }
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setGravity(i);
    }

    public void setRefreshView(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283860cd", new Object[]{this, view});
        } else if (view == null) {
        } else {
            post(WXThread.secure(new Runnable() { // from class: com.taobao.weex.ui.view.refresh.core.WXRefreshView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    View view2 = view;
                    if (view2.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) view2;
                        if (i >= viewGroup.getChildCount()) {
                            WXRefreshView.access$100(WXRefreshView.this).addView(view2);
                            return;
                        }
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof CircleProgressBar) {
                            WXRefreshView.access$002(WXRefreshView.this, (CircleProgressBar) childAt);
                        }
                        i++;
                    }
                }
            }));
        }
    }

    public void setProgressBgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb14b24d", new Object[]{this, new Integer(i)});
            return;
        }
        CircleProgressBar circleProgressBar = this.circleProgressBar;
        if (circleProgressBar == null) {
            return;
        }
        circleProgressBar.setBackgroundColor(i);
    }

    public void setProgressColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5260e3e8", new Object[]{this, new Integer(i)});
            return;
        }
        CircleProgressBar circleProgressBar = this.circleProgressBar;
        if (circleProgressBar == null) {
            return;
        }
        circleProgressBar.setColorSchemeColors(i);
    }

    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
            return;
        }
        CircleProgressBar circleProgressBar = this.circleProgressBar;
        if (circleProgressBar == null) {
            return;
        }
        circleProgressBar.start();
    }

    public void setStartEndTrim(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb471764", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        CircleProgressBar circleProgressBar = this.circleProgressBar;
        if (circleProgressBar == null) {
            return;
        }
        circleProgressBar.setStartEndTrim(f, f2);
    }

    public void stopAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230f929", new Object[]{this});
            return;
        }
        CircleProgressBar circleProgressBar = this.circleProgressBar;
        if (circleProgressBar == null) {
            return;
        }
        circleProgressBar.stop();
    }

    public void setProgressRotation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a706ec", new Object[]{this, new Float(f)});
            return;
        }
        CircleProgressBar circleProgressBar = this.circleProgressBar;
        if (circleProgressBar == null) {
            return;
        }
        circleProgressBar.setProgressRotation(f);
    }
}
