package io.unicorn.plugin.platformview;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import com.taobao.android.weex_framework.platform.JSGetter;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.android.weex_framework.platform.JSSetter;
import com.taobao.android.weex_framework.platform.WXComponentProp;
import com.taobao.android.weex_framework.util.f;
import com.taobao.android.weex_framework.util.o;
import com.taobao.weex.common.Constants;
import io.unicorn.embedding.android.UnicornView;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.kge;
import tb.rtd;

/* loaded from: classes9.dex */
public class PlatformViewInput extends WeexPlatformView {
    private static final String BUTTON = "button";
    private static final String CHECKBOX = "checkbox";
    private static final String DATE = "date";
    private static final String DATETIME = "datetime";
    private static final String DEFAULT = "default";
    private static final int DEFAULT_END_YEAR = 2100;
    private static final int DEFAULT_START_YEAR = 1900;
    private static final float DEFAULT_TEXT_SIZE = 14.0f;
    private static final String DONE = "done";
    private static final String EMAIL = "email";
    private static final String FILE = "file";
    private static final String GO = "go";
    private static final String HIDDEN = "hidden";
    private static final String IMAGE = "image";
    private static final String MONTH = "month";
    private static final String NEXT = "next";
    private static final String NUMBER = "number";
    private static final String PASSWORD = "password";
    private static final String RADIO = "radio";
    private static final String RANGE = "range";
    private static final String RESET = "reset";
    private static final String SEARCH = "search";
    private static final String SEND = "send";
    private static final String SUBMIT = "submit";
    private static final String TEL = "tel";
    private static final String TEXT = "text";
    private static final String TIME = "time";
    private static final String URL = "url";
    private static final String WEEK = "week";
    private static SimpleDateFormat dateFormatter;
    private static final Map<String, Integer> mTypeToInputTypeMap;
    private static SimpleDateFormat timeFormatter;
    private boolean mAutofocus;
    private Context mContext;
    private String mEditTextContent;
    private boolean mFirstAttatched;
    private boolean mFixOnReturnEventEnable;
    private boolean mIsSupportShow;
    private int mKeyboardHeight;
    private String mLastChangeText;
    private String mMax;
    private int mMaxLength;
    private String mMin;
    private int mMinKeyboardHeightDetected;
    private View.OnClickListener mOnClickListener;
    private TextView.OnEditorActionListener mOnEditorActionListener;
    private View.OnFocusChangeListener mOnFocusChangeListener;
    private ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    private String mReturnKeyType;
    private VideoRootView mRootView;
    private boolean mSingleLine;
    private TextWatcher mTextWatcher;
    private String mType;
    private UnicornView mUnicornView;
    private EditText mView;
    private Rect mVisibleViewArea;

    /* loaded from: classes9.dex */
    public static class VideoRootView extends FrameLayout {
        private a mDetachedFromWindowListener;
        private b mSizeChangedListener;
        private c mVisibilityChangedListener;

        static {
            kge.a(-202990763);
        }

        public VideoRootView(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.view.View
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
        }

        @Override // android.view.View
        protected void onVisibilityChanged(View view, int i) {
            super.onVisibilityChanged(view, i);
            c cVar = this.mVisibilityChangedListener;
            if (cVar != null) {
                cVar.a(i);
            }
        }

        public VideoRootView whenDetachedFromWindow(a aVar) {
            this.mDetachedFromWindowListener = aVar;
            return this;
        }

        public VideoRootView whenSizeChanged(b bVar) {
            this.mSizeChangedListener = bVar;
            return this;
        }

        public VideoRootView whenVisibilityChanged(c cVar) {
            this.mVisibilityChangedListener = cVar;
            return this;
        }
    }

    /* loaded from: classes9.dex */
    public interface a {
    }

    /* loaded from: classes9.dex */
    public interface b {
    }

    /* loaded from: classes9.dex */
    public interface c {
        void a(int i);
    }

