package com.alipay.birdnest.view;

import android.content.Context;
import android.os.Build;
import android.text.SpannableStringBuilder;
import mtopsdk.common.util.StringUtils;
import android.widget.TextView;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public class TextViewWrapper extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5275a;
    public int b;
    public int c;
    public OnTextViewTextChangeListener d;
    public BirdNestEngine.EmojiProvider e;

    /* loaded from: classes3.dex */
    public interface OnTextViewTextChangeListener {
        void onTextViewTextChange(TextView textView, String str);
    }

    public TextViewWrapper(Context context) {
        super(context);
        this.c = 9999;
    }

    private int getEmojiSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d99c76ab", new Object[]{this})).intValue() : ((int) getTextSize()) + 8;
    }

    public static /* synthetic */ Object ipc$super(TextViewWrapper textViewWrapper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode != 358241672) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.setText((CharSequence) objArr[0], (TextView.BufferType) objArr[1]);
            return null;
        }
    }

    public final int a() {
        try {
            Field declaredField = TextView.class.getDeclaredField("mSingleLine");
            declaredField.setAccessible(true);
            return declaredField.getBoolean(this) ? 1 : 0;
        } catch (Throwable th) {
            FBLogger.e("TextViewWrapper", th);
            return (Build.VERSION.SDK_INT < 16 || getMaxLines() != 1) ? -1 : 1;
        }
    }

    public OnTextViewTextChangeListener getOnTextChangeListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnTextViewTextChangeListener) ipChange.ipc$dispatch("98debe96", new Object[]{this}) : this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f5275a || this.b <= 0 || getEllipsize() == null || a() != 1) {
            return;
        }
        int leftPaddingOffset = ((i3 - i) - getLeftPaddingOffset()) - getRightPaddingOffset();
        int i5 = this.c;
        if (i5 != 9999) {
            leftPaddingOffset = Math.max(leftPaddingOffset, i5);
        }
        CharSequence text = getText();
        CharSequence ellipsize = StringUtils.ellipsize(text, getPaint(), leftPaddingOffset, getEllipsize());
        if (StringUtils.equals(ellipsize, text)) {
            return;
        }
        if (text.length() > ellipsize.length()) {
            int i6 = this.c;
            if (i6 == 9999) {
                this.c = leftPaddingOffset;
            } else {
                this.c = Math.max(leftPaddingOffset, i6);
            }
        }
        setText(ellipsize);
    }

    public void setEmojiProvider(BirdNestEngine.EmojiProvider emojiProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("163671a9", new Object[]{this, emojiProvider});
        } else {
            this.e = emojiProvider;
        }
    }

    public void setOnTextChangeListener(OnTextViewTextChangeListener onTextViewTextChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad659e0", new Object[]{this, onTextViewTextChangeListener});
        } else {
            this.d = onTextViewTextChangeListener;
        }
    }

    public void setSupportEmoji(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94053394", new Object[]{this, new Boolean(z)});
        } else {
            this.f5275a = z;
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155a5588", new Object[]{this, charSequence, bufferType});
        } else if (this.f5275a && charSequence != null) {
            getEmojiSize();
            String str = Platform.f5257a;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            int renderEmojiReturncount = this.e.renderEmojiReturncount(getContext(), spannableStringBuilder, getEmojiSize());
            this.b = renderEmojiReturncount;
            if (renderEmojiReturncount > 0 && getEllipsize() != null) {
                if (a() == 1) {
                    super.setText(StringUtils.ellipsize(spannableStringBuilder, getPaint(), this.c, getEllipsize()), bufferType);
                } else {
                    super.setText(spannableStringBuilder, bufferType);
                }
            } else {
                super.setText(spannableStringBuilder, bufferType);
            }
            OnTextViewTextChangeListener onTextViewTextChangeListener = this.d;
            if (onTextViewTextChangeListener == null) {
                return;
            }
            onTextViewTextChangeListener.onTextViewTextChange(this, spannableStringBuilder.toString());
        } else {
            super.setText(charSequence, bufferType);
            OnTextViewTextChangeListener onTextViewTextChangeListener2 = this.d;
            if (onTextViewTextChangeListener2 == null || charSequence == null) {
                return;
            }
            onTextViewTextChangeListener2.onTextViewTextChange(this, charSequence.toString());
        }
    }
}
