package com.taobao.android.detail.ttdetail.widget.desc.picgallery;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.taobao.R;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class IndexView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int DEFAULT_INDEX_HEIGHT;
    private static final int DEFAULT_INDEX_MARGIN;
    private static final int DEFAULT_INDEX_WIDTH;
    public static int MAX_DOT_NUM;
    private int mIndexBottomMargin;
    private int mIndexHeight;
    private int mIndexMargin;
    private RectF mIndexRect;
    private int mIndexWidth;
    private int mSelectedIndex;
    private Drawable mSelectedIndexDrawable;
    private int mSelectedIndexResId;
    private int mTotalCount;
    private Drawable mUnselectedIndexDrawable;
    private int mUnselectedIndexResId;

    public static /* synthetic */ Object ipc$super(IndexView indexView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-246686602);
        MAX_DOT_NUM = 6;
        DEFAULT_INDEX_WIDTH = f.a(8.0f);
        DEFAULT_INDEX_HEIGHT = f.a(8.0f);
        DEFAULT_INDEX_MARGIN = f.a(8.0f);
    }

    public IndexView(Context context) {
        super(context);
        this.mSelectedIndex = 0;
        this.mTotalCount = 0;
        this.mSelectedIndexResId = R.drawable.tt_detail_index_dot_selected;
        this.mUnselectedIndexResId = R.drawable.tt_detail_index_dot_normal;
        int i = DEFAULT_INDEX_WIDTH;
        this.mIndexWidth = i;
        int i2 = DEFAULT_INDEX_HEIGHT;
        this.mIndexHeight = i2;
        this.mIndexMargin = DEFAULT_INDEX_MARGIN;
        this.mIndexBottomMargin = 0;
        this.mIndexRect = new RectF(0.0f, 0.0f, i, i2);
        init(context);
    }

    public IndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mSelectedIndex = 0;
        this.mTotalCount = 0;
        this.mSelectedIndexResId = R.drawable.tt_detail_index_dot_selected;
        this.mUnselectedIndexResId = R.drawable.tt_detail_index_dot_normal;
        int i = DEFAULT_INDEX_WIDTH;
        this.mIndexWidth = i;
        int i2 = DEFAULT_INDEX_HEIGHT;
        this.mIndexHeight = i2;
        this.mIndexMargin = DEFAULT_INDEX_MARGIN;
        this.mIndexBottomMargin = 0;
        this.mIndexRect = new RectF(0.0f, 0.0f, i, i2);
        init(context);
    }

    public IndexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSelectedIndex = 0;
        this.mTotalCount = 0;
        this.mSelectedIndexResId = R.drawable.tt_detail_index_dot_selected;
        this.mUnselectedIndexResId = R.drawable.tt_detail_index_dot_normal;
        int i2 = DEFAULT_INDEX_WIDTH;
        this.mIndexWidth = i2;
        int i3 = DEFAULT_INDEX_HEIGHT;
        this.mIndexHeight = i3;
        this.mIndexMargin = DEFAULT_INDEX_MARGIN;
        this.mIndexBottomMargin = 0;
        this.mIndexRect = new RectF(0.0f, 0.0f, i2, i3);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        Resources resources = context.getResources();
        int i = this.mSelectedIndexResId;
        if (i > 0) {
            this.mSelectedIndexDrawable = resources.getDrawable(i);
        }
        int i2 = this.mUnselectedIndexResId;
        if (i2 > 0) {
            this.mUnselectedIndexDrawable = resources.getDrawable(i2);
        }
        setTextColor(getResources().getColor(R.color.tt_detail_ff));
        setTextSize(1, 10.0f);
    }

    public void setSelectedIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74476c7", new Object[]{this, new Integer(i)});
            return;
        }
        this.mSelectedIndex = i;
        int i2 = this.mSelectedIndex;
        if (i2 < 0) {
            this.mSelectedIndex = 0;
            setVisibility(8);
            return;
        }
        int i3 = this.mTotalCount;
        if (i2 > i3 - 1) {
            this.mSelectedIndex = i3 - 1;
            setVisibility(8);
        } else if (i3 > MAX_DOT_NUM) {
            setBackgroundResource(R.drawable.tt_detail_image_viewer_index_bg);
            setText((this.mSelectedIndex + 1) + "/" + this.mTotalCount);
        } else {
            setText("");
            setBackgroundDrawable(null);
        }
    }

    public void setTotalCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6425d4f", new Object[]{this, new Integer(i)});
            return;
        }
        if (i <= 0) {
            i = 0;
        }
        this.mTotalCount = i;
        updateIndexLayout();
    }

    public void setSelectedIndexDrawable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f483dc9", new Object[]{this, new Integer(i)});
        } else if (i <= 0) {
        } else {
            this.mSelectedIndexResId = i;
            this.mSelectedIndexDrawable = odg.b().a().getResources().getDrawable(this.mSelectedIndexResId);
        }
    }

    public void setUnselectedIndexDrawable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d77d56a2", new Object[]{this, new Integer(i)});
        } else if (i <= 0) {
        } else {
            this.mUnselectedIndexResId = i;
            this.mUnselectedIndexDrawable = odg.b().a().getResources().getDrawable(this.mUnselectedIndexResId);
        }
    }

    public void setIndexWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185f0f06", new Object[]{this, new Integer(i)});
        } else if (i <= 0) {
        } else {
            this.mIndexWidth = i;
            this.mIndexRect.right = this.mIndexWidth;
            updateIndexLayout();
        }
    }

    public void setIndexHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f96b2e5", new Object[]{this, new Integer(i)});
        } else if (i <= 0) {
        } else {
            this.mIndexHeight = i;
            this.mIndexRect.bottom = this.mIndexHeight;
            updateIndexLayout();
        }
    }

    public void setIndexMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f97abe", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
        } else {
            this.mIndexMargin = i;
            updateIndexLayout();
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mIndexRect = null;
        this.mSelectedIndexDrawable = null;
        this.mUnselectedIndexDrawable = null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        int i2 = this.mTotalCount;
        if (i2 <= 1 || i2 > MAX_DOT_NUM || this.mSelectedIndexDrawable == null || this.mUnselectedIndexDrawable == null) {
            return;
        }
        int i3 = this.mIndexWidth + this.mIndexMargin;
        while (i < this.mTotalCount) {
            try {
                this.mIndexRect.offsetTo(i * i3, 0.0f);
                Drawable drawable = i == this.mSelectedIndex ? this.mSelectedIndexDrawable : this.mUnselectedIndexDrawable;
                drawable.setBounds((int) this.mIndexRect.left, (int) this.mIndexRect.top, (int) this.mIndexRect.right, (int) this.mIndexRect.bottom);
                drawable.draw(canvas);
                i++;
            } catch (Exception unused) {
                return;
            }
        }
    }

    public void setBottomMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ade7f01", new Object[]{this, new Integer(i)});
        } else {
            this.mIndexBottomMargin = i;
        }
    }

    private void updateIndexLayout() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad83351a", new Object[]{this});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i2 = this.mTotalCount;
        if (i2 <= MAX_DOT_NUM) {
            layoutParams.width = i2 == 0 ? 0 : (this.mIndexWidth * i2) + ((i2 - 1) * this.mIndexMargin);
            if (this.mTotalCount != 0) {
                i = this.mIndexHeight;
            }
            layoutParams.height = i + this.mIndexBottomMargin;
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
        setLayoutParams(layoutParams);
    }
}