    static {
        kge.a(-753039081);
        HashMap hashMap = new HashMap(9);
        mTypeToInputTypeMap = hashMap;
        hashMap.put("email", 33);
        mTypeToInputTypeMap.put("datetime", 4);
        mTypeToInputTypeMap.put("number", 8194);
        mTypeToInputTypeMap.put("password", 129);
        mTypeToInputTypeMap.put("tel", 193);
        mTypeToInputTypeMap.put("text", 1);
        mTypeToInputTypeMap.put("url", 17);
        mTypeToInputTypeMap.put("date", 0);
        mTypeToInputTypeMap.put("time", 0);
        dateFormatter = null;
        timeFormatter = null;
    }

    public PlatformViewInput(Context context, int i) {
        super(context, i);
        this.mMax = null;
        this.mMin = null;
        boolean z = false;
        this.mMaxLength = 0;
        this.mReturnKeyType = "default";
        this.mType = "text";
        this.mFirstAttatched = true;
        this.mSingleLine = true;
        this.mEditTextContent = "";
        this.mLastChangeText = "";
        this.mIsSupportShow = false;
        this.mVisibleViewArea = new Rect();
        this.mKeyboardHeight = 0;
        this.mFixOnReturnEventEnable = false;
        this.mTextWatcher = new TextWatcher() { // from class: io.unicorn.plugin.platformview.PlatformViewInput.4
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                String str;
                HashMap hashMap = null;
                if (i4 > i3) {
                    String.valueOf(charSequence);
                    str = String.valueOf(charSequence).substring(i2, i4 + i2);
                } else {
                    str = null;
                }
                if (!StringUtils.isEmpty(str)) {
                    hashMap = new HashMap();
                    hashMap.put("value", str);
                }
                PlatformViewInput.this.fireEvent("input", hashMap);
                PlatformViewInput.this.mEditTextContent = String.valueOf(charSequence);
            }
        };
        this.mOnFocusChangeListener = new View.OnFocusChangeListener() { // from class: io.unicorn.plugin.platformview.PlatformViewInput.5
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z2) {
                if (z2) {
                    if (PlatformViewInput.this.mUnicornView != null) {
                        PlatformViewInput.this.mUnicornView.registerEditTextFocusView(PlatformViewInput.this.getEditText());
                    }
                    PlatformViewInput.this.fireEvent(Constants.Event.FOCUS);
                    PlatformViewInput.this.fireEvent("focusin");
                    return;
                }
                if (PlatformViewInput.this.mUnicornView != null) {
                    PlatformViewInput.this.mUnicornView.clearCurEditTextFocusView(PlatformViewInput.this.getEditText());
                }
                PlatformViewInput.this.fireEvent(Constants.Event.BLUR);
                PlatformViewInput.this.fireEvent("focusout");
                PlatformViewInput.this.fireChangeContent();
                PlatformViewInput.this.hideSoftKeyboard();
            }
        };
        this.mOnEditorActionListener = new TextView.OnEditorActionListener() { // from class: io.unicorn.plugin.platformview.PlatformViewInput.6
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                if (i2 == 5) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("value", PlatformViewInput.this.getEditText().getText().toString());
                hashMap.put(Constants.Name.RETURN_KEY_TYPE, PlatformViewInput.this.mReturnKeyType);
                PlatformViewInput.this.fireEvent("return", hashMap);
                if (i2 == 2 || i2 == 3 || i2 == 4) {
                    PlatformViewInput.this.fireChangeContent();
                }
                if (i2 == 6 && PlatformViewInput.this.mSingleLine) {
                    PlatformViewInput.this.hideSoftKeyboard();
                }
                if (!PlatformViewInput.this.mFixOnReturnEventEnable || !PlatformViewInput.this.mSingleLine) {
                    return false;
                }
                return i2 == 2 || i2 == 3 || i2 == 4;
            }
        };
        this.mOnClickListener = new View.OnClickListener() { // from class: io.unicorn.plugin.platformview.PlatformViewInput.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                char c2;
                String str = PlatformViewInput.this.mType;
                int hashCode = str.hashCode();
                if (hashCode != 3076014) {
                    if (hashCode == 3560141 && str.equals("time")) {
                        c2 = 1;
                    }
                    c2 = 65535;
                } else {
                    if (str.equals("date")) {
                        c2 = 0;
                    }
                    c2 = 65535;
                }
                if (c2 == 0) {
                    PlatformViewInput.this.processTypeDate();
                } else if (c2 != 1) {
                } else {
                    PlatformViewInput.this.processTypeTime();
                }
            }
        };
        this.mContext = context;
        this.mRootView = new VideoRootView(context);
        this.mRootView.whenVisibilityChanged(new c() { // from class: io.unicorn.plugin.platformview.PlatformViewInput.1
            @Override // io.unicorn.plugin.platformview.PlatformViewInput.c
            public void a(int i2) {
                PlatformViewInput.this.onVisibilityChanged(i2);
            }
        });
        this.mView = new EditText(context);
        this.mView.setPadding(0, 0, 0, 0);
        this.mView.setBackground(null);
        this.mView.setInputType(1);
        this.mView.setImeOptions(0);
        this.mView.setTextSize(1, DEFAULT_TEXT_SIZE);
        this.mView.setOnEditorActionListener(this.mOnEditorActionListener);
        this.mView.addTextChangedListener(this.mTextWatcher);
        this.mRootView.addView(this.mView);
        this.mView.setOnFocusChangeListener(this.mOnFocusChangeListener);
        String b2 = f.b("weex_input_show_with_size");
        this.mIsSupportShow = b2 == null || "true".equals(b2);
        if (this.mIsSupportShow) {
            this.mMinKeyboardHeightDetected = (int) dpToPX(this.mContext, 60.0f);
            this.mOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.unicorn.plugin.platformview.PlatformViewInput.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    PlatformViewInput.this.checkForKeyboardEventsLegacy();
                }
            };
            this.mView.getViewTreeObserver().addOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
        }
        String b3 = f.b("weex_input_fix_on_return");
        this.mFixOnReturnEventEnable = (b3 == null || "true".equals(b3)) ? true : z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkForKeyboardEventsLegacy() {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        this.mView.getRootView().getWindowVisibleDisplayFrame(this.mVisibleViewArea);
        int safeInsetTop = (this.mContext.getResources().getDisplayMetrics().heightPixels - this.mVisibleViewArea.bottom) + ((Build.VERSION.SDK_INT < 28 || (rootWindowInsets = this.mView.getRootView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) ? 0 : displayCutout.getSafeInsetTop());
        boolean z = true;
        if (this.mKeyboardHeight != safeInsetTop && safeInsetTop > this.mMinKeyboardHeightDetected) {
            this.mKeyboardHeight = safeInsetTop;
            HashMap hashMap = new HashMap();
            hashMap.put("isShow", true);
            hashMap.put("keyboardSize", Integer.valueOf(this.mKeyboardHeight));
            fireEvent("keyboard", hashMap);
            return;
        }
        if (this.mKeyboardHeight == 0 || safeInsetTop > this.mMinKeyboardHeightDetected) {
            z = false;
        }
        if (!z) {
            return;
        }
        this.mKeyboardHeight = 0;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("isShow", false);
        hashMap2.put("keyboardSize", Integer.valueOf(this.mKeyboardHeight));
        fireEvent("keyboard", hashMap2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fireChangeContent() {
        if (!this.mLastChangeText.equals(this.mEditTextContent)) {
            HashMap hashMap = null;
            if (!StringUtils.isEmpty(this.mEditTextContent)) {
                hashMap = new HashMap();
                hashMap.put("value", this.mEditTextContent);
                this.mLastChangeText = this.mEditTextContent;
            }
            fireEvent("change", hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EditText getEditText() {
        return this.mView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideSoftKeyboard() {
        this.mView.clearFocus();
        ((InputMethodManager) this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
        fireChangeContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onVisibilityChanged(int i) {
        if (!this.mFirstAttatched || i != 0 || !this.mAutofocus) {
            return;
        }
        this.mFirstAttatched = false;
        this.mRootView.postDelayed(new Runnable() { // from class: io.unicorn.plugin.platformview.PlatformViewInput.3
            @Override // java.lang.Runnable
            public void run() {
                PlatformViewInput.this.showSoftKeyboard();
            }
        }, 100L);
    }

    private static Date parseDate(String str) {
        if (dateFormatter == null) {
            dateFormatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        }
        if (str != null) {
            try {
                return dateFormatter.parse(str);
            } catch (ParseException unused) {
            }
        }
        return new Date();
    }

    private static Date parseTime(String str) {
        if (timeFormatter == null) {
            timeFormatter = new SimpleDateFormat("HH:mm", Locale.getDefault());
        }
        if (str != null) {
            try {
                return timeFormatter.parse(str);
            } catch (ParseException unused) {
            }
        }
        return new Date();
    }

    private void pickDate(String str, String str2, String str3) {
        long timeInMillis;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parseDate(str));
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.mView.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: io.unicorn.plugin.platformview.PlatformViewInput.8
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                String valueOf;
                String valueOf2;
                int i4 = i2 + 1;
                if (i4 < 10) {
                    valueOf = "0" + i4;
                } else {
                    valueOf = String.valueOf(i4);
                }
                if (i3 < 10) {
                    valueOf2 = "0" + i3;
                } else {
                    valueOf2 = String.valueOf(i3);
                }
                PlatformViewInput.this.getEditText().setText(i + "-" + valueOf + "-" + valueOf2);
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        DatePicker datePicker = datePickerDialog.getDatePicker();
        Calendar calendar2 = Calendar.getInstance(Locale.getDefault());
        Calendar calendar3 = Calendar.getInstance(Locale.getDefault());
        calendar2.set(1900, 0, 1);
        calendar3.set(2100, 11, 31);
        if (!StringUtils.isEmpty(str3)) {
            if (datePicker.getMaxDate() >= parseDate(str3).getTime()) {
                datePicker.setMinDate(parseDate(str3).getTime());
            } else {
                datePicker.setMinDate(calendar2.getTimeInMillis());
                datePicker.setMaxDate(calendar3.getTimeInMillis());
            }
        }
        if (!StringUtils.isEmpty(str2)) {
            if (datePicker.getMinDate() <= parseDate(str2).getTime()) {
                timeInMillis = parseDate(str2).getTime();
            } else {
                datePicker.setMinDate(calendar2.getTimeInMillis());
                timeInMillis = calendar3.getTimeInMillis();
            }
            datePicker.setMaxDate(timeInMillis);
        }
        datePickerDialog.show();
    }

    private void pickTime(String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parseTime(str));
        new TimePickerDialog(this.mView.getContext(), new TimePickerDialog.OnTimeSetListener() { // from class: io.unicorn.plugin.platformview.PlatformViewInput.9
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public void onTimeSet(TimePicker timePicker, int i, int i2) {
                String valueOf;
                String valueOf2;
                if (i < 10) {
                    valueOf = "0" + i;
                } else {
                    valueOf = String.valueOf(i);
                }
                if (i2 < 10) {
                    valueOf2 = "0" + i2;
                } else {
                    valueOf2 = String.valueOf(i2);
                }
                PlatformViewInput.this.getEditText().setText(valueOf + ":" + valueOf2);
            }
        }, calendar.get(11), calendar.get(12), false).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processTypeDate() {
        hideSoftKeyboard();
        pickDate(null, this.mMax, this.mMin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processTypeTime() {
        hideSoftKeyboard();
        pickTime(null);
    }

    private void setInnerReturnKeyType(String str) {
        EditText editText;
        int i;
        if (this.mReturnKeyType.equals(str)) {
            return;
        }
        this.mReturnKeyType = str;
        if ("default".equals(str)) {
            editText = getEditText();
            i = 0;
        } else if (GO.equals(str)) {
            editText = getEditText();
            i = 2;
        } else if ("next".equals(str)) {
            editText = getEditText();
            i = 5;
        } else if ("search".equals(str)) {
            editText = getEditText();
            i = 3;
        } else if (!"send".equals(str)) {
            if ("done".equals(str)) {
                editText = getEditText();
                i = 6;
            }
            ((InputMethodManager) this.mContext.getSystemService("input_method")).restartInput(this.mView);
        } else {
            editText = getEditText();
            i = 4;
        }
        editText.setImeOptions(i);
        ((InputMethodManager) this.mContext.getSystemService("input_method")).restartInput(this.mView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSoftKeyboard() {
        this.mView.post(new o() { // from class: io.unicorn.plugin.platformview.PlatformViewInput.10
            @Override // com.taobao.android.weex_framework.util.o
            public void a() {
                PlatformViewInput.this.mView.requestFocus();
                ((InputMethodManager) PlatformViewInput.this.mContext.getSystemService("input_method")).showSoftInput(PlatformViewInput.this.mView, 1);
            }
        });
    }

    @JSMethod
    public void blur() {
        hideSoftKeyboard();
    }

    @JSMethod
    public void clear() {
        getEditText().setText("");
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void dispose() {
        EditText editText;
        dateFormatter = null;
        timeFormatter = null;
        this.mMin = null;
        this.mMax = null;
        UnicornView unicornView = this.mUnicornView;
        if (unicornView != null) {
            unicornView.clearCurEditTextFocusView(getEditText());
        }
        if (!this.mIsSupportShow || this.mOnGlobalLayoutListener == null || (editText = this.mView) == null || editText.getViewTreeObserver() == null) {
            return;
        }
        this.mView.getViewTreeObserver().removeOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
    }

    public float dpToPX(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    @JSMethod
    public void focus() {
        showSoftKeyboard();
    }

    @JSGetter(name = "value")
    public String getValue() {
        return getEditText().getText().toString();
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public View getView() {
        return this.mRootView;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void onFlutterViewAttached(View view) {
        if (view instanceof UnicornView) {
            this.mUnicornView = (UnicornView) view;
        }
    }

    @WXComponentProp(name = Constants.Name.AUTOFOCUS)
    public void setAutoFocus(boolean z) {
        if (this.mAutofocus == z) {
            return;
        }
        this.mAutofocus = z;
        if (!z) {
            return;
        }
        this.mView.setFocusable(true);
        this.mView.setFocusableInTouchMode(true);
        this.mView.requestFocus();
        this.mView.requestFocusFromTouch();
    }

    @WXComponentProp(name = "caret-color")
    public void setCursorDrawableColor(long j) {
        try {
            int intValue = Long.valueOf(j).intValue();
            if (Build.VERSION.SDK_INT > 28) {
                getEditText().setTextCursorDrawable(new ColorDrawable(intValue));
                return;
            }
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i = declaredField.getInt(getEditText());
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(getEditText());
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {getEditText().getContext().getResources().getDrawable(i), getEditText().getContext().getResources().getDrawable(i)};
            drawableArr[0].setColorFilter(intValue, PorterDuff.Mode.SRC_IN);
            drawableArr[1].setColorFilter(intValue, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, drawableArr);
        } catch (Throwable unused) {
            rtd.e("Weex", "textInput 游标颜色设置失败");
        }
    }

    @WXComponentProp(name = "color")
    public void setFontColor(long j) {
        getEditText().setTextColor((int) j);
    }

    @WXComponentProp(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_font_size)
    public void setFontSize(float f) {
        if (f > 0.0f) {
            getEditText().setTextSize(1, f);
        }
    }

    @WXComponentProp(name = "disabled")
    public void setInputDisabled(boolean z) {
        this.mView.setEnabled(!z);
    }

    @WXComponentProp(name = "placeholder")
    public void setInputHint(String str) {
        getEditText().setHint(str);
    }

    @WXComponentProp(name = Constants.Name.PLACEHOLDER_COLOR)
    public void setInputHintColor(long j) {
        getEditText().setHintTextColor((int) j);
    }

    @WXComponentProp(name = "readonly")
    public void setInputReadOnly(boolean z) {
        if (z) {
            getEditText().setInputType(0);
            getEditText().setTextIsSelectable(true);
            getEditText().setFocusable(false);
            getEditText().setLongClickable(false);
        }
    }

    @WXComponentProp(name = "type")
    public void setInputType(String str) {
        if (this.mType.equals(str)) {
            return;
        }
        if (mTypeToInputTypeMap.containsKey(str)) {
            this.mView.setInputType(mTypeToInputTypeMap.get(str).intValue());
        }
        this.mType = str;
        if (!this.mType.equals("date") && !this.mType.equals("time")) {
            return;
        }
        this.mView.setOnClickListener(this.mOnClickListener);
    }

    @WXComponentProp(name = "value")
    public void setInputValue(String str) {
        if (!getEditText().getText().toString().equals(str)) {
            getEditText().setText(str);
            getEditText().setSelection(getEditText().getText().length());
        }
    }

    @WXComponentProp(name = "max")
    public void setMax(String str) {
        this.mMax = str;
    }

    @WXComponentProp(name = Constants.Name.MAXLENGTH)
    public void setMaxLength(int i) {
        if (i != this.mMaxLength) {
            this.mMaxLength = i;
            getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
    }

    @WXComponentProp(name = Constants.Name.MAX_LENGTH)
    public void setMaxLengthStandard(int i) {
        setMaxLength(i);
    }

    @WXComponentProp(name = "min")
    public void setMin(String str) {
        this.mMin = str;
    }

    @WXComponentProp(name = "backgroundColor")
    public void setPlaygroundColor(long j) {
        getEditText().setBackgroundColor(Long.valueOf(j).intValue());
    }

    @WXComponentProp(name = "background-color")
    public void setPlaygroundColor2(long j) {
        getEditText().setBackgroundColor(Long.valueOf(j).intValue());
    }

    @WXComponentProp(name = "returnkeytype")
    public void setReturnKeyType(String str) {
        setInnerReturnKeyType(str);
    }

    @WXComponentProp(name = Constants.Name.RETURN_KEY_TYPE)
    public void setReturnKeyType1(String str) {
        setInnerReturnKeyType(str);
    }

    @WXComponentProp(name = Constants.Name.SINGLELINE)
    public void setSingleLine(boolean z) {
        this.mSingleLine = z;
        getEditText().setSingleLine(z);
        getEditText().setGravity(48);
        getEditText().setImeOptions(5);
    }

    @WXComponentProp(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_text_align)
    public void setTextAlign(String str) {
        EditText editText;
        int i;
        if (StringUtils.equals(str, "left")) {
            getEditText().setTextAlignment(2);
            editText = getEditText();
            i = 19;
        } else if (!StringUtils.equals(str, "center")) {
            if (!StringUtils.equals(str, "right")) {
                return;
            }
            getEditText().setTextAlignment(3);
            getEditText().setGravity(21);
            return;
        } else {
            getEditText().setTextAlignment(4);
            editText = getEditText();
            i = 17;
        }
        editText.setGravity(i);
    }

    @JSSetter(name = "value")
    public void setValue(String str) {
        if (!getEditText().getText().toString().equals(str)) {
            getEditText().setText(str);
            getEditText().setSelection(getEditText().getText().length());
        }
    }

    @WXComponentProp(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_vertical_align)
    public void setVerticalAlign(String str) {
        EditText editText;
        int i;
        if (StringUtils.equals(str, "top")) {
            editText = getEditText();
            i = 48;
        } else if (!StringUtils.equals(str, "middle")) {
            if (!StringUtils.equals(str, "bottom")) {
                return;
            }
            getEditText().setGravity(80);
            return;
        } else {
            editText = getEditText();
            i = 17;
        }
        editText.setGravity(i);
    }
}
