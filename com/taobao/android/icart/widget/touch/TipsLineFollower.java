package com.taobao.android.icart.widget.touch;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.widget.touch.DragFloatLayer;
import com.taobao.taobao.R;
import tb.bbz;
import tb.kge;

/* loaded from: classes5.dex */
public class TipsLineFollower extends FrameLayout implements DragFloatLayer.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bbz mCartPresenter;
    private final Context mContext;
    private final View mDownLine;
    private boolean mIsBlack;
    private boolean mIsFull;
    private Rect mLastChildRect;
    private Rect mLastDragRect;
    private a mOnShowInCardListener;
    private boolean mShowInCardUp;
    private String mText;
    private final TextView mTips;
    private final View mTipsLineLayout;
    private final View mUpLine;

    /* loaded from: classes5.dex */
    public interface a {
        void a(boolean z);
    }

    static {
        kge.a(-1646110612);
        kge.a(1606595255);
    }

    public static /* synthetic */ Object ipc$super(TipsLineFollower tipsLineFollower, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean isShowInCardUp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a3980c2", new Object[]{this})).booleanValue() : this.mShowInCardUp;
    }

    public TipsLineFollower(bbz bbzVar) {
        super(bbzVar.m());
        this.mShowInCardUp = false;
        this.mCartPresenter = bbzVar;
        this.mContext = bbzVar.m();
        this.mTipsLineLayout = LayoutInflater.from(this.mContext).inflate(R.layout.icart_drag_tips_line, this);
        this.mUpLine = this.mTipsLineLayout.findViewById(R.id.up_line);
        this.mDownLine = this.mTipsLineLayout.findViewById(R.id.down_line);
        this.mTips = (TextView) this.mTipsLineLayout.findViewById(R.id.line_enter_tips);
        setVisibility(8);
    }

    public void setData(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f68ffd", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mIsBlack = z2;
        this.mIsFull = z;
        this.mText = str;
        render();
    }

    private void render() {
        Rect rect;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        if (this.mLastChildRect == null || (rect = this.mLastDragRect) == null) {
            this.mShowInCardUp = false;
        } else {
            if (rect.top < this.mLastChildRect.top) {
                z = false;
            }
            this.mShowInCardUp = z;
        }
        move();
        if (TextUtils.isEmpty(this.mText)) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        this.mTips.setText(this.mText);
        int a2 = this.mIsFull ? 0 : this.mCartPresenter.x().a(6.0f);
        if (!this.mShowInCardUp) {
            this.mUpLine.setVisibility(0);
            this.mDownLine.setVisibility(8);
            if (this.mIsBlack) {
                this.mTips.setBackgroundResource(R.drawable.icart_drag_tips_line_down_dark);
            } else {
                this.mTips.setBackgroundResource(R.drawable.icart_drag_tips_line_down);
            }
        } else {
            this.mUpLine.setVisibility(8);
            this.mDownLine.setVisibility(0);
            if (this.mIsBlack) {
                this.mTips.setBackgroundResource(R.drawable.icart_drag_tips_line_up_dark);
            } else {
                this.mTips.setBackgroundResource(R.drawable.icart_drag_tips_line_up);
            }
        }
        if (this.mIsBlack) {
            this.mUpLine.setBackgroundColor(-5460820);
            this.mDownLine.setBackgroundColor(-5460820);
        } else {
            this.mUpLine.setBackgroundColor(-1152467);
            this.mDownLine.setBackgroundColor(-1152467);
        }
        if (this.mDownLine.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this.mDownLine.getLayoutParams()).leftMargin = a2;
            ((ViewGroup.MarginLayoutParams) this.mDownLine.getLayoutParams()).rightMargin = a2;
            this.mDownLine.requestLayout();
        }
        if (this.mUpLine.getLayoutParams() == null) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) this.mUpLine.getLayoutParams()).leftMargin = a2;
        ((ViewGroup.MarginLayoutParams) this.mUpLine.getLayoutParams()).rightMargin = a2;
        this.mUpLine.requestLayout();
    }

    private void move() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b46fd8", new Object[]{this});
            return;
        }
        Rect rect = this.mLastDragRect;
        if (rect == null) {
            return;
        }
        if (this.mShowInCardUp) {
            setTranslationY(rect.top - this.mTipsLineLayout.getHeight());
        } else {
            setTranslationY(rect.bottom);
        }
    }

    @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.d
    public void onViewPositionChanged(Rect rect, Rect rect2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8ee8ce", new Object[]{this, rect, rect2, new Integer(i), new Integer(i2)});
            return;
        }
        this.mLastChildRect = rect;
        this.mLastDragRect = rect2;
        move();
        a aVar = this.mOnShowInCardListener;
        if (aVar == null) {
            return;
        }
        aVar.a(this.mShowInCardUp);
    }

    public void setShowInCardUp(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e016199c", new Object[]{this, aVar});
        } else {
            this.mOnShowInCardListener = aVar;
        }
    }
}
