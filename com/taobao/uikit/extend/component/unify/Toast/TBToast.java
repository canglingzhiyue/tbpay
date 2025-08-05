package com.taobao.uikit.extend.component.unify.Toast;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.app.NotificationManagerCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.utils.DeviceUtils;
import com.taobao.uikit.extend.utils.PermissionHelper;
import tb.kge;

/* loaded from: classes9.dex */
public class TBToast {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATION_DURATION = 300;
    private static final int ANIMATION_FADE_DURATION = 230;
    private static final String ERROR_CONTEXTNULL = " - You cannot use a null context.";
    private static final String ERROR_DURATIONTOOLONG = " - You should NEVER specify a duration greater than four and a half seconds for a TBToast.";
    private static final String TAG = "TBToast";
    public View mAnimView;
    public Context mContext;
    private TIconFontTextView mIconView;
    private TextView mMessage2TextView;
    private TextView mMessageTextView;
    private View mToastView;
    private WindowManager mWindowManager;
    private WindowManager.LayoutParams mWindowManagerParams;
    private int mYOffset;
    private int mGravity = 81;
    private long mDuration = 3000;
    private int mXOffset = 0;
    public boolean mLongClicked = false;

    /* loaded from: classes9.dex */
    public static class Duration {
        public static final long EXTRA_LONG = 4500;
        public static final long LONG = 3500;
        public static final long MEDIUM = 3000;
        public static final long SHORT = 2000;
        public static final long VERY_SHORT = 1500;

        static {
            kge.a(145388090);
        }
    }

    /* loaded from: classes9.dex */
    public interface OnClickListener {
        void onClick(View view, Parcelable parcelable);
    }

    static {
        kge.a(-43973282);
    }

