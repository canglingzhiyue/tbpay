package com.taobao.message.chat.component.chatinput.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.message.lab.comfrm.inner2.Disposable;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.reflect.k;
import kotlin.t;
import kotlin.text.n;
import tb.kge;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u001aH\u0002J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020\u0014H\u0016J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0010H\u0003J\b\u0010)\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R7\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/taobao/message/chat/component/chatinput/utils/ChatKeyboardHelper;", "Lcom/taobao/message/lab/comfrm/inner2/Disposable;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "aty", "Landroid/app/Activity;", "inputView", "Landroid/widget/EditText;", "(Landroid/app/Activity;Landroid/widget/EditText;)V", "decorView", "Landroid/view/View;", "getDecorView", "()Landroid/view/View;", "decorView$delegate", "Lkotlin/Lazy;", "keyboardWillShowOrHide", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "show", "", "getKeyboardWillShowOrHide", "()Lkotlin/jvm/functions/Function1;", "setKeyboardWillShowOrHide", "(Lkotlin/jvm/functions/Function1;)V", "lastHeightDiff", "", "mKeyboardHeight", "minHeight", "getMinHeight", "()I", "minHeight$delegate", "preDiff", "shouldPanelOn", "addIntSharedpreferences", "value", "changeKeyboardHeight", "height", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "hide", "isClose", "onGlobalLayout", "Companion", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class ChatKeyboardHelper implements ViewTreeObserver.OnGlobalLayoutListener, Disposable {
    public static final /* synthetic */ k[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion;
    private static int SOFT_KEYBOARD_HEIGHT = 0;
    public static final String TAG = "ChatKeyboardHelper";
    private static int heightThreshold;
    private final Activity aty;
    private final d decorView$delegate;
    private final EditText inputView;
    private rul<? super Boolean, t> keyboardWillShowOrHide;
    private int lastHeightDiff;
    private int mKeyboardHeight;
    private final d minHeight$delegate;
    private int preDiff;
    private boolean shouldPanelOn;

    private final View getDecorView() {
        IpChange ipChange = $ipChange;
        return (View) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("6d69b8fd", new Object[]{this}) : this.decorView$delegate.getValue());
    }

    private final int getMinHeight() {
        IpChange ipChange = $ipChange;
        return ((Number) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("3ce02a5d", new Object[]{this}) : this.minHeight$delegate.getValue())).intValue();
    }

    public ChatKeyboardHelper(Activity aty, EditText inputView) {
        q.c(aty, "aty");
        q.c(inputView, "inputView");
        this.aty = aty;
        this.inputView = inputView;
        this.lastHeightDiff = -1;
        this.minHeight$delegate = e.a(new ChatKeyboardHelper$minHeight$2(this));
        this.decorView$delegate = e.a(new ChatKeyboardHelper$decorView$2(this));
        Window window = this.aty.getWindow();
        q.a((Object) window, "aty.window");
        View decorView = window.getDecorView();
        q.a((Object) decorView, "aty.window.decorView");
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        if (!(Build.VERSION.SDK_INT >= 19 ? l.d((Context) this.aty) : false) || !n.a(Build.BRAND, "samsung", true)) {
            return;
        }
        heightThreshold = DisplayUtil.dip2px(ApplicationUtil.getApplication(), 70.0f);
    }

    public static final /* synthetic */ int access$getHeightThreshold$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f28713bd", new Object[0])).intValue() : heightThreshold;
    }

    public static final /* synthetic */ int access$getSOFT_KEYBOARD_HEIGHT$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dcf5a40b", new Object[0])).intValue() : SOFT_KEYBOARD_HEIGHT;
    }

    public static final /* synthetic */ void access$setHeightThreshold$cp(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748bbded", new Object[]{new Integer(i)});
        } else {
            heightThreshold = i;
        }
    }

    public static final /* synthetic */ void access$setSOFT_KEYBOARD_HEIGHT$cp(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca8b4f7", new Object[]{new Integer(i)});
        } else {
            SOFT_KEYBOARD_HEIGHT = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/taobao/message/chat/component/chatinput/utils/ChatKeyboardHelper$Companion;", "", "()V", "SOFT_KEYBOARD_HEIGHT", "", "getSOFT_KEYBOARD_HEIGHT", "()I", "setSOFT_KEYBOARD_HEIGHT", "(I)V", RPCDataItems.SWITCH_TAG_LOG, "", "heightThreshold", "getHeightThreshold", "setHeightThreshold", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-343992642);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final int getHeightThreshold() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1dd0e48", new Object[]{this})).intValue() : ChatKeyboardHelper.access$getHeightThreshold$cp();
        }

        public final void setHeightThreshold(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4185e5a", new Object[]{this, new Integer(i)});
            } else {
                ChatKeyboardHelper.access$setHeightThreshold$cp(i);
            }
        }

        public final int getSOFT_KEYBOARD_HEIGHT() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d48c973a", new Object[]{this})).intValue() : ChatKeyboardHelper.access$getSOFT_KEYBOARD_HEIGHT$cp();
        }

        public final void setSOFT_KEYBOARD_HEIGHT(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d31d10", new Object[]{this, new Integer(i)});
            } else {
                ChatKeyboardHelper.access$setSOFT_KEYBOARD_HEIGHT$cp(i);
            }
        }
    }

    static {
        kge.a(1343416054);
        kge.a(1930554497);
        kge.a(300785761);
        $$delegatedProperties = new k[]{kotlin.jvm.internal.t.a(new PropertyReference1Impl(kotlin.jvm.internal.t.b(ChatKeyboardHelper.class), "minHeight", "getMinHeight()I")), kotlin.jvm.internal.t.a(new PropertyReference1Impl(kotlin.jvm.internal.t.b(ChatKeyboardHelper.class), "decorView", "getDecorView()Landroid/view/View;"))};
        Companion = new Companion(null);
        heightThreshold = DisplayUtil.dip2px(ApplicationUtil.getApplication(), 62.75f);
    }

    public final rul<Boolean, t> getKeyboardWillShowOrHide() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("dd0536c5", new Object[]{this}) : this.keyboardWillShowOrHide;
    }

    public final void setKeyboardWillShowOrHide(rul<? super Boolean, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db028cab", new Object[]{this, rulVar});
        } else {
            this.keyboardWillShowOrHide = rulVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onGlobalLayout() {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.message.chat.component.chatinput.utils.ChatKeyboardHelper.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r7
            java.lang.String r2 = "df7e7eb3"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.View r1 = r7.getDecorView()
            r1.getWindowVisibleDisplayFrame(r0)
            android.view.View r1 = r7.getDecorView()
            java.lang.String r4 = "decorView"
            kotlin.jvm.internal.q.a(r1, r4)
            android.view.View r1 = r1.getRootView()
            java.lang.String r4 = "decorView.rootView"
            kotlin.jvm.internal.q.a(r1, r4)
            int r1 = r1.getHeight()
            int r4 = r0.bottom
            int r4 = r1 - r4
            boolean r5 = com.taobao.message.uikit.util.ApplicationUtil.isDebug()
            if (r5 == 0) goto L67
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "screenHeight:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = " r.bottom:"
            r5.append(r1)
            int r0 = r0.bottom
            r5.append(r0)
            java.lang.String r0 = " heightDifference:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = "ChatKeyboardHelper"
            com.taobao.tao.log.TLog.logd(r1, r0)
        L67:
            int r0 = r7.lastHeightDiff
            if (r0 != r4) goto L6c
            return
        L6c:
            r7.lastHeightDiff = r4
            int r0 = com.taobao.message.chat.component.chatinput.utils.ChatKeyboardHelper.heightThreshold
            if (r4 <= r0) goto Lab
            int r0 = r7.preDiff
            int r0 = r0 - r4
            int r0 = java.lang.Math.abs(r0)
            int r1 = com.taobao.message.chat.component.chatinput.utils.ChatKeyboardHelper.heightThreshold
            if (r0 <= r1) goto La8
            int r0 = r7.preDiff
            if (r0 > r1) goto L84
        L81:
            int r0 = r4 - r0
            goto L8a
        L84:
            if (r4 <= r0) goto L89
            int r0 = r4 - r0
            goto L81
        L89:
            r0 = r4
        L8a:
            r7.changeKeyboardHeight(r0)
            r7.shouldPanelOn = r3
            r7.hide(r3)
            android.app.Activity r0 = r7.aty
            android.view.Window r0 = r0.getWindow()
            r1 = 18
            r0.setSoftInputMode(r1)
            tb.rul<? super java.lang.Boolean, kotlin.t> r0 = r7.keyboardWillShowOrHide
            if (r0 == 0) goto La8
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.mo2421invoke(r1)
        La8:
            r7.preDiff = r4
            return
        Lab:
            if (r4 > r0) goto Lc1
            int r0 = r7.preDiff
            if (r0 == r4) goto Lb4
            r7.hide(r2)
        Lb4:
            r7.preDiff = r4
            tb.rul<? super java.lang.Boolean, kotlin.t> r0 = r7.keyboardWillShowOrHide
            if (r0 == 0) goto Lc1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.mo2421invoke(r1)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.chat.component.chatinput.utils.ChatKeyboardHelper.onGlobalLayout():void");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Disposable
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 16) {
            Window window = this.aty.getWindow();
            q.a((Object) window, "aty.window");
            View decorView = window.getDecorView();
            q.a((Object) decorView, "aty.window.decorView");
            decorView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else {
            Window window2 = this.aty.getWindow();
            q.a((Object) window2, "aty.window");
            View decorView2 = window2.getDecorView();
            q.a((Object) decorView2, "aty.window.decorView");
            decorView2.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    private final void changeKeyboardHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85525e", new Object[]{this, new Integer(i)});
            return;
        }
        int max = Math.max(i, getMinHeight());
        if (this.mKeyboardHeight == max) {
            return;
        }
        this.mKeyboardHeight = max;
        SOFT_KEYBOARD_HEIGHT = max;
        addIntSharedpreferences(this.mKeyboardHeight);
        if (!ApplicationUtil.isDebug()) {
            return;
        }
        TLog.logd(TAG, "changeKeyboardHeight mKeyboardHeight=" + this.mKeyboardHeight);
    }

    private final void addIntSharedpreferences(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3194c2f7", new Object[]{this, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.aty.getApplication()).edit();
        edit.putInt("Preference_KeyBoardHeight", i);
        edit.apply();
    }

    private final void hide(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300cdb2b", new Object[]{this, new Boolean(z)});
        } else if (z) {
        } else {
            Window window = this.aty.getWindow();
            q.a((Object) window, "aty.window");
            View decorView = window.getDecorView();
            q.a((Object) decorView, "aty.window.decorView");
            if (decorView.getSystemUiVisibility() != 0) {
                return;
            }
            this.inputView.requestFocus();
        }
    }
}
