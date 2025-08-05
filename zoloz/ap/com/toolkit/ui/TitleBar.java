package zoloz.ap.com.toolkit.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes.dex */
public class TitleBar extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mBackLayout;
    private TextView mTitleTextView;

    static {
        kge.a(1956048964);
    }

    public static /* synthetic */ Object ipc$super(TitleBar titleBar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TitleBar(Context context) {
        super(context);
    }

    public TitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = inflate(context, R.layout.layout_titile_bar, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TitleBar);
        obtainStyledAttributes.getString(R.styleable.TitleBar_z_text);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.TitleBar_z_left_src, -1);
        int color = obtainStyledAttributes.getColor(R.styleable.TitleBar_z_background, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.TitleBar_z_bg, -1);
        obtainStyledAttributes.getColor(R.styleable.TitleBar_z_text_color, -1);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.TitleBar_z_separate_visibility, true);
        boolean z2 = obtainStyledAttributes.getBoolean(R.styleable.TitleBar_z_custom, false);
        obtainStyledAttributes.recycle();
        this.mTitleTextView = (TextView) findViewById(R.id.tv_title);
        if (resourceId2 != -1) {
            inflate.setBackgroundResource(resourceId2);
        } else {
            inflate.setBackgroundColor(color);
        }
        setTextColor(-16777216);
        if (resourceId != -1) {
            setBackDrawable(getResources().getDrawable(resourceId));
        }
        if (!z) {
            findViewById(R.id.iv_separate).setVisibility(8);
            findViewById(R.id.iv_bar).setVisibility(8);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mTitleTextView.getLayoutParams();
        layoutParams.addRule(17, R.id.iv_separate);
        layoutParams.addRule(1, R.id.iv_separate);
        this.mTitleTextView.setLayoutParams(layoutParams);
        updateBackBtn(R.id.btn_left, R.id.iv_left, R.id.tv_left, z2);
        gone(R.id.btn_right);
    }

    private void updateBackBtn(int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e263c484", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        this.mBackLayout = findViewById(i);
        TextView textView = (TextView) findViewById(i3);
        String string = getResources().getString(R.string.title_back);
        if (TextUtils.isEmpty(string)) {
            gone(i3);
            visible(i2);
            return;
        }
        gone(i2);
        visible(i3);
        textView.setText(string);
        textView.setTextColor(getResources().getColor(R.color.title_back_color));
    }

    private void gone(int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ac5b34", new Object[]{this, iArr});
            return;
        }
        for (int i : iArr) {
            findViewById(i).setVisibility(8);
        }
    }

    private void visible(int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20160c7", new Object[]{this, iArr});
            return;
        }
        for (int i : iArr) {
            findViewById(i).setVisibility(0);
        }
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.mTitleTextView.setText(str);
        }
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            this.mTitleTextView.setTextColor(i);
        }
    }

    public void setClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c82c3f8", new Object[]{this, onClickListener});
        } else {
            this.mBackLayout.setOnClickListener(onClickListener);
        }
    }

    public void setBackDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27165d52", new Object[]{this, drawable});
        } else if (drawable == null) {
        } else {
            ((ImageView) findViewById(R.id.iv_left)).setImageDrawable(drawable);
            ((ImageView) findViewById(R.id.iv_right)).setImageDrawable(drawable);
        }
    }
}
