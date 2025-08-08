package com.taobao.android.detail.core.detail.widget.coupon;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.base.DetailIconFontTextView;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taobao.R;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class TMThreeRowToast {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    private static TMToastView i;

    /* renamed from: a  reason: collision with root package name */
    private Resources f9668a;
    private LayoutInflater b;
    private Context e;
    private String h;
    private View j;
    private int c = 0;
    private int d = 17;
    private CharSequence f = null;
    private CharSequence g = null;
    private boolean k = false;

    public static /* synthetic */ View a(TMThreeRowToast tMThreeRowToast) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b4cdd880", new Object[]{tMThreeRowToast}) : tMThreeRowToast.j;
    }

    public static /* synthetic */ View a(TMThreeRowToast tMThreeRowToast, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("34de2b96", new Object[]{tMThreeRowToast, view});
        }
        tMThreeRowToast.j = view;
        return view;
    }

    public static /* synthetic */ boolean a(TMThreeRowToast tMThreeRowToast, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddfdb6da", new Object[]{tMThreeRowToast, new Boolean(z)})).booleanValue();
        }
        tMThreeRowToast.k = z;
        return z;
    }

    public static /* synthetic */ boolean b(TMThreeRowToast tMThreeRowToast) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("42a26ce1", new Object[]{tMThreeRowToast})).booleanValue() : tMThreeRowToast.k;
    }

    static {
        kge.a(-1353817541);
        TAG = TMThreeRowToast.class.getName();
    }

    public TMThreeRowToast(Context context) {
        if (context != null) {
            this.e = context.getApplicationContext();
            this.f9668a = context.getResources();
            this.b = LayoutInflater.from(this.e);
        }
        emu.a("com.taobao.android.detail.core.detail.widget.coupon.TMThreeRowToast");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f990c", new Object[]{this, charSequence});
        } else {
            this.f = charSequence.toString();
        }
    }

    public void b(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cdf7d8d", new Object[]{this, charSequence});
        } else {
            this.g = charSequence;
        }
    }

    public void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
            return;
        }
        this.c = i2;
        if (i2 == 1) {
            this.c = 4000;
        } else if (i2 != 0) {
        } else {
            this.c = 2000;
        }
    }

    public TMToastView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMToastView) ipChange.ipc$dispatch("34e477cf", new Object[]{this});
        }
        Context context = this.e;
        if (context == null) {
            return null;
        }
        TMToastView tMToastView = new TMToastView(context);
        i = tMToastView;
        return tMToastView;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TMToastView a2 = a();
        i = a2;
        a2.showAsToast(this.f, this.h, this.g, this.c);
    }

    public static TMThreeRowToast a(Context context, String str, CharSequence charSequence, CharSequence charSequence2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMThreeRowToast) ipChange.ipc$dispatch("8e88bba7", new Object[]{context, str, charSequence, charSequence2, new Integer(i2)});
        }
        TMThreeRowToast tMThreeRowToast = new TMThreeRowToast(context);
        tMThreeRowToast.a(str);
        tMThreeRowToast.a(charSequence);
        tMThreeRowToast.b(charSequence2);
        tMThreeRowToast.a(i2);
        return tMThreeRowToast;
    }

    /* loaded from: classes4.dex */
    public class TMToastView extends LinearLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int MSG_CLOSE_TOASTVIEW;
        private CharSequence desc;
        private TextView descView;
        private TextView iconfontView;
        private Context mContext;
        private CharSequence message;
        private String msgIconfontCode;
        private Toast toast;
        private TextView toastMessage;
        private Handler uiHandler;

        static {
            kge.a(1010223626);
        }

        public static /* synthetic */ Object ipc$super(TMToastView tMToastView, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ void access$000(TMToastView tMToastView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a80b0e0", new Object[]{tMToastView});
            } else {
                tMToastView.dismiss();
            }
        }

        public TMToastView(Context context) {
            super(context);
            this.MSG_CLOSE_TOASTVIEW = 1;
            this.message = null;
            this.desc = null;
            this.uiHandler = new Handler() { // from class: com.taobao.android.detail.core.detail.widget.coupon.TMThreeRowToast.TMToastView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == 673877017) {
                        super.handleMessage((Message) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                        return;
                    }
                    if (message.what == 1) {
                        TMToastView.access$000(TMToastView.this);
                    }
                    super.handleMessage(message);
                }
            };
            this.mContext = context;
            initView();
            initToast();
        }

        public void setParameters(CharSequence charSequence, CharSequence charSequence2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("442212c5", new Object[]{this, charSequence, charSequence2, str});
                return;
            }
            this.message = charSequence2;
            this.msgIconfontCode = str;
            this.desc = charSequence;
        }

        public void initView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
                return;
            }
            TMThreeRowToast.a(TMThreeRowToast.this, inflate(getContext(), R.layout.x_detail_toast_three_row, null));
            TMThreeRowToast.a(TMThreeRowToast.this).setPadding(0, 0, 0, (((int) this.mContext.getResources().getDisplayMetrics().density) << 6) * 3);
            this.iconfontView = (DetailIconFontTextView) TMThreeRowToast.a(TMThreeRowToast.this).findViewById(R.id.iconfont_toast_icon);
            if (!StringUtils.isEmpty(this.msgIconfontCode)) {
                this.iconfontView.setText(this.msgIconfontCode);
                this.iconfontView.setVisibility(0);
            } else {
                this.iconfontView.setVisibility(8);
            }
            this.toastMessage = (TextView) TMThreeRowToast.a(TMThreeRowToast.this).findViewById(R.id.toast_msg);
            CharSequence charSequence = this.message;
            if (charSequence != null) {
                this.toastMessage.setText(charSequence);
                this.toastMessage.setContentDescription(this.message);
                this.toastMessage.setVisibility(0);
            } else {
                this.toastMessage.setVisibility(8);
            }
            this.descView = (TextView) TMThreeRowToast.a(TMThreeRowToast.this).findViewById(R.id.toast_desc);
            if (!StringUtils.isEmpty(this.desc)) {
                this.descView.setText(this.desc);
                this.descView.setContentDescription(this.desc);
                this.descView.setVisibility(0);
                return;
            }
            this.descView.setVisibility(8);
        }

        public void showAsToast(CharSequence charSequence, String str, CharSequence charSequence2, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("972decf2", new Object[]{this, charSequence, str, charSequence2, new Integer(i)});
                return;
            }
            setParameters(charSequence2, charSequence, str);
            initView();
            addToWindow();
            if (i == 1) {
                i = 4000;
            } else if (i == 0) {
                i = 2000;
            }
            dismiss(i);
        }

        private void dismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            } else if (!isAllowAddToWindow()) {
                Toast toast = this.toast;
                if (toast == null) {
                    return;
                }
                toast.cancel();
            } else if (!TMThreeRowToast.b(TMThreeRowToast.this)) {
            } else {
                TMThreeRowToast.a(TMThreeRowToast.this).setVisibility(8);
                WindowManager windowManager = (WindowManager) this.mContext.getSystemService(a.ATOM_EXT_window);
                if (windowManager == null) {
                    return;
                }
                try {
                    windowManager.removeViewImmediate(TMThreeRowToast.a(TMThreeRowToast.this));
                    TMThreeRowToast.a(TMThreeRowToast.this, false);
                } catch (Exception e) {
                    i.a(TMThreeRowToast.TAG, "dismiss", e);
                }
            }
        }

        private void dismiss(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
                return;
            }
            Message obtainMessage = this.uiHandler.obtainMessage();
            obtainMessage.what = 1;
            this.uiHandler.sendMessageDelayed(obtainMessage, i);
        }

        private boolean isAllowAddToWindow() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d481a58", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT < 24;
        }

        private void initToast() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c301bfe", new Object[]{this});
            } else if (isAllowAddToWindow()) {
            } else {
                this.toast = new Toast(this.mContext);
                this.toast.setGravity(81, 0, 0);
            }
        }

        private void showCustomToast() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cdf7600", new Object[]{this});
                return;
            }
            Toast toast = this.toast;
            if (toast == null) {
                return;
            }
            toast.setDuration(1);
            if (TMThreeRowToast.a(TMThreeRowToast.this).getParent() != null) {
                ((ViewGroup) TMThreeRowToast.a(TMThreeRowToast.this).getParent()).removeView(TMThreeRowToast.a(TMThreeRowToast.this));
            }
            this.toast.setView(TMThreeRowToast.a(TMThreeRowToast.this));
            this.toast.show();
        }

        private void addToWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d2c1893", new Object[]{this});
            } else if (!isAllowAddToWindow()) {
                showCustomToast();
            } else {
                try {
                    int loadingHeight = getLoadingHeight();
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, loadingHeight > 0 ? loadingHeight : -1, 2005, 152, -3);
                    WindowManager windowManager = (WindowManager) this.mContext.getSystemService(a.ATOM_EXT_window);
                    layoutParams.gravity = 80;
                    if (TMThreeRowToast.b(TMThreeRowToast.this)) {
                        windowManager.updateViewLayout(TMThreeRowToast.a(TMThreeRowToast.this), layoutParams);
                        return;
                    }
                    TMThreeRowToast.a(TMThreeRowToast.this).setVisibility(0);
                    windowManager.addView(TMThreeRowToast.a(TMThreeRowToast.this), layoutParams);
                    TMThreeRowToast.a(TMThreeRowToast.this, true);
                } catch (Exception e) {
                    i.a(TMThreeRowToast.TAG, "addToWindow", e);
                }
            }
        }

        private int getLoadingHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("498f13c7", new Object[]{this})).intValue();
            }
            if (!(this.mContext instanceof Activity)) {
                return 0;
            }
            Rect rect = new Rect();
            Activity activity = (Activity) this.mContext;
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int i = rect.top;
            if (i == 0) {
                i = getStatusBarHeight();
            }
            if (activity.getActionBar() != null) {
                int height = activity.getActionBar().getHeight();
                if (height == 0) {
                    height = getActionBarHeight();
                }
                return (rect.bottom - i) - height;
            }
            return rect.bottom - i;
        }

        private int getActionBarHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e4e99cc8", new Object[]{this})).intValue();
            }
            TypedValue typedValue = new TypedValue();
            if (!this.mContext.getTheme().resolveAttribute(16843499, typedValue, true)) {
                return 0;
            }
            return TypedValue.complexToDimensionPixelSize(typedValue.data, this.mContext.getResources().getDisplayMetrics());
        }

        private int getStatusBarHeight() {
            int parseInt;
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    parseInt = this.mContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
                } else {
                    Class<?> cls = Class.forName("com.android.internal.R$dimen");
                    parseInt = Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString());
                }
                return this.mContext.getResources().getDimensionPixelSize(parseInt);
            } catch (Exception e) {
                i.a(TMThreeRowToast.TAG, WindvanePluginRegister.WVWindowInfoPlugin.ACTION_GET_STATUS_BAR_HEIGHT, e);
                return 0;
            }
        }
    }
}
