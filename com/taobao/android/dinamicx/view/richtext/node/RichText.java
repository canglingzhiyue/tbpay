package com.taobao.android.dinamicx.view.richtext.node;

import android.text.SpannableStringBuilder;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class RichText extends LinkedList<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CharSequence mCachedText;
    private String mDefaultText;

    static {
        kge.a(1170971943);
    }

    public RichText() {
    }

    public RichText(String str) {
        this.mDefaultText = str;
    }

    public CharSequence renderText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("2eff6590", new Object[]{this}) : renderText(false);
    }

    public CharSequence renderText(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("39dc0350", new Object[]{this, new Boolean(z)});
        }
        if (this.mCachedText == null || z) {
            this.mCachedText = renderText(this, z);
        }
        return this.mCachedText;
    }

    public CharSequence renderText(List<b> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("372bf941", new Object[]{this, list, new Boolean(z)});
        }
        if (list.size() == 0) {
            return this.mDefaultText;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (b bVar : list) {
            spannableStringBuilder.append((CharSequence) bVar.b(z));
        }
        return spannableStringBuilder;
    }

    public String originText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0edbf66", new Object[]{this});
        }
        if (size() == 0) {
            return this.mDefaultText;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).b());
        }
        return sb.toString();
    }
}
