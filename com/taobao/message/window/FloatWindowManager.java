package com.taobao.message.window;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.weex_framework.util.a;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.message.window.FloatWindowManager;
import com.taobao.runtimepermission.f;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import tb.kge;

/* loaded from: classes7.dex */
public class FloatWindowManager implements IFloatWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int STEP_NUM = 20;
    private static final String TAG = "FloatWindowManager";
    private static final int WINDOW_H = 78;
    private static final int WINDOW_H_BIG = 106;
    private static final int WINDOW_W = 63;
    private static final int WINDOW_W_BIG = 86;
    private boolean isBigMode;
    private LinearLayout mFloatLayout;
    private TUrlImageView mIcon;
    private TUrlImageView mIconBg;
    private String mNavUrl;
    private TextView mText;
    private Timer mTimer;
    private WindowManager mWindowManager;
    private boolean isReadyToMove = false;
    private float beginX = 0.0f;
    private float windowX = 0.0f;
    private float beginY = 0.0f;
    private float windowY = 0.0f;
    private boolean isCreated = false;
    private int mStartTime = 0;
    private int mStatus = 3;
    private final List<FloatWindowListener> mListeners = new ArrayList();

    static {
        kge.a(1542677861);
        kge.a(-1131136761);
    }

    public static /* synthetic */ void access$000(FloatWindowManager floatWindowManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12a1902", new Object[]{floatWindowManager, new Integer(i)});
        } else {
            floatWindowManager.notifyLifecycle(i);
        }
    }

    public static /* synthetic */ boolean access$100(FloatWindowManager floatWindowManager, Context context, FloatWindowVO floatWindowVO) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa1b059e", new Object[]{floatWindowManager, context, floatWindowVO})).booleanValue() : floatWindowManager.createImpl(context, floatWindowVO);
    }

    public static /* synthetic */ List access$1000(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7323f37", new Object[]{floatWindowManager}) : floatWindowManager.mListeners;
    }

    public static /* synthetic */ String access$1100(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4f5f462f", new Object[]{floatWindowManager}) : floatWindowManager.mNavUrl;
    }

    public static /* synthetic */ TextView access$1200(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("360cc686", new Object[]{floatWindowManager}) : floatWindowManager.mText;
    }

    public static /* synthetic */ int access$1308(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b30e538e", new Object[]{floatWindowManager})).intValue();
        }
        int i = floatWindowManager.mStartTime;
        floatWindowManager.mStartTime = i + 1;
        return i;
    }

    public static /* synthetic */ String access$1400(FloatWindowManager floatWindowManager, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("878b8211", new Object[]{floatWindowManager, new Integer(i)}) : floatWindowManager.formatSecond(i);
    }

    public static /* synthetic */ float access$200(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c8f8113", new Object[]{floatWindowManager})).floatValue() : floatWindowManager.beginX;
    }

    public static /* synthetic */ float access$202(FloatWindowManager floatWindowManager, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51123fab", new Object[]{floatWindowManager, new Float(f)})).floatValue();
        }
        floatWindowManager.beginX = f;
        return f;
    }

    public static /* synthetic */ float access$300(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("29ca3294", new Object[]{floatWindowManager})).floatValue() : floatWindowManager.beginY;
    }

    public static /* synthetic */ float access$302(FloatWindowManager floatWindowManager, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b2dbe4a", new Object[]{floatWindowManager, new Float(f)})).floatValue();
        }
        floatWindowManager.beginY = f;
        return f;
    }

    public static /* synthetic */ float access$400(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b704e415", new Object[]{floatWindowManager})).floatValue() : floatWindowManager.windowX;
    }

    public static /* synthetic */ float access$402(FloatWindowManager floatWindowManager, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85493ce9", new Object[]{floatWindowManager, new Float(f)})).floatValue();
        }
        floatWindowManager.windowX = f;
        return f;
    }

    public static /* synthetic */ LinearLayout access$500(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("c74831fd", new Object[]{floatWindowManager}) : floatWindowManager.mFloatLayout;
    }

    public static /* synthetic */ float access$600(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d17a4717", new Object[]{floatWindowManager})).floatValue() : floatWindowManager.windowY;
    }

    public static /* synthetic */ float access$602(FloatWindowManager floatWindowManager, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9803a27", new Object[]{floatWindowManager, new Float(f)})).floatValue();
        }
        floatWindowManager.windowY = f;
        return f;
    }

    public static /* synthetic */ boolean access$700(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb4f8ac", new Object[]{floatWindowManager})).booleanValue() : floatWindowManager.isReadyToMove;
    }

    public static /* synthetic */ boolean access$702(FloatWindowManager floatWindowManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d39c03ee", new Object[]{floatWindowManager, new Boolean(z)})).booleanValue();
        }
        floatWindowManager.isReadyToMove = z;
        return z;
    }

    public static /* synthetic */ boolean access$800(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ebefaa2d", new Object[]{floatWindowManager})).booleanValue() : floatWindowManager.isCreated;
    }

    public static /* synthetic */ WindowManager access$900(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowManager) ipChange.ipc$dispatch("a0706fc8", new Object[]{floatWindowManager}) : floatWindowManager.mWindowManager;
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void addListener(FloatWindowListener floatWindowListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4414e89", new Object[]{this, floatWindowListener});
        } else if (floatWindowListener == null) {
        } else {
            this.mListeners.add(floatWindowListener);
        }
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void removeListener(FloatWindowListener floatWindowListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7199c4c6", new Object[]{this, floatWindowListener});
        } else if (floatWindowListener == null) {
        } else {
            this.mListeners.remove(floatWindowListener);
        }
    }

    @Override // com.taobao.message.window.IFloatWindow
    public boolean create(FloatWindowVO floatWindowVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4861921", new Object[]{this, floatWindowVO})).booleanValue();
        }
        Application application = Globals.getApplication();
        if (application != null) {
            return createImpl(application, floatWindowVO);
        }
        return false;
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void createWithRequestPermission(final FloatWindowVO floatWindowVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae69141d", new Object[]{this, floatWindowVO});
            return;
        }
        final Application application = Globals.getApplication();
        if (application == null) {
            notifyLifecycle(4);
        } else {
            f.a(application, new String[]{"android.permission.SYSTEM_ALERT_WINDOW"}).a(DisplayUtil.localizedString(R.string.mp_system_authorization_is_required_when_2)).a(new Runnable() { // from class: com.taobao.message.window.FloatWindowManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (FloatWindowManager.access$100(FloatWindowManager.this, application, floatWindowVO)) {
                    } else {
                        FloatWindowManager.access$000(FloatWindowManager.this, 4);
                    }
                }
            }).b(new Runnable() { // from class: com.taobao.message.window.FloatWindowManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FloatWindowManager.access$000(FloatWindowManager.this, 4);
                    }
                }
            }).a();
        }
    }

    private boolean createImpl(Context context, FloatWindowVO floatWindowVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2a9497f", new Object[]{this, context, floatWindowVO})).booleanValue();
        }
        if (this.isCreated || floatWindowVO == null) {
            return false;
        }
        this.isCreated = true;
        this.mNavUrl = floatWindowVO.getNavUrl();
        this.isBigMode = floatWindowVO.isBigMode();
        final float f = context.getResources().getDisplayMetrics().density;
        final int i = context.getResources().getDisplayMetrics().widthPixels;
        int i2 = context.getResources().getDisplayMetrics().heightPixels;
        final WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.mWindowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window);
        if (Build.VERSION.SDK_INT < 26) {
            layoutParams.type = 2002;
        } else {
            layoutParams.type = 2038;
        }
        layoutParams.format = 1;
        layoutParams.flags = 8;
        layoutParams.gravity = floatWindowVO.getGravity() == 0 ? 51 : floatWindowVO.getGravity();
        layoutParams.x = 0;
        layoutParams.y = (int) (57.0f * f);
        int i3 = 86;
        layoutParams.width = (int) ((this.isBigMode ? 86 : 63) * f);
        int i4 = 106;
        layoutParams.height = (int) ((this.isBigMode ? 106 : 78) * f);
        this.mFloatLayout = (LinearLayout) LayoutInflater.from(context).inflate(this.isBigMode ? R.layout.alimp_open_float_layout_big : R.layout.alimp_open_float_layout, (ViewGroup) null);
        this.mText = (TextView) this.mFloatLayout.findViewById(R.id.tv_mp_float_text);
        this.mIcon = (TUrlImageView) this.mFloatLayout.findViewById(R.id.iv_mp_float_icon);
        this.mIconBg = (TUrlImageView) this.mFloatLayout.findViewById(R.id.iv_mp_float_bg);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        if (!this.isBigMode) {
            i3 = 63;
        }
        layoutParams2.width = (int) ((i3 + 10) * f);
        if (!this.isBigMode) {
            i4 = 78;
        }
        layoutParams2.height = (int) ((i4 + 10) * f);
        this.mFloatLayout.setLayoutParams(layoutParams2);
        ViewCompat.setElevation(this.mFloatLayout, 8.0f);
        this.mWindowManager.addView(this.mFloatLayout, layoutParams);
        this.mFloatLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.mFloatLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.message.window.FloatWindowManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    FloatWindowManager.access$202(FloatWindowManager.this, motionEvent.getRawX());
                    FloatWindowManager.access$302(FloatWindowManager.this, motionEvent.getRawY());
                    FloatWindowManager floatWindowManager = FloatWindowManager.this;
                    FloatWindowManager.access$402(floatWindowManager, ((WindowManager.LayoutParams) FloatWindowManager.access$500(floatWindowManager).getLayoutParams()).x);
                    FloatWindowManager floatWindowManager2 = FloatWindowManager.this;
                    FloatWindowManager.access$602(floatWindowManager2, ((WindowManager.LayoutParams) FloatWindowManager.access$500(floatWindowManager2).getLayoutParams()).y);
                    FloatWindowManager.access$702(FloatWindowManager.this, false);
                } else if (action != 1) {
                    if (action == 2 && (Math.abs(motionEvent.getRawY() - FloatWindowManager.access$300(FloatWindowManager.this)) > f * 5.0f || Math.abs(motionEvent.getRawX() - FloatWindowManager.access$200(FloatWindowManager.this)) > f * 5.0f)) {
                        FloatWindowManager.access$702(FloatWindowManager.this, true);
                    }
                } else if (FloatWindowManager.access$500(FloatWindowManager.this) == null) {
                    return true;
                } else {
                    FloatWindowManager.access$500(FloatWindowManager.this).getLocationOnScreen(new int[2]);
                    final int i5 = layoutParams.y;
                    UIHandler.postDelayed(new Runnable() { // from class: com.taobao.message.window.FloatWindowManager.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:
                            if (com.taobao.message.window.FloatWindowManager.access$800(r7.this$1.this$0) != false) goto L20;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public void run() {
                            /*
                                Method dump skipped, instructions count: 256
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.window.FloatWindowManager.AnonymousClass3.AnonymousClass1.run():void");
                        }
                    }, 10L);
                }
                if (!FloatWindowManager.access$700(FloatWindowManager.this) || FloatWindowManager.access$500(FloatWindowManager.this) == null || motionEvent == null) {
                    return false;
                }
                float rawX = motionEvent.getRawX() - FloatWindowManager.access$200(FloatWindowManager.this);
                WindowManager.LayoutParams layoutParams3 = layoutParams;
                layoutParams3.x = Math.round((layoutParams3.gravity & 5) == 5 ? FloatWindowManager.access$400(FloatWindowManager.this) - rawX : FloatWindowManager.access$400(FloatWindowManager.this) + rawX);
                float rawY = motionEvent.getRawY() - FloatWindowManager.access$300(FloatWindowManager.this);
                WindowManager.LayoutParams layoutParams4 = layoutParams;
                layoutParams4.y = Math.round((layoutParams4.gravity & 80) == 80 ? FloatWindowManager.access$600(FloatWindowManager.this) - rawY : FloatWindowManager.access$600(FloatWindowManager.this) + rawY);
                FloatWindowManager.access$900(FloatWindowManager.this).updateViewLayout(FloatWindowManager.access$500(FloatWindowManager.this), layoutParams);
                return true;
            }
        });
        this.mFloatLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.message.window.FloatWindowManager.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                for (FloatWindowListener floatWindowListener : FloatWindowManager.access$1000(FloatWindowManager.this)) {
                    floatWindowListener.onClick();
                }
                FloatWindowManager.this.setVisible(false);
                Nav.from(Globals.getApplication()).toUri(FloatWindowManager.access$1100(FloatWindowManager.this));
            }
        });
        if (floatWindowVO.getIconUrl() != null && !floatWindowVO.getIconUrl().isEmpty()) {
            setIcon(floatWindowVO.getIconUrl());
        }
        if (floatWindowVO.getText() != null && !floatWindowVO.getText().isEmpty()) {
            setText(floatWindowVO.getText());
        } else if (floatWindowVO.getTimeSecond() >= 0) {
            setTimeSecond(floatWindowVO.getTimeSecond());
        }
        notifyLifecycle(2);
        return true;
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        try {
            if (this.isCreated) {
                this.isCreated = false;
                if (this.mWindowManager != null && this.mFloatLayout != null) {
                    this.mWindowManager.removeView(this.mFloatLayout);
                    this.mFloatLayout = null;
                    this.mText = null;
                    this.mIcon = null;
                    this.mIconBg = null;
                }
            }
            if (this.mTimer != null) {
                this.mTimer.cancel();
                this.mTimer = null;
            }
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
        }
        notifyLifecycle(3);
        this.isCreated = false;
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void setVisible(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8643d37d", new Object[]{this, new Boolean(z)});
            return;
        }
        LinearLayout linearLayout = this.mFloatLayout;
        if (linearLayout == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        notifyLifecycle(!z ? 1 : 0);
    }

    private void notifyLifecycle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8619db", new Object[]{this, new Integer(i)});
            return;
        }
        this.mStatus = i;
        for (FloatWindowListener floatWindowListener : this.mListeners) {
            floatWindowListener.onLifecycleChanged(i);
        }
    }

    private String formatSecond(int i) {
        Object valueOf;
        Object valueOf2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cf51cf", new Object[]{this, new Integer(i)});
        }
        if (i >= 600000) {
            return "999:99";
        }
        int i2 = i / 60;
        int i3 = i - (i2 * 60);
        StringBuilder sb = new StringBuilder();
        if (i2 < 10) {
            valueOf = "0" + i2;
        } else {
            valueOf = Integer.valueOf(i2);
        }
        sb.append(valueOf);
        sb.append(":");
        if (i3 < 10) {
            valueOf2 = "0" + i3;
        } else {
            valueOf2 = Integer.valueOf(i3);
        }
        sb.append(valueOf2);
        return sb.toString();
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
            return;
        }
        Timer timer = this.mTimer;
        if (timer != null) {
            timer.cancel();
            this.mTimer = null;
        }
        this.mText.setText(str);
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void setIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c95a84c", new Object[]{this, str});
        } else {
            this.mIcon.setImageUrl(str);
        }
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void setTimeSecond(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de2d199", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
        } else {
            Timer timer = this.mTimer;
            if (timer != null) {
                timer.cancel();
                this.mTimer = null;
            }
            this.mStartTime = i;
            this.mTimer = new Timer("msgFloatWindowManager");
            this.mTimer.schedule(new AnonymousClass5(), 0L, 1000L);
        }
    }

    /* renamed from: com.taobao.message.window.FloatWindowManager$5  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass5 extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass5() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                UIHandler.postMain(new Runnable() { // from class: com.taobao.message.window.-$$Lambda$FloatWindowManager$5$fb4KfRihSr4VV2UoB5h2jLwnnr0
                    {
                        FloatWindowManager.AnonymousClass5.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FloatWindowManager.AnonymousClass5.this.lambda$run$0$FloatWindowManager$5();
                    }
                });
            }
        }

        public /* synthetic */ void lambda$run$0$FloatWindowManager$5() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f11d38c1", new Object[]{this});
            } else if (FloatWindowManager.access$1200(FloatWindowManager.this) == null) {
            } else {
                TextView access$1200 = FloatWindowManager.access$1200(FloatWindowManager.this);
                FloatWindowManager floatWindowManager = FloatWindowManager.this;
                access$1200.setText(FloatWindowManager.access$1400(floatWindowManager, FloatWindowManager.access$1308(floatWindowManager)));
            }
        }
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void setIconBackground(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649c1d5a", new Object[]{this, str});
        } else {
            this.mIconBg.setImageUrl(str);
        }
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void setNavUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92fc305f", new Object[]{this, str});
        } else {
            this.mNavUrl = str;
        }
    }

    @Override // com.taobao.message.window.IFloatWindow
    public String getNavUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f7553bf7", new Object[]{this}) : this.mNavUrl;
    }

    @Override // com.taobao.message.window.IFloatWindow
    public int getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue() : this.mStatus;
    }

    /* loaded from: classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static FloatWindowManager instance;

        private SingletonHolder() {
        }

        public static /* synthetic */ FloatWindowManager access$1500() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FloatWindowManager) ipChange.ipc$dispatch("4de02435", new Object[0]) : instance;
        }

        static {
            kge.a(-1473928136);
            instance = new FloatWindowManager();
        }
    }

    public static FloatWindowManager getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatWindowManager) ipChange.ipc$dispatch("2289fb6e", new Object[0]) : SingletonHolder.access$1500();
    }
}