    public TBToast(Context context) {
        this.mYOffset = 0;
        if (context == null) {
            throw new IllegalArgumentException("TBToast - You cannot use a null context.");
        }
        this.mContext = context;
        this.mToastView = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.uik_toast, (ViewGroup) null);
        this.mToastView.setClickable(false);
        this.mWindowManager = (WindowManager) this.mToastView.getContext().getApplicationContext().getSystemService(a.ATOM_EXT_window);
        this.mAnimView = this.mToastView.findViewById(R.id.uik_toast);
        this.mMessageTextView = (TextView) this.mToastView.findViewById(R.id.uik_toast_message);
        this.mMessage2TextView = (TextView) this.mToastView.findViewById(R.id.uik_toast_message2);
        this.mIconView = (TIconFontTextView) this.mToastView.findViewById(R.id.uik_toast_icon);
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        this.mYOffset = (int) (point.y * 0.1f);
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        this.mWindowManagerParams = new WindowManager.LayoutParams();
        WindowManager.LayoutParams layoutParams = this.mWindowManagerParams;
        layoutParams.height = -2;
        layoutParams.width = -2;
        layoutParams.flags = 262312;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.uik_toastAnim;
        WindowManager.LayoutParams layoutParams2 = this.mWindowManagerParams;
        layoutParams2.type = 2005;
        layoutParams2.gravity = this.mGravity;
        layoutParams2.x = this.mXOffset;
        layoutParams2.y = this.mYOffset;
        if (DeviceUtils.isMeizuDevice() && !PermissionHelper.isMezuFloatWindowOpAllowed(this.mContext)) {
            Toast.makeText(this.mContext, getText(), 0).show();
        } else if (DeviceUtils.isMIUIDevice() && !PermissionHelper.isMiuiFloatWindowOpAllowed(this.mContext)) {
            Toast.makeText(this.mContext, getText(), 0).show();
        } else if (Build.VERSION.SDK_INT >= 23) {
            Toast.makeText(this.mContext, getText(), 0).show();
        } else {
            TBToastManager.getInstance().add(this);
        }
    }

    public void setText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ac5a", new Object[]{this, charSequence});
            return;
        }
        TextView textView = this.mMessageTextView;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public TBToast setText2(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBToast) ipChange.ipc$dispatch("a0f2bea1", new Object[]{this, charSequence});
        }
        if (this.mMessage2TextView != null && !TextUtils.isEmpty(charSequence)) {
            this.mMessage2TextView.setText(charSequence);
            this.mMessage2TextView.setVisibility(0);
        }
        return this;
    }

    public TBToast setToastIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBToast) ipChange.ipc$dispatch("f93070b1", new Object[]{this, new Integer(i)});
        }
        Context context = this.mContext;
        if (context != null) {
            setToastIcon(context.getText(i).toString());
        }
        return this;
    }

    public TBToast setToastIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBToast) ipChange.ipc$dispatch("28d8e5e2", new Object[]{this, str});
        }
        if (this.mIconView != null && this.mContext != null && !TextUtils.isEmpty(str)) {
            this.mIconView.setText(str);
            this.mIconView.setVisibility(0);
        }
        return this;
    }

    public TBToast setToastIconColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBToast) ipChange.ipc$dispatch("830dec4a", new Object[]{this, new Integer(i)});
        }
        TIconFontTextView tIconFontTextView = this.mIconView;
        if (tIconFontTextView != null) {
            tIconFontTextView.setTextColor(i);
        }
        return this;
    }

    public CharSequence getText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this}) : this.mMessageTextView.getText();
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            this.mMessageTextView.setTextColor(i);
        }
    }

    public int getTextColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43c263fa", new Object[]{this})).intValue() : this.mMessageTextView.getCurrentTextColor();
    }

    public void setTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
        } else {
            this.mMessageTextView.setTextSize(i);
        }
    }

    public float getTextSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("835f3abb", new Object[]{this})).floatValue() : this.mMessageTextView.getTextSize();
    }

    public TBToast setDuration(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBToast) ipChange.ipc$dispatch("ae364b9a", new Object[]{this, new Long(j)});
        }
        if (j > Duration.EXTRA_LONG) {
            Log.e(TAG, "TBToast - You should NEVER specify a duration greater than four and a half seconds for a TBToast.");
            this.mDuration = Duration.EXTRA_LONG;
        } else {
            this.mDuration = j;
        }
        return this;
    }

    public long getDuration() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue() : this.mDuration;
    }

    public void setGravity(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d34a7b0", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.mGravity = i;
        this.mXOffset = i2;
        this.mYOffset = i3;
    }

    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            TBToastManager.getInstance().removeTBToast(this);
        }
    }

    public TextView getTextView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("852baee3", new Object[]{this}) : this.mMessageTextView;
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.mToastView;
    }

    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        View view = this.mToastView;
        return view != null && view.isShown();
    }

    public WindowManager getWindowManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowManager) ipChange.ipc$dispatch("4c2eee04", new Object[]{this}) : this.mWindowManager;
    }

    public WindowManager.LayoutParams getWindowManagerParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowManager.LayoutParams) ipChange.ipc$dispatch("4843f764", new Object[]{this}) : this.mWindowManagerParams;
    }

    public static TBToast makeText(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBToast) ipChange.ipc$dispatch("c9d023fd", new Object[]{context, charSequence}) : makeText(context, charSequence, 3000L);
    }

    public static TBToast makeText(Context context, CharSequence charSequence, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBToast) ipChange.ipc$dispatch("e86ff92d", new Object[]{context, charSequence, new Long(j)});
        }
        if ((context instanceof Activity) && DeviceUtils.isHUWEIDevice() && Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT < 29 && !NotificationManagerCompat.from(context).areNotificationsEnabled()) {
            TBActivityToast tBActivityToast = new TBActivityToast((Activity) context);
            tBActivityToast.setText(charSequence);
            tBActivityToast.setDuration(3000L);
            return tBActivityToast;
        }
        TBToast tBToast = new TBToast(context);
        tBToast.setText(charSequence);
        tBToast.setDuration(j);
        return tBToast;
    }

    public static void cancelAllTBToast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a52da539", new Object[0]);
        } else {
            TBToastManager.getInstance().cancelAllTBToasts();
        }
    }
}
