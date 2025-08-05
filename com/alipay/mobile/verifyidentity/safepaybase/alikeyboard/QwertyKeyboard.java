package com.alipay.mobile.verifyidentity.safepaybase.alikeyboard;

import android.content.Context;
import android.graphics.Point;
import android.support.media.ExifInterface;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.security.realidentity.o;
import com.alipay.android.app.safepaybase.alikeyboard.AbstractKeyboard;
import com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.alipay.mobile.verifyidentity.safepaybase.util.LogUtils;
import com.alipay.mobile.verifyidentity.safepaybase.util.UIUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.android.msoa.c;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.xiaomi.mipush.sdk.Constants;
import tb.mto;
import tb.riy;

/* loaded from: classes3.dex */
public class QwertyKeyboard extends AbstractKeyboard implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout c;
    private TextView d;
    private TextView j;
    private FrameLayout w;
    private QwertType e = QwertType.abc;
    private ShiftType f = ShiftType.up;
    private TextView[] g = new TextView[10];
    private TextView[] h = new TextView[9];
    private TextView[] i = new TextView[7];
    private final String[] k = {"q", "w", "e", "r", "t", "y", RVStartParams.KEY_URL_SHORT, q.MSGTYPE_INTERVAL, o.b, "p"};
    private final String[] l = {"a", "s", Repeat.D, "f", at.f, "h", at.j, at.k, "l"};
    private final String[] m = {AmnetConstant.VAL_SUPPORT_ZSTD, "x", c.TAG, "v", TplMsg.VALUE_T_NATIVE_RETURN, "n", "m"};
    private final String[] n = {"Q", "W", "E", "R", "T", "Y", "U", TLogTracker.LEVEL_INFO, "O", "P"};
    private final String[] o = {"A", ExifInterface.LATITUDE_SOUTH, TLogTracker.LEVEL_DEBUG, UTConstant.Args.UT_SUCCESS_F, "G", "H", "J", "K", "L"};
    private final String[] p = {"Z", "X", "C", "V", "B", "N", "M"};
    private final String[] q = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    private final String[] r = {Constants.WAVE_SEPARATOR, riy.AND_NOT, "@", "#", riy.MOD, "'", "&", "*", "?"};
    private final String[] s = {riy.BRACKET_START_STR, riy.BRACKET_END_STR, "-", "_", ":", ";", "/"};
    private final String[] t = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    private final String[] u = {"<", ">", riy.PLUS, "=", "÷", "^", "`", riy.ARRAY_START_STR, riy.ARRAY_END_STR};
    private final String[] v = {"\\", "|", "\"", "$", "￥", riy.BLOCK_START_STR, riy.BLOCK_END_STR};
    private double x = mto.a.GEO_NOT_SUPPORT;
    private int y = 0;
    private float z = 0.0f;

    /* loaded from: classes3.dex */
    public enum QwertType {
        abc,
        num
    }

    /* loaded from: classes3.dex */
    public enum ShiftType {
        up,
        down
    }

    public static /* synthetic */ Object ipc$super(QwertyKeyboard qwertyKeyboard, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public QwertyKeyboard(Context context, FrameLayout frameLayout, OnKeyboardListener onKeyboardListener) {
        this.b = onKeyboardListener;
        LogUtils.a("QwertyKeyboard::init", "init");
        this.f4384a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.vi_keyboard_qwerty, (ViewGroup) null, false);
        this.w = frameLayout;
        b(context);
        a(context);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.j = new TextView(context);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.height = -2;
        layoutParams.width = (this.y - ((int) (context.getResources().getDisplayMetrics().density * 9.0d))) << 1;
        this.j.setTextSize(1, 35.0f);
        this.j.setLayoutParams(layoutParams);
        this.j.setTextColor(-16777216);
        this.j.setGravity(17);
        this.j.setVisibility(4);
        FrameLayout frameLayout = this.w;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(this.j);
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        int childCount = this.f4384a.getChildCount();
        this.x = context.getResources().getDisplayMetrics().density;
        Pair<Integer, Integer> a2 = UIUtils.a(context);
        int intValue = ((Integer) a2.first).intValue();
        int intValue2 = ((Integer) a2.second).intValue();
        double d = this.x;
        this.y = ((int) (intValue - ((d * 1.5d) * 2.0d))) / 10;
        int i2 = this.y;
        this.z = (float) (i2 * 0.65d);
        int i3 = (int) (((i2 - ((d * 4.5d) * 2.0d)) * 1.45d) + (7.0d * d * 2.0d));
        double d2 = intValue2 * 0.4d;
        if ((i3 << 2) > d2) {
            i3 = (int) (d2 / 4.0d);
            this.z = (float) ((i3 - ((9.0d * d) * 2.0d)) - (10.0d * d));
            if (this.z > d * 30.0d) {
                this.z = (float) (d * 30.0d);
            }
        }
        int i4 = this.y;
        double d3 = this.x;
        int i5 = ((int) (((intValue - (i4 * 7)) - ((1.5d * d3) * 2.0d)) - ((d3 * 4.5d) * 4.0d))) / 2;
        int i6 = i4 * 4;
        int i7 = i4 + i5;
        int i8 = 0;
        while (i8 < childCount) {
            LinearLayout linearLayout = (LinearLayout) this.f4384a.getChildAt(i8);
            if (linearLayout != null) {
                ((LinearLayout.LayoutParams) linearLayout.getLayoutParams()).height = i3;
                linearLayout.setGravity(1);
                int childCount2 = linearLayout.getChildCount();
                if (i8 == 0) {
                    this.g = new TextView[childCount2];
                    for (int i9 = 0; i9 < childCount2; i9++) {
                        FrameLayout frameLayout = (FrameLayout) linearLayout.getChildAt(i9);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.width = this.y;
                        layoutParams.weight = 0.0f;
                        TextView textView = (TextView) frameLayout.getChildAt(0);
                        textView.setTextSize(0, this.z);
                        textView.setAccessibilityDelegate(new SecureAccessbilityDelegate());
                        frameLayout.setOnTouchListener(this);
                        this.g[i9] = textView;
                    }
                } else if (i8 == 1) {
                    this.h = new TextView[childCount2];
                    for (int i10 = 0; i10 < childCount2; i10++) {
                        FrameLayout frameLayout2 = (FrameLayout) linearLayout.getChildAt(i10);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) frameLayout2.getLayoutParams();
                        layoutParams2.width = this.y;
                        layoutParams2.weight = 0.0f;
                        TextView textView2 = (TextView) frameLayout2.getChildAt(0);
                        textView2.setTextSize(0, this.z);
                        textView2.setAccessibilityDelegate(new SecureAccessbilityDelegate());
                        frameLayout2.setOnTouchListener(this);
                        this.h[i10] = textView2;
                    }
                } else if (i8 == i) {
                    this.i = new TextView[childCount2 - 2];
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        FrameLayout frameLayout3 = (FrameLayout) linearLayout.getChildAt(i11);
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) frameLayout3.getLayoutParams();
                        if (i11 == 0) {
                            layoutParams3.width = i5;
                            this.c = frameLayout3;
                        } else if (i11 == childCount2 - 1) {
                            layoutParams3.width = i5;
                        } else {
                            layoutParams3.width = this.y;
                            layoutParams3.weight = 0.0f;
                            TextView textView3 = (TextView) frameLayout3.getChildAt(0);
                            textView3.setTextSize(0, this.z);
                            textView3.setAccessibilityDelegate(new SecureAccessbilityDelegate());
                            this.i[i11 - 1] = textView3;
                            layoutParams3.width = this.y;
                        }
                        layoutParams3.weight = 0.0f;
                        frameLayout3.setOnTouchListener(this);
                    }
                } else {
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt = linearLayout.getChildAt(i12);
                        childAt.setAccessibilityDelegate(new SecureAccessbilityDelegate());
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                        if (i12 == 0) {
                            layoutParams4.width = i5;
                            TextView textView4 = (TextView) childAt;
                            this.d = textView4;
                            textView4.setTextSize(0, this.z);
                        } else if (i12 == 1) {
                            layoutParams4.width = this.y;
                            ((TextView) ((FrameLayout) childAt).getChildAt(0)).setTextSize(0, this.z);
                        } else if (i12 == 2) {
                            layoutParams4.width = i6;
                            ((TextView) ((FrameLayout) childAt).getChildAt(0)).setTextSize(0, this.z);
                        } else if (i12 == 3) {
                            layoutParams4.width = this.y;
                            ((TextView) ((FrameLayout) childAt).getChildAt(0)).setTextSize(0, this.z);
                        } else {
                            layoutParams4.width = i7;
                            ((TextView) childAt).setTextSize(0, this.z);
                        }
                        layoutParams4.weight = 0.0f;
                        childAt.setOnTouchListener(this);
                    }
                }
            }
            i8++;
            i = 2;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            return b(view);
        }
        if (motionEvent.getAction() != 1) {
            return false;
        }
        return a(view);
    }

    private boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        if (view.getId() == R.id.key_enter) {
            b();
        }
        this.j.setVisibility(4);
        return false;
    }

    private boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{this, view})).booleanValue();
        }
        int id = view.getId();
        if (id == R.id.key_del1) {
            a();
        } else if (id != R.id.key_enter) {
            if (id == R.id.key_space) {
                a(" ");
            } else if (id == R.id.key_ABC) {
                this.f = this.f == ShiftType.up ? ShiftType.down : ShiftType.up;
                a(this.e, this.f);
            } else if (id == R.id.key_123) {
                this.e = this.e == QwertType.abc ? QwertType.num : QwertType.abc;
                this.f = ShiftType.up;
                a(this.e, this.f);
            } else {
                String charSequence = ((TextView) ((FrameLayout) view).getChildAt(0)).getText().toString();
                a(view, charSequence);
                a(charSequence);
            }
        }
        return false;
    }

    private void a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c0c6b4", new Object[]{this, view, str});
        } else if (this.w == null) {
        } else {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j.getLayoutParams();
            Point a2 = a(this.w, view);
            double d = this.x;
            layoutParams.setMargins((a2.x - (this.j.getWidth() / 2)) + (view.getWidth() / 2), (((a2.y - this.j.getHeight()) + view.getHeight()) + ((int) (3.0d * d))) - ((int) (d * 9.0d)), 0, 0);
            this.j.setLayoutParams(layoutParams);
            this.j.setText(str);
            this.j.setVisibility(0);
        }
    }

    private void a(QwertType qwertType, ShiftType shiftType) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f58c4ac7", new Object[]{this, qwertType, shiftType});
            return;
        }
        if (qwertType == QwertType.abc) {
            this.c.getChildAt(0).setVisibility(0);
            this.c.getChildAt(1).setVisibility(8);
            this.d.setText("123");
            if (shiftType == ShiftType.up) {
                ((ImageView) this.c.getChildAt(0)).setImageResource(R.drawable.vi_keyboard_key_shift_up);
                strArr = this.k;
                strArr2 = this.l;
                strArr3 = this.m;
            } else {
                ((ImageView) this.c.getChildAt(0)).setImageResource(R.drawable.vi_keyboard_key_shift_down);
                strArr = this.n;
                strArr2 = this.o;
                strArr3 = this.p;
            }
        } else {
            this.c.getChildAt(0).setVisibility(8);
            this.c.getChildAt(1).setVisibility(0);
            if (this.c.getChildAt(1) instanceof TextView) {
                ((TextView) this.c.getChildAt(1)).setTextSize(0, this.z);
            }
            this.d.setText("abc");
            if (shiftType == ShiftType.up) {
                ((TextView) this.c.getChildAt(1)).setText("123");
                strArr = this.q;
                strArr2 = this.r;
                strArr3 = this.s;
            } else {
                ((TextView) this.c.getChildAt(1)).setText("#+=");
                strArr = this.t;
                strArr2 = this.u;
                strArr3 = this.v;
            }
        }
        int i2 = 0;
        while (true) {
            TextView[] textViewArr = this.g;
            if (i2 >= textViewArr.length) {
                break;
            }
            textViewArr[i2].setText(strArr[i2]);
            i2++;
        }
        int i3 = 0;
        while (true) {
            TextView[] textViewArr2 = this.h;
            if (i3 >= textViewArr2.length) {
                break;
            }
            textViewArr2[i3].setText(strArr2[i3]);
            i3++;
        }
        while (true) {
            TextView[] textViewArr3 = this.i;
            if (i >= textViewArr3.length) {
                return;
            }
            textViewArr3[i].setText(strArr3[i]);
            i++;
        }
    }
}
