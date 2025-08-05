package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.android.split.k;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.reflect.Field;
import tb.kge;
import tb.prc;

/* loaded from: classes6.dex */
public class TBLHomeNativeSearchInputView extends BaseEmbedView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TUrlImageView clearBtn;
    private LinearLayout linearLayout;
    private String mViewType = "tbl_home_native_search_input_view";
    private EditText searchEditText;

    static {
        kge.a(-14479963);
    }

    public static /* synthetic */ EditText access$000(TBLHomeNativeSearchInputView tBLHomeNativeSearchInputView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("930a2894", new Object[]{tBLHomeNativeSearchInputView}) : tBLHomeNativeSearchInputView.searchEditText;
    }

    public static /* synthetic */ TUrlImageView access$100(TBLHomeNativeSearchInputView tBLHomeNativeSearchInputView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("baa04d38", new Object[]{tBLHomeNativeSearchInputView}) : tBLHomeNativeSearchInputView.clearBtn;
    }

    public static /* synthetic */ String access$200(TBLHomeNativeSearchInputView tBLHomeNativeSearchInputView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("161e0ddd", new Object[]{tBLHomeNativeSearchInputView}) : tBLHomeNativeSearchInputView.mViewType;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35692924", new Object[]{this}) : this.mViewType;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(final Context context) {
        k.a().c(context, e.TAOLIVE_HOMEPAGE);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(19);
        this.linearLayout = new LinearLayout(context);
        this.linearLayout.setOrientation(0);
        this.linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.linearLayout.setGravity(19);
        this.searchEditText = new EditText(context);
        this.searchEditText.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        layoutParams.leftMargin = prc.a(context, 11.0f);
        layoutParams.gravity = 16;
        this.searchEditText.setLayoutParams(layoutParams);
        this.searchEditText.setTextSize(1, 15.0f);
        this.searchEditText.setBackground(null);
        this.searchEditText.setPadding(0, 1, 0, 1);
        if (Build.VERSION.SDK_INT >= 29) {
            this.searchEditText.setTextCursorDrawable(context.getResources().getDrawable(R.drawable.search_input_cursor_flexalocal));
        } else {
            try {
                Drawable drawable = context.getResources().getDrawable(R.drawable.search_input_cursor_flexalocal);
                Field declaredField = this.searchEditText.getClass().getDeclaredField("mCursorDrawable");
                declaredField.setAccessible(true);
                declaredField.set(this.searchEditText, new Drawable[]{drawable});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.linearLayout.addView(this.searchEditText);
        this.searchEditText.addTextChangedListener(new TextWatcher() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TBLHomeNativeSearchInputView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                }
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
                    return;
                }
                String charSequence2 = charSequence.toString();
                if (!TextUtils.isEmpty(charSequence2)) {
                    if (charSequence2.length() > 30) {
                        Toast.makeText(context, "只能最多输入30个字哦", 0).show();
                        if (TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this) != null) {
                            TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this).setText(charSequence2.substring(0, 29));
                            TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this).setSelection(TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this).getText().length());
                        }
                    }
                    if (TBLHomeNativeSearchInputView.access$100(TBLHomeNativeSearchInputView.this) != null) {
                        TBLHomeNativeSearchInputView.access$100(TBLHomeNativeSearchInputView.this).setVisibility(0);
                    }
                } else if (TBLHomeNativeSearchInputView.access$100(TBLHomeNativeSearchInputView.this) != null) {
                    TBLHomeNativeSearchInputView.access$100(TBLHomeNativeSearchInputView.this).setVisibility(8);
                }
                WVStandardEventCenter.postNotificationToJS(TBLHomeNativeSearchInputView.this.webView, TBLHomeNativeSearchInputView.access$200(TBLHomeNativeSearchInputView.this) + "_onInputSearchTextChanged_" + TBLHomeNativeSearchInputView.this.id, "{\"bridgeId\":\"" + TBLHomeNativeSearchInputView.this.id + "\",\"data\":\"" + charSequence2 + "\"}");
            }
        });
        this.searchEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TBLHomeNativeSearchInputView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                }
                if (i != 6 && i != 0 && i != 2) {
                    return false;
                }
                if (TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this) != null && TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this).getText() != null) {
                    WVStandardEventCenter.postNotificationToJS(TBLHomeNativeSearchInputView.this.webView, TBLHomeNativeSearchInputView.access$200(TBLHomeNativeSearchInputView.this) + "_onKetboardSearch_" + TBLHomeNativeSearchInputView.this.id, "{\"bridgeId\":\"" + TBLHomeNativeSearchInputView.this.id + "\",\"data\":\"" + TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this).getText().toString() + "\"}");
                    TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this).setFocusable(false);
                    InputMethodManager inputMethodManager = (InputMethodManager) TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this).getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this).getWindowToken(), 0);
                    }
                }
                return true;
            }
        });
        this.searchEditText.postDelayed(new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TBLHomeNativeSearchInputView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this) == null) {
                } else {
                    TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this).setFocusable(true);
                    TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this).requestFocus();
                    ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this), 1);
                }
            }
        }, 100L);
        this.clearBtn = new TUrlImageView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(prc.a(context, 15.0f), prc.a(context, 15.0f));
        layoutParams2.rightMargin = prc.a(context, 12.0f);
        this.clearBtn.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01u8oMI81H36dWZeGSl_!!6000000000701-2-tps-60-60.png");
        this.clearBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TBLHomeNativeSearchInputView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this) == null) {
                } else {
                    TBLHomeNativeSearchInputView.access$000(TBLHomeNativeSearchInputView.this).setText("");
                    WVStandardEventCenter.postNotificationToJS(TBLHomeNativeSearchInputView.this.webView, TBLHomeNativeSearchInputView.access$200(TBLHomeNativeSearchInputView.this) + "_onInputSearchTextChanged_" + TBLHomeNativeSearchInputView.this.id, "{\"bridgeId\":\"" + TBLHomeNativeSearchInputView.this.id + "\",\"data\":\"\"}");
                }
            }
        });
        this.clearBtn.setVisibility(8);
        this.linearLayout.addView(this.clearBtn, layoutParams2);
        linearLayout.addView(this.linearLayout);
        linearLayout.setBackgroundColor(-1);
        return linearLayout;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getH5Params".equals(str)) {
            if (!TextUtils.isEmpty(str2) && this.searchEditText != null) {
                JSONObject parseObject = JSON.parseObject(str2);
                if (parseObject != null && !parseObject.isEmpty()) {
                    this.searchEditText.setHint(parseObject.getString(TaoliveSearchHotWords.TYPE_HINT));
                    this.searchEditText.setHintTextColor(Color.parseColor("#7C889C"));
                    this.searchEditText.setTextColor(Color.parseColor("#11192D"));
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(Color.parseColor(parseObject.getString(com.taobao.tao.infoflow.multitab.e.KEY_BG_COLOR)));
                    gradientDrawable.setCornerRadius(prc.a(getView().getContext(), parseObject.getInteger("cornerRadius").intValue()));
                    LinearLayout linearLayout = this.linearLayout;
                    if (linearLayout != null) {
                        linearLayout.setBackground(gradientDrawable);
                    }
                }
                return true;
            }
        } else if ("getInputSearchText".equals(str)) {
            EditText editText = this.searchEditText;
            if (editText != null && editText.getText() != null) {
                WVStandardEventCenter.postNotificationToJS(this.webView, this.mViewType + "_onInputSearchTextChanged_" + this.id, "{\"bridgeId\":\"" + this.id + "\",\"data\":\"" + this.searchEditText.getText().toString() + "\"}");
            }
            return true;
        }
        return false;
    }
}
