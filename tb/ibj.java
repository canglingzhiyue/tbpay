package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes6.dex */
public class ibj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Logger f28892a;

    static {
        kge.a(-44474673);
        f28892a = Logger.getLogger(ibj.class.getName());
    }

    public static void a(String str, String str2, int i, char[] cArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97fe7cf", new Object[]{str, str2, new Integer(i), cArr});
            return;
        }
        f28892a.log(Level.SEVERE, str + ResponseProtocolType.COMMENT + str2);
        String str3 = "ERROR: " + str + ": msg=\\";
        String str4 = "ERROR: " + str + ":      ";
        for (int i2 = 0; i2 < cArr.length; i2++) {
            str3 = str3 + cArr[i2];
            str4 = str4 + " ";
        }
        String str5 = str3 + "\\";
        String str6 = str4 + "^";
        f28892a.log(Level.SEVERE, str5);
        f28892a.log(Level.SEVERE, str5);
    }

    public static int a(int i, char[] cArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cce84860", new Object[]{new Integer(i), cArr, str})).intValue();
        }
        while (i < cArr.length && (cArr[i] == ' ' || cArr[i] == '\n' || cArr[i] == '\t')) {
            i++;
        }
        if (str == null || i < cArr.length) {
            return i;
        }
        a("RString.skipWhiteSpace", str, i, cArr);
        return -1;
    }

    public static float[] a(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("a96685a3", new Object[]{new Integer(i), str, new Integer(i2)});
        }
        if (str == null || str.equals("")) {
            return null;
        }
        float[] fArr = new float[i];
        char[] cArr = new char[str.length()];
        str.getChars(0, str.length(), cArr, 0);
        int length = cArr.length;
        while (i2 < length) {
            int a2 = a(i2, cArr, (String) null);
            if (a2 >= length) {
                break;
            }
            int i4 = a2;
            while (i4 < length && cArr[i4] != ' ' && cArr[i4] != '\n' && cArr[i4] != '\t') {
                i4++;
            }
            int i5 = i3 + 1;
            fArr[i3] = Float.parseFloat(new String(cArr, a2, i4 - a2));
            if (i5 >= i) {
                break;
            }
            i2 = i4;
            i3 = i5;
        }
        return fArr;
    }

    public static int[] a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("a351f5f3", new Object[]{str, new Integer(i)});
        }
        if (str == null || str.equals("")) {
            return null;
        }
        String[] a2 = a(str);
        ArrayList arrayList = new ArrayList();
        Integer num = new Integer(Integer.MIN_VALUE);
        for (String str2 : a2) {
            a(str2, arrayList, num, i);
        }
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr;
    }

    private static void a(String str, ArrayList<Integer> arrayList, Integer num, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d154dc24", new Object[]{str, arrayList, num, new Integer(i)});
            return;
        }
        String[] a2 = a((char) fxb.DIR, str);
        int i2 = 0;
        for (int i3 = 0; i3 < a2.length; i3++) {
            if (a2[i3].trim().equals("")) {
                arrayList.add(num);
            } else {
                arrayList.add(Integer.valueOf(Integer.parseInt(a2[i3])));
            }
            i2++;
        }
        while (i2 < i) {
            arrayList.add(num);
            i2++;
        }
    }

    public static String[] a(char c, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("9ed935ae", new Object[]{new Character(c), str});
        }
        if (str == null || str.equals("")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] cArr = new char[str.length()];
        str.getChars(0, str.length(), cArr, 0);
        int i2 = 0;
        while (i < cArr.length && i2 < cArr.length) {
            int i3 = i2;
            while (i3 < cArr.length && c != cArr[i3]) {
                i3++;
            }
            String str2 = new String(cArr, i2, i3 - i2);
            i2 = i3 + 1;
            arrayList.add(str2);
            i = i2;
        }
        return (String[]) arrayList.toArray(new String[1]);
    }

    public static String[] a(String str) {
        int a2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ad023781", new Object[]{str});
        }
        if (str == null || str.equals("")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] cArr = new char[str.length()];
        str.getChars(0, str.length(), cArr, 0);
        while (i < cArr.length && (a2 = a(i, cArr, (String) null)) < cArr.length) {
            int i2 = a2;
            while (i2 < cArr.length && cArr[i2] != ' ' && cArr[i2] != '\n' && cArr[i2] != '\t') {
                i2++;
            }
            i = i2 + 1;
            arrayList.add(new String(cArr, a2, i2 - a2));
        }
        return (String[]) arrayList.toArray(new String[1]);
    }
}
