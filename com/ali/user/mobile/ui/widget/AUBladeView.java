package com.ali.user.mobile.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.support.media.ExifInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class AUBladeView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String[] b;
    private int choose;
    public Runnable dismissRunnable;
    private Handler handler;
    private OnItemClickListener mOnItemClickListener;
    private TextView mPopupText;
    private PopupWindow mPopupWindow;
    private Paint paint;
    private boolean showBkg;

    /* loaded from: classes2.dex */
    public interface OnItemClickListener {
        void onItemClick(String str);
    }

    static {
        kge.a(2023130353);
    }

    public static /* synthetic */ Object ipc$super(AUBladeView aUBladeView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != -1117127205) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public static /* synthetic */ PopupWindow access$000(AUBladeView aUBladeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("a524eafb", new Object[]{aUBladeView}) : aUBladeView.mPopupWindow;
    }

    public void setArray(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fd9041", new Object[]{this, strArr});
        } else {
            this.b = strArr;
        }
    }

    public AUBladeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new String[]{"★", "A", "B", "C", TLogTracker.LEVEL_DEBUG, "E", UTConstant.Args.UT_SUCCESS_F, "G", "H", TLogTracker.LEVEL_INFO, "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", "V", "W", "X", "Y", "Z"};
        this.choose = -1;
        this.paint = new Paint();
        this.showBkg = false;
        this.handler = new Handler();
        this.dismissRunnable = new Runnable() { // from class: com.ali.user.mobile.ui.widget.AUBladeView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (AUBladeView.access$000(AUBladeView.this) == null) {
                } else {
                    try {
                        AUBladeView.access$000(AUBladeView.this).dismiss();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        initPop(context);
    }

    public AUBladeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new String[]{"★", "A", "B", "C", TLogTracker.LEVEL_DEBUG, "E", UTConstant.Args.UT_SUCCESS_F, "G", "H", TLogTracker.LEVEL_INFO, "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", "V", "W", "X", "Y", "Z"};
        this.choose = -1;
        this.paint = new Paint();
        this.showBkg = false;
        this.handler = new Handler();
        this.dismissRunnable = new Runnable() { // from class: com.ali.user.mobile.ui.widget.AUBladeView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (AUBladeView.access$000(AUBladeView.this) == null) {
                } else {
                    try {
                        AUBladeView.access$000(AUBladeView.this).dismiss();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        initPop(context);
    }

    public AUBladeView(Context context) {
        super(context);
        this.b = new String[]{"★", "A", "B", "C", TLogTracker.LEVEL_DEBUG, "E", UTConstant.Args.UT_SUCCESS_F, "G", "H", TLogTracker.LEVEL_INFO, "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", "V", "W", "X", "Y", "Z"};
        this.choose = -1;
        this.paint = new Paint();
        this.showBkg = false;
        this.handler = new Handler();
        this.dismissRunnable = new Runnable() { // from class: com.ali.user.mobile.ui.widget.AUBladeView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (AUBladeView.access$000(AUBladeView.this) == null) {
                } else {
                    try {
                        AUBladeView.access$000(AUBladeView.this).dismiss();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        initPop(context);
    }

    private void initPop(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f1761a0", new Object[]{this, context});
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.aliuser_letter_popupwindow, (ViewGroup) null);
        this.mPopupWindow = new PopupWindow(inflate, -2, -2);
        this.mPopupText = (TextView) inflate.findViewById(R.id.letterText);
        this.mPopupWindow.setFocusable(true);
        this.mPopupWindow.setOutsideTouchable(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.showBkg) {
            canvas.drawColor(Color.parseColor("#00000000"));
        }
        int height = getHeight();
        int width = getWidth();
        int length = height / this.b.length;
        for (int i = 0; i < this.b.length; i++) {
            this.paint.setColor(Color.parseColor("#999999"));
            this.paint.setAntiAlias(true);
            if (height < 400) {
                this.paint.setTextSize(getResources().getDimension(R.dimen.aliuser_letters_item_little_fontsize));
            } else {
                this.paint.setTextSize(getResources().getDimension(R.dimen.aliuser_textsize_smallest));
            }
            if (i == this.choose) {
                this.paint.setColor(getResources().getColor(R.color.aliuser_region_chosen_color));
            }
            canvas.drawText(this.b[i], (width / 2) - (this.paint.measureText(this.b[i]) / 2.0f), (length * i) + length, this.paint);
            this.paint.reset();
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        int i = this.choose;
        int height = getHeight();
        String[] strArr = this.b;
        int length = (int) ((y / ((height / strArr.length) * strArr.length)) * strArr.length);
        if (length >= 0 && length < strArr.length) {
            this.mPopupWindow.showAtLocation(this, 17, 0, 0);
            this.mPopupText.setText(this.b[length]);
        }
        if (action == 0) {
            this.showBkg = true;
            if (i != length && length >= 0 && length < this.b.length) {
                performItemClicked(length);
                this.choose = length;
                invalidate();
            }
        } else if (action != 1) {
            if (action == 2 && i != length && length >= 0 && length < this.b.length) {
                performItemClicked(length);
                this.choose = length;
                invalidate();
            }
        } else {
            this.showBkg = false;
            this.choose = -1;
            dismissPopup();
            invalidate();
        }
        return true;
    }

    private void dismissPopup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16a167c9", new Object[]{this});
        } else {
            this.handler.postDelayed(this.dismissRunnable, 800L);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue() : super.onTouchEvent(motionEvent);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116e107b", new Object[]{this, onItemClickListener});
        } else {
            this.mOnItemClickListener = onItemClickListener;
        }
    }

    private void performItemClicked(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854b03c9", new Object[]{this, new Integer(i)});
            return;
        }
        OnItemClickListener onItemClickListener = this.mOnItemClickListener;
        if (onItemClickListener == null) {
            return;
        }
        onItemClickListener.onItemClick(this.b[i]);
    }
}
