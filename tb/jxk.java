package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* loaded from: classes6.dex */
public class jxk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EMPTY = "";

    /* renamed from: a  reason: collision with root package name */
    private static ThreadLocal<DateFormat> f29848a = new ThreadLocal<DateFormat>() { // from class: tb.jxk.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.text.DateFormat] */
        @Override // java.lang.ThreadLocal
        public /* synthetic */ DateFormat initialValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2908671e", new Object[]{this}) : a();
        }

        public DateFormat a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DateFormat) ipChange.ipc$dispatch("41713843", new Object[]{this}) : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    public static boolean a(CharSequence charSequence) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("638f9910", new Object[]{charSequence})).booleanValue();
        }
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8cdf7d91", new Object[]{charSequence})).booleanValue() : !a(charSequence);
    }

    public static boolean c(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b62f6212", new Object[]{charSequence})).booleanValue() : charSequence == null || charSequence.length() == 0;
    }

    public static boolean d(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("df7f4693", new Object[]{charSequence})).booleanValue() : !c(charSequence);
    }
}
