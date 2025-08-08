package com.taobao.relationship.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import tb.kge;
import tb.nme;
import tb.nmf;

/* loaded from: classes7.dex */
public class FollowButton extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private nme mConfig;
    private TIconFontTextView mFollowIcon;
    private TextView mFollowText;
    private boolean mIsFollow;

    static {
        kge.a(703240297);
    }

    public static /* synthetic */ Object ipc$super(FollowButton followButton, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public FollowButton(Context context) {
        super(context);
        init();
    }

    public FollowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public FollowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
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
        addFavIcon();
        addFavText();
        refreshView();
    }

    private void addFavIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3750b15a", new Object[]{this});
            return;
        }
        this.mFollowIcon = new TIconFontTextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        addView(this.mFollowIcon, layoutParams);
    }

    private void addFavText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("277a400e", new Object[]{this});
            return;
        }
        this.mFollowText = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        addView(this.mFollowText, layoutParams);
    }

    public void initWithConfig(nme nmeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462f1489", new Object[]{this, nmeVar});
            return;
        }
        this.mConfig = nmeVar;
        refreshView();
    }

    public void refreshView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbff70d", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsFollow = z;
        refreshView();
    }

    private void refreshView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979ad0a7", new Object[]{this});
            return;
        }
        if (this.mConfig == null) {
            this.mConfig = new nme();
        }
        refreshLayout(this.mIsFollow);
        refreshText(this.mIsFollow);
        refreshIcon(this.mIsFollow);
    }

    private void refreshLayout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d17c68", new Object[]{this, new Boolean(z)});
            return;
        }
        refreshLayout(z ? this.mConfig.c : this.mConfig.f31571a, z ? this.mConfig.d : this.mConfig.b);
        setBackgroundDrawable(getBackgroundDrawble(this.mIsFollow));
    }

    public void refreshLayout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c056c94c", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams() != null ? getLayoutParams() : new ViewGroup.LayoutParams(i, i2);
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
    }

    private void refreshText(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7baa4185", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.mFollowText;
        if (textView == null) {
            return;
        }
        textView.setTextColor(getTextColor(z));
        this.mFollowText.setTextSize(0, getTextSize(z));
        this.mFollowText.setText(getFollowText(z));
    }

    private void refreshIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a1f9b9", new Object[]{this, new Boolean(z)});
            return;
        }
        TIconFontTextView tIconFontTextView = this.mFollowIcon;
        if (tIconFontTextView == null) {
            return;
        }
        tIconFontTextView.setTextColor(getTextColor(this.mIsFollow));
        this.mFollowIcon.setTextSize(0, getIconSize(this.mIsFollow));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mFollowIcon.getLayoutParams();
        layoutParams.rightMargin = getIconPadding(z);
        this.mFollowIcon.setLayoutParams(layoutParams);
        String followIcon = getFollowIcon(this.mIsFollow);
        if (StringUtils.isEmpty(followIcon)) {
            this.mFollowIcon.setVisibility(8);
            return;
        }
        this.mFollowIcon.setVisibility(0);
        this.mFollowIcon.setText(followIcon);
    }

    private Drawable getBackgroundDrawble(boolean z) {
        GradientDrawable gradientDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("adcab840", new Object[]{this, new Boolean(z)});
        }
        if (this.mConfig == null) {
            this.mConfig = new nme();
        }
        if (this.mConfig.u && !z) {
            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{this.mConfig.v, this.mConfig.w});
        } else {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(getBackgroundColor(z));
        }
        gradientDrawable.setCornerRadius(getCornerRadius(z));
        int backgroundStrokeSize = getBackgroundStrokeSize(z);
        if (backgroundStrokeSize > 0) {
            gradientDrawable.setStroke(backgroundStrokeSize, z ? this.mConfig.i : this.mConfig.j);
        }
        return gradientDrawable;
    }

    private float getCornerRadius(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a631c380", new Object[]{this, new Boolean(z)})).floatValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new nme();
        }
        return z ? this.mConfig.q : this.mConfig.r;
    }

    private int getBackgroundStrokeSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9a1ea3", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new nme();
        }
        return z ? this.mConfig.o : this.mConfig.p;
    }

    private int getBackgroundColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1b181e1", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new nme();
        }
        return z ? this.mConfig.m : this.mConfig.n;
    }

    private int getLayoutWidth(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b5e0f5a", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new nme();
        }
        return z ? this.mConfig.c : this.mConfig.f31571a;
    }

    private int getTextColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("348acfa0", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new nme();
        }
        return z ? this.mConfig.i : this.mConfig.j;
    }

    private int getTextSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e888d15c", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new nme();
        }
        return z ? this.mConfig.e : this.mConfig.f;
    }

    private int getIconSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3c14f90", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new nme();
        }
        return z ? this.mConfig.g : this.mConfig.h;
    }

    private int getIconPadding(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a3c703e", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new nme();
        }
        return z ? this.mConfig.k : this.mConfig.l;
    }

    private String getFollowText(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef67b287", new Object[]{this, new Boolean(z)});
        }
        nme nmeVar = this.mConfig;
        return (nmeVar == null || !nmeVar.y) ? z ? nmf.TEXT_FOLLOW_DEFAULT : nmf.TEXT_UNFOLLOW_DEFAULT : z ? nmeVar.z : nmeVar.A;
    }

    private String getFollowIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3978e8d3", new Object[]{this, new Boolean(z)});
        }
        if (this.mConfig == null) {
            this.mConfig = new nme();
        }
        if (this.mConfig.t) {
            return Globals.getApplication().getString(z ? R.string.uik_icon_check : R.string.uik_icon_we);
        }
        return z ? "" : Globals.getApplication().getString(R.string.uik_icon_we);
    }
}
