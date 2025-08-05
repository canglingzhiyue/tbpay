package com.taobao.message.chat.component.chatinput.view.widget;

import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.message.uikit.media.expression.ExpressionTable;
import com.taobao.message.uikit.util.DisplayUtil;
import tb.kge;

/* loaded from: classes7.dex */
public class MeasurableEditText extends EditText {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IPasteCallback pasteCallback;

    /* loaded from: classes7.dex */
    public interface IPasteCallback {
        void onPaste(CharSequence charSequence, CharSequence charSequence2);
    }

    static {
        kge.a(2010011300);
    }

    public static /* synthetic */ Object ipc$super(MeasurableEditText measurableEditText, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -181800469) {
            if (hashCode != 650865254) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        return new Boolean(super.onTextContextMenuItem(((Number) objArr[0]).intValue()));
    }

    public MeasurableEditText(Context context) {
        super(context);
    }

    public MeasurableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeasurableEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setPasteCallback(IPasteCallback iPasteCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9811d95", new Object[]{this, iPasteCallback});
        } else {
            this.pasteCallback = iPasteCallback;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f529f1eb", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 16908322) {
            try {
                ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                if (this.pasteCallback != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0) {
                    this.pasteCallback.onPaste(clipboardManager.getPrimaryClip().getItemAt(0).getText(), clipboardManager.getPrimaryClipDescription().getLabel());
                }
                if (clipboardManager.getText() != null) {
                    SpannableString expressionString = ExpressionTable.getExpressionString(DinamicXEngine.i(), clipboardManager.getText().toString(), true, (int) (getLineHeight() / DisplayUtil.getScreenDensity()));
                    Editable editableText = getEditableText();
                    int selectionStart = getSelectionStart();
                    if (selectionStart >= 0 && selectionStart < editableText.length()) {
                        editableText.insert(selectionStart, expressionString);
                        return true;
                    }
                    editableText.append((CharSequence) expressionString);
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return super.onTextContextMenuItem(i);
    }
}
