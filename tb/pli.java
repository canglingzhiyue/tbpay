package tb;

import android.text.InputFilter;
import android.text.Spanned;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class pli implements InputFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f32751a;

    static {
        kge.a(1514915326);
        kge.a(695719296);
    }

    public pli(int i) {
        this.f32751a = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("cf65d449", new Object[]{this, charSequence, new Integer(i), new Integer(i2), spanned, new Integer(i3), new Integer(i4)});
        }
        int length = this.f32751a - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        return (!Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) || (i5 = i5 + (-1)) != i) ? charSequence.subSequence(i, i5) : "";
    }
}
