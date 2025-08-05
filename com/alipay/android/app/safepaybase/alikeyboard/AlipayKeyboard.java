package com.alipay.android.app.safepaybase.alikeyboard;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alipay.android.app.cctemplate.utils.DrmUtil;
import com.alipay.android.app.safepaybase.util.ResUtils;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.QwertyKeyboard;
import com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureAccessbilityDelegate;
import com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureQwertyKeyboard;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.HashMap;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class AlipayKeyboard extends LinearLayout implements OnKeyboardListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object LOCK_SHOW_KEYBOARD = new Object();
    private AliKeyboardAction cachedKeyboardAction;
    private FrameLayout container;
    private AliKeyboardType currentKeyboard;
    private EditText editText;
    private boolean isDegradeKeyboardDoneAction;
    private boolean isShowKeyboard;
    private boolean isSwitchedSystemKeyboard;
    private final HashMap<AliKeyboardType, AbstractKeyboard> keyboardMap;
    private AlipayKeyboardActionListener mActionListener;
    private Context mContext;
    private SourceType mSource;

    /* JADX INFO: Access modifiers changed from: package-private */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: classes3.dex */
    public enum AliKeyboardAction {
        None,
        Show,
        Hide
    }

    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: classes3.dex */
    public enum SourceType {
        msp,
        vi
    }

    public static /* synthetic */ Object ipc$super(AlipayKeyboard alipayKeyboard, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ AliKeyboardAction access$000(AlipayKeyboard alipayKeyboard) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliKeyboardAction) ipChange.ipc$dispatch("b54dcc7e", new Object[]{alipayKeyboard}) : alipayKeyboard.cachedKeyboardAction;
    }

    public static /* synthetic */ void access$100(AlipayKeyboard alipayKeyboard, AliKeyboardType aliKeyboardType, EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3233a57", new Object[]{alipayKeyboard, aliKeyboardType, editText});
        } else {
            alipayKeyboard.showKeyboard(aliKeyboardType, editText);
        }
    }

    public boolean isShowKeyboard() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63d205d9", new Object[]{this})).booleanValue() : this.isShowKeyboard;
    }

    public AlipayKeyboard(Context context) {
        super(context);
        this.currentKeyboard = AliKeyboardType.none;
        this.keyboardMap = new HashMap<>();
        this.isShowKeyboard = false;
        this.isSwitchedSystemKeyboard = false;
        this.cachedKeyboardAction = AliKeyboardAction.None;
        this.mActionListener = null;
        this.mSource = SourceType.msp;
        this.isDegradeKeyboardDoneAction = false;
        this.mContext = context;
        ResUtils.setUiContext(context);
        initConfig();
    }

    public AlipayKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currentKeyboard = AliKeyboardType.none;
        this.keyboardMap = new HashMap<>();
        this.isShowKeyboard = false;
        this.isSwitchedSystemKeyboard = false;
        this.cachedKeyboardAction = AliKeyboardAction.None;
        this.mActionListener = null;
        this.mSource = SourceType.msp;
        this.isDegradeKeyboardDoneAction = false;
        this.mContext = context;
        initConfig();
    }

    private void initConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
        } else {
            this.isDegradeKeyboardDoneAction = DrmUtil.isDrmDegraded(this.mContext, "degrade_keyboard_done_action", false, false);
        }
    }

    private void switchKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ceb8a42", new Object[]{this});
            return;
        }
        LogUtils.record(2, "AlipayKeyboard#switchKeyboard", "currentKeyboard: " + this.currentKeyboard);
        switch (this.currentKeyboard) {
            case none:
                initializeNoneKeyboard();
                return;
            case money:
                initializeMoneyKeyboard();
                return;
            case num:
                if (isShowCloseButton()) {
                    initializeNumKeyboard();
                    return;
                } else {
                    initializeShortPwdKeyboard();
                    return;
                }
            case idcard:
                initializeIdcardKeyboard();
                return;
            case phone:
                initializePhoneKeyboard();
                return;
            case spwd:
                initializeShortPwdKeyboard();
                return;
            default:
                initializeQwertyKeyboard();
                return;
        }
    }

    public void setSource(SourceType sourceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d2f1fd", new Object[]{this, sourceType});
        } else {
            this.mSource = sourceType;
        }
    }

    private boolean isShowCloseButton() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8e5b108e", new Object[]{this})).booleanValue() : SourceType.msp == this.mSource;
    }

    public void initializeKeyboard(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27299f21", new Object[]{this, frameLayout});
            return;
        }
        this.container = frameLayout;
        setOrientation(1);
        removeAllViews();
    }

    private boolean isNeedSecureType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2a3685c", new Object[]{this})).booleanValue();
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        return Build.VERSION.SDK_INT >= 16 && accessibilityManager != null && accessibilityManager.isEnabled();
    }

    private void initializeNoneKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe428bf6", new Object[]{this});
        } else {
            hideKeyboard();
        }
    }

    private void initializeShortPwdKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d6845f", new Object[]{this});
            return;
        }
        removeAllViews();
        if (!this.keyboardMap.containsKey(AliKeyboardType.spwd)) {
            this.keyboardMap.put(AliKeyboardType.spwd, new com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.AntNumKeyboard(getContext(), this, 4, false));
        }
        addView(this.keyboardMap.get(AliKeyboardType.spwd).getView());
    }

    private void initializeNumKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4dfede4", new Object[]{this});
            return;
        }
        removeAllViews();
        if (!this.keyboardMap.containsKey(AliKeyboardType.num)) {
            this.keyboardMap.put(AliKeyboardType.num, new AntNumKeyboard(getContext(), this, 0, false));
        }
        addView(this.keyboardMap.get(AliKeyboardType.num).getView());
    }

    private void initializeMoneyKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c0d081e", new Object[]{this});
            return;
        }
        EditText editText = this.editText;
        if (editText != null) {
            editText.setKeyListener(new MoneyKeyListener());
        }
        removeAllViews();
        if (!this.keyboardMap.containsKey(AliKeyboardType.money)) {
            this.keyboardMap.put(AliKeyboardType.money, new AntNumKeyboard(getContext(), this, 3, true));
        }
        addView(this.keyboardMap.get(AliKeyboardType.money).getView());
    }

    private void initializeQwertyKeyboard() {
        AbstractKeyboard qwertyKeyboard;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8810fd6", new Object[]{this});
            return;
        }
        removeAllViews();
        if (!this.keyboardMap.containsKey(AliKeyboardType.abc)) {
            HashMap<AliKeyboardType, AbstractKeyboard> hashMap = this.keyboardMap;
            AliKeyboardType aliKeyboardType = AliKeyboardType.abc;
            if (isNeedSecureType()) {
                qwertyKeyboard = new SecureQwertyKeyboard(getContext(), this.container, this);
            } else {
                qwertyKeyboard = new QwertyKeyboard(getContext(), this.container, this);
            }
            hashMap.put(aliKeyboardType, qwertyKeyboard);
        }
        addView(this.keyboardMap.get(AliKeyboardType.abc).getView());
    }

    private void initializeIdcardKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8259ee9", new Object[]{this});
            return;
        }
        removeAllViews();
        if (!this.keyboardMap.containsKey(AliKeyboardType.idcard)) {
            this.keyboardMap.put(AliKeyboardType.idcard, new AntNumKeyboard(getContext(), this, 2));
        }
        addView(this.keyboardMap.get(AliKeyboardType.idcard).getView());
    }

    private void initializePhoneKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b788fcc", new Object[]{this});
            return;
        }
        removeAllViews();
        if (!this.keyboardMap.containsKey(AliKeyboardType.phone)) {
            this.keyboardMap.put(AliKeyboardType.phone, new AntNumKeyboard(getContext(), this, 1));
        }
        addView(this.keyboardMap.get(AliKeyboardType.phone).getView());
    }

    private void showKeyboard(AliKeyboardType aliKeyboardType, EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b4f9d2", new Object[]{this, aliKeyboardType, editText});
            return;
        }
        LogUtils.record(2, "AlipayKeyboard#showKeyboard", "");
        synchronized (LOCK_SHOW_KEYBOARD) {
            this.cachedKeyboardAction = AliKeyboardAction.None;
            this.isShowKeyboard = true;
            this.editText = editText;
            if (this.editText != null && aliKeyboardType != AliKeyboardType.money) {
                this.editText.setAccessibilityDelegate(new SecureAccessbilityDelegate());
            }
            if (this.currentKeyboard != aliKeyboardType) {
                this.currentKeyboard = aliKeyboardType;
                switchKeyboard();
            }
            setVisibility(0);
        }
    }

    public void showKeyboard(final AliKeyboardType aliKeyboardType, final EditText editText, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3eab732", new Object[]{this, aliKeyboardType, editText, new Long(j)});
            return;
        }
        if (this.isSwitchedSystemKeyboard) {
            this.isSwitchedSystemKeyboard = false;
            j = 200;
        }
        if (j <= 0) {
            showKeyboard(aliKeyboardType, editText);
            return;
        }
        this.isShowKeyboard = true;
        this.cachedKeyboardAction = AliKeyboardAction.Show;
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboard.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (AlipayKeyboard.access$000(AlipayKeyboard.this) == AliKeyboardAction.Show) {
                    AlipayKeyboard.access$100(AlipayKeyboard.this, aliKeyboardType, editText);
                } else if (AlipayKeyboard.access$000(AlipayKeyboard.this) != AliKeyboardAction.Hide) {
                } else {
                    AlipayKeyboard.this.hideKeyboard();
                }
            }
        }, j);
    }

    public void hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
            return;
        }
        LogUtils.record(2, "AlipayKeyboard#hideKeyboard", "");
        synchronized (LOCK_SHOW_KEYBOARD) {
            this.cachedKeyboardAction = AliKeyboardAction.None;
            this.isShowKeyboard = false;
            this.editText = null;
            this.currentKeyboard = AliKeyboardType.none;
            setVisibility(8);
        }
    }

    public void onConfigurationChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4d4f64", new Object[]{this});
            return;
        }
        synchronized (LOCK_SHOW_KEYBOARD) {
            EditText editText = this.editText;
            if (editText != null) {
                editText.clearFocus();
            }
            this.keyboardMap.clear();
        }
        hideKeyboard();
    }

    public void onConfigurationChangedPauseKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d9aa27", new Object[]{this});
            return;
        }
        synchronized (LOCK_SHOW_KEYBOARD) {
            EditText editText = this.editText;
            if (editText != null) {
                editText.clearFocus();
            }
            this.keyboardMap.clear();
            this.isShowKeyboard = false;
            setVisibility(8);
        }
    }

    public void onConfigurationChangedResumeKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f013adf8", new Object[]{this});
        } else {
            showKeyboard(this.currentKeyboard, this.editText, 200L);
        }
    }

    @Override // com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener
    public void onDel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf60c33", new Object[]{this});
            return;
        }
        AlipayKeyboardActionListener alipayKeyboardActionListener = this.mActionListener;
        if (alipayKeyboardActionListener != null) {
            alipayKeyboardActionListener.onDel();
        }
        EditText editText = this.editText;
        if (editText == null || editText.getText() == null) {
            return;
        }
        int selectionStart = this.editText.getSelectionStart();
        int selectionEnd = this.editText.getSelectionEnd();
        if (selectionStart <= 0) {
            return;
        }
        if (selectionStart == selectionEnd) {
            this.editText.getText().delete(selectionStart - 1, selectionStart);
        } else {
            this.editText.getText().delete(selectionStart, selectionEnd);
        }
    }

    @Override // com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener
    public void onOK() {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50952b02", new Object[]{this});
            return;
        }
        AlipayKeyboardActionListener alipayKeyboardActionListener = this.mActionListener;
        if (alipayKeyboardActionListener != null) {
            alipayKeyboardActionListener.onOk();
        }
        if (!this.isDegradeKeyboardDoneAction && (editText = this.editText) != null) {
            editText.onEditorAction(6);
        }
        hideKeyboard();
    }

    @Override // com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener
    public void onClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e155e360", new Object[]{this});
        } else {
            hideKeyboard();
        }
    }

    @Override // com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener
    public void onInput(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe21657c", new Object[]{this, str});
            return;
        }
        AlipayKeyboardActionListener alipayKeyboardActionListener = this.mActionListener;
        if (alipayKeyboardActionListener != null) {
            alipayKeyboardActionListener.onInput(str);
        }
        EditText editText = this.editText;
        if (editText == null) {
            return;
        }
        int selectionStart = editText.getSelectionStart();
        LogUtils.record(2, "AlipayKeyboard#onInput", "pos: " + selectionStart);
        if (selectionStart != -1) {
            this.editText.getText().insert(selectionStart, str);
        } else {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "keyboardStart-1", "");
        }
        setSelection(this.editText, selectionStart + str.length());
    }

    private void setSelection(EditText editText, int i) {
        Editable editableText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d316f735", new Object[]{this, editText, new Integer(i)});
        } else if (editText == null || (editableText = editText.getEditableText()) == null) {
        } else {
            int length = editableText.length();
            LogUtils.record(2, "AlipayKeyboard#onInput", "pos: " + length + " newpos: " + i);
            if (AliKeyboardType.num == this.currentKeyboard && editText.getEditableText().toString().matches("^.*\\D.*$")) {
                return;
            }
            if (i < 0 || i > length) {
                Selection.setSelection(editableText, length);
            } else {
                Selection.setSelection(editableText, i);
            }
        }
    }

    public void setKeyboardActionListener(AlipayKeyboardActionListener alipayKeyboardActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1c3fd9a", new Object[]{this, alipayKeyboardActionListener});
        } else {
            this.mActionListener = alipayKeyboardActionListener;
        }
    }
}
