package com.etao.feimagesearch.newresult.widget.titlebar.searchbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.CornerImageView;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.coy;
import tb.kge;

/* loaded from: classes3.dex */
public final class Irp2024SearchBarWidget implements TextWatcher, View.OnClickListener, TextView.OnEditorActionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context activity;
    private TUrlImageView clearView;
    private final View closeBtn;
    private final ViewGroup container;
    private TextView contentTv;
    private String curSearchContent;
    private final String defaultHint;
    private View hintContainer;
    private String hintQuery;
    private EditText inputView;
    private boolean isDarkMode;
    private boolean isTriggerElder;
    private View rootView;
    private final TextView searchBtn;
    private com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a searchStateListener;
    private CornerImageView thumbView;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Irp2024SearchBarWidget.access$getInputView$p(Irp2024SearchBarWidget.this).requestFocus();
            Irp2024SearchBarWidget.access$optionInputMethod(Irp2024SearchBarWidget.this, true);
        }
    }

    static {
        kge.a(193717654);
        kge.a(1670231405);
        kge.a(-1201612728);
        kge.a(619812765);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    public Irp2024SearchBarWidget(Context activity, ViewGroup container, boolean z, boolean z2, com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a aVar) {
        q.c(activity, "activity");
        q.c(container, "container");
        this.activity = activity;
        this.container = container;
        this.isDarkMode = z;
        this.isTriggerElder = z2;
        this.searchStateListener = aVar;
        this.defaultHint = "输入想搜的内容";
        View inflate = LayoutInflater.from(this.activity).inflate(R.layout.feis_search_bar_2024, this.container, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(j.b(6.5f));
        gradientDrawable.setColor(Color.parseColor("#FFFFFF"));
        inflate.setBackground(gradientDrawable);
        Irp2024SearchBarWidget irp2024SearchBarWidget = this;
        inflate.setOnClickListener(irp2024SearchBarWidget);
        q.a((Object) inflate, "LayoutInflater.from(acti…024SearchBarWidget)\n    }");
        this.rootView = inflate;
        this.hintQuery = "";
        this.curSearchContent = "";
        View findViewById = this.rootView.findViewById(R.id.fl_et_container);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(j.b(4.5f));
        gradientDrawable2.setColor(Color.parseColor("#F3F6F8"));
        findViewById.setBackground(gradientDrawable2);
        View findViewById2 = this.rootView.findViewById(R.id.iv_thumbnail);
        CornerImageView cornerImageView = (CornerImageView) findViewById2;
        cornerImageView.setRadius(j.b(6.5f));
        cornerImageView.setBackgroundColor(Color.parseColor("#222222"));
        q.a((Object) findViewById2, "rootView.findViewById<Co…seColor(\"#222222\"))\n    }");
        this.thumbView = cornerImageView;
        View findViewById3 = this.rootView.findViewById(R.id.et_search_bar);
        EditText editText = (EditText) findViewById3;
        editText.addTextChangedListener(this);
        editText.setOnEditorActionListener(this);
        editText.setHint(this.defaultHint);
        float f = 18.0f;
        editText.setTextSize(1, this.isTriggerElder ? 18.0f : 16.0f);
        q.a((Object) findViewById3, "rootView.findViewById<Ed…lder) 18f else 16f)\n    }");
        this.inputView = editText;
        View findViewById4 = this.rootView.findViewById(R.id.btn_clear);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById4;
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN016xbmRY1ahO8yUKOWb_!!6000000003361-49-tps-500-500.webp");
        tUrlImageView.setOnClickListener(irp2024SearchBarWidget);
        tUrlImageView.setVisibility(8);
        tUrlImageView.setContentDescription(b.a(R.string.taobao_app_1007_1_18996) + ',' + b.a(R.string.taobao_app_1007_button));
        q.a((Object) findViewById4, "rootView.findViewById<TU…07_button)\n      }\"\n    }");
        this.clearView = tUrlImageView;
        View findViewById5 = this.rootView.findViewById(R.id.fl_hint_container);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(j.b(4.5f));
        gradientDrawable3.setColor(Color.parseColor("#F3F6F8"));
        findViewById5.setBackground(gradientDrawable3);
        q.a((Object) findViewById5, "rootView.findViewById<Vi…\"#F3F6F8\"))\n      }\n    }");
        this.hintContainer = findViewById5;
        View findViewById6 = this.rootView.findViewById(R.id.tv_content);
        TextView textView = (TextView) findViewById6;
        textView.setTextSize(1, this.isTriggerElder ? 18.0f : 16.0f);
        textView.setOnClickListener(irp2024SearchBarWidget);
        q.a((Object) findViewById6, "rootView.findViewById<Te…024SearchBarWidget)\n    }");
        this.contentTv = textView;
        TUrlImageView tUrlImageView2 = (TUrlImageView) this.rootView.findViewById(R.id.btn_content_clear);
        tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN016xbmRY1ahO8yUKOWb_!!6000000003361-49-tps-500-500.webp");
        tUrlImageView2.setOnClickListener(irp2024SearchBarWidget);
        tUrlImageView2.setContentDescription(b.a(R.string.taobao_app_1007_1_18996) + ',' + b.a(R.string.taobao_app_1007_button));
        View findViewById7 = this.rootView.findViewById(R.id.btn_search);
        TextView textView2 = (TextView) findViewById7;
        textView2.setTextSize(1, this.isTriggerElder ? 18.0f : 16.0f);
        textView2.setOnClickListener(irp2024SearchBarWidget);
        textView2.setContentDescription(b.a(R.string.taobao_app_1007_search) + ',' + b.a(R.string.taobao_app_1007_button));
        q.a((Object) findViewById7, "rootView.findViewById<Te…07_button)\n      }\"\n    }");
        this.searchBtn = textView2;
        View findViewById8 = this.rootView.findViewById(R.id.btn_close);
        TextView textView3 = (TextView) findViewById8;
        textView3.setTextSize(1, !this.isTriggerElder ? 16.0f : f);
        textView3.setOnClickListener(irp2024SearchBarWidget);
        textView3.setTextColor(Color.parseColor(this.isDarkMode ? "#383838" : "#11192D"));
        textView3.setContentDescription(b.a(R.string.taobao_app_1007_close) + ',' + b.a(R.string.taobao_app_1007_button));
        q.a((Object) findViewById8, "rootView.findViewById<Te…07_button)\n      }\"\n    }");
        this.closeBtn = findViewById8;
    }

    public static final /* synthetic */ EditText access$getInputView$p(Irp2024SearchBarWidget irp2024SearchBarWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("df3e4f2e", new Object[]{irp2024SearchBarWidget}) : irp2024SearchBarWidget.inputView;
    }

    public static final /* synthetic */ void access$optionInputMethod(Irp2024SearchBarWidget irp2024SearchBarWidget, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463ad166", new Object[]{irp2024SearchBarWidget, new Boolean(z)});
        } else {
            irp2024SearchBarWidget.optionInputMethod(z);
        }
    }

    public static final /* synthetic */ void access$setInputView$p(Irp2024SearchBarWidget irp2024SearchBarWidget, EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45aa7794", new Object[]{irp2024SearchBarWidget, editText});
        } else {
            irp2024SearchBarWidget.inputView = editText;
        }
    }

    public /* synthetic */ Irp2024SearchBarWidget(Context context, ViewGroup viewGroup, boolean z, boolean z2, com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a aVar, int i, o oVar) {
        this(context, viewGroup, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, aVar);
    }

    public final boolean isVisible() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue() : this.rootView.getParent() != null;
    }

    public final void setQueryTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1d13c5", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.curSearchContent = str;
        closeSearchDoor(true);
    }

    public final String getHintQuery() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e3cd40e", new Object[]{this}) : this.hintQuery;
    }

    public final void setHintQuery(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b9b6990", new Object[]{this, str});
            return;
        }
        if (str != null) {
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                this.inputView.setHint(str2);
                this.hintQuery = str;
                updateSearchBtnState();
            }
        }
        this.inputView.setHint(this.defaultHint);
        this.hintQuery = "";
        updateSearchBtnState();
    }

    public final void setThumbContent(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78040262", new Object[]{this, bitmap});
        } else {
            this.thumbView.setImageBitmap(bitmap);
        }
    }

    public final void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        openSearchDoor();
        if (this.rootView.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, j.a(51.0f));
            layoutParams.gravity = 16;
            int a2 = j.a(17.0f);
            layoutParams.setMargins(a2, 0, a2, 0);
            this.container.addView(this.rootView, layoutParams);
        }
        com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a aVar = this.searchStateListener;
        if (aVar == null) {
            return;
        }
        aVar.a(true);
    }

    private final void optionInputMethod(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fa0357", new Object[]{this, new Boolean(z)});
        } else if (z) {
            Object systemService = this.activity.getSystemService("input_method");
            if (systemService == null) {
                return;
            }
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
            ((InputMethodManager) systemService).showSoftInput(this.inputView, 1);
        } else {
            Object systemService2 = this.activity.getSystemService("input_method");
            if (systemService2 == null) {
                return;
            }
            if (systemService2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
            InputMethodManager inputMethodManager = (InputMethodManager) systemService2;
            Context context = this.activity;
            if (context == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
            Window window = ((Activity) context).getWindow();
            q.a((Object) window, "(activity as Activity).window");
            View decorView = window.getDecorView();
            q.a((Object) decorView, "(activity as Activity).window.decorView");
            inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
        }
    }

    private final void updateSearchBtnState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7bd40d", new Object[]{this});
        } else if (TextUtils.isEmpty(getValidQuery())) {
            this.searchBtn.setClickable(false);
            this.searchBtn.setTextColor(Color.parseColor(this.isDarkMode ? "#777777" : "#CACFD7"));
        } else {
            this.searchBtn.setClickable(true);
            this.searchBtn.setTextColor(Color.parseColor("#FF6200"));
        }
    }

    private final void openSearchDoor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc4ebe7", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a aVar = this.searchStateListener;
        if (aVar != null) {
            aVar.b(true);
        }
        this.searchBtn.setVisibility(0);
        this.inputView.setVisibility(0);
        this.hintContainer.setVisibility(8);
        this.curSearchContent = "";
        this.inputView.setText(this.curSearchContent);
        EditText editText = this.inputView;
        editText.setSelection(editText.getText().length());
        this.inputView.post(new a());
        updateSearchBtnState();
    }

    private final void closeSearchDoor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd077a5f", new Object[]{this, new Boolean(z)});
            return;
        }
        String validQuery = getValidQuery();
        if (validQuery == null) {
            validQuery = "";
        }
        this.curSearchContent = validQuery;
        this.hintContainer.setVisibility(z ? 0 : 8);
        this.contentTv.setText(this.curSearchContent);
        optionInputMethod(false);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
        } else if (editable == null) {
        } else {
            updateSearchBtnState();
            Editable editable2 = editable;
            this.clearView.setVisibility(editable2.length() > 0 ? 0 : 8);
            ViewGroup.LayoutParams layoutParams = this.inputView.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (editable2.length() <= 0) {
                z = false;
            }
            layoutParams2.setMargins(0, 0, z ? j.a(31.0f) : 0, 0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        if (view == null) {
            q.a();
        }
        int id = view.getId();
        if (id == R.id.btn_clear) {
            this.inputView.setText("");
            com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a aVar = this.searchStateListener;
            if (aVar == null) {
                return;
            }
            aVar.b(true);
        } else if (id == R.id.btn_search) {
            onSearchClick();
        } else if (id == R.id.btn_close) {
            closeSearchDoor(false);
            hide();
        } else if (id == R.id.tv_content) {
            this.hintContainer.setVisibility(8);
        } else if (id != R.id.btn_content_clear) {
        } else {
            this.hintContainer.setVisibility(8);
            this.inputView.setText("");
            com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a aVar2 = this.searchStateListener;
            if (aVar2 == null) {
                return;
            }
            aVar2.b(true);
        }
    }

    private final void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a aVar = this.searchStateListener;
        if (aVar != null) {
            aVar.b(false);
        }
        this.container.removeView(this.rootView);
        optionInputMethod(false);
        com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a aVar2 = this.searchStateListener;
        if (aVar2 == null) {
            return;
        }
        aVar2.a(false);
    }

    private final String getValidQuery() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9587ca17", new Object[]{this});
        }
        Editable text = this.inputView.getText();
        if (text == null) {
            return null;
        }
        if (text.length() > 0) {
            z = true;
        }
        if (z) {
            return text.toString();
        }
        return this.hintQuery;
    }

    private final void onSearchClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6402d68", new Object[]{this});
        } else if (TextUtils.isEmpty(getValidQuery())) {
        } else {
            com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a aVar = this.searchStateListener;
            if (aVar != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.add(this.curSearchContent);
                aVar.a(jSONArray);
            }
            coy.a("Page_PhotoSearchResult", "starttextsearch", new String[0]);
            closeSearchDoor(true);
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 3) {
            return false;
        }
        onSearchClick();
        return true;
    }
}
