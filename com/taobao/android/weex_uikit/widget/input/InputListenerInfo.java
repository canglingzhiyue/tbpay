package com.taobao.android.weex_uikit.widget.input;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes6.dex */
public class InputListenerInfo implements TextWatcher, View.OnFocusChangeListener, TextView.OnEditorActionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Set<View.OnFocusChangeListener> focusSet = new HashSet(1);
    private Set<TextView.OnEditorActionListener> actionSet = new HashSet(1);
    private Set<TextWatcher> watcherSet = new HashSet(1);

    static {
        kge.a(-2071943564);
        kge.a(1670231405);
        kge.a(619812765);
        kge.a(632431720);
    }

    public void addFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c6b77", new Object[]{this, onFocusChangeListener});
        } else {
            this.focusSet.add(onFocusChangeListener);
        }
    }

    public void addEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ad3091", new Object[]{this, onEditorActionListener});
        } else {
            this.actionSet.add(onEditorActionListener);
        }
    }

    public void addTextWatcher(TextWatcher textWatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d1e0117", new Object[]{this, textWatcher});
        } else {
            this.watcherSet.add(textWatcher);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        for (TextWatcher textWatcher : this.watcherSet) {
            textWatcher.beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        for (TextWatcher textWatcher : this.watcherSet) {
            textWatcher.onTextChanged(charSequence, i, i2, i3);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            return;
        }
        for (TextWatcher textWatcher : this.watcherSet) {
            textWatcher.afterTextChanged(editable);
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
        }
        for (TextView.OnEditorActionListener onEditorActionListener : this.actionSet) {
            z |= onEditorActionListener.onEditorAction(textView, i, keyEvent);
        }
        return z;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
            return;
        }
        for (View.OnFocusChangeListener onFocusChangeListener : this.focusSet) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }
}
