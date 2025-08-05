package com.alibaba.android.ultron.trade.dinamicX.constructor;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.dinamic.f;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Map;
import tb.bmm;
import tb.bmn;
import tb.fpd;
import tb.fpo;
import tb.fpq;
import tb.fpr;
import tb.kge;

/* loaded from: classes2.dex */
public class TradeTextInputConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_TEXT_COLOR = -16777216;
    private static final int DEFAULT_TEXT_SIZE = 12;
    private static final int ELLIPSIZE_END = 3;
    private static final int ELLIPSIZE_MIDDLE = 2;
    private static final int ELLIPSIZE_NONE = 0;
    private static final int ELLIPSIZE_START = 1;
    private static final String ET_KEYBOARD = "dKeyboard";
    private static final String ET_MAX_LENGTH = "dMaxLength";
    private static final String ET_PLACE_HOLDER = "dPlaceholder";
    private static final String ET_PLACE_HOLDER_COLOR = "dPlaceholderColor";
    public static final int ID_KEY_BOARD;
    public static final int ID_MAX_LENGTH;
    public static final int ID_PLACE_HOLDER;
    public static final int ID_PLACE_HOLDER_COLOR;
    public static final int ID_TV_TEXT;
    private static final String INPUT_TYPE = "dInputType";
    public static final String INPUT_TYPE_DIALOG = "dialog";
    public static final String INPUT_TYPE_INPUT = "input";
    private static final int TEXT_ALIGNMENT_CENTER = 1;
    private static final int TEXT_ALIGNMENT_LEFT = 0;
    private static final int TEXT_ALIGNMENT_RIGHT = 2;
    private static final int TEXT_STYLE_BOLD = 1;
    private static final int TEXT_STYLE_BOLD_ITALIC = 3;
    private static final int TEXT_STYLE_ITALIC = 2;
    private static final int TEXT_STYLE_NORMAL = 0;
    private static final int TEXT_WATCHER;
    private static final String TV_LINE_BREAK_MODE = "dLineBreakMode";
    private static final String TV_TEXT = "dText";
    private static final String TV_TEXT_ALIGNMENT = "dTextAlignment";
    private static final String TV_TEXT_COLOR = "dTextColor";
    private static final String TV_TEXT_GRAVITY = "dTextGravity";
    private static final String TV_TEXT_SIZE = "dTextSize";
    private static final String VIEW_ACCESSIBILITY_TEXT_HIDDEN = "dAccessibilityTextHidden";
    private static final String VIEW_EVENT_ON_FINISH = "onFinish";
    public static final String VIEW_TAG = "TradeTextInput";

    public static /* synthetic */ Object ipc$super(TradeTextInputConstructor tradeTextInputConstructor, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 333836301) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (fpd) objArr[3]);
            return null;
        } else if (hashCode != 2131214456) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.applyDefaultProperty((View) objArr[0], (Map) objArr[1], (fpd) objArr[2]);
            return null;
        }
    }

    public static /* synthetic */ int access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue() : TEXT_WATCHER;
    }

    static {
        kge.a(49384427);
        ID_TV_TEXT = R.id.trade_id_text;
        ID_KEY_BOARD = R.id.trade_id_key_board;
        ID_MAX_LENGTH = R.id.trade_id_max_length;
        ID_PLACE_HOLDER = R.id.trade_id_place_holder;
        ID_PLACE_HOLDER_COLOR = R.id.trade_id_place_holder_color;
        TEXT_WATCHER = R.id.trade_text_watcher;
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new EditText(context, attributeSet);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
            return;
        }
        super.setAttributes(view, map, arrayList, fpdVar);
        EditText editText = (EditText) view;
        if (arrayList.contains(TV_TEXT)) {
            String str = (String) map.get(TV_TEXT);
            bmm.e(editText, str);
            view.setTag(ID_TV_TEXT, str);
        }
        if (arrayList.contains("dTextSize")) {
            setTextSize(editText, (String) map.get("dTextSize"));
        }
        if (arrayList.contains("dTextColor")) {
            setTextColor(editText, (String) map.get("dTextColor"));
        }
        if (arrayList.contains(TV_TEXT_GRAVITY) || arrayList.contains(TV_TEXT_ALIGNMENT)) {
            setTextGravity(editText, (String) map.get(TV_TEXT_GRAVITY), (String) map.get(TV_TEXT_ALIGNMENT));
        }
        if (arrayList.contains(ET_PLACE_HOLDER)) {
            String str2 = (String) map.get(ET_PLACE_HOLDER);
            bmm.c(editText, str2);
            view.setTag(ID_PLACE_HOLDER, str2);
        }
        if (arrayList.contains(ET_PLACE_HOLDER_COLOR)) {
            String str3 = (String) map.get(ET_PLACE_HOLDER_COLOR);
            bmm.d(editText, str3);
            view.setTag(ID_PLACE_HOLDER_COLOR, str3);
        }
        if (arrayList.contains(ET_KEYBOARD)) {
            String str4 = (String) map.get(ET_KEYBOARD);
            bmm.a(editText, str4);
            view.setTag(ID_KEY_BOARD, str4);
        }
        if (arrayList.contains(ET_MAX_LENGTH)) {
            String str5 = (String) map.get(ET_MAX_LENGTH);
            bmm.b(editText, str5);
            view.setTag(ID_MAX_LENGTH, str5);
        }
        if (!arrayList.contains(INPUT_TYPE)) {
            return;
        }
        enableEditTextFocus(editText, "input".equalsIgnoreCase((String) map.get(INPUT_TYPE)));
    }

    private void enableEditTextFocus(EditText editText, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e8ba", new Object[]{this, editText, new Boolean(z)});
        } else if (editText == null) {
        } else {
            editText.setFocusable(z);
            editText.setFocusableInTouchMode(z);
        }
    }

    private void setBackground(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff662732", new Object[]{this, editText, str});
        } else {
            editText.setBackgroundColor(com.alibaba.android.ultron.trade.utils.b.a(str, -16777216));
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void applyDefaultProperty(View view, Map<String, Object> map, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f07c078", new Object[]{this, view, map, fpdVar});
            return;
        }
        super.applyDefaultProperty(view, map, fpdVar);
        EditText editText = (EditText) view;
        editText.setLines(1);
        editText.setSingleLine();
        editText.setImeOptions(6);
        if (!map.containsKey("dTextSize")) {
            editText.setTextSize(1, 12.0f);
        }
        if (!map.containsKey("dTextColor")) {
            editText.setTextColor(-16777216);
        }
        if (!map.containsKey(TV_LINE_BREAK_MODE)) {
            editText.setEllipsize(null);
        }
        if (!map.containsKey(TV_TEXT_GRAVITY) && !map.containsKey(TV_TEXT_ALIGNMENT)) {
            editText.setGravity(16);
        }
        if (map.containsKey(VIEW_ACCESSIBILITY_TEXT_HIDDEN)) {
            return;
        }
        setAccessibilityHidden(view, true);
    }

    public void setTextSize(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92642512", new Object[]{this, editText, str});
            return;
        }
        int a2 = fpr.a(editText.getContext(), str, -1);
        if (a2 == -1) {
            editText.setTextSize(1, 12.0f);
        } else {
            editText.setTextSize(0, a2);
        }
    }

    public void setTextStyle(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ca35e0", new Object[]{this, editText, str});
        } else if (TextUtils.isEmpty(str)) {
            editText.setTypeface(Typeface.defaultFromStyle(0));
        } else {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue == 0) {
                editText.setTypeface(Typeface.defaultFromStyle(0));
            } else if (intValue == 1) {
                editText.setTypeface(Typeface.defaultFromStyle(1));
            } else if (intValue == 2) {
                editText.setTypeface(Typeface.defaultFromStyle(2));
            } else if (intValue != 3) {
            } else {
                editText.setTypeface(Typeface.defaultFromStyle(3));
            }
        }
    }

    public void setTextTheme(EditText editText, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be991292", new Object[]{this, editText, str, str2});
        } else if (str != null) {
            if ("normal".equals(str)) {
                editText.setTypeface(Typeface.defaultFromStyle(0));
            } else if ("bold".equals(str)) {
                editText.setTypeface(Typeface.defaultFromStyle(1));
            } else if ("italic".equals(str)) {
                editText.setTypeface(Typeface.defaultFromStyle(2));
            } else {
                editText.setTypeface(Typeface.defaultFromStyle(0));
            }
        } else {
            setTextStyle(editText, str2);
        }
    }

    public void setTextColor(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd291ee", new Object[]{this, editText, str});
        } else {
            editText.setTextColor(com.alibaba.android.ultron.trade.utils.b.a(str, -16777216));
        }
    }

    public void setTextLineBreakMode(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442d9d43", new Object[]{this, editText, str});
            return;
        }
        int intValue = Integer.valueOf(str).intValue();
        if (intValue == 0) {
            editText.setEllipsize(null);
        } else if (intValue == 1) {
            editText.setEllipsize(TextUtils.TruncateAt.START);
        } else if (intValue == 2) {
            editText.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (intValue != 3) {
        } else {
            editText.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public void setTextGravity(EditText editText, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1126ed", new Object[]{this, editText, str, str2});
        } else if (str != null) {
            if ("left".equals(str)) {
                editText.setGravity(19);
            } else if ("center".equals(str)) {
                editText.setGravity(17);
            } else if ("right".equals(str)) {
                editText.setGravity(21);
            } else {
                editText.setGravity(16);
            }
        } else {
            setTextAlignment(editText, str2);
        }
    }

    public void setTextAlignment(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f828fee", new Object[]{this, editText, str});
            return;
        }
        int intValue = Integer.valueOf(str).intValue();
        if (intValue == 0) {
            editText.setGravity(19);
        } else if (intValue == 1) {
            editText.setGravity(17);
        } else if (intValue != 2) {
        } else {
            editText.setGravity(21);
        }
    }

    public void setMaxLines(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97dfbc45", new Object[]{this, editText, str});
            return;
        }
        Integer valueOf = Integer.valueOf(str);
        if (valueOf.intValue() <= 0) {
            editText.setMaxLines(Integer.MAX_VALUE);
        } else if (valueOf.intValue() == 1) {
            editText.setMaxLines(1);
        } else {
            editText.setMaxLines(valueOf.intValue());
        }
    }

    public void setMaxWidth(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce8f29e", new Object[]{this, editText, str});
            return;
        }
        int a2 = fpr.a(editText.getContext(), str, -1);
        if (a2 == -1) {
            return;
        }
        editText.setMaxWidth(a2);
    }

    public void setDeleteLine(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8868001", new Object[]{this, editText, str});
        } else if (!TextUtils.equals(PromotionFilterBean.SINGLE, str)) {
        } else {
            editText.getPaint().setFlags(16);
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setEvents(View view, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a6a1c6", new Object[]{this, view, fpdVar});
        } else {
            new a().a(view, fpdVar);
        }
    }

    /* loaded from: classes2.dex */
    public static class a extends fpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1041522303);
        }

        @Override // tb.fpo
        public void a(View view, fpd fpdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb350c0", new Object[]{this, view, fpdVar});
            } else {
                b(view, fpdVar);
            }
        }

        public void b(final View view, final fpd fpdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e3909f", new Object[]{this, view, fpdVar});
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.setFocusable(true);
                viewGroup.setFocusableInTouchMode(true);
            }
            final fpq fpqVar = (fpq) view.getTag(f.PROPERTY_KEY);
            if (fpqVar == null) {
                return;
            }
            final Map<String, String> map = fpqVar.d;
            if (map.isEmpty()) {
                return;
            }
            b bVar = (b) view.getTag(TradeTextInputConstructor.access$000());
            if (bVar != null) {
                ((EditText) view).removeTextChangedListener(bVar);
            }
            b bVar2 = new b(this, view, fpqVar);
            bVar2.a(fpdVar);
            view.setTag(TradeTextInputConstructor.access$000(), bVar2);
            ((EditText) view).addTextChangedListener(bVar2);
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.alibaba.android.ultron.trade.dinamicX.constructor.TradeTextInputConstructor.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view2, motionEvent})).booleanValue();
                    }
                    if (motionEvent.getActionMasked() != 1 || view2.isFocusable()) {
                        return false;
                    }
                    bmn bmnVar = new bmn(view2.getContext());
                    bmnVar.a((EditText) view);
                    bmnVar.a(new bmn.a() { // from class: com.alibaba.android.ultron.trade.dinamicX.constructor.TradeTextInputConstructor.a.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.bmn.a
                        public void a(DialogInterface dialogInterface, CharSequence charSequence) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("14e7e1a2", new Object[]{this, dialogInterface, charSequence});
                            } else {
                                a.this.a(view, fpdVar, fpqVar, (String) map.get("onFinish"));
                            }
                        }
                    });
                    bmnVar.show();
                    return true;
                }
            });
        }

        public void a(View view, fpd fpdVar, fpq fpqVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cba71273", new Object[]{this, view, fpdVar, fpqVar, str});
            } else if (TextUtils.isEmpty(str)) {
            } else {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add("dialog");
                arrayList.add(((EditText) view).getText());
                view.setTag(f.VIEW_PARAMS, arrayList);
                b(view, fpdVar, fpqVar, str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private fpd f2659a;
        private fpq b;
        private String c;
        private View d;
        private a e;

        static {
            kge.a(-813514402);
            kge.a(1670231405);
        }

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

        public b(a aVar, View view, fpq fpqVar) {
            this.e = aVar;
            this.b = fpqVar;
            this.d = view;
            Map<String, String> map = fpqVar.d;
            if (!map.isEmpty()) {
                this.c = map.get("onFinish");
            }
        }

        public void a(fpd fpdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8fbfbbe", new Object[]{this, fpdVar});
            } else {
                this.f2659a = fpdVar;
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (!this.d.isFocusable() || TextUtils.isEmpty(this.c)) {
            } else {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add("input");
                arrayList.add(((EditText) this.d).getText());
                this.d.setTag(f.VIEW_PARAMS, arrayList);
                a.b(this.d, this.f2659a, this.b, this.c);
            }
        }
    }
}
