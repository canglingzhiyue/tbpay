package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ikw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44e019b4", new Object[]{charSequence, charSequence2})).booleanValue();
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d21acb35", new Object[]{charSequence, charSequence2})).booleanValue() : !a(charSequence, charSequence2);
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        if (str != null && str2 != null) {
            return str.contains(str2);
        }
        return false;
    }

    public static boolean a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("638f9910", new Object[]{charSequence})).booleanValue() : charSequence == null || charSequence.length() == 0;
    }

    public static boolean b(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8cdf7d91", new Object[]{charSequence})).booleanValue() : !a(charSequence);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : a(str, "");
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : b((CharSequence) str) ? str : str2;
    }

    public static List<String> b(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{str});
        }
        if (a((CharSequence) str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            if (b((CharSequence) str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }
}
